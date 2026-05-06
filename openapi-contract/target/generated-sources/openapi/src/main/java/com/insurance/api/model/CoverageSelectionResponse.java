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
 * CoverageSelectionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-24T16:33:52.752984700-04:00[America/New_York]", comments = "Generator version: 7.4.0")
public class CoverageSelectionResponse {

  private UUID quoteReferenceId;

  /**
   * Gets or Sets coverageTierId
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

  private Integer deductibleAmount;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime savedAt;

  public CoverageSelectionResponse quoteReferenceId(UUID quoteReferenceId) {
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

  public CoverageSelectionResponse coverageTierId(CoverageTierIdEnum coverageTierId) {
    this.coverageTierId = coverageTierId;
    return this;
  }

  /**
   * Get coverageTierId
   * @return coverageTierId
  */
  
  @Schema(name = "coverageTierId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("coverageTierId")
  public CoverageTierIdEnum getCoverageTierId() {
    return coverageTierId;
  }

  public void setCoverageTierId(CoverageTierIdEnum coverageTierId) {
    this.coverageTierId = coverageTierId;
  }

  public CoverageSelectionResponse deductibleAmount(Integer deductibleAmount) {
    this.deductibleAmount = deductibleAmount;
    return this;
  }

  /**
   * Get deductibleAmount
   * @return deductibleAmount
  */
  
  @Schema(name = "deductibleAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deductibleAmount")
  public Integer getDeductibleAmount() {
    return deductibleAmount;
  }

  public void setDeductibleAmount(Integer deductibleAmount) {
    this.deductibleAmount = deductibleAmount;
  }

  public CoverageSelectionResponse savedAt(OffsetDateTime savedAt) {
    this.savedAt = savedAt;
    return this;
  }

  /**
   * Get savedAt
   * @return savedAt
  */
  @Valid 
  @Schema(name = "savedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("savedAt")
  public OffsetDateTime getSavedAt() {
    return savedAt;
  }

  public void setSavedAt(OffsetDateTime savedAt) {
    this.savedAt = savedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoverageSelectionResponse coverageSelectionResponse = (CoverageSelectionResponse) o;
    return Objects.equals(this.quoteReferenceId, coverageSelectionResponse.quoteReferenceId) &&
        Objects.equals(this.coverageTierId, coverageSelectionResponse.coverageTierId) &&
        Objects.equals(this.deductibleAmount, coverageSelectionResponse.deductibleAmount) &&
        Objects.equals(this.savedAt, coverageSelectionResponse.savedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteReferenceId, coverageTierId, deductibleAmount, savedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoverageSelectionResponse {\n");
    sb.append("    quoteReferenceId: ").append(toIndentedString(quoteReferenceId)).append("\n");
    sb.append("    coverageTierId: ").append(toIndentedString(coverageTierId)).append("\n");
    sb.append("    deductibleAmount: ").append(toIndentedString(deductibleAmount)).append("\n");
    sb.append("    savedAt: ").append(toIndentedString(savedAt)).append("\n");
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

