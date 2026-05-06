package com.insurance.session.service;

import com.insurance.api.model.QuoteSessionStartRequest;
import com.insurance.api.model.QuoteSessionResponse;
import com.insurance.dynamo.entity.QuoteSessionEntity;
import com.insurance.dynamo.exception.EntityNotFoundException;
import com.insurance.dynamo.exception.DuplicateCustomerException;
import com.insurance.session.mapper.QuoteSessionMapper;
import com.insurance.session.proxy.QuoteSessionProxy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class QuoteSessionService {

    private final QuoteSessionProxy  sessionProxy;
    private final QuoteSessionMapper sessionMapper;

    public QuoteSessionResponse startSession(
            QuoteSessionStartRequest request) {

        log.info("Starting quote application for {}",
                request.getEmail());

        // Check if customer already has an active IN_PROGRESS session
        Optional<QuoteSessionEntity> existing =
                sessionProxy.findByEmail(
                        request.getEmail().toLowerCase().trim());

        if (existing.isPresent() &&
                "IN_PROGRESS".equals(existing.get().getStatus())) {
            log.warn("Active quote application already exists " +
                    "for email {}", request.getEmail());
            throw new DuplicateCustomerException(
                    "An active quote application already exists " +
                    "for " + request.getEmail() +
                    ". Your quote reference ID is: " +
                    existing.get().getQuoteReferenceId());
        }

        // Derive permanent customerId from email
        String customerId = UUID.nameUUIDFromBytes(
                request.getEmail().toLowerCase().trim().getBytes()
        ).toString();

        QuoteSessionEntity entity = sessionMapper.toEntity(request);
        entity.setQuoteReferenceId(UUID.randomUUID().toString());
        entity.setCustomerId(customerId);
        entity.setStatus("IN_PROGRESS");
        entity.setDateOfBirth(
                request.getDateOfBirth() != null
                        ? request.getDateOfBirth().toString() : null);
        entity.setCreatedAt(OffsetDateTime.now().toString());
        entity.setUpdatedAt(OffsetDateTime.now().toString());

        QuoteSessionEntity saved = sessionProxy.save(entity);

        log.info("Created quote application {} for customer {}",
                saved.getQuoteReferenceId(), saved.getCustomerId());

        return sessionMapper.toResponse(saved);
    }

    public QuoteSessionEntity getSessionEntity(
            String quoteReferenceId) {
        return sessionProxy.findById(quoteReferenceId)
                .orElseThrow(() -> new EntityNotFoundException(
                        "Quote application not found: "
                        + quoteReferenceId));
    }
}