package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.BQPaymentsRetrieveInputModelPaymentsInstanceAnalysis1;
import com.redhat.mercury.service.contactdialog.model.BQPaymentsRetrieveInputModelPaymentsInstanceReport1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQPaymentsRetrieveInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQPaymentsRetrieveInputModel   {
  @JsonProperty("paymentsRetrieveActionTaskRecord")
  private Object paymentsRetrieveActionTaskRecord;

  @JsonProperty("paymentsRetrieveActionRequest")
  private String paymentsRetrieveActionRequest;

  @JsonProperty("paymentsInstanceReport")
  private BQPaymentsRetrieveInputModelPaymentsInstanceReport1 paymentsInstanceReport;

  @JsonProperty("paymentsInstanceAnalysis")
  private BQPaymentsRetrieveInputModelPaymentsInstanceAnalysis1 paymentsInstanceAnalysis;

  public BQPaymentsRetrieveInputModel paymentsRetrieveActionTaskRecord(Object paymentsRetrieveActionTaskRecord) {
    this.paymentsRetrieveActionTaskRecord = paymentsRetrieveActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return paymentsRetrieveActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")

  @Valid

  public Object getPaymentsRetrieveActionTaskRecord() {
    return paymentsRetrieveActionTaskRecord;
  }

  public void setPaymentsRetrieveActionTaskRecord(Object paymentsRetrieveActionTaskRecord) {
    this.paymentsRetrieveActionTaskRecord = paymentsRetrieveActionTaskRecord;
  }

  public BQPaymentsRetrieveInputModel paymentsRetrieveActionRequest(String paymentsRetrieveActionRequest) {
    this.paymentsRetrieveActionRequest = paymentsRetrieveActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return paymentsRetrieveActionRequest
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")


  public String getPaymentsRetrieveActionRequest() {
    return paymentsRetrieveActionRequest;
  }

  public void setPaymentsRetrieveActionRequest(String paymentsRetrieveActionRequest) {
    this.paymentsRetrieveActionRequest = paymentsRetrieveActionRequest;
  }

  public BQPaymentsRetrieveInputModel paymentsInstanceReport(BQPaymentsRetrieveInputModelPaymentsInstanceReport1 paymentsInstanceReport) {
    this.paymentsInstanceReport = paymentsInstanceReport;
    return this;
  }

  /**
   * Get paymentsInstanceReport
   * @return paymentsInstanceReport
  */
  @ApiModelProperty(value = "")

  @Valid

  public BQPaymentsRetrieveInputModelPaymentsInstanceReport1 getPaymentsInstanceReport() {
    return paymentsInstanceReport;
  }

  public void setPaymentsInstanceReport(BQPaymentsRetrieveInputModelPaymentsInstanceReport1 paymentsInstanceReport) {
    this.paymentsInstanceReport = paymentsInstanceReport;
  }

  public BQPaymentsRetrieveInputModel paymentsInstanceAnalysis(BQPaymentsRetrieveInputModelPaymentsInstanceAnalysis1 paymentsInstanceAnalysis) {
    this.paymentsInstanceAnalysis = paymentsInstanceAnalysis;
    return this;
  }

  /**
   * Get paymentsInstanceAnalysis
   * @return paymentsInstanceAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public BQPaymentsRetrieveInputModelPaymentsInstanceAnalysis1 getPaymentsInstanceAnalysis() {
    return paymentsInstanceAnalysis;
  }

  public void setPaymentsInstanceAnalysis(BQPaymentsRetrieveInputModelPaymentsInstanceAnalysis1 paymentsInstanceAnalysis) {
    this.paymentsInstanceAnalysis = paymentsInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQPaymentsRetrieveInputModel bqPaymentsRetrieveInputModel = (BQPaymentsRetrieveInputModel) o;
    return Objects.equals(this.paymentsRetrieveActionTaskRecord, bqPaymentsRetrieveInputModel.paymentsRetrieveActionTaskRecord) &&
        Objects.equals(this.paymentsRetrieveActionRequest, bqPaymentsRetrieveInputModel.paymentsRetrieveActionRequest) &&
        Objects.equals(this.paymentsInstanceReport, bqPaymentsRetrieveInputModel.paymentsInstanceReport) &&
        Objects.equals(this.paymentsInstanceAnalysis, bqPaymentsRetrieveInputModel.paymentsInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentsRetrieveActionTaskRecord, paymentsRetrieveActionRequest, paymentsInstanceReport, paymentsInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQPaymentsRetrieveInputModel {\n");
    
    sb.append("    paymentsRetrieveActionTaskRecord: ").append(toIndentedString(paymentsRetrieveActionTaskRecord)).append("\n");
    sb.append("    paymentsRetrieveActionRequest: ").append(toIndentedString(paymentsRetrieveActionRequest)).append("\n");
    sb.append("    paymentsInstanceReport: ").append(toIndentedString(paymentsInstanceReport)).append("\n");
    sb.append("    paymentsInstanceAnalysis: ").append(toIndentedString(paymentsInstanceAnalysis)).append("\n");
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

