/*
 * Customer Credit Rating
 * This service domain maintains and administers the bank's credit assessment for customers.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.redhat.mercury.customercreditrating.model;

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
 * SDCustomerCreditRatingRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-03T16:36:13.702891+02:00[Europe/Madrid]")
public class SDCustomerCreditRatingRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis {
  @SerializedName("controlRecordPortfolioAnalysisReference")
  private String controlRecordPortfolioAnalysisReference = null;

  @SerializedName("controlRecordPortfolioAnalysisResult")
  private String controlRecordPortfolioAnalysisResult = null;

  @SerializedName("controlRecordPortfolioAnalysisReportType")
  private String controlRecordPortfolioAnalysisReportType = null;

  @SerializedName("controlRecordAnalysisReport")
  private Object controlRecordAnalysisReport = null;

  public SDCustomerCreditRatingRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysisReference(String controlRecordPortfolioAnalysisReference) {
    this.controlRecordPortfolioAnalysisReference = controlRecordPortfolioAnalysisReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record portfolio analysis view maintained by the service center 
   * @return controlRecordPortfolioAnalysisReference
  **/
  @Schema(example = "739764", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record portfolio analysis view maintained by the service center ")
  public String getControlRecordPortfolioAnalysisReference() {
    return controlRecordPortfolioAnalysisReference;
  }

  public void setControlRecordPortfolioAnalysisReference(String controlRecordPortfolioAnalysisReference) {
    this.controlRecordPortfolioAnalysisReference = controlRecordPortfolioAnalysisReference;
  }

  public SDCustomerCreditRatingRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysisResult(String controlRecordPortfolioAnalysisResult) {
    this.controlRecordPortfolioAnalysisResult = controlRecordPortfolioAnalysisResult;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The results of the portfolio analysis that can be on-going, periodic and actual and projected (can be unstructured data) 
   * @return controlRecordPortfolioAnalysisResult
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The results of the portfolio analysis that can be on-going, periodic and actual and projected (can be unstructured data) ")
  public String getControlRecordPortfolioAnalysisResult() {
    return controlRecordPortfolioAnalysisResult;
  }

  public void setControlRecordPortfolioAnalysisResult(String controlRecordPortfolioAnalysisResult) {
    this.controlRecordPortfolioAnalysisResult = controlRecordPortfolioAnalysisResult;
  }

  public SDCustomerCreditRatingRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysisReportType(String controlRecordPortfolioAnalysisReportType) {
    this.controlRecordPortfolioAnalysisReportType = controlRecordPortfolioAnalysisReportType;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external portfolio analysis report available 
   * @return controlRecordPortfolioAnalysisReportType
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external portfolio analysis report available ")
  public String getControlRecordPortfolioAnalysisReportType() {
    return controlRecordPortfolioAnalysisReportType;
  }

  public void setControlRecordPortfolioAnalysisReportType(String controlRecordPortfolioAnalysisReportType) {
    this.controlRecordPortfolioAnalysisReportType = controlRecordPortfolioAnalysisReportType;
  }

  public SDCustomerCreditRatingRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordAnalysisReport(Object controlRecordAnalysisReport) {
    this.controlRecordAnalysisReport = controlRecordAnalysisReport;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return controlRecordAnalysisReport
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate ")
  public Object getControlRecordAnalysisReport() {
    return controlRecordAnalysisReport;
  }

  public void setControlRecordAnalysisReport(Object controlRecordAnalysisReport) {
    this.controlRecordAnalysisReport = controlRecordAnalysisReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCreditRatingRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis sdCustomerCreditRatingRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis = (SDCustomerCreditRatingRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis) o;
    return Objects.equals(this.controlRecordPortfolioAnalysisReference, sdCustomerCreditRatingRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis.controlRecordPortfolioAnalysisReference) &&
        Objects.equals(this.controlRecordPortfolioAnalysisResult, sdCustomerCreditRatingRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis.controlRecordPortfolioAnalysisResult) &&
        Objects.equals(this.controlRecordPortfolioAnalysisReportType, sdCustomerCreditRatingRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis.controlRecordPortfolioAnalysisReportType) &&
        Objects.equals(this.controlRecordAnalysisReport, sdCustomerCreditRatingRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis.controlRecordAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlRecordPortfolioAnalysisReference, controlRecordPortfolioAnalysisResult, controlRecordPortfolioAnalysisReportType, controlRecordAnalysisReport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCreditRatingRetrieveOutputModelServiceDomainRetrieveActionRecordControlRecordPortfolioAnalysis {\n");
    
    sb.append("    controlRecordPortfolioAnalysisReference: ").append(toIndentedString(controlRecordPortfolioAnalysisReference)).append("\n");
    sb.append("    controlRecordPortfolioAnalysisResult: ").append(toIndentedString(controlRecordPortfolioAnalysisResult)).append("\n");
    sb.append("    controlRecordPortfolioAnalysisReportType: ").append(toIndentedString(controlRecordPortfolioAnalysisReportType)).append("\n");
    sb.append("    controlRecordAnalysisReport: ").append(toIndentedString(controlRecordAnalysisReport)).append("\n");
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
