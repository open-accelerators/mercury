package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceAnalysis1;
import com.redhat.mercury.service.contactdialog.model.BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceReport1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQIssuedDeviceRetrieveInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQIssuedDeviceRetrieveInputModel   {
  @JsonProperty("issuedDeviceRetrieveActionTaskRecord")
  private Object issuedDeviceRetrieveActionTaskRecord;

  @JsonProperty("issuedDeviceRetrieveActionRequest")
  private String issuedDeviceRetrieveActionRequest;

  @JsonProperty("issuedDeviceInstanceReport")
  private BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceReport1 issuedDeviceInstanceReport;

  @JsonProperty("issuedDeviceInstanceAnalysis")
  private BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceAnalysis1 issuedDeviceInstanceAnalysis;

  public BQIssuedDeviceRetrieveInputModel issuedDeviceRetrieveActionTaskRecord(Object issuedDeviceRetrieveActionTaskRecord) {
    this.issuedDeviceRetrieveActionTaskRecord = issuedDeviceRetrieveActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return issuedDeviceRetrieveActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")

  @Valid

  public Object getIssuedDeviceRetrieveActionTaskRecord() {
    return issuedDeviceRetrieveActionTaskRecord;
  }

  public void setIssuedDeviceRetrieveActionTaskRecord(Object issuedDeviceRetrieveActionTaskRecord) {
    this.issuedDeviceRetrieveActionTaskRecord = issuedDeviceRetrieveActionTaskRecord;
  }

  public BQIssuedDeviceRetrieveInputModel issuedDeviceRetrieveActionRequest(String issuedDeviceRetrieveActionRequest) {
    this.issuedDeviceRetrieveActionRequest = issuedDeviceRetrieveActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return issuedDeviceRetrieveActionRequest
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")


  public String getIssuedDeviceRetrieveActionRequest() {
    return issuedDeviceRetrieveActionRequest;
  }

  public void setIssuedDeviceRetrieveActionRequest(String issuedDeviceRetrieveActionRequest) {
    this.issuedDeviceRetrieveActionRequest = issuedDeviceRetrieveActionRequest;
  }

  public BQIssuedDeviceRetrieveInputModel issuedDeviceInstanceReport(BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceReport1 issuedDeviceInstanceReport) {
    this.issuedDeviceInstanceReport = issuedDeviceInstanceReport;
    return this;
  }

  /**
   * Get issuedDeviceInstanceReport
   * @return issuedDeviceInstanceReport
  */
  @ApiModelProperty(value = "")

  @Valid

  public BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceReport1 getIssuedDeviceInstanceReport() {
    return issuedDeviceInstanceReport;
  }

  public void setIssuedDeviceInstanceReport(BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceReport1 issuedDeviceInstanceReport) {
    this.issuedDeviceInstanceReport = issuedDeviceInstanceReport;
  }

  public BQIssuedDeviceRetrieveInputModel issuedDeviceInstanceAnalysis(BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceAnalysis1 issuedDeviceInstanceAnalysis) {
    this.issuedDeviceInstanceAnalysis = issuedDeviceInstanceAnalysis;
    return this;
  }

  /**
   * Get issuedDeviceInstanceAnalysis
   * @return issuedDeviceInstanceAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceAnalysis1 getIssuedDeviceInstanceAnalysis() {
    return issuedDeviceInstanceAnalysis;
  }

  public void setIssuedDeviceInstanceAnalysis(BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceAnalysis1 issuedDeviceInstanceAnalysis) {
    this.issuedDeviceInstanceAnalysis = issuedDeviceInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQIssuedDeviceRetrieveInputModel bqIssuedDeviceRetrieveInputModel = (BQIssuedDeviceRetrieveInputModel) o;
    return Objects.equals(this.issuedDeviceRetrieveActionTaskRecord, bqIssuedDeviceRetrieveInputModel.issuedDeviceRetrieveActionTaskRecord) &&
        Objects.equals(this.issuedDeviceRetrieveActionRequest, bqIssuedDeviceRetrieveInputModel.issuedDeviceRetrieveActionRequest) &&
        Objects.equals(this.issuedDeviceInstanceReport, bqIssuedDeviceRetrieveInputModel.issuedDeviceInstanceReport) &&
        Objects.equals(this.issuedDeviceInstanceAnalysis, bqIssuedDeviceRetrieveInputModel.issuedDeviceInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceRetrieveActionTaskRecord, issuedDeviceRetrieveActionRequest, issuedDeviceInstanceReport, issuedDeviceInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQIssuedDeviceRetrieveInputModel {\n");
    
    sb.append("    issuedDeviceRetrieveActionTaskRecord: ").append(toIndentedString(issuedDeviceRetrieveActionTaskRecord)).append("\n");
    sb.append("    issuedDeviceRetrieveActionRequest: ").append(toIndentedString(issuedDeviceRetrieveActionRequest)).append("\n");
    sb.append("    issuedDeviceInstanceReport: ").append(toIndentedString(issuedDeviceInstanceReport)).append("\n");
    sb.append("    issuedDeviceInstanceAnalysis: ").append(toIndentedString(issuedDeviceInstanceAnalysis)).append("\n");
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

