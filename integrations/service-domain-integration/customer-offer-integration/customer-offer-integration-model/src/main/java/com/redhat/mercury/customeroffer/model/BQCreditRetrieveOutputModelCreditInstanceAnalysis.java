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
 * BQCreditRetrieveOutputModelCreditInstanceAnalysis
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQCreditRetrieveOutputModelCreditInstanceAnalysis {
  @SerializedName("creditInstanceAnalysisRecord")
  private Object creditInstanceAnalysisRecord = null;

  @SerializedName("creditInstanceAnalysisReportType")
  private String creditInstanceAnalysisReportType = null;

  @SerializedName("creditInstanceAnalysisParameters")
  private String creditInstanceAnalysisParameters = null;

  @SerializedName("creditInstanceAnalysisReport")
  private Object creditInstanceAnalysisReport = null;

  public BQCreditRetrieveOutputModelCreditInstanceAnalysis creditInstanceAnalysisRecord(Object creditInstanceAnalysisRecord) {
    this.creditInstanceAnalysisRecord = creditInstanceAnalysisRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return creditInstanceAnalysisRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected ")
  public Object getCreditInstanceAnalysisRecord() {
    return creditInstanceAnalysisRecord;
  }

  public void setCreditInstanceAnalysisRecord(Object creditInstanceAnalysisRecord) {
    this.creditInstanceAnalysisRecord = creditInstanceAnalysisRecord;
  }

  public BQCreditRetrieveOutputModelCreditInstanceAnalysis creditInstanceAnalysisReportType(String creditInstanceAnalysisReportType) {
    this.creditInstanceAnalysisReportType = creditInstanceAnalysisReportType;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return creditInstanceAnalysisReportType
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available ")
  public String getCreditInstanceAnalysisReportType() {
    return creditInstanceAnalysisReportType;
  }

  public void setCreditInstanceAnalysisReportType(String creditInstanceAnalysisReportType) {
    this.creditInstanceAnalysisReportType = creditInstanceAnalysisReportType;
  }

  public BQCreditRetrieveOutputModelCreditInstanceAnalysis creditInstanceAnalysisParameters(String creditInstanceAnalysisParameters) {
    this.creditInstanceAnalysisParameters = creditInstanceAnalysisParameters;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return creditInstanceAnalysisParameters
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) ")
  public String getCreditInstanceAnalysisParameters() {
    return creditInstanceAnalysisParameters;
  }

  public void setCreditInstanceAnalysisParameters(String creditInstanceAnalysisParameters) {
    this.creditInstanceAnalysisParameters = creditInstanceAnalysisParameters;
  }

  public BQCreditRetrieveOutputModelCreditInstanceAnalysis creditInstanceAnalysisReport(Object creditInstanceAnalysisReport) {
    this.creditInstanceAnalysisReport = creditInstanceAnalysisReport;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return creditInstanceAnalysisReport
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate ")
  public Object getCreditInstanceAnalysisReport() {
    return creditInstanceAnalysisReport;
  }

  public void setCreditInstanceAnalysisReport(Object creditInstanceAnalysisReport) {
    this.creditInstanceAnalysisReport = creditInstanceAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQCreditRetrieveOutputModelCreditInstanceAnalysis bqCreditRetrieveOutputModelCreditInstanceAnalysis = (BQCreditRetrieveOutputModelCreditInstanceAnalysis) o;
    return Objects.equals(this.creditInstanceAnalysisRecord, bqCreditRetrieveOutputModelCreditInstanceAnalysis.creditInstanceAnalysisRecord) &&
        Objects.equals(this.creditInstanceAnalysisReportType, bqCreditRetrieveOutputModelCreditInstanceAnalysis.creditInstanceAnalysisReportType) &&
        Objects.equals(this.creditInstanceAnalysisParameters, bqCreditRetrieveOutputModelCreditInstanceAnalysis.creditInstanceAnalysisParameters) &&
        Objects.equals(this.creditInstanceAnalysisReport, bqCreditRetrieveOutputModelCreditInstanceAnalysis.creditInstanceAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditInstanceAnalysisRecord, creditInstanceAnalysisReportType, creditInstanceAnalysisParameters, creditInstanceAnalysisReport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQCreditRetrieveOutputModelCreditInstanceAnalysis {\n");
    
    sb.append("    creditInstanceAnalysisRecord: ").append(toIndentedString(creditInstanceAnalysisRecord)).append("\n");
    sb.append("    creditInstanceAnalysisReportType: ").append(toIndentedString(creditInstanceAnalysisReportType)).append("\n");
    sb.append("    creditInstanceAnalysisParameters: ").append(toIndentedString(creditInstanceAnalysisParameters)).append("\n");
    sb.append("    creditInstanceAnalysisReport: ").append(toIndentedString(creditInstanceAnalysisReport)).append("\n");
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