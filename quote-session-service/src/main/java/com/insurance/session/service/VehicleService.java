package com.insurance.session.service;

import com.insurance.api.model.VehicleListRequest;
import com.insurance.api.model.VehicleListResponse;
import com.insurance.api.model.VehicleRequest;
import com.insurance.api.model.VehicleResponse;
import com.insurance.dynamo.entity.VehicleEntity;
import com.insurance.dynamo.exception.EntityNotFoundException;
import com.insurance.session.mapper.VehicleMapper;
import com.insurance.session.proxy.DriverProxy;
import com.insurance.session.proxy.QuoteSessionProxy;
import com.insurance.session.proxy.VehicleProxy;
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
public class VehicleService {

    private final VehicleProxy      vehicleProxy;
    private final QuoteSessionProxy sessionProxy;
    private final DriverProxy       driverProxy;
    private final VehicleMapper     vehicleMapper;

    public VehicleListResponse addVehicles(
            String quoteReferenceId, VehicleListRequest request) {

        log.info("Adding {} vehicle(s) to quote application {}",
                request.getVehicles().size(), quoteReferenceId);

        sessionProxy.findById(quoteReferenceId)
                .orElseThrow(() -> new EntityNotFoundException(
                        "Quote application not found: "
                        + quoteReferenceId));

        List<VehicleResponse> responses = new ArrayList<>();

        for (VehicleRequest vehicleRequest : request.getVehicles()) {

            // Validate primaryDriverId exists in this application
            if (vehicleRequest.getPrimaryDriverId() != null) {
                String driverId = vehicleRequest
                        .getPrimaryDriverId().toString();
                driverProxy.findByQuoteReferenceIdAndDriverId(
                        quoteReferenceId, driverId)
                        .orElseThrow(() ->
                                new EntityNotFoundException(
                                        "Primary driver not found: "
                                        + driverId));
            }

            VehicleEntity entity =
                    vehicleMapper.toEntity(vehicleRequest);
            entity.setQuoteReferenceId(quoteReferenceId);
            entity.setVehicleId(UUID.randomUUID().toString());
            entity.setCreatedAt(OffsetDateTime.now().toString());

            // Mask VIN — store only last 6 characters
            if (vehicleRequest.getVin() != null
                    && !vehicleRequest.getVin().isBlank()) {
                String vin = vehicleRequest.getVin().toUpperCase();
                String masked = "*".repeat(vin.length() - 6)
                        + vin.substring(vin.length() - 6);
                entity.setVinMasked(masked);
            }

            VehicleEntity saved = vehicleProxy.save(entity);
            responses.add(vehicleMapper.toResponse(saved));

            log.info("Added vehicle {} ({} {} {}) to application {}",
                    saved.getVehicleId(),
                    saved.getYear(), saved.getMake(), saved.getModel(),
                    quoteReferenceId);
        }

        VehicleListResponse response = new VehicleListResponse();
        response.setQuoteReferenceId(
                UUID.fromString(quoteReferenceId));
        response.setVehicles(responses);
        return response;
    }
}