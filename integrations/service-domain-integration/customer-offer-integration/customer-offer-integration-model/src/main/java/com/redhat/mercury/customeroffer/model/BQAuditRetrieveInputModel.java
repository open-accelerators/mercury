/*
 * Customer Offer
 * This service domain orchestrates the processing of a product offer for a new/established  customer.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.redhat.mercury.customeroffer.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.redhat.mercury.customeroffer.model.BQAuditRetrieveInputModelAuditInstanceAnalysis1;
import com.redhat.mercury.customeroffer.model.BQAuditRetrieveInputModelAuditInstanceReport1;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BQAuditRetrieveInputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQAuditRetrieveInputModel {
  @SerializedName("auditRetrieveActionTaskRecord")
  private Object auditRetrieveActionTaskRecord = null;

  @SerializedName("auditRetrieveActionRequest")
  private String auditRetrieveActionRequest = null;

  @SerializedName("auditInstanceReport")
  private BQAuditRetrieveInputModelAuditInstanceReport1 auditInstanceReport = null;

  @SerializedName("auditInstanceAnalysis")
  private BQAuditRetrieveInputModelAuditInstanceAnalysis1 auditInstanceAnalysis = null;

  public BQAuditRetrieveInputModel auditRetrieveActionTaskRecord(Object auditRetrieveActionTaskRecord) {
    this.auditRetrieveActionTaskRecord = auditRetrieveActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return auditRetrieveActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")
  public Object getAuditRetrieveActionTaskRecord() {
    return auditRetrieveActionTaskRecord;
  }

  public void setAuditRetrieveActionTaskRecord(Object auditRetrieveActionTaskRecord) {
    this.auditRetrieveActionTaskRecord = auditRetrieveActionTaskRecord;
  }

  public BQAuditRetrieveInputModel auditRetrieveActionRequest(String auditRetrieveActionRequest) {
    this.auditRetrieveActionRequest = auditRetrieveActionRequest;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return auditRetrieveActionRequest
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")
  public String getAuditRetrieveActionRequest() {
    return auditRetrieveActionRequest;
  }

  public void setAuditRetrieveActionRequest(String auditRetrieveActionRequest) {
    this.auditRetrieveActionRequest = auditRetrieveActionRequest;
  }

  public BQAuditRetrieveInputModel auditInstanceReport(BQAuditRetrieveInputModelAuditInstanceReport1 auditInstanceReport) {
    this.auditInstanceReport = auditInstanceReport;
    return this;
  }

   /**
   * Get auditInstanceReport
   * @return auditInstanceReport
  **/
  @Schema(description = "")
  public BQAuditRetrieveInputModelAuditInstanceReport1 getAuditInstanceReport() {
    return auditInstanceReport;
  }

  public void setAuditInstanceReport(BQAuditRetrieveInputModelAuditInstanceReport1 auditInstanceReport) {
    this.auditInstanceReport = auditInstanceReport;
  }

  public BQAuditRetrieveInputModel auditInstanceAnalysis(BQAuditRetrieveInputModelAuditInstanceAnalysis1 auditInstanceAnalysis) {
    this.auditInstanceAnalysis = auditInstanceAnalysis;
    return this;
  }

   /**
   * Get auditInstanceAnalysis
   * @return auditInstanceAnalysis
  **/
  @Schema(description = "")
  public BQAuditRetrieveInputModelAuditInstanceAnalysis1 getAuditInstanceAnalysis() {
    return auditInstanceAnalysis;
  }

  public void setAuditInstanceAnalysis(BQAuditRetrieveInputModelAuditInstanceAnalysis1 auditInstanceAnalysis) {
    this.auditInstanceAnalysis = auditInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAuditRetrieveInputModel bqAuditRetrieveInputModel = (BQAuditRetrieveInputModel) o;
    return Objects.equals(this.auditRetrieveActionTaskRecord, bqAuditRetrieveInputModel.auditRetrieveActionTaskRecord) &&
        Objects.equals(this.auditRetrieveActionRequest, bqAuditRetrieveInputModel.auditRetrieveActionRequest) &&
        Objects.equals(this.auditInstanceReport, bqAuditRetrieveInputModel.auditInstanceReport) &&
        Objects.equals(this.auditInstanceAnalysis, bqAuditRetrieveInputModel.auditInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditRetrieveActionTaskRecord, auditRetrieveActionRequest, auditInstanceReport, auditInstanceAnalysis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAuditRetrieveInputModel {\n");
    
    sb.append("    auditRetrieveActionTaskRecord: ").append(toIndentedString(auditRetrieveActionTaskRecord)).append("\n");
    sb.append("    auditRetrieveActionRequest: ").append(toIndentedString(auditRetrieveActionRequest)).append("\n");
    sb.append("    auditInstanceReport: ").append(toIndentedString(auditInstanceReport)).append("\n");
    sb.append("    auditInstanceAnalysis: ").append(toIndentedString(auditInstanceAnalysis)).append("\n");
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