package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDeviceProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2017IssuedDeviceInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class InlineResponse2017IssuedDeviceInstanceRecord   {
  @JsonProperty("issuedDeviceDescription")
  private String issuedDeviceDescription;

  @JsonProperty("issuedDeviceOptionDefinition")
  private String issuedDeviceOptionDefinition;

  @JsonProperty("issuedDeviceOptionSetting")
  private String issuedDeviceOptionSetting;

  @JsonProperty("issuedDeviceProperty")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDeviceProperty issuedDeviceProperty;

  public InlineResponse2017IssuedDeviceInstanceRecord issuedDeviceDescription(String issuedDeviceDescription) {
    this.issuedDeviceDescription = issuedDeviceDescription;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the inventory item, including processing and handling guidelines and rules 
   * @return issuedDeviceDescription
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the inventory item, including processing and handling guidelines and rules ")


  public String getIssuedDeviceDescription() {
    return issuedDeviceDescription;
  }

  public void setIssuedDeviceDescription(String issuedDeviceDescription) {
    this.issuedDeviceDescription = issuedDeviceDescription;
  }

  public InlineResponse2017IssuedDeviceInstanceRecord issuedDeviceOptionDefinition(String issuedDeviceOptionDefinition) {
    this.issuedDeviceOptionDefinition = issuedDeviceOptionDefinition;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the processing option and impact (e.g. lost check handling) 
   * @return issuedDeviceOptionDefinition
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the processing option and impact (e.g. lost check handling) ")


  public String getIssuedDeviceOptionDefinition() {
    return issuedDeviceOptionDefinition;
  }

  public void setIssuedDeviceOptionDefinition(String issuedDeviceOptionDefinition) {
    this.issuedDeviceOptionDefinition = issuedDeviceOptionDefinition;
  }

  public InlineResponse2017IssuedDeviceInstanceRecord issuedDeviceOptionSetting(String issuedDeviceOptionSetting) {
    this.issuedDeviceOptionSetting = issuedDeviceOptionSetting;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The processing option setting  
   * @return issuedDeviceOptionSetting
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The processing option setting  ")


  public String getIssuedDeviceOptionSetting() {
    return issuedDeviceOptionSetting;
  }

  public void setIssuedDeviceOptionSetting(String issuedDeviceOptionSetting) {
    this.issuedDeviceOptionSetting = issuedDeviceOptionSetting;
  }

  public InlineResponse2017IssuedDeviceInstanceRecord issuedDeviceProperty(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDeviceProperty issuedDeviceProperty) {
    this.issuedDeviceProperty = issuedDeviceProperty;
    return this;
  }

  /**
   * Get issuedDeviceProperty
   * @return issuedDeviceProperty
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDeviceProperty getIssuedDeviceProperty() {
    return issuedDeviceProperty;
  }

  public void setIssuedDeviceProperty(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecordIssuedDeviceProperty issuedDeviceProperty) {
    this.issuedDeviceProperty = issuedDeviceProperty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2017IssuedDeviceInstanceRecord inlineResponse2017IssuedDeviceInstanceRecord = (InlineResponse2017IssuedDeviceInstanceRecord) o;
    return Objects.equals(this.issuedDeviceDescription, inlineResponse2017IssuedDeviceInstanceRecord.issuedDeviceDescription) &&
        Objects.equals(this.issuedDeviceOptionDefinition, inlineResponse2017IssuedDeviceInstanceRecord.issuedDeviceOptionDefinition) &&
        Objects.equals(this.issuedDeviceOptionSetting, inlineResponse2017IssuedDeviceInstanceRecord.issuedDeviceOptionSetting) &&
        Objects.equals(this.issuedDeviceProperty, inlineResponse2017IssuedDeviceInstanceRecord.issuedDeviceProperty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceDescription, issuedDeviceOptionDefinition, issuedDeviceOptionSetting, issuedDeviceProperty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2017IssuedDeviceInstanceRecord {\n");
    
    sb.append("    issuedDeviceDescription: ").append(toIndentedString(issuedDeviceDescription)).append("\n");
    sb.append("    issuedDeviceOptionDefinition: ").append(toIndentedString(issuedDeviceOptionDefinition)).append("\n");
    sb.append("    issuedDeviceOptionSetting: ").append(toIndentedString(issuedDeviceOptionSetting)).append("\n");
    sb.append("    issuedDeviceProperty: ").append(toIndentedString(issuedDeviceProperty)).append("\n");
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

