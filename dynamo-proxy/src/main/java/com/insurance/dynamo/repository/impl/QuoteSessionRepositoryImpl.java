package com.insurance.dynamo.repository.impl;

import com.insurance.dynamo.entity.QuoteSessionEntity;
import com.insurance.dynamo.exception.DynamoDbOperationException;
import com.insurance.dynamo.repository.QuoteSessionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;
import software.amazon.awssdk.enhanced.dynamodb.Expression;
import software.amazon.awssdk.enhanced.dynamodb.Key;
import software.amazon.awssdk.enhanced.dynamodb.TableSchema;
import software.amazon.awssdk.enhanced.dynamodb.model.ScanEnhancedRequest;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

import java.util.Map;
import java.util.Optional;

@Slf4j
@Repository
@RequiredArgsConstructor
public class QuoteSessionRepositoryImpl implements QuoteSessionRepository {

    private final DynamoDbEnhancedClient enhancedClient;

    private DynamoDbTable<QuoteSessionEntity> table() {
        return enhancedClient.table("quote_sessions",
                TableSchema.fromBean(QuoteSessionEntity.class));
    }

    @Override
    public QuoteSessionEntity save(QuoteSessionEntity entity) {
        try {
            table().putItem(entity);
            return entity;
        } catch (Exception e) {
            throw new DynamoDbOperationException(
                    "Failed to save quote session", e);
        }
    }

    @Override
    public Optional<QuoteSessionEntity> findById(
            String quoteReferenceId) {
        try {
            Key key = Key.builder()
                    .partitionValue(quoteReferenceId)
                    .build();
            return Optional.ofNullable(table().getItem(key));
        } catch (Exception e) {
            throw new DynamoDbOperationException(
                    "Failed to find session: " + quoteReferenceId, e);
        }
    }

    @Override
    public Optional<QuoteSessionEntity> findByEmail(String email) {
        try {
            ScanEnhancedRequest request = ScanEnhancedRequest.builder()
                    .filterExpression(Expression.builder()
                            .expression("email = :email")
                            .expressionValues(Map.of(":email",
                                    AttributeValue.builder()
                                            .s(email).build()))
                            .build())
                    .build();
            return table().scan(request)
                    .items()
                    .stream()
                    .findFirst();
        } catch (Exception e) {
            throw new DynamoDbOperationException(
                    "Failed to find session by email: " + email, e);
        }
    }

    @Override
    public QuoteSessionEntity update(QuoteSessionEntity entity) {
        try {
            table().putItem(entity);
            return entity;
        } catch (Exception e) {
            throw new DynamoDbOperationException(
                    "Failed to update session", e);
        }
    }
}