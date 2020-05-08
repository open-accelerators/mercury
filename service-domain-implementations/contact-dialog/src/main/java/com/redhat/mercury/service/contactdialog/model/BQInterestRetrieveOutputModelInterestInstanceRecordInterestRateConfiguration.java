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
 * BQInterestRetrieveOutputModelInterestInstanceRecordInterestRateConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQInterestRetrieveOutputModelInterestInstanceRecordInterestRateConfiguration   {
  @JsonProperty("interestRateType")
  private String interestRateType;

  @JsonProperty("interestRate")
  private String interestRate;

  public BQInterestRetrieveOutputModelInterestInstanceRecordInterestRateConfiguration interestRateType(String interestRateType) {
    this.interestRateType = interestRateType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Applicable rate type 
   * @return interestRateType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Applicable rate type ")


  public String getInterestRateType() {
    return interestRateType;
  }

  public void setInterestRateType(String interestRateType) {
    this.interestRateType = interestRateType;
  }

  public BQInterestRetrieveOutputModelInterestInstanceRecordInterestRateConfiguration interestRate(String interestRate) {
    this.interestRate = interestRate;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The rate value to be applied 
   * @return interestRate
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The rate value to be applied ")


  public String getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(String interestRate) {
    this.interestRate = interestRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQInterestRetrieveOutputModelInterestInstanceRecordInterestRateConfiguration bqInterestRetrieveOutputModelInterestInstanceRecordInterestRateConfiguration = (BQInterestRetrieveOutputModelInterestInstanceRecordInterestRateConfiguration) o;
    return Objects.equals(this.interestRateType, bqInterestRetrieveOutputModelInterestInstanceRecordInterestRateConfiguration.interestRateType) &&
        Objects.equals(this.interestRate, bqInterestRetrieveOutputModelInterestInstanceRecordInterestRateConfiguration.interestRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestRateType, interestRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQInterestRetrieveOutputModelInterestInstanceRecordInterestRateConfiguration {\n");
    
    sb.append("    interestRateType: ").append(toIndentedString(interestRateType)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
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

