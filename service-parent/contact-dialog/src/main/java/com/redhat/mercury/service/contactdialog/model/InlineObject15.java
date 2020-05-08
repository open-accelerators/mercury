package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdUpdateDepositsAndWithdrawalsInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject15
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class InlineObject15   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceReference")
  private String currentAccountFulfillmentArrangementInstanceReference;

  @JsonProperty("depositsAndWithdrawalsInstanceReference")
  private String depositsAndWithdrawalsInstanceReference;

  @JsonProperty("depositsAndWithdrawalsInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdUpdateDepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord;

  @JsonProperty("depositsAndWithdrawalsUpdateActionTaskRecord")
  private Object depositsAndWithdrawalsUpdateActionTaskRecord;

  @JsonProperty("depositsAndWithdrawalsUpdateActionRequest")
  private String depositsAndWithdrawalsUpdateActionRequest;

  public InlineObject15 currentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance 
   * @return currentAccountFulfillmentArrangementInstanceReference
  */
  @ApiModelProperty(example = "CAFAIR724225", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance ")


  public String getCurrentAccountFulfillmentArrangementInstanceReference() {
    return currentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
  }

  public InlineObject15 depositsAndWithdrawalsInstanceReference(String depositsAndWithdrawalsInstanceReference) {
    this.depositsAndWithdrawalsInstanceReference = depositsAndWithdrawalsInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Deposits And Withdrawals instance 
   * @return depositsAndWithdrawalsInstanceReference
  */
  @ApiModelProperty(example = "DAWIR754511", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Deposits And Withdrawals instance ")


  public String getDepositsAndWithdrawalsInstanceReference() {
    return depositsAndWithdrawalsInstanceReference;
  }

  public void setDepositsAndWithdrawalsInstanceReference(String depositsAndWithdrawalsInstanceReference) {
    this.depositsAndWithdrawalsInstanceReference = depositsAndWithdrawalsInstanceReference;
  }

  public InlineObject15 depositsAndWithdrawalsInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdUpdateDepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord) {
    this.depositsAndWithdrawalsInstanceRecord = depositsAndWithdrawalsInstanceRecord;
    return this;
  }

  /**
   * Get depositsAndWithdrawalsInstanceRecord
   * @return depositsAndWithdrawalsInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdUpdateDepositsAndWithdrawalsInstanceRecord getDepositsAndWithdrawalsInstanceRecord() {
    return depositsAndWithdrawalsInstanceRecord;
  }

  public void setDepositsAndWithdrawalsInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdUpdateDepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord) {
    this.depositsAndWithdrawalsInstanceRecord = depositsAndWithdrawalsInstanceRecord;
  }

  public InlineObject15 depositsAndWithdrawalsUpdateActionTaskRecord(Object depositsAndWithdrawalsUpdateActionTaskRecord) {
    this.depositsAndWithdrawalsUpdateActionTaskRecord = depositsAndWithdrawalsUpdateActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return depositsAndWithdrawalsUpdateActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")

  @Valid

  public Object getDepositsAndWithdrawalsUpdateActionTaskRecord() {
    return depositsAndWithdrawalsUpdateActionTaskRecord;
  }

  public void setDepositsAndWithdrawalsUpdateActionTaskRecord(Object depositsAndWithdrawalsUpdateActionTaskRecord) {
    this.depositsAndWithdrawalsUpdateActionTaskRecord = depositsAndWithdrawalsUpdateActionTaskRecord;
  }

  public InlineObject15 depositsAndWithdrawalsUpdateActionRequest(String depositsAndWithdrawalsUpdateActionRequest) {
    this.depositsAndWithdrawalsUpdateActionRequest = depositsAndWithdrawalsUpdateActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return depositsAndWithdrawalsUpdateActionRequest
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request ")


  public String getDepositsAndWithdrawalsUpdateActionRequest() {
    return depositsAndWithdrawalsUpdateActionRequest;
  }

  public void setDepositsAndWithdrawalsUpdateActionRequest(String depositsAndWithdrawalsUpdateActionRequest) {
    this.depositsAndWithdrawalsUpdateActionRequest = depositsAndWithdrawalsUpdateActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject15 inlineObject15 = (InlineObject15) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceReference, inlineObject15.currentAccountFulfillmentArrangementInstanceReference) &&
        Objects.equals(this.depositsAndWithdrawalsInstanceReference, inlineObject15.depositsAndWithdrawalsInstanceReference) &&
        Objects.equals(this.depositsAndWithdrawalsInstanceRecord, inlineObject15.depositsAndWithdrawalsInstanceRecord) &&
        Objects.equals(this.depositsAndWithdrawalsUpdateActionTaskRecord, inlineObject15.depositsAndWithdrawalsUpdateActionTaskRecord) &&
        Objects.equals(this.depositsAndWithdrawalsUpdateActionRequest, inlineObject15.depositsAndWithdrawalsUpdateActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceReference, depositsAndWithdrawalsInstanceReference, depositsAndWithdrawalsInstanceRecord, depositsAndWithdrawalsUpdateActionTaskRecord, depositsAndWithdrawalsUpdateActionRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject15 {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceReference: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReference)).append("\n");
    sb.append("    depositsAndWithdrawalsInstanceReference: ").append(toIndentedString(depositsAndWithdrawalsInstanceReference)).append("\n");
    sb.append("    depositsAndWithdrawalsInstanceRecord: ").append(toIndentedString(depositsAndWithdrawalsInstanceRecord)).append("\n");
    sb.append("    depositsAndWithdrawalsUpdateActionTaskRecord: ").append(toIndentedString(depositsAndWithdrawalsUpdateActionTaskRecord)).append("\n");
    sb.append("    depositsAndWithdrawalsUpdateActionRequest: ").append(toIndentedString(depositsAndWithdrawalsUpdateActionRequest)).append("\n");
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

