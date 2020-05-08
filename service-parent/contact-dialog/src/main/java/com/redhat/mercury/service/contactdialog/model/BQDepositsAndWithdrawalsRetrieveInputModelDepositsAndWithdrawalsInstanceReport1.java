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
 * BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceReport1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceReport1   {
  @JsonProperty("depositsAndWithdrawalsInstanceReportReference")
  private String depositsAndWithdrawalsInstanceReportReference;

  public BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceReport1 depositsAndWithdrawalsInstanceReportReference(String depositsAndWithdrawalsInstanceReportReference) {
    this.depositsAndWithdrawalsInstanceReportReference = depositsAndWithdrawalsInstanceReportReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return depositsAndWithdrawalsInstanceReportReference
  */
  @ApiModelProperty(example = "716408", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report ")


  public String getDepositsAndWithdrawalsInstanceReportReference() {
    return depositsAndWithdrawalsInstanceReportReference;
  }

  public void setDepositsAndWithdrawalsInstanceReportReference(String depositsAndWithdrawalsInstanceReportReference) {
    this.depositsAndWithdrawalsInstanceReportReference = depositsAndWithdrawalsInstanceReportReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceReport1 bqDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceReport1 = (BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceReport1) o;
    return Objects.equals(this.depositsAndWithdrawalsInstanceReportReference, bqDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceReport1.depositsAndWithdrawalsInstanceReportReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositsAndWithdrawalsInstanceReportReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceReport1 {\n");
    
    sb.append("    depositsAndWithdrawalsInstanceReportReference: ").append(toIndentedString(depositsAndWithdrawalsInstanceReportReference)).append("\n");
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

