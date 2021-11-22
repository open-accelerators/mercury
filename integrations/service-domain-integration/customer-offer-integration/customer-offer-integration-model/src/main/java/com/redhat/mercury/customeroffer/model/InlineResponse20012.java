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
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedurecrreferenceiddisclosuresbqreferenceidupdateCustomerOfferProcedureInstanceRecord;
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedurecrreferenceiddisclosuresbqreferenceidupdateDisclosuresInstanceRecord;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse20012
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class InlineResponse20012 {
  @SerializedName("customerOfferProcedureInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceiddisclosuresbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  @SerializedName("disclosuresInstanceRecord")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceiddisclosuresbqreferenceidupdateDisclosuresInstanceRecord disclosuresInstanceRecord = null;

  @SerializedName("disclosuresUpdateActionTaskReference")
  private String disclosuresUpdateActionTaskReference = null;

  @SerializedName("disclosuresUpdateActionTaskRecord")
  private Object disclosuresUpdateActionTaskRecord = null;

  @SerializedName("updateResponseRecord")
  private Object updateResponseRecord = null;

  public InlineResponse20012 customerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceiddisclosuresbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
    return this;
  }

   /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceiddisclosuresbqreferenceidupdateCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceiddisclosuresbqreferenceidupdateCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }

  public InlineResponse20012 disclosuresInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceiddisclosuresbqreferenceidupdateDisclosuresInstanceRecord disclosuresInstanceRecord) {
    this.disclosuresInstanceRecord = disclosuresInstanceRecord;
    return this;
  }

   /**
   * Get disclosuresInstanceRecord
   * @return disclosuresInstanceRecord
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceiddisclosuresbqreferenceidupdateDisclosuresInstanceRecord getDisclosuresInstanceRecord() {
    return disclosuresInstanceRecord;
  }

  public void setDisclosuresInstanceRecord(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceiddisclosuresbqreferenceidupdateDisclosuresInstanceRecord disclosuresInstanceRecord) {
    this.disclosuresInstanceRecord = disclosuresInstanceRecord;
  }

  public InlineResponse20012 disclosuresUpdateActionTaskReference(String disclosuresUpdateActionTaskReference) {
    this.disclosuresUpdateActionTaskReference = disclosuresUpdateActionTaskReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return disclosuresUpdateActionTaskReference
  **/
  @Schema(example = "DUATR721912", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call ")
  public String getDisclosuresUpdateActionTaskReference() {
    return disclosuresUpdateActionTaskReference;
  }

  public void setDisclosuresUpdateActionTaskReference(String disclosuresUpdateActionTaskReference) {
    this.disclosuresUpdateActionTaskReference = disclosuresUpdateActionTaskReference;
  }

  public InlineResponse20012 disclosuresUpdateActionTaskRecord(Object disclosuresUpdateActionTaskRecord) {
    this.disclosuresUpdateActionTaskRecord = disclosuresUpdateActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return disclosuresUpdateActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")
  public Object getDisclosuresUpdateActionTaskRecord() {
    return disclosuresUpdateActionTaskRecord;
  }

  public void setDisclosuresUpdateActionTaskRecord(Object disclosuresUpdateActionTaskRecord) {
    this.disclosuresUpdateActionTaskRecord = disclosuresUpdateActionTaskRecord;
  }

  public InlineResponse20012 updateResponseRecord(Object updateResponseRecord) {
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
    InlineResponse20012 inlineResponse20012 = (InlineResponse20012) o;
    return Objects.equals(this.customerOfferProcedureInstanceRecord, inlineResponse20012.customerOfferProcedureInstanceRecord) &&
        Objects.equals(this.disclosuresInstanceRecord, inlineResponse20012.disclosuresInstanceRecord) &&
        Objects.equals(this.disclosuresUpdateActionTaskReference, inlineResponse20012.disclosuresUpdateActionTaskReference) &&
        Objects.equals(this.disclosuresUpdateActionTaskRecord, inlineResponse20012.disclosuresUpdateActionTaskRecord) &&
        Objects.equals(this.updateResponseRecord, inlineResponse20012.updateResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedureInstanceRecord, disclosuresInstanceRecord, disclosuresUpdateActionTaskReference, disclosuresUpdateActionTaskRecord, updateResponseRecord);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012 {\n");
    
    sb.append("    customerOfferProcedureInstanceRecord: ").append(toIndentedString(customerOfferProcedureInstanceRecord)).append("\n");
    sb.append("    disclosuresInstanceRecord: ").append(toIndentedString(disclosuresInstanceRecord)).append("\n");
    sb.append("    disclosuresUpdateActionTaskReference: ").append(toIndentedString(disclosuresUpdateActionTaskReference)).append("\n");
    sb.append("    disclosuresUpdateActionTaskRecord: ").append(toIndentedString(disclosuresUpdateActionTaskRecord)).append("\n");
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