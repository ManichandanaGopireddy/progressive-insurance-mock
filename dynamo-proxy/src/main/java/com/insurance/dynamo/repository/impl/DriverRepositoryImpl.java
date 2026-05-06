package com.insurance.dynamo.repository.impl;

import com.insurance.dynamo.entity.DriverEntity;
import com.insurance.dynamo.exception.DynamoDbOperationException;
import com.insurance.dynamo.repository.DriverRepository;
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
public class DriverRepositoryImpl implements DriverRepository {

    private final DynamoDbEnhancedClient enhancedClient;

    private DynamoDbTable<DriverEntity> table() {
        return enhancedClient.table("session_drivers",
                TableSchema.fromBean(DriverEntity.class));
    }

    @Override
    public DriverEntity save(DriverEntity entity) {
        try {
            table().putItem(entity);
            return entity;
        } catch (Exception e) {
            throw new DynamoDbOperationException(
                    "Failed to save driver", e);
        }
    }

    @Override
    public List<DriverEntity> findAllByQuoteReferenceId(
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
                    "Failed to find drivers: " + quoteReferenceId, e);
        }
    }

    @Override
    public Optional<DriverEntity> findByQuoteReferenceIdAndDriverId(
            String quoteReferenceId, String driverId) {
        try {
            Key key = Key.builder()
                    .partitionValue(quoteReferenceId)
                    .sortValue(driverId)
                    .build();
            return Optional.ofNullable(table().getItem(key));
        } catch (Exception e) {
            throw new DynamoDbOperationException(
                    "Failed to find driver: " + driverId, e);
        }
    }

    @Override
    public void delete(String quoteReferenceId, String driverId) {
        try {
            Key key = Key.builder()
                    .partitionValue(quoteReferenceId)
                    .sortValue(driverId)
                    .build();
            table().deleteItem(key);
        } catch (Exception e) {
            throw new DynamoDbOperationException(
                    "Failed to delete driver: " + driverId, e);
        }
    }
}