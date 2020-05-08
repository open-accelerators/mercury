package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class BQAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits   {
  @JsonProperty("positionLimitSettings")
  private String positionLimitSettings;

  @JsonProperty("positionLimitValue")
  private String positionLimitValue;

  public BQAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The position definition, associated limit settings and rules 
   * @return positionLimitSettings
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The position definition, associated limit settings and rules ")


  public String getPositionLimitSettings() {
    return positionLimitSettings;
  }

  public void setPositionLimitSettings(String positionLimitSettings) {
    this.positionLimitSettings = positionLimitSettings;
  }

  public BQAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current calculated position 
   * @return positionLimitValue
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current calculated position ")


  public String getPositionLimitValue() {
    return positionLimitValue;
  }

  public void setPositionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits bqAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits = (BQAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits) o;
    return Objects.equals(this.positionLimitSettings, bqAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits.positionLimitSettings) &&
        Objects.equals(this.positionLimitValue, bqAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits.positionLimitValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionLimitSettings, positionLimitValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits {\n");
    
    sb.append("    positionLimitSettings: ").append(toIndentedString(positionLimitSettings)).append("\n");
    sb.append("    positionLimitValue: ").append(toIndentedString(positionLimitValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

