package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienBqReferenceIdUpdateAccountLienInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject9
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class InlineObject9   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceReference")
  private String currentAccountFulfillmentArrangementInstanceReference;

  @JsonProperty("accountLienInstanceReference")
  private String accountLienInstanceReference;

  @JsonProperty("accountLienInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienBqReferenceIdUpdateAccountLienInstanceRecord accountLienInstanceRecord;

  @JsonProperty("accountLienUpdateActionTaskRecord")
  private Object accountLienUpdateActionTaskRecord;

  @JsonProperty("accountLienUpdateActionRequest")
  private String accountLienUpdateActionRequest;

  public InlineObject9 currentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance 
   * @return currentAccountFulfillmentArrangementInstanceReference
  */
  @ApiModelProperty(example = "CAFAIR757645", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance ")


  public String getCurrentAccountFulfillmentArrangementInstanceReference() {
    return currentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
  }

  public InlineObject9 accountLienInstanceReference(String accountLienInstanceReference) {
    this.accountLienInstanceReference = accountLienInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Lien instance 
   * @return accountLienInstanceReference
  */
  @ApiModelProperty(example = "ALIR756900", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Lien instance ")


  public String getAccountLienInstanceReference() {
    return accountLienInstanceReference;
  }

  public void setAccountLienInstanceReference(String accountLienInstanceReference) {
    this.accountLienInstanceReference = accountLienInstanceReference;
  }

  public InlineObject9 accountLienInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienBqReferenceIdUpdateAccountLienInstanceRecord accountLienInstanceRecord) {
    this.accountLienInstanceRecord = accountLienInstanceRecord;
    return this;
  }

  /**
   * Get accountLienInstanceRecord
   * @return accountLienInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienBqReferenceIdUpdateAccountLienInstanceRecord getAccountLienInstanceRecord() {
    return accountLienInstanceRecord;
  }

  public void setAccountLienInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienBqReferenceIdUpdateAccountLienInstanceRecord accountLienInstanceRecord) {
    this.accountLienInstanceRecord = accountLienInstanceRecord;
  }

  public InlineObject9 accountLienUpdateActionTaskRecord(Object accountLienUpdateActionTaskRecord) {
    this.accountLienUpdateActionTaskRecord = accountLienUpdateActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return accountLienUpdateActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")

  @Valid

  public Object getAccountLienUpdateActionTaskRecord() {
    return accountLienUpdateActionTaskRecord;
  }

  public void setAccountLienUpdateActionTaskRecord(Object accountLienUpdateActionTaskRecord) {
    this.accountLienUpdateActionTaskRecord = accountLienUpdateActionTaskRecord;
  }

  public InlineObject9 accountLienUpdateActionRequest(String accountLienUpdateActionRequest) {
    this.accountLienUpdateActionRequest = accountLienUpdateActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return accountLienUpdateActionRequest
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request ")


  public String getAccountLienUpdateActionRequest() {
    return accountLienUpdateActionRequest;
  }

  public void setAccountLienUpdateActionRequest(String accountLienUpdateActionRequest) {
    this.accountLienUpdateActionRequest = accountLienUpdateActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject9 inlineObject9 = (InlineObject9) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceReference, inlineObject9.currentAccountFulfillmentArrangementInstanceReference) &&
        Objects.equals(this.accountLienInstanceReference, inlineObject9.accountLienInstanceReference) &&
        Objects.equals(this.accountLienInstanceRecord, inlineObject9.accountLienInstanceRecord) &&
        Objects.equals(this.accountLienUpdateActionTaskRecord, inlineObject9.accountLienUpdateActionTaskRecord) &&
        Objects.equals(this.accountLienUpdateActionRequest, inlineObject9.accountLienUpdateActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceReference, accountLienInstanceReference, accountLienInstanceRecord, accountLienUpdateActionTaskRecord, accountLienUpdateActionRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject9 {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceReference: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReference)).append("\n");
    sb.append("    accountLienInstanceReference: ").append(toIndentedString(accountLienInstanceReference)).append("\n");
    sb.append("    accountLienInstanceRecord: ").append(toIndentedString(accountLienInstanceRecord)).append("\n");
    sb.append("    accountLienUpdateActionTaskRecord: ").append(toIndentedString(accountLienUpdateActionTaskRecord)).append("\n");
    sb.append("    accountLienUpdateActionRequest: ").append(toIndentedString(accountLienUpdateActionRequest)).append("\n");
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

