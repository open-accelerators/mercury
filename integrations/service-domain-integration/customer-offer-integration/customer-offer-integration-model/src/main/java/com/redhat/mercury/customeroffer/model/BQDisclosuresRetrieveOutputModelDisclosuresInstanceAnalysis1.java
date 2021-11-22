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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BQDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis1 {
  @SerializedName("disclosuresInstanceAnalysisRecord")
  private Object disclosuresInstanceAnalysisRecord = null;

  @SerializedName("disclosuresInstanceAnalysisReportType")
  private String disclosuresInstanceAnalysisReportType = null;

  @SerializedName("disclosuresInstanceAnalysisParameters")
  private String disclosuresInstanceAnalysisParameters = null;

  @SerializedName("disclosuresInstanceAnalysisReport")
  private Object disclosuresInstanceAnalysisReport = null;

  public BQDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis1 disclosuresInstanceAnalysisRecord(Object disclosuresInstanceAnalysisRecord) {
    this.disclosuresInstanceAnalysisRecord = disclosuresInstanceAnalysisRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return disclosuresInstanceAnalysisRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected ")
  public Object getDisclosuresInstanceAnalysisRecord() {
    return disclosuresInstanceAnalysisRecord;
  }

  public void setDisclosuresInstanceAnalysisRecord(Object disclosuresInstanceAnalysisRecord) {
    this.disclosuresInstanceAnalysisRecord = disclosuresInstanceAnalysisRecord;
  }

  public BQDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis1 disclosuresInstanceAnalysisReportType(String disclosuresInstanceAnalysisReportType) {
    this.disclosuresInstanceAnalysisReportType = disclosuresInstanceAnalysisReportType;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return disclosuresInstanceAnalysisReportType
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available ")
  public String getDisclosuresInstanceAnalysisReportType() {
    return disclosuresInstanceAnalysisReportType;
  }

  public void setDisclosuresInstanceAnalysisReportType(String disclosuresInstanceAnalysisReportType) {
    this.disclosuresInstanceAnalysisReportType = disclosuresInstanceAnalysisReportType;
  }

  public BQDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis1 disclosuresInstanceAnalysisParameters(String disclosuresInstanceAnalysisParameters) {
    this.disclosuresInstanceAnalysisParameters = disclosuresInstanceAnalysisParameters;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return disclosuresInstanceAnalysisParameters
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) ")
  public String getDisclosuresInstanceAnalysisParameters() {
    return disclosuresInstanceAnalysisParameters;
  }

  public void setDisclosuresInstanceAnalysisParameters(String disclosuresInstanceAnalysisParameters) {
    this.disclosuresInstanceAnalysisParameters = disclosuresInstanceAnalysisParameters;
  }

  public BQDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis1 disclosuresInstanceAnalysisReport(Object disclosuresInstanceAnalysisReport) {
    this.disclosuresInstanceAnalysisReport = disclosuresInstanceAnalysisReport;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return disclosuresInstanceAnalysisReport
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate ")
  public Object getDisclosuresInstanceAnalysisReport() {
    return disclosuresInstanceAnalysisReport;
  }

  public void setDisclosuresInstanceAnalysisReport(Object disclosuresInstanceAnalysisReport) {
    this.disclosuresInstanceAnalysisReport = disclosuresInstanceAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis1 bqDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis1 = (BQDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis1) o;
    return Objects.equals(this.disclosuresInstanceAnalysisRecord, bqDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis1.disclosuresInstanceAnalysisRecord) &&
        Objects.equals(this.disclosuresInstanceAnalysisReportType, bqDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis1.disclosuresInstanceAnalysisReportType) &&
        Objects.equals(this.disclosuresInstanceAnalysisParameters, bqDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis1.disclosuresInstanceAnalysisParameters) &&
        Objects.equals(this.disclosuresInstanceAnalysisReport, bqDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis1.disclosuresInstanceAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disclosuresInstanceAnalysisRecord, disclosuresInstanceAnalysisReportType, disclosuresInstanceAnalysisParameters, disclosuresInstanceAnalysisReport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQDisclosuresRetrieveOutputModelDisclosuresInstanceAnalysis1 {\n");
    
    sb.append("    disclosuresInstanceAnalysisRecord: ").append(toIndentedString(disclosuresInstanceAnalysisRecord)).append("\n");
    sb.append("    disclosuresInstanceAnalysisReportType: ").append(toIndentedString(disclosuresInstanceAnalysisReportType)).append("\n");
    sb.append("    disclosuresInstanceAnalysisParameters: ").append(toIndentedString(disclosuresInstanceAnalysisParameters)).append("\n");
    sb.append("    disclosuresInstanceAnalysisReport: ").append(toIndentedString(disclosuresInstanceAnalysisReport)).append("\n");
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