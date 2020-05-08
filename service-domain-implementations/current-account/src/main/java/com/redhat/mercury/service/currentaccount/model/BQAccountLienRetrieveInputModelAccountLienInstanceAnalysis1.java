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
 * BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis1   {
  @JsonProperty("accountLienInstanceAnalysisReference")
  private String accountLienInstanceAnalysisReference;

  public BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis1 accountLienInstanceAnalysisReference(String accountLienInstanceAnalysisReference) {
    this.accountLienInstanceAnalysisReference = accountLienInstanceAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return accountLienInstanceAnalysisReference
  */
  @ApiModelProperty(example = "754299", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view ")


  public String getAccountLienInstanceAnalysisReference() {
    return accountLienInstanceAnalysisReference;
  }

  public void setAccountLienInstanceAnalysisReference(String accountLienInstanceAnalysisReference) {
    this.accountLienInstanceAnalysisReference = accountLienInstanceAnalysisReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis1 bqAccountLienRetrieveInputModelAccountLienInstanceAnalysis1 = (BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis1) o;
    return Objects.equals(this.accountLienInstanceAnalysisReference, bqAccountLienRetrieveInputModelAccountLienInstanceAnalysis1.accountLienInstanceAnalysisReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountLienInstanceAnalysisReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis1 {\n");
    
    sb.append("    accountLienInstanceAnalysisReference: ").append(toIndentedString(accountLienInstanceAnalysisReference)).append("\n");
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

