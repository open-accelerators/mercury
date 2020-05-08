package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse20016DepositsAndWithdrawalsInstanceRecordDepositTransaction;
import com.redhat.mercury.service.contactdialog.model.InlineResponse20016DepositsAndWithdrawalsInstanceRecordWithdrawalTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20016DepositsAndWithdrawalsInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class InlineResponse20016DepositsAndWithdrawalsInstanceRecord   {
  @JsonProperty("depositTransaction")
  private InlineResponse20016DepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransaction;

  @JsonProperty("withdrawalTransaction")
  private InlineResponse20016DepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction;

  public InlineResponse20016DepositsAndWithdrawalsInstanceRecord depositTransaction(InlineResponse20016DepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransaction) {
    this.depositTransaction = depositTransaction;
    return this;
  }

  /**
   * Get depositTransaction
   * @return depositTransaction
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse20016DepositsAndWithdrawalsInstanceRecordDepositTransaction getDepositTransaction() {
    return depositTransaction;
  }

  public void setDepositTransaction(InlineResponse20016DepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransaction) {
    this.depositTransaction = depositTransaction;
  }

  public InlineResponse20016DepositsAndWithdrawalsInstanceRecord withdrawalTransaction(InlineResponse20016DepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction) {
    this.withdrawalTransaction = withdrawalTransaction;
    return this;
  }

  /**
   * Get withdrawalTransaction
   * @return withdrawalTransaction
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse20016DepositsAndWithdrawalsInstanceRecordWithdrawalTransaction getWithdrawalTransaction() {
    return withdrawalTransaction;
  }

  public void setWithdrawalTransaction(InlineResponse20016DepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransaction) {
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
    InlineResponse20016DepositsAndWithdrawalsInstanceRecord inlineResponse20016DepositsAndWithdrawalsInstanceRecord = (InlineResponse20016DepositsAndWithdrawalsInstanceRecord) o;
    return Objects.equals(this.depositTransaction, inlineResponse20016DepositsAndWithdrawalsInstanceRecord.depositTransaction) &&
        Objects.equals(this.withdrawalTransaction, inlineResponse20016DepositsAndWithdrawalsInstanceRecord.withdrawalTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositTransaction, withdrawalTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20016DepositsAndWithdrawalsInstanceRecord {\n");
    
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

