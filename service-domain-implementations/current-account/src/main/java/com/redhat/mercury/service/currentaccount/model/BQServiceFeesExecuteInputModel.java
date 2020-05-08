package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQServiceFeesExecuteInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class BQServiceFeesExecuteInputModel   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceReference")
  private String currentAccountFulfillmentArrangementInstanceReference;

  @JsonProperty("serviceFeesInstanceReference")
  private String serviceFeesInstanceReference;

  @JsonProperty("serviceFeesInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecord serviceFeesInstanceRecord;

  @JsonProperty("serviceFeesExecuteActionTaskRecord")
  private Object serviceFeesExecuteActionTaskRecord;

  @JsonProperty("executeRecordType")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType executeRecordType;

  public BQServiceFeesExecuteInputModel currentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance 
   * @return currentAccountFulfillmentArrangementInstanceReference
  */
  @ApiModelProperty(example = "CAFAIR758109", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance ")


  public String getCurrentAccountFulfillmentArrangementInstanceReference() {
    return currentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
  }

  public BQServiceFeesExecuteInputModel serviceFeesInstanceReference(String serviceFeesInstanceReference) {
    this.serviceFeesInstanceReference = serviceFeesInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Fees instance 
   * @return serviceFeesInstanceReference
  */
  @ApiModelProperty(example = "SFIR721161", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Fees instance ")


  public String getServiceFeesInstanceReference() {
    return serviceFeesInstanceReference;
  }

  public void setServiceFeesInstanceReference(String serviceFeesInstanceReference) {
    this.serviceFeesInstanceReference = serviceFeesInstanceReference;
  }

  public BQServiceFeesExecuteInputModel serviceFeesInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecord serviceFeesInstanceRecord) {
    this.serviceFeesInstanceRecord = serviceFeesInstanceRecord;
    return this;
  }

  /**
   * Get serviceFeesInstanceRecord
   * @return serviceFeesInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecord getServiceFeesInstanceRecord() {
    return serviceFeesInstanceRecord;
  }

  public void setServiceFeesInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecord serviceFeesInstanceRecord) {
    this.serviceFeesInstanceRecord = serviceFeesInstanceRecord;
  }

  public BQServiceFeesExecuteInputModel serviceFeesExecuteActionTaskRecord(Object serviceFeesExecuteActionTaskRecord) {
    this.serviceFeesExecuteActionTaskRecord = serviceFeesExecuteActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return serviceFeesExecuteActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record ")

  @Valid

  public Object getServiceFeesExecuteActionTaskRecord() {
    return serviceFeesExecuteActionTaskRecord;
  }

  public void setServiceFeesExecuteActionTaskRecord(Object serviceFeesExecuteActionTaskRecord) {
    this.serviceFeesExecuteActionTaskRecord = serviceFeesExecuteActionTaskRecord;
  }

  public BQServiceFeesExecuteInputModel executeRecordType(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
    return this;
  }

  /**
   * Get executeRecordType
   * @return executeRecordType
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQServiceFeesExecuteInputModel bqServiceFeesExecuteInputModel = (BQServiceFeesExecuteInputModel) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceReference, bqServiceFeesExecuteInputModel.currentAccountFulfillmentArrangementInstanceReference) &&
        Objects.equals(this.serviceFeesInstanceReference, bqServiceFeesExecuteInputModel.serviceFeesInstanceReference) &&
        Objects.equals(this.serviceFeesInstanceRecord, bqServiceFeesExecuteInputModel.serviceFeesInstanceRecord) &&
        Objects.equals(this.serviceFeesExecuteActionTaskRecord, bqServiceFeesExecuteInputModel.serviceFeesExecuteActionTaskRecord) &&
        Objects.equals(this.executeRecordType, bqServiceFeesExecuteInputModel.executeRecordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceReference, serviceFeesInstanceReference, serviceFeesInstanceRecord, serviceFeesExecuteActionTaskRecord, executeRecordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQServiceFeesExecuteInputModel {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceReference: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReference)).append("\n");
    sb.append("    serviceFeesInstanceReference: ").append(toIndentedString(serviceFeesInstanceReference)).append("\n");
    sb.append("    serviceFeesInstanceRecord: ").append(toIndentedString(serviceFeesInstanceRecord)).append("\n");
    sb.append("    serviceFeesExecuteActionTaskRecord: ").append(toIndentedString(serviceFeesExecuteActionTaskRecord)).append("\n");
    sb.append("    executeRecordType: ").append(toIndentedString(executeRecordType)).append("\n");
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

