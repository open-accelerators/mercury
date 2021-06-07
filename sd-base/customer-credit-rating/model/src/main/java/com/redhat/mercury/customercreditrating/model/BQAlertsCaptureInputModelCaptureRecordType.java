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
 * BQAlertsCaptureInputModelCaptureRecordType
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-03T16:36:13.702891+02:00[Europe/Madrid]")
public class BQAlertsCaptureInputModelCaptureRecordType {
  @SerializedName("captureInputRecord")
  private Object captureInputRecord = null;

  public BQAlertsCaptureInputModelCaptureRecordType captureInputRecord(Object captureInputRecord) {
    this.captureInputRecord = captureInputRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Structured input transaction/record (e.g. timesheet, event record, account posting) 
   * @return captureInputRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Structured input transaction/record (e.g. timesheet, event record, account posting) ")
  public Object getCaptureInputRecord() {
    return captureInputRecord;
  }

  public void setCaptureInputRecord(Object captureInputRecord) {
    this.captureInputRecord = captureInputRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAlertsCaptureInputModelCaptureRecordType bqAlertsCaptureInputModelCaptureRecordType = (BQAlertsCaptureInputModelCaptureRecordType) o;
    return Objects.equals(this.captureInputRecord, bqAlertsCaptureInputModelCaptureRecordType.captureInputRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(captureInputRecord);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAlertsCaptureInputModelCaptureRecordType {\n");
    
    sb.append("    captureInputRecord: ").append(toIndentedString(captureInputRecord)).append("\n");
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