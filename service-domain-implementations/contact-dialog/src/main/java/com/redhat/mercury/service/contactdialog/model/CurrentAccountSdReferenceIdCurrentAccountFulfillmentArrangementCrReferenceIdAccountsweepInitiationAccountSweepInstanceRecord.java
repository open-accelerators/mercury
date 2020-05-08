package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecord   {
  @JsonProperty("accountSweepType")
  private String accountSweepType;

  @JsonProperty("accountSweepApplicationSchedule")
  private String accountSweepApplicationSchedule;

  @JsonProperty("accountSweepConfiguration")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration accountSweepConfiguration;

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecord accountSweepType(String accountSweepType) {
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

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecord accountSweepApplicationSchedule(String accountSweepApplicationSchedule) {
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

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecord accountSweepConfiguration(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration accountSweepConfiguration) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecord currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecord = (CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecord) o;
    return Objects.equals(this.accountSweepType, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecord.accountSweepType) &&
        Objects.equals(this.accountSweepApplicationSchedule, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecord.accountSweepApplicationSchedule) &&
        Objects.equals(this.accountSweepConfiguration, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecord.accountSweepConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSweepType, accountSweepApplicationSchedule, accountSweepConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecord {\n");
    
    sb.append("    accountSweepType: ").append(toIndentedString(accountSweepType)).append("\n");
    sb.append("    accountSweepApplicationSchedule: ").append(toIndentedString(accountSweepApplicationSchedule)).append("\n");
    sb.append("    accountSweepConfiguration: ").append(toIndentedString(accountSweepConfiguration)).append("\n");
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

