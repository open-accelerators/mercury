/*
 * Account Recovery
 * This service domain handles the restructuring of a distressed account (loan) after standard recovery
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.redhat.mercury.accountrecovery.model;

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
 * SDAccountRecoveryFeedbackOutputModelServiceDomainFeedbackActionRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-07T18:27:41.474305+02:00[Europe/Madrid]")
public class SDAccountRecoveryFeedbackOutputModelServiceDomainFeedbackActionRecord {
  @SerializedName("feedbackRecordDateTime")
  private String feedbackRecordDateTime = null;

  @SerializedName("feedbackRecordStatus")
  private String feedbackRecordStatus = null;

  @SerializedName("employeeBusinessUnitReference")
  private String employeeBusinessUnitReference = null;

  public SDAccountRecoveryFeedbackOutputModelServiceDomainFeedbackActionRecord feedbackRecordDateTime(String feedbackRecordDateTime) {
    this.feedbackRecordDateTime = feedbackRecordDateTime;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date/time the feedback submitted for consideration 
   * @return feedbackRecordDateTime
  **/
  @Schema(example = "09-22-2018", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date/time the feedback submitted for consideration ")
  public String getFeedbackRecordDateTime() {
    return feedbackRecordDateTime;
  }

  public void setFeedbackRecordDateTime(String feedbackRecordDateTime) {
    this.feedbackRecordDateTime = feedbackRecordDateTime;
  }

  public SDAccountRecoveryFeedbackOutputModelServiceDomainFeedbackActionRecord feedbackRecordStatus(String feedbackRecordStatus) {
    this.feedbackRecordStatus = feedbackRecordStatus;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of processing the feedback e.g. received, considered, responded to 
   * @return feedbackRecordStatus
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of processing the feedback e.g. received, considered, responded to ")
  public String getFeedbackRecordStatus() {
    return feedbackRecordStatus;
  }

  public void setFeedbackRecordStatus(String feedbackRecordStatus) {
    this.feedbackRecordStatus = feedbackRecordStatus;
  }

  public SDAccountRecoveryFeedbackOutputModelServiceDomainFeedbackActionRecord employeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to business unit/employee responsible for handling feedback 
   * @return employeeBusinessUnitReference
  **/
  @Schema(example = "769031", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to business unit/employee responsible for handling feedback ")
  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDAccountRecoveryFeedbackOutputModelServiceDomainFeedbackActionRecord sdAccountRecoveryFeedbackOutputModelServiceDomainFeedbackActionRecord = (SDAccountRecoveryFeedbackOutputModelServiceDomainFeedbackActionRecord) o;
    return Objects.equals(this.feedbackRecordDateTime, sdAccountRecoveryFeedbackOutputModelServiceDomainFeedbackActionRecord.feedbackRecordDateTime) &&
        Objects.equals(this.feedbackRecordStatus, sdAccountRecoveryFeedbackOutputModelServiceDomainFeedbackActionRecord.feedbackRecordStatus) &&
        Objects.equals(this.employeeBusinessUnitReference, sdAccountRecoveryFeedbackOutputModelServiceDomainFeedbackActionRecord.employeeBusinessUnitReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackRecordDateTime, feedbackRecordStatus, employeeBusinessUnitReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDAccountRecoveryFeedbackOutputModelServiceDomainFeedbackActionRecord {\n");
    
    sb.append("    feedbackRecordDateTime: ").append(toIndentedString(feedbackRecordDateTime)).append("\n");
    sb.append("    feedbackRecordStatus: ").append(toIndentedString(feedbackRecordStatus)).append("\n");
    sb.append("    employeeBusinessUnitReference: ").append(toIndentedString(employeeBusinessUnitReference)).append("\n");
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
