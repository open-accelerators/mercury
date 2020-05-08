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
 * BQAccountLienRetrieveInputModelAccountLienInstanceReport1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class BQAccountLienRetrieveInputModelAccountLienInstanceReport1   {
  @JsonProperty("accountLienInstanceReportReference")
  private String accountLienInstanceReportReference;

  public BQAccountLienRetrieveInputModelAccountLienInstanceReport1 accountLienInstanceReportReference(String accountLienInstanceReportReference) {
    this.accountLienInstanceReportReference = accountLienInstanceReportReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return accountLienInstanceReportReference
  */
  @ApiModelProperty(example = "746677", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report ")


  public String getAccountLienInstanceReportReference() {
    return accountLienInstanceReportReference;
  }

  public void setAccountLienInstanceReportReference(String accountLienInstanceReportReference) {
    this.accountLienInstanceReportReference = accountLienInstanceReportReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountLienRetrieveInputModelAccountLienInstanceReport1 bqAccountLienRetrieveInputModelAccountLienInstanceReport1 = (BQAccountLienRetrieveInputModelAccountLienInstanceReport1) o;
    return Objects.equals(this.accountLienInstanceReportReference, bqAccountLienRetrieveInputModelAccountLienInstanceReport1.accountLienInstanceReportReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountLienInstanceReportReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountLienRetrieveInputModelAccountLienInstanceReport1 {\n");
    
    sb.append("    accountLienInstanceReportReference: ").append(toIndentedString(accountLienInstanceReportReference)).append("\n");
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

