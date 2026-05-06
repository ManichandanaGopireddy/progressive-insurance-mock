package com.insurance.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * QuoteSessionStartRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-24T16:33:52.752984700-04:00[America/New_York]", comments = "Generator version: 7.4.0")
public class QuoteSessionStartRequest {

  private String firstName;

  private String lastName;

  private String middleInitial;

  private String suffix;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateOfBirth;

  private String email;

  private String street;

  private String aptUnit;

  private String city;

  private String state;

  private String zipCode;

  private Boolean poBox = false;

  public QuoteSessionStartRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QuoteSessionStartRequest(String firstName, String lastName, LocalDate dateOfBirth, String email, String street, String city, String state, String zipCode) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
    this.email = email;
    this.street = street;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
  }

  public QuoteSessionStartRequest firstName(String firstName) {
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

  public QuoteSessionStartRequest lastName(String lastName) {
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

  public QuoteSessionStartRequest middleInitial(String middleInitial) {
    this.middleInitial = middleInitial;
    return this;
  }

  /**
   * Get middleInitial
   * @return middleInitial
  */
  @Size(max = 1) 
  @Schema(name = "middleInitial", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("middleInitial")
  public String getMiddleInitial() {
    return middleInitial;
  }

  public void setMiddleInitial(String middleInitial) {
    this.middleInitial = middleInitial;
  }

  public QuoteSessionStartRequest suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  /**
   * Get suffix
   * @return suffix
  */
  @Size(max = 10) 
  @Schema(name = "suffix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suffix")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public QuoteSessionStartRequest dateOfBirth(LocalDate dateOfBirth) {
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

  public QuoteSessionStartRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @NotNull @jakarta.validation.constraints.Email 
  @Schema(name = "email", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public QuoteSessionStartRequest street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Get street
   * @return street
  */
  @NotNull @Size(max = 200) 
  @Schema(name = "street", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public QuoteSessionStartRequest aptUnit(String aptUnit) {
    this.aptUnit = aptUnit;
    return this;
  }

  /**
   * Get aptUnit
   * @return aptUnit
  */
  @Size(max = 50) 
  @Schema(name = "aptUnit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aptUnit")
  public String getAptUnit() {
    return aptUnit;
  }

  public void setAptUnit(String aptUnit) {
    this.aptUnit = aptUnit;
  }

  public QuoteSessionStartRequest city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  @NotNull @Size(max = 100) 
  @Schema(name = "city", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public QuoteSessionStartRequest state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @NotNull @Size(min = 2, max = 2) 
  @Schema(name = "state", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public QuoteSessionStartRequest zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Get zipCode
   * @return zipCode
  */
  @NotNull 
  @Schema(name = "zipCode", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("zipCode")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public QuoteSessionStartRequest poBox(Boolean poBox) {
    this.poBox = poBox;
    return this;
  }

  /**
   * Get poBox
   * @return poBox
  */
  
  @Schema(name = "poBox", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("poBox")
  public Boolean getPoBox() {
    return poBox;
  }

  public void setPoBox(Boolean poBox) {
    this.poBox = poBox;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteSessionStartRequest quoteSessionStartRequest = (QuoteSessionStartRequest) o;
    return Objects.equals(this.firstName, quoteSessionStartRequest.firstName) &&
        Objects.equals(this.lastName, quoteSessionStartRequest.lastName) &&
        Objects.equals(this.middleInitial, quoteSessionStartRequest.middleInitial) &&
        Objects.equals(this.suffix, quoteSessionStartRequest.suffix) &&
        Objects.equals(this.dateOfBirth, quoteSessionStartRequest.dateOfBirth) &&
        Objects.equals(this.email, quoteSessionStartRequest.email) &&
        Objects.equals(this.street, quoteSessionStartRequest.street) &&
        Objects.equals(this.aptUnit, quoteSessionStartRequest.aptUnit) &&
        Objects.equals(this.city, quoteSessionStartRequest.city) &&
        Objects.equals(this.state, quoteSessionStartRequest.state) &&
        Objects.equals(this.zipCode, quoteSessionStartRequest.zipCode) &&
        Objects.equals(this.poBox, quoteSessionStartRequest.poBox);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, middleInitial, suffix, dateOfBirth, email, street, aptUnit, city, state, zipCode, poBox);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteSessionStartRequest {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleInitial: ").append(toIndentedString(middleInitial)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    aptUnit: ").append(toIndentedString(aptUnit)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    poBox: ").append(toIndentedString(poBox)).append("\n");
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

