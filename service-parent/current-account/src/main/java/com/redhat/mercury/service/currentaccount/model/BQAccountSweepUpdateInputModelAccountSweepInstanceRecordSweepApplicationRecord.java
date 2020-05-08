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
 * BQAccountSweepUpdateInputModelAccountSweepInstanceRecordSweepApplicationRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class BQAccountSweepUpdateInputModelAccountSweepInstanceRecordSweepApplicationRecord   {
  @JsonProperty("accountSweepTargetAccount")
  private String accountSweepTargetAccount;

  @JsonProperty("accountSweepAmount")
  private String accountSweepAmount;

  @JsonProperty("accountSweepExecutionDate")
  private String accountSweepExecutionDate;

  public BQAccountSweepUpdateInputModelAccountSweepInstanceRecordSweepApplicationRecord accountSweepTargetAccount(String accountSweepTargetAccount) {
    this.accountSweepTargetAccount = accountSweepTargetAccount;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The facility that the sweep is made to/from 
   * @return accountSweepTargetAccount
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The facility that the sweep is made to/from ")


  public String getAccountSweepTargetAccount() {
    return accountSweepTargetAccount;
  }

  public void setAccountSweepTargetAccount(String accountSweepTargetAccount) {
    this.accountSweepTargetAccount = accountSweepTargetAccount;
  }

  public BQAccountSweepUpdateInputModelAccountSweepInstanceRecordSweepApplicationRecord accountSweepAmount(String accountSweepAmount) {
    this.accountSweepAmount = accountSweepAmount;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The amount transferred to or from the account 
   * @return accountSweepAmount
  */
  @ApiModelProperty(example = "USD 250", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The amount transferred to or from the account ")


  public String getAccountSweepAmount() {
    return accountSweepAmount;
  }

  public void setAccountSweepAmount(String accountSweepAmount) {
    this.accountSweepAmount = accountSweepAmount;
  }

  public BQAccountSweepUpdateInputModelAccountSweepInstanceRecordSweepApplicationRecord accountSweepExecutionDate(String accountSweepExecutionDate) {
    this.accountSweepExecutionDate = accountSweepExecutionDate;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date and time the sweep is initiated 
   * @return accountSweepExecutionDate
  */
  @ApiModelProperty(example = "09-22-2018", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date and time the sweep is initiated ")


  public String getAccountSweepExecutionDate() {
    return accountSweepExecutionDate;
  }

  public void setAccountSweepExecutionDate(String accountSweepExecutionDate) {
    this.accountSweepExecutionDate = accountSweepExecutionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountSweepUpdateInputModelAccountSweepInstanceRecordSweepApplicationRecord bqAccountSweepUpdateInputModelAccountSweepInstanceRecordSweepApplicationRecord = (BQAccountSweepUpdateInputModelAccountSweepInstanceRecordSweepApplicationRecord) o;
    return Objects.equals(this.accountSweepTargetAccount, bqAccountSweepUpdateInputModelAccountSweepInstanceRecordSweepApplicationRecord.accountSweepTargetAccount) &&
        Objects.equals(this.accountSweepAmount, bqAccountSweepUpdateInputModelAccountSweepInstanceRecordSweepApplicationRecord.accountSweepAmount) &&
        Objects.equals(this.accountSweepExecutionDate, bqAccountSweepUpdateInputModelAccountSweepInstanceRecordSweepApplicationRecord.accountSweepExecutionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSweepTargetAccount, accountSweepAmount, accountSweepExecutionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountSweepUpdateInputModelAccountSweepInstanceRecordSweepApplicationRecord {\n");
    
    sb.append("    accountSweepTargetAccount: ").append(toIndentedString(accountSweepTargetAccount)).append("\n");
    sb.append("    accountSweepAmount: ").append(toIndentedString(accountSweepAmount)).append("\n");
    sb.append("    accountSweepExecutionDate: ").append(toIndentedString(accountSweepExecutionDate)).append("\n");
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

