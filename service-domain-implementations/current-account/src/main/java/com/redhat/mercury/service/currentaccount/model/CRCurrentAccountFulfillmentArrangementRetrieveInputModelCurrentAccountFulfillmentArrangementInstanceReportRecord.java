package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceReportReference")
  private String currentAccountFulfillmentArrangementInstanceReportReference;

  @JsonProperty("currentAccountFulfillmentArrangementInstanceReportType")
  private String currentAccountFulfillmentArrangementInstanceReportType;

  @JsonProperty("currentAccountFulfillmentArrangementInstanceReportParameters")
  private String currentAccountFulfillmentArrangementInstanceReportParameters;

  public CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord currentAccountFulfillmentArrangementInstanceReportReference(String currentAccountFulfillmentArrangementInstanceReportReference) {
    this.currentAccountFulfillmentArrangementInstanceReportReference = currentAccountFulfillmentArrangementInstanceReportReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return currentAccountFulfillmentArrangementInstanceReportReference
  */
  @ApiModelProperty(example = "772709", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report ")


  public String getCurrentAccountFulfillmentArrangementInstanceReportReference() {
    return currentAccountFulfillmentArrangementInstanceReportReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReportReference(String currentAccountFulfillmentArrangementInstanceReportReference) {
    this.currentAccountFulfillmentArrangementInstanceReportReference = currentAccountFulfillmentArrangementInstanceReportReference;
  }

  public CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord currentAccountFulfillmentArrangementInstanceReportType(String currentAccountFulfillmentArrangementInstanceReportType) {
    this.currentAccountFulfillmentArrangementInstanceReportType = currentAccountFulfillmentArrangementInstanceReportType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return currentAccountFulfillmentArrangementInstanceReportType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available ")


  public String getCurrentAccountFulfillmentArrangementInstanceReportType() {
    return currentAccountFulfillmentArrangementInstanceReportType;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReportType(String currentAccountFulfillmentArrangementInstanceReportType) {
    this.currentAccountFulfillmentArrangementInstanceReportType = currentAccountFulfillmentArrangementInstanceReportType;
  }

  public CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord currentAccountFulfillmentArrangementInstanceReportParameters(String currentAccountFulfillmentArrangementInstanceReportParameters) {
    this.currentAccountFulfillmentArrangementInstanceReportParameters = currentAccountFulfillmentArrangementInstanceReportParameters;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return currentAccountFulfillmentArrangementInstanceReportParameters
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) ")


  public String getCurrentAccountFulfillmentArrangementInstanceReportParameters() {
    return currentAccountFulfillmentArrangementInstanceReportParameters;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReportParameters(String currentAccountFulfillmentArrangementInstanceReportParameters) {
    this.currentAccountFulfillmentArrangementInstanceReportParameters = currentAccountFulfillmentArrangementInstanceReportParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord crCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord = (CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceReportReference, crCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord.currentAccountFulfillmentArrangementInstanceReportReference) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInstanceReportType, crCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord.currentAccountFulfillmentArrangementInstanceReportType) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInstanceReportParameters, crCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord.currentAccountFulfillmentArrangementInstanceReportParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceReportReference, currentAccountFulfillmentArrangementInstanceReportType, currentAccountFulfillmentArrangementInstanceReportParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCurrentAccountFulfillmentArrangementRetrieveInputModelCurrentAccountFulfillmentArrangementInstanceReportRecord {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceReportReference: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReportReference)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInstanceReportType: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReportType)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInstanceReportParameters: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReportParameters)).append("\n");
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

