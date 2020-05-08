package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord   {
  @JsonProperty("feeTransaction")
  private InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction feeTransaction;

  @JsonProperty("feeProjectionsandCommitments")
  private InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments feeProjectionsandCommitments;

  @JsonProperty("feeAccrualAmount")
  private InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount feeAccrualAmount;

  public BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord feeTransaction(InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction feeTransaction) {
    this.feeTransaction = feeTransaction;
    return this;
  }

  /**
   * Get feeTransaction
   * @return feeTransaction
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction getFeeTransaction() {
    return feeTransaction;
  }

  public void setFeeTransaction(InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction feeTransaction) {
    this.feeTransaction = feeTransaction;
  }

  public BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord feeProjectionsandCommitments(InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments feeProjectionsandCommitments) {
    this.feeProjectionsandCommitments = feeProjectionsandCommitments;
    return this;
  }

  /**
   * Get feeProjectionsandCommitments
   * @return feeProjectionsandCommitments
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments getFeeProjectionsandCommitments() {
    return feeProjectionsandCommitments;
  }

  public void setFeeProjectionsandCommitments(InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments feeProjectionsandCommitments) {
    this.feeProjectionsandCommitments = feeProjectionsandCommitments;
  }

  public BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord feeAccrualAmount(InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount feeAccrualAmount) {
    this.feeAccrualAmount = feeAccrualAmount;
    return this;
  }

  /**
   * Get feeAccrualAmount
   * @return feeAccrualAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount getFeeAccrualAmount() {
    return feeAccrualAmount;
  }

  public void setFeeAccrualAmount(InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount feeAccrualAmount) {
    this.feeAccrualAmount = feeAccrualAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord bqServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord = (BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord) o;
    return Objects.equals(this.feeTransaction, bqServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord.feeTransaction) &&
        Objects.equals(this.feeProjectionsandCommitments, bqServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord.feeProjectionsandCommitments) &&
        Objects.equals(this.feeAccrualAmount, bqServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord.feeAccrualAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeTransaction, feeProjectionsandCommitments, feeAccrualAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord {\n");
    
    sb.append("    feeTransaction: ").append(toIndentedString(feeTransaction)).append("\n");
    sb.append("    feeProjectionsandCommitments: ").append(toIndentedString(feeProjectionsandCommitments)).append("\n");
    sb.append("    feeAccrualAmount: ").append(toIndentedString(feeAccrualAmount)).append("\n");
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

