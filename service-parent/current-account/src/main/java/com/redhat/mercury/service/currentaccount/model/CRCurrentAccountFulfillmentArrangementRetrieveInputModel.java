package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis1;
import com.redhat.mercury.service.currentaccount.model.CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CRCurrentAccountFulfillmentArrangementRetrieveInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class CRCurrentAccountFulfillmentArrangementRetrieveInputModel   {
  @JsonProperty("currentAccountFulfillmentArrangementRetrieveActionTaskRecord")
  private Object currentAccountFulfillmentArrangementRetrieveActionTaskRecord;

  @JsonProperty("currentAccountFulfillmentArrangementRetrieveActionRequest")
  private String currentAccountFulfillmentArrangementRetrieveActionRequest;

  @JsonProperty("currentAccountFulfillmentArrangementInstanceReportRecord")
  private CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord1 currentAccountFulfillmentArrangementInstanceReportRecord;

  @JsonProperty("currentAccountFulfillmentArrangementInstanceAnalysis")
  private CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis1 currentAccountFulfillmentArrangementInstanceAnalysis;

  public CRCurrentAccountFulfillmentArrangementRetrieveInputModel currentAccountFulfillmentArrangementRetrieveActionTaskRecord(Object currentAccountFulfillmentArrangementRetrieveActionTaskRecord) {
    this.currentAccountFulfillmentArrangementRetrieveActionTaskRecord = currentAccountFulfillmentArrangementRetrieveActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return currentAccountFulfillmentArrangementRetrieveActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")

  @Valid

  public Object getCurrentAccountFulfillmentArrangementRetrieveActionTaskRecord() {
    return currentAccountFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setCurrentAccountFulfillmentArrangementRetrieveActionTaskRecord(Object currentAccountFulfillmentArrangementRetrieveActionTaskRecord) {
    this.currentAccountFulfillmentArrangementRetrieveActionTaskRecord = currentAccountFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public CRCurrentAccountFulfillmentArrangementRetrieveInputModel currentAccountFulfillmentArrangementRetrieveActionRequest(String currentAccountFulfillmentArrangementRetrieveActionRequest) {
    this.currentAccountFulfillmentArrangementRetrieveActionRequest = currentAccountFulfillmentArrangementRetrieveActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return currentAccountFulfillmentArrangementRetrieveActionRequest
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")


  public String getCurrentAccountFulfillmentArrangementRetrieveActionRequest() {
    return currentAccountFulfillmentArrangementRetrieveActionRequest;
  }

  public void setCurrentAccountFulfillmentArrangementRetrieveActionRequest(String currentAccountFulfillmentArrangementRetrieveActionRequest) {
    this.currentAccountFulfillmentArrangementRetrieveActionRequest = currentAccountFulfillmentArrangementRetrieveActionRequest;
  }

  public CRCurrentAccountFulfillmentArrangementRetrieveInputModel currentAccountFulfillmentArrangementInstanceReportRecord(CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord1 currentAccountFulfillmentArrangementInstanceReportRecord) {
    this.currentAccountFulfillmentArrangementInstanceReportRecord = currentAccountFulfillmentArrangementInstanceReportRecord;
    return this;
  }

  /**
   * Get currentAccountFulfillmentArrangementInstanceReportRecord
   * @return currentAccountFulfillmentArrangementInstanceReportRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord1 getCurrentAccountFulfillmentArrangementInstanceReportRecord() {
    return currentAccountFulfillmentArrangementInstanceReportRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReportRecord(CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord1 currentAccountFulfillmentArrangementInstanceReportRecord) {
    this.currentAccountFulfillmentArrangementInstanceReportRecord = currentAccountFulfillmentArrangementInstanceReportRecord;
  }

  public CRCurrentAccountFulfillmentArrangementRetrieveInputModel currentAccountFulfillmentArrangementInstanceAnalysis(CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis1 currentAccountFulfillmentArrangementInstanceAnalysis) {
    this.currentAccountFulfillmentArrangementInstanceAnalysis = currentAccountFulfillmentArrangementInstanceAnalysis;
    return this;
  }

  /**
   * Get currentAccountFulfillmentArrangementInstanceAnalysis
   * @return currentAccountFulfillmentArrangementInstanceAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis1 getCurrentAccountFulfillmentArrangementInstanceAnalysis() {
    return currentAccountFulfillmentArrangementInstanceAnalysis;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceAnalysis(CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis1 currentAccountFulfillmentArrangementInstanceAnalysis) {
    this.currentAccountFulfillmentArrangementInstanceAnalysis = currentAccountFulfillmentArrangementInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCurrentAccountFulfillmentArrangementRetrieveInputModel crCurrentAccountFulfillmentArrangementRetrieveInputModel = (CRCurrentAccountFulfillmentArrangementRetrieveInputModel) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementRetrieveActionTaskRecord, crCurrentAccountFulfillmentArrangementRetrieveInputModel.currentAccountFulfillmentArrangementRetrieveActionTaskRecord) &&
        Objects.equals(this.currentAccountFulfillmentArrangementRetrieveActionRequest, crCurrentAccountFulfillmentArrangementRetrieveInputModel.currentAccountFulfillmentArrangementRetrieveActionRequest) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInstanceReportRecord, crCurrentAccountFulfillmentArrangementRetrieveInputModel.currentAccountFulfillmentArrangementInstanceReportRecord) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInstanceAnalysis, crCurrentAccountFulfillmentArrangementRetrieveInputModel.currentAccountFulfillmentArrangementInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementRetrieveActionTaskRecord, currentAccountFulfillmentArrangementRetrieveActionRequest, currentAccountFulfillmentArrangementInstanceReportRecord, currentAccountFulfillmentArrangementInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCurrentAccountFulfillmentArrangementRetrieveInputModel {\n");
    
    sb.append("    currentAccountFulfillmentArrangementRetrieveActionTaskRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementRetrieveActionTaskRecord)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementRetrieveActionRequest: ").append(toIndentedString(currentAccountFulfillmentArrangementRetrieveActionRequest)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInstanceReportRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReportRecord)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInstanceAnalysis: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceAnalysis)).append("\n");
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

