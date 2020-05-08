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
 * InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits   {
  @JsonProperty("positionLimitValue")
  private String positionLimitValue;

  public InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current calculated position 
   * @return positionLimitValue
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current calculated position ")


  public String getPositionLimitValue() {
    return positionLimitValue;
  }

  public void setPositionLimitValue(String positionLimitValue) {
    this.positionLimitValue = positionLimitValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits inlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits = (InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits) o;
    return Objects.equals(this.positionLimitValue, inlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits.positionLimitValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionLimitValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits {\n");
    
    sb.append("    positionLimitValue: ").append(toIndentedString(positionLimitValue)).append("\n");
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

