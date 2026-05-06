package com.insurance.dynamo.repository;

import com.insurance.dynamo.entity.DriverEntity;
import java.util.List;
import java.util.Optional;

public interface DriverRepository {
    DriverEntity save(DriverEntity entity);
    List<DriverEntity> findAllByQuoteReferenceId(String quoteReferenceId);
    Optional<DriverEntity> findByQuoteReferenceIdAndDriverId(
            String quoteReferenceId, String driverId);
    void delete(String quoteReferenceId, String driverId);
}