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
 * BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType   {
  @JsonProperty("issuedDevicePropertyValue")
  private String issuedDevicePropertyValue;

  public BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType issuedDevicePropertyValue(String issuedDevicePropertyValue) {
    this.issuedDevicePropertyValue = issuedDevicePropertyValue;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The tracked values associated with an issued device/inventory item 
   * @return issuedDevicePropertyValue
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The tracked values associated with an issued device/inventory item ")


  public String getIssuedDevicePropertyValue() {
    return issuedDevicePropertyValue;
  }

  public void setIssuedDevicePropertyValue(String issuedDevicePropertyValue) {
    this.issuedDevicePropertyValue = issuedDevicePropertyValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType bqIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType = (BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType) o;
    return Objects.equals(this.issuedDevicePropertyValue, bqIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType.issuedDevicePropertyValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDevicePropertyValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecordIssuedDevicePropertyIssuedDevicePropertyType {\n");
    
    sb.append("    issuedDevicePropertyValue: ").append(toIndentedString(issuedDevicePropertyValue)).append("\n");
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

