package com.insurance.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.insurance.api.model.DriverResponse;
import com.insurance.api.model.VehicleResponse;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * SessionReviewResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-24T16:33:52.752984700-04:00[America/New_York]", comments = "Generator version: 7.4.0")
public class SessionReviewResponse {

  private UUID quoteReferenceId;

  private UUID customerId;

  private String status;

  private String firstName;

  private String lastName;

  private String email;

  private String street;

  private String city;

  private String state;

  private String zipCode;

  private String coverageTierId;

  private Integer deductibleAmount;

  @Valid
  private List<@Valid VehicleResponse> vehicles;

  @Valid
  private List<@Valid DriverResponse> drivers;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  public SessionReviewResponse quoteReferenceId(UUID quoteReferenceId) {
    this.quoteReferenceId = quoteReferenceId;
    return this;
  }

  /**
   * Get quoteReferenceId
   * @return quoteReferenceId
  */
  @Valid 
  @Schema(name = "quoteReferenceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quoteReferenceId")
  public UUID getQuoteReferenceId() {
    return quoteReferenceId;
  }

  public void setQuoteReferenceId(UUID quoteReferenceId) {
    this.quoteReferenceId = quoteReferenceId;
  }

  public SessionReviewResponse customerId(UUID customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  @Valid 
  @Schema(name = "customerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerId")
  public UUID getCustomerId() {
    return customerId;
  }

  public void setCustomerId(UUID customerId) {
    this.customerId = customerId;
  }

  public SessionReviewResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SessionReviewResponse firstName(String firstName) {
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

  public SessionReviewResponse lastName(String lastName) {
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

  public SessionReviewResponse email(String email) {
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

  public SessionReviewResponse street(String street) {
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

  public SessionReviewResponse city(String city) {
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

  public SessionReviewResponse state(String state) {
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

  public SessionReviewResponse zipCode(String zipCode) {
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

  public SessionReviewResponse coverageTierId(String coverageTierId) {
    this.coverageTierId = coverageTierId;
    return this;
  }

  /**
   * Coverage tier selected by customer
   * @return coverageTierId
  */
  
  @Schema(name = "coverageTierId", description = "Coverage tier selected by customer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("coverageTierId")
  public String getCoverageTierId() {
    return coverageTierId;
  }

  public void setCoverageTierId(String coverageTierId) {
    this.coverageTierId = coverageTierId;
  }

  public SessionReviewResponse deductibleAmount(Integer deductibleAmount) {
    this.deductibleAmount = deductibleAmount;
    return this;
  }

  /**
   * Deductible amount selected by customer
   * @return deductibleAmount
  */
  
  @Schema(name = "deductibleAmount", description = "Deductible amount selected by customer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deductibleAmount")
  public Integer getDeductibleAmount() {
    return deductibleAmount;
  }

  public void setDeductibleAmount(Integer deductibleAmount) {
    this.deductibleAmount = deductibleAmount;
  }

  public SessionReviewResponse vehicles(List<@Valid VehicleResponse> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public SessionReviewResponse addVehiclesItem(VehicleResponse vehiclesItem) {
    if (this.vehicles == null) {
      this.vehicles = new ArrayList<>();
    }
    this.vehicles.add(vehiclesItem);
    return this;
  }

  /**
   * Get vehicles
   * @return vehicles
  */
  @Valid 
  @Schema(name = "vehicles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicles")
  public List<@Valid VehicleResponse> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<@Valid VehicleResponse> vehicles) {
    this.vehicles = vehicles;
  }

  public SessionReviewResponse drivers(List<@Valid DriverResponse> drivers) {
    this.drivers = drivers;
    return this;
  }

  public SessionReviewResponse addDriversItem(DriverResponse driversItem) {
    if (this.drivers == null) {
      this.drivers = new ArrayList<>();
    }
    this.drivers.add(driversItem);
    return this;
  }

  /**
   * Get drivers
   * @return drivers
  */
  @Valid 
  @Schema(name = "drivers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drivers")
  public List<@Valid DriverResponse> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<@Valid DriverResponse> drivers) {
    this.drivers = drivers;
  }

  public SessionReviewResponse createdAt(OffsetDateTime createdAt) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionReviewResponse sessionReviewResponse = (SessionReviewResponse) o;
    return Objects.equals(this.quoteReferenceId, sessionReviewResponse.quoteReferenceId) &&
        Objects.equals(this.customerId, sessionReviewResponse.customerId) &&
        Objects.equals(this.status, sessionReviewResponse.status) &&
        Objects.equals(this.firstName, sessionReviewResponse.firstName) &&
        Objects.equals(this.lastName, sessionReviewResponse.lastName) &&
        Objects.equals(this.email, sessionReviewResponse.email) &&
        Objects.equals(this.street, sessionReviewResponse.street) &&
        Objects.equals(this.city, sessionReviewResponse.city) &&
        Objects.equals(this.state, sessionReviewResponse.state) &&
        Objects.equals(this.zipCode, sessionReviewResponse.zipCode) &&
        Objects.equals(this.coverageTierId, sessionReviewResponse.coverageTierId) &&
        Objects.equals(this.deductibleAmount, sessionReviewResponse.deductibleAmount) &&
        Objects.equals(this.vehicles, sessionReviewResponse.vehicles) &&
        Objects.equals(this.drivers, sessionReviewResponse.drivers) &&
        Objects.equals(this.createdAt, sessionReviewResponse.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteReferenceId, customerId, status, firstName, lastName, email, street, city, state, zipCode, coverageTierId, deductibleAmount, vehicles, drivers, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionReviewResponse {\n");
    sb.append("    quoteReferenceId: ").append(toIndentedString(quoteReferenceId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    coverageTierId: ").append(toIndentedString(coverageTierId)).append("\n");
    sb.append("    deductibleAmount: ").append(toIndentedString(deductibleAmount)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

