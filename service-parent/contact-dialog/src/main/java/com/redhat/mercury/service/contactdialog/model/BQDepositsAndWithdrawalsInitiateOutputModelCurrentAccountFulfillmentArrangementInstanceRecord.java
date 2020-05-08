package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQDepositsAndWithdrawalsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQDepositsAndWithdrawalsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord   {
  @JsonProperty("positionLimits")
  private InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits;

  @JsonProperty("dateType")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType;

  public BQDepositsAndWithdrawalsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord positionLimits(InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
    this.positionLimits = positionLimits;
    return this;
  }

  /**
   * Get positionLimits
   * @return positionLimits
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
    this.positionLimits = positionLimits;
  }

  public BQDepositsAndWithdrawalsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord dateType(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQDepositsAndWithdrawalsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord bqDepositsAndWithdrawalsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord = (BQDepositsAndWithdrawalsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord) o;
    return Objects.equals(this.positionLimits, bqDepositsAndWithdrawalsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.positionLimits) &&
        Objects.equals(this.dateType, bqDepositsAndWithdrawalsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionLimits, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQDepositsAndWithdrawalsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord {\n");
    
    sb.append("    positionLimits: ").append(toIndentedString(positionLimits)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
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

