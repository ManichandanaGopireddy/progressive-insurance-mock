package com.insurance.dynamo.repository;

import com.insurance.dynamo.entity.QuoteSessionEntity;
import java.util.List;
import java.util.Optional;

public interface QuoteSessionRepository {
    QuoteSessionEntity save(QuoteSessionEntity entity);
    Optional<QuoteSessionEntity> findById(String quoteReferenceId);
    Optional<QuoteSessionEntity> findByEmail(String email);
    QuoteSessionEntity update(QuoteSessionEntity entity);
}