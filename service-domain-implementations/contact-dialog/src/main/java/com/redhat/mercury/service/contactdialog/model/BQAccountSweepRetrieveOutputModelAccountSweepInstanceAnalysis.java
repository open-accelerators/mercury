package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAccountSweepRetrieveOutputModelAccountSweepInstanceAnalysis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQAccountSweepRetrieveOutputModelAccountSweepInstanceAnalysis   {
  @JsonProperty("accountSweepInstanceAnalysisRecord")
  private Object accountSweepInstanceAnalysisRecord;

  @JsonProperty("accountSweepInstanceAnalysisReportType")
  private String accountSweepInstanceAnalysisReportType;

  @JsonProperty("accountSweepInstanceAnalysisParameters")
  private String accountSweepInstanceAnalysisParameters;

  @JsonProperty("accountSweepInstanceAnalysisReport")
  private Object accountSweepInstanceAnalysisReport;

  public BQAccountSweepRetrieveOutputModelAccountSweepInstanceAnalysis accountSweepInstanceAnalysisRecord(Object accountSweepInstanceAnalysisRecord) {
    this.accountSweepInstanceAnalysisRecord = accountSweepInstanceAnalysisRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return accountSweepInstanceAnalysisRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected ")

  @Valid

  public Object getAccountSweepInstanceAnalysisRecord() {
    return accountSweepInstanceAnalysisRecord;
  }

  public void setAccountSweepInstanceAnalysisRecord(Object accountSweepInstanceAnalysisRecord) {
    this.accountSweepInstanceAnalysisRecord = accountSweepInstanceAnalysisRecord;
  }

  public BQAccountSweepRetrieveOutputModelAccountSweepInstanceAnalysis accountSweepInstanceAnalysisReportType(String accountSweepInstanceAnalysisReportType) {
    this.accountSweepInstanceAnalysisReportType = accountSweepInstanceAnalysisReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return accountSweepInstanceAnalysisReportType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available ")


  public String getAccountSweepInstanceAnalysisReportType() {
    return accountSweepInstanceAnalysisReportType;
  }

  public void setAccountSweepInstanceAnalysisReportType(String accountSweepInstanceAnalysisReportType) {
    this.accountSweepInstanceAnalysisReportType = accountSweepInstanceAnalysisReportType;
  }

  public BQAccountSweepRetrieveOutputModelAccountSweepInstanceAnalysis accountSweepInstanceAnalysisParameters(String accountSweepInstanceAnalysisParameters) {
    this.accountSweepInstanceAnalysisParameters = accountSweepInstanceAnalysisParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return accountSweepInstanceAnalysisParameters
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) ")


  public String getAccountSweepInstanceAnalysisParameters() {
    return accountSweepInstanceAnalysisParameters;
  }

  public void setAccountSweepInstanceAnalysisParameters(String accountSweepInstanceAnalysisParameters) {
    this.accountSweepInstanceAnalysisParameters = accountSweepInstanceAnalysisParameters;
  }

  public BQAccountSweepRetrieveOutputModelAccountSweepInstanceAnalysis accountSweepInstanceAnalysisReport(Object accountSweepInstanceAnalysisReport) {
    this.accountSweepInstanceAnalysisReport = accountSweepInstanceAnalysisReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return accountSweepInstanceAnalysisReport
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate ")

  @Valid

  public Object getAccountSweepInstanceAnalysisReport() {
    return accountSweepInstanceAnalysisReport;
  }

  public void setAccountSweepInstanceAnalysisReport(Object accountSweepInstanceAnalysisReport) {
    this.accountSweepInstanceAnalysisReport = accountSweepInstanceAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountSweepRetrieveOutputModelAccountSweepInstanceAnalysis bqAccountSweepRetrieveOutputModelAccountSweepInstanceAnalysis = (BQAccountSweepRetrieveOutputModelAccountSweepInstanceAnalysis) o;
    return Objects.equals(this.accountSweepInstanceAnalysisRecord, bqAccountSweepRetrieveOutputModelAccountSweepInstanceAnalysis.accountSweepInstanceAnalysisRecord) &&
        Objects.equals(this.accountSweepInstanceAnalysisReportType, bqAccountSweepRetrieveOutputModelAccountSweepInstanceAnalysis.accountSweepInstanceAnalysisReportType) &&
        Objects.equals(this.accountSweepInstanceAnalysisParameters, bqAccountSweepRetrieveOutputModelAccountSweepInstanceAnalysis.accountSweepInstanceAnalysisParameters) &&
        Objects.equals(this.accountSweepInstanceAnalysisReport, bqAccountSweepRetrieveOutputModelAccountSweepInstanceAnalysis.accountSweepInstanceAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSweepInstanceAnalysisRecord, accountSweepInstanceAnalysisReportType, accountSweepInstanceAnalysisParameters, accountSweepInstanceAnalysisReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountSweepRetrieveOutputModelAccountSweepInstanceAnalysis {\n");
    
    sb.append("    accountSweepInstanceAnalysisRecord: ").append(toIndentedString(accountSweepInstanceAnalysisRecord)).append("\n");
    sb.append("    accountSweepInstanceAnalysisReportType: ").append(toIndentedString(accountSweepInstanceAnalysisReportType)).append("\n");
    sb.append("    accountSweepInstanceAnalysisParameters: ").append(toIndentedString(accountSweepInstanceAnalysisParameters)).append("\n");
    sb.append("    accountSweepInstanceAnalysisReport: ").append(toIndentedString(accountSweepInstanceAnalysisReport)).append("\n");
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

