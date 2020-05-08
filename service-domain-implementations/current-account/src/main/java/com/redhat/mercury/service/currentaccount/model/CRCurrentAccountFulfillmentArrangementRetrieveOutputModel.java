package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.InlineResponse2005CurrentAccountFulfillmentArrangementInstanceAnalysis;
import com.redhat.mercury.service.currentaccount.model.InlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecord;
import com.redhat.mercury.service.currentaccount.model.InlineResponse2005CurrentAccountFulfillmentArrangementInstanceReportRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CRCurrentAccountFulfillmentArrangementRetrieveOutputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class CRCurrentAccountFulfillmentArrangementRetrieveOutputModel   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceRecord")
  private InlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord;

  @JsonProperty("currentAccountFulfillmentArrangementRetrieveActionTaskReference")
  private String currentAccountFulfillmentArrangementRetrieveActionTaskReference;

  @JsonProperty("currentAccountFulfillmentArrangementRetrieveActionTaskRecord")
  private Object currentAccountFulfillmentArrangementRetrieveActionTaskRecord;

  @JsonProperty("currentAccountFulfillmentArrangementRetrieveActionResponse")
  private String currentAccountFulfillmentArrangementRetrieveActionResponse;

  @JsonProperty("currentAccountFulfillmentArrangementInstanceReportRecord")
  private InlineResponse2005CurrentAccountFulfillmentArrangementInstanceReportRecord currentAccountFulfillmentArrangementInstanceReportRecord;

  @JsonProperty("currentAccountFulfillmentArrangementInstanceAnalysis")
  private InlineResponse2005CurrentAccountFulfillmentArrangementInstanceAnalysis currentAccountFulfillmentArrangementInstanceAnalysis;

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModel currentAccountFulfillmentArrangementInstanceRecord(InlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
    return this;
  }

  /**
   * Get currentAccountFulfillmentArrangementInstanceRecord
   * @return currentAccountFulfillmentArrangementInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecord getCurrentAccountFulfillmentArrangementInstanceRecord() {
    return currentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceRecord(InlineResponse2005CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
  }

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModel currentAccountFulfillmentArrangementRetrieveActionTaskReference(String currentAccountFulfillmentArrangementRetrieveActionTaskReference) {
    this.currentAccountFulfillmentArrangementRetrieveActionTaskReference = currentAccountFulfillmentArrangementRetrieveActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Current Account Fulfillment Arrangement instance retrieve service call 
   * @return currentAccountFulfillmentArrangementRetrieveActionTaskReference
  */
  @ApiModelProperty(example = "CAFARATR748576", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Current Account Fulfillment Arrangement instance retrieve service call ")


  public String getCurrentAccountFulfillmentArrangementRetrieveActionTaskReference() {
    return currentAccountFulfillmentArrangementRetrieveActionTaskReference;
  }

  public void setCurrentAccountFulfillmentArrangementRetrieveActionTaskReference(String currentAccountFulfillmentArrangementRetrieveActionTaskReference) {
    this.currentAccountFulfillmentArrangementRetrieveActionTaskReference = currentAccountFulfillmentArrangementRetrieveActionTaskReference;
  }

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModel currentAccountFulfillmentArrangementRetrieveActionTaskRecord(Object currentAccountFulfillmentArrangementRetrieveActionTaskRecord) {
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

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModel currentAccountFulfillmentArrangementRetrieveActionResponse(String currentAccountFulfillmentArrangementRetrieveActionResponse) {
    this.currentAccountFulfillmentArrangementRetrieveActionResponse = currentAccountFulfillmentArrangementRetrieveActionResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return currentAccountFulfillmentArrangementRetrieveActionResponse
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) ")


  public String getCurrentAccountFulfillmentArrangementRetrieveActionResponse() {
    return currentAccountFulfillmentArrangementRetrieveActionResponse;
  }

  public void setCurrentAccountFulfillmentArrangementRetrieveActionResponse(String currentAccountFulfillmentArrangementRetrieveActionResponse) {
    this.currentAccountFulfillmentArrangementRetrieveActionResponse = currentAccountFulfillmentArrangementRetrieveActionResponse;
  }

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModel currentAccountFulfillmentArrangementInstanceReportRecord(InlineResponse2005CurrentAccountFulfillmentArrangementInstanceReportRecord currentAccountFulfillmentArrangementInstanceReportRecord) {
    this.currentAccountFulfillmentArrangementInstanceReportRecord = currentAccountFulfillmentArrangementInstanceReportRecord;
    return this;
  }

  /**
   * Get currentAccountFulfillmentArrangementInstanceReportRecord
   * @return currentAccountFulfillmentArrangementInstanceReportRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2005CurrentAccountFulfillmentArrangementInstanceReportRecord getCurrentAccountFulfillmentArrangementInstanceReportRecord() {
    return currentAccountFulfillmentArrangementInstanceReportRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReportRecord(InlineResponse2005CurrentAccountFulfillmentArrangementInstanceReportRecord currentAccountFulfillmentArrangementInstanceReportRecord) {
    this.currentAccountFulfillmentArrangementInstanceReportRecord = currentAccountFulfillmentArrangementInstanceReportRecord;
  }

  public CRCurrentAccountFulfillmentArrangementRetrieveOutputModel currentAccountFulfillmentArrangementInstanceAnalysis(InlineResponse2005CurrentAccountFulfillmentArrangementInstanceAnalysis currentAccountFulfillmentArrangementInstanceAnalysis) {
    this.currentAccountFulfillmentArrangementInstanceAnalysis = currentAccountFulfillmentArrangementInstanceAnalysis;
    return this;
  }

  /**
   * Get currentAccountFulfillmentArrangementInstanceAnalysis
   * @return currentAccountFulfillmentArrangementInstanceAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2005CurrentAccountFulfillmentArrangementInstanceAnalysis getCurrentAccountFulfillmentArrangementInstanceAnalysis() {
    return currentAccountFulfillmentArrangementInstanceAnalysis;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceAnalysis(InlineResponse2005CurrentAccountFulfillmentArrangementInstanceAnalysis currentAccountFulfillmentArrangementInstanceAnalysis) {
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
    CRCurrentAccountFulfillmentArrangementRetrieveOutputModel crCurrentAccountFulfillmentArrangementRetrieveOutputModel = (CRCurrentAccountFulfillmentArrangementRetrieveOutputModel) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceRecord, crCurrentAccountFulfillmentArrangementRetrieveOutputModel.currentAccountFulfillmentArrangementInstanceRecord) &&
        Objects.equals(this.currentAccountFulfillmentArrangementRetrieveActionTaskReference, crCurrentAccountFulfillmentArrangementRetrieveOutputModel.currentAccountFulfillmentArrangementRetrieveActionTaskReference) &&
        Objects.equals(this.currentAccountFulfillmentArrangementRetrieveActionTaskRecord, crCurrentAccountFulfillmentArrangementRetrieveOutputModel.currentAccountFulfillmentArrangementRetrieveActionTaskRecord) &&
        Objects.equals(this.currentAccountFulfillmentArrangementRetrieveActionResponse, crCurrentAccountFulfillmentArrangementRetrieveOutputModel.currentAccountFulfillmentArrangementRetrieveActionResponse) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInstanceReportRecord, crCurrentAccountFulfillmentArrangementRetrieveOutputModel.currentAccountFulfillmentArrangementInstanceReportRecord) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInstanceAnalysis, crCurrentAccountFulfillmentArrangementRetrieveOutputModel.currentAccountFulfillmentArrangementInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceRecord, currentAccountFulfillmentArrangementRetrieveActionTaskReference, currentAccountFulfillmentArrangementRetrieveActionTaskRecord, currentAccountFulfillmentArrangementRetrieveActionResponse, currentAccountFulfillmentArrangementInstanceReportRecord, currentAccountFulfillmentArrangementInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCurrentAccountFulfillmentArrangementRetrieveOutputModel {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceRecord)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementRetrieveActionTaskReference: ").append(toIndentedString(currentAccountFulfillmentArrangementRetrieveActionTaskReference)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementRetrieveActionTaskRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementRetrieveActionTaskRecord)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementRetrieveActionResponse: ").append(toIndentedString(currentAccountFulfillmentArrangementRetrieveActionResponse)).append("\n");
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

