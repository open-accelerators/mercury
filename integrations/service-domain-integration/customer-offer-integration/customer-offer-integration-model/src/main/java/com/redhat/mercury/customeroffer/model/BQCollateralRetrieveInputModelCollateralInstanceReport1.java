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
 * BQCollateralRetrieveInputModelCollateralInstanceReport1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQCollateralRetrieveInputModelCollateralInstanceReport1 {
  @SerializedName("collateralInstanceReportReference")
  private String collateralInstanceReportReference = null;

  public BQCollateralRetrieveInputModelCollateralInstanceReport1 collateralInstanceReportReference(String collateralInstanceReportReference) {
    this.collateralInstanceReportReference = collateralInstanceReportReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return collateralInstanceReportReference
  **/
  @Schema(example = "729687", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report ")
  public String getCollateralInstanceReportReference() {
    return collateralInstanceReportReference;
  }

  public void setCollateralInstanceReportReference(String collateralInstanceReportReference) {
    this.collateralInstanceReportReference = collateralInstanceReportReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQCollateralRetrieveInputModelCollateralInstanceReport1 bqCollateralRetrieveInputModelCollateralInstanceReport1 = (BQCollateralRetrieveInputModelCollateralInstanceReport1) o;
    return Objects.equals(this.collateralInstanceReportReference, bqCollateralRetrieveInputModelCollateralInstanceReport1.collateralInstanceReportReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collateralInstanceReportReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQCollateralRetrieveInputModelCollateralInstanceReport1 {\n");
    
    sb.append("    collateralInstanceReportReference: ").append(toIndentedString(collateralInstanceReportReference)).append("\n");
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