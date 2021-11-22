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
 * BQComplianceRetrieveOutputModelCustomerOfferProcedureInstanceRecord1CustomerOfferProcessingTask
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-11-19T11:10:08.827631+01:00[Europe/Madrid]")
public class BQComplianceRetrieveOutputModelCustomerOfferProcedureInstanceRecord1CustomerOfferProcessingTask {
  @SerializedName("customerOfferProcessingTaskType")
  private String customerOfferProcessingTaskType = null;

  @SerializedName("employeeBusinessUnitReference")
  private String employeeBusinessUnitReference = null;

  @SerializedName("customerOfferProcessingTaskWorkProducts")
  private String customerOfferProcessingTaskWorkProducts = null;

  @SerializedName("customerOfferProcessingTaskResult")
  private String customerOfferProcessingTaskResult = null;

  public BQComplianceRetrieveOutputModelCustomerOfferProcedureInstanceRecord1CustomerOfferProcessingTask customerOfferProcessingTaskType(String customerOfferProcessingTaskType) {
    this.customerOfferProcessingTaskType = customerOfferProcessingTaskType;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of task performed (each BQ constitutes an optional task instance) 
   * @return customerOfferProcessingTaskType
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of task performed (each BQ constitutes an optional task instance) ")
  public String getCustomerOfferProcessingTaskType() {
    return customerOfferProcessingTaskType;
  }

  public void setCustomerOfferProcessingTaskType(String customerOfferProcessingTaskType) {
    this.customerOfferProcessingTaskType = customerOfferProcessingTaskType;
  }

  public BQComplianceRetrieveOutputModelCustomerOfferProcedureInstanceRecord1CustomerOfferProcessingTask employeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Employees involved in completing the offer task 
   * @return employeeBusinessUnitReference
  **/
  @Schema(example = "756506", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Employees involved in completing the offer task ")
  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }

  public BQComplianceRetrieveOutputModelCustomerOfferProcedureInstanceRecord1CustomerOfferProcessingTask customerOfferProcessingTaskWorkProducts(String customerOfferProcessingTaskWorkProducts) {
    this.customerOfferProcessingTaskWorkProducts = customerOfferProcessingTaskWorkProducts;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the analysis 
   * @return customerOfferProcessingTaskWorkProducts
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the analysis ")
  public String getCustomerOfferProcessingTaskWorkProducts() {
    return customerOfferProcessingTaskWorkProducts;
  }

  public void setCustomerOfferProcessingTaskWorkProducts(String customerOfferProcessingTaskWorkProducts) {
    this.customerOfferProcessingTaskWorkProducts = customerOfferProcessingTaskWorkProducts;
  }

  public BQComplianceRetrieveOutputModelCustomerOfferProcedureInstanceRecord1CustomerOfferProcessingTask customerOfferProcessingTaskResult(String customerOfferProcessingTaskResult) {
    this.customerOfferProcessingTaskResult = customerOfferProcessingTaskResult;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcome of the task (will be used to update the Customer Offer Procedure Instance Record) 
   * @return customerOfferProcessingTaskResult
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcome of the task (will be used to update the Customer Offer Procedure Instance Record) ")
  public String getCustomerOfferProcessingTaskResult() {
    return customerOfferProcessingTaskResult;
  }

  public void setCustomerOfferProcessingTaskResult(String customerOfferProcessingTaskResult) {
    this.customerOfferProcessingTaskResult = customerOfferProcessingTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQComplianceRetrieveOutputModelCustomerOfferProcedureInstanceRecord1CustomerOfferProcessingTask bqComplianceRetrieveOutputModelCustomerOfferProcedureInstanceRecord1CustomerOfferProcessingTask = (BQComplianceRetrieveOutputModelCustomerOfferProcedureInstanceRecord1CustomerOfferProcessingTask) o;
    return Objects.equals(this.customerOfferProcessingTaskType, bqComplianceRetrieveOutputModelCustomerOfferProcedureInstanceRecord1CustomerOfferProcessingTask.customerOfferProcessingTaskType) &&
        Objects.equals(this.employeeBusinessUnitReference, bqComplianceRetrieveOutputModelCustomerOfferProcedureInstanceRecord1CustomerOfferProcessingTask.employeeBusinessUnitReference) &&
        Objects.equals(this.customerOfferProcessingTaskWorkProducts, bqComplianceRetrieveOutputModelCustomerOfferProcedureInstanceRecord1CustomerOfferProcessingTask.customerOfferProcessingTaskWorkProducts) &&
        Objects.equals(this.customerOfferProcessingTaskResult, bqComplianceRetrieveOutputModelCustomerOfferProcedureInstanceRecord1CustomerOfferProcessingTask.customerOfferProcessingTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOfferProcessingTaskType, employeeBusinessUnitReference, customerOfferProcessingTaskWorkProducts, customerOfferProcessingTaskResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQComplianceRetrieveOutputModelCustomerOfferProcedureInstanceRecord1CustomerOfferProcessingTask {\n");
    
    sb.append("    customerOfferProcessingTaskType: ").append(toIndentedString(customerOfferProcessingTaskType)).append("\n");
    sb.append("    employeeBusinessUnitReference: ").append(toIndentedString(employeeBusinessUnitReference)).append("\n");
    sb.append("    customerOfferProcessingTaskWorkProducts: ").append(toIndentedString(customerOfferProcessingTaskWorkProducts)).append("\n");
    sb.append("    customerOfferProcessingTaskResult: ").append(toIndentedString(customerOfferProcessingTaskResult)).append("\n");
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