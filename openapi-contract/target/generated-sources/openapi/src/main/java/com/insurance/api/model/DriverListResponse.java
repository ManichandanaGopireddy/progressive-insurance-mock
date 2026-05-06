package com.insurance.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.insurance.api.model.DriverResponse;
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
 * DriverListResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-24T16:33:52.752984700-04:00[America/New_York]", comments = "Generator version: 7.4.0")
public class DriverListResponse {

  private UUID quoteReferenceId;

  @Valid
  private List<@Valid DriverResponse> drivers;

  public DriverListResponse quoteReferenceId(UUID quoteReferenceId) {
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

  public DriverListResponse drivers(List<@Valid DriverResponse> drivers) {
    this.drivers = drivers;
    return this;
  }

  public DriverListResponse addDriversItem(DriverResponse driversItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverListResponse driverListResponse = (DriverListResponse) o;
    return Objects.equals(this.quoteReferenceId, driverListResponse.quoteReferenceId) &&
        Objects.equals(this.drivers, driverListResponse.drivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteReferenceId, drivers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverListResponse {\n");
    sb.append("    quoteReferenceId: ").append(toIndentedString(quoteReferenceId)).append("\n");
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
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

