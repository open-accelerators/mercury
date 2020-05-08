package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsBqReferenceIdExecutionPaymentsInstanceRecord;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject20
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class InlineObject20   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceReference")
  private String currentAccountFulfillmentArrangementInstanceReference;

  @JsonProperty("paymentsInstanceReference")
  private String paymentsInstanceReference;

  @JsonProperty("paymentsInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsBqReferenceIdExecutionPaymentsInstanceRecord paymentsInstanceRecord;

  @JsonProperty("paymentsExecuteActionTaskRecord")
  private Object paymentsExecuteActionTaskRecord;

  @JsonProperty("executeRecordType")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType executeRecordType;

  public InlineObject20 currentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance 
   * @return currentAccountFulfillmentArrangementInstanceReference
  */
  @ApiModelProperty(example = "CAFAIR792715", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance ")


  public String getCurrentAccountFulfillmentArrangementInstanceReference() {
    return currentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
  }

  public InlineObject20 paymentsInstanceReference(String paymentsInstanceReference) {
    this.paymentsInstanceReference = paymentsInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payments instance 
   * @return paymentsInstanceReference
  */
  @ApiModelProperty(example = "PIR748199", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payments instance ")


  public String getPaymentsInstanceReference() {
    return paymentsInstanceReference;
  }

  public void setPaymentsInstanceReference(String paymentsInstanceReference) {
    this.paymentsInstanceReference = paymentsInstanceReference;
  }

  public InlineObject20 paymentsInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsBqReferenceIdExecutionPaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
    return this;
  }

  /**
   * Get paymentsInstanceRecord
   * @return paymentsInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsBqReferenceIdExecutionPaymentsInstanceRecord getPaymentsInstanceRecord() {
    return paymentsInstanceRecord;
  }

  public void setPaymentsInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsBqReferenceIdExecutionPaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
  }

  public InlineObject20 paymentsExecuteActionTaskRecord(Object paymentsExecuteActionTaskRecord) {
    this.paymentsExecuteActionTaskRecord = paymentsExecuteActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return paymentsExecuteActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record ")

  @Valid

  public Object getPaymentsExecuteActionTaskRecord() {
    return paymentsExecuteActionTaskRecord;
  }

  public void setPaymentsExecuteActionTaskRecord(Object paymentsExecuteActionTaskRecord) {
    this.paymentsExecuteActionTaskRecord = paymentsExecuteActionTaskRecord;
  }

  public InlineObject20 executeRecordType(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType executeRecordType) {
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
    InlineObject20 inlineObject20 = (InlineObject20) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceReference, inlineObject20.currentAccountFulfillmentArrangementInstanceReference) &&
        Objects.equals(this.paymentsInstanceReference, inlineObject20.paymentsInstanceReference) &&
        Objects.equals(this.paymentsInstanceRecord, inlineObject20.paymentsInstanceRecord) &&
        Objects.equals(this.paymentsExecuteActionTaskRecord, inlineObject20.paymentsExecuteActionTaskRecord) &&
        Objects.equals(this.executeRecordType, inlineObject20.executeRecordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceReference, paymentsInstanceReference, paymentsInstanceRecord, paymentsExecuteActionTaskRecord, executeRecordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject20 {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceReference: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReference)).append("\n");
    sb.append("    paymentsInstanceReference: ").append(toIndentedString(paymentsInstanceReference)).append("\n");
    sb.append("    paymentsInstanceRecord: ").append(toIndentedString(paymentsInstanceRecord)).append("\n");
    sb.append("    paymentsExecuteActionTaskRecord: ").append(toIndentedString(paymentsExecuteActionTaskRecord)).append("\n");
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

