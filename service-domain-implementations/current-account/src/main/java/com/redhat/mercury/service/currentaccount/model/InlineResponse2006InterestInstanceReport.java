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
 * InlineResponse2006InterestInstanceReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class InlineResponse2006InterestInstanceReport   {
  @JsonProperty("interestInstanceReportRecord")
  private Object interestInstanceReportRecord;

  @JsonProperty("interestInstanceReportType")
  private String interestInstanceReportType;

  @JsonProperty("interestInstanceReportParameters")
  private String interestInstanceReportParameters;

  @JsonProperty("interestInstanceReport")
  private Object interestInstanceReport;

  public InlineResponse2006InterestInstanceReport interestInstanceReportRecord(Object interestInstanceReportRecord) {
    this.interestInstanceReportRecord = interestInstanceReportRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return interestInstanceReportRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected ")

  @Valid

  public Object getInterestInstanceReportRecord() {
    return interestInstanceReportRecord;
  }

  public void setInterestInstanceReportRecord(Object interestInstanceReportRecord) {
    this.interestInstanceReportRecord = interestInstanceReportRecord;
  }

  public InlineResponse2006InterestInstanceReport interestInstanceReportType(String interestInstanceReportType) {
    this.interestInstanceReportType = interestInstanceReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return interestInstanceReportType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available ")


  public String getInterestInstanceReportType() {
    return interestInstanceReportType;
  }

  public void setInterestInstanceReportType(String interestInstanceReportType) {
    this.interestInstanceReportType = interestInstanceReportType;
  }

  public InlineResponse2006InterestInstanceReport interestInstanceReportParameters(String interestInstanceReportParameters) {
    this.interestInstanceReportParameters = interestInstanceReportParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return interestInstanceReportParameters
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) ")


  public String getInterestInstanceReportParameters() {
    return interestInstanceReportParameters;
  }

  public void setInterestInstanceReportParameters(String interestInstanceReportParameters) {
    this.interestInstanceReportParameters = interestInstanceReportParameters;
  }

  public InlineResponse2006InterestInstanceReport interestInstanceReport(Object interestInstanceReport) {
    this.interestInstanceReport = interestInstanceReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return interestInstanceReport
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate ")

  @Valid

  public Object getInterestInstanceReport() {
    return interestInstanceReport;
  }

  public void setInterestInstanceReport(Object interestInstanceReport) {
    this.interestInstanceReport = interestInstanceReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006InterestInstanceReport inlineResponse2006InterestInstanceReport = (InlineResponse2006InterestInstanceReport) o;
    return Objects.equals(this.interestInstanceReportRecord, inlineResponse2006InterestInstanceReport.interestInstanceReportRecord) &&
        Objects.equals(this.interestInstanceReportType, inlineResponse2006InterestInstanceReport.interestInstanceReportType) &&
        Objects.equals(this.interestInstanceReportParameters, inlineResponse2006InterestInstanceReport.interestInstanceReportParameters) &&
        Objects.equals(this.interestInstanceReport, inlineResponse2006InterestInstanceReport.interestInstanceReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestInstanceReportRecord, interestInstanceReportType, interestInstanceReportParameters, interestInstanceReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006InterestInstanceReport {\n");
    
    sb.append("    interestInstanceReportRecord: ").append(toIndentedString(interestInstanceReportRecord)).append("\n");
    sb.append("    interestInstanceReportType: ").append(toIndentedString(interestInstanceReportType)).append("\n");
    sb.append("    interestInstanceReportParameters: ").append(toIndentedString(interestInstanceReportParameters)).append("\n");
    sb.append("    interestInstanceReport: ").append(toIndentedString(interestInstanceReport)).append("\n");
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

