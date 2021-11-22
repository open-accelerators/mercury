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
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductinitializationbqreferenceidupdateCustomerOfferProcedureInstanceRecord;
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductinitializationbqreferenceidupdateProductInitializationInstanceRecord;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BQProductInitializationUpdateOutputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQProductInitializationUpdateOutputModel {
  @SerializedName("customerOfferProcedureInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductinitializationbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  @SerializedName("productInitializationInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductinitializationbqreferenceidupdateProductInitializationInstanceRecord productInitializationInstanceRecord = null;

  @SerializedName("productInitializationUpdateActionTaskReference")
  private String productInitializationUpdateActionTaskReference = null;

  @SerializedName("productInitializationUpdateActionTaskRecord")
  private Object productInitializationUpdateActionTaskRecord = null;

  @SerializedName("updateResponseRecord")
  private Object updateResponseRecord = null;

  public BQProductInitializationUpdateOutputModel customerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductinitializationbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
    return this;
  }

   /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductinitializationbqreferenceidupdateCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductinitializationbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }

  public BQProductInitializationUpdateOutputModel productInitializationInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductinitializationbqreferenceidupdateProductInitializationInstanceRecord productInitializationInstanceRecord) {
    this.productInitializationInstanceRecord = productInitializationInstanceRecord;
    return this;
  }

   /**
   * Get productInitializationInstanceRecord
   * @return productInitializationInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductinitializationbqreferenceidupdateProductInitializationInstanceRecord getProductInitializationInstanceRecord() {
    return productInitializationInstanceRecord;
  }

  public void setProductInitializationInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidproductinitializationbqreferenceidupdateProductInitializationInstanceRecord productInitializationInstanceRecord) {
    this.productInitializationInstanceRecord = productInitializationInstanceRecord;
  }

  public BQProductInitializationUpdateOutputModel productInitializationUpdateActionTaskReference(String productInitializationUpdateActionTaskReference) {
    this.productInitializationUpdateActionTaskReference = productInitializationUpdateActionTaskReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return productInitializationUpdateActionTaskReference
  **/
  @Schema(example = "PIUATR766983", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call ")
  public String getProductInitializationUpdateActionTaskReference() {
    return productInitializationUpdateActionTaskReference;
  }

  public void setProductInitializationUpdateActionTaskReference(String productInitializationUpdateActionTaskReference) {
    this.productInitializationUpdateActionTaskReference = productInitializationUpdateActionTaskReference;
  }

  public BQProductInitializationUpdateOutputModel productInitializationUpdateActionTaskRecord(Object productInitializationUpdateActionTaskRecord) {
    this.productInitializationUpdateActionTaskRecord = productInitializationUpdateActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productInitializationUpdateActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")
  public Object getProductInitializationUpdateActionTaskRecord() {
    return productInitializationUpdateActionTaskRecord;
  }

  public void setProductInitializationUpdateActionTaskRecord(Object productInitializationUpdateActionTaskRecord) {
    this.productInitializationUpdateActionTaskRecord = productInitializationUpdateActionTaskRecord;
  }

  public BQProductInitializationUpdateOutputModel updateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response ")
  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQProductInitializationUpdateOutputModel bqProductInitializationUpdateOutputModel = (BQProductInitializationUpdateOutputModel) o;
    return Objects.equals(this.customerOfferProcedureInstanceRecord, bqProductInitializationUpdateOutputModel.customerOfferProcedureInstanceRecord) &&
        Objects.equals(this.productInitializationInstanceRecord, bqProductInitializationUpdateOutputModel.productInitializationInstanceRecord) &&
        Objects.equals(this.productInitializationUpdateActionTaskReference, bqProductInitializationUpdateOutputModel.productInitializationUpdateActionTaskReference) &&
        Objects.equals(this.productInitializationUpdateActionTaskRecord, bqProductInitializationUpdateOutputModel.productInitializationUpdateActionTaskRecord) &&
        Objects.equals(this.updateResponseRecord, bqProductInitializationUpdateOutputModel.updateResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedureInstanceRecord, productInitializationInstanceRecord, productInitializationUpdateActionTaskReference, productInitializationUpdateActionTaskRecord, updateResponseRecord);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQProductInitializationUpdateOutputModel {\n");
    
    sb.append("    customerOfferProcedureInstanceRecord: ").append(toIndentedString(customerOfferProcedureInstanceRecord)).append("\n");
    sb.append("    productInitializationInstanceRecord: ").append(toIndentedString(productInitializationInstanceRecord)).append("\n");
    sb.append("    productInitializationUpdateActionTaskReference: ").append(toIndentedString(productInitializationUpdateActionTaskReference)).append("\n");
    sb.append("    productInitializationUpdateActionTaskRecord: ").append(toIndentedString(productInitializationUpdateActionTaskRecord)).append("\n");
    sb.append("    updateResponseRecord: ").append(toIndentedString(updateResponseRecord)).append("\n");
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