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
 * BQAccountSweepRetrieveInputModelAccountSweepInstanceReport1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class BQAccountSweepRetrieveInputModelAccountSweepInstanceReport1   {
  @JsonProperty("accountSweepInstanceReportReference")
  private String accountSweepInstanceReportReference;

  public BQAccountSweepRetrieveInputModelAccountSweepInstanceReport1 accountSweepInstanceReportReference(String accountSweepInstanceReportReference) {
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
    BQAccountSweepRetrieveInputModelAccountSweepInstanceReport1 bqAccountSweepRetrieveInputModelAccountSweepInstanceReport1 = (BQAccountSweepRetrieveInputModelAccountSweepInstanceReport1) o;
    return Objects.equals(this.accountSweepInstanceReportReference, bqAccountSweepRetrieveInputModelAccountSweepInstanceReport1.accountSweepInstanceReportReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSweepInstanceReportReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountSweepRetrieveInputModelAccountSweepInstanceReport1 {\n");
    
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

