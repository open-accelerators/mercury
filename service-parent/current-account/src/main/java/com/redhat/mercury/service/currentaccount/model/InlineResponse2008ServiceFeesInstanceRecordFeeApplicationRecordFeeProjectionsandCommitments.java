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
 * InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments   {
  @JsonProperty("projectedTransactionDescription")
  private String projectedTransactionDescription;

  @JsonProperty("projectedTransactionFeeType")
  private String projectedTransactionFeeType;

  @JsonProperty("projectedTransactionFeeCharge")
  private String projectedTransactionFeeCharge;

  public InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments projectedTransactionDescription(String projectedTransactionDescription) {
    this.projectedTransactionDescription = projectedTransactionDescription;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: General description of the projected fee or penalty 
   * @return projectedTransactionDescription
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: General description of the projected fee or penalty ")


  public String getProjectedTransactionDescription() {
    return projectedTransactionDescription;
  }

  public void setProjectedTransactionDescription(String projectedTransactionDescription) {
    this.projectedTransactionDescription = projectedTransactionDescription;
  }

  public InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments projectedTransactionFeeType(String projectedTransactionFeeType) {
    this.projectedTransactionFeeType = projectedTransactionFeeType;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816  bian-reference: FeeTransaction.ProjectedFeeType  general-info: The fee or penalty type 
   * @return projectedTransactionFeeType
  */
  @ApiModelProperty(value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816  bian-reference: FeeTransaction.ProjectedFeeType  general-info: The fee or penalty type ")


  public String getProjectedTransactionFeeType() {
    return projectedTransactionFeeType;
  }

  public void setProjectedTransactionFeeType(String projectedTransactionFeeType) {
    this.projectedTransactionFeeType = projectedTransactionFeeType;
  }

  public InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments projectedTransactionFeeCharge(String projectedTransactionFeeCharge) {
    this.projectedTransactionFeeCharge = projectedTransactionFeeCharge;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_FMBK98TGEeChad0JzLk7QA_-1487452687  bian-reference: FeeTransaction.ProjectedFeeAmount  general-info: The anticipated fee or penalty amount 
   * @return projectedTransactionFeeCharge
  */
  @ApiModelProperty(example = "USD 250", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_FMBK98TGEeChad0JzLk7QA_-1487452687  bian-reference: FeeTransaction.ProjectedFeeAmount  general-info: The anticipated fee or penalty amount ")


  public String getProjectedTransactionFeeCharge() {
    return projectedTransactionFeeCharge;
  }

  public void setProjectedTransactionFeeCharge(String projectedTransactionFeeCharge) {
    this.projectedTransactionFeeCharge = projectedTransactionFeeCharge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments inlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments = (InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments) o;
    return Objects.equals(this.projectedTransactionDescription, inlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments.projectedTransactionDescription) &&
        Objects.equals(this.projectedTransactionFeeType, inlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments.projectedTransactionFeeType) &&
        Objects.equals(this.projectedTransactionFeeCharge, inlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments.projectedTransactionFeeCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectedTransactionDescription, projectedTransactionFeeType, projectedTransactionFeeCharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments {\n");
    
    sb.append("    projectedTransactionDescription: ").append(toIndentedString(projectedTransactionDescription)).append("\n");
    sb.append("    projectedTransactionFeeType: ").append(toIndentedString(projectedTransactionFeeType)).append("\n");
    sb.append("    projectedTransactionFeeCharge: ").append(toIndentedString(projectedTransactionFeeCharge)).append("\n");
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

