package com.insurance.dynamo.repository;

import com.insurance.dynamo.entity.VehicleEntity;
import java.util.List;
import java.util.Optional;

public interface VehicleRepository {
    VehicleEntity save(VehicleEntity entity);
    List<VehicleEntity> findAllByQuoteReferenceId(String quoteReferenceId);
    Optional<VehicleEntity> findByQuoteReferenceIdAndVehicleId(
            String quoteReferenceId, String vehicleId);
    void delete(String quoteReferenceId, String vehicleId);
}