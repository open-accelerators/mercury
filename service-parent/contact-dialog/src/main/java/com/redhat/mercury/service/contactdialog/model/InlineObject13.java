package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdExecutionAccountSweepInstanceRecord;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject13
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class InlineObject13   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceReference")
  private String currentAccountFulfillmentArrangementInstanceReference;

  @JsonProperty("accountSweepInstanceReference")
  private String accountSweepInstanceReference;

  @JsonProperty("accountSweepInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdExecutionAccountSweepInstanceRecord accountSweepInstanceRecord;

  @JsonProperty("accountSweepExecuteActionTaskRecord")
  private Object accountSweepExecuteActionTaskRecord;

  @JsonProperty("executeRecordType")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType executeRecordType;

  public InlineObject13 currentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance 
   * @return currentAccountFulfillmentArrangementInstanceReference
  */
  @ApiModelProperty(example = "CAFAIR779352", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance ")


  public String getCurrentAccountFulfillmentArrangementInstanceReference() {
    return currentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
  }

  public InlineObject13 accountSweepInstanceReference(String accountSweepInstanceReference) {
    this.accountSweepInstanceReference = accountSweepInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Sweep instance 
   * @return accountSweepInstanceReference
  */
  @ApiModelProperty(example = "ASIR769250", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Sweep instance ")


  public String getAccountSweepInstanceReference() {
    return accountSweepInstanceReference;
  }

  public void setAccountSweepInstanceReference(String accountSweepInstanceReference) {
    this.accountSweepInstanceReference = accountSweepInstanceReference;
  }

  public InlineObject13 accountSweepInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdExecutionAccountSweepInstanceRecord accountSweepInstanceRecord) {
    this.accountSweepInstanceRecord = accountSweepInstanceRecord;
    return this;
  }

  /**
   * Get accountSweepInstanceRecord
   * @return accountSweepInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdExecutionAccountSweepInstanceRecord getAccountSweepInstanceRecord() {
    return accountSweepInstanceRecord;
  }

  public void setAccountSweepInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdExecutionAccountSweepInstanceRecord accountSweepInstanceRecord) {
    this.accountSweepInstanceRecord = accountSweepInstanceRecord;
  }

  public InlineObject13 accountSweepExecuteActionTaskRecord(Object accountSweepExecuteActionTaskRecord) {
    this.accountSweepExecuteActionTaskRecord = accountSweepExecuteActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return accountSweepExecuteActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record ")

  @Valid

  public Object getAccountSweepExecuteActionTaskRecord() {
    return accountSweepExecuteActionTaskRecord;
  }

  public void setAccountSweepExecuteActionTaskRecord(Object accountSweepExecuteActionTaskRecord) {
    this.accountSweepExecuteActionTaskRecord = accountSweepExecuteActionTaskRecord;
  }

  public InlineObject13 executeRecordType(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType executeRecordType) {
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
    InlineObject13 inlineObject13 = (InlineObject13) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceReference, inlineObject13.currentAccountFulfillmentArrangementInstanceReference) &&
        Objects.equals(this.accountSweepInstanceReference, inlineObject13.accountSweepInstanceReference) &&
        Objects.equals(this.accountSweepInstanceRecord, inlineObject13.accountSweepInstanceRecord) &&
        Objects.equals(this.accountSweepExecuteActionTaskRecord, inlineObject13.accountSweepExecuteActionTaskRecord) &&
        Objects.equals(this.executeRecordType, inlineObject13.executeRecordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceReference, accountSweepInstanceReference, accountSweepInstanceRecord, accountSweepExecuteActionTaskRecord, executeRecordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject13 {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceReference: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReference)).append("\n");
    sb.append("    accountSweepInstanceReference: ").append(toIndentedString(accountSweepInstanceReference)).append("\n");
    sb.append("    accountSweepInstanceRecord: ").append(toIndentedString(accountSweepInstanceRecord)).append("\n");
    sb.append("    accountSweepExecuteActionTaskRecord: ").append(toIndentedString(accountSweepExecuteActionTaskRecord)).append("\n");
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

