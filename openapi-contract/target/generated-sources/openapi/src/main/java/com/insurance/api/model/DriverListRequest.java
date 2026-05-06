package com.insurance.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.insurance.api.model.DriverRequest;
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
 * DriverListRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-24T16:33:52.752984700-04:00[America/New_York]", comments = "Generator version: 7.4.0")
public class DriverListRequest {

  @Valid
  private List<@Valid DriverRequest> drivers = new ArrayList<>();

  public DriverListRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DriverListRequest(List<@Valid DriverRequest> drivers) {
    this.drivers = drivers;
  }

  public DriverListRequest drivers(List<@Valid DriverRequest> drivers) {
    this.drivers = drivers;
    return this;
  }

  public DriverListRequest addDriversItem(DriverRequest driversItem) {
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
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "drivers", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("drivers")
  public List<@Valid DriverRequest> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<@Valid DriverRequest> drivers) {
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
    DriverListRequest driverListRequest = (DriverListRequest) o;
    return Objects.equals(this.drivers, driverListRequest.drivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drivers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverListRequest {\n");
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

