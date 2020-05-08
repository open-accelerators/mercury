package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts;
import com.redhat.mercury.service.currentaccount.model.InlineResponse2013CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class BQAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord   {
  @JsonProperty("entitlementOptionDefinition")
  private String entitlementOptionDefinition;

  @JsonProperty("restrictionOptionDefinition")
  private String restrictionOptionDefinition;

  @JsonProperty("linkedAccounts")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts;

  @JsonProperty("positionLimits")
  private InlineResponse2013CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits;

  @JsonProperty("dateType")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType;

  public BQAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord entitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable entitlement option 
   * @return entitlementOptionDefinition
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable entitlement option ")


  public String getEntitlementOptionDefinition() {
    return entitlementOptionDefinition;
  }

  public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
  }

  public BQAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord restrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable restriction option 
   * @return restrictionOptionDefinition
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable restriction option ")


  public String getRestrictionOptionDefinition() {
    return restrictionOptionDefinition;
  }

  public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
  }

  public BQAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord linkedAccounts(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
    return this;
  }

  /**
   * Get linkedAccounts
   * @return linkedAccounts
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }

  public BQAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord positionLimits(InlineResponse2013CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
    this.positionLimits = positionLimits;
    return this;
  }

  /**
   * Get positionLimits
   * @return positionLimits
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2013CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(InlineResponse2013CurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
    this.positionLimits = positionLimits;
  }

  public BQAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord dateType(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType) {
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
    BQAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord bqAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord = (BQAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord) o;
    return Objects.equals(this.entitlementOptionDefinition, bqAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.entitlementOptionDefinition) &&
        Objects.equals(this.restrictionOptionDefinition, bqAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.restrictionOptionDefinition) &&
        Objects.equals(this.linkedAccounts, bqAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.linkedAccounts) &&
        Objects.equals(this.positionLimits, bqAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.positionLimits) &&
        Objects.equals(this.dateType, bqAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitlementOptionDefinition, restrictionOptionDefinition, linkedAccounts, positionLimits, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountLienInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord {\n");
    
    sb.append("    entitlementOptionDefinition: ").append(toIndentedString(entitlementOptionDefinition)).append("\n");
    sb.append("    restrictionOptionDefinition: ").append(toIndentedString(restrictionOptionDefinition)).append("\n");
    sb.append("    linkedAccounts: ").append(toIndentedString(linkedAccounts)).append("\n");
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

