package com.insurance.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.insurance.api.model.VehicleRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * VehicleListRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-24T16:33:52.752984700-04:00[America/New_York]", comments = "Generator version: 7.4.0")
public class VehicleListRequest {

  @Valid
  private List<@Valid VehicleRequest> vehicles = new ArrayList<>();

  public VehicleListRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VehicleListRequest(List<@Valid VehicleRequest> vehicles) {
    this.vehicles = vehicles;
  }

  public VehicleListRequest vehicles(List<@Valid VehicleRequest> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public VehicleListRequest addVehiclesItem(VehicleRequest vehiclesItem) {
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
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "vehicles", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicles")
  public List<@Valid VehicleRequest> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<@Valid VehicleRequest> vehicles) {
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
    VehicleListRequest vehicleListRequest = (VehicleListRequest) o;
    return Objects.equals(this.vehicles, vehicleListRequest.vehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleListRequest {\n");
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

