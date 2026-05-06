package com.insurance.session.service;

import com.insurance.api.model.DriverListRequest;
import com.insurance.api.model.DriverListResponse;
import com.insurance.api.model.DriverResponse;
import com.insurance.dynamo.entity.DriverEntity;
import com.insurance.dynamo.exception.EntityNotFoundException;
import com.insurance.session.mapper.DriverMapper;
import com.insurance.session.proxy.DriverProxy;
import com.insurance.session.proxy.QuoteSessionProxy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class DriverService {

    private final DriverProxy       driverProxy;
    private final QuoteSessionProxy sessionProxy;
    private final DriverMapper      driverMapper;

    public DriverListResponse addDrivers(
            String quoteReferenceId, DriverListRequest request) {

        log.info("Adding {} driver(s) to quote application {}",
                request.getDrivers().size(), quoteReferenceId);

        sessionProxy.findById(quoteReferenceId)
                .orElseThrow(() -> new EntityNotFoundException(
                        "Quote application not found: "
                        + quoteReferenceId));

        List<DriverResponse> responses = new ArrayList<>();

        for (var driverRequest : request.getDrivers()) {
            DriverEntity entity =
                    driverMapper.toEntity(driverRequest);
            entity.setQuoteReferenceId(quoteReferenceId);
            entity.setDriverId(UUID.randomUUID().toString());
            entity.setCreatedAt(OffsetDateTime.now().toString());

            // Mask SSN — store only last 4 digits
            if (driverRequest.getSsn() != null
                    && !driverRequest.getSsn().isBlank()) {
                String raw = driverRequest.getSsn()
                        .replaceAll("[^0-9]", "");
                entity.setSsnMasked("***-**-"
                        + raw.substring(raw.length() - 4));
            }

            DriverEntity saved = driverProxy.save(entity);
            responses.add(driverMapper.toResponse(saved));

            log.info("Added driver {} ({} {}) to application {}",
                    saved.getDriverId(),
                    saved.getFirstName(), saved.getLastName(),
                    quoteReferenceId);
        }

        DriverListResponse response = new DriverListResponse();
        response.setQuoteReferenceId(
                UUID.fromString(quoteReferenceId));
        response.setDrivers(responses);
        return response;
    }
}