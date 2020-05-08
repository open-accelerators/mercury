package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecord;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationServiceFeesInstanceRecordFeeConfigurationProfile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQServiceFeesExecuteInputModelServiceFeesInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class BQServiceFeesExecuteInputModelServiceFeesInstanceRecord   {
  @JsonProperty("feeConfigurationProfile")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile;

  @JsonProperty("feeApplicationRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecord feeApplicationRecord;

  public BQServiceFeesExecuteInputModelServiceFeesInstanceRecord feeConfigurationProfile(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile) {
    this.feeConfigurationProfile = feeConfigurationProfile;
    return this;
  }

  /**
   * Get feeConfigurationProfile
   * @return feeConfigurationProfile
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationServiceFeesInstanceRecordFeeConfigurationProfile getFeeConfigurationProfile() {
    return feeConfigurationProfile;
  }

  public void setFeeConfigurationProfile(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesInitiationServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile) {
    this.feeConfigurationProfile = feeConfigurationProfile;
  }

  public BQServiceFeesExecuteInputModelServiceFeesInstanceRecord feeApplicationRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecord feeApplicationRecord) {
    this.feeApplicationRecord = feeApplicationRecord;
    return this;
  }

  /**
   * Get feeApplicationRecord
   * @return feeApplicationRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecord getFeeApplicationRecord() {
    return feeApplicationRecord;
  }

  public void setFeeApplicationRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecord feeApplicationRecord) {
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
    BQServiceFeesExecuteInputModelServiceFeesInstanceRecord bqServiceFeesExecuteInputModelServiceFeesInstanceRecord = (BQServiceFeesExecuteInputModelServiceFeesInstanceRecord) o;
    return Objects.equals(this.feeConfigurationProfile, bqServiceFeesExecuteInputModelServiceFeesInstanceRecord.feeConfigurationProfile) &&
        Objects.equals(this.feeApplicationRecord, bqServiceFeesExecuteInputModelServiceFeesInstanceRecord.feeApplicationRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeConfigurationProfile, feeApplicationRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQServiceFeesExecuteInputModelServiceFeesInstanceRecord {\n");
    
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

