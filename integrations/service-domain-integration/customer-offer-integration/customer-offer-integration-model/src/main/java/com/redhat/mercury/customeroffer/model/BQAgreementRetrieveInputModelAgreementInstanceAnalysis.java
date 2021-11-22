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
 * BQAgreementRetrieveInputModelAgreementInstanceAnalysis
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQAgreementRetrieveInputModelAgreementInstanceAnalysis {
  @SerializedName("agreementInstanceAnalysisReference")
  private String agreementInstanceAnalysisReference = null;

  public BQAgreementRetrieveInputModelAgreementInstanceAnalysis agreementInstanceAnalysisReference(String agreementInstanceAnalysisReference) {
    this.agreementInstanceAnalysisReference = agreementInstanceAnalysisReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return agreementInstanceAnalysisReference
  **/
  @Schema(example = "72.0.0", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view ")
  public String getAgreementInstanceAnalysisReference() {
    return agreementInstanceAnalysisReference;
  }

  public void setAgreementInstanceAnalysisReference(String agreementInstanceAnalysisReference) {
    this.agreementInstanceAnalysisReference = agreementInstanceAnalysisReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAgreementRetrieveInputModelAgreementInstanceAnalysis bqAgreementRetrieveInputModelAgreementInstanceAnalysis = (BQAgreementRetrieveInputModelAgreementInstanceAnalysis) o;
    return Objects.equals(this.agreementInstanceAnalysisReference, bqAgreementRetrieveInputModelAgreementInstanceAnalysis.agreementInstanceAnalysisReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementInstanceAnalysisReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAgreementRetrieveInputModelAgreementInstanceAnalysis {\n");
    
    sb.append("    agreementInstanceAnalysisReference: ").append(toIndentedString(agreementInstanceAnalysisReference)).append("\n");
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