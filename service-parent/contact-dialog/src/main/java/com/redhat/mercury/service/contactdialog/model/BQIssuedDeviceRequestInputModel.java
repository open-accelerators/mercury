package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceBqReferenceIdRequisitionIssuedDeviceInstanceRecord;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceBqReferenceIdRequisitionRequestRecordType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQIssuedDeviceRequestInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class BQIssuedDeviceRequestInputModel   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceReference")
  private String currentAccountFulfillmentArrangementInstanceReference;

  @JsonProperty("issuedDeviceInstanceReference")
  private String issuedDeviceInstanceReference;

  @JsonProperty("issuedDeviceInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceBqReferenceIdRequisitionIssuedDeviceInstanceRecord issuedDeviceInstanceRecord;

  @JsonProperty("issuedDeviceRequestActionTaskRecord")
  private Object issuedDeviceRequestActionTaskRecord;

  @JsonProperty("requestRecordType")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceBqReferenceIdRequisitionRequestRecordType requestRecordType;

  public BQIssuedDeviceRequestInputModel currentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance 
   * @return currentAccountFulfillmentArrangementInstanceReference
  */
  @ApiModelProperty(example = "CAFAIR795841", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance ")


  public String getCurrentAccountFulfillmentArrangementInstanceReference() {
    return currentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
  }

  public BQIssuedDeviceRequestInputModel issuedDeviceInstanceReference(String issuedDeviceInstanceReference) {
    this.issuedDeviceInstanceReference = issuedDeviceInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issued Device instance 
   * @return issuedDeviceInstanceReference
  */
  @ApiModelProperty(example = "IDIR797041", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issued Device instance ")


  public String getIssuedDeviceInstanceReference() {
    return issuedDeviceInstanceReference;
  }

  public void setIssuedDeviceInstanceReference(String issuedDeviceInstanceReference) {
    this.issuedDeviceInstanceReference = issuedDeviceInstanceReference;
  }

  public BQIssuedDeviceRequestInputModel issuedDeviceInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceBqReferenceIdRequisitionIssuedDeviceInstanceRecord issuedDeviceInstanceRecord) {
    this.issuedDeviceInstanceRecord = issuedDeviceInstanceRecord;
    return this;
  }

  /**
   * Get issuedDeviceInstanceRecord
   * @return issuedDeviceInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceBqReferenceIdRequisitionIssuedDeviceInstanceRecord getIssuedDeviceInstanceRecord() {
    return issuedDeviceInstanceRecord;
  }

  public void setIssuedDeviceInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceBqReferenceIdRequisitionIssuedDeviceInstanceRecord issuedDeviceInstanceRecord) {
    this.issuedDeviceInstanceRecord = issuedDeviceInstanceRecord;
  }

  public BQIssuedDeviceRequestInputModel issuedDeviceRequestActionTaskRecord(Object issuedDeviceRequestActionTaskRecord) {
    this.issuedDeviceRequestActionTaskRecord = issuedDeviceRequestActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return issuedDeviceRequestActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record ")

  @Valid

  public Object getIssuedDeviceRequestActionTaskRecord() {
    return issuedDeviceRequestActionTaskRecord;
  }

  public void setIssuedDeviceRequestActionTaskRecord(Object issuedDeviceRequestActionTaskRecord) {
    this.issuedDeviceRequestActionTaskRecord = issuedDeviceRequestActionTaskRecord;
  }

  public BQIssuedDeviceRequestInputModel requestRecordType(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceBqReferenceIdRequisitionRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
    return this;
  }

  /**
   * Get requestRecordType
   * @return requestRecordType
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceBqReferenceIdRequisitionRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceBqReferenceIdRequisitionRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQIssuedDeviceRequestInputModel bqIssuedDeviceRequestInputModel = (BQIssuedDeviceRequestInputModel) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceReference, bqIssuedDeviceRequestInputModel.currentAccountFulfillmentArrangementInstanceReference) &&
        Objects.equals(this.issuedDeviceInstanceReference, bqIssuedDeviceRequestInputModel.issuedDeviceInstanceReference) &&
        Objects.equals(this.issuedDeviceInstanceRecord, bqIssuedDeviceRequestInputModel.issuedDeviceInstanceRecord) &&
        Objects.equals(this.issuedDeviceRequestActionTaskRecord, bqIssuedDeviceRequestInputModel.issuedDeviceRequestActionTaskRecord) &&
        Objects.equals(this.requestRecordType, bqIssuedDeviceRequestInputModel.requestRecordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceReference, issuedDeviceInstanceReference, issuedDeviceInstanceRecord, issuedDeviceRequestActionTaskRecord, requestRecordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQIssuedDeviceRequestInputModel {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceReference: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReference)).append("\n");
    sb.append("    issuedDeviceInstanceReference: ").append(toIndentedString(issuedDeviceInstanceReference)).append("\n");
    sb.append("    issuedDeviceInstanceRecord: ").append(toIndentedString(issuedDeviceInstanceRecord)).append("\n");
    sb.append("    issuedDeviceRequestActionTaskRecord: ").append(toIndentedString(issuedDeviceRequestActionTaskRecord)).append("\n");
    sb.append("    requestRecordType: ").append(toIndentedString(requestRecordType)).append("\n");
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

