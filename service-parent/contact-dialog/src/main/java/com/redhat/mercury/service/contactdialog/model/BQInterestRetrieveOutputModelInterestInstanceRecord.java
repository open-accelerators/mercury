package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2006InterestInstanceRecordInterestApplicationRecord;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2006InterestInstanceRecordInterestRateConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQInterestRetrieveOutputModelInterestInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class BQInterestRetrieveOutputModelInterestInstanceRecord   {
  @JsonProperty("interestRateType")
  private String interestRateType;

  @JsonProperty("interestRateApplicationSchedule")
  private String interestRateApplicationSchedule;

  @JsonProperty("interestRateConfiguration")
  private InlineResponse2006InterestInstanceRecordInterestRateConfiguration interestRateConfiguration;

  @JsonProperty("interestApplicationRecord")
  private InlineResponse2006InterestInstanceRecordInterestApplicationRecord interestApplicationRecord;

  public BQInterestRetrieveOutputModelInterestInstanceRecord interestRateType(String interestRateType) {
    this.interestRateType = interestRateType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of rate calculation that can be applied 
   * @return interestRateType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of rate calculation that can be applied ")


  public String getInterestRateType() {
    return interestRateType;
  }

  public void setInterestRateType(String interestRateType) {
    this.interestRateType = interestRateType;
  }

  public BQInterestRetrieveOutputModelInterestInstanceRecord interestRateApplicationSchedule(String interestRateApplicationSchedule) {
    this.interestRateApplicationSchedule = interestRateApplicationSchedule;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The processing schedule for applying interest rates to the account 
   * @return interestRateApplicationSchedule
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The processing schedule for applying interest rates to the account ")


  public String getInterestRateApplicationSchedule() {
    return interestRateApplicationSchedule;
  }

  public void setInterestRateApplicationSchedule(String interestRateApplicationSchedule) {
    this.interestRateApplicationSchedule = interestRateApplicationSchedule;
  }

  public BQInterestRetrieveOutputModelInterestInstanceRecord interestRateConfiguration(InlineResponse2006InterestInstanceRecordInterestRateConfiguration interestRateConfiguration) {
    this.interestRateConfiguration = interestRateConfiguration;
    return this;
  }

  /**
   * Get interestRateConfiguration
   * @return interestRateConfiguration
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2006InterestInstanceRecordInterestRateConfiguration getInterestRateConfiguration() {
    return interestRateConfiguration;
  }

  public void setInterestRateConfiguration(InlineResponse2006InterestInstanceRecordInterestRateConfiguration interestRateConfiguration) {
    this.interestRateConfiguration = interestRateConfiguration;
  }

  public BQInterestRetrieveOutputModelInterestInstanceRecord interestApplicationRecord(InlineResponse2006InterestInstanceRecordInterestApplicationRecord interestApplicationRecord) {
    this.interestApplicationRecord = interestApplicationRecord;
    return this;
  }

  /**
   * Get interestApplicationRecord
   * @return interestApplicationRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2006InterestInstanceRecordInterestApplicationRecord getInterestApplicationRecord() {
    return interestApplicationRecord;
  }

  public void setInterestApplicationRecord(InlineResponse2006InterestInstanceRecordInterestApplicationRecord interestApplicationRecord) {
    this.interestApplicationRecord = interestApplicationRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQInterestRetrieveOutputModelInterestInstanceRecord bqInterestRetrieveOutputModelInterestInstanceRecord = (BQInterestRetrieveOutputModelInterestInstanceRecord) o;
    return Objects.equals(this.interestRateType, bqInterestRetrieveOutputModelInterestInstanceRecord.interestRateType) &&
        Objects.equals(this.interestRateApplicationSchedule, bqInterestRetrieveOutputModelInterestInstanceRecord.interestRateApplicationSchedule) &&
        Objects.equals(this.interestRateConfiguration, bqInterestRetrieveOutputModelInterestInstanceRecord.interestRateConfiguration) &&
        Objects.equals(this.interestApplicationRecord, bqInterestRetrieveOutputModelInterestInstanceRecord.interestApplicationRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestRateType, interestRateApplicationSchedule, interestRateConfiguration, interestApplicationRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQInterestRetrieveOutputModelInterestInstanceRecord {\n");
    
    sb.append("    interestRateType: ").append(toIndentedString(interestRateType)).append("\n");
    sb.append("    interestRateApplicationSchedule: ").append(toIndentedString(interestRateApplicationSchedule)).append("\n");
    sb.append("    interestRateConfiguration: ").append(toIndentedString(interestRateConfiguration)).append("\n");
    sb.append("    interestApplicationRecord: ").append(toIndentedString(interestApplicationRecord)).append("\n");
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

