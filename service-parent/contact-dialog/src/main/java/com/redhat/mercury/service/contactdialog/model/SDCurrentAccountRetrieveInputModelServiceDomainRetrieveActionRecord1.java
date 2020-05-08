package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis;
import com.redhat.mercury.service.contactdialog.model.SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis;
import com.redhat.mercury.service.contactdialog.model.SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1   {
  @JsonProperty("serviceDomainActivityAnalysis")
  private SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis serviceDomainActivityAnalysis;

  @JsonProperty("serviceDomainPerformanceAnalysis")
  private SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis;

  @JsonProperty("controlRecordPortfolioAnalysis")
  private SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis;

  public SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1 serviceDomainActivityAnalysis(SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis serviceDomainActivityAnalysis) {
    this.serviceDomainActivityAnalysis = serviceDomainActivityAnalysis;
    return this;
  }

  /**
   * Get serviceDomainActivityAnalysis
   * @return serviceDomainActivityAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis getServiceDomainActivityAnalysis() {
    return serviceDomainActivityAnalysis;
  }

  public void setServiceDomainActivityAnalysis(SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainActivityAnalysis serviceDomainActivityAnalysis) {
    this.serviceDomainActivityAnalysis = serviceDomainActivityAnalysis;
  }

  public SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1 serviceDomainPerformanceAnalysis(SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis) {
    this.serviceDomainPerformanceAnalysis = serviceDomainPerformanceAnalysis;
    return this;
  }

  /**
   * Get serviceDomainPerformanceAnalysis
   * @return serviceDomainPerformanceAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis getServiceDomainPerformanceAnalysis() {
    return serviceDomainPerformanceAnalysis;
  }

  public void setServiceDomainPerformanceAnalysis(SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ServiceDomainPerformanceAnalysis serviceDomainPerformanceAnalysis) {
    this.serviceDomainPerformanceAnalysis = serviceDomainPerformanceAnalysis;
  }

  public SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1 controlRecordPortfolioAnalysis(SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
    return this;
  }

  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
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
    SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1 sdCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1 = (SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1) o;
    return Objects.equals(this.serviceDomainActivityAnalysis, sdCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1.serviceDomainActivityAnalysis) &&
        Objects.equals(this.serviceDomainPerformanceAnalysis, sdCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1.serviceDomainPerformanceAnalysis) &&
        Objects.equals(this.controlRecordPortfolioAnalysis, sdCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1.controlRecordPortfolioAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainActivityAnalysis, serviceDomainPerformanceAnalysis, controlRecordPortfolioAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1 {\n");
    
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

