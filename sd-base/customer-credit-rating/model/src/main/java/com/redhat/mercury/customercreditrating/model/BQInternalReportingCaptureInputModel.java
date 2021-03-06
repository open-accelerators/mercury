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
 * BQInternalReportingCaptureInputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-03T16:36:13.702891+02:00[Europe/Madrid]")
public class BQInternalReportingCaptureInputModel {
  @SerializedName("customerCreditRatingStateInstanceRecord")
  private Object customerCreditRatingStateInstanceRecord = null;

  @SerializedName("customerCreditRatingStateInstanceReference")
  private String customerCreditRatingStateInstanceReference = null;

  @SerializedName("internalReportingInstanceReference")
  private String internalReportingInstanceReference = null;

  @SerializedName("internalReportingInstanceRecord")
  private Object internalReportingInstanceRecord = null;

  @SerializedName("internalReportingCaptureActionTaskRecord")
  private Object internalReportingCaptureActionTaskRecord = null;

  @SerializedName("captureRecordType")
  private Object captureRecordType = null;

  public BQInternalReportingCaptureInputModel customerCreditRatingStateInstanceRecord(Object customerCreditRatingStateInstanceRecord) {
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

  public BQInternalReportingCaptureInputModel customerCreditRatingStateInstanceReference(String customerCreditRatingStateInstanceReference) {
    this.customerCreditRatingStateInstanceReference = customerCreditRatingStateInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Credit Rating State instance 
   * @return customerCreditRatingStateInstanceReference
  **/
  @Schema(example = "CCRSIR704800", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Credit Rating State instance ")
  public String getCustomerCreditRatingStateInstanceReference() {
    return customerCreditRatingStateInstanceReference;
  }

  public void setCustomerCreditRatingStateInstanceReference(String customerCreditRatingStateInstanceReference) {
    this.customerCreditRatingStateInstanceReference = customerCreditRatingStateInstanceReference;
  }

  public BQInternalReportingCaptureInputModel internalReportingInstanceReference(String internalReportingInstanceReference) {
    this.internalReportingInstanceReference = internalReportingInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Internal Reporting instance 
   * @return internalReportingInstanceReference
  **/
  @Schema(example = "IRIR766702", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Internal Reporting instance ")
  public String getInternalReportingInstanceReference() {
    return internalReportingInstanceReference;
  }

  public void setInternalReportingInstanceReference(String internalReportingInstanceReference) {
    this.internalReportingInstanceReference = internalReportingInstanceReference;
  }

  public BQInternalReportingCaptureInputModel internalReportingInstanceRecord(Object internalReportingInstanceRecord) {
    this.internalReportingInstanceRecord = internalReportingInstanceRecord;
    return this;
  }

   /**
   * Get internalReportingInstanceRecord
   * @return internalReportingInstanceRecord
  **/
  @Schema(description = "")
  public Object getInternalReportingInstanceRecord() {
    return internalReportingInstanceRecord;
  }

  public void setInternalReportingInstanceRecord(Object internalReportingInstanceRecord) {
    this.internalReportingInstanceRecord = internalReportingInstanceRecord;
  }

  public BQInternalReportingCaptureInputModel internalReportingCaptureActionTaskRecord(Object internalReportingCaptureActionTaskRecord) {
    this.internalReportingCaptureActionTaskRecord = internalReportingCaptureActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return internalReportingCaptureActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record ")
  public Object getInternalReportingCaptureActionTaskRecord() {
    return internalReportingCaptureActionTaskRecord;
  }

  public void setInternalReportingCaptureActionTaskRecord(Object internalReportingCaptureActionTaskRecord) {
    this.internalReportingCaptureActionTaskRecord = internalReportingCaptureActionTaskRecord;
  }

  public BQInternalReportingCaptureInputModel captureRecordType(Object captureRecordType) {
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
    BQInternalReportingCaptureInputModel bqInternalReportingCaptureInputModel = (BQInternalReportingCaptureInputModel) o;
    return Objects.equals(this.customerCreditRatingStateInstanceRecord, bqInternalReportingCaptureInputModel.customerCreditRatingStateInstanceRecord) &&
        Objects.equals(this.customerCreditRatingStateInstanceReference, bqInternalReportingCaptureInputModel.customerCreditRatingStateInstanceReference) &&
        Objects.equals(this.internalReportingInstanceReference, bqInternalReportingCaptureInputModel.internalReportingInstanceReference) &&
        Objects.equals(this.internalReportingInstanceRecord, bqInternalReportingCaptureInputModel.internalReportingInstanceRecord) &&
        Objects.equals(this.internalReportingCaptureActionTaskRecord, bqInternalReportingCaptureInputModel.internalReportingCaptureActionTaskRecord) &&
        Objects.equals(this.captureRecordType, bqInternalReportingCaptureInputModel.captureRecordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCreditRatingStateInstanceRecord, customerCreditRatingStateInstanceReference, internalReportingInstanceReference, internalReportingInstanceRecord, internalReportingCaptureActionTaskRecord, captureRecordType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQInternalReportingCaptureInputModel {\n");
    
    sb.append("    customerCreditRatingStateInstanceRecord: ").append(toIndentedString(customerCreditRatingStateInstanceRecord)).append("\n");
    sb.append("    customerCreditRatingStateInstanceReference: ").append(toIndentedString(customerCreditRatingStateInstanceReference)).append("\n");
    sb.append("    internalReportingInstanceReference: ").append(toIndentedString(internalReportingInstanceReference)).append("\n");
    sb.append("    internalReportingInstanceRecord: ").append(toIndentedString(internalReportingInstanceRecord)).append("\n");
    sb.append("    internalReportingCaptureActionTaskRecord: ").append(toIndentedString(internalReportingCaptureActionTaskRecord)).append("\n");
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
