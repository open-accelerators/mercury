package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.InlineResponse2008ServiceFeesInstanceAnalysis;
import com.redhat.mercury.service.currentaccount.model.InlineResponse2008ServiceFeesInstanceRecord;
import com.redhat.mercury.service.currentaccount.model.InlineResponse2008ServiceFeesInstanceReport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQServiceFeesRetrieveOutputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class BQServiceFeesRetrieveOutputModel   {
  @JsonProperty("serviceFeesInstanceRecord")
  private InlineResponse2008ServiceFeesInstanceRecord serviceFeesInstanceRecord;

  @JsonProperty("serviceFeesRetrieveActionTaskReference")
  private String serviceFeesRetrieveActionTaskReference;

  @JsonProperty("serviceFeesRetrieveActionTaskRecord")
  private Object serviceFeesRetrieveActionTaskRecord;

  @JsonProperty("serviceFeesRetrieveActionResponse")
  private String serviceFeesRetrieveActionResponse;

  @JsonProperty("serviceFeesInstanceReport")
  private InlineResponse2008ServiceFeesInstanceReport serviceFeesInstanceReport;

  @JsonProperty("serviceFeesInstanceAnalysis")
  private InlineResponse2008ServiceFeesInstanceAnalysis serviceFeesInstanceAnalysis;

  public BQServiceFeesRetrieveOutputModel serviceFeesInstanceRecord(InlineResponse2008ServiceFeesInstanceRecord serviceFeesInstanceRecord) {
    this.serviceFeesInstanceRecord = serviceFeesInstanceRecord;
    return this;
  }

  /**
   * Get serviceFeesInstanceRecord
   * @return serviceFeesInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2008ServiceFeesInstanceRecord getServiceFeesInstanceRecord() {
    return serviceFeesInstanceRecord;
  }

  public void setServiceFeesInstanceRecord(InlineResponse2008ServiceFeesInstanceRecord serviceFeesInstanceRecord) {
    this.serviceFeesInstanceRecord = serviceFeesInstanceRecord;
  }

  public BQServiceFeesRetrieveOutputModel serviceFeesRetrieveActionTaskReference(String serviceFeesRetrieveActionTaskReference) {
    this.serviceFeesRetrieveActionTaskReference = serviceFeesRetrieveActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Service Fees instance retrieve service call 
   * @return serviceFeesRetrieveActionTaskReference
  */
  @ApiModelProperty(example = "SFRATR705777", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Service Fees instance retrieve service call ")


  public String getServiceFeesRetrieveActionTaskReference() {
    return serviceFeesRetrieveActionTaskReference;
  }

  public void setServiceFeesRetrieveActionTaskReference(String serviceFeesRetrieveActionTaskReference) {
    this.serviceFeesRetrieveActionTaskReference = serviceFeesRetrieveActionTaskReference;
  }

  public BQServiceFeesRetrieveOutputModel serviceFeesRetrieveActionTaskRecord(Object serviceFeesRetrieveActionTaskRecord) {
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

  public BQServiceFeesRetrieveOutputModel serviceFeesRetrieveActionResponse(String serviceFeesRetrieveActionResponse) {
    this.serviceFeesRetrieveActionResponse = serviceFeesRetrieveActionResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return serviceFeesRetrieveActionResponse
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) ")


  public String getServiceFeesRetrieveActionResponse() {
    return serviceFeesRetrieveActionResponse;
  }

  public void setServiceFeesRetrieveActionResponse(String serviceFeesRetrieveActionResponse) {
    this.serviceFeesRetrieveActionResponse = serviceFeesRetrieveActionResponse;
  }

  public BQServiceFeesRetrieveOutputModel serviceFeesInstanceReport(InlineResponse2008ServiceFeesInstanceReport serviceFeesInstanceReport) {
    this.serviceFeesInstanceReport = serviceFeesInstanceReport;
    return this;
  }

  /**
   * Get serviceFeesInstanceReport
   * @return serviceFeesInstanceReport
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2008ServiceFeesInstanceReport getServiceFeesInstanceReport() {
    return serviceFeesInstanceReport;
  }

  public void setServiceFeesInstanceReport(InlineResponse2008ServiceFeesInstanceReport serviceFeesInstanceReport) {
    this.serviceFeesInstanceReport = serviceFeesInstanceReport;
  }

  public BQServiceFeesRetrieveOutputModel serviceFeesInstanceAnalysis(InlineResponse2008ServiceFeesInstanceAnalysis serviceFeesInstanceAnalysis) {
    this.serviceFeesInstanceAnalysis = serviceFeesInstanceAnalysis;
    return this;
  }

  /**
   * Get serviceFeesInstanceAnalysis
   * @return serviceFeesInstanceAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2008ServiceFeesInstanceAnalysis getServiceFeesInstanceAnalysis() {
    return serviceFeesInstanceAnalysis;
  }

  public void setServiceFeesInstanceAnalysis(InlineResponse2008ServiceFeesInstanceAnalysis serviceFeesInstanceAnalysis) {
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
    BQServiceFeesRetrieveOutputModel bqServiceFeesRetrieveOutputModel = (BQServiceFeesRetrieveOutputModel) o;
    return Objects.equals(this.serviceFeesInstanceRecord, bqServiceFeesRetrieveOutputModel.serviceFeesInstanceRecord) &&
        Objects.equals(this.serviceFeesRetrieveActionTaskReference, bqServiceFeesRetrieveOutputModel.serviceFeesRetrieveActionTaskReference) &&
        Objects.equals(this.serviceFeesRetrieveActionTaskRecord, bqServiceFeesRetrieveOutputModel.serviceFeesRetrieveActionTaskRecord) &&
        Objects.equals(this.serviceFeesRetrieveActionResponse, bqServiceFeesRetrieveOutputModel.serviceFeesRetrieveActionResponse) &&
        Objects.equals(this.serviceFeesInstanceReport, bqServiceFeesRetrieveOutputModel.serviceFeesInstanceReport) &&
        Objects.equals(this.serviceFeesInstanceAnalysis, bqServiceFeesRetrieveOutputModel.serviceFeesInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceFeesInstanceRecord, serviceFeesRetrieveActionTaskReference, serviceFeesRetrieveActionTaskRecord, serviceFeesRetrieveActionResponse, serviceFeesInstanceReport, serviceFeesInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQServiceFeesRetrieveOutputModel {\n");
    
    sb.append("    serviceFeesInstanceRecord: ").append(toIndentedString(serviceFeesInstanceRecord)).append("\n");
    sb.append("    serviceFeesRetrieveActionTaskReference: ").append(toIndentedString(serviceFeesRetrieveActionTaskReference)).append("\n");
    sb.append("    serviceFeesRetrieveActionTaskRecord: ").append(toIndentedString(serviceFeesRetrieveActionTaskRecord)).append("\n");
    sb.append("    serviceFeesRetrieveActionResponse: ").append(toIndentedString(serviceFeesRetrieveActionResponse)).append("\n");
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

