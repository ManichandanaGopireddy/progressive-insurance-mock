package com.insurance.session.mapper;

import com.insurance.api.model.VehicleRequest;
import com.insurance.api.model.VehicleResponse;
import com.insurance.dynamo.entity.VehicleEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-24T16:34:10-0400",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.10 (Eclipse Adoptium)"
)
public class VehicleMapperImpl implements VehicleMapper {

    @Override
    public VehicleEntity toEntity(VehicleRequest request) {
        if ( request == null ) {
            return null;
        }

        VehicleEntity.VehicleEntityBuilder vehicleEntity = VehicleEntity.builder();

        vehicleEntity.primaryDriverId( uuidToString( request.getPrimaryDriverId() ) );
        vehicleEntity.vehicleUse( vehicleUseToString( request.getVehicleUse() ) );
        vehicleEntity.ownership( ownershipToString( request.getOwnership() ) );
        vehicleEntity.yearsOwned( yearsOwnedToString( request.getYearsOwned() ) );
        vehicleEntity.annualMileage( annualMileageToString( request.getAnnualMileage() ) );
        vehicleEntity.year( request.getYear() );
        vehicleEntity.make( request.getMake() );
        vehicleEntity.model( request.getModel() );
        vehicleEntity.rideshare( request.getRideshare() );
        vehicleEntity.primaryZip( request.getPrimaryZip() );

        return vehicleEntity.build();
    }

    @Override
    public VehicleResponse toResponse(VehicleEntity entity) {
        if ( entity == null ) {
            return null;
        }

        VehicleResponse vehicleResponse = new VehicleResponse();

        vehicleResponse.setQuoteReferenceId( stringToUuid( entity.getQuoteReferenceId() ) );
        vehicleResponse.setVehicleId( stringToUuid( entity.getVehicleId() ) );
        vehicleResponse.setPrimaryDriverId( stringToUuid( entity.getPrimaryDriverId() ) );
        vehicleResponse.setCreatedAt( stringToOffsetDateTime( entity.getCreatedAt() ) );
        vehicleResponse.setYear( entity.getYear() );
        vehicleResponse.setMake( entity.getMake() );
        vehicleResponse.setModel( entity.getModel() );
        vehicleResponse.setVinMasked( entity.getVinMasked() );
        vehicleResponse.setVehicleUse( entity.getVehicleUse() );
        vehicleResponse.setRideshare( entity.getRideshare() );
        vehicleResponse.setPrimaryZip( entity.getPrimaryZip() );
        vehicleResponse.setOwnership( entity.getOwnership() );
        vehicleResponse.setAnnualMileage( entity.getAnnualMileage() );

        return vehicleResponse;
    }
}
