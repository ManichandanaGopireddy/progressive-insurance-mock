package com.insurance.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DriverRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-24T16:33:52.752984700-04:00[America/New_York]", comments = "Generator version: 7.4.0")
public class DriverRequest {

  private String firstName;

  private String lastName;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateOfBirth;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE");

    private String value;

    GenderEnum(String value) {
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
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private GenderEnum gender;

  /**
   * Gets or Sets maritalStatus
   */
  public enum MaritalStatusEnum {
    SINGLE("SINGLE"),
    
    MARRIED("MARRIED"),
    
    DOMESTIC_PARTNER("DOMESTIC_PARTNER"),
    
    WIDOWED("WIDOWED"),
    
    SEPARATED("SEPARATED"),
    
    DIVORCED("DIVORCED");

    private String value;

    MaritalStatusEnum(String value) {
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
    public static MaritalStatusEnum fromValue(String value) {
      for (MaritalStatusEnum b : MaritalStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private MaritalStatusEnum maritalStatus;

  private String ssn;

  private String licenseNumber;

  /**
   * Gets or Sets primaryResidence
   */
  public enum PrimaryResidenceEnum {
    OWN("OWN"),
    
    RENT("RENT"),
    
    LIVES_WITH_PARENTS("LIVES_WITH_PARENTS"),
    
    OTHER("OTHER");

    private String value;

    PrimaryResidenceEnum(String value) {
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
    public static PrimaryResidenceEnum fromValue(String value) {
      for (PrimaryResidenceEnum b : PrimaryResidenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PrimaryResidenceEnum primaryResidence;

  /**
   * Gets or Sets licenseType
   */
  public enum LicenseTypeEnum {
    PERSONAL("PERSONAL"),
    
    COMMERCIAL("COMMERCIAL"),
    
    INTERNATIONAL("INTERNATIONAL"),
    
    PERMIT("PERMIT"),
    
    NONE("NONE");

    private String value;

    LicenseTypeEnum(String value) {
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
    public static LicenseTypeEnum fromValue(String value) {
      for (LicenseTypeEnum b : LicenseTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private LicenseTypeEnum licenseType;

  /**
   * Gets or Sets licenseStatus
   */
  public enum LicenseStatusEnum {
    VALID("VALID"),
    
    EXPIRED("EXPIRED"),
    
    SUSPENDED("SUSPENDED"),
    
    REVOKED("REVOKED"),
    
    SURRENDERED("SURRENDERED"),
    
    NEVER_LICENSED("NEVER_LICENSED");

    private String value;

    LicenseStatusEnum(String value) {
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
    public static LicenseStatusEnum fromValue(String value) {
      for (LicenseStatusEnum b : LicenseStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private LicenseStatusEnum licenseStatus;

  /**
   * Gets or Sets yearsLicensed
   */
  public enum YearsLicensedEnum {
    LESS_THAN_1("LESS_THAN_1"),
    
    ONE_TO_2("ONE_TO_2"),
    
    TWO_TO_3("TWO_TO_3"),
    
    THREE_OR_MORE("THREE_OR_MORE");

    private String value;

    YearsLicensedEnum(String value) {
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
    public static YearsLicensedEnum fromValue(String value) {
      for (YearsLicensedEnum b : YearsLicensedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private YearsLicensedEnum yearsLicensed;

  private Boolean defensiveCourse;

  private Boolean accidents;

  private Boolean violations;

  private Boolean sr22Required;

  private Integer numberOfAccidents;

  private Integer activeTickets;

  public DriverRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DriverRequest(String firstName, String lastName, LocalDate dateOfBirth, GenderEnum gender, MaritalStatusEnum maritalStatus, PrimaryResidenceEnum primaryResidence, LicenseTypeEnum licenseType, LicenseStatusEnum licenseStatus, YearsLicensedEnum yearsLicensed, Boolean defensiveCourse, Boolean accidents, Boolean violations, Boolean sr22Required) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
    this.maritalStatus = maritalStatus;
    this.primaryResidence = primaryResidence;
    this.licenseType = licenseType;
    this.licenseStatus = licenseStatus;
    this.yearsLicensed = yearsLicensed;
    this.defensiveCourse = defensiveCourse;
    this.accidents = accidents;
    this.violations = violations;
    this.sr22Required = sr22Required;
  }

  public DriverRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @NotNull @Size(max = 100) 
  @Schema(name = "firstName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public DriverRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @NotNull @Size(max = 100) 
  @Schema(name = "lastName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public DriverRequest dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  */
  @NotNull @Valid 
  @Schema(name = "dateOfBirth", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dateOfBirth")
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public DriverRequest gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @NotNull 
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("gender")
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public DriverRequest maritalStatus(MaritalStatusEnum maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Get maritalStatus
   * @return maritalStatus
  */
  @NotNull 
  @Schema(name = "maritalStatus", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("maritalStatus")
  public MaritalStatusEnum getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(MaritalStatusEnum maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public DriverRequest ssn(String ssn) {
    this.ssn = ssn;
    return this;
  }

  /**
   * Get ssn
   * @return ssn
  */
  
  @Schema(name = "ssn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ssn")
  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public DriverRequest licenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
    return this;
  }

  /**
   * Driver license number. First character used for CLUE verification.
   * @return licenseNumber
  */
  @Size(max = 20) 
  @Schema(name = "licenseNumber", description = "Driver license number. First character used for CLUE verification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("licenseNumber")
  public String getLicenseNumber() {
    return licenseNumber;
  }

  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  public DriverRequest primaryResidence(PrimaryResidenceEnum primaryResidence) {
    this.primaryResidence = primaryResidence;
    return this;
  }

  /**
   * Get primaryResidence
   * @return primaryResidence
  */
  @NotNull 
  @Schema(name = "primaryResidence", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("primaryResidence")
  public PrimaryResidenceEnum getPrimaryResidence() {
    return primaryResidence;
  }

  public void setPrimaryResidence(PrimaryResidenceEnum primaryResidence) {
    this.primaryResidence = primaryResidence;
  }

  public DriverRequest licenseType(LicenseTypeEnum licenseType) {
    this.licenseType = licenseType;
    return this;
  }

  /**
   * Get licenseType
   * @return licenseType
  */
  @NotNull 
  @Schema(name = "licenseType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("licenseType")
  public LicenseTypeEnum getLicenseType() {
    return licenseType;
  }

  public void setLicenseType(LicenseTypeEnum licenseType) {
    this.licenseType = licenseType;
  }

  public DriverRequest licenseStatus(LicenseStatusEnum licenseStatus) {
    this.licenseStatus = licenseStatus;
    return this;
  }

  /**
   * Get licenseStatus
   * @return licenseStatus
  */
  @NotNull 
  @Schema(name = "licenseStatus", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("licenseStatus")
  public LicenseStatusEnum getLicenseStatus() {
    return licenseStatus;
  }

  public void setLicenseStatus(LicenseStatusEnum licenseStatus) {
    this.licenseStatus = licenseStatus;
  }

  public DriverRequest yearsLicensed(YearsLicensedEnum yearsLicensed) {
    this.yearsLicensed = yearsLicensed;
    return this;
  }

  /**
   * Get yearsLicensed
   * @return yearsLicensed
  */
  @NotNull 
  @Schema(name = "yearsLicensed", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("yearsLicensed")
  public YearsLicensedEnum getYearsLicensed() {
    return yearsLicensed;
  }

  public void setYearsLicensed(YearsLicensedEnum yearsLicensed) {
    this.yearsLicensed = yearsLicensed;
  }

  public DriverRequest defensiveCourse(Boolean defensiveCourse) {
    this.defensiveCourse = defensiveCourse;
    return this;
  }

  /**
   * Get defensiveCourse
   * @return defensiveCourse
  */
  @NotNull 
  @Schema(name = "defensiveCourse", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("defensiveCourse")
  public Boolean getDefensiveCourse() {
    return defensiveCourse;
  }

  public void setDefensiveCourse(Boolean defensiveCourse) {
    this.defensiveCourse = defensiveCourse;
  }

  public DriverRequest accidents(Boolean accidents) {
    this.accidents = accidents;
    return this;
  }

  /**
   * Get accidents
   * @return accidents
  */
  @NotNull 
  @Schema(name = "accidents", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accidents")
  public Boolean getAccidents() {
    return accidents;
  }

  public void setAccidents(Boolean accidents) {
    this.accidents = accidents;
  }

  public DriverRequest violations(Boolean violations) {
    this.violations = violations;
    return this;
  }

  /**
   * Get violations
   * @return violations
  */
  @NotNull 
  @Schema(name = "violations", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("violations")
  public Boolean getViolations() {
    return violations;
  }

  public void setViolations(Boolean violations) {
    this.violations = violations;
  }

  public DriverRequest sr22Required(Boolean sr22Required) {
    this.sr22Required = sr22Required;
    return this;
  }

  /**
   * Get sr22Required
   * @return sr22Required
  */
  @NotNull 
  @Schema(name = "sr22Required", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sr22Required")
  public Boolean getSr22Required() {
    return sr22Required;
  }

  public void setSr22Required(Boolean sr22Required) {
    this.sr22Required = sr22Required;
  }

  public DriverRequest numberOfAccidents(Integer numberOfAccidents) {
    this.numberOfAccidents = numberOfAccidents;
    return this;
  }

  /**
   * Total number of at-fault accidents in last 5 years
   * minimum: 0
   * @return numberOfAccidents
  */
  @Min(0) 
  @Schema(name = "numberOfAccidents", description = "Total number of at-fault accidents in last 5 years", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfAccidents")
  public Integer getNumberOfAccidents() {
    return numberOfAccidents;
  }

  public void setNumberOfAccidents(Integer numberOfAccidents) {
    this.numberOfAccidents = numberOfAccidents;
  }

  public DriverRequest activeTickets(Integer activeTickets) {
    this.activeTickets = activeTickets;
    return this;
  }

  /**
   * Number of active moving violations or tickets
   * minimum: 0
   * @return activeTickets
  */
  @Min(0) 
  @Schema(name = "activeTickets", description = "Number of active moving violations or tickets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activeTickets")
  public Integer getActiveTickets() {
    return activeTickets;
  }

  public void setActiveTickets(Integer activeTickets) {
    this.activeTickets = activeTickets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverRequest driverRequest = (DriverRequest) o;
    return Objects.equals(this.firstName, driverRequest.firstName) &&
        Objects.equals(this.lastName, driverRequest.lastName) &&
        Objects.equals(this.dateOfBirth, driverRequest.dateOfBirth) &&
        Objects.equals(this.gender, driverRequest.gender) &&
        Objects.equals(this.maritalStatus, driverRequest.maritalStatus) &&
        Objects.equals(this.ssn, driverRequest.ssn) &&
        Objects.equals(this.licenseNumber, driverRequest.licenseNumber) &&
        Objects.equals(this.primaryResidence, driverRequest.primaryResidence) &&
        Objects.equals(this.licenseType, driverRequest.licenseType) &&
        Objects.equals(this.licenseStatus, driverRequest.licenseStatus) &&
        Objects.equals(this.yearsLicensed, driverRequest.yearsLicensed) &&
        Objects.equals(this.defensiveCourse, driverRequest.defensiveCourse) &&
        Objects.equals(this.accidents, driverRequest.accidents) &&
        Objects.equals(this.violations, driverRequest.violations) &&
        Objects.equals(this.sr22Required, driverRequest.sr22Required) &&
        Objects.equals(this.numberOfAccidents, driverRequest.numberOfAccidents) &&
        Objects.equals(this.activeTickets, driverRequest.activeTickets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, dateOfBirth, gender, maritalStatus, ssn, licenseNumber, primaryResidence, licenseType, licenseStatus, yearsLicensed, defensiveCourse, accidents, violations, sr22Required, numberOfAccidents, activeTickets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverRequest {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    licenseNumber: ").append(toIndentedString(licenseNumber)).append("\n");
    sb.append("    primaryResidence: ").append(toIndentedString(primaryResidence)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    licenseStatus: ").append(toIndentedString(licenseStatus)).append("\n");
    sb.append("    yearsLicensed: ").append(toIndentedString(yearsLicensed)).append("\n");
    sb.append("    defensiveCourse: ").append(toIndentedString(defensiveCourse)).append("\n");
    sb.append("    accidents: ").append(toIndentedString(accidents)).append("\n");
    sb.append("    violations: ").append(toIndentedString(violations)).append("\n");
    sb.append("    sr22Required: ").append(toIndentedString(sr22Required)).append("\n");
    sb.append("    numberOfAccidents: ").append(toIndentedString(numberOfAccidents)).append("\n");
    sb.append("    activeTickets: ").append(toIndentedString(activeTickets)).append("\n");
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

