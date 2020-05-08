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
 * InlineResponse2008ServiceFeesInstanceRecordFeeConfigurationProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class InlineResponse2008ServiceFeesInstanceRecordFeeConfigurationProfile   {
  @JsonProperty("feeDefinition")
  private String feeDefinition;

  @JsonProperty("feeType")
  private String feeType;

  public InlineResponse2008ServiceFeesInstanceRecordFeeConfigurationProfile feeDefinition(String feeDefinition) {
    this.feeDefinition = feeDefinition;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_hcTGEeChad0JzLk7QA_1324289986  bian-reference: FeeFeature.FeeDefinition  general-info: Definition of the fee or penalty including when and how to apply 
   * @return feeDefinition
  */
  @ApiModelProperty(value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_hcTGEeChad0JzLk7QA_1324289986  bian-reference: FeeFeature.FeeDefinition  general-info: Definition of the fee or penalty including when and how to apply ")


  public String getFeeDefinition() {
    return feeDefinition;
  }

  public void setFeeDefinition(String feeDefinition) {
    this.feeDefinition = feeDefinition;
  }

  public InlineResponse2008ServiceFeesInstanceRecordFeeConfigurationProfile feeType(String feeType) {
    this.feeType = feeType;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816  bian-reference: FeeFeature.FeeType `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816  bian-reference: FeeFeature.FeeType  general-info: The fee or penalty type applied 
   * @return feeType
  */
  @ApiModelProperty(value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816  bian-reference: FeeFeature.FeeType `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816  bian-reference: FeeFeature.FeeType  general-info: The fee or penalty type applied ")


  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008ServiceFeesInstanceRecordFeeConfigurationProfile inlineResponse2008ServiceFeesInstanceRecordFeeConfigurationProfile = (InlineResponse2008ServiceFeesInstanceRecordFeeConfigurationProfile) o;
    return Objects.equals(this.feeDefinition, inlineResponse2008ServiceFeesInstanceRecordFeeConfigurationProfile.feeDefinition) &&
        Objects.equals(this.feeType, inlineResponse2008ServiceFeesInstanceRecordFeeConfigurationProfile.feeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeDefinition, feeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008ServiceFeesInstanceRecordFeeConfigurationProfile {\n");
    
    sb.append("    feeDefinition: ").append(toIndentedString(feeDefinition)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
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

