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
 * BQInterestRetrieveInputModelInterestInstanceAnalysis1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class BQInterestRetrieveInputModelInterestInstanceAnalysis1   {
  @JsonProperty("interestInstanceAnalysisReference")
  private String interestInstanceAnalysisReference;

  public BQInterestRetrieveInputModelInterestInstanceAnalysis1 interestInstanceAnalysisReference(String interestInstanceAnalysisReference) {
    this.interestInstanceAnalysisReference = interestInstanceAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return interestInstanceAnalysisReference
  */
  @ApiModelProperty(example = "756407", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view ")


  public String getInterestInstanceAnalysisReference() {
    return interestInstanceAnalysisReference;
  }

  public void setInterestInstanceAnalysisReference(String interestInstanceAnalysisReference) {
    this.interestInstanceAnalysisReference = interestInstanceAnalysisReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQInterestRetrieveInputModelInterestInstanceAnalysis1 bqInterestRetrieveInputModelInterestInstanceAnalysis1 = (BQInterestRetrieveInputModelInterestInstanceAnalysis1) o;
    return Objects.equals(this.interestInstanceAnalysisReference, bqInterestRetrieveInputModelInterestInstanceAnalysis1.interestInstanceAnalysisReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestInstanceAnalysisReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQInterestRetrieveInputModelInterestInstanceAnalysis1 {\n");
    
    sb.append("    interestInstanceAnalysisReference: ").append(toIndentedString(interestInstanceAnalysisReference)).append("\n");
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

