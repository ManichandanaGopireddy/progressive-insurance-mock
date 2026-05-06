package com.insurance.session.service;

import com.insurance.api.model.CoverageSelectionRequest;
import com.insurance.api.model.CoverageSelectionResponse;
import com.insurance.dynamo.entity.QuoteSessionEntity;
import com.insurance.dynamo.exception.EntityNotFoundException;
import com.insurance.session.proxy.QuoteSessionProxy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class CoverageService {

    private final QuoteSessionProxy sessionProxy;

    public CoverageSelectionResponse saveCoverage(
            String quoteReferenceId,
            CoverageSelectionRequest request) {

        log.info("Saving coverage selection for quote application {}",
                quoteReferenceId);

        QuoteSessionEntity entity =
                sessionProxy.findById(quoteReferenceId)
                .orElseThrow(() -> new EntityNotFoundException(
                        "Quote application not found: "
                        + quoteReferenceId));

        entity.setCoverageTierId(
                request.getCoverageTierId().getValue());

        // Convert DeductibleAmountEnum to Integer
        entity.setDeductibleAmount(
                request.getDeductibleAmount().getValue());

        entity.setUpdatedAt(OffsetDateTime.now().toString());

        sessionProxy.update(entity);

        log.info("Saved coverage: tier={} deductible={} for {}",
                entity.getCoverageTierId(),
                entity.getDeductibleAmount(),
                quoteReferenceId);

        CoverageSelectionResponse response =
                new CoverageSelectionResponse();
        response.setQuoteReferenceId(
                UUID.fromString(quoteReferenceId));
        response.setCoverageTierId(
                CoverageSelectionResponse.CoverageTierIdEnum
                        .fromValue(entity.getCoverageTierId()));
        response.setDeductibleAmount(entity.getDeductibleAmount());
        response.setSavedAt(OffsetDateTime.now());
        return response;
    }
}