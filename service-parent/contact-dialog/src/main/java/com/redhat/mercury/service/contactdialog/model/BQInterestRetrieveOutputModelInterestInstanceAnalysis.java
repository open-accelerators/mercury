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
 * BQInterestRetrieveOutputModelInterestInstanceAnalysis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class BQInterestRetrieveOutputModelInterestInstanceAnalysis   {
  @JsonProperty("interestInstanceAnalysisRecord")
  private Object interestInstanceAnalysisRecord;

  @JsonProperty("interestInstanceAnalysisReportType")
  private String interestInstanceAnalysisReportType;

  @JsonProperty("interestInstanceAnalysisParameters")
  private String interestInstanceAnalysisParameters;

  @JsonProperty("interestInstanceAnalysisReport")
  private Object interestInstanceAnalysisReport;

  public BQInterestRetrieveOutputModelInterestInstanceAnalysis interestInstanceAnalysisRecord(Object interestInstanceAnalysisRecord) {
    this.interestInstanceAnalysisRecord = interestInstanceAnalysisRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return interestInstanceAnalysisRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected ")

  @Valid

  public Object getInterestInstanceAnalysisRecord() {
    return interestInstanceAnalysisRecord;
  }

  public void setInterestInstanceAnalysisRecord(Object interestInstanceAnalysisRecord) {
    this.interestInstanceAnalysisRecord = interestInstanceAnalysisRecord;
  }

  public BQInterestRetrieveOutputModelInterestInstanceAnalysis interestInstanceAnalysisReportType(String interestInstanceAnalysisReportType) {
    this.interestInstanceAnalysisReportType = interestInstanceAnalysisReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return interestInstanceAnalysisReportType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available ")


  public String getInterestInstanceAnalysisReportType() {
    return interestInstanceAnalysisReportType;
  }

  public void setInterestInstanceAnalysisReportType(String interestInstanceAnalysisReportType) {
    this.interestInstanceAnalysisReportType = interestInstanceAnalysisReportType;
  }

  public BQInterestRetrieveOutputModelInterestInstanceAnalysis interestInstanceAnalysisParameters(String interestInstanceAnalysisParameters) {
    this.interestInstanceAnalysisParameters = interestInstanceAnalysisParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return interestInstanceAnalysisParameters
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) ")


  public String getInterestInstanceAnalysisParameters() {
    return interestInstanceAnalysisParameters;
  }

  public void setInterestInstanceAnalysisParameters(String interestInstanceAnalysisParameters) {
    this.interestInstanceAnalysisParameters = interestInstanceAnalysisParameters;
  }

  public BQInterestRetrieveOutputModelInterestInstanceAnalysis interestInstanceAnalysisReport(Object interestInstanceAnalysisReport) {
    this.interestInstanceAnalysisReport = interestInstanceAnalysisReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return interestInstanceAnalysisReport
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate ")

  @Valid

  public Object getInterestInstanceAnalysisReport() {
    return interestInstanceAnalysisReport;
  }

  public void setInterestInstanceAnalysisReport(Object interestInstanceAnalysisReport) {
    this.interestInstanceAnalysisReport = interestInstanceAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQInterestRetrieveOutputModelInterestInstanceAnalysis bqInterestRetrieveOutputModelInterestInstanceAnalysis = (BQInterestRetrieveOutputModelInterestInstanceAnalysis) o;
    return Objects.equals(this.interestInstanceAnalysisRecord, bqInterestRetrieveOutputModelInterestInstanceAnalysis.interestInstanceAnalysisRecord) &&
        Objects.equals(this.interestInstanceAnalysisReportType, bqInterestRetrieveOutputModelInterestInstanceAnalysis.interestInstanceAnalysisReportType) &&
        Objects.equals(this.interestInstanceAnalysisParameters, bqInterestRetrieveOutputModelInterestInstanceAnalysis.interestInstanceAnalysisParameters) &&
        Objects.equals(this.interestInstanceAnalysisReport, bqInterestRetrieveOutputModelInterestInstanceAnalysis.interestInstanceAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestInstanceAnalysisRecord, interestInstanceAnalysisReportType, interestInstanceAnalysisParameters, interestInstanceAnalysisReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQInterestRetrieveOutputModelInterestInstanceAnalysis {\n");
    
    sb.append("    interestInstanceAnalysisRecord: ").append(toIndentedString(interestInstanceAnalysisRecord)).append("\n");
    sb.append("    interestInstanceAnalysisReportType: ").append(toIndentedString(interestInstanceAnalysisReportType)).append("\n");
    sb.append("    interestInstanceAnalysisParameters: ").append(toIndentedString(interestInstanceAnalysisParameters)).append("\n");
    sb.append("    interestInstanceAnalysisReport: ").append(toIndentedString(interestInstanceAnalysisReport)).append("\n");
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

