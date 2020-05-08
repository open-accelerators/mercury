package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienBqReferenceIdExchangeAccountLienExchangeActionRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAccountLienExchangeInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQAccountLienExchangeInputModel   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceReference")
  private String currentAccountFulfillmentArrangementInstanceReference;

  @JsonProperty("accountLienInstanceReference")
  private String accountLienInstanceReference;

  @JsonProperty("accountLienExchangeActionTaskRecord")
  private Object accountLienExchangeActionTaskRecord;

  @JsonProperty("accountLienExchangeActionRequest")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienBqReferenceIdExchangeAccountLienExchangeActionRequest accountLienExchangeActionRequest;

  public BQAccountLienExchangeInputModel currentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance 
   * @return currentAccountFulfillmentArrangementInstanceReference
  */
  @ApiModelProperty(example = "CAFAIR749898", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance ")


  public String getCurrentAccountFulfillmentArrangementInstanceReference() {
    return currentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
  }

  public BQAccountLienExchangeInputModel accountLienInstanceReference(String accountLienInstanceReference) {
    this.accountLienInstanceReference = accountLienInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Lien instance 
   * @return accountLienInstanceReference
  */
  @ApiModelProperty(example = "ALIR719611", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Lien instance ")


  public String getAccountLienInstanceReference() {
    return accountLienInstanceReference;
  }

  public void setAccountLienInstanceReference(String accountLienInstanceReference) {
    this.accountLienInstanceReference = accountLienInstanceReference;
  }

  public BQAccountLienExchangeInputModel accountLienExchangeActionTaskRecord(Object accountLienExchangeActionTaskRecord) {
    this.accountLienExchangeActionTaskRecord = accountLienExchangeActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return accountLienExchangeActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record ")

  @Valid

  public Object getAccountLienExchangeActionTaskRecord() {
    return accountLienExchangeActionTaskRecord;
  }

  public void setAccountLienExchangeActionTaskRecord(Object accountLienExchangeActionTaskRecord) {
    this.accountLienExchangeActionTaskRecord = accountLienExchangeActionTaskRecord;
  }

  public BQAccountLienExchangeInputModel accountLienExchangeActionRequest(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienBqReferenceIdExchangeAccountLienExchangeActionRequest accountLienExchangeActionRequest) {
    this.accountLienExchangeActionRequest = accountLienExchangeActionRequest;
    return this;
  }

  /**
   * Get accountLienExchangeActionRequest
   * @return accountLienExchangeActionRequest
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienBqReferenceIdExchangeAccountLienExchangeActionRequest getAccountLienExchangeActionRequest() {
    return accountLienExchangeActionRequest;
  }

  public void setAccountLienExchangeActionRequest(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienBqReferenceIdExchangeAccountLienExchangeActionRequest accountLienExchangeActionRequest) {
    this.accountLienExchangeActionRequest = accountLienExchangeActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountLienExchangeInputModel bqAccountLienExchangeInputModel = (BQAccountLienExchangeInputModel) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceReference, bqAccountLienExchangeInputModel.currentAccountFulfillmentArrangementInstanceReference) &&
        Objects.equals(this.accountLienInstanceReference, bqAccountLienExchangeInputModel.accountLienInstanceReference) &&
        Objects.equals(this.accountLienExchangeActionTaskRecord, bqAccountLienExchangeInputModel.accountLienExchangeActionTaskRecord) &&
        Objects.equals(this.accountLienExchangeActionRequest, bqAccountLienExchangeInputModel.accountLienExchangeActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceReference, accountLienInstanceReference, accountLienExchangeActionTaskRecord, accountLienExchangeActionRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountLienExchangeInputModel {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceReference: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReference)).append("\n");
    sb.append("    accountLienInstanceReference: ").append(toIndentedString(accountLienInstanceReference)).append("\n");
    sb.append("    accountLienExchangeActionTaskRecord: ").append(toIndentedString(accountLienExchangeActionTaskRecord)).append("\n");
    sb.append("    accountLienExchangeActionRequest: ").append(toIndentedString(accountLienExchangeActionRequest)).append("\n");
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

