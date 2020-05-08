package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject3
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class InlineObject3   {
  @JsonProperty("currentAccountServicingSessionReference")
  private String currentAccountServicingSessionReference;

  @JsonProperty("currentAccountFulfillmentArrangementInitiateActionRecord")
  private Object currentAccountFulfillmentArrangementInitiateActionRecord;

  @JsonProperty("currentAccountFulfillmentArrangementInstanceStatus")
  private String currentAccountFulfillmentArrangementInstanceStatus;

  @JsonProperty("currentAccountFulfillmentArrangementInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord;

  public InlineObject3 currentAccountServicingSessionReference(String currentAccountServicingSessionReference) {
    this.currentAccountServicingSessionReference = currentAccountServicingSessionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return currentAccountServicingSessionReference
  */
  @ApiModelProperty(example = "CASSR739654", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session ")


  public String getCurrentAccountServicingSessionReference() {
    return currentAccountServicingSessionReference;
  }

  public void setCurrentAccountServicingSessionReference(String currentAccountServicingSessionReference) {
    this.currentAccountServicingSessionReference = currentAccountServicingSessionReference;
  }

  public InlineObject3 currentAccountFulfillmentArrangementInitiateActionRecord(Object currentAccountFulfillmentArrangementInitiateActionRecord) {
    this.currentAccountFulfillmentArrangementInitiateActionRecord = currentAccountFulfillmentArrangementInitiateActionRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return currentAccountFulfillmentArrangementInitiateActionRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record ")

  @Valid

  public Object getCurrentAccountFulfillmentArrangementInitiateActionRecord() {
    return currentAccountFulfillmentArrangementInitiateActionRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInitiateActionRecord(Object currentAccountFulfillmentArrangementInitiateActionRecord) {
    this.currentAccountFulfillmentArrangementInitiateActionRecord = currentAccountFulfillmentArrangementInitiateActionRecord;
  }

  public InlineObject3 currentAccountFulfillmentArrangementInstanceStatus(String currentAccountFulfillmentArrangementInstanceStatus) {
    this.currentAccountFulfillmentArrangementInstanceStatus = currentAccountFulfillmentArrangementInstanceStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Current Account Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return currentAccountFulfillmentArrangementInstanceStatus
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Current Account Fulfillment Arrangement instance (e.g. initialised, pending, active) ")


  public String getCurrentAccountFulfillmentArrangementInstanceStatus() {
    return currentAccountFulfillmentArrangementInstanceStatus;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceStatus(String currentAccountFulfillmentArrangementInstanceStatus) {
    this.currentAccountFulfillmentArrangementInstanceStatus = currentAccountFulfillmentArrangementInstanceStatus;
  }

  public InlineObject3 currentAccountFulfillmentArrangementInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
    return this;
  }

  /**
   * Get currentAccountFulfillmentArrangementInstanceRecord
   * @return currentAccountFulfillmentArrangementInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecord getCurrentAccountFulfillmentArrangementInstanceRecord() {
    return currentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject3 inlineObject3 = (InlineObject3) o;
    return Objects.equals(this.currentAccountServicingSessionReference, inlineObject3.currentAccountServicingSessionReference) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInitiateActionRecord, inlineObject3.currentAccountFulfillmentArrangementInitiateActionRecord) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInstanceStatus, inlineObject3.currentAccountFulfillmentArrangementInstanceStatus) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInstanceRecord, inlineObject3.currentAccountFulfillmentArrangementInstanceRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountServicingSessionReference, currentAccountFulfillmentArrangementInitiateActionRecord, currentAccountFulfillmentArrangementInstanceStatus, currentAccountFulfillmentArrangementInstanceRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject3 {\n");
    
    sb.append("    currentAccountServicingSessionReference: ").append(toIndentedString(currentAccountServicingSessionReference)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInitiateActionRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementInitiateActionRecord)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInstanceStatus: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceStatus)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInstanceRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceRecord)).append("\n");
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

