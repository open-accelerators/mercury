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
 * BQDepositsAndWithdrawalsExecuteOutputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQDepositsAndWithdrawalsExecuteOutputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction   {
  @JsonProperty("withdrawalTransactionDate")
  private String withdrawalTransactionDate;

  public BQDepositsAndWithdrawalsExecuteOutputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransactionDate(String withdrawalTransactionDate) {
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
    BQDepositsAndWithdrawalsExecuteOutputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction bqDepositsAndWithdrawalsExecuteOutputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction = (BQDepositsAndWithdrawalsExecuteOutputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction) o;
    return Objects.equals(this.withdrawalTransactionDate, bqDepositsAndWithdrawalsExecuteOutputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction.withdrawalTransactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withdrawalTransactionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQDepositsAndWithdrawalsExecuteOutputModelDepositsAndWithdrawalsInstanceRecordWithdrawalTransaction {\n");
    
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

