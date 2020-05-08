package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.InlineResponse2013AccountLienInstanceRecord;
import com.redhat.mercury.service.currentaccount.model.InlineResponse2013CurrentAccountFulfillmentArrangementInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAccountLienInitiateOutputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class BQAccountLienInitiateOutputModel   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceRecord")
  private InlineResponse2013CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord;

  @JsonProperty("accountLienInstanceReference")
  private String accountLienInstanceReference;

  @JsonProperty("accountLienInitiateActionReference")
  private String accountLienInitiateActionReference;

  @JsonProperty("accountLienInitiateActionRecord")
  private Object accountLienInitiateActionRecord;

  @JsonProperty("accountLienInstanceStatus")
  private String accountLienInstanceStatus;

  @JsonProperty("accountLienInstanceRecord")
  private InlineResponse2013AccountLienInstanceRecord accountLienInstanceRecord;

  public BQAccountLienInitiateOutputModel currentAccountFulfillmentArrangementInstanceRecord(InlineResponse2013CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
    return this;
  }

  /**
   * Get currentAccountFulfillmentArrangementInstanceRecord
   * @return currentAccountFulfillmentArrangementInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2013CurrentAccountFulfillmentArrangementInstanceRecord getCurrentAccountFulfillmentArrangementInstanceRecord() {
    return currentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceRecord(InlineResponse2013CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
  }

  public BQAccountLienInitiateOutputModel accountLienInstanceReference(String accountLienInstanceReference) {
    this.accountLienInstanceReference = accountLienInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Lien instance 
   * @return accountLienInstanceReference
  */
  @ApiModelProperty(example = "ALIR758025", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Lien instance ")


  public String getAccountLienInstanceReference() {
    return accountLienInstanceReference;
  }

  public void setAccountLienInstanceReference(String accountLienInstanceReference) {
    this.accountLienInstanceReference = accountLienInstanceReference;
  }

  public BQAccountLienInitiateOutputModel accountLienInitiateActionReference(String accountLienInitiateActionReference) {
    this.accountLienInitiateActionReference = accountLienInitiateActionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return accountLienInitiateActionReference
  */
  @ApiModelProperty(example = "ALIAR756064", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call ")


  public String getAccountLienInitiateActionReference() {
    return accountLienInitiateActionReference;
  }

  public void setAccountLienInitiateActionReference(String accountLienInitiateActionReference) {
    this.accountLienInitiateActionReference = accountLienInitiateActionReference;
  }

  public BQAccountLienInitiateOutputModel accountLienInitiateActionRecord(Object accountLienInitiateActionRecord) {
    this.accountLienInitiateActionRecord = accountLienInitiateActionRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return accountLienInitiateActionRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record ")

  @Valid

  public Object getAccountLienInitiateActionRecord() {
    return accountLienInitiateActionRecord;
  }

  public void setAccountLienInitiateActionRecord(Object accountLienInitiateActionRecord) {
    this.accountLienInitiateActionRecord = accountLienInitiateActionRecord;
  }

  public BQAccountLienInitiateOutputModel accountLienInstanceStatus(String accountLienInstanceStatus) {
    this.accountLienInstanceStatus = accountLienInstanceStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Account Lien instance (e.g. initialised, pending, active) 
   * @return accountLienInstanceStatus
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Account Lien instance (e.g. initialised, pending, active) ")


  public String getAccountLienInstanceStatus() {
    return accountLienInstanceStatus;
  }

  public void setAccountLienInstanceStatus(String accountLienInstanceStatus) {
    this.accountLienInstanceStatus = accountLienInstanceStatus;
  }

  public BQAccountLienInitiateOutputModel accountLienInstanceRecord(InlineResponse2013AccountLienInstanceRecord accountLienInstanceRecord) {
    this.accountLienInstanceRecord = accountLienInstanceRecord;
    return this;
  }

  /**
   * Get accountLienInstanceRecord
   * @return accountLienInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2013AccountLienInstanceRecord getAccountLienInstanceRecord() {
    return accountLienInstanceRecord;
  }

  public void setAccountLienInstanceRecord(InlineResponse2013AccountLienInstanceRecord accountLienInstanceRecord) {
    this.accountLienInstanceRecord = accountLienInstanceRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountLienInitiateOutputModel bqAccountLienInitiateOutputModel = (BQAccountLienInitiateOutputModel) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceRecord, bqAccountLienInitiateOutputModel.currentAccountFulfillmentArrangementInstanceRecord) &&
        Objects.equals(this.accountLienInstanceReference, bqAccountLienInitiateOutputModel.accountLienInstanceReference) &&
        Objects.equals(this.accountLienInitiateActionReference, bqAccountLienInitiateOutputModel.accountLienInitiateActionReference) &&
        Objects.equals(this.accountLienInitiateActionRecord, bqAccountLienInitiateOutputModel.accountLienInitiateActionRecord) &&
        Objects.equals(this.accountLienInstanceStatus, bqAccountLienInitiateOutputModel.accountLienInstanceStatus) &&
        Objects.equals(this.accountLienInstanceRecord, bqAccountLienInitiateOutputModel.accountLienInstanceRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceRecord, accountLienInstanceReference, accountLienInitiateActionReference, accountLienInitiateActionRecord, accountLienInstanceStatus, accountLienInstanceRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountLienInitiateOutputModel {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceRecord)).append("\n");
    sb.append("    accountLienInstanceReference: ").append(toIndentedString(accountLienInstanceReference)).append("\n");
    sb.append("    accountLienInitiateActionReference: ").append(toIndentedString(accountLienInitiateActionReference)).append("\n");
    sb.append("    accountLienInitiateActionRecord: ").append(toIndentedString(accountLienInitiateActionRecord)).append("\n");
    sb.append("    accountLienInstanceStatus: ").append(toIndentedString(accountLienInstanceStatus)).append("\n");
    sb.append("    accountLienInstanceRecord: ").append(toIndentedString(accountLienInstanceRecord)).append("\n");
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

