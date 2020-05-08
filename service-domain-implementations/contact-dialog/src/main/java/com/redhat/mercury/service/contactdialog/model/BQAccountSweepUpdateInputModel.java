package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAccountSweepUpdateInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQAccountSweepUpdateInputModel   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceReference")
  private String currentAccountFulfillmentArrangementInstanceReference;

  @JsonProperty("accountSweepInstanceReference")
  private String accountSweepInstanceReference;

  @JsonProperty("accountSweepInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecord accountSweepInstanceRecord;

  @JsonProperty("accountSweepUpdateActionTaskRecord")
  private Object accountSweepUpdateActionTaskRecord;

  @JsonProperty("accountSweepUpdateActionRequest")
  private String accountSweepUpdateActionRequest;

  public BQAccountSweepUpdateInputModel currentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance 
   * @return currentAccountFulfillmentArrangementInstanceReference
  */
  @ApiModelProperty(example = "CAFAIR783334", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance ")


  public String getCurrentAccountFulfillmentArrangementInstanceReference() {
    return currentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
  }

  public BQAccountSweepUpdateInputModel accountSweepInstanceReference(String accountSweepInstanceReference) {
    this.accountSweepInstanceReference = accountSweepInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Sweep instance 
   * @return accountSweepInstanceReference
  */
  @ApiModelProperty(example = "ASIR789493", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Sweep instance ")


  public String getAccountSweepInstanceReference() {
    return accountSweepInstanceReference;
  }

  public void setAccountSweepInstanceReference(String accountSweepInstanceReference) {
    this.accountSweepInstanceReference = accountSweepInstanceReference;
  }

  public BQAccountSweepUpdateInputModel accountSweepInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecord accountSweepInstanceRecord) {
    this.accountSweepInstanceRecord = accountSweepInstanceRecord;
    return this;
  }

  /**
   * Get accountSweepInstanceRecord
   * @return accountSweepInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecord getAccountSweepInstanceRecord() {
    return accountSweepInstanceRecord;
  }

  public void setAccountSweepInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecord accountSweepInstanceRecord) {
    this.accountSweepInstanceRecord = accountSweepInstanceRecord;
  }

  public BQAccountSweepUpdateInputModel accountSweepUpdateActionTaskRecord(Object accountSweepUpdateActionTaskRecord) {
    this.accountSweepUpdateActionTaskRecord = accountSweepUpdateActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return accountSweepUpdateActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")

  @Valid

  public Object getAccountSweepUpdateActionTaskRecord() {
    return accountSweepUpdateActionTaskRecord;
  }

  public void setAccountSweepUpdateActionTaskRecord(Object accountSweepUpdateActionTaskRecord) {
    this.accountSweepUpdateActionTaskRecord = accountSweepUpdateActionTaskRecord;
  }

  public BQAccountSweepUpdateInputModel accountSweepUpdateActionRequest(String accountSweepUpdateActionRequest) {
    this.accountSweepUpdateActionRequest = accountSweepUpdateActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return accountSweepUpdateActionRequest
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request ")


  public String getAccountSweepUpdateActionRequest() {
    return accountSweepUpdateActionRequest;
  }

  public void setAccountSweepUpdateActionRequest(String accountSweepUpdateActionRequest) {
    this.accountSweepUpdateActionRequest = accountSweepUpdateActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountSweepUpdateInputModel bqAccountSweepUpdateInputModel = (BQAccountSweepUpdateInputModel) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceReference, bqAccountSweepUpdateInputModel.currentAccountFulfillmentArrangementInstanceReference) &&
        Objects.equals(this.accountSweepInstanceReference, bqAccountSweepUpdateInputModel.accountSweepInstanceReference) &&
        Objects.equals(this.accountSweepInstanceRecord, bqAccountSweepUpdateInputModel.accountSweepInstanceRecord) &&
        Objects.equals(this.accountSweepUpdateActionTaskRecord, bqAccountSweepUpdateInputModel.accountSweepUpdateActionTaskRecord) &&
        Objects.equals(this.accountSweepUpdateActionRequest, bqAccountSweepUpdateInputModel.accountSweepUpdateActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceReference, accountSweepInstanceReference, accountSweepInstanceRecord, accountSweepUpdateActionTaskRecord, accountSweepUpdateActionRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountSweepUpdateInputModel {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceReference: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReference)).append("\n");
    sb.append("    accountSweepInstanceReference: ").append(toIndentedString(accountSweepInstanceReference)).append("\n");
    sb.append("    accountSweepInstanceRecord: ").append(toIndentedString(accountSweepInstanceRecord)).append("\n");
    sb.append("    accountSweepUpdateActionTaskRecord: ").append(toIndentedString(accountSweepUpdateActionTaskRecord)).append("\n");
    sb.append("    accountSweepUpdateActionRequest: ").append(toIndentedString(accountSweepUpdateActionRequest)).append("\n");
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

