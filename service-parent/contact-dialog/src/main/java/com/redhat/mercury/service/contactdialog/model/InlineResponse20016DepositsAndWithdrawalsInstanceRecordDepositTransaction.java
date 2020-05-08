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
 * InlineResponse20016DepositsAndWithdrawalsInstanceRecordDepositTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class InlineResponse20016DepositsAndWithdrawalsInstanceRecordDepositTransaction   {
  @JsonProperty("depositTransactionDate")
  private String depositTransactionDate;

  public InlineResponse20016DepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransactionDate(String depositTransactionDate) {
    this.depositTransactionDate = depositTransactionDate;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date and time the deposit was initiated 
   * @return depositTransactionDate
  */
  @ApiModelProperty(example = "09-22-2018", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date and time the deposit was initiated ")


  public String getDepositTransactionDate() {
    return depositTransactionDate;
  }

  public void setDepositTransactionDate(String depositTransactionDate) {
    this.depositTransactionDate = depositTransactionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20016DepositsAndWithdrawalsInstanceRecordDepositTransaction inlineResponse20016DepositsAndWithdrawalsInstanceRecordDepositTransaction = (InlineResponse20016DepositsAndWithdrawalsInstanceRecordDepositTransaction) o;
    return Objects.equals(this.depositTransactionDate, inlineResponse20016DepositsAndWithdrawalsInstanceRecordDepositTransaction.depositTransactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositTransactionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20016DepositsAndWithdrawalsInstanceRecordDepositTransaction {\n");
    
    sb.append("    depositTransactionDate: ").append(toIndentedString(depositTransactionDate)).append("\n");
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

