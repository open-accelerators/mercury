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
 * BQAuditRetrieveInputModelAuditInstanceReport1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQAuditRetrieveInputModelAuditInstanceReport1 {
  @SerializedName("auditInstanceReportReference")
  private String auditInstanceReportReference = null;

  public BQAuditRetrieveInputModelAuditInstanceReport1 auditInstanceReportReference(String auditInstanceReportReference) {
    this.auditInstanceReportReference = auditInstanceReportReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return auditInstanceReportReference
  **/
  @Schema(example = "730762", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report ")
  public String getAuditInstanceReportReference() {
    return auditInstanceReportReference;
  }

  public void setAuditInstanceReportReference(String auditInstanceReportReference) {
    this.auditInstanceReportReference = auditInstanceReportReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAuditRetrieveInputModelAuditInstanceReport1 bqAuditRetrieveInputModelAuditInstanceReport1 = (BQAuditRetrieveInputModelAuditInstanceReport1) o;
    return Objects.equals(this.auditInstanceReportReference, bqAuditRetrieveInputModelAuditInstanceReport1.auditInstanceReportReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditInstanceReportReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAuditRetrieveInputModelAuditInstanceReport1 {\n");
    
    sb.append("    auditInstanceReportReference: ").append(toIndentedString(auditInstanceReportReference)).append("\n");
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