package com.insurance.session.mapper;

import com.insurance.api.model.DriverRequest;
import com.insurance.api.model.DriverResponse;
import com.insurance.dynamo.entity.DriverEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-24T16:34:10-0400",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.10 (Eclipse Adoptium)"
)
public class DriverMapperImpl implements DriverMapper {

    @Override
    public DriverEntity toEntity(DriverRequest request) {
        if ( request == null ) {
            return null;
        }

        DriverEntity.DriverEntityBuilder driverEntity = DriverEntity.builder();

        driverEntity.dateOfBirth( localDateToString( request.getDateOfBirth() ) );
        driverEntity.gender( genderToString( request.getGender() ) );
        driverEntity.maritalStatus( maritalStatusToString( request.getMaritalStatus() ) );
        driverEntity.primaryResidence( residenceToString( request.getPrimaryResidence() ) );
        driverEntity.licenseType( licenseTypeToString( request.getLicenseType() ) );
        driverEntity.licenseStatus( licenseStatusToString( request.getLicenseStatus() ) );
        driverEntity.yearsLicensed( yearsLicensedToString( request.getYearsLicensed() ) );
        driverEntity.firstName( request.getFirstName() );
        driverEntity.lastName( request.getLastName() );
        driverEntity.licenseNumber( request.getLicenseNumber() );
        driverEntity.defensiveCourse( request.getDefensiveCourse() );
        driverEntity.accidents( request.getAccidents() );
        driverEntity.violations( request.getViolations() );
        driverEntity.sr22Required( request.getSr22Required() );
        driverEntity.numberOfAccidents( request.getNumberOfAccidents() );
        driverEntity.activeTickets( request.getActiveTickets() );

        return driverEntity.build();
    }

    @Override
    public DriverResponse toResponse(DriverEntity entity) {
        if ( entity == null ) {
            return null;
        }

        DriverResponse driverResponse = new DriverResponse();

        driverResponse.setQuoteReferenceId( stringToUuid( entity.getQuoteReferenceId() ) );
        driverResponse.setDriverId( stringToUuid( entity.getDriverId() ) );
        driverResponse.setDateOfBirth( stringToLocalDate( entity.getDateOfBirth() ) );
        driverResponse.setCreatedAt( stringToOffsetDateTime( entity.getCreatedAt() ) );
        driverResponse.setFirstName( entity.getFirstName() );
        driverResponse.setLastName( entity.getLastName() );
        driverResponse.setGender( entity.getGender() );
        driverResponse.setMaritalStatus( entity.getMaritalStatus() );
        driverResponse.setPrimaryResidence( entity.getPrimaryResidence() );
        driverResponse.setLicenseType( entity.getLicenseType() );
        driverResponse.setLicenseStatus( entity.getLicenseStatus() );
        driverResponse.setLicenseNumber( entity.getLicenseNumber() );
        driverResponse.setYearsLicensed( entity.getYearsLicensed() );
        driverResponse.setDefensiveCourse( entity.getDefensiveCourse() );
        driverResponse.setAccidents( entity.getAccidents() );
        driverResponse.setViolations( entity.getViolations() );
        driverResponse.setSr22Required( entity.getSr22Required() );
        driverResponse.setNumberOfAccidents( entity.getNumberOfAccidents() );
        driverResponse.setActiveTickets( entity.getActiveTickets() );
        driverResponse.setSsnMasked( entity.getSsnMasked() );

        return driverResponse;
    }
}
