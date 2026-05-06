package com.insurance.dynamo.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

import java.util.ArrayList;

@Slf4j
@Component
@RequiredArgsConstructor
public class DynamoDbTableInitializer implements ApplicationRunner {

    private final DynamoDbClient dynamoDbClient;
    private final DynamoDbProperties properties;

    @Override
    public void run(ApplicationArguments args) {
        try {
            log.info("Initializing DynamoDB tables...");

            createTableIfNotExists(
                    properties.getTables().getQuoteSessions(),
                    "quoteReferenceId",
                    null
            );
            createTableIfNotExists(
                    properties.getTables().getSessionVehicles(),
                    "quoteReferenceId",
                    "vehicleId"
            );
            createTableIfNotExists(
                    properties.getTables().getSessionDrivers(),
                    "quoteReferenceId",
                    "driverId"
            );

            log.info("DynamoDB table initialization complete.");

        } catch (Exception e) {
            log.warn("DynamoDB table initialization failed - " +
                    "tables may already exist or connection timed out: {}",
                    e.getMessage());
        }
    }

    private void createTableIfNotExists(
            String tableName,
            String partitionKey,
            String sortKey) {

        try {
            if (tableExists(tableName)) {
                log.info("Table '{}' already exists - skipping.", tableName);
                return;
            }

            log.info("Creating table '{}'...", tableName);

            var attributeDefinitions = new ArrayList<AttributeDefinition>();
            var keySchema = new ArrayList<KeySchemaElement>();

            attributeDefinitions.add(AttributeDefinition.builder()
                    .attributeName(partitionKey)
                    .attributeType(ScalarAttributeType.S)
                    .build());
            keySchema.add(KeySchemaElement.builder()
                    .attributeName(partitionKey)
                    .keyType(KeyType.HASH)
                    .build());

            if (sortKey != null) {
                attributeDefinitions.add(AttributeDefinition.builder()
                        .attributeName(sortKey)
                        .attributeType(ScalarAttributeType.S)
                        .build());
                keySchema.add(KeySchemaElement.builder()
                        .attributeName(sortKey)
                        .keyType(KeyType.RANGE)
                        .build());
            }

            dynamoDbClient.createTable(CreateTableRequest.builder()
                    .tableName(tableName)
                    .attributeDefinitions(attributeDefinitions)
                    .keySchema(keySchema)
                    .billingMode(BillingMode.PAY_PER_REQUEST)
                    .build());

            waitUntilActive(tableName);
            log.info("Table '{}' created successfully.", tableName);

        } catch (Exception e) {
            log.warn("Could not create table '{}': {}", tableName,
                    e.getMessage());
        }
    }

    private boolean tableExists(String tableName) {
        try {
            dynamoDbClient.describeTable(
                    DescribeTableRequest.builder()
                            .tableName(tableName)
                            .build()
            );
            return true;
        } catch (ResourceNotFoundException e) {
            return false;
        }
    }

    private void waitUntilActive(String tableName) {
        log.info("Waiting for table '{}' to become active...", tableName);
        int attempts = 0;
        while (attempts < 20) {
            try {
                Thread.sleep(2000);
                DescribeTableResponse response = dynamoDbClient.describeTable(
                        DescribeTableRequest.builder()
                                .tableName(tableName)
                                .build()
                );
                if (response.table().tableStatus() == TableStatus.ACTIVE) {
                    return;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            } catch (Exception e) {
                log.warn("Error waiting for table '{}': {}",
                        tableName, e.getMessage());
                return;
            }
            attempts++;
        }
        log.warn("Table '{}' did not become active in time.", tableName);
    }
}