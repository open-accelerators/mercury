package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsInitiationCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsInitiationCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits   {
  @JsonProperty("positionLimitType")
  private String positionLimitType;

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsInitiationCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimitType(String positionLimitType) {
    this.positionLimitType = positionLimitType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of position maintained for the account (e.g. transaction credit/debit, netting, position) 
   * @return positionLimitType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of position maintained for the account (e.g. transaction credit/debit, netting, position) ")


  public String getPositionLimitType() {
    return positionLimitType;
  }

  public void setPositionLimitType(String positionLimitType) {
    this.positionLimitType = positionLimitType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsInitiationCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsInitiationCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits = (CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsInitiationCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits) o;
    return Objects.equals(this.positionLimitType, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsInitiationCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits.positionLimitType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionLimitType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsInitiationCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits {\n");
    
    sb.append("    positionLimitType: ").append(toIndentedString(positionLimitType)).append("\n");
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

