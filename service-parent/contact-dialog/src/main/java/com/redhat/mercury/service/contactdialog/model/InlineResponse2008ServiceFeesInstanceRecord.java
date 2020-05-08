package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecord;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2008ServiceFeesInstanceRecordFeeConfigurationProfile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2008ServiceFeesInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class InlineResponse2008ServiceFeesInstanceRecord   {
  @JsonProperty("feeConfigurationProfile")
  private InlineResponse2008ServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile;

  @JsonProperty("feeApplicationRecord")
  private InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecord feeApplicationRecord;

  public InlineResponse2008ServiceFeesInstanceRecord feeConfigurationProfile(InlineResponse2008ServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile) {
    this.feeConfigurationProfile = feeConfigurationProfile;
    return this;
  }

  /**
   * Get feeConfigurationProfile
   * @return feeConfigurationProfile
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2008ServiceFeesInstanceRecordFeeConfigurationProfile getFeeConfigurationProfile() {
    return feeConfigurationProfile;
  }

  public void setFeeConfigurationProfile(InlineResponse2008ServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile) {
    this.feeConfigurationProfile = feeConfigurationProfile;
  }

  public InlineResponse2008ServiceFeesInstanceRecord feeApplicationRecord(InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecord feeApplicationRecord) {
    this.feeApplicationRecord = feeApplicationRecord;
    return this;
  }

  /**
   * Get feeApplicationRecord
   * @return feeApplicationRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecord getFeeApplicationRecord() {
    return feeApplicationRecord;
  }

  public void setFeeApplicationRecord(InlineResponse2008ServiceFeesInstanceRecordFeeApplicationRecord feeApplicationRecord) {
    this.feeApplicationRecord = feeApplicationRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008ServiceFeesInstanceRecord inlineResponse2008ServiceFeesInstanceRecord = (InlineResponse2008ServiceFeesInstanceRecord) o;
    return Objects.equals(this.feeConfigurationProfile, inlineResponse2008ServiceFeesInstanceRecord.feeConfigurationProfile) &&
        Objects.equals(this.feeApplicationRecord, inlineResponse2008ServiceFeesInstanceRecord.feeApplicationRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeConfigurationProfile, feeApplicationRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008ServiceFeesInstanceRecord {\n");
    
    sb.append("    feeConfigurationProfile: ").append(toIndentedString(feeConfigurationProfile)).append("\n");
    sb.append("    feeApplicationRecord: ").append(toIndentedString(feeApplicationRecord)).append("\n");
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

