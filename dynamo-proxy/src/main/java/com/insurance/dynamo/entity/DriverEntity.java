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
public class DriverEntity {

    private String quoteReferenceId;
    private String driverId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String maritalStatus;
    private String ssnMasked;
    private String licenseNumber;
    private String primaryResidence;
    private String licenseType;
    private String licenseStatus;
    private String yearsLicensed;
    private Boolean defensiveCourse;
    private Boolean accidents;
    private Boolean violations;
    private Boolean sr22Required;
    private Integer numberOfAccidents;
    private Integer activeTickets;
    private String createdAt;

    @DynamoDbPartitionKey
    @DynamoDbAttribute("quoteReferenceId")
    public String getQuoteReferenceId() { return quoteReferenceId; }

    @DynamoDbSortKey
    @DynamoDbAttribute("driverId")
    public String getDriverId() { return driverId; }

    @DynamoDbAttribute("firstName")
    public String getFirstName() { return firstName; }

    @DynamoDbAttribute("lastName")
    public String getLastName() { return lastName; }

    @DynamoDbAttribute("dateOfBirth")
    public String getDateOfBirth() { return dateOfBirth; }

    @DynamoDbAttribute("gender")
    public String getGender() { return gender; }

    @DynamoDbAttribute("maritalStatus")
    public String getMaritalStatus() { return maritalStatus; }

    @DynamoDbAttribute("ssnMasked")
    public String getSsnMasked() { return ssnMasked; }

    @DynamoDbAttribute("licenseNumber")
    public String getLicenseNumber() { return licenseNumber; }

    @DynamoDbAttribute("primaryResidence")
    public String getPrimaryResidence() { return primaryResidence; }

    @DynamoDbAttribute("licenseType")
    public String getLicenseType() { return licenseType; }

    @DynamoDbAttribute("licenseStatus")
    public String getLicenseStatus() { return licenseStatus; }

    @DynamoDbAttribute("yearsLicensed")
    public String getYearsLicensed() { return yearsLicensed; }

    @DynamoDbAttribute("defensiveCourse")
    public Boolean getDefensiveCourse() { return defensiveCourse; }

    @DynamoDbAttribute("accidents")
    public Boolean getAccidents() { return accidents; }

    @DynamoDbAttribute("violations")
    public Boolean getViolations() { return violations; }

    @DynamoDbAttribute("sr22Required")
    public Boolean getSr22Required() { return sr22Required; }

    @DynamoDbAttribute("numberOfAccidents")
    public Integer getNumberOfAccidents() { return numberOfAccidents; }

    @DynamoDbAttribute("activeTickets")
    public Integer getActiveTickets() { return activeTickets; }

    @DynamoDbAttribute("createdAt")
    public String getCreatedAt() { return createdAt; }
}