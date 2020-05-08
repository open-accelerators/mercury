package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2012CurrentAccountFulfillmentArrangementInstanceRecord;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2014AccountSweepInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAccountSweepInitiateOutputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQAccountSweepInitiateOutputModel   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceRecord")
  private InlineResponse2012CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord;

  @JsonProperty("accountSweepInstanceReference")
  private String accountSweepInstanceReference;

  @JsonProperty("accountSweepInitiateActionReference")
  private String accountSweepInitiateActionReference;

  @JsonProperty("accountSweepInitiateActionRecord")
  private Object accountSweepInitiateActionRecord;

  @JsonProperty("accountSweepInstanceStatus")
  private String accountSweepInstanceStatus;

  @JsonProperty("accountSweepInstanceRecord")
  private InlineResponse2014AccountSweepInstanceRecord accountSweepInstanceRecord;

  public BQAccountSweepInitiateOutputModel currentAccountFulfillmentArrangementInstanceRecord(InlineResponse2012CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
    return this;
  }

  /**
   * Get currentAccountFulfillmentArrangementInstanceRecord
   * @return currentAccountFulfillmentArrangementInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2012CurrentAccountFulfillmentArrangementInstanceRecord getCurrentAccountFulfillmentArrangementInstanceRecord() {
    return currentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceRecord(InlineResponse2012CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
  }

  public BQAccountSweepInitiateOutputModel accountSweepInstanceReference(String accountSweepInstanceReference) {
    this.accountSweepInstanceReference = accountSweepInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Sweep instance 
   * @return accountSweepInstanceReference
  */
  @ApiModelProperty(example = "ASIR701969", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Sweep instance ")


  public String getAccountSweepInstanceReference() {
    return accountSweepInstanceReference;
  }

  public void setAccountSweepInstanceReference(String accountSweepInstanceReference) {
    this.accountSweepInstanceReference = accountSweepInstanceReference;
  }

  public BQAccountSweepInitiateOutputModel accountSweepInitiateActionReference(String accountSweepInitiateActionReference) {
    this.accountSweepInitiateActionReference = accountSweepInitiateActionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return accountSweepInitiateActionReference
  */
  @ApiModelProperty(example = "ASIAR795191", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call ")


  public String getAccountSweepInitiateActionReference() {
    return accountSweepInitiateActionReference;
  }

  public void setAccountSweepInitiateActionReference(String accountSweepInitiateActionReference) {
    this.accountSweepInitiateActionReference = accountSweepInitiateActionReference;
  }

  public BQAccountSweepInitiateOutputModel accountSweepInitiateActionRecord(Object accountSweepInitiateActionRecord) {
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

  public BQAccountSweepInitiateOutputModel accountSweepInstanceStatus(String accountSweepInstanceStatus) {
    this.accountSweepInstanceStatus = accountSweepInstanceStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Account Sweep instance (e.g. initialised, pending, active) 
   * @return accountSweepInstanceStatus
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Account Sweep instance (e.g. initialised, pending, active) ")


  public String getAccountSweepInstanceStatus() {
    return accountSweepInstanceStatus;
  }

  public void setAccountSweepInstanceStatus(String accountSweepInstanceStatus) {
    this.accountSweepInstanceStatus = accountSweepInstanceStatus;
  }

  public BQAccountSweepInitiateOutputModel accountSweepInstanceRecord(InlineResponse2014AccountSweepInstanceRecord accountSweepInstanceRecord) {
    this.accountSweepInstanceRecord = accountSweepInstanceRecord;
    return this;
  }

  /**
   * Get accountSweepInstanceRecord
   * @return accountSweepInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2014AccountSweepInstanceRecord getAccountSweepInstanceRecord() {
    return accountSweepInstanceRecord;
  }

  public void setAccountSweepInstanceRecord(InlineResponse2014AccountSweepInstanceRecord accountSweepInstanceRecord) {
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
    BQAccountSweepInitiateOutputModel bqAccountSweepInitiateOutputModel = (BQAccountSweepInitiateOutputModel) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceRecord, bqAccountSweepInitiateOutputModel.currentAccountFulfillmentArrangementInstanceRecord) &&
        Objects.equals(this.accountSweepInstanceReference, bqAccountSweepInitiateOutputModel.accountSweepInstanceReference) &&
        Objects.equals(this.accountSweepInitiateActionReference, bqAccountSweepInitiateOutputModel.accountSweepInitiateActionReference) &&
        Objects.equals(this.accountSweepInitiateActionRecord, bqAccountSweepInitiateOutputModel.accountSweepInitiateActionRecord) &&
        Objects.equals(this.accountSweepInstanceStatus, bqAccountSweepInitiateOutputModel.accountSweepInstanceStatus) &&
        Objects.equals(this.accountSweepInstanceRecord, bqAccountSweepInitiateOutputModel.accountSweepInstanceRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceRecord, accountSweepInstanceReference, accountSweepInitiateActionReference, accountSweepInitiateActionRecord, accountSweepInstanceStatus, accountSweepInstanceRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountSweepInitiateOutputModel {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceRecord)).append("\n");
    sb.append("    accountSweepInstanceReference: ").append(toIndentedString(accountSweepInstanceReference)).append("\n");
    sb.append("    accountSweepInitiateActionReference: ").append(toIndentedString(accountSweepInitiateActionReference)).append("\n");
    sb.append("    accountSweepInitiateActionRecord: ").append(toIndentedString(accountSweepInitiateActionRecord)).append("\n");
    sb.append("    accountSweepInstanceStatus: ").append(toIndentedString(accountSweepInstanceStatus)).append("\n");
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

