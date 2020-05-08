package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.BQServiceFeesRetrieveInputModelServiceFeesInstanceAnalysis1;
import com.redhat.mercury.service.contactdialog.model.BQServiceFeesRetrieveInputModelServiceFeesInstanceReport1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQServiceFeesRetrieveInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQServiceFeesRetrieveInputModel   {
  @JsonProperty("serviceFeesRetrieveActionTaskRecord")
  private Object serviceFeesRetrieveActionTaskRecord;

  @JsonProperty("serviceFeesRetrieveActionRequest")
  private String serviceFeesRetrieveActionRequest;

  @JsonProperty("serviceFeesInstanceReport")
  private BQServiceFeesRetrieveInputModelServiceFeesInstanceReport1 serviceFeesInstanceReport;

  @JsonProperty("serviceFeesInstanceAnalysis")
  private BQServiceFeesRetrieveInputModelServiceFeesInstanceAnalysis1 serviceFeesInstanceAnalysis;

  public BQServiceFeesRetrieveInputModel serviceFeesRetrieveActionTaskRecord(Object serviceFeesRetrieveActionTaskRecord) {
    this.serviceFeesRetrieveActionTaskRecord = serviceFeesRetrieveActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return serviceFeesRetrieveActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")

  @Valid

  public Object getServiceFeesRetrieveActionTaskRecord() {
    return serviceFeesRetrieveActionTaskRecord;
  }

  public void setServiceFeesRetrieveActionTaskRecord(Object serviceFeesRetrieveActionTaskRecord) {
    this.serviceFeesRetrieveActionTaskRecord = serviceFeesRetrieveActionTaskRecord;
  }

  public BQServiceFeesRetrieveInputModel serviceFeesRetrieveActionRequest(String serviceFeesRetrieveActionRequest) {
    this.serviceFeesRetrieveActionRequest = serviceFeesRetrieveActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return serviceFeesRetrieveActionRequest
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")


  public String getServiceFeesRetrieveActionRequest() {
    return serviceFeesRetrieveActionRequest;
  }

  public void setServiceFeesRetrieveActionRequest(String serviceFeesRetrieveActionRequest) {
    this.serviceFeesRetrieveActionRequest = serviceFeesRetrieveActionRequest;
  }

  public BQServiceFeesRetrieveInputModel serviceFeesInstanceReport(BQServiceFeesRetrieveInputModelServiceFeesInstanceReport1 serviceFeesInstanceReport) {
    this.serviceFeesInstanceReport = serviceFeesInstanceReport;
    return this;
  }

  /**
   * Get serviceFeesInstanceReport
   * @return serviceFeesInstanceReport
  */
  @ApiModelProperty(value = "")

  @Valid

  public BQServiceFeesRetrieveInputModelServiceFeesInstanceReport1 getServiceFeesInstanceReport() {
    return serviceFeesInstanceReport;
  }

  public void setServiceFeesInstanceReport(BQServiceFeesRetrieveInputModelServiceFeesInstanceReport1 serviceFeesInstanceReport) {
    this.serviceFeesInstanceReport = serviceFeesInstanceReport;
  }

  public BQServiceFeesRetrieveInputModel serviceFeesInstanceAnalysis(BQServiceFeesRetrieveInputModelServiceFeesInstanceAnalysis1 serviceFeesInstanceAnalysis) {
    this.serviceFeesInstanceAnalysis = serviceFeesInstanceAnalysis;
    return this;
  }

  /**
   * Get serviceFeesInstanceAnalysis
   * @return serviceFeesInstanceAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public BQServiceFeesRetrieveInputModelServiceFeesInstanceAnalysis1 getServiceFeesInstanceAnalysis() {
    return serviceFeesInstanceAnalysis;
  }

  public void setServiceFeesInstanceAnalysis(BQServiceFeesRetrieveInputModelServiceFeesInstanceAnalysis1 serviceFeesInstanceAnalysis) {
    this.serviceFeesInstanceAnalysis = serviceFeesInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQServiceFeesRetrieveInputModel bqServiceFeesRetrieveInputModel = (BQServiceFeesRetrieveInputModel) o;
    return Objects.equals(this.serviceFeesRetrieveActionTaskRecord, bqServiceFeesRetrieveInputModel.serviceFeesRetrieveActionTaskRecord) &&
        Objects.equals(this.serviceFeesRetrieveActionRequest, bqServiceFeesRetrieveInputModel.serviceFeesRetrieveActionRequest) &&
        Objects.equals(this.serviceFeesInstanceReport, bqServiceFeesRetrieveInputModel.serviceFeesInstanceReport) &&
        Objects.equals(this.serviceFeesInstanceAnalysis, bqServiceFeesRetrieveInputModel.serviceFeesInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceFeesRetrieveActionTaskRecord, serviceFeesRetrieveActionRequest, serviceFeesInstanceReport, serviceFeesInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQServiceFeesRetrieveInputModel {\n");
    
    sb.append("    serviceFeesRetrieveActionTaskRecord: ").append(toIndentedString(serviceFeesRetrieveActionTaskRecord)).append("\n");
    sb.append("    serviceFeesRetrieveActionRequest: ").append(toIndentedString(serviceFeesRetrieveActionRequest)).append("\n");
    sb.append("    serviceFeesInstanceReport: ").append(toIndentedString(serviceFeesInstanceReport)).append("\n");
    sb.append("    serviceFeesInstanceAnalysis: ").append(toIndentedString(serviceFeesInstanceAnalysis)).append("\n");
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

