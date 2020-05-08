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
 * BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceAnalysis1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceAnalysis1   {
  @JsonProperty("issuedDeviceInstanceAnalysisReference")
  private String issuedDeviceInstanceAnalysisReference;

  public BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceAnalysis1 issuedDeviceInstanceAnalysisReference(String issuedDeviceInstanceAnalysisReference) {
    this.issuedDeviceInstanceAnalysisReference = issuedDeviceInstanceAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return issuedDeviceInstanceAnalysisReference
  */
  @ApiModelProperty(example = "742095", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view ")


  public String getIssuedDeviceInstanceAnalysisReference() {
    return issuedDeviceInstanceAnalysisReference;
  }

  public void setIssuedDeviceInstanceAnalysisReference(String issuedDeviceInstanceAnalysisReference) {
    this.issuedDeviceInstanceAnalysisReference = issuedDeviceInstanceAnalysisReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceAnalysis1 bqIssuedDeviceRetrieveInputModelIssuedDeviceInstanceAnalysis1 = (BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceAnalysis1) o;
    return Objects.equals(this.issuedDeviceInstanceAnalysisReference, bqIssuedDeviceRetrieveInputModelIssuedDeviceInstanceAnalysis1.issuedDeviceInstanceAnalysisReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceInstanceAnalysisReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQIssuedDeviceRetrieveInputModelIssuedDeviceInstanceAnalysis1 {\n");
    
    sb.append("    issuedDeviceInstanceAnalysisReference: ").append(toIndentedString(issuedDeviceInstanceAnalysisReference)).append("\n");
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

