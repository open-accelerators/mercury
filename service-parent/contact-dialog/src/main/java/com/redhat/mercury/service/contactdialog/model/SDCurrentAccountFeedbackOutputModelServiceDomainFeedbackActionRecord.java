package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCurrentAccountFeedbackOutputModelServiceDomainFeedbackActionRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class SDCurrentAccountFeedbackOutputModelServiceDomainFeedbackActionRecord   {
  @JsonProperty("feedbackRecordDateTime")
  private String feedbackRecordDateTime;

  @JsonProperty("feedbackRecordStatus")
  private String feedbackRecordStatus;

  @JsonProperty("employeeBusinessUnitReference")
  private String employeeBusinessUnitReference;

  public SDCurrentAccountFeedbackOutputModelServiceDomainFeedbackActionRecord feedbackRecordDateTime(String feedbackRecordDateTime) {
    this.feedbackRecordDateTime = feedbackRecordDateTime;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date/time the feedback submitted for consideration 
   * @return feedbackRecordDateTime
  */
  @ApiModelProperty(example = "09-22-2018", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date/time the feedback submitted for consideration ")


  public String getFeedbackRecordDateTime() {
    return feedbackRecordDateTime;
  }

  public void setFeedbackRecordDateTime(String feedbackRecordDateTime) {
    this.feedbackRecordDateTime = feedbackRecordDateTime;
  }

  public SDCurrentAccountFeedbackOutputModelServiceDomainFeedbackActionRecord feedbackRecordStatus(String feedbackRecordStatus) {
    this.feedbackRecordStatus = feedbackRecordStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of processing the feedback e.g. received, considered, responded to 
   * @return feedbackRecordStatus
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of processing the feedback e.g. received, considered, responded to ")


  public String getFeedbackRecordStatus() {
    return feedbackRecordStatus;
  }

  public void setFeedbackRecordStatus(String feedbackRecordStatus) {
    this.feedbackRecordStatus = feedbackRecordStatus;
  }

  public SDCurrentAccountFeedbackOutputModelServiceDomainFeedbackActionRecord employeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to business unit/employee responsible for handling feedback 
   * @return employeeBusinessUnitReference
  */
  @ApiModelProperty(example = "769031", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to business unit/employee responsible for handling feedback ")


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
    SDCurrentAccountFeedbackOutputModelServiceDomainFeedbackActionRecord sdCurrentAccountFeedbackOutputModelServiceDomainFeedbackActionRecord = (SDCurrentAccountFeedbackOutputModelServiceDomainFeedbackActionRecord) o;
    return Objects.equals(this.feedbackRecordDateTime, sdCurrentAccountFeedbackOutputModelServiceDomainFeedbackActionRecord.feedbackRecordDateTime) &&
        Objects.equals(this.feedbackRecordStatus, sdCurrentAccountFeedbackOutputModelServiceDomainFeedbackActionRecord.feedbackRecordStatus) &&
        Objects.equals(this.employeeBusinessUnitReference, sdCurrentAccountFeedbackOutputModelServiceDomainFeedbackActionRecord.employeeBusinessUnitReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackRecordDateTime, feedbackRecordStatus, employeeBusinessUnitReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCurrentAccountFeedbackOutputModelServiceDomainFeedbackActionRecord {\n");
    
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

