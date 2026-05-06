package com.insurance.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CoverageSelectionRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-24T16:33:52.752984700-04:00[America/New_York]", comments = "Generator version: 7.4.0")
public class CoverageSelectionRequest {

  /**
   * Coverage tier selected by customer
   */
  public enum CoverageTierIdEnum {
    BASIC("BASIC"),
    
    CHOICE("CHOICE"),
    
    RECOMMENDED("RECOMMENDED");

    private String value;

    CoverageTierIdEnum(String value) {
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
    public static CoverageTierIdEnum fromValue(String value) {
      for (CoverageTierIdEnum b : CoverageTierIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CoverageTierIdEnum coverageTierId;

  /**
   * Deductible amount in dollars
   */
  public enum DeductibleAmountEnum {
    NUMBER_250(250),
    
    NUMBER_500(500),
    
    NUMBER_1000(1000),
    
    NUMBER_2000(2000);

    private Integer value;

    DeductibleAmountEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DeductibleAmountEnum fromValue(Integer value) {
      for (DeductibleAmountEnum b : DeductibleAmountEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DeductibleAmountEnum deductibleAmount;

  public CoverageSelectionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CoverageSelectionRequest(CoverageTierIdEnum coverageTierId, DeductibleAmountEnum deductibleAmount) {
    this.coverageTierId = coverageTierId;
    this.deductibleAmount = deductibleAmount;
  }

  public CoverageSelectionRequest coverageTierId(CoverageTierIdEnum coverageTierId) {
    this.coverageTierId = coverageTierId;
    return this;
  }

  /**
   * Coverage tier selected by customer
   * @return coverageTierId
  */
  @NotNull 
  @Schema(name = "coverageTierId", description = "Coverage tier selected by customer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("coverageTierId")
  public CoverageTierIdEnum getCoverageTierId() {
    return coverageTierId;
  }

  public void setCoverageTierId(CoverageTierIdEnum coverageTierId) {
    this.coverageTierId = coverageTierId;
  }

  public CoverageSelectionRequest deductibleAmount(DeductibleAmountEnum deductibleAmount) {
    this.deductibleAmount = deductibleAmount;
    return this;
  }

  /**
   * Deductible amount in dollars
   * @return deductibleAmount
  */
  @NotNull 
  @Schema(name = "deductibleAmount", description = "Deductible amount in dollars", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deductibleAmount")
  public DeductibleAmountEnum getDeductibleAmount() {
    return deductibleAmount;
  }

  public void setDeductibleAmount(DeductibleAmountEnum deductibleAmount) {
    this.deductibleAmount = deductibleAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoverageSelectionRequest coverageSelectionRequest = (CoverageSelectionRequest) o;
    return Objects.equals(this.coverageTierId, coverageSelectionRequest.coverageTierId) &&
        Objects.equals(this.deductibleAmount, coverageSelectionRequest.deductibleAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverageTierId, deductibleAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoverageSelectionRequest {\n");
    sb.append("    coverageTierId: ").append(toIndentedString(coverageTierId)).append("\n");
    sb.append("    deductibleAmount: ").append(toIndentedString(deductibleAmount)).append("\n");
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

