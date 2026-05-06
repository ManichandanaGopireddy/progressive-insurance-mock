package com.insurance.dynamo.repository.impl;

import com.insurance.dynamo.entity.VehicleEntity;
import com.insurance.dynamo.exception.DynamoDbOperationException;
import com.insurance.dynamo.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;
import software.amazon.awssdk.enhanced.dynamodb.Key;
import software.amazon.awssdk.enhanced.dynamodb.TableSchema;
import software.amazon.awssdk.enhanced.dynamodb.model.QueryConditional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Repository
@RequiredArgsConstructor
public class VehicleRepositoryImpl implements VehicleRepository {

    private final DynamoDbEnhancedClient enhancedClient;

    private DynamoDbTable<VehicleEntity> table() {
        return enhancedClient.table("session_vehicles",
                TableSchema.fromBean(VehicleEntity.class));
    }

    @Override
    public VehicleEntity save(VehicleEntity entity) {
        try {
            table().putItem(entity);
            return entity;
        } catch (Exception e) {
            throw new DynamoDbOperationException(
                    "Failed to save vehicle", e);
        }
    }

    @Override
    public List<VehicleEntity> findAllByQuoteReferenceId(
            String quoteReferenceId) {
        try {
            return table().query(QueryConditional
                    .keyEqualTo(Key.builder()
                            .partitionValue(quoteReferenceId)
                            .build()))
                    .items()
                    .stream()
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new DynamoDbOperationException(
                    "Failed to find vehicles: " + quoteReferenceId, e);
        }
    }

    @Override
    public Optional<VehicleEntity> findByQuoteReferenceIdAndVehicleId(
            String quoteReferenceId, String vehicleId) {
        try {
            Key key = Key.builder()
                    .partitionValue(quoteReferenceId)
                    .sortValue(vehicleId)
                    .build();
            return Optional.ofNullable(table().getItem(key));
        } catch (Exception e) {
            throw new DynamoDbOperationException(
                    "Failed to find vehicle: " + vehicleId, e);
        }
    }

    @Override
    public void delete(String quoteReferenceId, String vehicleId) {
        try {
            Key key = Key.builder()
                    .partitionValue(quoteReferenceId)
                    .sortValue(vehicleId)
                    .build();
            table().deleteItem(key);
        } catch (Exception e) {
            throw new DynamoDbOperationException(
                    "Failed to delete vehicle: " + vehicleId, e);
        }
    }
}