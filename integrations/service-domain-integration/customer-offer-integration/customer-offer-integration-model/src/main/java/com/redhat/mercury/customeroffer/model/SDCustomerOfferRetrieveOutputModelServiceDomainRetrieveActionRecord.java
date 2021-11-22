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
import com.redhat.mercury.customeroffer.model.SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis;
import com.redhat.mercury.customeroffer.model.SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis;
import com.redhat.mercury.customeroffer.model.SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord {
  @SerializedName("serviceDomainActivityAnalysis")
  private SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis serviceDomainActivityAnalysis = null;

  @SerializedName("serviceDomainPerformanceAnalysis")
  private SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis = null;

  @SerializedName("controlRecordPortfolioAnalysis")
  private SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;

  public SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord serviceDomainActivityAnalysis(SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis serviceDomainActivityAnalysis) {
    this.serviceDomainActivityAnalysis = serviceDomainActivityAnalysis;
    return this;
  }

   /**
   * Get serviceDomainActivityAnalysis
   * @return serviceDomainActivityAnalysis
  **/
  @Schema(description = "")
  public SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis getServiceDomainActivityAnalysis() {
    return serviceDomainActivityAnalysis;
  }

  public void setServiceDomainActivityAnalysis(SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis serviceDomainActivityAnalysis) {
    this.serviceDomainActivityAnalysis = serviceDomainActivityAnalysis;
  }

  public SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord serviceDomainPerformanceAnalysis(SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis) {
    this.serviceDomainPerformanceAnalysis = serviceDomainPerformanceAnalysis;
    return this;
  }

   /**
   * Get serviceDomainPerformanceAnalysis
   * @return serviceDomainPerformanceAnalysis
  **/
  @Schema(description = "")
  public SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis getServiceDomainPerformanceAnalysis() {
    return serviceDomainPerformanceAnalysis;
  }

  public void setServiceDomainPerformanceAnalysis(SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis) {
    this.serviceDomainPerformanceAnalysis = serviceDomainPerformanceAnalysis;
  }

  public SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord controlRecordPortfolioAnalysis(SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
    return this;
  }

   /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/
  @Schema(description = "")
  public SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord sdCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord = (SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord) o;
    return Objects.equals(this.serviceDomainActivityAnalysis, sdCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord.serviceDomainActivityAnalysis) &&
        Objects.equals(this.serviceDomainPerformanceAnalysis, sdCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord.serviceDomainPerformanceAnalysis) &&
        Objects.equals(this.controlRecordPortfolioAnalysis, sdCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord.controlRecordPortfolioAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainActivityAnalysis, serviceDomainPerformanceAnalysis, controlRecordPortfolioAnalysis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerOfferRetrieveOutputModelServiceDomainRetrieveActionRecord {\n");
    
    sb.append("    serviceDomainActivityAnalysis: ").append(toIndentedString(serviceDomainActivityAnalysis)).append("\n");
    sb.append("    serviceDomainPerformanceAnalysis: ").append(toIndentedString(serviceDomainPerformanceAnalysis)).append("\n");
    sb.append("    controlRecordPortfolioAnalysis: ").append(toIndentedString(controlRecordPortfolioAnalysis)).append("\n");
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