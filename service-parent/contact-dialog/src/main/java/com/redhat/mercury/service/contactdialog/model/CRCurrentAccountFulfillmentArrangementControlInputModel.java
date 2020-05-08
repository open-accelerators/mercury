package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdControlCurrentAccountFulfillmentArrangementControlActionRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CRCurrentAccountFulfillmentArrangementControlInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class CRCurrentAccountFulfillmentArrangementControlInputModel   {
  @JsonProperty("currentAccountServicingSessionReference")
  private String currentAccountServicingSessionReference;

  @JsonProperty("currentAccountFulfillmentArrangementInstanceReference")
  private String currentAccountFulfillmentArrangementInstanceReference;

  @JsonProperty("currentAccountFulfillmentArrangementControlActionTaskRecord")
  private Object currentAccountFulfillmentArrangementControlActionTaskRecord;

  @JsonProperty("currentAccountFulfillmentArrangementControlActionRequest")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdControlCurrentAccountFulfillmentArrangementControlActionRequest currentAccountFulfillmentArrangementControlActionRequest;

  public CRCurrentAccountFulfillmentArrangementControlInputModel currentAccountServicingSessionReference(String currentAccountServicingSessionReference) {
    this.currentAccountServicingSessionReference = currentAccountServicingSessionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return currentAccountServicingSessionReference
  */
  @ApiModelProperty(example = "CASSR762286", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session ")


  public String getCurrentAccountServicingSessionReference() {
    return currentAccountServicingSessionReference;
  }

  public void setCurrentAccountServicingSessionReference(String currentAccountServicingSessionReference) {
    this.currentAccountServicingSessionReference = currentAccountServicingSessionReference;
  }

  public CRCurrentAccountFulfillmentArrangementControlInputModel currentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Current Account Fulfillment Arrangement instance 
   * @return currentAccountFulfillmentArrangementInstanceReference
  */
  @ApiModelProperty(example = "CAFAIR757395", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Current Account Fulfillment Arrangement instance ")


  public String getCurrentAccountFulfillmentArrangementInstanceReference() {
    return currentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
  }

  public CRCurrentAccountFulfillmentArrangementControlInputModel currentAccountFulfillmentArrangementControlActionTaskRecord(Object currentAccountFulfillmentArrangementControlActionTaskRecord) {
    this.currentAccountFulfillmentArrangementControlActionTaskRecord = currentAccountFulfillmentArrangementControlActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return currentAccountFulfillmentArrangementControlActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record ")

  @Valid

  public Object getCurrentAccountFulfillmentArrangementControlActionTaskRecord() {
    return currentAccountFulfillmentArrangementControlActionTaskRecord;
  }

  public void setCurrentAccountFulfillmentArrangementControlActionTaskRecord(Object currentAccountFulfillmentArrangementControlActionTaskRecord) {
    this.currentAccountFulfillmentArrangementControlActionTaskRecord = currentAccountFulfillmentArrangementControlActionTaskRecord;
  }

  public CRCurrentAccountFulfillmentArrangementControlInputModel currentAccountFulfillmentArrangementControlActionRequest(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdControlCurrentAccountFulfillmentArrangementControlActionRequest currentAccountFulfillmentArrangementControlActionRequest) {
    this.currentAccountFulfillmentArrangementControlActionRequest = currentAccountFulfillmentArrangementControlActionRequest;
    return this;
  }

  /**
   * Get currentAccountFulfillmentArrangementControlActionRequest
   * @return currentAccountFulfillmentArrangementControlActionRequest
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdControlCurrentAccountFulfillmentArrangementControlActionRequest getCurrentAccountFulfillmentArrangementControlActionRequest() {
    return currentAccountFulfillmentArrangementControlActionRequest;
  }

  public void setCurrentAccountFulfillmentArrangementControlActionRequest(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdControlCurrentAccountFulfillmentArrangementControlActionRequest currentAccountFulfillmentArrangementControlActionRequest) {
    this.currentAccountFulfillmentArrangementControlActionRequest = currentAccountFulfillmentArrangementControlActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCurrentAccountFulfillmentArrangementControlInputModel crCurrentAccountFulfillmentArrangementControlInputModel = (CRCurrentAccountFulfillmentArrangementControlInputModel) o;
    return Objects.equals(this.currentAccountServicingSessionReference, crCurrentAccountFulfillmentArrangementControlInputModel.currentAccountServicingSessionReference) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInstanceReference, crCurrentAccountFulfillmentArrangementControlInputModel.currentAccountFulfillmentArrangementInstanceReference) &&
        Objects.equals(this.currentAccountFulfillmentArrangementControlActionTaskRecord, crCurrentAccountFulfillmentArrangementControlInputModel.currentAccountFulfillmentArrangementControlActionTaskRecord) &&
        Objects.equals(this.currentAccountFulfillmentArrangementControlActionRequest, crCurrentAccountFulfillmentArrangementControlInputModel.currentAccountFulfillmentArrangementControlActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountServicingSessionReference, currentAccountFulfillmentArrangementInstanceReference, currentAccountFulfillmentArrangementControlActionTaskRecord, currentAccountFulfillmentArrangementControlActionRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCurrentAccountFulfillmentArrangementControlInputModel {\n");
    
    sb.append("    currentAccountServicingSessionReference: ").append(toIndentedString(currentAccountServicingSessionReference)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInstanceReference: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReference)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementControlActionTaskRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementControlActionTaskRecord)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementControlActionRequest: ").append(toIndentedString(currentAccountFulfillmentArrangementControlActionRequest)).append("\n");
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

