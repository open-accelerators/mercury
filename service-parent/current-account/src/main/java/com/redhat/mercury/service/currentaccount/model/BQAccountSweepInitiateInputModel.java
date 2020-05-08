package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecord;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationCurrentAccountFulfillmentArrangementInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAccountSweepInitiateInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class BQAccountSweepInitiateInputModel   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord;

  @JsonProperty("currentAccountFulfillmentArrangementInstanceReference")
  private String currentAccountFulfillmentArrangementInstanceReference;

  @JsonProperty("accountSweepInitiateActionRecord")
  private Object accountSweepInitiateActionRecord;

  @JsonProperty("accountSweepInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecord accountSweepInstanceRecord;

  public BQAccountSweepInitiateInputModel currentAccountFulfillmentArrangementInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
    return this;
  }

  /**
   * Get currentAccountFulfillmentArrangementInstanceRecord
   * @return currentAccountFulfillmentArrangementInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationCurrentAccountFulfillmentArrangementInstanceRecord getCurrentAccountFulfillmentArrangementInstanceRecord() {
    return currentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
  }

  public BQAccountSweepInitiateInputModel currentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance 
   * @return currentAccountFulfillmentArrangementInstanceReference
  */
  @ApiModelProperty(example = "CAFAIR727507", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance ")


  public String getCurrentAccountFulfillmentArrangementInstanceReference() {
    return currentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
  }

  public BQAccountSweepInitiateInputModel accountSweepInitiateActionRecord(Object accountSweepInitiateActionRecord) {
    this.accountSweepInitiateActionRecord = accountSweepInitiateActionRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return accountSweepInitiateActionRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record ")

  @Valid

  public Object getAccountSweepInitiateActionRecord() {
    return accountSweepInitiateActionRecord;
  }

  public void setAccountSweepInitiateActionRecord(Object accountSweepInitiateActionRecord) {
    this.accountSweepInitiateActionRecord = accountSweepInitiateActionRecord;
  }

  public BQAccountSweepInitiateInputModel accountSweepInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecord accountSweepInstanceRecord) {
    this.accountSweepInstanceRecord = accountSweepInstanceRecord;
    return this;
  }

  /**
   * Get accountSweepInstanceRecord
   * @return accountSweepInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecord getAccountSweepInstanceRecord() {
    return accountSweepInstanceRecord;
  }

  public void setAccountSweepInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecord accountSweepInstanceRecord) {
    this.accountSweepInstanceRecord = accountSweepInstanceRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountSweepInitiateInputModel bqAccountSweepInitiateInputModel = (BQAccountSweepInitiateInputModel) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceRecord, bqAccountSweepInitiateInputModel.currentAccountFulfillmentArrangementInstanceRecord) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInstanceReference, bqAccountSweepInitiateInputModel.currentAccountFulfillmentArrangementInstanceReference) &&
        Objects.equals(this.accountSweepInitiateActionRecord, bqAccountSweepInitiateInputModel.accountSweepInitiateActionRecord) &&
        Objects.equals(this.accountSweepInstanceRecord, bqAccountSweepInitiateInputModel.accountSweepInstanceRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceRecord, currentAccountFulfillmentArrangementInstanceReference, accountSweepInitiateActionRecord, accountSweepInstanceRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountSweepInitiateInputModel {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceRecord)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInstanceReference: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReference)).append("\n");
    sb.append("    accountSweepInitiateActionRecord: ").append(toIndentedString(accountSweepInitiateActionRecord)).append("\n");
    sb.append("    accountSweepInstanceRecord: ").append(toIndentedString(accountSweepInstanceRecord)).append("\n");
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

