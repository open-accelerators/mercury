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
 * InlineResponse20021PaymentsInstanceAnalysis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class InlineResponse20021PaymentsInstanceAnalysis   {
  @JsonProperty("paymentsInstanceAnalysisRecord")
  private Object paymentsInstanceAnalysisRecord;

  @JsonProperty("paymentsInstanceAnalysisReportType")
  private String paymentsInstanceAnalysisReportType;

  @JsonProperty("paymentsInstanceAnalysisParameters")
  private String paymentsInstanceAnalysisParameters;

  @JsonProperty("paymentsInstanceAnalysisReport")
  private Object paymentsInstanceAnalysisReport;

  public InlineResponse20021PaymentsInstanceAnalysis paymentsInstanceAnalysisRecord(Object paymentsInstanceAnalysisRecord) {
    this.paymentsInstanceAnalysisRecord = paymentsInstanceAnalysisRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return paymentsInstanceAnalysisRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected ")

  @Valid

  public Object getPaymentsInstanceAnalysisRecord() {
    return paymentsInstanceAnalysisRecord;
  }

  public void setPaymentsInstanceAnalysisRecord(Object paymentsInstanceAnalysisRecord) {
    this.paymentsInstanceAnalysisRecord = paymentsInstanceAnalysisRecord;
  }

  public InlineResponse20021PaymentsInstanceAnalysis paymentsInstanceAnalysisReportType(String paymentsInstanceAnalysisReportType) {
    this.paymentsInstanceAnalysisReportType = paymentsInstanceAnalysisReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return paymentsInstanceAnalysisReportType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available ")


  public String getPaymentsInstanceAnalysisReportType() {
    return paymentsInstanceAnalysisReportType;
  }

  public void setPaymentsInstanceAnalysisReportType(String paymentsInstanceAnalysisReportType) {
    this.paymentsInstanceAnalysisReportType = paymentsInstanceAnalysisReportType;
  }

  public InlineResponse20021PaymentsInstanceAnalysis paymentsInstanceAnalysisParameters(String paymentsInstanceAnalysisParameters) {
    this.paymentsInstanceAnalysisParameters = paymentsInstanceAnalysisParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return paymentsInstanceAnalysisParameters
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) ")


  public String getPaymentsInstanceAnalysisParameters() {
    return paymentsInstanceAnalysisParameters;
  }

  public void setPaymentsInstanceAnalysisParameters(String paymentsInstanceAnalysisParameters) {
    this.paymentsInstanceAnalysisParameters = paymentsInstanceAnalysisParameters;
  }

  public InlineResponse20021PaymentsInstanceAnalysis paymentsInstanceAnalysisReport(Object paymentsInstanceAnalysisReport) {
    this.paymentsInstanceAnalysisReport = paymentsInstanceAnalysisReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return paymentsInstanceAnalysisReport
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate ")

  @Valid

  public Object getPaymentsInstanceAnalysisReport() {
    return paymentsInstanceAnalysisReport;
  }

  public void setPaymentsInstanceAnalysisReport(Object paymentsInstanceAnalysisReport) {
    this.paymentsInstanceAnalysisReport = paymentsInstanceAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20021PaymentsInstanceAnalysis inlineResponse20021PaymentsInstanceAnalysis = (InlineResponse20021PaymentsInstanceAnalysis) o;
    return Objects.equals(this.paymentsInstanceAnalysisRecord, inlineResponse20021PaymentsInstanceAnalysis.paymentsInstanceAnalysisRecord) &&
        Objects.equals(this.paymentsInstanceAnalysisReportType, inlineResponse20021PaymentsInstanceAnalysis.paymentsInstanceAnalysisReportType) &&
        Objects.equals(this.paymentsInstanceAnalysisParameters, inlineResponse20021PaymentsInstanceAnalysis.paymentsInstanceAnalysisParameters) &&
        Objects.equals(this.paymentsInstanceAnalysisReport, inlineResponse20021PaymentsInstanceAnalysis.paymentsInstanceAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentsInstanceAnalysisRecord, paymentsInstanceAnalysisReportType, paymentsInstanceAnalysisParameters, paymentsInstanceAnalysisReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20021PaymentsInstanceAnalysis {\n");
    
    sb.append("    paymentsInstanceAnalysisRecord: ").append(toIndentedString(paymentsInstanceAnalysisRecord)).append("\n");
    sb.append("    paymentsInstanceAnalysisReportType: ").append(toIndentedString(paymentsInstanceAnalysisReportType)).append("\n");
    sb.append("    paymentsInstanceAnalysisParameters: ").append(toIndentedString(paymentsInstanceAnalysisParameters)).append("\n");
    sb.append("    paymentsInstanceAnalysisReport: ").append(toIndentedString(paymentsInstanceAnalysisReport)).append("\n");
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

