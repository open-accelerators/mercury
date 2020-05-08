package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecord;
import com.redhat.mercury.service.currentaccount.model.InlineResponse20024IssuedDeviceInstanceAnalysis;
import com.redhat.mercury.service.currentaccount.model.InlineResponse20024IssuedDeviceInstanceReport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20024
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class InlineResponse20024   {
  @JsonProperty("issuedDeviceInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecord issuedDeviceInstanceRecord;

  @JsonProperty("issuedDeviceRetrieveActionTaskReference")
  private String issuedDeviceRetrieveActionTaskReference;

  @JsonProperty("issuedDeviceRetrieveActionTaskRecord")
  private Object issuedDeviceRetrieveActionTaskRecord;

  @JsonProperty("issuedDeviceRetrieveActionResponse")
  private String issuedDeviceRetrieveActionResponse;

  @JsonProperty("issuedDeviceInstanceReport")
  private InlineResponse20024IssuedDeviceInstanceReport issuedDeviceInstanceReport;

  @JsonProperty("issuedDeviceInstanceAnalysis")
  private InlineResponse20024IssuedDeviceInstanceAnalysis issuedDeviceInstanceAnalysis;

  public InlineResponse20024 issuedDeviceInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecord issuedDeviceInstanceRecord) {
    this.issuedDeviceInstanceRecord = issuedDeviceInstanceRecord;
    return this;
  }

  /**
   * Get issuedDeviceInstanceRecord
   * @return issuedDeviceInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecord getIssuedDeviceInstanceRecord() {
    return issuedDeviceInstanceRecord;
  }

  public void setIssuedDeviceInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceInitiationIssuedDeviceInstanceRecord issuedDeviceInstanceRecord) {
    this.issuedDeviceInstanceRecord = issuedDeviceInstanceRecord;
  }

  public InlineResponse20024 issuedDeviceRetrieveActionTaskReference(String issuedDeviceRetrieveActionTaskReference) {
    this.issuedDeviceRetrieveActionTaskReference = issuedDeviceRetrieveActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Issued Device instance retrieve service call 
   * @return issuedDeviceRetrieveActionTaskReference
  */
  @ApiModelProperty(example = "IDRATR709232", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Issued Device instance retrieve service call ")


  public String getIssuedDeviceRetrieveActionTaskReference() {
    return issuedDeviceRetrieveActionTaskReference;
  }

  public void setIssuedDeviceRetrieveActionTaskReference(String issuedDeviceRetrieveActionTaskReference) {
    this.issuedDeviceRetrieveActionTaskReference = issuedDeviceRetrieveActionTaskReference;
  }

  public InlineResponse20024 issuedDeviceRetrieveActionTaskRecord(Object issuedDeviceRetrieveActionTaskRecord) {
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

  public InlineResponse20024 issuedDeviceRetrieveActionResponse(String issuedDeviceRetrieveActionResponse) {
    this.issuedDeviceRetrieveActionResponse = issuedDeviceRetrieveActionResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return issuedDeviceRetrieveActionResponse
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) ")


  public String getIssuedDeviceRetrieveActionResponse() {
    return issuedDeviceRetrieveActionResponse;
  }

  public void setIssuedDeviceRetrieveActionResponse(String issuedDeviceRetrieveActionResponse) {
    this.issuedDeviceRetrieveActionResponse = issuedDeviceRetrieveActionResponse;
  }

  public InlineResponse20024 issuedDeviceInstanceReport(InlineResponse20024IssuedDeviceInstanceReport issuedDeviceInstanceReport) {
    this.issuedDeviceInstanceReport = issuedDeviceInstanceReport;
    return this;
  }

  /**
   * Get issuedDeviceInstanceReport
   * @return issuedDeviceInstanceReport
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse20024IssuedDeviceInstanceReport getIssuedDeviceInstanceReport() {
    return issuedDeviceInstanceReport;
  }

  public void setIssuedDeviceInstanceReport(InlineResponse20024IssuedDeviceInstanceReport issuedDeviceInstanceReport) {
    this.issuedDeviceInstanceReport = issuedDeviceInstanceReport;
  }

  public InlineResponse20024 issuedDeviceInstanceAnalysis(InlineResponse20024IssuedDeviceInstanceAnalysis issuedDeviceInstanceAnalysis) {
    this.issuedDeviceInstanceAnalysis = issuedDeviceInstanceAnalysis;
    return this;
  }

  /**
   * Get issuedDeviceInstanceAnalysis
   * @return issuedDeviceInstanceAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse20024IssuedDeviceInstanceAnalysis getIssuedDeviceInstanceAnalysis() {
    return issuedDeviceInstanceAnalysis;
  }

  public void setIssuedDeviceInstanceAnalysis(InlineResponse20024IssuedDeviceInstanceAnalysis issuedDeviceInstanceAnalysis) {
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
    InlineResponse20024 inlineResponse20024 = (InlineResponse20024) o;
    return Objects.equals(this.issuedDeviceInstanceRecord, inlineResponse20024.issuedDeviceInstanceRecord) &&
        Objects.equals(this.issuedDeviceRetrieveActionTaskReference, inlineResponse20024.issuedDeviceRetrieveActionTaskReference) &&
        Objects.equals(this.issuedDeviceRetrieveActionTaskRecord, inlineResponse20024.issuedDeviceRetrieveActionTaskRecord) &&
        Objects.equals(this.issuedDeviceRetrieveActionResponse, inlineResponse20024.issuedDeviceRetrieveActionResponse) &&
        Objects.equals(this.issuedDeviceInstanceReport, inlineResponse20024.issuedDeviceInstanceReport) &&
        Objects.equals(this.issuedDeviceInstanceAnalysis, inlineResponse20024.issuedDeviceInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceInstanceRecord, issuedDeviceRetrieveActionTaskReference, issuedDeviceRetrieveActionTaskRecord, issuedDeviceRetrieveActionResponse, issuedDeviceInstanceReport, issuedDeviceInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20024 {\n");
    
    sb.append("    issuedDeviceInstanceRecord: ").append(toIndentedString(issuedDeviceInstanceRecord)).append("\n");
    sb.append("    issuedDeviceRetrieveActionTaskReference: ").append(toIndentedString(issuedDeviceRetrieveActionTaskReference)).append("\n");
    sb.append("    issuedDeviceRetrieveActionTaskRecord: ").append(toIndentedString(issuedDeviceRetrieveActionTaskRecord)).append("\n");
    sb.append("    issuedDeviceRetrieveActionResponse: ").append(toIndentedString(issuedDeviceRetrieveActionResponse)).append("\n");
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

