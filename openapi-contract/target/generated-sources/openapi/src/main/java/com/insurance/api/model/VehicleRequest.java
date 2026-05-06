package com.insurance.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * VehicleRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-24T16:33:52.752984700-04:00[America/New_York]", comments = "Generator version: 7.4.0")
public class VehicleRequest {

  private Integer year;

  private String make;

  private String model;

  private String vin;

  /**
   * Gets or Sets vehicleUse
   */
  public enum VehicleUseEnum {
    PLEASURE("PLEASURE"),
    
    COMMUTE("COMMUTE"),
    
    BUSINESS("BUSINESS"),
    
    FARM("FARM");

    private String value;

    VehicleUseEnum(String value) {
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
    public static VehicleUseEnum fromValue(String value) {
      for (VehicleUseEnum b : VehicleUseEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private VehicleUseEnum vehicleUse;

  private Boolean rideshare = false;

  private String primaryZip;

  /**
   * Gets or Sets ownership
   */
  public enum OwnershipEnum {
    OWN("OWN"),
    
    LEASE("LEASE"),
    
    FINANCE("FINANCE");

    private String value;

    OwnershipEnum(String value) {
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
    public static OwnershipEnum fromValue(String value) {
      for (OwnershipEnum b : OwnershipEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OwnershipEnum ownership;

  /**
   * Gets or Sets yearsOwned
   */
  public enum YearsOwnedEnum {
    LESS_THAN_1("LESS_THAN_1"),
    
    ONE_TO_2("ONE_TO_2"),
    
    TWO_TO_3("TWO_TO_3"),
    
    THREE_TO_4("THREE_TO_4"),
    
    FIVE_OR_MORE("FIVE_OR_MORE");

    private String value;

    YearsOwnedEnum(String value) {
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
    public static YearsOwnedEnum fromValue(String value) {
      for (YearsOwnedEnum b : YearsOwnedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private YearsOwnedEnum yearsOwned;

  /**
   * Gets or Sets annualMileage
   */
  public enum AnnualMileageEnum {
    UNDER_5000("UNDER_5000"),
    
    FIVE_TO_7499("FIVE_TO_7499"),
    
    SEVEN500_TO_9999("SEVEN500_TO_9999"),
    
    TEN000_TO_11999("TEN000_TO_11999"),
    
    TWELVE000_TO_13999("TWELVE000_TO_13999"),
    
    FOURTEEN000_TO_15999("FOURTEEN000_TO_15999"),
    
    SIXTEEN000_OR_MORE("SIXTEEN000_OR_MORE");

    private String value;

    AnnualMileageEnum(String value) {
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
    public static AnnualMileageEnum fromValue(String value) {
      for (AnnualMileageEnum b : AnnualMileageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AnnualMileageEnum annualMileage;

  private UUID primaryDriverId;

  public VehicleRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VehicleRequest(Integer year, String make, String model, VehicleUseEnum vehicleUse, String primaryZip, OwnershipEnum ownership, AnnualMileageEnum annualMileage, UUID primaryDriverId) {
    this.year = year;
    this.make = make;
    this.model = model;
    this.vehicleUse = vehicleUse;
    this.primaryZip = primaryZip;
    this.ownership = ownership;
    this.annualMileage = annualMileage;
    this.primaryDriverId = primaryDriverId;
  }

  public VehicleRequest year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * minimum: 1900
   * maximum: 2100
   * @return year
  */
  @NotNull @Min(1900) @Max(2100) 
  @Schema(name = "year", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("year")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public VehicleRequest make(String make) {
    this.make = make;
    return this;
  }

  /**
   * Get make
   * @return make
  */
  @NotNull @Size(max = 100) 
  @Schema(name = "make", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("make")
  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public VehicleRequest model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
  */
  @NotNull @Size(max = 100) 
  @Schema(name = "model", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public VehicleRequest vin(String vin) {
    this.vin = vin;
    return this;
  }

  /**
   * Full 17-character VIN. Last 6 digits stored, rest masked.
   * @return vin
  */
  @Size(min = 17, max = 17) 
  @Schema(name = "vin", description = "Full 17-character VIN. Last 6 digits stored, rest masked.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vin")
  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public VehicleRequest vehicleUse(VehicleUseEnum vehicleUse) {
    this.vehicleUse = vehicleUse;
    return this;
  }

  /**
   * Get vehicleUse
   * @return vehicleUse
  */
  @NotNull 
  @Schema(name = "vehicleUse", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("vehicleUse")
  public VehicleUseEnum getVehicleUse() {
    return vehicleUse;
  }

  public void setVehicleUse(VehicleUseEnum vehicleUse) {
    this.vehicleUse = vehicleUse;
  }

  public VehicleRequest rideshare(Boolean rideshare) {
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

  public VehicleRequest primaryZip(String primaryZip) {
    this.primaryZip = primaryZip;
    return this;
  }

  /**
   * Get primaryZip
   * @return primaryZip
  */
  @NotNull 
  @Schema(name = "primaryZip", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("primaryZip")
  public String getPrimaryZip() {
    return primaryZip;
  }

  public void setPrimaryZip(String primaryZip) {
    this.primaryZip = primaryZip;
  }

  public VehicleRequest ownership(OwnershipEnum ownership) {
    this.ownership = ownership;
    return this;
  }

  /**
   * Get ownership
   * @return ownership
  */
  @NotNull 
  @Schema(name = "ownership", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ownership")
  public OwnershipEnum getOwnership() {
    return ownership;
  }

  public void setOwnership(OwnershipEnum ownership) {
    this.ownership = ownership;
  }

  public VehicleRequest yearsOwned(YearsOwnedEnum yearsOwned) {
    this.yearsOwned = yearsOwned;
    return this;
  }

  /**
   * Get yearsOwned
   * @return yearsOwned
  */
  
  @Schema(name = "yearsOwned", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yearsOwned")
  public YearsOwnedEnum getYearsOwned() {
    return yearsOwned;
  }

  public void setYearsOwned(YearsOwnedEnum yearsOwned) {
    this.yearsOwned = yearsOwned;
  }

  public VehicleRequest annualMileage(AnnualMileageEnum annualMileage) {
    this.annualMileage = annualMileage;
    return this;
  }

  /**
   * Get annualMileage
   * @return annualMileage
  */
  @NotNull 
  @Schema(name = "annualMileage", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("annualMileage")
  public AnnualMileageEnum getAnnualMileage() {
    return annualMileage;
  }

  public void setAnnualMileage(AnnualMileageEnum annualMileage) {
    this.annualMileage = annualMileage;
  }

  public VehicleRequest primaryDriverId(UUID primaryDriverId) {
    this.primaryDriverId = primaryDriverId;
    return this;
  }

  /**
   * UUID of the primary driver for this vehicle
   * @return primaryDriverId
  */
  @NotNull @Valid 
  @Schema(name = "primaryDriverId", description = "UUID of the primary driver for this vehicle", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("primaryDriverId")
  public UUID getPrimaryDriverId() {
    return primaryDriverId;
  }

  public void setPrimaryDriverId(UUID primaryDriverId) {
    this.primaryDriverId = primaryDriverId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleRequest vehicleRequest = (VehicleRequest) o;
    return Objects.equals(this.year, vehicleRequest.year) &&
        Objects.equals(this.make, vehicleRequest.make) &&
        Objects.equals(this.model, vehicleRequest.model) &&
        Objects.equals(this.vin, vehicleRequest.vin) &&
        Objects.equals(this.vehicleUse, vehicleRequest.vehicleUse) &&
        Objects.equals(this.rideshare, vehicleRequest.rideshare) &&
        Objects.equals(this.primaryZip, vehicleRequest.primaryZip) &&
        Objects.equals(this.ownership, vehicleRequest.ownership) &&
        Objects.equals(this.yearsOwned, vehicleRequest.yearsOwned) &&
        Objects.equals(this.annualMileage, vehicleRequest.annualMileage) &&
        Objects.equals(this.primaryDriverId, vehicleRequest.primaryDriverId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, make, model, vin, vehicleUse, rideshare, primaryZip, ownership, yearsOwned, annualMileage, primaryDriverId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleRequest {\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    vehicleUse: ").append(toIndentedString(vehicleUse)).append("\n");
    sb.append("    rideshare: ").append(toIndentedString(rideshare)).append("\n");
    sb.append("    primaryZip: ").append(toIndentedString(primaryZip)).append("\n");
    sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
    sb.append("    yearsOwned: ").append(toIndentedString(yearsOwned)).append("\n");
    sb.append("    annualMileage: ").append(toIndentedString(annualMileage)).append("\n");
    sb.append("    primaryDriverId: ").append(toIndentedString(primaryDriverId)).append("\n");
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

