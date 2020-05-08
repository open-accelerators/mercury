package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2006InterestInstanceAnalysis;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2006InterestInstanceRecord;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2006InterestInstanceReport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2006
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class InlineResponse2006   {
  @JsonProperty("interestInstanceRecord")
  private InlineResponse2006InterestInstanceRecord interestInstanceRecord;

  @JsonProperty("interestRetrieveActionTaskReference")
  private String interestRetrieveActionTaskReference;

  @JsonProperty("interestRetrieveActionTaskRecord")
  private Object interestRetrieveActionTaskRecord;

  @JsonProperty("interestRetrieveActionResponse")
  private String interestRetrieveActionResponse;

  @JsonProperty("interestInstanceReport")
  private InlineResponse2006InterestInstanceReport interestInstanceReport;

  @JsonProperty("interestInstanceAnalysis")
  private InlineResponse2006InterestInstanceAnalysis interestInstanceAnalysis;

  public InlineResponse2006 interestInstanceRecord(InlineResponse2006InterestInstanceRecord interestInstanceRecord) {
    this.interestInstanceRecord = interestInstanceRecord;
    return this;
  }

  /**
   * Get interestInstanceRecord
   * @return interestInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2006InterestInstanceRecord getInterestInstanceRecord() {
    return interestInstanceRecord;
  }

  public void setInterestInstanceRecord(InlineResponse2006InterestInstanceRecord interestInstanceRecord) {
    this.interestInstanceRecord = interestInstanceRecord;
  }

  public InlineResponse2006 interestRetrieveActionTaskReference(String interestRetrieveActionTaskReference) {
    this.interestRetrieveActionTaskReference = interestRetrieveActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Interest instance retrieve service call 
   * @return interestRetrieveActionTaskReference
  */
  @ApiModelProperty(example = "IRATR788250", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Interest instance retrieve service call ")


  public String getInterestRetrieveActionTaskReference() {
    return interestRetrieveActionTaskReference;
  }

  public void setInterestRetrieveActionTaskReference(String interestRetrieveActionTaskReference) {
    this.interestRetrieveActionTaskReference = interestRetrieveActionTaskReference;
  }

  public InlineResponse2006 interestRetrieveActionTaskRecord(Object interestRetrieveActionTaskRecord) {
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

  public InlineResponse2006 interestRetrieveActionResponse(String interestRetrieveActionResponse) {
    this.interestRetrieveActionResponse = interestRetrieveActionResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return interestRetrieveActionResponse
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) ")


  public String getInterestRetrieveActionResponse() {
    return interestRetrieveActionResponse;
  }

  public void setInterestRetrieveActionResponse(String interestRetrieveActionResponse) {
    this.interestRetrieveActionResponse = interestRetrieveActionResponse;
  }

  public InlineResponse2006 interestInstanceReport(InlineResponse2006InterestInstanceReport interestInstanceReport) {
    this.interestInstanceReport = interestInstanceReport;
    return this;
  }

  /**
   * Get interestInstanceReport
   * @return interestInstanceReport
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2006InterestInstanceReport getInterestInstanceReport() {
    return interestInstanceReport;
  }

  public void setInterestInstanceReport(InlineResponse2006InterestInstanceReport interestInstanceReport) {
    this.interestInstanceReport = interestInstanceReport;
  }

  public InlineResponse2006 interestInstanceAnalysis(InlineResponse2006InterestInstanceAnalysis interestInstanceAnalysis) {
    this.interestInstanceAnalysis = interestInstanceAnalysis;
    return this;
  }

  /**
   * Get interestInstanceAnalysis
   * @return interestInstanceAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2006InterestInstanceAnalysis getInterestInstanceAnalysis() {
    return interestInstanceAnalysis;
  }

  public void setInterestInstanceAnalysis(InlineResponse2006InterestInstanceAnalysis interestInstanceAnalysis) {
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
    InlineResponse2006 inlineResponse2006 = (InlineResponse2006) o;
    return Objects.equals(this.interestInstanceRecord, inlineResponse2006.interestInstanceRecord) &&
        Objects.equals(this.interestRetrieveActionTaskReference, inlineResponse2006.interestRetrieveActionTaskReference) &&
        Objects.equals(this.interestRetrieveActionTaskRecord, inlineResponse2006.interestRetrieveActionTaskRecord) &&
        Objects.equals(this.interestRetrieveActionResponse, inlineResponse2006.interestRetrieveActionResponse) &&
        Objects.equals(this.interestInstanceReport, inlineResponse2006.interestInstanceReport) &&
        Objects.equals(this.interestInstanceAnalysis, inlineResponse2006.interestInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestInstanceRecord, interestRetrieveActionTaskReference, interestRetrieveActionTaskRecord, interestRetrieveActionResponse, interestInstanceReport, interestInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006 {\n");
    
    sb.append("    interestInstanceRecord: ").append(toIndentedString(interestInstanceRecord)).append("\n");
    sb.append("    interestRetrieveActionTaskReference: ").append(toIndentedString(interestRetrieveActionTaskReference)).append("\n");
    sb.append("    interestRetrieveActionTaskRecord: ").append(toIndentedString(interestRetrieveActionTaskRecord)).append("\n");
    sb.append("    interestRetrieveActionResponse: ").append(toIndentedString(interestRetrieveActionResponse)).append("\n");
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

