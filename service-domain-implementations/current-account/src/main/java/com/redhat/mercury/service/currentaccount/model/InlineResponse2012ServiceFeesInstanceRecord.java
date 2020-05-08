package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.InlineResponse2012ServiceFeesInstanceRecordFeeConfigurationProfile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2012ServiceFeesInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class InlineResponse2012ServiceFeesInstanceRecord   {
  @JsonProperty("feeConfigurationProfile")
  private InlineResponse2012ServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile;

  public InlineResponse2012ServiceFeesInstanceRecord feeConfigurationProfile(InlineResponse2012ServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile) {
    this.feeConfigurationProfile = feeConfigurationProfile;
    return this;
  }

  /**
   * Get feeConfigurationProfile
   * @return feeConfigurationProfile
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2012ServiceFeesInstanceRecordFeeConfigurationProfile getFeeConfigurationProfile() {
    return feeConfigurationProfile;
  }

  public void setFeeConfigurationProfile(InlineResponse2012ServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile) {
    this.feeConfigurationProfile = feeConfigurationProfile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2012ServiceFeesInstanceRecord inlineResponse2012ServiceFeesInstanceRecord = (InlineResponse2012ServiceFeesInstanceRecord) o;
    return Objects.equals(this.feeConfigurationProfile, inlineResponse2012ServiceFeesInstanceRecord.feeConfigurationProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeConfigurationProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2012ServiceFeesInstanceRecord {\n");
    
    sb.append("    feeConfigurationProfile: ").append(toIndentedString(feeConfigurationProfile)).append("\n");
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

