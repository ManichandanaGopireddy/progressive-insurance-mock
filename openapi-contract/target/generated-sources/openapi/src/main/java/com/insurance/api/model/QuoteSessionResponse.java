package com.insurance.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * QuoteSessionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-24T16:33:52.752984700-04:00[America/New_York]", comments = "Generator version: 7.4.0")
public class QuoteSessionResponse {

  private UUID quoteReferenceId;

  private UUID customerId;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    IN_PROGRESS("IN_PROGRESS"),
    
    COMPLETED("COMPLETED"),
    
    EXPIRED("EXPIRED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private String firstName;

  private String lastName;

  private String email;

  private String street;

  private String aptUnit;

  private String city;

  private String state;

  private String zipCode;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public QuoteSessionResponse quoteReferenceId(UUID quoteReferenceId) {
    this.quoteReferenceId = quoteReferenceId;
    return this;
  }

  /**
   * Unique reference ID for this quote application
   * @return quoteReferenceId
  */
  @Valid 
  @Schema(name = "quoteReferenceId", description = "Unique reference ID for this quote application", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quoteReferenceId")
  public UUID getQuoteReferenceId() {
    return quoteReferenceId;
  }

  public void setQuoteReferenceId(UUID quoteReferenceId) {
    this.quoteReferenceId = quoteReferenceId;
  }

  public QuoteSessionResponse customerId(UUID customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Permanent customer identifier derived from email
   * @return customerId
  */
  @Valid 
  @Schema(name = "customerId", description = "Permanent customer identifier derived from email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerId")
  public UUID getCustomerId() {
    return customerId;
  }

  public void setCustomerId(UUID customerId) {
    this.customerId = customerId;
  }

  public QuoteSessionResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public QuoteSessionResponse firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  
  @Schema(name = "firstName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public QuoteSessionResponse lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  
  @Schema(name = "lastName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public QuoteSessionResponse email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public QuoteSessionResponse street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Get street
   * @return street
  */
  
  @Schema(name = "street", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public QuoteSessionResponse aptUnit(String aptUnit) {
    this.aptUnit = aptUnit;
    return this;
  }

  /**
   * Get aptUnit
   * @return aptUnit
  */
  
  @Schema(name = "aptUnit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aptUnit")
  public String getAptUnit() {
    return aptUnit;
  }

  public void setAptUnit(String aptUnit) {
    this.aptUnit = aptUnit;
  }

  public QuoteSessionResponse city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  
  @Schema(name = "city", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public QuoteSessionResponse state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public QuoteSessionResponse zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Get zipCode
   * @return zipCode
  */
  
  @Schema(name = "zipCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("zipCode")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public QuoteSessionResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid 
  @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public QuoteSessionResponse updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @Valid 
  @Schema(name = "updatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteSessionResponse quoteSessionResponse = (QuoteSessionResponse) o;
    return Objects.equals(this.quoteReferenceId, quoteSessionResponse.quoteReferenceId) &&
        Objects.equals(this.customerId, quoteSessionResponse.customerId) &&
        Objects.equals(this.status, quoteSessionResponse.status) &&
        Objects.equals(this.firstName, quoteSessionResponse.firstName) &&
        Objects.equals(this.lastName, quoteSessionResponse.lastName) &&
        Objects.equals(this.email, quoteSessionResponse.email) &&
        Objects.equals(this.street, quoteSessionResponse.street) &&
        Objects.equals(this.aptUnit, quoteSessionResponse.aptUnit) &&
        Objects.equals(this.city, quoteSessionResponse.city) &&
        Objects.equals(this.state, quoteSessionResponse.state) &&
        Objects.equals(this.zipCode, quoteSessionResponse.zipCode) &&
        Objects.equals(this.createdAt, quoteSessionResponse.createdAt) &&
        Objects.equals(this.updatedAt, quoteSessionResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteReferenceId, customerId, status, firstName, lastName, email, street, aptUnit, city, state, zipCode, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteSessionResponse {\n");
    sb.append("    quoteReferenceId: ").append(toIndentedString(quoteReferenceId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    aptUnit: ").append(toIndentedString(aptUnit)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

