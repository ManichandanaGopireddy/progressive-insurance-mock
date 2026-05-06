package com.insurance.session.controller;

import com.insurance.api.ReviewApi;
import com.insurance.api.model.SessionReviewResponse;
import com.insurance.session.service.ReviewService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ReviewController implements ReviewApi {

    private final ReviewService reviewService;

    @Override
    public ResponseEntity<SessionReviewResponse> reviewSession(
            java.util.UUID quoteReferenceId) {
        log.info("GET /api/v1/quote-session/{}/review",
                quoteReferenceId);
        return ResponseEntity.ok(
                reviewService.getReview(
                        quoteReferenceId.toString()));
    }
}