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
 * BQPaymentsRetrieveOutputModelPaymentsInstanceReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class BQPaymentsRetrieveOutputModelPaymentsInstanceReport   {
  @JsonProperty("paymentsInstanceReportRecord")
  private Object paymentsInstanceReportRecord;

  @JsonProperty("paymentsInstanceReportType")
  private String paymentsInstanceReportType;

  @JsonProperty("paymentsInstanceReportParameters")
  private String paymentsInstanceReportParameters;

  @JsonProperty("paymentsInstanceReport")
  private Object paymentsInstanceReport;

  public BQPaymentsRetrieveOutputModelPaymentsInstanceReport paymentsInstanceReportRecord(Object paymentsInstanceReportRecord) {
    this.paymentsInstanceReportRecord = paymentsInstanceReportRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return paymentsInstanceReportRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected ")

  @Valid

  public Object getPaymentsInstanceReportRecord() {
    return paymentsInstanceReportRecord;
  }

  public void setPaymentsInstanceReportRecord(Object paymentsInstanceReportRecord) {
    this.paymentsInstanceReportRecord = paymentsInstanceReportRecord;
  }

  public BQPaymentsRetrieveOutputModelPaymentsInstanceReport paymentsInstanceReportType(String paymentsInstanceReportType) {
    this.paymentsInstanceReportType = paymentsInstanceReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return paymentsInstanceReportType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available ")


  public String getPaymentsInstanceReportType() {
    return paymentsInstanceReportType;
  }

  public void setPaymentsInstanceReportType(String paymentsInstanceReportType) {
    this.paymentsInstanceReportType = paymentsInstanceReportType;
  }

  public BQPaymentsRetrieveOutputModelPaymentsInstanceReport paymentsInstanceReportParameters(String paymentsInstanceReportParameters) {
    this.paymentsInstanceReportParameters = paymentsInstanceReportParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return paymentsInstanceReportParameters
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) ")


  public String getPaymentsInstanceReportParameters() {
    return paymentsInstanceReportParameters;
  }

  public void setPaymentsInstanceReportParameters(String paymentsInstanceReportParameters) {
    this.paymentsInstanceReportParameters = paymentsInstanceReportParameters;
  }

  public BQPaymentsRetrieveOutputModelPaymentsInstanceReport paymentsInstanceReport(Object paymentsInstanceReport) {
    this.paymentsInstanceReport = paymentsInstanceReport;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return paymentsInstanceReport
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate ")

  @Valid

  public Object getPaymentsInstanceReport() {
    return paymentsInstanceReport;
  }

  public void setPaymentsInstanceReport(Object paymentsInstanceReport) {
    this.paymentsInstanceReport = paymentsInstanceReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQPaymentsRetrieveOutputModelPaymentsInstanceReport bqPaymentsRetrieveOutputModelPaymentsInstanceReport = (BQPaymentsRetrieveOutputModelPaymentsInstanceReport) o;
    return Objects.equals(this.paymentsInstanceReportRecord, bqPaymentsRetrieveOutputModelPaymentsInstanceReport.paymentsInstanceReportRecord) &&
        Objects.equals(this.paymentsInstanceReportType, bqPaymentsRetrieveOutputModelPaymentsInstanceReport.paymentsInstanceReportType) &&
        Objects.equals(this.paymentsInstanceReportParameters, bqPaymentsRetrieveOutputModelPaymentsInstanceReport.paymentsInstanceReportParameters) &&
        Objects.equals(this.paymentsInstanceReport, bqPaymentsRetrieveOutputModelPaymentsInstanceReport.paymentsInstanceReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentsInstanceReportRecord, paymentsInstanceReportType, paymentsInstanceReportParameters, paymentsInstanceReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQPaymentsRetrieveOutputModelPaymentsInstanceReport {\n");
    
    sb.append("    paymentsInstanceReportRecord: ").append(toIndentedString(paymentsInstanceReportRecord)).append("\n");
    sb.append("    paymentsInstanceReportType: ").append(toIndentedString(paymentsInstanceReportType)).append("\n");
    sb.append("    paymentsInstanceReportParameters: ").append(toIndentedString(paymentsInstanceReportParameters)).append("\n");
    sb.append("    paymentsInstanceReport: ").append(toIndentedString(paymentsInstanceReport)).append("\n");
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

