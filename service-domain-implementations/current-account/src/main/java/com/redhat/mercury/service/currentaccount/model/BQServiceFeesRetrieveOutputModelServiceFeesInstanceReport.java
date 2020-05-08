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
 * BQServiceFeesRetrieveOutputModelServiceFeesInstanceReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class BQServiceFeesRetrieveOutputModelServiceFeesInstanceReport   {
  @JsonProperty("serviceFeesInstanceReportRecord")
  private Object serviceFeesInstanceReportRecord;

  @JsonProperty("serviceFeesInstanceReportType")
  private String serviceFeesInstanceReportType;

  @JsonProperty("serviceFeesInstanceReportParameters")
  private String serviceFeesInstanceReportParameters;

  @JsonProperty("serviceFeesInstanceReport")
  private Object serviceFeesInstanceReport;

  public BQServiceFeesRetrieveOutputModelServiceFeesInstanceReport serviceFeesInstanceReportRecord(Object serviceFeesInstanceReportRecord) {
    this.serviceFeesInstanceReportRecord = serviceFeesInstanceReportRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return serviceFeesInstanceReportRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected ")

  @Valid

  public Object getServiceFeesInstanceReportRecord() {
    return serviceFeesInstanceReportRecord;
  }

  public void setServiceFeesInstanceReportRecord(Object serviceFeesInstanceReportRecord) {
    this.serviceFeesInstanceReportRecord = serviceFeesInstanceReportRecord;
  }

  public BQServiceFeesRetrieveOutputModelServiceFeesInstanceReport serviceFeesInstanceReportType(String serviceFeesInstanceReportType) {
    this.serviceFeesInstanceReportType = serviceFeesInstanceReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return serviceFeesInstanceReportType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available ")


  public String getServiceFeesInstanceReportType() {
    return serviceFeesInstanceReportType;
  }

  public void setServiceFeesInstanceReportType(String serviceFeesInstanceReportType) {
    this.serviceFeesInstanceReportType = serviceFeesInstanceReportType;
  }

  public BQServiceFeesRetrieveOutputModelServiceFeesInstanceReport serviceFeesInstanceReportParameters(String serviceFeesInstanceReportParameters) {
    this.serviceFeesInstanceReportParameters = serviceFeesInstanceReportParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return serviceFeesInstanceReportParameters
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) ")


  public String getServiceFeesInstanceReportParameters() {
    return serviceFeesInstanceReportParameters;
  }

  public void setServiceFeesInstanceReportParameters(String serviceFeesInstanceReportParameters) {
    this.serviceFeesInstanceReportParameters = serviceFeesInstanceReportParameters;
  }

  public BQServiceFeesRetrieveOutputModelServiceFeesInstanceReport serviceFeesInstanceReport(Object serviceFeesInstanceReport) {
    this.serviceFeesInstanceReport = serviceFeesInstanceReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return serviceFeesInstanceReport
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate ")

  @Valid

  public Object getServiceFeesInstanceReport() {
    return serviceFeesInstanceReport;
  }

  public void setServiceFeesInstanceReport(Object serviceFeesInstanceReport) {
    this.serviceFeesInstanceReport = serviceFeesInstanceReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQServiceFeesRetrieveOutputModelServiceFeesInstanceReport bqServiceFeesRetrieveOutputModelServiceFeesInstanceReport = (BQServiceFeesRetrieveOutputModelServiceFeesInstanceReport) o;
    return Objects.equals(this.serviceFeesInstanceReportRecord, bqServiceFeesRetrieveOutputModelServiceFeesInstanceReport.serviceFeesInstanceReportRecord) &&
        Objects.equals(this.serviceFeesInstanceReportType, bqServiceFeesRetrieveOutputModelServiceFeesInstanceReport.serviceFeesInstanceReportType) &&
        Objects.equals(this.serviceFeesInstanceReportParameters, bqServiceFeesRetrieveOutputModelServiceFeesInstanceReport.serviceFeesInstanceReportParameters) &&
        Objects.equals(this.serviceFeesInstanceReport, bqServiceFeesRetrieveOutputModelServiceFeesInstanceReport.serviceFeesInstanceReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceFeesInstanceReportRecord, serviceFeesInstanceReportType, serviceFeesInstanceReportParameters, serviceFeesInstanceReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQServiceFeesRetrieveOutputModelServiceFeesInstanceReport {\n");
    
    sb.append("    serviceFeesInstanceReportRecord: ").append(toIndentedString(serviceFeesInstanceReportRecord)).append("\n");
    sb.append("    serviceFeesInstanceReportType: ").append(toIndentedString(serviceFeesInstanceReportType)).append("\n");
    sb.append("    serviceFeesInstanceReportParameters: ").append(toIndentedString(serviceFeesInstanceReportParameters)).append("\n");
    sb.append("    serviceFeesInstanceReport: ").append(toIndentedString(serviceFeesInstanceReport)).append("\n");
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

