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
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidexchangeCustomerOfferProcedureExchangeActionRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Body23
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class Body23 {
  @SerializedName("customerOfferProcedureInstanceReference")
  private String customerOfferProcedureInstanceReference = null;

  @SerializedName("agreementInstanceReference")
  private String agreementInstanceReference = null;

  @SerializedName("agreementExchangeActionTaskRecord")
  private Object agreementExchangeActionTaskRecord = null;

  @SerializedName("agreementExchangeActionRequest")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidexchangeCustomerOfferProcedureExchangeActionRequest agreementExchangeActionRequest = null;

  public Body23 customerOfferProcedureInstanceReference(String customerOfferProcedureInstanceReference) {
    this.customerOfferProcedureInstanceReference = customerOfferProcedureInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Offer Procedure instance 
   * @return customerOfferProcedureInstanceReference
  **/
  @Schema(example = "COPIR727691", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Offer Procedure instance ")
  public String getCustomerOfferProcedureInstanceReference() {
    return customerOfferProcedureInstanceReference;
  }

  public void setCustomerOfferProcedureInstanceReference(String customerOfferProcedureInstanceReference) {
    this.customerOfferProcedureInstanceReference = customerOfferProcedureInstanceReference;
  }

  public Body23 agreementInstanceReference(String agreementInstanceReference) {
    this.agreementInstanceReference = agreementInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Agreement instance 
   * @return agreementInstanceReference
  **/
  @Schema(example = "AIR726778", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Agreement instance ")
  public String getAgreementInstanceReference() {
    return agreementInstanceReference;
  }

  public void setAgreementInstanceReference(String agreementInstanceReference) {
    this.agreementInstanceReference = agreementInstanceReference;
  }

  public Body23 agreementExchangeActionTaskRecord(Object agreementExchangeActionTaskRecord) {
    this.agreementExchangeActionTaskRecord = agreementExchangeActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return agreementExchangeActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record ")
  public Object getAgreementExchangeActionTaskRecord() {
    return agreementExchangeActionTaskRecord;
  }

  public void setAgreementExchangeActionTaskRecord(Object agreementExchangeActionTaskRecord) {
    this.agreementExchangeActionTaskRecord = agreementExchangeActionTaskRecord;
  }

  public Body23 agreementExchangeActionRequest(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidexchangeCustomerOfferProcedureExchangeActionRequest agreementExchangeActionRequest) {
    this.agreementExchangeActionRequest = agreementExchangeActionRequest;
    return this;
  }

   /**
   * Get agreementExchangeActionRequest
   * @return agreementExchangeActionRequest
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidexchangeCustomerOfferProcedureExchangeActionRequest getAgreementExchangeActionRequest() {
    return agreementExchangeActionRequest;
  }

  public void setAgreementExchangeActionRequest(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidexchangeCustomerOfferProcedureExchangeActionRequest agreementExchangeActionRequest) {
    this.agreementExchangeActionRequest = agreementExchangeActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body23 body23 = (Body23) o;
    return Objects.equals(this.customerOfferProcedureInstanceReference, body23.customerOfferProcedureInstanceReference) &&
        Objects.equals(this.agreementInstanceReference, body23.agreementInstanceReference) &&
        Objects.equals(this.agreementExchangeActionTaskRecord, body23.agreementExchangeActionTaskRecord) &&
        Objects.equals(this.agreementExchangeActionRequest, body23.agreementExchangeActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedureInstanceReference, agreementInstanceReference, agreementExchangeActionTaskRecord, agreementExchangeActionRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body23 {\n");
    
    sb.append("    customerOfferProcedureInstanceReference: ").append(toIndentedString(customerOfferProcedureInstanceReference)).append("\n");
    sb.append("    agreementInstanceReference: ").append(toIndentedString(agreementInstanceReference)).append("\n");
    sb.append("    agreementExchangeActionTaskRecord: ").append(toIndentedString(agreementExchangeActionTaskRecord)).append("\n");
    sb.append("    agreementExchangeActionRequest: ").append(toIndentedString(agreementExchangeActionRequest)).append("\n");
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