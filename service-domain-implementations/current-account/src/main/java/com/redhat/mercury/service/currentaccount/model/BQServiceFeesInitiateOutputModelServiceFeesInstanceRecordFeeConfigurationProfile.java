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
 * BQServiceFeesInitiateOutputModelServiceFeesInstanceRecordFeeConfigurationProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class BQServiceFeesInitiateOutputModelServiceFeesInstanceRecordFeeConfigurationProfile   {
  @JsonProperty("feeDefinition")
  private String feeDefinition;

  public BQServiceFeesInitiateOutputModelServiceFeesInstanceRecordFeeConfigurationProfile feeDefinition(String feeDefinition) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQServiceFeesInitiateOutputModelServiceFeesInstanceRecordFeeConfigurationProfile bqServiceFeesInitiateOutputModelServiceFeesInstanceRecordFeeConfigurationProfile = (BQServiceFeesInitiateOutputModelServiceFeesInstanceRecordFeeConfigurationProfile) o;
    return Objects.equals(this.feeDefinition, bqServiceFeesInitiateOutputModelServiceFeesInstanceRecordFeeConfigurationProfile.feeDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeDefinition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQServiceFeesInitiateOutputModelServiceFeesInstanceRecordFeeConfigurationProfile {\n");
    
    sb.append("    feeDefinition: ").append(toIndentedString(feeDefinition)).append("\n");
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

