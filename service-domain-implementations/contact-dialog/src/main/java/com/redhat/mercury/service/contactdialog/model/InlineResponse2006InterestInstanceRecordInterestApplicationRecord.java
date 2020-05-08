package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestAccrualAmount;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2006InterestInstanceRecordInterestApplicationRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class InlineResponse2006InterestInstanceRecordInterestApplicationRecord   {
  @JsonProperty("interestTransaction")
  private InlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestTransaction interestTransaction;

  @JsonProperty("interestAccrualAmount")
  private InlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestAccrualAmount interestAccrualAmount;

  public InlineResponse2006InterestInstanceRecordInterestApplicationRecord interestTransaction(InlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestTransaction interestTransaction) {
    this.interestTransaction = interestTransaction;
    return this;
  }

  /**
   * Get interestTransaction
   * @return interestTransaction
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestTransaction getInterestTransaction() {
    return interestTransaction;
  }

  public void setInterestTransaction(InlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestTransaction interestTransaction) {
    this.interestTransaction = interestTransaction;
  }

  public InlineResponse2006InterestInstanceRecordInterestApplicationRecord interestAccrualAmount(InlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestAccrualAmount interestAccrualAmount) {
    this.interestAccrualAmount = interestAccrualAmount;
    return this;
  }

  /**
   * Get interestAccrualAmount
   * @return interestAccrualAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestAccrualAmount getInterestAccrualAmount() {
    return interestAccrualAmount;
  }

  public void setInterestAccrualAmount(InlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestAccrualAmount interestAccrualAmount) {
    this.interestAccrualAmount = interestAccrualAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006InterestInstanceRecordInterestApplicationRecord inlineResponse2006InterestInstanceRecordInterestApplicationRecord = (InlineResponse2006InterestInstanceRecordInterestApplicationRecord) o;
    return Objects.equals(this.interestTransaction, inlineResponse2006InterestInstanceRecordInterestApplicationRecord.interestTransaction) &&
        Objects.equals(this.interestAccrualAmount, inlineResponse2006InterestInstanceRecordInterestApplicationRecord.interestAccrualAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestTransaction, interestAccrualAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006InterestInstanceRecordInterestApplicationRecord {\n");
    
    sb.append("    interestTransaction: ").append(toIndentedString(interestTransaction)).append("\n");
    sb.append("    interestAccrualAmount: ").append(toIndentedString(interestAccrualAmount)).append("\n");
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

