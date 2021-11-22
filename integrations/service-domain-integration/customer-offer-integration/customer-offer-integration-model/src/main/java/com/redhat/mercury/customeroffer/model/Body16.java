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
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidauditbqreferenceidupdateAuditInstanceRecord;
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidauditbqreferenceidupdateCustomerOfferProcedureInstanceRecord;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Body16
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class Body16 {
  @SerializedName("customerOfferProcedureInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidauditbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  @SerializedName("customerOfferProcedureInstanceReference")
  private String customerOfferProcedureInstanceReference = null;

  @SerializedName("auditInstanceReference")
  private String auditInstanceReference = null;

  @SerializedName("auditInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidauditbqreferenceidupdateAuditInstanceRecord auditInstanceRecord = null;

  @SerializedName("auditUpdateActionTaskRecord")
  private Object auditUpdateActionTaskRecord = null;

  @SerializedName("auditUpdateActionRequest")
  private String auditUpdateActionRequest = null;

  public Body16 customerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidauditbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
    return this;
  }

   /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidauditbqreferenceidupdateCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidauditbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }

  public Body16 customerOfferProcedureInstanceReference(String customerOfferProcedureInstanceReference) {
    this.customerOfferProcedureInstanceReference = customerOfferProcedureInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Offer Procedure instance 
   * @return customerOfferProcedureInstanceReference
  **/
  @Schema(example = "COPIR796411", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Offer Procedure instance ")
  public String getCustomerOfferProcedureInstanceReference() {
    return customerOfferProcedureInstanceReference;
  }

  public void setCustomerOfferProcedureInstanceReference(String customerOfferProcedureInstanceReference) {
    this.customerOfferProcedureInstanceReference = customerOfferProcedureInstanceReference;
  }

  public Body16 auditInstanceReference(String auditInstanceReference) {
    this.auditInstanceReference = auditInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Audit instance 
   * @return auditInstanceReference
  **/
  @Schema(example = "AIR799393", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Audit instance ")
  public String getAuditInstanceReference() {
    return auditInstanceReference;
  }

  public void setAuditInstanceReference(String auditInstanceReference) {
    this.auditInstanceReference = auditInstanceReference;
  }

  public Body16 auditInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidauditbqreferenceidupdateAuditInstanceRecord auditInstanceRecord) {
    this.auditInstanceRecord = auditInstanceRecord;
    return this;
  }

   /**
   * Get auditInstanceRecord
   * @return auditInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidauditbqreferenceidupdateAuditInstanceRecord getAuditInstanceRecord() {
    return auditInstanceRecord;
  }

  public void setAuditInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidauditbqreferenceidupdateAuditInstanceRecord auditInstanceRecord) {
    this.auditInstanceRecord = auditInstanceRecord;
  }

  public Body16 auditUpdateActionTaskRecord(Object auditUpdateActionTaskRecord) {
    this.auditUpdateActionTaskRecord = auditUpdateActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return auditUpdateActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")
  public Object getAuditUpdateActionTaskRecord() {
    return auditUpdateActionTaskRecord;
  }

  public void setAuditUpdateActionTaskRecord(Object auditUpdateActionTaskRecord) {
    this.auditUpdateActionTaskRecord = auditUpdateActionTaskRecord;
  }

  public Body16 auditUpdateActionRequest(String auditUpdateActionRequest) {
    this.auditUpdateActionRequest = auditUpdateActionRequest;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return auditUpdateActionRequest
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request ")
  public String getAuditUpdateActionRequest() {
    return auditUpdateActionRequest;
  }

  public void setAuditUpdateActionRequest(String auditUpdateActionRequest) {
    this.auditUpdateActionRequest = auditUpdateActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body16 body16 = (Body16) o;
    return Objects.equals(this.customerOfferProcedureInstanceRecord, body16.customerOfferProcedureInstanceRecord) &&
        Objects.equals(this.customerOfferProcedureInstanceReference, body16.customerOfferProcedureInstanceReference) &&
        Objects.equals(this.auditInstanceReference, body16.auditInstanceReference) &&
        Objects.equals(this.auditInstanceRecord, body16.auditInstanceRecord) &&
        Objects.equals(this.auditUpdateActionTaskRecord, body16.auditUpdateActionTaskRecord) &&
        Objects.equals(this.auditUpdateActionRequest, body16.auditUpdateActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedureInstanceRecord, customerOfferProcedureInstanceReference, auditInstanceReference, auditInstanceRecord, auditUpdateActionTaskRecord, auditUpdateActionRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body16 {\n");
    
    sb.append("    customerOfferProcedureInstanceRecord: ").append(toIndentedString(customerOfferProcedureInstanceRecord)).append("\n");
    sb.append("    customerOfferProcedureInstanceReference: ").append(toIndentedString(customerOfferProcedureInstanceReference)).append("\n");
    sb.append("    auditInstanceReference: ").append(toIndentedString(auditInstanceReference)).append("\n");
    sb.append("    auditInstanceRecord: ").append(toIndentedString(auditInstanceRecord)).append("\n");
    sb.append("    auditUpdateActionTaskRecord: ").append(toIndentedString(auditUpdateActionTaskRecord)).append("\n");
    sb.append("    auditUpdateActionRequest: ").append(toIndentedString(auditUpdateActionRequest)).append("\n");
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