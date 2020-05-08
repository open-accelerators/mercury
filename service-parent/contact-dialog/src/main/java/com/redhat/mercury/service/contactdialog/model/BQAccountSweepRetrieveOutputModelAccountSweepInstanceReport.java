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
 * BQAccountSweepRetrieveOutputModelAccountSweepInstanceReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class BQAccountSweepRetrieveOutputModelAccountSweepInstanceReport   {
  @JsonProperty("accountSweepInstanceReportRecord")
  private Object accountSweepInstanceReportRecord;

  @JsonProperty("accountSweepInstanceReportType")
  private String accountSweepInstanceReportType;

  @JsonProperty("accountSweepInstanceReportParameters")
  private String accountSweepInstanceReportParameters;

  @JsonProperty("accountSweepInstanceReport")
  private Object accountSweepInstanceReport;

  public BQAccountSweepRetrieveOutputModelAccountSweepInstanceReport accountSweepInstanceReportRecord(Object accountSweepInstanceReportRecord) {
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

  public BQAccountSweepRetrieveOutputModelAccountSweepInstanceReport accountSweepInstanceReportType(String accountSweepInstanceReportType) {
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

  public BQAccountSweepRetrieveOutputModelAccountSweepInstanceReport accountSweepInstanceReportParameters(String accountSweepInstanceReportParameters) {
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

  public BQAccountSweepRetrieveOutputModelAccountSweepInstanceReport accountSweepInstanceReport(Object accountSweepInstanceReport) {
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
    BQAccountSweepRetrieveOutputModelAccountSweepInstanceReport bqAccountSweepRetrieveOutputModelAccountSweepInstanceReport = (BQAccountSweepRetrieveOutputModelAccountSweepInstanceReport) o;
    return Objects.equals(this.accountSweepInstanceReportRecord, bqAccountSweepRetrieveOutputModelAccountSweepInstanceReport.accountSweepInstanceReportRecord) &&
        Objects.equals(this.accountSweepInstanceReportType, bqAccountSweepRetrieveOutputModelAccountSweepInstanceReport.accountSweepInstanceReportType) &&
        Objects.equals(this.accountSweepInstanceReportParameters, bqAccountSweepRetrieveOutputModelAccountSweepInstanceReport.accountSweepInstanceReportParameters) &&
        Objects.equals(this.accountSweepInstanceReport, bqAccountSweepRetrieveOutputModelAccountSweepInstanceReport.accountSweepInstanceReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSweepInstanceReportRecord, accountSweepInstanceReportType, accountSweepInstanceReportParameters, accountSweepInstanceReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountSweepRetrieveOutputModelAccountSweepInstanceReport {\n");
    
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

