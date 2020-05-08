package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.BQInterestRetrieveInputModelInterestInstanceAnalysis1;
import com.redhat.mercury.service.contactdialog.model.BQInterestRetrieveInputModelInterestInstanceReport1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQInterestRetrieveInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQInterestRetrieveInputModel   {
  @JsonProperty("interestRetrieveActionTaskRecord")
  private Object interestRetrieveActionTaskRecord;

  @JsonProperty("interestRetrieveActionRequest")
  private String interestRetrieveActionRequest;

  @JsonProperty("interestInstanceReport")
  private BQInterestRetrieveInputModelInterestInstanceReport1 interestInstanceReport;

  @JsonProperty("interestInstanceAnalysis")
  private BQInterestRetrieveInputModelInterestInstanceAnalysis1 interestInstanceAnalysis;

  public BQInterestRetrieveInputModel interestRetrieveActionTaskRecord(Object interestRetrieveActionTaskRecord) {
    this.interestRetrieveActionTaskRecord = interestRetrieveActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return interestRetrieveActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")

  @Valid

  public Object getInterestRetrieveActionTaskRecord() {
    return interestRetrieveActionTaskRecord;
  }

  public void setInterestRetrieveActionTaskRecord(Object interestRetrieveActionTaskRecord) {
    this.interestRetrieveActionTaskRecord = interestRetrieveActionTaskRecord;
  }

  public BQInterestRetrieveInputModel interestRetrieveActionRequest(String interestRetrieveActionRequest) {
    this.interestRetrieveActionRequest = interestRetrieveActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return interestRetrieveActionRequest
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")


  public String getInterestRetrieveActionRequest() {
    return interestRetrieveActionRequest;
  }

  public void setInterestRetrieveActionRequest(String interestRetrieveActionRequest) {
    this.interestRetrieveActionRequest = interestRetrieveActionRequest;
  }

  public BQInterestRetrieveInputModel interestInstanceReport(BQInterestRetrieveInputModelInterestInstanceReport1 interestInstanceReport) {
    this.interestInstanceReport = interestInstanceReport;
    return this;
  }

  /**
   * Get interestInstanceReport
   * @return interestInstanceReport
  */
  @ApiModelProperty(value = "")

  @Valid

  public BQInterestRetrieveInputModelInterestInstanceReport1 getInterestInstanceReport() {
    return interestInstanceReport;
  }

  public void setInterestInstanceReport(BQInterestRetrieveInputModelInterestInstanceReport1 interestInstanceReport) {
    this.interestInstanceReport = interestInstanceReport;
  }

  public BQInterestRetrieveInputModel interestInstanceAnalysis(BQInterestRetrieveInputModelInterestInstanceAnalysis1 interestInstanceAnalysis) {
    this.interestInstanceAnalysis = interestInstanceAnalysis;
    return this;
  }

  /**
   * Get interestInstanceAnalysis
   * @return interestInstanceAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public BQInterestRetrieveInputModelInterestInstanceAnalysis1 getInterestInstanceAnalysis() {
    return interestInstanceAnalysis;
  }

  public void setInterestInstanceAnalysis(BQInterestRetrieveInputModelInterestInstanceAnalysis1 interestInstanceAnalysis) {
    this.interestInstanceAnalysis = interestInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQInterestRetrieveInputModel bqInterestRetrieveInputModel = (BQInterestRetrieveInputModel) o;
    return Objects.equals(this.interestRetrieveActionTaskRecord, bqInterestRetrieveInputModel.interestRetrieveActionTaskRecord) &&
        Objects.equals(this.interestRetrieveActionRequest, bqInterestRetrieveInputModel.interestRetrieveActionRequest) &&
        Objects.equals(this.interestInstanceReport, bqInterestRetrieveInputModel.interestInstanceReport) &&
        Objects.equals(this.interestInstanceAnalysis, bqInterestRetrieveInputModel.interestInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestRetrieveActionTaskRecord, interestRetrieveActionRequest, interestInstanceReport, interestInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQInterestRetrieveInputModel {\n");
    
    sb.append("    interestRetrieveActionTaskRecord: ").append(toIndentedString(interestRetrieveActionTaskRecord)).append("\n");
    sb.append("    interestRetrieveActionRequest: ").append(toIndentedString(interestRetrieveActionRequest)).append("\n");
    sb.append("    interestInstanceReport: ").append(toIndentedString(interestInstanceReport)).append("\n");
    sb.append("    interestInstanceAnalysis: ").append(toIndentedString(interestInstanceAnalysis)).append("\n");
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

