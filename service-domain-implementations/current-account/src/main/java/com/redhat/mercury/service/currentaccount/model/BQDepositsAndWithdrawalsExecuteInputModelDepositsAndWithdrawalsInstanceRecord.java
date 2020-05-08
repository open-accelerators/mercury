package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordDepositTransaction;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord   {
  @JsonProperty("depositTransaction")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransaction;

  @JsonProperty("withdrawalTransaction")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction;

  public BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord depositTransaction(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransaction) {
    this.depositTransaction = depositTransaction;
    return this;
  }

  /**
   * Get depositTransaction
   * @return depositTransaction
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordDepositTransaction getDepositTransaction() {
    return depositTransaction;
  }

  public void setDepositTransaction(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransaction) {
    this.depositTransaction = depositTransaction;
  }

  public BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord withdrawalTransaction(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction) {
    this.withdrawalTransaction = withdrawalTransaction;
    return this;
  }

  /**
   * Get withdrawalTransaction
   * @return withdrawalTransaction
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction getWithdrawalTransaction() {
    return withdrawalTransaction;
  }

  public void setWithdrawalTransaction(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdExecutionDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction) {
    this.withdrawalTransaction = withdrawalTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord bqDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord = (BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord) o;
    return Objects.equals(this.depositTransaction, bqDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord.depositTransaction) &&
        Objects.equals(this.withdrawalTransaction, bqDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord.withdrawalTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositTransaction, withdrawalTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQDepositsAndWithdrawalsExecuteInputModelDepositsAndWithdrawalsInstanceRecord {\n");
    
    sb.append("    depositTransaction: ").append(toIndentedString(depositTransaction)).append("\n");
    sb.append("    withdrawalTransaction: ").append(toIndentedString(withdrawalTransaction)).append("\n");
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

