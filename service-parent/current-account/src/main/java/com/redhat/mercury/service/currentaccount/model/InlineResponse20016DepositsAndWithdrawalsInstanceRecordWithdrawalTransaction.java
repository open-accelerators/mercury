package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20016DepositsAndWithdrawalsInstanceRecordWithdrawalTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class InlineResponse20016DepositsAndWithdrawalsInstanceRecordWithdrawalTransaction   {
  @JsonProperty("withdrawalTransactionDate")
  private String withdrawalTransactionDate;

  public InlineResponse20016DepositsAndWithdrawalsInstanceRecordWithdrawalTransaction withdrawalTransactionDate(String withdrawalTransactionDate) {
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
    InlineResponse20016DepositsAndWithdrawalsInstanceRecordWithdrawalTransaction inlineResponse20016DepositsAndWithdrawalsInstanceRecordWithdrawalTransaction = (InlineResponse20016DepositsAndWithdrawalsInstanceRecordWithdrawalTransaction) o;
    return Objects.equals(this.withdrawalTransactionDate, inlineResponse20016DepositsAndWithdrawalsInstanceRecordWithdrawalTransaction.withdrawalTransactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withdrawalTransactionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20016DepositsAndWithdrawalsInstanceRecordWithdrawalTransaction {\n");
    
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

