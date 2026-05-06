package com.insurance.session.mapper;

import com.insurance.api.model.DriverRequest;
import com.insurance.api.model.DriverResponse;
import com.insurance.dynamo.entity.DriverEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Mapper
public interface DriverMapper {

    @Mapping(target = "quoteReferenceId",  ignore = true)
    @Mapping(target = "driverId",          ignore = true)
    @Mapping(target = "ssnMasked",         ignore = true)
    @Mapping(target = "createdAt",         ignore = true)
    @Mapping(target = "dateOfBirth",       source = "dateOfBirth",
             qualifiedByName = "localDateToString")
    @Mapping(target = "gender",            source = "gender",
             qualifiedByName = "genderToString")
    @Mapping(target = "maritalStatus",     source = "maritalStatus",
             qualifiedByName = "maritalStatusToString")
    @Mapping(target = "primaryResidence",  source = "primaryResidence",
             qualifiedByName = "residenceToString")
    @Mapping(target = "licenseType",       source = "licenseType",
             qualifiedByName = "licenseTypeToString")
    @Mapping(target = "licenseStatus",     source = "licenseStatus",
             qualifiedByName = "licenseStatusToString")
    @Mapping(target = "yearsLicensed",     source = "yearsLicensed",
             qualifiedByName = "yearsLicensedToString")
    DriverEntity toEntity(DriverRequest request);

    @Mapping(target = "quoteReferenceId",  source = "quoteReferenceId",
             qualifiedByName = "stringToUuid")
    @Mapping(target = "driverId",          source = "driverId",
             qualifiedByName = "stringToUuid")
    @Mapping(target = "dateOfBirth",       source = "dateOfBirth",
             qualifiedByName = "stringToLocalDate")
    @Mapping(target = "createdAt",         source = "createdAt",
             qualifiedByName = "stringToOffsetDateTime")
    DriverResponse toResponse(DriverEntity entity);

    @org.mapstruct.Named("stringToUuid")
    default UUID stringToUuid(String value) {
        return value == null ? null : UUID.fromString(value);
    }

    @org.mapstruct.Named("localDateToString")
    default String localDateToString(LocalDate date) {
        return date == null ? null
                : date.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    @org.mapstruct.Named("stringToLocalDate")
    default LocalDate stringToLocalDate(String date) {
        return date == null ? null
                : LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
    }

    @org.mapstruct.Named("stringToOffsetDateTime")
    default OffsetDateTime stringToOffsetDateTime(String value) {
        return value == null ? null : OffsetDateTime.parse(value);
    }

    @org.mapstruct.Named("genderToString")
    default String genderToString(DriverRequest.GenderEnum v) {
        return v == null ? null : v.getValue();
    }

    @org.mapstruct.Named("maritalStatusToString")
    default String maritalStatusToString(
            DriverRequest.MaritalStatusEnum v) {
        return v == null ? null : v.getValue();
    }

    @org.mapstruct.Named("residenceToString")
    default String residenceToString(
            DriverRequest.PrimaryResidenceEnum v) {
        return v == null ? null : v.getValue();
    }

    @org.mapstruct.Named("licenseTypeToString")
    default String licenseTypeToString(
            DriverRequest.LicenseTypeEnum v) {
        return v == null ? null : v.getValue();
    }

    @org.mapstruct.Named("licenseStatusToString")
    default String licenseStatusToString(
            DriverRequest.LicenseStatusEnum v) {
        return v == null ? null : v.getValue();
    }

    @org.mapstruct.Named("yearsLicensedToString")
    default String yearsLicensedToString(
            DriverRequest.YearsLicensedEnum v) {
        return v == null ? null : v.getValue();
    }
}