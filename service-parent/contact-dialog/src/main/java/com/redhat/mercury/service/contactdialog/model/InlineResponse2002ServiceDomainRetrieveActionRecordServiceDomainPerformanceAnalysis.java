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
 * InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis   {
  @JsonProperty("performanceAnalysisReference")
  private String performanceAnalysisReference;

  @JsonProperty("performanceAnalysisResult")
  private String performanceAnalysisResult;

  @JsonProperty("performanceAnalysisReportType")
  private String performanceAnalysisReportType;

  @JsonProperty("performanceAnalysisReport")
  private Object performanceAnalysisReport;

  public InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis performanceAnalysisReference(String performanceAnalysisReference) {
    this.performanceAnalysisReference = performanceAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the internal performance analysis view maintained by the service center 
   * @return performanceAnalysisReference
  */
  @ApiModelProperty(example = "761670", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the internal performance analysis view maintained by the service center ")


  public String getPerformanceAnalysisReference() {
    return performanceAnalysisReference;
  }

  public void setPerformanceAnalysisReference(String performanceAnalysisReference) {
    this.performanceAnalysisReference = performanceAnalysisReference;
  }

  public InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis performanceAnalysisResult(String performanceAnalysisResult) {
    this.performanceAnalysisResult = performanceAnalysisResult;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The results of the performance analysis that can be on-going or periodic 
   * @return performanceAnalysisResult
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The results of the performance analysis that can be on-going or periodic ")


  public String getPerformanceAnalysisResult() {
    return performanceAnalysisResult;
  }

  public void setPerformanceAnalysisResult(String performanceAnalysisResult) {
    this.performanceAnalysisResult = performanceAnalysisResult;
  }

  public InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis performanceAnalysisReportType(String performanceAnalysisReportType) {
    this.performanceAnalysisReportType = performanceAnalysisReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of performance analysis report available 
   * @return performanceAnalysisReportType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of performance analysis report available ")


  public String getPerformanceAnalysisReportType() {
    return performanceAnalysisReportType;
  }

  public void setPerformanceAnalysisReportType(String performanceAnalysisReportType) {
    this.performanceAnalysisReportType = performanceAnalysisReportType;
  }

  public InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis performanceAnalysisReport(Object performanceAnalysisReport) {
    this.performanceAnalysisReport = performanceAnalysisReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The performance analysis report in any suitable form including selection filters where appropriate 
   * @return performanceAnalysisReport
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The performance analysis report in any suitable form including selection filters where appropriate ")

  @Valid

  public Object getPerformanceAnalysisReport() {
    return performanceAnalysisReport;
  }

  public void setPerformanceAnalysisReport(Object performanceAnalysisReport) {
    this.performanceAnalysisReport = performanceAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis inlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis = (InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis) o;
    return Objects.equals(this.performanceAnalysisReference, inlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis.performanceAnalysisReference) &&
        Objects.equals(this.performanceAnalysisResult, inlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis.performanceAnalysisResult) &&
        Objects.equals(this.performanceAnalysisReportType, inlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis.performanceAnalysisReportType) &&
        Objects.equals(this.performanceAnalysisReport, inlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis.performanceAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performanceAnalysisReference, performanceAnalysisResult, performanceAnalysisReportType, performanceAnalysisReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002ServiceDomainRetrieveActionRecordServiceDomainPerformanceAnalysis {\n");
    
    sb.append("    performanceAnalysisReference: ").append(toIndentedString(performanceAnalysisReference)).append("\n");
    sb.append("    performanceAnalysisResult: ").append(toIndentedString(performanceAnalysisResult)).append("\n");
    sb.append("    performanceAnalysisReportType: ").append(toIndentedString(performanceAnalysisReportType)).append("\n");
    sb.append("    performanceAnalysisReport: ").append(toIndentedString(performanceAnalysisReport)).append("\n");
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

