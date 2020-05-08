package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.InlineResponse20021PaymentsInstanceAnalysis;
import com.redhat.mercury.service.currentaccount.model.InlineResponse20021PaymentsInstanceRecord;
import com.redhat.mercury.service.currentaccount.model.InlineResponse20021PaymentsInstanceReport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQPaymentsRetrieveOutputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class BQPaymentsRetrieveOutputModel   {
  @JsonProperty("paymentsInstanceRecord")
  private InlineResponse20021PaymentsInstanceRecord paymentsInstanceRecord;

  @JsonProperty("paymentsRetrieveActionTaskReference")
  private String paymentsRetrieveActionTaskReference;

  @JsonProperty("paymentsRetrieveActionTaskRecord")
  private Object paymentsRetrieveActionTaskRecord;

  @JsonProperty("paymentsRetrieveActionResponse")
  private String paymentsRetrieveActionResponse;

  @JsonProperty("paymentsInstanceReport")
  private InlineResponse20021PaymentsInstanceReport paymentsInstanceReport;

  @JsonProperty("paymentsInstanceAnalysis")
  private InlineResponse20021PaymentsInstanceAnalysis paymentsInstanceAnalysis;

  public BQPaymentsRetrieveOutputModel paymentsInstanceRecord(InlineResponse20021PaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
    return this;
  }

  /**
   * Get paymentsInstanceRecord
   * @return paymentsInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse20021PaymentsInstanceRecord getPaymentsInstanceRecord() {
    return paymentsInstanceRecord;
  }

  public void setPaymentsInstanceRecord(InlineResponse20021PaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
  }

  public BQPaymentsRetrieveOutputModel paymentsRetrieveActionTaskReference(String paymentsRetrieveActionTaskReference) {
    this.paymentsRetrieveActionTaskReference = paymentsRetrieveActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payments instance retrieve service call 
   * @return paymentsRetrieveActionTaskReference
  */
  @ApiModelProperty(example = "PRATR758166", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payments instance retrieve service call ")


  public String getPaymentsRetrieveActionTaskReference() {
    return paymentsRetrieveActionTaskReference;
  }

  public void setPaymentsRetrieveActionTaskReference(String paymentsRetrieveActionTaskReference) {
    this.paymentsRetrieveActionTaskReference = paymentsRetrieveActionTaskReference;
  }

  public BQPaymentsRetrieveOutputModel paymentsRetrieveActionTaskRecord(Object paymentsRetrieveActionTaskRecord) {
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

  public BQPaymentsRetrieveOutputModel paymentsRetrieveActionResponse(String paymentsRetrieveActionResponse) {
    this.paymentsRetrieveActionResponse = paymentsRetrieveActionResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return paymentsRetrieveActionResponse
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) ")


  public String getPaymentsRetrieveActionResponse() {
    return paymentsRetrieveActionResponse;
  }

  public void setPaymentsRetrieveActionResponse(String paymentsRetrieveActionResponse) {
    this.paymentsRetrieveActionResponse = paymentsRetrieveActionResponse;
  }

  public BQPaymentsRetrieveOutputModel paymentsInstanceReport(InlineResponse20021PaymentsInstanceReport paymentsInstanceReport) {
    this.paymentsInstanceReport = paymentsInstanceReport;
    return this;
  }

  /**
   * Get paymentsInstanceReport
   * @return paymentsInstanceReport
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse20021PaymentsInstanceReport getPaymentsInstanceReport() {
    return paymentsInstanceReport;
  }

  public void setPaymentsInstanceReport(InlineResponse20021PaymentsInstanceReport paymentsInstanceReport) {
    this.paymentsInstanceReport = paymentsInstanceReport;
  }

  public BQPaymentsRetrieveOutputModel paymentsInstanceAnalysis(InlineResponse20021PaymentsInstanceAnalysis paymentsInstanceAnalysis) {
    this.paymentsInstanceAnalysis = paymentsInstanceAnalysis;
    return this;
  }

  /**
   * Get paymentsInstanceAnalysis
   * @return paymentsInstanceAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse20021PaymentsInstanceAnalysis getPaymentsInstanceAnalysis() {
    return paymentsInstanceAnalysis;
  }

  public void setPaymentsInstanceAnalysis(InlineResponse20021PaymentsInstanceAnalysis paymentsInstanceAnalysis) {
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
    BQPaymentsRetrieveOutputModel bqPaymentsRetrieveOutputModel = (BQPaymentsRetrieveOutputModel) o;
    return Objects.equals(this.paymentsInstanceRecord, bqPaymentsRetrieveOutputModel.paymentsInstanceRecord) &&
        Objects.equals(this.paymentsRetrieveActionTaskReference, bqPaymentsRetrieveOutputModel.paymentsRetrieveActionTaskReference) &&
        Objects.equals(this.paymentsRetrieveActionTaskRecord, bqPaymentsRetrieveOutputModel.paymentsRetrieveActionTaskRecord) &&
        Objects.equals(this.paymentsRetrieveActionResponse, bqPaymentsRetrieveOutputModel.paymentsRetrieveActionResponse) &&
        Objects.equals(this.paymentsInstanceReport, bqPaymentsRetrieveOutputModel.paymentsInstanceReport) &&
        Objects.equals(this.paymentsInstanceAnalysis, bqPaymentsRetrieveOutputModel.paymentsInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentsInstanceRecord, paymentsRetrieveActionTaskReference, paymentsRetrieveActionTaskRecord, paymentsRetrieveActionResponse, paymentsInstanceReport, paymentsInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQPaymentsRetrieveOutputModel {\n");
    
    sb.append("    paymentsInstanceRecord: ").append(toIndentedString(paymentsInstanceRecord)).append("\n");
    sb.append("    paymentsRetrieveActionTaskReference: ").append(toIndentedString(paymentsRetrieveActionTaskReference)).append("\n");
    sb.append("    paymentsRetrieveActionTaskRecord: ").append(toIndentedString(paymentsRetrieveActionTaskRecord)).append("\n");
    sb.append("    paymentsRetrieveActionResponse: ").append(toIndentedString(paymentsRetrieveActionResponse)).append("\n");
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

