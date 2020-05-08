package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse20017DepositsAndWithdrawalsInstanceAnalysis;
import com.redhat.mercury.service.contactdialog.model.InlineResponse20017DepositsAndWithdrawalsInstanceRecord;
import com.redhat.mercury.service.contactdialog.model.InlineResponse20017DepositsAndWithdrawalsInstanceReport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20017
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class InlineResponse20017   {
  @JsonProperty("depositsAndWithdrawalsInstanceRecord")
  private InlineResponse20017DepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord;

  @JsonProperty("depositsAndWithdrawalsRetrieveActionTaskReference")
  private String depositsAndWithdrawalsRetrieveActionTaskReference;

  @JsonProperty("depositsAndWithdrawalsRetrieveActionTaskRecord")
  private Object depositsAndWithdrawalsRetrieveActionTaskRecord;

  @JsonProperty("depositsAndWithdrawalsRetrieveActionResponse")
  private String depositsAndWithdrawalsRetrieveActionResponse;

  @JsonProperty("depositsAndWithdrawalsInstanceReport")
  private InlineResponse20017DepositsAndWithdrawalsInstanceReport depositsAndWithdrawalsInstanceReport;

  @JsonProperty("depositsAndWithdrawalsInstanceAnalysis")
  private InlineResponse20017DepositsAndWithdrawalsInstanceAnalysis depositsAndWithdrawalsInstanceAnalysis;

  public InlineResponse20017 depositsAndWithdrawalsInstanceRecord(InlineResponse20017DepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord) {
    this.depositsAndWithdrawalsInstanceRecord = depositsAndWithdrawalsInstanceRecord;
    return this;
  }

  /**
   * Get depositsAndWithdrawalsInstanceRecord
   * @return depositsAndWithdrawalsInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse20017DepositsAndWithdrawalsInstanceRecord getDepositsAndWithdrawalsInstanceRecord() {
    return depositsAndWithdrawalsInstanceRecord;
  }

  public void setDepositsAndWithdrawalsInstanceRecord(InlineResponse20017DepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord) {
    this.depositsAndWithdrawalsInstanceRecord = depositsAndWithdrawalsInstanceRecord;
  }

  public InlineResponse20017 depositsAndWithdrawalsRetrieveActionTaskReference(String depositsAndWithdrawalsRetrieveActionTaskReference) {
    this.depositsAndWithdrawalsRetrieveActionTaskReference = depositsAndWithdrawalsRetrieveActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Deposits And Withdrawals instance retrieve service call 
   * @return depositsAndWithdrawalsRetrieveActionTaskReference
  */
  @ApiModelProperty(example = "DAWRATR757335", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Deposits And Withdrawals instance retrieve service call ")


  public String getDepositsAndWithdrawalsRetrieveActionTaskReference() {
    return depositsAndWithdrawalsRetrieveActionTaskReference;
  }

  public void setDepositsAndWithdrawalsRetrieveActionTaskReference(String depositsAndWithdrawalsRetrieveActionTaskReference) {
    this.depositsAndWithdrawalsRetrieveActionTaskReference = depositsAndWithdrawalsRetrieveActionTaskReference;
  }

  public InlineResponse20017 depositsAndWithdrawalsRetrieveActionTaskRecord(Object depositsAndWithdrawalsRetrieveActionTaskRecord) {
    this.depositsAndWithdrawalsRetrieveActionTaskRecord = depositsAndWithdrawalsRetrieveActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return depositsAndWithdrawalsRetrieveActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")

  @Valid

  public Object getDepositsAndWithdrawalsRetrieveActionTaskRecord() {
    return depositsAndWithdrawalsRetrieveActionTaskRecord;
  }

  public void setDepositsAndWithdrawalsRetrieveActionTaskRecord(Object depositsAndWithdrawalsRetrieveActionTaskRecord) {
    this.depositsAndWithdrawalsRetrieveActionTaskRecord = depositsAndWithdrawalsRetrieveActionTaskRecord;
  }

  public InlineResponse20017 depositsAndWithdrawalsRetrieveActionResponse(String depositsAndWithdrawalsRetrieveActionResponse) {
    this.depositsAndWithdrawalsRetrieveActionResponse = depositsAndWithdrawalsRetrieveActionResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return depositsAndWithdrawalsRetrieveActionResponse
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) ")


  public String getDepositsAndWithdrawalsRetrieveActionResponse() {
    return depositsAndWithdrawalsRetrieveActionResponse;
  }

  public void setDepositsAndWithdrawalsRetrieveActionResponse(String depositsAndWithdrawalsRetrieveActionResponse) {
    this.depositsAndWithdrawalsRetrieveActionResponse = depositsAndWithdrawalsRetrieveActionResponse;
  }

  public InlineResponse20017 depositsAndWithdrawalsInstanceReport(InlineResponse20017DepositsAndWithdrawalsInstanceReport depositsAndWithdrawalsInstanceReport) {
    this.depositsAndWithdrawalsInstanceReport = depositsAndWithdrawalsInstanceReport;
    return this;
  }

  /**
   * Get depositsAndWithdrawalsInstanceReport
   * @return depositsAndWithdrawalsInstanceReport
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse20017DepositsAndWithdrawalsInstanceReport getDepositsAndWithdrawalsInstanceReport() {
    return depositsAndWithdrawalsInstanceReport;
  }

  public void setDepositsAndWithdrawalsInstanceReport(InlineResponse20017DepositsAndWithdrawalsInstanceReport depositsAndWithdrawalsInstanceReport) {
    this.depositsAndWithdrawalsInstanceReport = depositsAndWithdrawalsInstanceReport;
  }

  public InlineResponse20017 depositsAndWithdrawalsInstanceAnalysis(InlineResponse20017DepositsAndWithdrawalsInstanceAnalysis depositsAndWithdrawalsInstanceAnalysis) {
    this.depositsAndWithdrawalsInstanceAnalysis = depositsAndWithdrawalsInstanceAnalysis;
    return this;
  }

  /**
   * Get depositsAndWithdrawalsInstanceAnalysis
   * @return depositsAndWithdrawalsInstanceAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse20017DepositsAndWithdrawalsInstanceAnalysis getDepositsAndWithdrawalsInstanceAnalysis() {
    return depositsAndWithdrawalsInstanceAnalysis;
  }

  public void setDepositsAndWithdrawalsInstanceAnalysis(InlineResponse20017DepositsAndWithdrawalsInstanceAnalysis depositsAndWithdrawalsInstanceAnalysis) {
    this.depositsAndWithdrawalsInstanceAnalysis = depositsAndWithdrawalsInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20017 inlineResponse20017 = (InlineResponse20017) o;
    return Objects.equals(this.depositsAndWithdrawalsInstanceRecord, inlineResponse20017.depositsAndWithdrawalsInstanceRecord) &&
        Objects.equals(this.depositsAndWithdrawalsRetrieveActionTaskReference, inlineResponse20017.depositsAndWithdrawalsRetrieveActionTaskReference) &&
        Objects.equals(this.depositsAndWithdrawalsRetrieveActionTaskRecord, inlineResponse20017.depositsAndWithdrawalsRetrieveActionTaskRecord) &&
        Objects.equals(this.depositsAndWithdrawalsRetrieveActionResponse, inlineResponse20017.depositsAndWithdrawalsRetrieveActionResponse) &&
        Objects.equals(this.depositsAndWithdrawalsInstanceReport, inlineResponse20017.depositsAndWithdrawalsInstanceReport) &&
        Objects.equals(this.depositsAndWithdrawalsInstanceAnalysis, inlineResponse20017.depositsAndWithdrawalsInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositsAndWithdrawalsInstanceRecord, depositsAndWithdrawalsRetrieveActionTaskReference, depositsAndWithdrawalsRetrieveActionTaskRecord, depositsAndWithdrawalsRetrieveActionResponse, depositsAndWithdrawalsInstanceReport, depositsAndWithdrawalsInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20017 {\n");
    
    sb.append("    depositsAndWithdrawalsInstanceRecord: ").append(toIndentedString(depositsAndWithdrawalsInstanceRecord)).append("\n");
    sb.append("    depositsAndWithdrawalsRetrieveActionTaskReference: ").append(toIndentedString(depositsAndWithdrawalsRetrieveActionTaskReference)).append("\n");
    sb.append("    depositsAndWithdrawalsRetrieveActionTaskRecord: ").append(toIndentedString(depositsAndWithdrawalsRetrieveActionTaskRecord)).append("\n");
    sb.append("    depositsAndWithdrawalsRetrieveActionResponse: ").append(toIndentedString(depositsAndWithdrawalsRetrieveActionResponse)).append("\n");
    sb.append("    depositsAndWithdrawalsInstanceReport: ").append(toIndentedString(depositsAndWithdrawalsInstanceReport)).append("\n");
    sb.append("    depositsAndWithdrawalsInstanceAnalysis: ").append(toIndentedString(depositsAndWithdrawalsInstanceAnalysis)).append("\n");
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

