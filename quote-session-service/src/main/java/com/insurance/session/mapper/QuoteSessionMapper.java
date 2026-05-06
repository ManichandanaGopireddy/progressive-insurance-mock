package com.insurance.session.mapper;

import com.insurance.api.model.QuoteSessionResponse;
import com.insurance.api.model.QuoteSessionStartRequest;
import com.insurance.dynamo.entity.QuoteSessionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.OffsetDateTime;
import java.util.UUID;

@Mapper
public interface QuoteSessionMapper {

    @Mapping(target = "quoteReferenceId", ignore = true)
    @Mapping(target = "customerId",       ignore = true)
    @Mapping(target = "status",           ignore = true)
    @Mapping(target = "dateOfBirth",      ignore = true)
    @Mapping(target = "coverageTierId",   ignore = true)
    @Mapping(target = "deductibleAmount", ignore = true)
    @Mapping(target = "createdAt",        ignore = true)
    @Mapping(target = "updatedAt",        ignore = true)
    QuoteSessionEntity toEntity(QuoteSessionStartRequest request);

    @Mapping(target = "quoteReferenceId", source = "quoteReferenceId",
             qualifiedByName = "stringToUuid")
    @Mapping(target = "customerId",       source = "customerId",
             qualifiedByName = "stringToUuid")
    @Mapping(target = "createdAt",        source = "createdAt",
             qualifiedByName = "stringToOffsetDateTime")
    @Mapping(target = "updatedAt",        source = "updatedAt",
             qualifiedByName = "stringToOffsetDateTime")
    QuoteSessionResponse toResponse(QuoteSessionEntity entity);

    @org.mapstruct.Named("stringToUuid")
    default UUID stringToUuid(String value) {
        return value == null ? null : UUID.fromString(value);
    }

    @org.mapstruct.Named("stringToOffsetDateTime")
    default OffsetDateTime stringToOffsetDateTime(String value) {
        return value == null ? null : OffsetDateTime.parse(value);
    }
}