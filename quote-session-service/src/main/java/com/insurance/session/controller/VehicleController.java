package com.insurance.session.controller;

import com.insurance.api.VehicleApi;
import com.insurance.api.model.VehicleListRequest;
import com.insurance.api.model.VehicleListResponse;
import com.insurance.session.service.VehicleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class VehicleController implements VehicleApi {

    private final VehicleService vehicleService;

    @Override
    public ResponseEntity<VehicleListResponse> addVehicles(
            java.util.UUID quoteReferenceId,
            VehicleListRequest request) {
        log.info("POST /api/v1/quote-session/{}/vehicles",
                quoteReferenceId);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(vehicleService.addVehicles(
                        quoteReferenceId.toString(), request));
    }
}