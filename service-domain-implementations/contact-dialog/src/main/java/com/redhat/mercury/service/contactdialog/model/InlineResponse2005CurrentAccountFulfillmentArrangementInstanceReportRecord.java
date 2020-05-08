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
 * InlineResponse2005CurrentAccountFulfillmentArrangementInstanceReportRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class InlineResponse2005CurrentAccountFulfillmentArrangementInstanceReportRecord   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceReportData")
  private String currentAccountFulfillmentArrangementInstanceReportData;

  @JsonProperty("currentAccountFulfillmentArrangementInstanceReportType")
  private String currentAccountFulfillmentArrangementInstanceReportType;

  @JsonProperty("currentAccountFulfillmentArrangementInstanceReport")
  private Object currentAccountFulfillmentArrangementInstanceReport;

  public InlineResponse2005CurrentAccountFulfillmentArrangementInstanceReportRecord currentAccountFulfillmentArrangementInstanceReportData(String currentAccountFulfillmentArrangementInstanceReportData) {
    this.currentAccountFulfillmentArrangementInstanceReportData = currentAccountFulfillmentArrangementInstanceReportData;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return currentAccountFulfillmentArrangementInstanceReportData
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected ")


  public String getCurrentAccountFulfillmentArrangementInstanceReportData() {
    return currentAccountFulfillmentArrangementInstanceReportData;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReportData(String currentAccountFulfillmentArrangementInstanceReportData) {
    this.currentAccountFulfillmentArrangementInstanceReportData = currentAccountFulfillmentArrangementInstanceReportData;
  }

  public InlineResponse2005CurrentAccountFulfillmentArrangementInstanceReportRecord currentAccountFulfillmentArrangementInstanceReportType(String currentAccountFulfillmentArrangementInstanceReportType) {
    this.currentAccountFulfillmentArrangementInstanceReportType = currentAccountFulfillmentArrangementInstanceReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return currentAccountFulfillmentArrangementInstanceReportType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available ")


  public String getCurrentAccountFulfillmentArrangementInstanceReportType() {
    return currentAccountFulfillmentArrangementInstanceReportType;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReportType(String currentAccountFulfillmentArrangementInstanceReportType) {
    this.currentAccountFulfillmentArrangementInstanceReportType = currentAccountFulfillmentArrangementInstanceReportType;
  }

  public InlineResponse2005CurrentAccountFulfillmentArrangementInstanceReportRecord currentAccountFulfillmentArrangementInstanceReport(Object currentAccountFulfillmentArrangementInstanceReport) {
    this.currentAccountFulfillmentArrangementInstanceReport = currentAccountFulfillmentArrangementInstanceReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return currentAccountFulfillmentArrangementInstanceReport
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate ")

  @Valid

  public Object getCurrentAccountFulfillmentArrangementInstanceReport() {
    return currentAccountFulfillmentArrangementInstanceReport;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReport(Object currentAccountFulfillmentArrangementInstanceReport) {
    this.currentAccountFulfillmentArrangementInstanceReport = currentAccountFulfillmentArrangementInstanceReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005CurrentAccountFulfillmentArrangementInstanceReportRecord inlineResponse2005CurrentAccountFulfillmentArrangementInstanceReportRecord = (InlineResponse2005CurrentAccountFulfillmentArrangementInstanceReportRecord) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceReportData, inlineResponse2005CurrentAccountFulfillmentArrangementInstanceReportRecord.currentAccountFulfillmentArrangementInstanceReportData) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInstanceReportType, inlineResponse2005CurrentAccountFulfillmentArrangementInstanceReportRecord.currentAccountFulfillmentArrangementInstanceReportType) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInstanceReport, inlineResponse2005CurrentAccountFulfillmentArrangementInstanceReportRecord.currentAccountFulfillmentArrangementInstanceReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceReportData, currentAccountFulfillmentArrangementInstanceReportType, currentAccountFulfillmentArrangementInstanceReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005CurrentAccountFulfillmentArrangementInstanceReportRecord {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceReportData: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReportData)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInstanceReportType: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReportType)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInstanceReport: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReport)).append("\n");
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

