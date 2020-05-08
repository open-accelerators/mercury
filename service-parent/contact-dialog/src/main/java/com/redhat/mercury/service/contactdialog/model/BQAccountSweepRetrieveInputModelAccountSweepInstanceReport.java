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
 * BQAccountSweepRetrieveInputModelAccountSweepInstanceReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQAccountSweepRetrieveInputModelAccountSweepInstanceReport   {
  @JsonProperty("accountSweepInstanceReportReference")
  private String accountSweepInstanceReportReference;

  public BQAccountSweepRetrieveInputModelAccountSweepInstanceReport accountSweepInstanceReportReference(String accountSweepInstanceReportReference) {
    this.accountSweepInstanceReportReference = accountSweepInstanceReportReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return accountSweepInstanceReportReference
  */
  @ApiModelProperty(example = "788154", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report ")


  public String getAccountSweepInstanceReportReference() {
    return accountSweepInstanceReportReference;
  }

  public void setAccountSweepInstanceReportReference(String accountSweepInstanceReportReference) {
    this.accountSweepInstanceReportReference = accountSweepInstanceReportReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountSweepRetrieveInputModelAccountSweepInstanceReport bqAccountSweepRetrieveInputModelAccountSweepInstanceReport = (BQAccountSweepRetrieveInputModelAccountSweepInstanceReport) o;
    return Objects.equals(this.accountSweepInstanceReportReference, bqAccountSweepRetrieveInputModelAccountSweepInstanceReport.accountSweepInstanceReportReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSweepInstanceReportReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountSweepRetrieveInputModelAccountSweepInstanceReport {\n");
    
    sb.append("    accountSweepInstanceReportReference: ").append(toIndentedString(accountSweepInstanceReportReference)).append("\n");
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

