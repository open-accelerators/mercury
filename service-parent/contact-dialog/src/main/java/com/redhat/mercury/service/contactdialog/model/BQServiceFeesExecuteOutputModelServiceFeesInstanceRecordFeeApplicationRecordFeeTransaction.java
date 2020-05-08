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
 * BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction   {
  @JsonProperty("transactionFeeType")
  private String transactionFeeType;

  @JsonProperty("transactionFeeCharge")
  private String transactionFeeCharge;

  public BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction transactionFeeType(String transactionFeeType) {
    this.transactionFeeType = transactionFeeType;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816  bian-reference: FeeTransaction.AppliedFeeType  general-info: The fee or penalty type applied 
   * @return transactionFeeType
  */
  @ApiModelProperty(value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816  bian-reference: FeeTransaction.AppliedFeeType  general-info: The fee or penalty type applied ")


  public String getTransactionFeeType() {
    return transactionFeeType;
  }

  public void setTransactionFeeType(String transactionFeeType) {
    this.transactionFeeType = transactionFeeType;
  }

  public BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction transactionFeeCharge(String transactionFeeCharge) {
    this.transactionFeeCharge = transactionFeeCharge;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_FMBK98TGEeChad0JzLk7QA_-1487452687  bian-reference: FeeTransaction.AppliedFeeAmount  general-info: The derived fee or penalty amount applied 
   * @return transactionFeeCharge
  */
  @ApiModelProperty(example = "USD 250", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_FMBK98TGEeChad0JzLk7QA_-1487452687  bian-reference: FeeTransaction.AppliedFeeAmount  general-info: The derived fee or penalty amount applied ")


  public String getTransactionFeeCharge() {
    return transactionFeeCharge;
  }

  public void setTransactionFeeCharge(String transactionFeeCharge) {
    this.transactionFeeCharge = transactionFeeCharge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction bqServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction = (BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction) o;
    return Objects.equals(this.transactionFeeType, bqServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction.transactionFeeType) &&
        Objects.equals(this.transactionFeeCharge, bqServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction.transactionFeeCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionFeeType, transactionFeeCharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction {\n");
    
    sb.append("    transactionFeeType: ").append(toIndentedString(transactionFeeType)).append("\n");
    sb.append("    transactionFeeCharge: ").append(toIndentedString(transactionFeeCharge)).append("\n");
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

