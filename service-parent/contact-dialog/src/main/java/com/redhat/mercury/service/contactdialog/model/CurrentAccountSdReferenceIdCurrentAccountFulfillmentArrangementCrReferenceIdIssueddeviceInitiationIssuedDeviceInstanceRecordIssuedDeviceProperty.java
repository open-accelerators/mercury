package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDeviceProperty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDeviceProperty   {
  @JsonProperty("issuedDevicePropertyType")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType issuedDevicePropertyType;

  @JsonProperty("issuedDeviceStatus")
  private String issuedDeviceStatus;

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDeviceProperty issuedDevicePropertyType(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType issuedDevicePropertyType) {
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

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDeviceProperty issuedDeviceStatus(String issuedDeviceStatus) {
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
    CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDeviceProperty currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDeviceProperty = (CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDeviceProperty) o;
    return Objects.equals(this.issuedDevicePropertyType, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDeviceProperty.issuedDevicePropertyType) &&
        Objects.equals(this.issuedDeviceStatus, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDeviceProperty.issuedDeviceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDevicePropertyType, issuedDeviceStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDeviceProperty {\n");
    
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

