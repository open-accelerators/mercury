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
 * SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis {
  @SerializedName("controlRecordPortfolioAnalysisReference")
  private String controlRecordPortfolioAnalysisReference = null;

  @SerializedName("controlRecordPortfolioAnalysisResult")
  private String controlRecordPortfolioAnalysisResult = null;

  @SerializedName("controlRecordPortfolioAnalysisReportType")
  private String controlRecordPortfolioAnalysisReportType = null;

  @SerializedName("controlRecordAnalysisReport")
  private Object controlRecordAnalysisReport = null;

  public SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordPortfolioAnalysisReference(String controlRecordPortfolioAnalysisReference) {
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

  public SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordPortfolioAnalysisResult(String controlRecordPortfolioAnalysisResult) {
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

  public SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordPortfolioAnalysisReportType(String controlRecordPortfolioAnalysisReportType) {
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

  public SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordAnalysisReport(Object controlRecordAnalysisReport) {
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
    SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis sdCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis = (SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis) o;
    return Objects.equals(this.controlRecordPortfolioAnalysisReference, sdCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis.controlRecordPortfolioAnalysisReference) &&
        Objects.equals(this.controlRecordPortfolioAnalysisResult, sdCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis.controlRecordPortfolioAnalysisResult) &&
        Objects.equals(this.controlRecordPortfolioAnalysisReportType, sdCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis.controlRecordPortfolioAnalysisReportType) &&
        Objects.equals(this.controlRecordAnalysisReport, sdCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis.controlRecordAnalysisReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlRecordPortfolioAnalysisReference, controlRecordPortfolioAnalysisResult, controlRecordPortfolioAnalysisReportType, controlRecordAnalysisReport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis {\n");
    
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