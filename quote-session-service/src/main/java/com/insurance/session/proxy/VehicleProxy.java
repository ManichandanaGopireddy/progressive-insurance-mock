package com.insurance.session.proxy;

import com.insurance.dynamo.entity.VehicleEntity;
import com.insurance.dynamo.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class VehicleProxy {

    private final VehicleRepository repository;

    public VehicleEntity save(VehicleEntity entity) {
        return repository.save(entity);
    }

    public List<VehicleEntity> findAllByQuoteReferenceId(
            String quoteReferenceId) {
        return repository.findAllByQuoteReferenceId(quoteReferenceId);
    }

    public Optional<VehicleEntity> findByQuoteReferenceIdAndVehicleId(
            String quoteReferenceId, String vehicleId) {
        return repository.findByQuoteReferenceIdAndVehicleId(
                quoteReferenceId, vehicleId);
    }

    public void delete(String quoteReferenceId, String vehicleId) {
        repository.delete(quoteReferenceId, vehicleId);
    }
}