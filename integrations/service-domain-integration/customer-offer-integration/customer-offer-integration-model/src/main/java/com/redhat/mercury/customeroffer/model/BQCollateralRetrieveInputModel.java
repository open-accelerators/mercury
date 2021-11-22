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
import com.redhat.mercury.customeroffer.model.BQCollateralRetrieveInputModelCollateralInstanceAnalysis1;
import com.redhat.mercury.customeroffer.model.BQCollateralRetrieveInputModelCollateralInstanceReport1;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BQCollateralRetrieveInputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQCollateralRetrieveInputModel {
  @SerializedName("collateralRetrieveActionTaskRecord")
  private Object collateralRetrieveActionTaskRecord = null;

  @SerializedName("collateralRetrieveActionRequest")
  private String collateralRetrieveActionRequest = null;

  @SerializedName("collateralInstanceReport")
  private BQCollateralRetrieveInputModelCollateralInstanceReport1 collateralInstanceReport = null;

  @SerializedName("collateralInstanceAnalysis")
  private BQCollateralRetrieveInputModelCollateralInstanceAnalysis1 collateralInstanceAnalysis = null;

  public BQCollateralRetrieveInputModel collateralRetrieveActionTaskRecord(Object collateralRetrieveActionTaskRecord) {
    this.collateralRetrieveActionTaskRecord = collateralRetrieveActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return collateralRetrieveActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")
  public Object getCollateralRetrieveActionTaskRecord() {
    return collateralRetrieveActionTaskRecord;
  }

  public void setCollateralRetrieveActionTaskRecord(Object collateralRetrieveActionTaskRecord) {
    this.collateralRetrieveActionTaskRecord = collateralRetrieveActionTaskRecord;
  }

  public BQCollateralRetrieveInputModel collateralRetrieveActionRequest(String collateralRetrieveActionRequest) {
    this.collateralRetrieveActionRequest = collateralRetrieveActionRequest;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return collateralRetrieveActionRequest
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")
  public String getCollateralRetrieveActionRequest() {
    return collateralRetrieveActionRequest;
  }

  public void setCollateralRetrieveActionRequest(String collateralRetrieveActionRequest) {
    this.collateralRetrieveActionRequest = collateralRetrieveActionRequest;
  }

  public BQCollateralRetrieveInputModel collateralInstanceReport(BQCollateralRetrieveInputModelCollateralInstanceReport1 collateralInstanceReport) {
    this.collateralInstanceReport = collateralInstanceReport;
    return this;
  }

   /**
   * Get collateralInstanceReport
   * @return collateralInstanceReport
  **/
  @Schema(description = "")
  public BQCollateralRetrieveInputModelCollateralInstanceReport1 getCollateralInstanceReport() {
    return collateralInstanceReport;
  }

  public void setCollateralInstanceReport(BQCollateralRetrieveInputModelCollateralInstanceReport1 collateralInstanceReport) {
    this.collateralInstanceReport = collateralInstanceReport;
  }

  public BQCollateralRetrieveInputModel collateralInstanceAnalysis(BQCollateralRetrieveInputModelCollateralInstanceAnalysis1 collateralInstanceAnalysis) {
    this.collateralInstanceAnalysis = collateralInstanceAnalysis;
    return this;
  }

   /**
   * Get collateralInstanceAnalysis
   * @return collateralInstanceAnalysis
  **/
  @Schema(description = "")
  public BQCollateralRetrieveInputModelCollateralInstanceAnalysis1 getCollateralInstanceAnalysis() {
    return collateralInstanceAnalysis;
  }

  public void setCollateralInstanceAnalysis(BQCollateralRetrieveInputModelCollateralInstanceAnalysis1 collateralInstanceAnalysis) {
    this.collateralInstanceAnalysis = collateralInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQCollateralRetrieveInputModel bqCollateralRetrieveInputModel = (BQCollateralRetrieveInputModel) o;
    return Objects.equals(this.collateralRetrieveActionTaskRecord, bqCollateralRetrieveInputModel.collateralRetrieveActionTaskRecord) &&
        Objects.equals(this.collateralRetrieveActionRequest, bqCollateralRetrieveInputModel.collateralRetrieveActionRequest) &&
        Objects.equals(this.collateralInstanceReport, bqCollateralRetrieveInputModel.collateralInstanceReport) &&
        Objects.equals(this.collateralInstanceAnalysis, bqCollateralRetrieveInputModel.collateralInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collateralRetrieveActionTaskRecord, collateralRetrieveActionRequest, collateralInstanceReport, collateralInstanceAnalysis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQCollateralRetrieveInputModel {\n");
    
    sb.append("    collateralRetrieveActionTaskRecord: ").append(toIndentedString(collateralRetrieveActionTaskRecord)).append("\n");
    sb.append("    collateralRetrieveActionRequest: ").append(toIndentedString(collateralRetrieveActionRequest)).append("\n");
    sb.append("    collateralInstanceReport: ").append(toIndentedString(collateralInstanceReport)).append("\n");
    sb.append("    collateralInstanceAnalysis: ").append(toIndentedString(collateralInstanceAnalysis)).append("\n");
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