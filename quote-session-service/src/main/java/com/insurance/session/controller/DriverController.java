package com.insurance.session.controller;

import com.insurance.api.DriverApi;
import com.insurance.api.model.DriverListRequest;
import com.insurance.api.model.DriverListResponse;
import com.insurance.session.service.DriverService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DriverController implements DriverApi {

    private final DriverService driverService;

    @Override
    public ResponseEntity<DriverListResponse> addDrivers(
            java.util.UUID quoteReferenceId,
            DriverListRequest request) {
        log.info("POST /api/v1/quote-session/{}/drivers",
                quoteReferenceId);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(driverService.addDrivers(
                        quoteReferenceId.toString(), request));
    }
}