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
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcreditbqreferenceidupdateCreditInstanceRecord;
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcreditbqreferenceidupdateCustomerOfferProcedureInstanceRecord;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BQCreditUpdateOutputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQCreditUpdateOutputModel {
  @SerializedName("customerOfferProcedureInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcreditbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  @SerializedName("creditInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcreditbqreferenceidupdateCreditInstanceRecord creditInstanceRecord = null;

  @SerializedName("creditUpdateActionTaskReference")
  private String creditUpdateActionTaskReference = null;

  @SerializedName("creditUpdateActionTaskRecord")
  private Object creditUpdateActionTaskRecord = null;

  @SerializedName("updateResponseRecord")
  private Object updateResponseRecord = null;

  public BQCreditUpdateOutputModel customerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcreditbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
    return this;
  }

   /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcreditbqreferenceidupdateCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcreditbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }

  public BQCreditUpdateOutputModel creditInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcreditbqreferenceidupdateCreditInstanceRecord creditInstanceRecord) {
    this.creditInstanceRecord = creditInstanceRecord;
    return this;
  }

   /**
   * Get creditInstanceRecord
   * @return creditInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcreditbqreferenceidupdateCreditInstanceRecord getCreditInstanceRecord() {
    return creditInstanceRecord;
  }

  public void setCreditInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcreditbqreferenceidupdateCreditInstanceRecord creditInstanceRecord) {
    this.creditInstanceRecord = creditInstanceRecord;
  }

  public BQCreditUpdateOutputModel creditUpdateActionTaskReference(String creditUpdateActionTaskReference) {
    this.creditUpdateActionTaskReference = creditUpdateActionTaskReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return creditUpdateActionTaskReference
  **/
  @Schema(example = "CUATR722573", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call ")
  public String getCreditUpdateActionTaskReference() {
    return creditUpdateActionTaskReference;
  }

  public void setCreditUpdateActionTaskReference(String creditUpdateActionTaskReference) {
    this.creditUpdateActionTaskReference = creditUpdateActionTaskReference;
  }

  public BQCreditUpdateOutputModel creditUpdateActionTaskRecord(Object creditUpdateActionTaskRecord) {
    this.creditUpdateActionTaskRecord = creditUpdateActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return creditUpdateActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")
  public Object getCreditUpdateActionTaskRecord() {
    return creditUpdateActionTaskRecord;
  }

  public void setCreditUpdateActionTaskRecord(Object creditUpdateActionTaskRecord) {
    this.creditUpdateActionTaskRecord = creditUpdateActionTaskRecord;
  }

  public BQCreditUpdateOutputModel updateResponseRecord(Object updateResponseRecord) {
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
    BQCreditUpdateOutputModel bqCreditUpdateOutputModel = (BQCreditUpdateOutputModel) o;
    return Objects.equals(this.customerOfferProcedureInstanceRecord, bqCreditUpdateOutputModel.customerOfferProcedureInstanceRecord) &&
        Objects.equals(this.creditInstanceRecord, bqCreditUpdateOutputModel.creditInstanceRecord) &&
        Objects.equals(this.creditUpdateActionTaskReference, bqCreditUpdateOutputModel.creditUpdateActionTaskReference) &&
        Objects.equals(this.creditUpdateActionTaskRecord, bqCreditUpdateOutputModel.creditUpdateActionTaskRecord) &&
        Objects.equals(this.updateResponseRecord, bqCreditUpdateOutputModel.updateResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedureInstanceRecord, creditInstanceRecord, creditUpdateActionTaskReference, creditUpdateActionTaskRecord, updateResponseRecord);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQCreditUpdateOutputModel {\n");
    
    sb.append("    customerOfferProcedureInstanceRecord: ").append(toIndentedString(customerOfferProcedureInstanceRecord)).append("\n");
    sb.append("    creditInstanceRecord: ").append(toIndentedString(creditInstanceRecord)).append("\n");
    sb.append("    creditUpdateActionTaskReference: ").append(toIndentedString(creditUpdateActionTaskReference)).append("\n");
    sb.append("    creditUpdateActionTaskRecord: ").append(toIndentedString(creditUpdateActionTaskRecord)).append("\n");
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