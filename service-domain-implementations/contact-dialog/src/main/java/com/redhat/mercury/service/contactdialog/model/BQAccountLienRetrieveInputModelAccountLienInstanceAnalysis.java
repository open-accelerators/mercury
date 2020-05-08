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
 * BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis   {
  @JsonProperty("accountLienInstanceAnalysisReference")
  private String accountLienInstanceAnalysisReference;

  public BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis accountLienInstanceAnalysisReference(String accountLienInstanceAnalysisReference) {
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
    BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis bqAccountLienRetrieveInputModelAccountLienInstanceAnalysis = (BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis) o;
    return Objects.equals(this.accountLienInstanceAnalysisReference, bqAccountLienRetrieveInputModelAccountLienInstanceAnalysis.accountLienInstanceAnalysisReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountLienInstanceAnalysisReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis {\n");
    
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

