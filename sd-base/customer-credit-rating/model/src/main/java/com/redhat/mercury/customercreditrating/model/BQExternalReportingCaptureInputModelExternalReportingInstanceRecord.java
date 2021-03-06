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
 * BQExternalReportingCaptureInputModelExternalReportingInstanceRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-03T16:36:13.702891+02:00[Europe/Madrid]")
public class BQExternalReportingCaptureInputModelExternalReportingInstanceRecord {
  @SerializedName("ratingAgencyReportSchedule")
  private String ratingAgencyReportSchedule = null;

  @SerializedName("ratingAgencyCreditReportType")
  private String ratingAgencyCreditReportType = null;

  @SerializedName("ratingAgencyCreditReportDate")
  private String ratingAgencyCreditReportDate = null;

  public BQExternalReportingCaptureInputModelExternalReportingInstanceRecord ratingAgencyReportSchedule(String ratingAgencyReportSchedule) {
    this.ratingAgencyReportSchedule = ratingAgencyReportSchedule;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule for the upload of the data file/report from the external agency (can be ad-hoc) 
   * @return ratingAgencyReportSchedule
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule for the upload of the data file/report from the external agency (can be ad-hoc) ")
  public String getRatingAgencyReportSchedule() {
    return ratingAgencyReportSchedule;
  }

  public void setRatingAgencyReportSchedule(String ratingAgencyReportSchedule) {
    this.ratingAgencyReportSchedule = ratingAgencyReportSchedule;
  }

  public BQExternalReportingCaptureInputModelExternalReportingInstanceRecord ratingAgencyCreditReportType(String ratingAgencyCreditReportType) {
    this.ratingAgencyCreditReportType = ratingAgencyCreditReportType;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: Defines the type of credit assessment report provided (e.g. reference check, credit score, long/short form credit report) 
   * @return ratingAgencyCreditReportType
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: Defines the type of credit assessment report provided (e.g. reference check, credit score, long/short form credit report) ")
  public String getRatingAgencyCreditReportType() {
    return ratingAgencyCreditReportType;
  }

  public void setRatingAgencyCreditReportType(String ratingAgencyCreditReportType) {
    this.ratingAgencyCreditReportType = ratingAgencyCreditReportType;
  }

  public BQExternalReportingCaptureInputModelExternalReportingInstanceRecord ratingAgencyCreditReportDate(String ratingAgencyCreditReportDate) {
    this.ratingAgencyCreditReportDate = ratingAgencyCreditReportDate;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date time the credit report was downloaded (content will define refresh history) 
   * @return ratingAgencyCreditReportDate
  **/
  @Schema(example = "09-22-2018", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date time the credit report was downloaded (content will define refresh history) ")
  public String getRatingAgencyCreditReportDate() {
    return ratingAgencyCreditReportDate;
  }

  public void setRatingAgencyCreditReportDate(String ratingAgencyCreditReportDate) {
    this.ratingAgencyCreditReportDate = ratingAgencyCreditReportDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQExternalReportingCaptureInputModelExternalReportingInstanceRecord bqExternalReportingCaptureInputModelExternalReportingInstanceRecord = (BQExternalReportingCaptureInputModelExternalReportingInstanceRecord) o;
    return Objects.equals(this.ratingAgencyReportSchedule, bqExternalReportingCaptureInputModelExternalReportingInstanceRecord.ratingAgencyReportSchedule) &&
        Objects.equals(this.ratingAgencyCreditReportType, bqExternalReportingCaptureInputModelExternalReportingInstanceRecord.ratingAgencyCreditReportType) &&
        Objects.equals(this.ratingAgencyCreditReportDate, bqExternalReportingCaptureInputModelExternalReportingInstanceRecord.ratingAgencyCreditReportDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratingAgencyReportSchedule, ratingAgencyCreditReportType, ratingAgencyCreditReportDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQExternalReportingCaptureInputModelExternalReportingInstanceRecord {\n");
    
    sb.append("    ratingAgencyReportSchedule: ").append(toIndentedString(ratingAgencyReportSchedule)).append("\n");
    sb.append("    ratingAgencyCreditReportType: ").append(toIndentedString(ratingAgencyCreditReportType)).append("\n");
    sb.append("    ratingAgencyCreditReportDate: ").append(toIndentedString(ratingAgencyCreditReportDate)).append("\n");
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
