package com.insurance.dynamo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamoDbBean
public class VehicleEntity {

    private String quoteReferenceId;
    private String vehicleId;
    private Integer year;
    private String make;
    private String model;
    private String vinMasked;
    private String vehicleUse;
    private Boolean rideshare;
    private String primaryZip;
    private String ownership;
    private String yearsOwned;
    private String annualMileage;
    private String primaryDriverId;
    private String createdAt;

    @DynamoDbPartitionKey
    @DynamoDbAttribute("quoteReferenceId")
    public String getQuoteReferenceId() { return quoteReferenceId; }

    @DynamoDbSortKey
    @DynamoDbAttribute("vehicleId")
    public String getVehicleId() { return vehicleId; }

    @DynamoDbAttribute("year")
    public Integer getYear() { return year; }

    @DynamoDbAttribute("make")
    public String getMake() { return make; }

    @DynamoDbAttribute("model")
    public String getModel() { return model; }

    @DynamoDbAttribute("vinMasked")
    public String getVinMasked() { return vinMasked; }

    @DynamoDbAttribute("vehicleUse")
    public String getVehicleUse() { return vehicleUse; }

    @DynamoDbAttribute("rideshare")
    public Boolean getRideshare() { return rideshare; }

    @DynamoDbAttribute("primaryZip")
    public String getPrimaryZip() { return primaryZip; }

    @DynamoDbAttribute("ownership")
    public String getOwnership() { return ownership; }

    @DynamoDbAttribute("yearsOwned")
    public String getYearsOwned() { return yearsOwned; }

    @DynamoDbAttribute("annualMileage")
    public String getAnnualMileage() { return annualMileage; }

    @DynamoDbAttribute("primaryDriverId")
    public String getPrimaryDriverId() { return primaryDriverId; }

    @DynamoDbAttribute("createdAt")
    public String getCreatedAt() { return createdAt; }
}