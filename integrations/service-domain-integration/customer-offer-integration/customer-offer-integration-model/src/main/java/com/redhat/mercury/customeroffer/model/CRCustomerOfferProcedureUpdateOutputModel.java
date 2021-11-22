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
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidupdateCustomerOfferProcedureInstanceRecord;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CRCustomerOfferProcedureUpdateOutputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class CRCustomerOfferProcedureUpdateOutputModel {
  @SerializedName("customerOfferProcedureInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  @SerializedName("customerOfferProcedureUpdateActionTaskReference")
  private String customerOfferProcedureUpdateActionTaskReference = null;

  @SerializedName("customerOfferProcedureUpdateActionTaskRecord")
  private Object customerOfferProcedureUpdateActionTaskRecord = null;

  @SerializedName("updateResponseRecord")
  private Object updateResponseRecord = null;

  public CRCustomerOfferProcedureUpdateOutputModel customerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
    return this;
  }

   /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidupdateCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }

  public CRCustomerOfferProcedureUpdateOutputModel customerOfferProcedureUpdateActionTaskReference(String customerOfferProcedureUpdateActionTaskReference) {
    this.customerOfferProcedureUpdateActionTaskReference = customerOfferProcedureUpdateActionTaskReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerOfferProcedureUpdateActionTaskReference
  **/
  @Schema(example = "COPUATR762977", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call ")
  public String getCustomerOfferProcedureUpdateActionTaskReference() {
    return customerOfferProcedureUpdateActionTaskReference;
  }

  public void setCustomerOfferProcedureUpdateActionTaskReference(String customerOfferProcedureUpdateActionTaskReference) {
    this.customerOfferProcedureUpdateActionTaskReference = customerOfferProcedureUpdateActionTaskReference;
  }

  public CRCustomerOfferProcedureUpdateOutputModel customerOfferProcedureUpdateActionTaskRecord(Object customerOfferProcedureUpdateActionTaskRecord) {
    this.customerOfferProcedureUpdateActionTaskRecord = customerOfferProcedureUpdateActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerOfferProcedureUpdateActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")
  public Object getCustomerOfferProcedureUpdateActionTaskRecord() {
    return customerOfferProcedureUpdateActionTaskRecord;
  }

  public void setCustomerOfferProcedureUpdateActionTaskRecord(Object customerOfferProcedureUpdateActionTaskRecord) {
    this.customerOfferProcedureUpdateActionTaskRecord = customerOfferProcedureUpdateActionTaskRecord;
  }

  public CRCustomerOfferProcedureUpdateOutputModel updateResponseRecord(Object updateResponseRecord) {
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
    CRCustomerOfferProcedureUpdateOutputModel crCustomerOfferProcedureUpdateOutputModel = (CRCustomerOfferProcedureUpdateOutputModel) o;
    return Objects.equals(this.customerOfferProcedureInstanceRecord, crCustomerOfferProcedureUpdateOutputModel.customerOfferProcedureInstanceRecord) &&
        Objects.equals(this.customerOfferProcedureUpdateActionTaskReference, crCustomerOfferProcedureUpdateOutputModel.customerOfferProcedureUpdateActionTaskReference) &&
        Objects.equals(this.customerOfferProcedureUpdateActionTaskRecord, crCustomerOfferProcedureUpdateOutputModel.customerOfferProcedureUpdateActionTaskRecord) &&
        Objects.equals(this.updateResponseRecord, crCustomerOfferProcedureUpdateOutputModel.updateResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedureInstanceRecord, customerOfferProcedureUpdateActionTaskReference, customerOfferProcedureUpdateActionTaskRecord, updateResponseRecord);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCustomerOfferProcedureUpdateOutputModel {\n");
    
    sb.append("    customerOfferProcedureInstanceRecord: ").append(toIndentedString(customerOfferProcedureInstanceRecord)).append("\n");
    sb.append("    customerOfferProcedureUpdateActionTaskReference: ").append(toIndentedString(customerOfferProcedureUpdateActionTaskReference)).append("\n");
    sb.append("    customerOfferProcedureUpdateActionTaskRecord: ").append(toIndentedString(customerOfferProcedureUpdateActionTaskRecord)).append("\n");
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