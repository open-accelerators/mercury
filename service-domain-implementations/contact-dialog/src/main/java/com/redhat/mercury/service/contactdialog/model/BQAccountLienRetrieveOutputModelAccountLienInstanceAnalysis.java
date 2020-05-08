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
 * BQAccountLienRetrieveOutputModelAccountLienInstanceAnalysis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQAccountLienRetrieveOutputModelAccountLienInstanceAnalysis   {
  @JsonProperty("accountLienInstanceAnalysisRecord")
  private Object accountLienInstanceAnalysisRecord;

  @JsonProperty("accountLienInstanceAnalysisReportType")
  private String accountLienInstanceAnalysisReportType;

  @JsonProperty("accountLienInstanceAnalysisParameters")
  private String accountLienInstanceAnalysisParameters;

  @JsonProperty("accountLienInstanceAnalysisReport")
  private Object accountLienInstanceAnalysisReport;

  public BQAccountLienRetrieveOutputModelAccountLienInstanceAnalysis accountLienInstanceAnalysisRecord(Object accountLienInstanceAnalysisRecord) {
    this.accountLienInstanceAnalysisRecord = accountLienInstanceAnalysisRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return accountLienInstanceAnalysisRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected ")

  @Valid

  public Object getAccountLienInstanceAnalysisRecord() {
    return accountLienInstanceAnalysisRecord;
  }

  public void setAccountLienInstanceAnalysisRecord(Object accountLienInstanceAnalysisRecord) {
    this.accountLienInstanceAnalysisRecord = accountLienInstanceAnalysisRecord;
  }

  public BQAccountLienRetrieveOutputModelAccountLienInstanceAnalysis accountLienInstanceAnalysisReportType(String accountLienInstanceAnalysisReportType) {
    this.accountLienInstanceAnalysisReportType = accountLienInstanceAnalysisReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return accountLienInstanceAnalysisReportType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available ")


  public String getAccountLienInstanceAnalysisReportType() {
    return accountLienInstanceAnalysisReportType;
  }

  public void setAccountLienInstanceAnalysisReportType(String accountLienInstanceAnalysisReportType) {
    this.accountLienInstanceAnalysisReportType = accountLienInstanceAnalysisReportType;
  }

  public BQAccountLienRetrieveOutputModelAccountLienInstanceAnalysis accountLienInstanceAnalysisParameters(String accountLienInstanceAnalysisParameters) {
    this.accountLienInstanceAnalysisParameters = accountLienInstanceAnalysisParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return accountLienInstanceAnalysisParameters
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) ")


  public String getAccountLienInstanceAnalysisParameters() {
    return accountLienInstanceAnalysisParameters;
  }

  public void setAccountLienInstanceAnalysisParameters(String accountLienInstanceAnalysisParameters) {
    this.accountLienInstanceAnalysisParameters = accountLienInstanceAnalysisParameters;
  }

  public BQAccountLienRetrieveOutputModelAccountLienInstanceAnalysis accountLienInstanceAnalysisReport(Object accountLienInstanceAnalysisReport) {
    this.accountLienInstanceAnalysisReport = accountLienInstanceAnalysisReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return accountLienInstanceAnalysisReport
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate ")

  @Valid

  public Object getAccountLienInstanceAnalysisReport() {
    return accountLienInstanceAnalysisReport;
  }

  public void setAccountLienInstanceAnalysisReport(Object accountLienInstanceAnalysisReport) {
    this.accountLienInstanceAnalysisReport = accountLienInstanceAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountLienRetrieveOutputModelAccountLienInstanceAnalysis bqAccountLienRetrieveOutputModelAccountLienInstanceAnalysis = (BQAccountLienRetrieveOutputModelAccountLienInstanceAnalysis) o;
    return Objects.equals(this.accountLienInstanceAnalysisRecord, bqAccountLienRetrieveOutputModelAccountLienInstanceAnalysis.accountLienInstanceAnalysisRecord) &&
        Objects.equals(this.accountLienInstanceAnalysisReportType, bqAccountLienRetrieveOutputModelAccountLienInstanceAnalysis.accountLienInstanceAnalysisReportType) &&
        Objects.equals(this.accountLienInstanceAnalysisParameters, bqAccountLienRetrieveOutputModelAccountLienInstanceAnalysis.accountLienInstanceAnalysisParameters) &&
        Objects.equals(this.accountLienInstanceAnalysisReport, bqAccountLienRetrieveOutputModelAccountLienInstanceAnalysis.accountLienInstanceAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountLienInstanceAnalysisRecord, accountLienInstanceAnalysisReportType, accountLienInstanceAnalysisParameters, accountLienInstanceAnalysisReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountLienRetrieveOutputModelAccountLienInstanceAnalysis {\n");
    
    sb.append("    accountLienInstanceAnalysisRecord: ").append(toIndentedString(accountLienInstanceAnalysisRecord)).append("\n");
    sb.append("    accountLienInstanceAnalysisReportType: ").append(toIndentedString(accountLienInstanceAnalysisReportType)).append("\n");
    sb.append("    accountLienInstanceAnalysisParameters: ").append(toIndentedString(accountLienInstanceAnalysisParameters)).append("\n");
    sb.append("    accountLienInstanceAnalysisReport: ").append(toIndentedString(accountLienInstanceAnalysisReport)).append("\n");
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

