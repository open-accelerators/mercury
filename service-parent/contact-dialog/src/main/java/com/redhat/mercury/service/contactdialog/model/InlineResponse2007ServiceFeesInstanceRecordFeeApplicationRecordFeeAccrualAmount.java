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
 * InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount   {
  @JsonProperty("accrualFeeType")
  private String accrualFeeType;

  @JsonProperty("accrualFeeCharge")
  private String accrualFeeCharge;

  public InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount accrualFeeType(String accrualFeeType) {
    this.accrualFeeType = accrualFeeType;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816  bian-reference: FeeTransaction.AccuredFeeType  general-info: The fee or penalty type being tracked 
   * @return accrualFeeType
  */
  @ApiModelProperty(value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816  bian-reference: FeeTransaction.AccuredFeeType  general-info: The fee or penalty type being tracked ")


  public String getAccrualFeeType() {
    return accrualFeeType;
  }

  public void setAccrualFeeType(String accrualFeeType) {
    this.accrualFeeType = accrualFeeType;
  }

  public InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount accrualFeeCharge(String accrualFeeCharge) {
    this.accrualFeeCharge = accrualFeeCharge;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_FMBK98TGEeChad0JzLk7QA_-1487452687  bian-reference: FeeTransaction.AccuredFeeAmount  general-info: The accrued amount of fees and penalties 
   * @return accrualFeeCharge
  */
  @ApiModelProperty(example = "USD 250", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_FMBK98TGEeChad0JzLk7QA_-1487452687  bian-reference: FeeTransaction.AccuredFeeAmount  general-info: The accrued amount of fees and penalties ")


  public String getAccrualFeeCharge() {
    return accrualFeeCharge;
  }

  public void setAccrualFeeCharge(String accrualFeeCharge) {
    this.accrualFeeCharge = accrualFeeCharge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount inlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount = (InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount) o;
    return Objects.equals(this.accrualFeeType, inlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount.accrualFeeType) &&
        Objects.equals(this.accrualFeeCharge, inlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount.accrualFeeCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accrualFeeType, accrualFeeCharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount {\n");
    
    sb.append("    accrualFeeType: ").append(toIndentedString(accrualFeeType)).append("\n");
    sb.append("    accrualFeeCharge: ").append(toIndentedString(accrualFeeCharge)).append("\n");
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

