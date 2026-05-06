package com.insurance.session.mapper;

import com.insurance.api.model.VehicleRequest;
import com.insurance.api.model.VehicleResponse;
import com.insurance.dynamo.entity.VehicleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.OffsetDateTime;
import java.util.UUID;

@Mapper
public interface VehicleMapper {

    @Mapping(target = "quoteReferenceId", ignore = true)
    @Mapping(target = "vehicleId",        ignore = true)
    @Mapping(target = "vinMasked",        ignore = true)
    @Mapping(target = "createdAt",        ignore = true)
    @Mapping(target = "primaryDriverId",  source = "primaryDriverId",
             qualifiedByName = "uuidToString")
    @Mapping(target = "vehicleUse",       source = "vehicleUse",
             qualifiedByName = "vehicleUseToString")
    @Mapping(target = "ownership",        source = "ownership",
             qualifiedByName = "ownershipToString")
    @Mapping(target = "yearsOwned",       source = "yearsOwned",
             qualifiedByName = "yearsOwnedToString")
    @Mapping(target = "annualMileage",    source = "annualMileage",
             qualifiedByName = "annualMileageToString")
    VehicleEntity toEntity(VehicleRequest request);

    @Mapping(target = "quoteReferenceId", source = "quoteReferenceId",
             qualifiedByName = "stringToUuid")
    @Mapping(target = "vehicleId",        source = "vehicleId",
             qualifiedByName = "stringToUuid")
    @Mapping(target = "primaryDriverId",  source = "primaryDriverId",
             qualifiedByName = "stringToUuid")
    @Mapping(target = "createdAt",        source = "createdAt",
             qualifiedByName = "stringToOffsetDateTime")
    VehicleResponse toResponse(VehicleEntity entity);

    @org.mapstruct.Named("uuidToString")
    default String uuidToString(UUID value) {
        return value == null ? null : value.toString();
    }

    @org.mapstruct.Named("stringToUuid")
    default UUID stringToUuid(String value) {
        return value == null ? null : UUID.fromString(value);
    }

    @org.mapstruct.Named("stringToOffsetDateTime")
    default OffsetDateTime stringToOffsetDateTime(String value) {
        return value == null ? null : OffsetDateTime.parse(value);
    }

    @org.mapstruct.Named("vehicleUseToString")
    default String vehicleUseToString(VehicleRequest.VehicleUseEnum v) {
        return v == null ? null : v.getValue();
    }

    @org.mapstruct.Named("ownershipToString")
    default String ownershipToString(VehicleRequest.OwnershipEnum v) {
        return v == null ? null : v.getValue();
    }

    @org.mapstruct.Named("yearsOwnedToString")
    default String yearsOwnedToString(VehicleRequest.YearsOwnedEnum v) {
        return v == null ? null : v.getValue();
    }

    @org.mapstruct.Named("annualMileageToString")
    default String annualMileageToString(
            VehicleRequest.AnnualMileageEnum v) {
        return v == null ? null : v.getValue();
    }
}