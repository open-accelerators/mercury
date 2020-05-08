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
 * InlineResponse20024IssuedDeviceInstanceAnalysis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class InlineResponse20024IssuedDeviceInstanceAnalysis   {
  @JsonProperty("issuedDeviceInstanceAnalysisRecord")
  private Object issuedDeviceInstanceAnalysisRecord;

  @JsonProperty("issuedDeviceInstanceAnalysisReportType")
  private String issuedDeviceInstanceAnalysisReportType;

  @JsonProperty("issuedDeviceInstanceAnalysisParameters")
  private String issuedDeviceInstanceAnalysisParameters;

  @JsonProperty("issuedDeviceInstanceAnalysisReport")
  private Object issuedDeviceInstanceAnalysisReport;

  public InlineResponse20024IssuedDeviceInstanceAnalysis issuedDeviceInstanceAnalysisRecord(Object issuedDeviceInstanceAnalysisRecord) {
    this.issuedDeviceInstanceAnalysisRecord = issuedDeviceInstanceAnalysisRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return issuedDeviceInstanceAnalysisRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected ")

  @Valid

  public Object getIssuedDeviceInstanceAnalysisRecord() {
    return issuedDeviceInstanceAnalysisRecord;
  }

  public void setIssuedDeviceInstanceAnalysisRecord(Object issuedDeviceInstanceAnalysisRecord) {
    this.issuedDeviceInstanceAnalysisRecord = issuedDeviceInstanceAnalysisRecord;
  }

  public InlineResponse20024IssuedDeviceInstanceAnalysis issuedDeviceInstanceAnalysisReportType(String issuedDeviceInstanceAnalysisReportType) {
    this.issuedDeviceInstanceAnalysisReportType = issuedDeviceInstanceAnalysisReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return issuedDeviceInstanceAnalysisReportType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available ")


  public String getIssuedDeviceInstanceAnalysisReportType() {
    return issuedDeviceInstanceAnalysisReportType;
  }

  public void setIssuedDeviceInstanceAnalysisReportType(String issuedDeviceInstanceAnalysisReportType) {
    this.issuedDeviceInstanceAnalysisReportType = issuedDeviceInstanceAnalysisReportType;
  }

  public InlineResponse20024IssuedDeviceInstanceAnalysis issuedDeviceInstanceAnalysisParameters(String issuedDeviceInstanceAnalysisParameters) {
    this.issuedDeviceInstanceAnalysisParameters = issuedDeviceInstanceAnalysisParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return issuedDeviceInstanceAnalysisParameters
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) ")


  public String getIssuedDeviceInstanceAnalysisParameters() {
    return issuedDeviceInstanceAnalysisParameters;
  }

  public void setIssuedDeviceInstanceAnalysisParameters(String issuedDeviceInstanceAnalysisParameters) {
    this.issuedDeviceInstanceAnalysisParameters = issuedDeviceInstanceAnalysisParameters;
  }

  public InlineResponse20024IssuedDeviceInstanceAnalysis issuedDeviceInstanceAnalysisReport(Object issuedDeviceInstanceAnalysisReport) {
    this.issuedDeviceInstanceAnalysisReport = issuedDeviceInstanceAnalysisReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return issuedDeviceInstanceAnalysisReport
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate ")

  @Valid

  public Object getIssuedDeviceInstanceAnalysisReport() {
    return issuedDeviceInstanceAnalysisReport;
  }

  public void setIssuedDeviceInstanceAnalysisReport(Object issuedDeviceInstanceAnalysisReport) {
    this.issuedDeviceInstanceAnalysisReport = issuedDeviceInstanceAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20024IssuedDeviceInstanceAnalysis inlineResponse20024IssuedDeviceInstanceAnalysis = (InlineResponse20024IssuedDeviceInstanceAnalysis) o;
    return Objects.equals(this.issuedDeviceInstanceAnalysisRecord, inlineResponse20024IssuedDeviceInstanceAnalysis.issuedDeviceInstanceAnalysisRecord) &&
        Objects.equals(this.issuedDeviceInstanceAnalysisReportType, inlineResponse20024IssuedDeviceInstanceAnalysis.issuedDeviceInstanceAnalysisReportType) &&
        Objects.equals(this.issuedDeviceInstanceAnalysisParameters, inlineResponse20024IssuedDeviceInstanceAnalysis.issuedDeviceInstanceAnalysisParameters) &&
        Objects.equals(this.issuedDeviceInstanceAnalysisReport, inlineResponse20024IssuedDeviceInstanceAnalysis.issuedDeviceInstanceAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceInstanceAnalysisRecord, issuedDeviceInstanceAnalysisReportType, issuedDeviceInstanceAnalysisParameters, issuedDeviceInstanceAnalysisReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20024IssuedDeviceInstanceAnalysis {\n");
    
    sb.append("    issuedDeviceInstanceAnalysisRecord: ").append(toIndentedString(issuedDeviceInstanceAnalysisRecord)).append("\n");
    sb.append("    issuedDeviceInstanceAnalysisReportType: ").append(toIndentedString(issuedDeviceInstanceAnalysisReportType)).append("\n");
    sb.append("    issuedDeviceInstanceAnalysisParameters: ").append(toIndentedString(issuedDeviceInstanceAnalysisParameters)).append("\n");
    sb.append("    issuedDeviceInstanceAnalysisReport: ").append(toIndentedString(issuedDeviceInstanceAnalysisReport)).append("\n");
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

