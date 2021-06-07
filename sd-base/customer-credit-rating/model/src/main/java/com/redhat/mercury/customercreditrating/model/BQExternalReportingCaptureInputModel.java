/*
 * Customer Credit Rating
 * This service domain maintains and administers the bank's credit assessment for customers.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.redhat.mercury.customercreditrating.model;

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
 * BQExternalReportingCaptureInputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-03T16:36:13.702891+02:00[Europe/Madrid]")
public class BQExternalReportingCaptureInputModel {
  @SerializedName("customerCreditRatingStateInstanceRecord")
  private Object customerCreditRatingStateInstanceRecord = null;

  @SerializedName("customerCreditRatingStateInstanceReference")
  private String customerCreditRatingStateInstanceReference = null;

  @SerializedName("externalReportingInstanceReference")
  private String externalReportingInstanceReference = null;

  @SerializedName("externalReportingInstanceRecord")
  private Object externalReportingInstanceRecord = null;

  @SerializedName("externalReportingCaptureActionTaskRecord")
  private Object externalReportingCaptureActionTaskRecord = null;

  @SerializedName("captureRecordType")
  private Object captureRecordType = null;

  public BQExternalReportingCaptureInputModel customerCreditRatingStateInstanceRecord(Object customerCreditRatingStateInstanceRecord) {
    this.customerCreditRatingStateInstanceRecord = customerCreditRatingStateInstanceRecord;
    return this;
  }

   /**
   * Get customerCreditRatingStateInstanceRecord
   * @return customerCreditRatingStateInstanceRecord
  **/
  @Schema(description = "")
  public Object getCustomerCreditRatingStateInstanceRecord() {
    return customerCreditRatingStateInstanceRecord;
  }

  public void setCustomerCreditRatingStateInstanceRecord(Object customerCreditRatingStateInstanceRecord) {
    this.customerCreditRatingStateInstanceRecord = customerCreditRatingStateInstanceRecord;
  }

  public BQExternalReportingCaptureInputModel customerCreditRatingStateInstanceReference(String customerCreditRatingStateInstanceReference) {
    this.customerCreditRatingStateInstanceReference = customerCreditRatingStateInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Credit Rating State instance 
   * @return customerCreditRatingStateInstanceReference
  **/
  @Schema(example = "CCRSIR731177", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Credit Rating State instance ")
  public String getCustomerCreditRatingStateInstanceReference() {
    return customerCreditRatingStateInstanceReference;
  }

  public void setCustomerCreditRatingStateInstanceReference(String customerCreditRatingStateInstanceReference) {
    this.customerCreditRatingStateInstanceReference = customerCreditRatingStateInstanceReference;
  }

  public BQExternalReportingCaptureInputModel externalReportingInstanceReference(String externalReportingInstanceReference) {
    this.externalReportingInstanceReference = externalReportingInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the External Reporting instance 
   * @return externalReportingInstanceReference
  **/
  @Schema(example = "ERIR710038", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the External Reporting instance ")
  public String getExternalReportingInstanceReference() {
    return externalReportingInstanceReference;
  }

  public void setExternalReportingInstanceReference(String externalReportingInstanceReference) {
    this.externalReportingInstanceReference = externalReportingInstanceReference;
  }

  public BQExternalReportingCaptureInputModel externalReportingInstanceRecord(Object externalReportingInstanceRecord) {
    this.externalReportingInstanceRecord = externalReportingInstanceRecord;
    return this;
  }

   /**
   * Get externalReportingInstanceRecord
   * @return externalReportingInstanceRecord
  **/
  @Schema(description = "")
  public Object getExternalReportingInstanceRecord() {
    return externalReportingInstanceRecord;
  }

  public void setExternalReportingInstanceRecord(Object externalReportingInstanceRecord) {
    this.externalReportingInstanceRecord = externalReportingInstanceRecord;
  }

  public BQExternalReportingCaptureInputModel externalReportingCaptureActionTaskRecord(Object externalReportingCaptureActionTaskRecord) {
    this.externalReportingCaptureActionTaskRecord = externalReportingCaptureActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return externalReportingCaptureActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record ")
  public Object getExternalReportingCaptureActionTaskRecord() {
    return externalReportingCaptureActionTaskRecord;
  }

  public void setExternalReportingCaptureActionTaskRecord(Object externalReportingCaptureActionTaskRecord) {
    this.externalReportingCaptureActionTaskRecord = externalReportingCaptureActionTaskRecord;
  }

  public BQExternalReportingCaptureInputModel captureRecordType(Object captureRecordType) {
    this.captureRecordType = captureRecordType;
    return this;
  }

   /**
   * Get captureRecordType
   * @return captureRecordType
  **/
  @Schema(description = "")
  public Object getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(Object captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQExternalReportingCaptureInputModel bqExternalReportingCaptureInputModel = (BQExternalReportingCaptureInputModel) o;
    return Objects.equals(this.customerCreditRatingStateInstanceRecord, bqExternalReportingCaptureInputModel.customerCreditRatingStateInstanceRecord) &&
        Objects.equals(this.customerCreditRatingStateInstanceReference, bqExternalReportingCaptureInputModel.customerCreditRatingStateInstanceReference) &&
        Objects.equals(this.externalReportingInstanceReference, bqExternalReportingCaptureInputModel.externalReportingInstanceReference) &&
        Objects.equals(this.externalReportingInstanceRecord, bqExternalReportingCaptureInputModel.externalReportingInstanceRecord) &&
        Objects.equals(this.externalReportingCaptureActionTaskRecord, bqExternalReportingCaptureInputModel.externalReportingCaptureActionTaskRecord) &&
        Objects.equals(this.captureRecordType, bqExternalReportingCaptureInputModel.captureRecordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCreditRatingStateInstanceRecord, customerCreditRatingStateInstanceReference, externalReportingInstanceReference, externalReportingInstanceRecord, externalReportingCaptureActionTaskRecord, captureRecordType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQExternalReportingCaptureInputModel {\n");
    
    sb.append("    customerCreditRatingStateInstanceRecord: ").append(toIndentedString(customerCreditRatingStateInstanceRecord)).append("\n");
    sb.append("    customerCreditRatingStateInstanceReference: ").append(toIndentedString(customerCreditRatingStateInstanceReference)).append("\n");
    sb.append("    externalReportingInstanceReference: ").append(toIndentedString(externalReportingInstanceReference)).append("\n");
    sb.append("    externalReportingInstanceRecord: ").append(toIndentedString(externalReportingInstanceRecord)).append("\n");
    sb.append("    externalReportingCaptureActionTaskRecord: ").append(toIndentedString(externalReportingCaptureActionTaskRecord)).append("\n");
    sb.append("    captureRecordType: ").append(toIndentedString(captureRecordType)).append("\n");
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