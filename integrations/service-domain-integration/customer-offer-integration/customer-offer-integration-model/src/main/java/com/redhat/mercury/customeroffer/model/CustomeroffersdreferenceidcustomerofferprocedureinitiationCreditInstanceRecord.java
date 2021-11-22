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
 * CustomeroffersdreferenceidcustomerofferprocedureinitiationCreditInstanceRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class CustomeroffersdreferenceidcustomerofferprocedureinitiationCreditInstanceRecord {
  @SerializedName("customerCreditRating")
  private String customerCreditRating = null;

  public CustomeroffersdreferenceidcustomerofferprocedureinitiationCreditInstanceRecord customerCreditRating(String customerCreditRating) {
    this.customerCreditRating = customerCreditRating;
    return this;
  }

   /**
   * &#x60;status: Registered&#x60;  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FQCvV8TGEeChad0JzLk7QA_1351565206  bian-reference: CustomerOffer.TagetCustomer.CustomerRating (as CustomerCreditRating)  general-info: The customer&#x27;s current credit rating 
   * @return customerCreditRating
  **/
  @Schema(description = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FQCvV8TGEeChad0JzLk7QA_1351565206  bian-reference: CustomerOffer.TagetCustomer.CustomerRating (as CustomerCreditRating)  general-info: The customer's current credit rating ")
  public String getCustomerCreditRating() {
    return customerCreditRating;
  }

  public void setCustomerCreditRating(String customerCreditRating) {
    this.customerCreditRating = customerCreditRating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomeroffersdreferenceidcustomerofferprocedureinitiationCreditInstanceRecord customeroffersdreferenceidcustomerofferprocedureinitiationCreditInstanceRecord = (CustomeroffersdreferenceidcustomerofferprocedureinitiationCreditInstanceRecord) o;
    return Objects.equals(this.customerCreditRating, customeroffersdreferenceidcustomerofferprocedureinitiationCreditInstanceRecord.customerCreditRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCreditRating);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomeroffersdreferenceidcustomerofferprocedureinitiationCreditInstanceRecord {\n");
    
    sb.append("    customerCreditRating: ").append(toIndentedString(customerCreditRating)).append("\n");
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