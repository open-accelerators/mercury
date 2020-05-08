package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQIssuedDeviceUpdateInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQIssuedDeviceUpdateInputModel   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceReference")
  private String currentAccountFulfillmentArrangementInstanceReference;

  @JsonProperty("issuedDeviceInstanceReference")
  private String issuedDeviceInstanceReference;

  @JsonProperty("issuedDeviceInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecord issuedDeviceInstanceRecord;

  @JsonProperty("issuedDeviceUpdateActionTaskRecord")
  private Object issuedDeviceUpdateActionTaskRecord;

  @JsonProperty("issuedDeviceUpdateActionRequest")
  private String issuedDeviceUpdateActionRequest;

  public BQIssuedDeviceUpdateInputModel currentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance 
   * @return currentAccountFulfillmentArrangementInstanceReference
  */
  @ApiModelProperty(example = "CAFAIR769853", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance ")


  public String getCurrentAccountFulfillmentArrangementInstanceReference() {
    return currentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
  }

  public BQIssuedDeviceUpdateInputModel issuedDeviceInstanceReference(String issuedDeviceInstanceReference) {
    this.issuedDeviceInstanceReference = issuedDeviceInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issued Device instance 
   * @return issuedDeviceInstanceReference
  */
  @ApiModelProperty(example = "IDIR754972", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issued Device instance ")


  public String getIssuedDeviceInstanceReference() {
    return issuedDeviceInstanceReference;
  }

  public void setIssuedDeviceInstanceReference(String issuedDeviceInstanceReference) {
    this.issuedDeviceInstanceReference = issuedDeviceInstanceReference;
  }

  public BQIssuedDeviceUpdateInputModel issuedDeviceInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecord issuedDeviceInstanceRecord) {
    this.issuedDeviceInstanceRecord = issuedDeviceInstanceRecord;
    return this;
  }

  /**
   * Get issuedDeviceInstanceRecord
   * @return issuedDeviceInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecord getIssuedDeviceInstanceRecord() {
    return issuedDeviceInstanceRecord;
  }

  public void setIssuedDeviceInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecord issuedDeviceInstanceRecord) {
    this.issuedDeviceInstanceRecord = issuedDeviceInstanceRecord;
  }

  public BQIssuedDeviceUpdateInputModel issuedDeviceUpdateActionTaskRecord(Object issuedDeviceUpdateActionTaskRecord) {
    this.issuedDeviceUpdateActionTaskRecord = issuedDeviceUpdateActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return issuedDeviceUpdateActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")

  @Valid

  public Object getIssuedDeviceUpdateActionTaskRecord() {
    return issuedDeviceUpdateActionTaskRecord;
  }

  public void setIssuedDeviceUpdateActionTaskRecord(Object issuedDeviceUpdateActionTaskRecord) {
    this.issuedDeviceUpdateActionTaskRecord = issuedDeviceUpdateActionTaskRecord;
  }

  public BQIssuedDeviceUpdateInputModel issuedDeviceUpdateActionRequest(String issuedDeviceUpdateActionRequest) {
    this.issuedDeviceUpdateActionRequest = issuedDeviceUpdateActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return issuedDeviceUpdateActionRequest
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request ")


  public String getIssuedDeviceUpdateActionRequest() {
    return issuedDeviceUpdateActionRequest;
  }

  public void setIssuedDeviceUpdateActionRequest(String issuedDeviceUpdateActionRequest) {
    this.issuedDeviceUpdateActionRequest = issuedDeviceUpdateActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQIssuedDeviceUpdateInputModel bqIssuedDeviceUpdateInputModel = (BQIssuedDeviceUpdateInputModel) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceReference, bqIssuedDeviceUpdateInputModel.currentAccountFulfillmentArrangementInstanceReference) &&
        Objects.equals(this.issuedDeviceInstanceReference, bqIssuedDeviceUpdateInputModel.issuedDeviceInstanceReference) &&
        Objects.equals(this.issuedDeviceInstanceRecord, bqIssuedDeviceUpdateInputModel.issuedDeviceInstanceRecord) &&
        Objects.equals(this.issuedDeviceUpdateActionTaskRecord, bqIssuedDeviceUpdateInputModel.issuedDeviceUpdateActionTaskRecord) &&
        Objects.equals(this.issuedDeviceUpdateActionRequest, bqIssuedDeviceUpdateInputModel.issuedDeviceUpdateActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceReference, issuedDeviceInstanceReference, issuedDeviceInstanceRecord, issuedDeviceUpdateActionTaskRecord, issuedDeviceUpdateActionRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQIssuedDeviceUpdateInputModel {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceReference: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReference)).append("\n");
    sb.append("    issuedDeviceInstanceReference: ").append(toIndentedString(issuedDeviceInstanceReference)).append("\n");
    sb.append("    issuedDeviceInstanceRecord: ").append(toIndentedString(issuedDeviceInstanceRecord)).append("\n");
    sb.append("    issuedDeviceUpdateActionTaskRecord: ").append(toIndentedString(issuedDeviceUpdateActionTaskRecord)).append("\n");
    sb.append("    issuedDeviceUpdateActionRequest: ").append(toIndentedString(issuedDeviceUpdateActionRequest)).append("\n");
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

