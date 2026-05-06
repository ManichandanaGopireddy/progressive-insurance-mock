package com.insurance.session.controller;

import com.insurance.api.CoverageApi;
import com.insurance.api.model.CoverageSelectionRequest;
import com.insurance.api.model.CoverageSelectionResponse;
import com.insurance.session.service.CoverageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CoverageController implements CoverageApi {

    private final CoverageService coverageService;

    @Override
    public ResponseEntity<CoverageSelectionResponse>
            saveCoverageSelection(
                    UUID quoteReferenceId,
                    CoverageSelectionRequest request) {
        log.info("POST /api/v1/quote-session/{}/coverage",
                quoteReferenceId);
        return ResponseEntity.ok(
                coverageService.saveCoverage(
                        quoteReferenceId.toString(), request));
    }
}