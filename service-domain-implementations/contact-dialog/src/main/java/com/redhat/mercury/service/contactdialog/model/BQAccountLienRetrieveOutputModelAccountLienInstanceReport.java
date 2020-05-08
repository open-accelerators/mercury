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
 * BQAccountLienRetrieveOutputModelAccountLienInstanceReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQAccountLienRetrieveOutputModelAccountLienInstanceReport   {
  @JsonProperty("accountLienInstanceReportRecord")
  private Object accountLienInstanceReportRecord;

  @JsonProperty("accountLienInstanceReportType")
  private String accountLienInstanceReportType;

  @JsonProperty("accountLienInstanceReportParameters")
  private String accountLienInstanceReportParameters;

  @JsonProperty("accountLienInstanceReport")
  private Object accountLienInstanceReport;

  public BQAccountLienRetrieveOutputModelAccountLienInstanceReport accountLienInstanceReportRecord(Object accountLienInstanceReportRecord) {
    this.accountLienInstanceReportRecord = accountLienInstanceReportRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return accountLienInstanceReportRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected ")

  @Valid

  public Object getAccountLienInstanceReportRecord() {
    return accountLienInstanceReportRecord;
  }

  public void setAccountLienInstanceReportRecord(Object accountLienInstanceReportRecord) {
    this.accountLienInstanceReportRecord = accountLienInstanceReportRecord;
  }

  public BQAccountLienRetrieveOutputModelAccountLienInstanceReport accountLienInstanceReportType(String accountLienInstanceReportType) {
    this.accountLienInstanceReportType = accountLienInstanceReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return accountLienInstanceReportType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available ")


  public String getAccountLienInstanceReportType() {
    return accountLienInstanceReportType;
  }

  public void setAccountLienInstanceReportType(String accountLienInstanceReportType) {
    this.accountLienInstanceReportType = accountLienInstanceReportType;
  }

  public BQAccountLienRetrieveOutputModelAccountLienInstanceReport accountLienInstanceReportParameters(String accountLienInstanceReportParameters) {
    this.accountLienInstanceReportParameters = accountLienInstanceReportParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return accountLienInstanceReportParameters
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) ")


  public String getAccountLienInstanceReportParameters() {
    return accountLienInstanceReportParameters;
  }

  public void setAccountLienInstanceReportParameters(String accountLienInstanceReportParameters) {
    this.accountLienInstanceReportParameters = accountLienInstanceReportParameters;
  }

  public BQAccountLienRetrieveOutputModelAccountLienInstanceReport accountLienInstanceReport(Object accountLienInstanceReport) {
    this.accountLienInstanceReport = accountLienInstanceReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return accountLienInstanceReport
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate ")

  @Valid

  public Object getAccountLienInstanceReport() {
    return accountLienInstanceReport;
  }

  public void setAccountLienInstanceReport(Object accountLienInstanceReport) {
    this.accountLienInstanceReport = accountLienInstanceReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountLienRetrieveOutputModelAccountLienInstanceReport bqAccountLienRetrieveOutputModelAccountLienInstanceReport = (BQAccountLienRetrieveOutputModelAccountLienInstanceReport) o;
    return Objects.equals(this.accountLienInstanceReportRecord, bqAccountLienRetrieveOutputModelAccountLienInstanceReport.accountLienInstanceReportRecord) &&
        Objects.equals(this.accountLienInstanceReportType, bqAccountLienRetrieveOutputModelAccountLienInstanceReport.accountLienInstanceReportType) &&
        Objects.equals(this.accountLienInstanceReportParameters, bqAccountLienRetrieveOutputModelAccountLienInstanceReport.accountLienInstanceReportParameters) &&
        Objects.equals(this.accountLienInstanceReport, bqAccountLienRetrieveOutputModelAccountLienInstanceReport.accountLienInstanceReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountLienInstanceReportRecord, accountLienInstanceReportType, accountLienInstanceReportParameters, accountLienInstanceReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountLienRetrieveOutputModelAccountLienInstanceReport {\n");
    
    sb.append("    accountLienInstanceReportRecord: ").append(toIndentedString(accountLienInstanceReportRecord)).append("\n");
    sb.append("    accountLienInstanceReportType: ").append(toIndentedString(accountLienInstanceReportType)).append("\n");
    sb.append("    accountLienInstanceReportParameters: ").append(toIndentedString(accountLienInstanceReportParameters)).append("\n");
    sb.append("    accountLienInstanceReport: ").append(toIndentedString(accountLienInstanceReport)).append("\n");
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

