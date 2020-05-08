package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecord   {
  @JsonProperty("feeTransaction")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction feeTransaction;

  @JsonProperty("feeProjectionsandCommitments")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments feeProjectionsandCommitments;

  @JsonProperty("feeAccrualAmount")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount feeAccrualAmount;

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecord feeTransaction(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction feeTransaction) {
    this.feeTransaction = feeTransaction;
    return this;
  }

  /**
   * Get feeTransaction
   * @return feeTransaction
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction getFeeTransaction() {
    return feeTransaction;
  }

  public void setFeeTransaction(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecordFeeTransaction feeTransaction) {
    this.feeTransaction = feeTransaction;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecord feeProjectionsandCommitments(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments feeProjectionsandCommitments) {
    this.feeProjectionsandCommitments = feeProjectionsandCommitments;
    return this;
  }

  /**
   * Get feeProjectionsandCommitments
   * @return feeProjectionsandCommitments
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments getFeeProjectionsandCommitments() {
    return feeProjectionsandCommitments;
  }

  public void setFeeProjectionsandCommitments(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecordFeeProjectionsandCommitments feeProjectionsandCommitments) {
    this.feeProjectionsandCommitments = feeProjectionsandCommitments;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecord feeAccrualAmount(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount feeAccrualAmount) {
    this.feeAccrualAmount = feeAccrualAmount;
    return this;
  }

  /**
   * Get feeAccrualAmount
   * @return feeAccrualAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount getFeeAccrualAmount() {
    return feeAccrualAmount;
  }

  public void setFeeAccrualAmount(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecordFeeAccrualAmount feeAccrualAmount) {
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
    CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecord currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecord = (CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecord) o;
    return Objects.equals(this.feeTransaction, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecord.feeTransaction) &&
        Objects.equals(this.feeProjectionsandCommitments, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecord.feeProjectionsandCommitments) &&
        Objects.equals(this.feeAccrualAmount, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecord.feeAccrualAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeTransaction, feeProjectionsandCommitments, feeAccrualAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionServiceFeesInstanceRecordFeeApplicationRecord {\n");
    
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

