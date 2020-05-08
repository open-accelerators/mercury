package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecord;
import com.redhat.mercury.service.currentaccount.model.InlineResponse20011AccountLienInstanceAnalysis;
import com.redhat.mercury.service.currentaccount.model.InlineResponse20011AccountLienInstanceReport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAccountLienRetrieveOutputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class BQAccountLienRetrieveOutputModel   {
  @JsonProperty("accountLienInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecord accountLienInstanceRecord;

  @JsonProperty("accountLienRetrieveActionTaskReference")
  private String accountLienRetrieveActionTaskReference;

  @JsonProperty("accountLienRetrieveActionTaskRecord")
  private Object accountLienRetrieveActionTaskRecord;

  @JsonProperty("accountLienRetrieveActionResponse")
  private String accountLienRetrieveActionResponse;

  @JsonProperty("accountLienInstanceReport")
  private InlineResponse20011AccountLienInstanceReport accountLienInstanceReport;

  @JsonProperty("accountLienInstanceAnalysis")
  private InlineResponse20011AccountLienInstanceAnalysis accountLienInstanceAnalysis;

  public BQAccountLienRetrieveOutputModel accountLienInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecord accountLienInstanceRecord) {
    this.accountLienInstanceRecord = accountLienInstanceRecord;
    return this;
  }

  /**
   * Get accountLienInstanceRecord
   * @return accountLienInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecord getAccountLienInstanceRecord() {
    return accountLienInstanceRecord;
  }

  public void setAccountLienInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecord accountLienInstanceRecord) {
    this.accountLienInstanceRecord = accountLienInstanceRecord;
  }

  public BQAccountLienRetrieveOutputModel accountLienRetrieveActionTaskReference(String accountLienRetrieveActionTaskReference) {
    this.accountLienRetrieveActionTaskReference = accountLienRetrieveActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Account Lien instance retrieve service call 
   * @return accountLienRetrieveActionTaskReference
  */
  @ApiModelProperty(example = "ALRATR742030", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Account Lien instance retrieve service call ")


  public String getAccountLienRetrieveActionTaskReference() {
    return accountLienRetrieveActionTaskReference;
  }

  public void setAccountLienRetrieveActionTaskReference(String accountLienRetrieveActionTaskReference) {
    this.accountLienRetrieveActionTaskReference = accountLienRetrieveActionTaskReference;
  }

  public BQAccountLienRetrieveOutputModel accountLienRetrieveActionTaskRecord(Object accountLienRetrieveActionTaskRecord) {
    this.accountLienRetrieveActionTaskRecord = accountLienRetrieveActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return accountLienRetrieveActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")

  @Valid

  public Object getAccountLienRetrieveActionTaskRecord() {
    return accountLienRetrieveActionTaskRecord;
  }

  public void setAccountLienRetrieveActionTaskRecord(Object accountLienRetrieveActionTaskRecord) {
    this.accountLienRetrieveActionTaskRecord = accountLienRetrieveActionTaskRecord;
  }

  public BQAccountLienRetrieveOutputModel accountLienRetrieveActionResponse(String accountLienRetrieveActionResponse) {
    this.accountLienRetrieveActionResponse = accountLienRetrieveActionResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return accountLienRetrieveActionResponse
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) ")


  public String getAccountLienRetrieveActionResponse() {
    return accountLienRetrieveActionResponse;
  }

  public void setAccountLienRetrieveActionResponse(String accountLienRetrieveActionResponse) {
    this.accountLienRetrieveActionResponse = accountLienRetrieveActionResponse;
  }

  public BQAccountLienRetrieveOutputModel accountLienInstanceReport(InlineResponse20011AccountLienInstanceReport accountLienInstanceReport) {
    this.accountLienInstanceReport = accountLienInstanceReport;
    return this;
  }

  /**
   * Get accountLienInstanceReport
   * @return accountLienInstanceReport
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse20011AccountLienInstanceReport getAccountLienInstanceReport() {
    return accountLienInstanceReport;
  }

  public void setAccountLienInstanceReport(InlineResponse20011AccountLienInstanceReport accountLienInstanceReport) {
    this.accountLienInstanceReport = accountLienInstanceReport;
  }

  public BQAccountLienRetrieveOutputModel accountLienInstanceAnalysis(InlineResponse20011AccountLienInstanceAnalysis accountLienInstanceAnalysis) {
    this.accountLienInstanceAnalysis = accountLienInstanceAnalysis;
    return this;
  }

  /**
   * Get accountLienInstanceAnalysis
   * @return accountLienInstanceAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse20011AccountLienInstanceAnalysis getAccountLienInstanceAnalysis() {
    return accountLienInstanceAnalysis;
  }

  public void setAccountLienInstanceAnalysis(InlineResponse20011AccountLienInstanceAnalysis accountLienInstanceAnalysis) {
    this.accountLienInstanceAnalysis = accountLienInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountLienRetrieveOutputModel bqAccountLienRetrieveOutputModel = (BQAccountLienRetrieveOutputModel) o;
    return Objects.equals(this.accountLienInstanceRecord, bqAccountLienRetrieveOutputModel.accountLienInstanceRecord) &&
        Objects.equals(this.accountLienRetrieveActionTaskReference, bqAccountLienRetrieveOutputModel.accountLienRetrieveActionTaskReference) &&
        Objects.equals(this.accountLienRetrieveActionTaskRecord, bqAccountLienRetrieveOutputModel.accountLienRetrieveActionTaskRecord) &&
        Objects.equals(this.accountLienRetrieveActionResponse, bqAccountLienRetrieveOutputModel.accountLienRetrieveActionResponse) &&
        Objects.equals(this.accountLienInstanceReport, bqAccountLienRetrieveOutputModel.accountLienInstanceReport) &&
        Objects.equals(this.accountLienInstanceAnalysis, bqAccountLienRetrieveOutputModel.accountLienInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountLienInstanceRecord, accountLienRetrieveActionTaskReference, accountLienRetrieveActionTaskRecord, accountLienRetrieveActionResponse, accountLienInstanceReport, accountLienInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountLienRetrieveOutputModel {\n");
    
    sb.append("    accountLienInstanceRecord: ").append(toIndentedString(accountLienInstanceRecord)).append("\n");
    sb.append("    accountLienRetrieveActionTaskReference: ").append(toIndentedString(accountLienRetrieveActionTaskReference)).append("\n");
    sb.append("    accountLienRetrieveActionTaskRecord: ").append(toIndentedString(accountLienRetrieveActionTaskRecord)).append("\n");
    sb.append("    accountLienRetrieveActionResponse: ").append(toIndentedString(accountLienRetrieveActionResponse)).append("\n");
    sb.append("    accountLienInstanceReport: ").append(toIndentedString(accountLienInstanceReport)).append("\n");
    sb.append("    accountLienInstanceAnalysis: ").append(toIndentedString(accountLienInstanceAnalysis)).append("\n");
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

