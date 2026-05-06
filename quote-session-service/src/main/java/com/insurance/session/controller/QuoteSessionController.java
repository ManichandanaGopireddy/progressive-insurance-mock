package com.insurance.session.controller;

import com.insurance.api.QuoteSessionApi;
import com.insurance.api.model.QuoteSessionStartRequest;
import com.insurance.api.model.QuoteSessionResponse;
import com.insurance.session.service.QuoteSessionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class QuoteSessionController implements QuoteSessionApi {

    private final QuoteSessionService quoteSessionService;

    @Override
    public ResponseEntity<QuoteSessionResponse> startQuoteSession(
            QuoteSessionStartRequest request) {
        log.info("POST /api/v1/quote-session/start");
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(quoteSessionService.startSession(request));
    }
}