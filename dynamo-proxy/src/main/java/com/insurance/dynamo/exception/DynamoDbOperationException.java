package com.insurance.dynamo.exception;

public class DynamoDbOperationException extends RuntimeException {

    public DynamoDbOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
