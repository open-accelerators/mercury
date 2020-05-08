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
 * BQInterestRetrieveInputModelInterestInstanceReport1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQInterestRetrieveInputModelInterestInstanceReport1   {
  @JsonProperty("interestInstanceReportReference")
  private String interestInstanceReportReference;

  public BQInterestRetrieveInputModelInterestInstanceReport1 interestInstanceReportReference(String interestInstanceReportReference) {
    this.interestInstanceReportReference = interestInstanceReportReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return interestInstanceReportReference
  */
  @ApiModelProperty(example = "730058", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report ")


  public String getInterestInstanceReportReference() {
    return interestInstanceReportReference;
  }

  public void setInterestInstanceReportReference(String interestInstanceReportReference) {
    this.interestInstanceReportReference = interestInstanceReportReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQInterestRetrieveInputModelInterestInstanceReport1 bqInterestRetrieveInputModelInterestInstanceReport1 = (BQInterestRetrieveInputModelInterestInstanceReport1) o;
    return Objects.equals(this.interestInstanceReportReference, bqInterestRetrieveInputModelInterestInstanceReport1.interestInstanceReportReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestInstanceReportReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQInterestRetrieveInputModelInterestInstanceReport1 {\n");
    
    sb.append("    interestInstanceReportReference: ").append(toIndentedString(interestInstanceReportReference)).append("\n");
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

