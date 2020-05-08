package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2012ServiceFeesInstanceRecordFeeConfigurationProfile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQServiceFeesInitiateOutputModelServiceFeesInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class BQServiceFeesInitiateOutputModelServiceFeesInstanceRecord   {
  @JsonProperty("feeConfigurationProfile")
  private InlineResponse2012ServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile;

  public BQServiceFeesInitiateOutputModelServiceFeesInstanceRecord feeConfigurationProfile(InlineResponse2012ServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile) {
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
    BQServiceFeesInitiateOutputModelServiceFeesInstanceRecord bqServiceFeesInitiateOutputModelServiceFeesInstanceRecord = (BQServiceFeesInitiateOutputModelServiceFeesInstanceRecord) o;
    return Objects.equals(this.feeConfigurationProfile, bqServiceFeesInitiateOutputModelServiceFeesInstanceRecord.feeConfigurationProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeConfigurationProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQServiceFeesInitiateOutputModelServiceFeesInstanceRecord {\n");
    
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

