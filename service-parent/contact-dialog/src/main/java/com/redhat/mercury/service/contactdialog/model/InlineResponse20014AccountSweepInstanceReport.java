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
 * InlineResponse20014AccountSweepInstanceReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class InlineResponse20014AccountSweepInstanceReport   {
  @JsonProperty("accountSweepInstanceReportRecord")
  private Object accountSweepInstanceReportRecord;

  @JsonProperty("accountSweepInstanceReportType")
  private String accountSweepInstanceReportType;

  @JsonProperty("accountSweepInstanceReportParameters")
  private String accountSweepInstanceReportParameters;

  @JsonProperty("accountSweepInstanceReport")
  private Object accountSweepInstanceReport;

  public InlineResponse20014AccountSweepInstanceReport accountSweepInstanceReportRecord(Object accountSweepInstanceReportRecord) {
    this.accountSweepInstanceReportRecord = accountSweepInstanceReportRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return accountSweepInstanceReportRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected ")

  @Valid

  public Object getAccountSweepInstanceReportRecord() {
    return accountSweepInstanceReportRecord;
  }

  public void setAccountSweepInstanceReportRecord(Object accountSweepInstanceReportRecord) {
    this.accountSweepInstanceReportRecord = accountSweepInstanceReportRecord;
  }

  public InlineResponse20014AccountSweepInstanceReport accountSweepInstanceReportType(String accountSweepInstanceReportType) {
    this.accountSweepInstanceReportType = accountSweepInstanceReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return accountSweepInstanceReportType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available ")


  public String getAccountSweepInstanceReportType() {
    return accountSweepInstanceReportType;
  }

  public void setAccountSweepInstanceReportType(String accountSweepInstanceReportType) {
    this.accountSweepInstanceReportType = accountSweepInstanceReportType;
  }

  public InlineResponse20014AccountSweepInstanceReport accountSweepInstanceReportParameters(String accountSweepInstanceReportParameters) {
    this.accountSweepInstanceReportParameters = accountSweepInstanceReportParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return accountSweepInstanceReportParameters
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) ")


  public String getAccountSweepInstanceReportParameters() {
    return accountSweepInstanceReportParameters;
  }

  public void setAccountSweepInstanceReportParameters(String accountSweepInstanceReportParameters) {
    this.accountSweepInstanceReportParameters = accountSweepInstanceReportParameters;
  }

  public InlineResponse20014AccountSweepInstanceReport accountSweepInstanceReport(Object accountSweepInstanceReport) {
    this.accountSweepInstanceReport = accountSweepInstanceReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return accountSweepInstanceReport
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate ")

  @Valid

  public Object getAccountSweepInstanceReport() {
    return accountSweepInstanceReport;
  }

  public void setAccountSweepInstanceReport(Object accountSweepInstanceReport) {
    this.accountSweepInstanceReport = accountSweepInstanceReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014AccountSweepInstanceReport inlineResponse20014AccountSweepInstanceReport = (InlineResponse20014AccountSweepInstanceReport) o;
    return Objects.equals(this.accountSweepInstanceReportRecord, inlineResponse20014AccountSweepInstanceReport.accountSweepInstanceReportRecord) &&
        Objects.equals(this.accountSweepInstanceReportType, inlineResponse20014AccountSweepInstanceReport.accountSweepInstanceReportType) &&
        Objects.equals(this.accountSweepInstanceReportParameters, inlineResponse20014AccountSweepInstanceReport.accountSweepInstanceReportParameters) &&
        Objects.equals(this.accountSweepInstanceReport, inlineResponse20014AccountSweepInstanceReport.accountSweepInstanceReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSweepInstanceReportRecord, accountSweepInstanceReportType, accountSweepInstanceReportParameters, accountSweepInstanceReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014AccountSweepInstanceReport {\n");
    
    sb.append("    accountSweepInstanceReportRecord: ").append(toIndentedString(accountSweepInstanceReportRecord)).append("\n");
    sb.append("    accountSweepInstanceReportType: ").append(toIndentedString(accountSweepInstanceReportType)).append("\n");
    sb.append("    accountSweepInstanceReportParameters: ").append(toIndentedString(accountSweepInstanceReportParameters)).append("\n");
    sb.append("    accountSweepInstanceReport: ").append(toIndentedString(accountSweepInstanceReport)).append("\n");
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

