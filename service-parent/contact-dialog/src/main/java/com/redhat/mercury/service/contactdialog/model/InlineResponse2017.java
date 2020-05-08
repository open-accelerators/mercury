package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2017CurrentAccountFulfillmentArrangementInstanceRecord;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2017IssuedDeviceInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2017
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class InlineResponse2017   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceRecord")
  private InlineResponse2017CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord;

  @JsonProperty("issuedDeviceInstanceReference")
  private String issuedDeviceInstanceReference;

  @JsonProperty("issuedDeviceInitiateActionReference")
  private String issuedDeviceInitiateActionReference;

  @JsonProperty("issuedDeviceInitiateActionRecord")
  private Object issuedDeviceInitiateActionRecord;

  @JsonProperty("issuedDeviceInstanceStatus")
  private String issuedDeviceInstanceStatus;

  @JsonProperty("issuedDeviceInstanceRecord")
  private InlineResponse2017IssuedDeviceInstanceRecord issuedDeviceInstanceRecord;

  public InlineResponse2017 currentAccountFulfillmentArrangementInstanceRecord(InlineResponse2017CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
    return this;
  }

  /**
   * Get currentAccountFulfillmentArrangementInstanceRecord
   * @return currentAccountFulfillmentArrangementInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2017CurrentAccountFulfillmentArrangementInstanceRecord getCurrentAccountFulfillmentArrangementInstanceRecord() {
    return currentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceRecord(InlineResponse2017CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
  }

  public InlineResponse2017 issuedDeviceInstanceReference(String issuedDeviceInstanceReference) {
    this.issuedDeviceInstanceReference = issuedDeviceInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issued Device instance 
   * @return issuedDeviceInstanceReference
  */
  @ApiModelProperty(example = "IDIR761167", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issued Device instance ")


  public String getIssuedDeviceInstanceReference() {
    return issuedDeviceInstanceReference;
  }

  public void setIssuedDeviceInstanceReference(String issuedDeviceInstanceReference) {
    this.issuedDeviceInstanceReference = issuedDeviceInstanceReference;
  }

  public InlineResponse2017 issuedDeviceInitiateActionReference(String issuedDeviceInitiateActionReference) {
    this.issuedDeviceInitiateActionReference = issuedDeviceInitiateActionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return issuedDeviceInitiateActionReference
  */
  @ApiModelProperty(example = "IDIAR795368", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call ")


  public String getIssuedDeviceInitiateActionReference() {
    return issuedDeviceInitiateActionReference;
  }

  public void setIssuedDeviceInitiateActionReference(String issuedDeviceInitiateActionReference) {
    this.issuedDeviceInitiateActionReference = issuedDeviceInitiateActionReference;
  }

  public InlineResponse2017 issuedDeviceInitiateActionRecord(Object issuedDeviceInitiateActionRecord) {
    this.issuedDeviceInitiateActionRecord = issuedDeviceInitiateActionRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return issuedDeviceInitiateActionRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record ")

  @Valid

  public Object getIssuedDeviceInitiateActionRecord() {
    return issuedDeviceInitiateActionRecord;
  }

  public void setIssuedDeviceInitiateActionRecord(Object issuedDeviceInitiateActionRecord) {
    this.issuedDeviceInitiateActionRecord = issuedDeviceInitiateActionRecord;
  }

  public InlineResponse2017 issuedDeviceInstanceStatus(String issuedDeviceInstanceStatus) {
    this.issuedDeviceInstanceStatus = issuedDeviceInstanceStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Issued Device instance (e.g. initialised, pending, active) 
   * @return issuedDeviceInstanceStatus
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Issued Device instance (e.g. initialised, pending, active) ")


  public String getIssuedDeviceInstanceStatus() {
    return issuedDeviceInstanceStatus;
  }

  public void setIssuedDeviceInstanceStatus(String issuedDeviceInstanceStatus) {
    this.issuedDeviceInstanceStatus = issuedDeviceInstanceStatus;
  }

  public InlineResponse2017 issuedDeviceInstanceRecord(InlineResponse2017IssuedDeviceInstanceRecord issuedDeviceInstanceRecord) {
    this.issuedDeviceInstanceRecord = issuedDeviceInstanceRecord;
    return this;
  }

  /**
   * Get issuedDeviceInstanceRecord
   * @return issuedDeviceInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2017IssuedDeviceInstanceRecord getIssuedDeviceInstanceRecord() {
    return issuedDeviceInstanceRecord;
  }

  public void setIssuedDeviceInstanceRecord(InlineResponse2017IssuedDeviceInstanceRecord issuedDeviceInstanceRecord) {
    this.issuedDeviceInstanceRecord = issuedDeviceInstanceRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2017 inlineResponse2017 = (InlineResponse2017) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceRecord, inlineResponse2017.currentAccountFulfillmentArrangementInstanceRecord) &&
        Objects.equals(this.issuedDeviceInstanceReference, inlineResponse2017.issuedDeviceInstanceReference) &&
        Objects.equals(this.issuedDeviceInitiateActionReference, inlineResponse2017.issuedDeviceInitiateActionReference) &&
        Objects.equals(this.issuedDeviceInitiateActionRecord, inlineResponse2017.issuedDeviceInitiateActionRecord) &&
        Objects.equals(this.issuedDeviceInstanceStatus, inlineResponse2017.issuedDeviceInstanceStatus) &&
        Objects.equals(this.issuedDeviceInstanceRecord, inlineResponse2017.issuedDeviceInstanceRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceRecord, issuedDeviceInstanceReference, issuedDeviceInitiateActionReference, issuedDeviceInitiateActionRecord, issuedDeviceInstanceStatus, issuedDeviceInstanceRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2017 {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceRecord)).append("\n");
    sb.append("    issuedDeviceInstanceReference: ").append(toIndentedString(issuedDeviceInstanceReference)).append("\n");
    sb.append("    issuedDeviceInitiateActionReference: ").append(toIndentedString(issuedDeviceInitiateActionReference)).append("\n");
    sb.append("    issuedDeviceInitiateActionRecord: ").append(toIndentedString(issuedDeviceInitiateActionRecord)).append("\n");
    sb.append("    issuedDeviceInstanceStatus: ").append(toIndentedString(issuedDeviceInstanceStatus)).append("\n");
    sb.append("    issuedDeviceInstanceRecord: ").append(toIndentedString(issuedDeviceInstanceRecord)).append("\n");
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

