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
 * BQAccountSweepInitiateInputModelAccountSweepInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQAccountSweepInitiateInputModelAccountSweepInstanceRecord   {
  @JsonProperty("accountSweepType")
  private String accountSweepType;

  @JsonProperty("accountSweepApplicationSchedule")
  private String accountSweepApplicationSchedule;

  @JsonProperty("accountSweepConfiguration")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration accountSweepConfiguration;

  public BQAccountSweepInitiateInputModelAccountSweepInstanceRecord accountSweepType(String accountSweepType) {
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

  public BQAccountSweepInitiateInputModelAccountSweepInstanceRecord accountSweepApplicationSchedule(String accountSweepApplicationSchedule) {
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

  public BQAccountSweepInitiateInputModelAccountSweepInstanceRecord accountSweepConfiguration(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration accountSweepConfiguration) {
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
    BQAccountSweepInitiateInputModelAccountSweepInstanceRecord bqAccountSweepInitiateInputModelAccountSweepInstanceRecord = (BQAccountSweepInitiateInputModelAccountSweepInstanceRecord) o;
    return Objects.equals(this.accountSweepType, bqAccountSweepInitiateInputModelAccountSweepInstanceRecord.accountSweepType) &&
        Objects.equals(this.accountSweepApplicationSchedule, bqAccountSweepInitiateInputModelAccountSweepInstanceRecord.accountSweepApplicationSchedule) &&
        Objects.equals(this.accountSweepConfiguration, bqAccountSweepInitiateInputModelAccountSweepInstanceRecord.accountSweepConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSweepType, accountSweepApplicationSchedule, accountSweepConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountSweepInitiateInputModelAccountSweepInstanceRecord {\n");
    
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

