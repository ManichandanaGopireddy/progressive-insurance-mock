package com.insurance.dynamo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamoDbBean
public class QuoteSessionEntity {

    private String quoteReferenceId;
    private String customerId;
    private String status;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;
    private String street;
    private String aptUnit;
    private String city;
    private String state;
    private String zipCode;
    private Boolean poBox;
    private String coverageTierId;
    private Integer deductibleAmount;
    private String createdAt;
    private String updatedAt;

    @DynamoDbPartitionKey
    @DynamoDbAttribute("quoteReferenceId")
    public String getQuoteReferenceId() { return quoteReferenceId; }

    @DynamoDbAttribute("customerId")
    public String getCustomerId() { return customerId; }

    @DynamoDbAttribute("status")
    public String getStatus() { return status; }

    @DynamoDbAttribute("firstName")
    public String getFirstName() { return firstName; }

    @DynamoDbAttribute("lastName")
    public String getLastName() { return lastName; }

    @DynamoDbAttribute("dateOfBirth")
    public String getDateOfBirth() { return dateOfBirth; }

    @DynamoDbAttribute("email")
    public String getEmail() { return email; }

    @DynamoDbAttribute("street")
    public String getStreet() { return street; }

    @DynamoDbAttribute("aptUnit")
    public String getAptUnit() { return aptUnit; }

    @DynamoDbAttribute("city")
    public String getCity() { return city; }

    @DynamoDbAttribute("state")
    public String getState() { return state; }

    @DynamoDbAttribute("zipCode")
    public String getZipCode() { return zipCode; }

    @DynamoDbAttribute("poBox")
    public Boolean getPoBox() { return poBox; }

    @DynamoDbAttribute("coverageTierId")
    public String getCoverageTierId() { return coverageTierId; }

    @DynamoDbAttribute("deductibleAmount")
    public Integer getDeductibleAmount() { return deductibleAmount; }

    @DynamoDbAttribute("createdAt")
    public String getCreatedAt() { return createdAt; }

    @DynamoDbAttribute("updatedAt")
    public String getUpdatedAt() { return updatedAt; }
}