package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction   {
  @JsonProperty("withdrawalTransactionSourceReference")
  private String withdrawalTransactionSourceReference;

  @JsonProperty("withdrawalTransactionWithdrawalType")
  private String withdrawalTransactionWithdrawalType;

  @JsonProperty("withdrawalTransactionDescription")
  private String withdrawalTransactionDescription;

  @JsonProperty("withdrawalTransactionAmount")
  private String withdrawalTransactionAmount;

  @JsonProperty("withdrawalTransactionDate")
  private String withdrawalTransactionDate;

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransactionSourceReference(String withdrawalTransactionSourceReference) {
    this.withdrawalTransactionSourceReference = withdrawalTransactionSourceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Identifies the target for the withdrawal 
   * @return withdrawalTransactionSourceReference
  */
  @ApiModelProperty(example = "774711", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Identifies the target for the withdrawal ")


  public String getWithdrawalTransactionSourceReference() {
    return withdrawalTransactionSourceReference;
  }

  public void setWithdrawalTransactionSourceReference(String withdrawalTransactionSourceReference) {
    this.withdrawalTransactionSourceReference = withdrawalTransactionSourceReference;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransactionWithdrawalType(String withdrawalTransactionWithdrawalType) {
    this.withdrawalTransactionWithdrawalType = withdrawalTransactionWithdrawalType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of withdrawal made with the transaction 
   * @return withdrawalTransactionWithdrawalType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of withdrawal made with the transaction ")


  public String getWithdrawalTransactionWithdrawalType() {
    return withdrawalTransactionWithdrawalType;
  }

  public void setWithdrawalTransactionWithdrawalType(String withdrawalTransactionWithdrawalType) {
    this.withdrawalTransactionWithdrawalType = withdrawalTransactionWithdrawalType;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransactionDescription(String withdrawalTransactionDescription) {
    this.withdrawalTransactionDescription = withdrawalTransactionDescription;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any necessary details describing the purpose or reference properties of the withdrawal 
   * @return withdrawalTransactionDescription
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any necessary details describing the purpose or reference properties of the withdrawal ")


  public String getWithdrawalTransactionDescription() {
    return withdrawalTransactionDescription;
  }

  public void setWithdrawalTransactionDescription(String withdrawalTransactionDescription) {
    this.withdrawalTransactionDescription = withdrawalTransactionDescription;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransactionAmount(String withdrawalTransactionAmount) {
    this.withdrawalTransactionAmount = withdrawalTransactionAmount;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The withdrawn amount 
   * @return withdrawalTransactionAmount
  */
  @ApiModelProperty(example = "USD 250", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The withdrawn amount ")


  public String getWithdrawalTransactionAmount() {
    return withdrawalTransactionAmount;
  }

  public void setWithdrawalTransactionAmount(String withdrawalTransactionAmount) {
    this.withdrawalTransactionAmount = withdrawalTransactionAmount;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransactionDate(String withdrawalTransactionDate) {
    this.withdrawalTransactionDate = withdrawalTransactionDate;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date and time the withdrawal was initiated 
   * @return withdrawalTransactionDate
  */
  @ApiModelProperty(example = "09-22-2018", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date and time the withdrawal was initiated ")


  public String getWithdrawalTransactionDate() {
    return withdrawalTransactionDate;
  }

  public void setWithdrawalTransactionDate(String withdrawalTransactionDate) {
    this.withdrawalTransactionDate = withdrawalTransactionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction = (CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction) o;
    return Objects.equals(this.withdrawalTransactionSourceReference, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction.withdrawalTransactionSourceReference) &&
        Objects.equals(this.withdrawalTransactionWithdrawalType, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction.withdrawalTransactionWithdrawalType) &&
        Objects.equals(this.withdrawalTransactionDescription, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction.withdrawalTransactionDescription) &&
        Objects.equals(this.withdrawalTransactionAmount, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction.withdrawalTransactionAmount) &&
        Objects.equals(this.withdrawalTransactionDate, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction.withdrawalTransactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withdrawalTransactionSourceReference, withdrawalTransactionWithdrawalType, withdrawalTransactionDescription, withdrawalTransactionAmount, withdrawalTransactionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction {\n");
    
    sb.append("    withdrawalTransactionSourceReference: ").append(toIndentedString(withdrawalTransactionSourceReference)).append("\n");
    sb.append("    withdrawalTransactionWithdrawalType: ").append(toIndentedString(withdrawalTransactionWithdrawalType)).append("\n");
    sb.append("    withdrawalTransactionDescription: ").append(toIndentedString(withdrawalTransactionDescription)).append("\n");
    sb.append("    withdrawalTransactionAmount: ").append(toIndentedString(withdrawalTransactionAmount)).append("\n");
    sb.append("    withdrawalTransactionDate: ").append(toIndentedString(withdrawalTransactionDate)).append("\n");
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

