package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis1   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceAnalysisReference")
  private String currentAccountFulfillmentArrangementInstanceAnalysisReference;

  @JsonProperty("currentAccountFulfillmentArrangementInstanceAnalysisReportType")
  private String currentAccountFulfillmentArrangementInstanceAnalysisReportType;

  @JsonProperty("currentAccountFulfillmentArrangementInstanceAnalysisParameters")
  private String currentAccountFulfillmentArrangementInstanceAnalysisParameters;

  public CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis1 currentAccountFulfillmentArrangementInstanceAnalysisReference(String currentAccountFulfillmentArrangementInstanceAnalysisReference) {
    this.currentAccountFulfillmentArrangementInstanceAnalysisReference = currentAccountFulfillmentArrangementInstanceAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return currentAccountFulfillmentArrangementInstanceAnalysisReference
  */
  @ApiModelProperty(example = "723134", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view ")


  public String getCurrentAccountFulfillmentArrangementInstanceAnalysisReference() {
    return currentAccountFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceAnalysisReference(String currentAccountFulfillmentArrangementInstanceAnalysisReference) {
    this.currentAccountFulfillmentArrangementInstanceAnalysisReference = currentAccountFulfillmentArrangementInstanceAnalysisReference;
  }

  public CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis1 currentAccountFulfillmentArrangementInstanceAnalysisReportType(String currentAccountFulfillmentArrangementInstanceAnalysisReportType) {
    this.currentAccountFulfillmentArrangementInstanceAnalysisReportType = currentAccountFulfillmentArrangementInstanceAnalysisReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return currentAccountFulfillmentArrangementInstanceAnalysisReportType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available ")


  public String getCurrentAccountFulfillmentArrangementInstanceAnalysisReportType() {
    return currentAccountFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceAnalysisReportType(String currentAccountFulfillmentArrangementInstanceAnalysisReportType) {
    this.currentAccountFulfillmentArrangementInstanceAnalysisReportType = currentAccountFulfillmentArrangementInstanceAnalysisReportType;
  }

  public CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis1 currentAccountFulfillmentArrangementInstanceAnalysisParameters(String currentAccountFulfillmentArrangementInstanceAnalysisParameters) {
    this.currentAccountFulfillmentArrangementInstanceAnalysisParameters = currentAccountFulfillmentArrangementInstanceAnalysisParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return currentAccountFulfillmentArrangementInstanceAnalysisParameters
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) ")


  public String getCurrentAccountFulfillmentArrangementInstanceAnalysisParameters() {
    return currentAccountFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceAnalysisParameters(String currentAccountFulfillmentArrangementInstanceAnalysisParameters) {
    this.currentAccountFulfillmentArrangementInstanceAnalysisParameters = currentAccountFulfillmentArrangementInstanceAnalysisParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis1 crCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis1 = (CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis1) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceAnalysisReference, crCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis1.currentAccountFulfillmentArrangementInstanceAnalysisReference) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInstanceAnalysisReportType, crCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis1.currentAccountFulfillmentArrangementInstanceAnalysisReportType) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInstanceAnalysisParameters, crCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis1.currentAccountFulfillmentArrangementInstanceAnalysisParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceAnalysisReference, currentAccountFulfillmentArrangementInstanceAnalysisReportType, currentAccountFulfillmentArrangementInstanceAnalysisParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceAnalysis1 {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceAnalysisReference: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceAnalysisReference)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInstanceAnalysisReportType: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceAnalysisReportType)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInstanceAnalysisParameters: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceAnalysisParameters)).append("\n");
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

