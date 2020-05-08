package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecordSweepApplicationRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAccountSweepExecuteInputModelAccountSweepInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQAccountSweepExecuteInputModelAccountSweepInstanceRecord   {
  @JsonProperty("sweepApplicationRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecordSweepApplicationRecord sweepApplicationRecord;

  public BQAccountSweepExecuteInputModelAccountSweepInstanceRecord sweepApplicationRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecordSweepApplicationRecord sweepApplicationRecord) {
    this.sweepApplicationRecord = sweepApplicationRecord;
    return this;
  }

  /**
   * Get sweepApplicationRecord
   * @return sweepApplicationRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecordSweepApplicationRecord getSweepApplicationRecord() {
    return sweepApplicationRecord;
  }

  public void setSweepApplicationRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecordSweepApplicationRecord sweepApplicationRecord) {
    this.sweepApplicationRecord = sweepApplicationRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountSweepExecuteInputModelAccountSweepInstanceRecord bqAccountSweepExecuteInputModelAccountSweepInstanceRecord = (BQAccountSweepExecuteInputModelAccountSweepInstanceRecord) o;
    return Objects.equals(this.sweepApplicationRecord, bqAccountSweepExecuteInputModelAccountSweepInstanceRecord.sweepApplicationRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sweepApplicationRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountSweepExecuteInputModelAccountSweepInstanceRecord {\n");
    
    sb.append("    sweepApplicationRecord: ").append(toIndentedString(sweepApplicationRecord)).append("\n");
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

