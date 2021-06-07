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
 * CRCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceReportRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-03T16:36:13.702891+02:00[Europe/Madrid]")
public class CRCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceReportRecord {
  @SerializedName("customerCreditRatingStateInstanceReportReference")
  private String customerCreditRatingStateInstanceReportReference = null;

  @SerializedName("customerCreditRatingStateInstanceReportType")
  private String customerCreditRatingStateInstanceReportType = null;

  @SerializedName("customerCreditRatingStateInstanceReportParameters")
  private String customerCreditRatingStateInstanceReportParameters = null;

  public CRCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceReportRecord customerCreditRatingStateInstanceReportReference(String customerCreditRatingStateInstanceReportReference) {
    this.customerCreditRatingStateInstanceReportReference = customerCreditRatingStateInstanceReportReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerCreditRatingStateInstanceReportReference
  **/
  @Schema(example = "749873", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report ")
  public String getCustomerCreditRatingStateInstanceReportReference() {
    return customerCreditRatingStateInstanceReportReference;
  }

  public void setCustomerCreditRatingStateInstanceReportReference(String customerCreditRatingStateInstanceReportReference) {
    this.customerCreditRatingStateInstanceReportReference = customerCreditRatingStateInstanceReportReference;
  }

  public CRCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceReportRecord customerCreditRatingStateInstanceReportType(String customerCreditRatingStateInstanceReportType) {
    this.customerCreditRatingStateInstanceReportType = customerCreditRatingStateInstanceReportType;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerCreditRatingStateInstanceReportType
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available ")
  public String getCustomerCreditRatingStateInstanceReportType() {
    return customerCreditRatingStateInstanceReportType;
  }

  public void setCustomerCreditRatingStateInstanceReportType(String customerCreditRatingStateInstanceReportType) {
    this.customerCreditRatingStateInstanceReportType = customerCreditRatingStateInstanceReportType;
  }

  public CRCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceReportRecord customerCreditRatingStateInstanceReportParameters(String customerCreditRatingStateInstanceReportParameters) {
    this.customerCreditRatingStateInstanceReportParameters = customerCreditRatingStateInstanceReportParameters;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerCreditRatingStateInstanceReportParameters
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) ")
  public String getCustomerCreditRatingStateInstanceReportParameters() {
    return customerCreditRatingStateInstanceReportParameters;
  }

  public void setCustomerCreditRatingStateInstanceReportParameters(String customerCreditRatingStateInstanceReportParameters) {
    this.customerCreditRatingStateInstanceReportParameters = customerCreditRatingStateInstanceReportParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceReportRecord crCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceReportRecord = (CRCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceReportRecord) o;
    return Objects.equals(this.customerCreditRatingStateInstanceReportReference, crCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceReportRecord.customerCreditRatingStateInstanceReportReference) &&
        Objects.equals(this.customerCreditRatingStateInstanceReportType, crCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceReportRecord.customerCreditRatingStateInstanceReportType) &&
        Objects.equals(this.customerCreditRatingStateInstanceReportParameters, crCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceReportRecord.customerCreditRatingStateInstanceReportParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCreditRatingStateInstanceReportReference, customerCreditRatingStateInstanceReportType, customerCreditRatingStateInstanceReportParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerCreditRatingStateRetrieveInputModelCustomerCreditRatingStateInstanceReportRecord {\n");
    
    sb.append("    customerCreditRatingStateInstanceReportReference: ").append(toIndentedString(customerCreditRatingStateInstanceReportReference)).append("\n");
    sb.append("    customerCreditRatingStateInstanceReportType: ").append(toIndentedString(customerCreditRatingStateInstanceReportType)).append("\n");
    sb.append("    customerCreditRatingStateInstanceReportParameters: ").append(toIndentedString(customerCreditRatingStateInstanceReportParameters)).append("\n");
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
