package com.insurance.session.mapper;

import com.insurance.api.model.QuoteSessionResponse;
import com.insurance.api.model.QuoteSessionStartRequest;
import com.insurance.dynamo.entity.QuoteSessionEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-24T16:34:10-0400",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.10 (Eclipse Adoptium)"
)
public class QuoteSessionMapperImpl implements QuoteSessionMapper {

    @Override
    public QuoteSessionEntity toEntity(QuoteSessionStartRequest request) {
        if ( request == null ) {
            return null;
        }

        QuoteSessionEntity.QuoteSessionEntityBuilder quoteSessionEntity = QuoteSessionEntity.builder();

        quoteSessionEntity.firstName( request.getFirstName() );
        quoteSessionEntity.lastName( request.getLastName() );
        quoteSessionEntity.email( request.getEmail() );
        quoteSessionEntity.street( request.getStreet() );
        quoteSessionEntity.aptUnit( request.getAptUnit() );
        quoteSessionEntity.city( request.getCity() );
        quoteSessionEntity.state( request.getState() );
        quoteSessionEntity.zipCode( request.getZipCode() );
        quoteSessionEntity.poBox( request.getPoBox() );

        return quoteSessionEntity.build();
    }

    @Override
    public QuoteSessionResponse toResponse(QuoteSessionEntity entity) {
        if ( entity == null ) {
            return null;
        }

        QuoteSessionResponse quoteSessionResponse = new QuoteSessionResponse();

        quoteSessionResponse.setQuoteReferenceId( stringToUuid( entity.getQuoteReferenceId() ) );
        quoteSessionResponse.setCustomerId( stringToUuid( entity.getCustomerId() ) );
        quoteSessionResponse.setCreatedAt( stringToOffsetDateTime( entity.getCreatedAt() ) );
        quoteSessionResponse.setUpdatedAt( stringToOffsetDateTime( entity.getUpdatedAt() ) );
        if ( entity.getStatus() != null ) {
            quoteSessionResponse.setStatus( Enum.valueOf( QuoteSessionResponse.StatusEnum.class, entity.getStatus() ) );
        }
        quoteSessionResponse.setFirstName( entity.getFirstName() );
        quoteSessionResponse.setLastName( entity.getLastName() );
        quoteSessionResponse.setEmail( entity.getEmail() );
        quoteSessionResponse.setStreet( entity.getStreet() );
        quoteSessionResponse.setAptUnit( entity.getAptUnit() );
        quoteSessionResponse.setCity( entity.getCity() );
        quoteSessionResponse.setState( entity.getState() );
        quoteSessionResponse.setZipCode( entity.getZipCode() );

        return quoteSessionResponse;
    }
}
