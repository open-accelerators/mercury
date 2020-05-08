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
 * InlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class InlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction   {
  @JsonProperty("depositTransactionSourceReference")
  private String depositTransactionSourceReference;

  @JsonProperty("depositTransactionDepositType")
  private String depositTransactionDepositType;

  @JsonProperty("depositTransactionDescription")
  private String depositTransactionDescription;

  @JsonProperty("depositTransactionAmount")
  private String depositTransactionAmount;

  @JsonProperty("depositTransactionDate")
  private String depositTransactionDate;

  public InlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransactionSourceReference(String depositTransactionSourceReference) {
    this.depositTransactionSourceReference = depositTransactionSourceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Identifies the source of the deposit 
   * @return depositTransactionSourceReference
  */
  @ApiModelProperty(example = "752074", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Identifies the source of the deposit ")


  public String getDepositTransactionSourceReference() {
    return depositTransactionSourceReference;
  }

  public void setDepositTransactionSourceReference(String depositTransactionSourceReference) {
    this.depositTransactionSourceReference = depositTransactionSourceReference;
  }

  public InlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransactionDepositType(String depositTransactionDepositType) {
    this.depositTransactionDepositType = depositTransactionDepositType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of deposit made with the transaction 
   * @return depositTransactionDepositType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of deposit made with the transaction ")


  public String getDepositTransactionDepositType() {
    return depositTransactionDepositType;
  }

  public void setDepositTransactionDepositType(String depositTransactionDepositType) {
    this.depositTransactionDepositType = depositTransactionDepositType;
  }

  public InlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransactionDescription(String depositTransactionDescription) {
    this.depositTransactionDescription = depositTransactionDescription;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any necessary details describing the purpose or reference properties of the deposit 
   * @return depositTransactionDescription
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any necessary details describing the purpose or reference properties of the deposit ")


  public String getDepositTransactionDescription() {
    return depositTransactionDescription;
  }

  public void setDepositTransactionDescription(String depositTransactionDescription) {
    this.depositTransactionDescription = depositTransactionDescription;
  }

  public InlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransactionAmount(String depositTransactionAmount) {
    this.depositTransactionAmount = depositTransactionAmount;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The deposited amount 
   * @return depositTransactionAmount
  */
  @ApiModelProperty(example = "USD 250", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The deposited amount ")


  public String getDepositTransactionAmount() {
    return depositTransactionAmount;
  }

  public void setDepositTransactionAmount(String depositTransactionAmount) {
    this.depositTransactionAmount = depositTransactionAmount;
  }

  public InlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction depositTransactionDate(String depositTransactionDate) {
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
    InlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction inlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction = (InlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction) o;
    return Objects.equals(this.depositTransactionSourceReference, inlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction.depositTransactionSourceReference) &&
        Objects.equals(this.depositTransactionDepositType, inlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction.depositTransactionDepositType) &&
        Objects.equals(this.depositTransactionDescription, inlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction.depositTransactionDescription) &&
        Objects.equals(this.depositTransactionAmount, inlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction.depositTransactionAmount) &&
        Objects.equals(this.depositTransactionDate, inlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction.depositTransactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositTransactionSourceReference, depositTransactionDepositType, depositTransactionDescription, depositTransactionAmount, depositTransactionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20017DepositsAndWithdrawalsInstanceRecordDepositTransaction {\n");
    
    sb.append("    depositTransactionSourceReference: ").append(toIndentedString(depositTransactionSourceReference)).append("\n");
    sb.append("    depositTransactionDepositType: ").append(toIndentedString(depositTransactionDepositType)).append("\n");
    sb.append("    depositTransactionDescription: ").append(toIndentedString(depositTransactionDescription)).append("\n");
    sb.append("    depositTransactionAmount: ").append(toIndentedString(depositTransactionAmount)).append("\n");
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

