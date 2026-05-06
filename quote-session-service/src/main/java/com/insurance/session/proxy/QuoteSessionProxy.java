package com.insurance.session.proxy;

import com.insurance.dynamo.entity.QuoteSessionEntity;
import com.insurance.dynamo.repository.QuoteSessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class QuoteSessionProxy {

    private final QuoteSessionRepository repository;

    public QuoteSessionEntity save(QuoteSessionEntity entity) {
        return repository.save(entity);
    }

    public Optional<QuoteSessionEntity> findById(String quoteReferenceId) {
        return repository.findById(quoteReferenceId);
    }

    public Optional<QuoteSessionEntity> findByEmail(String email) {
        return repository.findByEmail(email);
    }

    public QuoteSessionEntity update(QuoteSessionEntity entity) {
        return repository.update(entity);
    }
}