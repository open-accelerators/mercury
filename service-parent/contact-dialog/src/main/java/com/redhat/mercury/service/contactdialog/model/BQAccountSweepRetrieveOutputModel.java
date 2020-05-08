package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecord;
import com.redhat.mercury.service.contactdialog.model.InlineResponse20014AccountSweepInstanceAnalysis;
import com.redhat.mercury.service.contactdialog.model.InlineResponse20014AccountSweepInstanceReport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAccountSweepRetrieveOutputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class BQAccountSweepRetrieveOutputModel   {
  @JsonProperty("accountSweepInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecord accountSweepInstanceRecord;

  @JsonProperty("accountSweepRetrieveActionTaskReference")
  private String accountSweepRetrieveActionTaskReference;

  @JsonProperty("accountSweepRetrieveActionTaskRecord")
  private Object accountSweepRetrieveActionTaskRecord;

  @JsonProperty("accountSweepRetrieveActionResponse")
  private String accountSweepRetrieveActionResponse;

  @JsonProperty("accountSweepInstanceReport")
  private InlineResponse20014AccountSweepInstanceReport accountSweepInstanceReport;

  @JsonProperty("accountSweepInstanceAnalysis")
  private InlineResponse20014AccountSweepInstanceAnalysis accountSweepInstanceAnalysis;

  public BQAccountSweepRetrieveOutputModel accountSweepInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecord accountSweepInstanceRecord) {
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

  public BQAccountSweepRetrieveOutputModel accountSweepRetrieveActionTaskReference(String accountSweepRetrieveActionTaskReference) {
    this.accountSweepRetrieveActionTaskReference = accountSweepRetrieveActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Account Sweep instance retrieve service call 
   * @return accountSweepRetrieveActionTaskReference
  */
  @ApiModelProperty(example = "ASRATR743355", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Account Sweep instance retrieve service call ")


  public String getAccountSweepRetrieveActionTaskReference() {
    return accountSweepRetrieveActionTaskReference;
  }

  public void setAccountSweepRetrieveActionTaskReference(String accountSweepRetrieveActionTaskReference) {
    this.accountSweepRetrieveActionTaskReference = accountSweepRetrieveActionTaskReference;
  }

  public BQAccountSweepRetrieveOutputModel accountSweepRetrieveActionTaskRecord(Object accountSweepRetrieveActionTaskRecord) {
    this.accountSweepRetrieveActionTaskRecord = accountSweepRetrieveActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return accountSweepRetrieveActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")

  @Valid

  public Object getAccountSweepRetrieveActionTaskRecord() {
    return accountSweepRetrieveActionTaskRecord;
  }

  public void setAccountSweepRetrieveActionTaskRecord(Object accountSweepRetrieveActionTaskRecord) {
    this.accountSweepRetrieveActionTaskRecord = accountSweepRetrieveActionTaskRecord;
  }

  public BQAccountSweepRetrieveOutputModel accountSweepRetrieveActionResponse(String accountSweepRetrieveActionResponse) {
    this.accountSweepRetrieveActionResponse = accountSweepRetrieveActionResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return accountSweepRetrieveActionResponse
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) ")


  public String getAccountSweepRetrieveActionResponse() {
    return accountSweepRetrieveActionResponse;
  }

  public void setAccountSweepRetrieveActionResponse(String accountSweepRetrieveActionResponse) {
    this.accountSweepRetrieveActionResponse = accountSweepRetrieveActionResponse;
  }

  public BQAccountSweepRetrieveOutputModel accountSweepInstanceReport(InlineResponse20014AccountSweepInstanceReport accountSweepInstanceReport) {
    this.accountSweepInstanceReport = accountSweepInstanceReport;
    return this;
  }

  /**
   * Get accountSweepInstanceReport
   * @return accountSweepInstanceReport
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse20014AccountSweepInstanceReport getAccountSweepInstanceReport() {
    return accountSweepInstanceReport;
  }

  public void setAccountSweepInstanceReport(InlineResponse20014AccountSweepInstanceReport accountSweepInstanceReport) {
    this.accountSweepInstanceReport = accountSweepInstanceReport;
  }

  public BQAccountSweepRetrieveOutputModel accountSweepInstanceAnalysis(InlineResponse20014AccountSweepInstanceAnalysis accountSweepInstanceAnalysis) {
    this.accountSweepInstanceAnalysis = accountSweepInstanceAnalysis;
    return this;
  }

  /**
   * Get accountSweepInstanceAnalysis
   * @return accountSweepInstanceAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse20014AccountSweepInstanceAnalysis getAccountSweepInstanceAnalysis() {
    return accountSweepInstanceAnalysis;
  }

  public void setAccountSweepInstanceAnalysis(InlineResponse20014AccountSweepInstanceAnalysis accountSweepInstanceAnalysis) {
    this.accountSweepInstanceAnalysis = accountSweepInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountSweepRetrieveOutputModel bqAccountSweepRetrieveOutputModel = (BQAccountSweepRetrieveOutputModel) o;
    return Objects.equals(this.accountSweepInstanceRecord, bqAccountSweepRetrieveOutputModel.accountSweepInstanceRecord) &&
        Objects.equals(this.accountSweepRetrieveActionTaskReference, bqAccountSweepRetrieveOutputModel.accountSweepRetrieveActionTaskReference) &&
        Objects.equals(this.accountSweepRetrieveActionTaskRecord, bqAccountSweepRetrieveOutputModel.accountSweepRetrieveActionTaskRecord) &&
        Objects.equals(this.accountSweepRetrieveActionResponse, bqAccountSweepRetrieveOutputModel.accountSweepRetrieveActionResponse) &&
        Objects.equals(this.accountSweepInstanceReport, bqAccountSweepRetrieveOutputModel.accountSweepInstanceReport) &&
        Objects.equals(this.accountSweepInstanceAnalysis, bqAccountSweepRetrieveOutputModel.accountSweepInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSweepInstanceRecord, accountSweepRetrieveActionTaskReference, accountSweepRetrieveActionTaskRecord, accountSweepRetrieveActionResponse, accountSweepInstanceReport, accountSweepInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountSweepRetrieveOutputModel {\n");
    
    sb.append("    accountSweepInstanceRecord: ").append(toIndentedString(accountSweepInstanceRecord)).append("\n");
    sb.append("    accountSweepRetrieveActionTaskReference: ").append(toIndentedString(accountSweepRetrieveActionTaskReference)).append("\n");
    sb.append("    accountSweepRetrieveActionTaskRecord: ").append(toIndentedString(accountSweepRetrieveActionTaskRecord)).append("\n");
    sb.append("    accountSweepRetrieveActionResponse: ").append(toIndentedString(accountSweepRetrieveActionResponse)).append("\n");
    sb.append("    accountSweepInstanceReport: ").append(toIndentedString(accountSweepInstanceReport)).append("\n");
    sb.append("    accountSweepInstanceAnalysis: ").append(toIndentedString(accountSweepInstanceAnalysis)).append("\n");
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

