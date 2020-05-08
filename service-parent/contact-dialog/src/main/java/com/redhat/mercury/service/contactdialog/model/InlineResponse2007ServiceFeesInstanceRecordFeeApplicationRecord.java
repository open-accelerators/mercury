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
 * InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecord   {
  @JsonProperty("feeTransaction")
  private InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction feeTransaction;

  @JsonProperty("feeProjectionsandCommitments")
  private InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments feeProjectionsandCommitments;

  @JsonProperty("feeAccrualAmount")
  private InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount feeAccrualAmount;

  public InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecord feeTransaction(InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction feeTransaction) {
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

  public InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecord feeProjectionsandCommitments(InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments feeProjectionsandCommitments) {
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

  public InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecord feeAccrualAmount(InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount feeAccrualAmount) {
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
    InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecord inlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecord = (InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecord) o;
    return Objects.equals(this.feeTransaction, inlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecord.feeTransaction) &&
        Objects.equals(this.feeProjectionsandCommitments, inlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecord.feeProjectionsandCommitments) &&
        Objects.equals(this.feeAccrualAmount, inlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecord.feeAccrualAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeTransaction, feeProjectionsandCommitments, feeAccrualAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007ServiceFeesInstanceRecordFeeApplicationRecord {\n");
    
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

