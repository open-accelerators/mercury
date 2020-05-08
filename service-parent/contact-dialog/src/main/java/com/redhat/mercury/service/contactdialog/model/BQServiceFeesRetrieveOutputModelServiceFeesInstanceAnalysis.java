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
 * BQServiceFeesRetrieveOutputModelServiceFeesInstanceAnalysis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQServiceFeesRetrieveOutputModelServiceFeesInstanceAnalysis   {
  @JsonProperty("serviceFeesInstanceAnalysisRecord")
  private Object serviceFeesInstanceAnalysisRecord;

  @JsonProperty("serviceFeesInstanceAnalysisReportType")
  private String serviceFeesInstanceAnalysisReportType;

  @JsonProperty("serviceFeesInstanceAnalysisParameters")
  private String serviceFeesInstanceAnalysisParameters;

  @JsonProperty("serviceFeesInstanceAnalysisReport")
  private Object serviceFeesInstanceAnalysisReport;

  public BQServiceFeesRetrieveOutputModelServiceFeesInstanceAnalysis serviceFeesInstanceAnalysisRecord(Object serviceFeesInstanceAnalysisRecord) {
    this.serviceFeesInstanceAnalysisRecord = serviceFeesInstanceAnalysisRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return serviceFeesInstanceAnalysisRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected ")

  @Valid

  public Object getServiceFeesInstanceAnalysisRecord() {
    return serviceFeesInstanceAnalysisRecord;
  }

  public void setServiceFeesInstanceAnalysisRecord(Object serviceFeesInstanceAnalysisRecord) {
    this.serviceFeesInstanceAnalysisRecord = serviceFeesInstanceAnalysisRecord;
  }

  public BQServiceFeesRetrieveOutputModelServiceFeesInstanceAnalysis serviceFeesInstanceAnalysisReportType(String serviceFeesInstanceAnalysisReportType) {
    this.serviceFeesInstanceAnalysisReportType = serviceFeesInstanceAnalysisReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return serviceFeesInstanceAnalysisReportType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available ")


  public String getServiceFeesInstanceAnalysisReportType() {
    return serviceFeesInstanceAnalysisReportType;
  }

  public void setServiceFeesInstanceAnalysisReportType(String serviceFeesInstanceAnalysisReportType) {
    this.serviceFeesInstanceAnalysisReportType = serviceFeesInstanceAnalysisReportType;
  }

  public BQServiceFeesRetrieveOutputModelServiceFeesInstanceAnalysis serviceFeesInstanceAnalysisParameters(String serviceFeesInstanceAnalysisParameters) {
    this.serviceFeesInstanceAnalysisParameters = serviceFeesInstanceAnalysisParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return serviceFeesInstanceAnalysisParameters
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) ")


  public String getServiceFeesInstanceAnalysisParameters() {
    return serviceFeesInstanceAnalysisParameters;
  }

  public void setServiceFeesInstanceAnalysisParameters(String serviceFeesInstanceAnalysisParameters) {
    this.serviceFeesInstanceAnalysisParameters = serviceFeesInstanceAnalysisParameters;
  }

  public BQServiceFeesRetrieveOutputModelServiceFeesInstanceAnalysis serviceFeesInstanceAnalysisReport(Object serviceFeesInstanceAnalysisReport) {
    this.serviceFeesInstanceAnalysisReport = serviceFeesInstanceAnalysisReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return serviceFeesInstanceAnalysisReport
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate ")

  @Valid

  public Object getServiceFeesInstanceAnalysisReport() {
    return serviceFeesInstanceAnalysisReport;
  }

  public void setServiceFeesInstanceAnalysisReport(Object serviceFeesInstanceAnalysisReport) {
    this.serviceFeesInstanceAnalysisReport = serviceFeesInstanceAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQServiceFeesRetrieveOutputModelServiceFeesInstanceAnalysis bqServiceFeesRetrieveOutputModelServiceFeesInstanceAnalysis = (BQServiceFeesRetrieveOutputModelServiceFeesInstanceAnalysis) o;
    return Objects.equals(this.serviceFeesInstanceAnalysisRecord, bqServiceFeesRetrieveOutputModelServiceFeesInstanceAnalysis.serviceFeesInstanceAnalysisRecord) &&
        Objects.equals(this.serviceFeesInstanceAnalysisReportType, bqServiceFeesRetrieveOutputModelServiceFeesInstanceAnalysis.serviceFeesInstanceAnalysisReportType) &&
        Objects.equals(this.serviceFeesInstanceAnalysisParameters, bqServiceFeesRetrieveOutputModelServiceFeesInstanceAnalysis.serviceFeesInstanceAnalysisParameters) &&
        Objects.equals(this.serviceFeesInstanceAnalysisReport, bqServiceFeesRetrieveOutputModelServiceFeesInstanceAnalysis.serviceFeesInstanceAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceFeesInstanceAnalysisRecord, serviceFeesInstanceAnalysisReportType, serviceFeesInstanceAnalysisParameters, serviceFeesInstanceAnalysisReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQServiceFeesRetrieveOutputModelServiceFeesInstanceAnalysis {\n");
    
    sb.append("    serviceFeesInstanceAnalysisRecord: ").append(toIndentedString(serviceFeesInstanceAnalysisRecord)).append("\n");
    sb.append("    serviceFeesInstanceAnalysisReportType: ").append(toIndentedString(serviceFeesInstanceAnalysisReportType)).append("\n");
    sb.append("    serviceFeesInstanceAnalysisParameters: ").append(toIndentedString(serviceFeesInstanceAnalysisParameters)).append("\n");
    sb.append("    serviceFeesInstanceAnalysisReport: ").append(toIndentedString(serviceFeesInstanceAnalysisReport)).append("\n");
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

