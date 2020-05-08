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
 * BQDepositsAndWithdrawalsRetrieveOutputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQDepositsAndWithdrawalsRetrieveOutputModel   {
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

  public BQDepositsAndWithdrawalsRetrieveOutputModel depositsAndWithdrawalsInstanceRecord(InlineResponse20017DepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord) {
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

  public BQDepositsAndWithdrawalsRetrieveOutputModel depositsAndWithdrawalsRetrieveActionTaskReference(String depositsAndWithdrawalsRetrieveActionTaskReference) {
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

  public BQDepositsAndWithdrawalsRetrieveOutputModel depositsAndWithdrawalsRetrieveActionTaskRecord(Object depositsAndWithdrawalsRetrieveActionTaskRecord) {
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

  public BQDepositsAndWithdrawalsRetrieveOutputModel depositsAndWithdrawalsRetrieveActionResponse(String depositsAndWithdrawalsRetrieveActionResponse) {
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

  public BQDepositsAndWithdrawalsRetrieveOutputModel depositsAndWithdrawalsInstanceReport(InlineResponse20017DepositsAndWithdrawalsInstanceReport depositsAndWithdrawalsInstanceReport) {
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

  public BQDepositsAndWithdrawalsRetrieveOutputModel depositsAndWithdrawalsInstanceAnalysis(InlineResponse20017DepositsAndWithdrawalsInstanceAnalysis depositsAndWithdrawalsInstanceAnalysis) {
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
    BQDepositsAndWithdrawalsRetrieveOutputModel bqDepositsAndWithdrawalsRetrieveOutputModel = (BQDepositsAndWithdrawalsRetrieveOutputModel) o;
    return Objects.equals(this.depositsAndWithdrawalsInstanceRecord, bqDepositsAndWithdrawalsRetrieveOutputModel.depositsAndWithdrawalsInstanceRecord) &&
        Objects.equals(this.depositsAndWithdrawalsRetrieveActionTaskReference, bqDepositsAndWithdrawalsRetrieveOutputModel.depositsAndWithdrawalsRetrieveActionTaskReference) &&
        Objects.equals(this.depositsAndWithdrawalsRetrieveActionTaskRecord, bqDepositsAndWithdrawalsRetrieveOutputModel.depositsAndWithdrawalsRetrieveActionTaskRecord) &&
        Objects.equals(this.depositsAndWithdrawalsRetrieveActionResponse, bqDepositsAndWithdrawalsRetrieveOutputModel.depositsAndWithdrawalsRetrieveActionResponse) &&
        Objects.equals(this.depositsAndWithdrawalsInstanceReport, bqDepositsAndWithdrawalsRetrieveOutputModel.depositsAndWithdrawalsInstanceReport) &&
        Objects.equals(this.depositsAndWithdrawalsInstanceAnalysis, bqDepositsAndWithdrawalsRetrieveOutputModel.depositsAndWithdrawalsInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositsAndWithdrawalsInstanceRecord, depositsAndWithdrawalsRetrieveActionTaskReference, depositsAndWithdrawalsRetrieveActionTaskRecord, depositsAndWithdrawalsRetrieveActionResponse, depositsAndWithdrawalsInstanceReport, depositsAndWithdrawalsInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQDepositsAndWithdrawalsRetrieveOutputModel {\n");
    
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

