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
import com.redhat.mercury.customeroffer.model.CustomeroffersdreferenceidcustomerofferprocedurecrreferenceiddisclosuresbqreferenceidupdateCustomerOfferProcedureInstanceRecordCustomerOfferProcessingTask;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BQDisclosuresUpdateInputModelCustomerOfferProcedureInstanceRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQDisclosuresUpdateInputModelCustomerOfferProcedureInstanceRecord {
  @SerializedName("customerOfferProcessingSchedule")
  private String customerOfferProcessingSchedule = null;

  @SerializedName("customerOfferProcessingTask")
  private CustomeroffersdreferenceidcustomerofferprocedurecrreferenceiddisclosuresbqreferenceidupdateCustomerOfferProcedureInstanceRecordCustomerOfferProcessingTask customerOfferProcessingTask = null;

  public BQDisclosuresUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcessingSchedule(String customerOfferProcessingSchedule) {
    this.customerOfferProcessingSchedule = customerOfferProcessingSchedule;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines scheduled update/review tasks covering all tracked properties 
   * @return customerOfferProcessingSchedule
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines scheduled update/review tasks covering all tracked properties ")
  public String getCustomerOfferProcessingSchedule() {
    return customerOfferProcessingSchedule;
  }

  public void setCustomerOfferProcessingSchedule(String customerOfferProcessingSchedule) {
    this.customerOfferProcessingSchedule = customerOfferProcessingSchedule;
  }

  public BQDisclosuresUpdateInputModelCustomerOfferProcedureInstanceRecord customerOfferProcessingTask(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceiddisclosuresbqreferenceidupdateCustomerOfferProcedureInstanceRecordCustomerOfferProcessingTask customerOfferProcessingTask) {
    this.customerOfferProcessingTask = customerOfferProcessingTask;
    return this;
  }

   /**
   * Get customerOfferProcessingTask
   * @return customerOfferProcessingTask
  **/
  @Schema(description = "")
  public CustomeroffersdreferenceidcustomerofferprocedurecrreferenceiddisclosuresbqreferenceidupdateCustomerOfferProcedureInstanceRecordCustomerOfferProcessingTask getCustomerOfferProcessingTask() {
    return customerOfferProcessingTask;
  }

  public void setCustomerOfferProcessingTask(CustomeroffersdreferenceidcustomerofferprocedurecrreferenceiddisclosuresbqreferenceidupdateCustomerOfferProcedureInstanceRecordCustomerOfferProcessingTask customerOfferProcessingTask) {
    this.customerOfferProcessingTask = customerOfferProcessingTask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQDisclosuresUpdateInputModelCustomerOfferProcedureInstanceRecord bqDisclosuresUpdateInputModelCustomerOfferProcedureInstanceRecord = (BQDisclosuresUpdateInputModelCustomerOfferProcedureInstanceRecord) o;
    return Objects.equals(this.customerOfferProcessingSchedule, bqDisclosuresUpdateInputModelCustomerOfferProcedureInstanceRecord.customerOfferProcessingSchedule) &&
        Objects.equals(this.customerOfferProcessingTask, bqDisclosuresUpdateInputModelCustomerOfferProcedureInstanceRecord.customerOfferProcessingTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcessingSchedule, customerOfferProcessingTask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQDisclosuresUpdateInputModelCustomerOfferProcedureInstanceRecord {\n");
    
    sb.append("    customerOfferProcessingSchedule: ").append(toIndentedString(customerOfferProcessingSchedule)).append("\n");
    sb.append("    customerOfferProcessingTask: ").append(toIndentedString(customerOfferProcessingTask)).append("\n");
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