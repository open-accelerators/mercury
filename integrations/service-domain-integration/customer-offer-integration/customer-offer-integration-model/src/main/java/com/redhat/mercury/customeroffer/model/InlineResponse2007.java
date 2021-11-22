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
import com.redhat.mercury.customeroffer.model.CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecord1;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse2007
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class InlineResponse2007 {
  @SerializedName("customerOfferProcedureInstanceRecord")
  private CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecord1 customerOfferProcedureInstanceRecord = null;

  @SerializedName("customerOfferProcedureRequestActionTaskReference")
  private String customerOfferProcedureRequestActionTaskReference = null;

  @SerializedName("customerOfferProcedureRequestActionTaskRecord")
  private Object customerOfferProcedureRequestActionTaskRecord = null;

  @SerializedName("requestRecordReference")
  private String requestRecordReference = null;

  @SerializedName("requestResponseRecord")
  private Object requestResponseRecord = null;

  public InlineResponse2007 customerOfferProcedureInstanceRecord(CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecord1 customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
    return this;
  }

   /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/
  @Schema(description = "")
  public CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecord1 getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecord1 customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }

  public InlineResponse2007 customerOfferProcedureRequestActionTaskReference(String customerOfferProcedureRequestActionTaskReference) {
    this.customerOfferProcedureRequestActionTaskReference = customerOfferProcedureRequestActionTaskReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Offer Procedure instance request service call 
   * @return customerOfferProcedureRequestActionTaskReference
  **/
  @Schema(example = "COPRATR734822", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Offer Procedure instance request service call ")
  public String getCustomerOfferProcedureRequestActionTaskReference() {
    return customerOfferProcedureRequestActionTaskReference;
  }

  public void setCustomerOfferProcedureRequestActionTaskReference(String customerOfferProcedureRequestActionTaskReference) {
    this.customerOfferProcedureRequestActionTaskReference = customerOfferProcedureRequestActionTaskReference;
  }

  public InlineResponse2007 customerOfferProcedureRequestActionTaskRecord(Object customerOfferProcedureRequestActionTaskRecord) {
    this.customerOfferProcedureRequestActionTaskRecord = customerOfferProcedureRequestActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerOfferProcedureRequestActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record ")
  public Object getCustomerOfferProcedureRequestActionTaskRecord() {
    return customerOfferProcedureRequestActionTaskRecord;
  }

  public void setCustomerOfferProcedureRequestActionTaskRecord(Object customerOfferProcedureRequestActionTaskRecord) {
    this.customerOfferProcedureRequestActionTaskRecord = customerOfferProcedureRequestActionTaskRecord;
  }

  public InlineResponse2007 requestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/
  @Schema(example = "RRR736011", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record ")
  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }

  public InlineResponse2007 requestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response ")
  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007 inlineResponse2007 = (InlineResponse2007) o;
    return Objects.equals(this.customerOfferProcedureInstanceRecord, inlineResponse2007.customerOfferProcedureInstanceRecord) &&
        Objects.equals(this.customerOfferProcedureRequestActionTaskReference, inlineResponse2007.customerOfferProcedureRequestActionTaskReference) &&
        Objects.equals(this.customerOfferProcedureRequestActionTaskRecord, inlineResponse2007.customerOfferProcedureRequestActionTaskRecord) &&
        Objects.equals(this.requestRecordReference, inlineResponse2007.requestRecordReference) &&
        Objects.equals(this.requestResponseRecord, inlineResponse2007.requestResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcedureInstanceRecord, customerOfferProcedureRequestActionTaskReference, customerOfferProcedureRequestActionTaskRecord, requestRecordReference, requestResponseRecord);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007 {\n");
    
    sb.append("    customerOfferProcedureInstanceRecord: ").append(toIndentedString(customerOfferProcedureInstanceRecord)).append("\n");
    sb.append("    customerOfferProcedureRequestActionTaskReference: ").append(toIndentedString(customerOfferProcedureRequestActionTaskReference)).append("\n");
    sb.append("    customerOfferProcedureRequestActionTaskRecord: ").append(toIndentedString(customerOfferProcedureRequestActionTaskRecord)).append("\n");
    sb.append("    requestRecordReference: ").append(toIndentedString(requestRecordReference)).append("\n");
    sb.append("    requestResponseRecord: ").append(toIndentedString(requestResponseRecord)).append("\n");
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