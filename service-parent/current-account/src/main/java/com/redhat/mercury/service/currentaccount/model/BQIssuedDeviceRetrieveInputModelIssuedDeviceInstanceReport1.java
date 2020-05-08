package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceReport1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceReport1   {
  @JsonProperty("issuedDeviceInstanceReportReference")
  private String issuedDeviceInstanceReportReference;

  public BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceReport1 issuedDeviceInstanceReportReference(String issuedDeviceInstanceReportReference) {
    this.issuedDeviceInstanceReportReference = issuedDeviceInstanceReportReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return issuedDeviceInstanceReportReference
  */
  @ApiModelProperty(example = "756825", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report ")


  public String getIssuedDeviceInstanceReportReference() {
    return issuedDeviceInstanceReportReference;
  }

  public void setIssuedDeviceInstanceReportReference(String issuedDeviceInstanceReportReference) {
    this.issuedDeviceInstanceReportReference = issuedDeviceInstanceReportReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceReport1 bqIssuedDeviceRetrieveInputModelIssuedDeviceInstanceReport1 = (BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceReport1) o;
    return Objects.equals(this.issuedDeviceInstanceReportReference, bqIssuedDeviceRetrieveInputModelIssuedDeviceInstanceReport1.issuedDeviceInstanceReportReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceInstanceReportReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceReport1 {\n");
    
    sb.append("    issuedDeviceInstanceReportReference: ").append(toIndentedString(issuedDeviceInstanceReportReference)).append("\n");
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

