package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdUpdateCurrentAccountFulfillmentArrangementInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CRCurrentAccountFulfillmentArrangementUpdateInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class CRCurrentAccountFulfillmentArrangementUpdateInputModel   {
  @JsonProperty("currentAccountServicingSessionReference")
  private String currentAccountServicingSessionReference;

  @JsonProperty("currentAccountFulfillmentArrangementInstanceReference")
  private String currentAccountFulfillmentArrangementInstanceReference;

  @JsonProperty("currentAccountFulfillmentArrangementInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdUpdateCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord;

  @JsonProperty("currentAccountFulfillmentArrangementUpdateActionTaskRecord")
  private Object currentAccountFulfillmentArrangementUpdateActionTaskRecord;

  @JsonProperty("updateActionRequest")
  private String updateActionRequest;

  public CRCurrentAccountFulfillmentArrangementUpdateInputModel currentAccountServicingSessionReference(String currentAccountServicingSessionReference) {
    this.currentAccountServicingSessionReference = currentAccountServicingSessionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return currentAccountServicingSessionReference
  */
  @ApiModelProperty(example = "CASSR784968", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session ")


  public String getCurrentAccountServicingSessionReference() {
    return currentAccountServicingSessionReference;
  }

  public void setCurrentAccountServicingSessionReference(String currentAccountServicingSessionReference) {
    this.currentAccountServicingSessionReference = currentAccountServicingSessionReference;
  }

  public CRCurrentAccountFulfillmentArrangementUpdateInputModel currentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Current Account Fulfillment Arrangement instance 
   * @return currentAccountFulfillmentArrangementInstanceReference
  */
  @ApiModelProperty(example = "CAFAIR735254", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Current Account Fulfillment Arrangement instance ")


  public String getCurrentAccountFulfillmentArrangementInstanceReference() {
    return currentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
  }

  public CRCurrentAccountFulfillmentArrangementUpdateInputModel currentAccountFulfillmentArrangementInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdUpdateCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
    return this;
  }

  /**
   * Get currentAccountFulfillmentArrangementInstanceRecord
   * @return currentAccountFulfillmentArrangementInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdUpdateCurrentAccountFulfillmentArrangementInstanceRecord getCurrentAccountFulfillmentArrangementInstanceRecord() {
    return currentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdUpdateCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
  }

  public CRCurrentAccountFulfillmentArrangementUpdateInputModel currentAccountFulfillmentArrangementUpdateActionTaskRecord(Object currentAccountFulfillmentArrangementUpdateActionTaskRecord) {
    this.currentAccountFulfillmentArrangementUpdateActionTaskRecord = currentAccountFulfillmentArrangementUpdateActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return currentAccountFulfillmentArrangementUpdateActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")

  @Valid

  public Object getCurrentAccountFulfillmentArrangementUpdateActionTaskRecord() {
    return currentAccountFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setCurrentAccountFulfillmentArrangementUpdateActionTaskRecord(Object currentAccountFulfillmentArrangementUpdateActionTaskRecord) {
    this.currentAccountFulfillmentArrangementUpdateActionTaskRecord = currentAccountFulfillmentArrangementUpdateActionTaskRecord;
  }

  public CRCurrentAccountFulfillmentArrangementUpdateInputModel updateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request ")


  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCurrentAccountFulfillmentArrangementUpdateInputModel crCurrentAccountFulfillmentArrangementUpdateInputModel = (CRCurrentAccountFulfillmentArrangementUpdateInputModel) o;
    return Objects.equals(this.currentAccountServicingSessionReference, crCurrentAccountFulfillmentArrangementUpdateInputModel.currentAccountServicingSessionReference) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInstanceReference, crCurrentAccountFulfillmentArrangementUpdateInputModel.currentAccountFulfillmentArrangementInstanceReference) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInstanceRecord, crCurrentAccountFulfillmentArrangementUpdateInputModel.currentAccountFulfillmentArrangementInstanceRecord) &&
        Objects.equals(this.currentAccountFulfillmentArrangementUpdateActionTaskRecord, crCurrentAccountFulfillmentArrangementUpdateInputModel.currentAccountFulfillmentArrangementUpdateActionTaskRecord) &&
        Objects.equals(this.updateActionRequest, crCurrentAccountFulfillmentArrangementUpdateInputModel.updateActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountServicingSessionReference, currentAccountFulfillmentArrangementInstanceReference, currentAccountFulfillmentArrangementInstanceRecord, currentAccountFulfillmentArrangementUpdateActionTaskRecord, updateActionRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCurrentAccountFulfillmentArrangementUpdateInputModel {\n");
    
    sb.append("    currentAccountServicingSessionReference: ").append(toIndentedString(currentAccountServicingSessionReference)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInstanceReference: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReference)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInstanceRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceRecord)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementUpdateActionTaskRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementUpdateActionTaskRecord)).append("\n");
    sb.append("    updateActionRequest: ").append(toIndentedString(updateActionRequest)).append("\n");
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

