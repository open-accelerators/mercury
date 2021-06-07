/*
 * Account Recovery
 * This service domain handles the restructuring of a distressed account (loan) after standard recovery
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.redhat.mercury.accountrecovery.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BQWritedownRetrieveInputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-07T18:27:41.474305+02:00[Europe/Madrid]")
public class BQWritedownRetrieveInputModel {
  @SerializedName("writedownRetrieveActionTaskRecord")
  private Object writedownRetrieveActionTaskRecord = null;

  @SerializedName("writedownRetrieveActionRequest")
  private String writedownRetrieveActionRequest = null;

  @SerializedName("writedownInstanceReport")
  private Object writedownInstanceReport = null;

  @SerializedName("writedownInstanceAnalysis")
  private Object writedownInstanceAnalysis = null;

  public BQWritedownRetrieveInputModel writedownRetrieveActionTaskRecord(Object writedownRetrieveActionTaskRecord) {
    this.writedownRetrieveActionTaskRecord = writedownRetrieveActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return writedownRetrieveActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")
  public Object getWritedownRetrieveActionTaskRecord() {
    return writedownRetrieveActionTaskRecord;
  }

  public void setWritedownRetrieveActionTaskRecord(Object writedownRetrieveActionTaskRecord) {
    this.writedownRetrieveActionTaskRecord = writedownRetrieveActionTaskRecord;
  }

  public BQWritedownRetrieveInputModel writedownRetrieveActionRequest(String writedownRetrieveActionRequest) {
    this.writedownRetrieveActionRequest = writedownRetrieveActionRequest;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return writedownRetrieveActionRequest
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")
  public String getWritedownRetrieveActionRequest() {
    return writedownRetrieveActionRequest;
  }

  public void setWritedownRetrieveActionRequest(String writedownRetrieveActionRequest) {
    this.writedownRetrieveActionRequest = writedownRetrieveActionRequest;
  }

  public BQWritedownRetrieveInputModel writedownInstanceReport(Object writedownInstanceReport) {
    this.writedownInstanceReport = writedownInstanceReport;
    return this;
  }

   /**
   * Get writedownInstanceReport
   * @return writedownInstanceReport
  **/
  @Schema(description = "")
  public Object getWritedownInstanceReport() {
    return writedownInstanceReport;
  }

  public void setWritedownInstanceReport(Object writedownInstanceReport) {
    this.writedownInstanceReport = writedownInstanceReport;
  }

  public BQWritedownRetrieveInputModel writedownInstanceAnalysis(Object writedownInstanceAnalysis) {
    this.writedownInstanceAnalysis = writedownInstanceAnalysis;
    return this;
  }

   /**
   * Get writedownInstanceAnalysis
   * @return writedownInstanceAnalysis
  **/
  @Schema(description = "")
  public Object getWritedownInstanceAnalysis() {
    return writedownInstanceAnalysis;
  }

  public void setWritedownInstanceAnalysis(Object writedownInstanceAnalysis) {
    this.writedownInstanceAnalysis = writedownInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQWritedownRetrieveInputModel bqWritedownRetrieveInputModel = (BQWritedownRetrieveInputModel) o;
    return Objects.equals(this.writedownRetrieveActionTaskRecord, bqWritedownRetrieveInputModel.writedownRetrieveActionTaskRecord) &&
        Objects.equals(this.writedownRetrieveActionRequest, bqWritedownRetrieveInputModel.writedownRetrieveActionRequest) &&
        Objects.equals(this.writedownInstanceReport, bqWritedownRetrieveInputModel.writedownInstanceReport) &&
        Objects.equals(this.writedownInstanceAnalysis, bqWritedownRetrieveInputModel.writedownInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(writedownRetrieveActionTaskRecord, writedownRetrieveActionRequest, writedownInstanceReport, writedownInstanceAnalysis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQWritedownRetrieveInputModel {\n");
    
    sb.append("    writedownRetrieveActionTaskRecord: ").append(toIndentedString(writedownRetrieveActionTaskRecord)).append("\n");
    sb.append("    writedownRetrieveActionRequest: ").append(toIndentedString(writedownRetrieveActionRequest)).append("\n");
    sb.append("    writedownInstanceReport: ").append(toIndentedString(writedownInstanceReport)).append("\n");
    sb.append("    writedownInstanceAnalysis: ").append(toIndentedString(writedownInstanceAnalysis)).append("\n");
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
