package com.insurance.session.service;

import com.insurance.api.model.DriverResponse;
import com.insurance.api.model.SessionReviewResponse;
import com.insurance.api.model.VehicleResponse;
import com.insurance.dynamo.entity.QuoteSessionEntity;
import com.insurance.dynamo.exception.EntityNotFoundException;
import com.insurance.session.mapper.DriverMapper;
import com.insurance.session.mapper.VehicleMapper;
import com.insurance.session.proxy.DriverProxy;
import com.insurance.session.proxy.QuoteSessionProxy;
import com.insurance.session.proxy.VehicleProxy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class ReviewService {

    private final QuoteSessionProxy sessionProxy;
    private final VehicleProxy      vehicleProxy;
    private final DriverProxy       driverProxy;
    private final VehicleMapper     vehicleMapper;
    private final DriverMapper      driverMapper;

    public SessionReviewResponse getReview(String quoteReferenceId) {
        log.info("Fetching review for quote application {}",
                quoteReferenceId);

        QuoteSessionEntity session =
                sessionProxy.findById(quoteReferenceId)
                .orElseThrow(() -> new EntityNotFoundException(
                        "Quote application not found: "
                        + quoteReferenceId));

        List<VehicleResponse> vehicles =
                vehicleProxy.findAllByQuoteReferenceId(quoteReferenceId)
                .stream()
                .map(vehicleMapper::toResponse)
                .collect(Collectors.toList());

        List<DriverResponse> drivers =
                driverProxy.findAllByQuoteReferenceId(quoteReferenceId)
                .stream()
                .map(driverMapper::toResponse)
                .collect(Collectors.toList());

        SessionReviewResponse review = new SessionReviewResponse();
        review.setQuoteReferenceId(
                UUID.fromString(session.getQuoteReferenceId()));
        review.setCustomerId(
                UUID.fromString(session.getCustomerId()));
        review.setStatus(session.getStatus());
        review.setFirstName(session.getFirstName());
        review.setLastName(session.getLastName());
        review.setEmail(session.getEmail());
        review.setStreet(session.getStreet());
        review.setCity(session.getCity());
        review.setState(session.getState());
        review.setZipCode(session.getZipCode());
        review.setCoverageTierId(session.getCoverageTierId());       
        review.setDeductibleAmount(session.getDeductibleAmount());
        review.setVehicles(vehicles);
        review.setDrivers(drivers);
        review.setCreatedAt(session.getCreatedAt() != null
                ? OffsetDateTime.parse(session.getCreatedAt()) : null);

        return review;
    }
}