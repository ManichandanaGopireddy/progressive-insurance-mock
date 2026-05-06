package com.insurance.session.exception;

import com.insurance.api.model.ErrorResponse;
import com.insurance.dynamo.exception.DuplicateCustomerException;
import com.insurance.dynamo.exception.DynamoDbOperationException;
import com.insurance.dynamo.exception.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFound(
            EntityNotFoundException ex) {
        log.warn("Entity not found: {}", ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(error("NOT_FOUND", ex.getMessage()));
    }

    @ExceptionHandler(DuplicateCustomerException.class)
    public ResponseEntity<ErrorResponse> handleDuplicate(
            DuplicateCustomerException ex) {
        log.warn("Duplicate customer: {}", ex.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(error("DUPLICATE_CUSTOMER", ex.getMessage()));
    }

    @ExceptionHandler(DynamoDbOperationException.class)
    public ResponseEntity<ErrorResponse> handleDynamoDb(
            DynamoDbOperationException ex) {
        log.error("DynamoDB error: {}", ex.getMessage(), ex);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(error("DATABASE_ERROR", ex.getMessage()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidation(
            MethodArgumentNotValidException ex) {
        List<String> details = ex.getBindingResult()
                .getFieldErrors().stream()
                .map(fe -> fe.getField() + ": " +
                        fe.getDefaultMessage())
                .collect(Collectors.toList());
        ErrorResponse err = error("VALIDATION_ERROR",
                "Request validation failed");
        err.setDetails(details);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(err);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGeneral(Exception ex) {
        log.error("Unexpected error: {}", ex.getMessage(), ex);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(error("INTERNAL_ERROR",
                        "An unexpected error occurred"));
    }

    private ErrorResponse error(String code, String message) {
        ErrorResponse err = new ErrorResponse();
        err.setCode(code);
        err.setMessage(message);
        err.setTimestamp(OffsetDateTime.now());
        return err;
    }
}