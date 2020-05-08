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
 * BQAccountSweepRetrieveInputModelAccountSweepInstanceAnalysis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQAccountSweepRetrieveInputModelAccountSweepInstanceAnalysis   {
  @JsonProperty("accountSweepInstanceAnalysisReference")
  private String accountSweepInstanceAnalysisReference;

  public BQAccountSweepRetrieveInputModelAccountSweepInstanceAnalysis accountSweepInstanceAnalysisReference(String accountSweepInstanceAnalysisReference) {
    this.accountSweepInstanceAnalysisReference = accountSweepInstanceAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return accountSweepInstanceAnalysisReference
  */
  @ApiModelProperty(example = "712318", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view ")


  public String getAccountSweepInstanceAnalysisReference() {
    return accountSweepInstanceAnalysisReference;
  }

  public void setAccountSweepInstanceAnalysisReference(String accountSweepInstanceAnalysisReference) {
    this.accountSweepInstanceAnalysisReference = accountSweepInstanceAnalysisReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountSweepRetrieveInputModelAccountSweepInstanceAnalysis bqAccountSweepRetrieveInputModelAccountSweepInstanceAnalysis = (BQAccountSweepRetrieveInputModelAccountSweepInstanceAnalysis) o;
    return Objects.equals(this.accountSweepInstanceAnalysisReference, bqAccountSweepRetrieveInputModelAccountSweepInstanceAnalysis.accountSweepInstanceAnalysisReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSweepInstanceAnalysisReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountSweepRetrieveInputModelAccountSweepInstanceAnalysis {\n");
    
    sb.append("    accountSweepInstanceAnalysisReference: ").append(toIndentedString(accountSweepInstanceAnalysisReference)).append("\n");
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

