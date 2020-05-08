package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDeviceProperty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDeviceProperty   {
  @JsonProperty("issuedDevicePropertyType")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType issuedDevicePropertyType;

  @JsonProperty("issuedDeviceStatus")
  private String issuedDeviceStatus;

  public BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDeviceProperty issuedDevicePropertyType(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType issuedDevicePropertyType) {
    this.issuedDevicePropertyType = issuedDevicePropertyType;
    return this;
  }

  /**
   * Get issuedDevicePropertyType
   * @return issuedDevicePropertyType
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType getIssuedDevicePropertyType() {
    return issuedDevicePropertyType;
  }

  public void setIssuedDevicePropertyType(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType issuedDevicePropertyType) {
    this.issuedDevicePropertyType = issuedDevicePropertyType;
  }

  public BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDeviceProperty issuedDeviceStatus(String issuedDeviceStatus) {
    this.issuedDeviceStatus = issuedDeviceStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The tracked status of the device/inventory item (e.g. active, suspended, cancelled) 
   * @return issuedDeviceStatus
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The tracked status of the device/inventory item (e.g. active, suspended, cancelled) ")


  public String getIssuedDeviceStatus() {
    return issuedDeviceStatus;
  }

  public void setIssuedDeviceStatus(String issuedDeviceStatus) {
    this.issuedDeviceStatus = issuedDeviceStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDeviceProperty bqIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDeviceProperty = (BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDeviceProperty) o;
    return Objects.equals(this.issuedDevicePropertyType, bqIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDeviceProperty.issuedDevicePropertyType) &&
        Objects.equals(this.issuedDeviceStatus, bqIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDeviceProperty.issuedDeviceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDevicePropertyType, issuedDeviceStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDeviceProperty {\n");
    
    sb.append("    issuedDevicePropertyType: ").append(toIndentedString(issuedDevicePropertyType)).append("\n");
    sb.append("    issuedDeviceStatus: ").append(toIndentedString(issuedDeviceStatus)).append("\n");
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

