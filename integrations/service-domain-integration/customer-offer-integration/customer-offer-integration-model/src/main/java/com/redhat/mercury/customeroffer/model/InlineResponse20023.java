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
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCollateralInstanceRecord;
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCustomerOfferProcedureInstanceRecord;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse20023
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class InlineResponse20023 {
  @SerializedName("customerOfferProcedureInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  @SerializedName("collateralInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCollateralInstanceRecord collateralInstanceRecord = null;

  @SerializedName("collateralUpdateActionTaskReference")
  private String collateralUpdateActionTaskReference = null;

  @SerializedName("collateralUpdateActionTaskRecord")
  private Object collateralUpdateActionTaskRecord = null;

  @SerializedName("updateResponseRecord")
  private Object updateResponseRecord = null;

  public InlineResponse20023 customerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
    return this;
  }

   /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }

  public InlineResponse20023 collateralInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCollateralInstanceRecord collateralInstanceRecord) {
    this.collateralInstanceRecord = collateralInstanceRecord;
    return this;
  }

   /**
   * Get collateralInstanceRecord
   * @return collateralInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCollateralInstanceRecord getCollateralInstanceRecord() {
    return collateralInstanceRecord;
  }

  public void setCollateralInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceidcollateralbqreferenceidupdateCollateralInstanceRecord collateralInstanceRecord) {
    this.collateralInstanceRecord = collateralInstanceRecord;
  }

  public InlineResponse20023 collateralUpdateActionTaskReference(String collateralUpdateActionTaskReference) {
    this.collateralUpdateActionTaskReference = collateralUpdateActionTaskReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return collateralUpdateActionTaskReference
  **/
  @Schema(example = "CUATR766676", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call ")
  public String getCollateralUpdateActionTaskReference() {
    return collateralUpdateActionTaskReference;
  }

  public void setCollateralUpdateActionTaskReference(String collateralUpdateActionTaskReference) {
    this.collateralUpdateActionTaskReference = collateralUpdateActionTaskReference;
  }

  public InlineResponse20023 collateralUpdateActionTaskRecord(Object collateralUpdateActionTaskRecord) {
    this.collateralUpdateActionTaskRecord = collateralUpdateActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return collateralUpdateActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")
  public Object getCollateralUpdateActionTaskRecord() {
    return collateralUpdateActionTaskRecord;
  }

  public void setCollateralUpdateActionTaskRecord(Object collateralUpdateActionTaskRecord) {
    this.collateralUpdateActionTaskRecord = collateralUpdateActionTaskRecord;
  }

  public InlineResponse20023 updateResponseRecord(Object updateResponseRecord) {
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
    InlineResponse20023 inlineResponse20023 = (InlineResponse20023) o;
    return Objects.equals(this.customerOfferProcedureInstanceRecord, inlineResponse20023.customerOfferProcedureInstanceRecord) &&
        Objects.equals(this.collateralInstanceRecord, inlineResponse20023.collateralInstanceRecord) &&
        Objects.equals(this.collateralUpdateActionTaskReference, inlineResponse20023.collateralUpdateActionTaskReference) &&
        Objects.equals(this.collateralUpdateActionTaskRecord, inlineResponse20023.collateralUpdateActionTaskRecord) &&
        Objects.equals(this.updateResponseRecord, inlineResponse20023.updateResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedureInstanceRecord, collateralInstanceRecord, collateralUpdateActionTaskReference, collateralUpdateActionTaskRecord, updateResponseRecord);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20023 {\n");
    
    sb.append("    customerOfferProcedureInstanceRecord: ").append(toIndentedString(customerOfferProcedureInstanceRecord)).append("\n");
    sb.append("    collateralInstanceRecord: ").append(toIndentedString(collateralInstanceRecord)).append("\n");
    sb.append("    collateralUpdateActionTaskReference: ").append(toIndentedString(collateralUpdateActionTaskReference)).append("\n");
    sb.append("    collateralUpdateActionTaskRecord: ").append(toIndentedString(collateralUpdateActionTaskRecord)).append("\n");
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