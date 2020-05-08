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
 * BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceAnalysis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceAnalysis   {
  @JsonProperty("depositsAndWithdrawalsInstanceAnalysisRecord")
  private Object depositsAndWithdrawalsInstanceAnalysisRecord;

  @JsonProperty("depositsAndWithdrawalsInstanceAnalysisReportType")
  private String depositsAndWithdrawalsInstanceAnalysisReportType;

  @JsonProperty("depositsAndWithdrawalsInstanceAnalysisParameters")
  private String depositsAndWithdrawalsInstanceAnalysisParameters;

  @JsonProperty("depositsAndWithdrawalsInstanceAnalysisReport")
  private Object depositsAndWithdrawalsInstanceAnalysisReport;

  public BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceAnalysis depositsAndWithdrawalsInstanceAnalysisRecord(Object depositsAndWithdrawalsInstanceAnalysisRecord) {
    this.depositsAndWithdrawalsInstanceAnalysisRecord = depositsAndWithdrawalsInstanceAnalysisRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return depositsAndWithdrawalsInstanceAnalysisRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected ")

  @Valid

  public Object getDepositsAndWithdrawalsInstanceAnalysisRecord() {
    return depositsAndWithdrawalsInstanceAnalysisRecord;
  }

  public void setDepositsAndWithdrawalsInstanceAnalysisRecord(Object depositsAndWithdrawalsInstanceAnalysisRecord) {
    this.depositsAndWithdrawalsInstanceAnalysisRecord = depositsAndWithdrawalsInstanceAnalysisRecord;
  }

  public BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceAnalysis depositsAndWithdrawalsInstanceAnalysisReportType(String depositsAndWithdrawalsInstanceAnalysisReportType) {
    this.depositsAndWithdrawalsInstanceAnalysisReportType = depositsAndWithdrawalsInstanceAnalysisReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return depositsAndWithdrawalsInstanceAnalysisReportType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available ")


  public String getDepositsAndWithdrawalsInstanceAnalysisReportType() {
    return depositsAndWithdrawalsInstanceAnalysisReportType;
  }

  public void setDepositsAndWithdrawalsInstanceAnalysisReportType(String depositsAndWithdrawalsInstanceAnalysisReportType) {
    this.depositsAndWithdrawalsInstanceAnalysisReportType = depositsAndWithdrawalsInstanceAnalysisReportType;
  }

  public BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceAnalysis depositsAndWithdrawalsInstanceAnalysisParameters(String depositsAndWithdrawalsInstanceAnalysisParameters) {
    this.depositsAndWithdrawalsInstanceAnalysisParameters = depositsAndWithdrawalsInstanceAnalysisParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return depositsAndWithdrawalsInstanceAnalysisParameters
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) ")


  public String getDepositsAndWithdrawalsInstanceAnalysisParameters() {
    return depositsAndWithdrawalsInstanceAnalysisParameters;
  }

  public void setDepositsAndWithdrawalsInstanceAnalysisParameters(String depositsAndWithdrawalsInstanceAnalysisParameters) {
    this.depositsAndWithdrawalsInstanceAnalysisParameters = depositsAndWithdrawalsInstanceAnalysisParameters;
  }

  public BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceAnalysis depositsAndWithdrawalsInstanceAnalysisReport(Object depositsAndWithdrawalsInstanceAnalysisReport) {
    this.depositsAndWithdrawalsInstanceAnalysisReport = depositsAndWithdrawalsInstanceAnalysisReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return depositsAndWithdrawalsInstanceAnalysisReport
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate ")

  @Valid

  public Object getDepositsAndWithdrawalsInstanceAnalysisReport() {
    return depositsAndWithdrawalsInstanceAnalysisReport;
  }

  public void setDepositsAndWithdrawalsInstanceAnalysisReport(Object depositsAndWithdrawalsInstanceAnalysisReport) {
    this.depositsAndWithdrawalsInstanceAnalysisReport = depositsAndWithdrawalsInstanceAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceAnalysis bqDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceAnalysis = (BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceAnalysis) o;
    return Objects.equals(this.depositsAndWithdrawalsInstanceAnalysisRecord, bqDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceAnalysis.depositsAndWithdrawalsInstanceAnalysisRecord) &&
        Objects.equals(this.depositsAndWithdrawalsInstanceAnalysisReportType, bqDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceAnalysis.depositsAndWithdrawalsInstanceAnalysisReportType) &&
        Objects.equals(this.depositsAndWithdrawalsInstanceAnalysisParameters, bqDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceAnalysis.depositsAndWithdrawalsInstanceAnalysisParameters) &&
        Objects.equals(this.depositsAndWithdrawalsInstanceAnalysisReport, bqDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceAnalysis.depositsAndWithdrawalsInstanceAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositsAndWithdrawalsInstanceAnalysisRecord, depositsAndWithdrawalsInstanceAnalysisReportType, depositsAndWithdrawalsInstanceAnalysisParameters, depositsAndWithdrawalsInstanceAnalysisReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQDepositsAndWithdrawalsRetrieveOutputModelDepositsAndWithdrawalsInstanceAnalysis {\n");
    
    sb.append("    depositsAndWithdrawalsInstanceAnalysisRecord: ").append(toIndentedString(depositsAndWithdrawalsInstanceAnalysisRecord)).append("\n");
    sb.append("    depositsAndWithdrawalsInstanceAnalysisReportType: ").append(toIndentedString(depositsAndWithdrawalsInstanceAnalysisReportType)).append("\n");
    sb.append("    depositsAndWithdrawalsInstanceAnalysisParameters: ").append(toIndentedString(depositsAndWithdrawalsInstanceAnalysisParameters)).append("\n");
    sb.append("    depositsAndWithdrawalsInstanceAnalysisReport: ").append(toIndentedString(depositsAndWithdrawalsInstanceAnalysisReport)).append("\n");
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

