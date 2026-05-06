package com.insurance.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.insurance.api.model.VehicleResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * VehicleListResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-24T16:33:52.752984700-04:00[America/New_York]", comments = "Generator version: 7.4.0")
public class VehicleListResponse {

  private UUID quoteReferenceId;

  @Valid
  private List<@Valid VehicleResponse> vehicles;

  public VehicleListResponse quoteReferenceId(UUID quoteReferenceId) {
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

  public VehicleListResponse vehicles(List<@Valid VehicleResponse> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public VehicleListResponse addVehiclesItem(VehicleResponse vehiclesItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleListResponse vehicleListResponse = (VehicleListResponse) o;
    return Objects.equals(this.quoteReferenceId, vehicleListResponse.quoteReferenceId) &&
        Objects.equals(this.vehicles, vehicleListResponse.vehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteReferenceId, vehicles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleListResponse {\n");
    sb.append("    quoteReferenceId: ").append(toIndentedString(quoteReferenceId)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
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

