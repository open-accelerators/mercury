package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecord;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject16
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class InlineObject16   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceReference")
  private String currentAccountFulfillmentArrangementInstanceReference;

  @JsonProperty("depositsAndWithdrawalsInstanceReference")
  private String depositsAndWithdrawalsInstanceReference;

  @JsonProperty("depositsAndWithdrawalsInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord;

  @JsonProperty("depositsAndWithdrawalsExecuteActionTaskRecord")
  private Object depositsAndWithdrawalsExecuteActionTaskRecord;

  @JsonProperty("executeRecordType")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType executeRecordType;

  public InlineObject16 currentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance 
   * @return currentAccountFulfillmentArrangementInstanceReference
  */
  @ApiModelProperty(example = "CAFAIR796414", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance ")


  public String getCurrentAccountFulfillmentArrangementInstanceReference() {
    return currentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
  }

  public InlineObject16 depositsAndWithdrawalsInstanceReference(String depositsAndWithdrawalsInstanceReference) {
    this.depositsAndWithdrawalsInstanceReference = depositsAndWithdrawalsInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Deposits And Withdrawals instance 
   * @return depositsAndWithdrawalsInstanceReference
  */
  @ApiModelProperty(example = "DAWIR776109", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Deposits And Withdrawals instance ")


  public String getDepositsAndWithdrawalsInstanceReference() {
    return depositsAndWithdrawalsInstanceReference;
  }

  public void setDepositsAndWithdrawalsInstanceReference(String depositsAndWithdrawalsInstanceReference) {
    this.depositsAndWithdrawalsInstanceReference = depositsAndWithdrawalsInstanceReference;
  }

  public InlineObject16 depositsAndWithdrawalsInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord) {
    this.depositsAndWithdrawalsInstanceRecord = depositsAndWithdrawalsInstanceRecord;
    return this;
  }

  /**
   * Get depositsAndWithdrawalsInstanceRecord
   * @return depositsAndWithdrawalsInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecord getDepositsAndWithdrawalsInstanceRecord() {
    return depositsAndWithdrawalsInstanceRecord;
  }

  public void setDepositsAndWithdrawalsInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord) {
    this.depositsAndWithdrawalsInstanceRecord = depositsAndWithdrawalsInstanceRecord;
  }

  public InlineObject16 depositsAndWithdrawalsExecuteActionTaskRecord(Object depositsAndWithdrawalsExecuteActionTaskRecord) {
    this.depositsAndWithdrawalsExecuteActionTaskRecord = depositsAndWithdrawalsExecuteActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return depositsAndWithdrawalsExecuteActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record ")

  @Valid

  public Object getDepositsAndWithdrawalsExecuteActionTaskRecord() {
    return depositsAndWithdrawalsExecuteActionTaskRecord;
  }

  public void setDepositsAndWithdrawalsExecuteActionTaskRecord(Object depositsAndWithdrawalsExecuteActionTaskRecord) {
    this.depositsAndWithdrawalsExecuteActionTaskRecord = depositsAndWithdrawalsExecuteActionTaskRecord;
  }

  public InlineObject16 executeRecordType(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType executeRecordType) {
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
    InlineObject16 inlineObject16 = (InlineObject16) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceReference, inlineObject16.currentAccountFulfillmentArrangementInstanceReference) &&
        Objects.equals(this.depositsAndWithdrawalsInstanceReference, inlineObject16.depositsAndWithdrawalsInstanceReference) &&
        Objects.equals(this.depositsAndWithdrawalsInstanceRecord, inlineObject16.depositsAndWithdrawalsInstanceRecord) &&
        Objects.equals(this.depositsAndWithdrawalsExecuteActionTaskRecord, inlineObject16.depositsAndWithdrawalsExecuteActionTaskRecord) &&
        Objects.equals(this.executeRecordType, inlineObject16.executeRecordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceReference, depositsAndWithdrawalsInstanceReference, depositsAndWithdrawalsInstanceRecord, depositsAndWithdrawalsExecuteActionTaskRecord, executeRecordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject16 {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceReference: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReference)).append("\n");
    sb.append("    depositsAndWithdrawalsInstanceReference: ").append(toIndentedString(depositsAndWithdrawalsInstanceReference)).append("\n");
    sb.append("    depositsAndWithdrawalsInstanceRecord: ").append(toIndentedString(depositsAndWithdrawalsInstanceRecord)).append("\n");
    sb.append("    depositsAndWithdrawalsExecuteActionTaskRecord: ").append(toIndentedString(depositsAndWithdrawalsExecuteActionTaskRecord)).append("\n");
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

