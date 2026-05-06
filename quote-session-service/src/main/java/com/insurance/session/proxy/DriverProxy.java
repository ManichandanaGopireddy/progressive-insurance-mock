package com.insurance.session.proxy;

import com.insurance.dynamo.entity.DriverEntity;
import com.insurance.dynamo.repository.DriverRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DriverProxy {

    private final DriverRepository repository;

    public DriverEntity save(DriverEntity entity) {
        return repository.save(entity);
    }

    public List<DriverEntity> findAllByQuoteReferenceId(
            String quoteReferenceId) {
        return repository.findAllByQuoteReferenceId(quoteReferenceId);
    }

    public Optional<DriverEntity> findByQuoteReferenceIdAndDriverId(
            String quoteReferenceId, String driverId) {
        return repository.findByQuoteReferenceIdAndDriverId(
                quoteReferenceId, driverId);
    }

    public void delete(String quoteReferenceId, String driverId) {
        repository.delete(quoteReferenceId, driverId);
    }
}