package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration   {
  @JsonProperty("targetAccount")
  private String targetAccount;

  @JsonProperty("sweepMandate")
  private String sweepMandate;

  @JsonProperty("sweepProcessingSchedule")
  private String sweepProcessingSchedule;

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration targetAccount(String targetAccount) {
    this.targetAccount = targetAccount;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The facility that the sweep is made to/from 
   * @return targetAccount
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The facility that the sweep is made to/from ")


  public String getTargetAccount() {
    return targetAccount;
  }

  public void setTargetAccount(String targetAccount) {
    this.targetAccount = targetAccount;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration sweepMandate(String sweepMandate) {
    this.sweepMandate = sweepMandate;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Confirmation that the sweep processing is sanctioned as necessary 
   * @return sweepMandate
  */
  @ApiModelProperty(example = "09-22-2018", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Confirmation that the sweep processing is sanctioned as necessary ")


  public String getSweepMandate() {
    return sweepMandate;
  }

  public void setSweepMandate(String sweepMandate) {
    this.sweepMandate = sweepMandate;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration sweepProcessingSchedule(String sweepProcessingSchedule) {
    this.sweepProcessingSchedule = sweepProcessingSchedule;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timing and or triggers for initiating sweep transaction 
   * @return sweepProcessingSchedule
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timing and or triggers for initiating sweep transaction ")


  public String getSweepProcessingSchedule() {
    return sweepProcessingSchedule;
  }

  public void setSweepProcessingSchedule(String sweepProcessingSchedule) {
    this.sweepProcessingSchedule = sweepProcessingSchedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration = (CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration) o;
    return Objects.equals(this.targetAccount, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration.targetAccount) &&
        Objects.equals(this.sweepMandate, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration.sweepMandate) &&
        Objects.equals(this.sweepProcessingSchedule, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration.sweepProcessingSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetAccount, sweepMandate, sweepProcessingSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepInitiationAccountSweepInstanceRecordAccountSweepConfiguration {\n");
    
    sb.append("    targetAccount: ").append(toIndentedString(targetAccount)).append("\n");
    sb.append("    sweepMandate: ").append(toIndentedString(sweepMandate)).append("\n");
    sb.append("    sweepProcessingSchedule: ").append(toIndentedString(sweepProcessingSchedule)).append("\n");
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

