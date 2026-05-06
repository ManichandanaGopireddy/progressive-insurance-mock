package com.insurance.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
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
 * DriverResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-24T16:33:52.752984700-04:00[America/New_York]", comments = "Generator version: 7.4.0")
public class DriverResponse {

  private UUID driverId;

  private UUID quoteReferenceId;

  private String firstName;

  private String lastName;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateOfBirth;

  private String gender;

  private String maritalStatus;

  private String primaryResidence;

  private String licenseType;

  private String licenseStatus;

  private String licenseNumber;

  private String yearsLicensed;

  private Boolean defensiveCourse;

  private Boolean accidents;

  private Boolean violations;

  private Boolean sr22Required;

  private Integer numberOfAccidents;

  private Integer activeTickets;

  private String ssnMasked;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  public DriverResponse driverId(UUID driverId) {
    this.driverId = driverId;
    return this;
  }

  /**
   * Get driverId
   * @return driverId
  */
  @Valid 
  @Schema(name = "driverId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("driverId")
  public UUID getDriverId() {
    return driverId;
  }

  public void setDriverId(UUID driverId) {
    this.driverId = driverId;
  }

  public DriverResponse quoteReferenceId(UUID quoteReferenceId) {
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

  public DriverResponse firstName(String firstName) {
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

  public DriverResponse lastName(String lastName) {
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

  public DriverResponse dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  */
  @Valid 
  @Schema(name = "dateOfBirth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateOfBirth")
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public DriverResponse gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public DriverResponse maritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Get maritalStatus
   * @return maritalStatus
  */
  
  @Schema(name = "maritalStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maritalStatus")
  public String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public DriverResponse primaryResidence(String primaryResidence) {
    this.primaryResidence = primaryResidence;
    return this;
  }

  /**
   * Get primaryResidence
   * @return primaryResidence
  */
  
  @Schema(name = "primaryResidence", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primaryResidence")
  public String getPrimaryResidence() {
    return primaryResidence;
  }

  public void setPrimaryResidence(String primaryResidence) {
    this.primaryResidence = primaryResidence;
  }

  public DriverResponse licenseType(String licenseType) {
    this.licenseType = licenseType;
    return this;
  }

  /**
   * Get licenseType
   * @return licenseType
  */
  
  @Schema(name = "licenseType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("licenseType")
  public String getLicenseType() {
    return licenseType;
  }

  public void setLicenseType(String licenseType) {
    this.licenseType = licenseType;
  }

  public DriverResponse licenseStatus(String licenseStatus) {
    this.licenseStatus = licenseStatus;
    return this;
  }

  /**
   * Get licenseStatus
   * @return licenseStatus
  */
  
  @Schema(name = "licenseStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("licenseStatus")
  public String getLicenseStatus() {
    return licenseStatus;
  }

  public void setLicenseStatus(String licenseStatus) {
    this.licenseStatus = licenseStatus;
  }

  public DriverResponse licenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
    return this;
  }

  /**
   * Driver license number
   * @return licenseNumber
  */
  
  @Schema(name = "licenseNumber", description = "Driver license number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("licenseNumber")
  public String getLicenseNumber() {
    return licenseNumber;
  }

  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  public DriverResponse yearsLicensed(String yearsLicensed) {
    this.yearsLicensed = yearsLicensed;
    return this;
  }

  /**
   * Get yearsLicensed
   * @return yearsLicensed
  */
  
  @Schema(name = "yearsLicensed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yearsLicensed")
  public String getYearsLicensed() {
    return yearsLicensed;
  }

  public void setYearsLicensed(String yearsLicensed) {
    this.yearsLicensed = yearsLicensed;
  }

  public DriverResponse defensiveCourse(Boolean defensiveCourse) {
    this.defensiveCourse = defensiveCourse;
    return this;
  }

  /**
   * Get defensiveCourse
   * @return defensiveCourse
  */
  
  @Schema(name = "defensiveCourse", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defensiveCourse")
  public Boolean getDefensiveCourse() {
    return defensiveCourse;
  }

  public void setDefensiveCourse(Boolean defensiveCourse) {
    this.defensiveCourse = defensiveCourse;
  }

  public DriverResponse accidents(Boolean accidents) {
    this.accidents = accidents;
    return this;
  }

  /**
   * Get accidents
   * @return accidents
  */
  
  @Schema(name = "accidents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accidents")
  public Boolean getAccidents() {
    return accidents;
  }

  public void setAccidents(Boolean accidents) {
    this.accidents = accidents;
  }

  public DriverResponse violations(Boolean violations) {
    this.violations = violations;
    return this;
  }

  /**
   * Get violations
   * @return violations
  */
  
  @Schema(name = "violations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("violations")
  public Boolean getViolations() {
    return violations;
  }

  public void setViolations(Boolean violations) {
    this.violations = violations;
  }

  public DriverResponse sr22Required(Boolean sr22Required) {
    this.sr22Required = sr22Required;
    return this;
  }

  /**
   * Get sr22Required
   * @return sr22Required
  */
  
  @Schema(name = "sr22Required", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sr22Required")
  public Boolean getSr22Required() {
    return sr22Required;
  }

  public void setSr22Required(Boolean sr22Required) {
    this.sr22Required = sr22Required;
  }

  public DriverResponse numberOfAccidents(Integer numberOfAccidents) {
    this.numberOfAccidents = numberOfAccidents;
    return this;
  }

  /**
   * Get numberOfAccidents
   * @return numberOfAccidents
  */
  
  @Schema(name = "numberOfAccidents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfAccidents")
  public Integer getNumberOfAccidents() {
    return numberOfAccidents;
  }

  public void setNumberOfAccidents(Integer numberOfAccidents) {
    this.numberOfAccidents = numberOfAccidents;
  }

  public DriverResponse activeTickets(Integer activeTickets) {
    this.activeTickets = activeTickets;
    return this;
  }

  /**
   * Get activeTickets
   * @return activeTickets
  */
  
  @Schema(name = "activeTickets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activeTickets")
  public Integer getActiveTickets() {
    return activeTickets;
  }

  public void setActiveTickets(Integer activeTickets) {
    this.activeTickets = activeTickets;
  }

  public DriverResponse ssnMasked(String ssnMasked) {
    this.ssnMasked = ssnMasked;
    return this;
  }

  /**
   * Get ssnMasked
   * @return ssnMasked
  */
  
  @Schema(name = "ssnMasked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ssnMasked")
  public String getSsnMasked() {
    return ssnMasked;
  }

  public void setSsnMasked(String ssnMasked) {
    this.ssnMasked = ssnMasked;
  }

  public DriverResponse createdAt(OffsetDateTime createdAt) {
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
    DriverResponse driverResponse = (DriverResponse) o;
    return Objects.equals(this.driverId, driverResponse.driverId) &&
        Objects.equals(this.quoteReferenceId, driverResponse.quoteReferenceId) &&
        Objects.equals(this.firstName, driverResponse.firstName) &&
        Objects.equals(this.lastName, driverResponse.lastName) &&
        Objects.equals(this.dateOfBirth, driverResponse.dateOfBirth) &&
        Objects.equals(this.gender, driverResponse.gender) &&
        Objects.equals(this.maritalStatus, driverResponse.maritalStatus) &&
        Objects.equals(this.primaryResidence, driverResponse.primaryResidence) &&
        Objects.equals(this.licenseType, driverResponse.licenseType) &&
        Objects.equals(this.licenseStatus, driverResponse.licenseStatus) &&
        Objects.equals(this.licenseNumber, driverResponse.licenseNumber) &&
        Objects.equals(this.yearsLicensed, driverResponse.yearsLicensed) &&
        Objects.equals(this.defensiveCourse, driverResponse.defensiveCourse) &&
        Objects.equals(this.accidents, driverResponse.accidents) &&
        Objects.equals(this.violations, driverResponse.violations) &&
        Objects.equals(this.sr22Required, driverResponse.sr22Required) &&
        Objects.equals(this.numberOfAccidents, driverResponse.numberOfAccidents) &&
        Objects.equals(this.activeTickets, driverResponse.activeTickets) &&
        Objects.equals(this.ssnMasked, driverResponse.ssnMasked) &&
        Objects.equals(this.createdAt, driverResponse.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverId, quoteReferenceId, firstName, lastName, dateOfBirth, gender, maritalStatus, primaryResidence, licenseType, licenseStatus, licenseNumber, yearsLicensed, defensiveCourse, accidents, violations, sr22Required, numberOfAccidents, activeTickets, ssnMasked, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverResponse {\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    quoteReferenceId: ").append(toIndentedString(quoteReferenceId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    primaryResidence: ").append(toIndentedString(primaryResidence)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    licenseStatus: ").append(toIndentedString(licenseStatus)).append("\n");
    sb.append("    licenseNumber: ").append(toIndentedString(licenseNumber)).append("\n");
    sb.append("    yearsLicensed: ").append(toIndentedString(yearsLicensed)).append("\n");
    sb.append("    defensiveCourse: ").append(toIndentedString(defensiveCourse)).append("\n");
    sb.append("    accidents: ").append(toIndentedString(accidents)).append("\n");
    sb.append("    violations: ").append(toIndentedString(violations)).append("\n");
    sb.append("    sr22Required: ").append(toIndentedString(sr22Required)).append("\n");
    sb.append("    numberOfAccidents: ").append(toIndentedString(numberOfAccidents)).append("\n");
    sb.append("    activeTickets: ").append(toIndentedString(activeTickets)).append("\n");
    sb.append("    ssnMasked: ").append(toIndentedString(ssnMasked)).append("\n");
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

