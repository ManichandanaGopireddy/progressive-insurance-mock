package com.insurance.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * VehicleResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-24T16:33:52.752984700-04:00[America/New_York]", comments = "Generator version: 7.4.0")
public class VehicleResponse {

  private UUID vehicleId;

  private UUID quoteReferenceId;

  private Integer year;

  private String make;

  private String model;

  private String vinMasked;

  private String vehicleUse;

  private Boolean rideshare;

  private String primaryZip;

  private String ownership;

  private String annualMileage;

  private UUID primaryDriverId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  public VehicleResponse vehicleId(UUID vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  /**
   * Get vehicleId
   * @return vehicleId
  */
  @Valid 
  @Schema(name = "vehicleId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleId")
  public UUID getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(UUID vehicleId) {
    this.vehicleId = vehicleId;
  }

  public VehicleResponse quoteReferenceId(UUID quoteReferenceId) {
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

  public VehicleResponse year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
  */
  
  @Schema(name = "year", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("year")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public VehicleResponse make(String make) {
    this.make = make;
    return this;
  }

  /**
   * Get make
   * @return make
  */
  
  @Schema(name = "make", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("make")
  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public VehicleResponse model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
  */
  
  @Schema(name = "model", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public VehicleResponse vinMasked(String vinMasked) {
    this.vinMasked = vinMasked;
    return this;
  }

  /**
   * Masked VIN showing only last 6 characters
   * @return vinMasked
  */
  
  @Schema(name = "vinMasked", description = "Masked VIN showing only last 6 characters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vinMasked")
  public String getVinMasked() {
    return vinMasked;
  }

  public void setVinMasked(String vinMasked) {
    this.vinMasked = vinMasked;
  }

  public VehicleResponse vehicleUse(String vehicleUse) {
    this.vehicleUse = vehicleUse;
    return this;
  }

  /**
   * Get vehicleUse
   * @return vehicleUse
  */
  
  @Schema(name = "vehicleUse", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vehicleUse")
  public String getVehicleUse() {
    return vehicleUse;
  }

  public void setVehicleUse(String vehicleUse) {
    this.vehicleUse = vehicleUse;
  }

  public VehicleResponse rideshare(Boolean rideshare) {
    this.rideshare = rideshare;
    return this;
  }

  /**
   * Get rideshare
   * @return rideshare
  */
  
  @Schema(name = "rideshare", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rideshare")
  public Boolean getRideshare() {
    return rideshare;
  }

  public void setRideshare(Boolean rideshare) {
    this.rideshare = rideshare;
  }

  public VehicleResponse primaryZip(String primaryZip) {
    this.primaryZip = primaryZip;
    return this;
  }

  /**
   * Get primaryZip
   * @return primaryZip
  */
  
  @Schema(name = "primaryZip", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primaryZip")
  public String getPrimaryZip() {
    return primaryZip;
  }

  public void setPrimaryZip(String primaryZip) {
    this.primaryZip = primaryZip;
  }

  public VehicleResponse ownership(String ownership) {
    this.ownership = ownership;
    return this;
  }

  /**
   * Get ownership
   * @return ownership
  */
  
  @Schema(name = "ownership", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownership")
  public String getOwnership() {
    return ownership;
  }

  public void setOwnership(String ownership) {
    this.ownership = ownership;
  }

  public VehicleResponse annualMileage(String annualMileage) {
    this.annualMileage = annualMileage;
    return this;
  }

  /**
   * Get annualMileage
   * @return annualMileage
  */
  
  @Schema(name = "annualMileage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("annualMileage")
  public String getAnnualMileage() {
    return annualMileage;
  }

  public void setAnnualMileage(String annualMileage) {
    this.annualMileage = annualMileage;
  }

  public VehicleResponse primaryDriverId(UUID primaryDriverId) {
    this.primaryDriverId = primaryDriverId;
    return this;
  }

  /**
   * Get primaryDriverId
   * @return primaryDriverId
  */
  @Valid 
  @Schema(name = "primaryDriverId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primaryDriverId")
  public UUID getPrimaryDriverId() {
    return primaryDriverId;
  }

  public void setPrimaryDriverId(UUID primaryDriverId) {
    this.primaryDriverId = primaryDriverId;
  }

  public VehicleResponse createdAt(OffsetDateTime createdAt) {
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
    VehicleResponse vehicleResponse = (VehicleResponse) o;
    return Objects.equals(this.vehicleId, vehicleResponse.vehicleId) &&
        Objects.equals(this.quoteReferenceId, vehicleResponse.quoteReferenceId) &&
        Objects.equals(this.year, vehicleResponse.year) &&
        Objects.equals(this.make, vehicleResponse.make) &&
        Objects.equals(this.model, vehicleResponse.model) &&
        Objects.equals(this.vinMasked, vehicleResponse.vinMasked) &&
        Objects.equals(this.vehicleUse, vehicleResponse.vehicleUse) &&
        Objects.equals(this.rideshare, vehicleResponse.rideshare) &&
        Objects.equals(this.primaryZip, vehicleResponse.primaryZip) &&
        Objects.equals(this.ownership, vehicleResponse.ownership) &&
        Objects.equals(this.annualMileage, vehicleResponse.annualMileage) &&
        Objects.equals(this.primaryDriverId, vehicleResponse.primaryDriverId) &&
        Objects.equals(this.createdAt, vehicleResponse.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleId, quoteReferenceId, year, make, model, vinMasked, vehicleUse, rideshare, primaryZip, ownership, annualMileage, primaryDriverId, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleResponse {\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    quoteReferenceId: ").append(toIndentedString(quoteReferenceId)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    vinMasked: ").append(toIndentedString(vinMasked)).append("\n");
    sb.append("    vehicleUse: ").append(toIndentedString(vehicleUse)).append("\n");
    sb.append("    rideshare: ").append(toIndentedString(rideshare)).append("\n");
    sb.append("    primaryZip: ").append(toIndentedString(primaryZip)).append("\n");
    sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
    sb.append("    annualMileage: ").append(toIndentedString(annualMileage)).append("\n");
    sb.append("    primaryDriverId: ").append(toIndentedString(primaryDriverId)).append("\n");
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

