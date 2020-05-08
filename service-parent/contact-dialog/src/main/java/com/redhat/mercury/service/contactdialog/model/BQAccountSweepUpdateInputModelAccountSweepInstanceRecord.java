package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecordSweepApplicationRecord;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAccountSweepUpdateInputModelAccountSweepInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class BQAccountSweepUpdateInputModelAccountSweepInstanceRecord   {
  @JsonProperty("accountSweepType")
  private String accountSweepType;

  @JsonProperty("accountSweepDefinition")
  private String accountSweepDefinition;

  @JsonProperty("accountSweepApplicationSchedule")
  private String accountSweepApplicationSchedule;

  @JsonProperty("accountSweepConfiguration")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration accountSweepConfiguration;

  @JsonProperty("sweepApplicationRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecordSweepApplicationRecord sweepApplicationRecord;

  public BQAccountSweepUpdateInputModelAccountSweepInstanceRecord accountSweepType(String accountSweepType) {
    this.accountSweepType = accountSweepType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of sweep (e.g. periodic, threshold) 
   * @return accountSweepType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of sweep (e.g. periodic, threshold) ")


  public String getAccountSweepType() {
    return accountSweepType;
  }

  public void setAccountSweepType(String accountSweepType) {
    this.accountSweepType = accountSweepType;
  }

  public BQAccountSweepUpdateInputModelAccountSweepInstanceRecord accountSweepDefinition(String accountSweepDefinition) {
    this.accountSweepDefinition = accountSweepDefinition;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the type of sweep 
   * @return accountSweepDefinition
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the type of sweep ")


  public String getAccountSweepDefinition() {
    return accountSweepDefinition;
  }

  public void setAccountSweepDefinition(String accountSweepDefinition) {
    this.accountSweepDefinition = accountSweepDefinition;
  }

  public BQAccountSweepUpdateInputModelAccountSweepInstanceRecord accountSweepApplicationSchedule(String accountSweepApplicationSchedule) {
    this.accountSweepApplicationSchedule = accountSweepApplicationSchedule;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Sweep processing guidelines and scheduling rules 
   * @return accountSweepApplicationSchedule
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Sweep processing guidelines and scheduling rules ")


  public String getAccountSweepApplicationSchedule() {
    return accountSweepApplicationSchedule;
  }

  public void setAccountSweepApplicationSchedule(String accountSweepApplicationSchedule) {
    this.accountSweepApplicationSchedule = accountSweepApplicationSchedule;
  }

  public BQAccountSweepUpdateInputModelAccountSweepInstanceRecord accountSweepConfiguration(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration accountSweepConfiguration) {
    this.accountSweepConfiguration = accountSweepConfiguration;
    return this;
  }

  /**
   * Get accountSweepConfiguration
   * @return accountSweepConfiguration
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration getAccountSweepConfiguration() {
    return accountSweepConfiguration;
  }

  public void setAccountSweepConfiguration(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration accountSweepConfiguration) {
    this.accountSweepConfiguration = accountSweepConfiguration;
  }

  public BQAccountSweepUpdateInputModelAccountSweepInstanceRecord sweepApplicationRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecordSweepApplicationRecord sweepApplicationRecord) {
    this.sweepApplicationRecord = sweepApplicationRecord;
    return this;
  }

  /**
   * Get sweepApplicationRecord
   * @return sweepApplicationRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecordSweepApplicationRecord getSweepApplicationRecord() {
    return sweepApplicationRecord;
  }

  public void setSweepApplicationRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecordSweepApplicationRecord sweepApplicationRecord) {
    this.sweepApplicationRecord = sweepApplicationRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountSweepUpdateInputModelAccountSweepInstanceRecord bqAccountSweepUpdateInputModelAccountSweepInstanceRecord = (BQAccountSweepUpdateInputModelAccountSweepInstanceRecord) o;
    return Objects.equals(this.accountSweepType, bqAccountSweepUpdateInputModelAccountSweepInstanceRecord.accountSweepType) &&
        Objects.equals(this.accountSweepDefinition, bqAccountSweepUpdateInputModelAccountSweepInstanceRecord.accountSweepDefinition) &&
        Objects.equals(this.accountSweepApplicationSchedule, bqAccountSweepUpdateInputModelAccountSweepInstanceRecord.accountSweepApplicationSchedule) &&
        Objects.equals(this.accountSweepConfiguration, bqAccountSweepUpdateInputModelAccountSweepInstanceRecord.accountSweepConfiguration) &&
        Objects.equals(this.sweepApplicationRecord, bqAccountSweepUpdateInputModelAccountSweepInstanceRecord.sweepApplicationRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSweepType, accountSweepDefinition, accountSweepApplicationSchedule, accountSweepConfiguration, sweepApplicationRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountSweepUpdateInputModelAccountSweepInstanceRecord {\n");
    
    sb.append("    accountSweepType: ").append(toIndentedString(accountSweepType)).append("\n");
    sb.append("    accountSweepDefinition: ").append(toIndentedString(accountSweepDefinition)).append("\n");
    sb.append("    accountSweepApplicationSchedule: ").append(toIndentedString(accountSweepApplicationSchedule)).append("\n");
    sb.append("    accountSweepConfiguration: ").append(toIndentedString(accountSweepConfiguration)).append("\n");
    sb.append("    sweepApplicationRecord: ").append(toIndentedString(sweepApplicationRecord)).append("\n");
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

