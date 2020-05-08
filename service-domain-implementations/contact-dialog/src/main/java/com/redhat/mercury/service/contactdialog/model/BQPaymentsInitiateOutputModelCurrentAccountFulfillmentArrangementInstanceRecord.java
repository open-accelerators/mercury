package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2016CurrentAccountFulfillmentArrangementInstanceRecordAssociations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQPaymentsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQPaymentsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord   {
  @JsonProperty("taxReference")
  private String taxReference;

  @JsonProperty("associations")
  private InlineResponse2016CurrentAccountFulfillmentArrangementInstanceRecordAssociations associations;

  @JsonProperty("positionLimits")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits;

  @JsonProperty("dateType")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType;

  public BQPaymentsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord taxReference(String taxReference) {
    this.taxReference = taxReference;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E4gZEcTGEeChad0JzLk7QA_2010102987/elements/__-5BiGIiEeGD28DQaMef-g  bian-reference: CurrentAccountAgreement (as Agreement). RuleSetAsRegulation  general-info: Reference identifier linking the account to appropriate tax handling 
   * @return taxReference
  */
  @ApiModelProperty(example = "773384", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E4gZEcTGEeChad0JzLk7QA_2010102987/elements/__-5BiGIiEeGD28DQaMef-g  bian-reference: CurrentAccountAgreement (as Agreement). RuleSetAsRegulation  general-info: Reference identifier linking the account to appropriate tax handling ")


  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }

  public BQPaymentsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord associations(InlineResponse2016CurrentAccountFulfillmentArrangementInstanceRecordAssociations associations) {
    this.associations = associations;
    return this;
  }

  /**
   * Get associations
   * @return associations
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2016CurrentAccountFulfillmentArrangementInstanceRecordAssociations getAssociations() {
    return associations;
  }

  public void setAssociations(InlineResponse2016CurrentAccountFulfillmentArrangementInstanceRecordAssociations associations) {
    this.associations = associations;
  }

  public BQPaymentsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord positionLimits(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
    this.positionLimits = positionLimits;
    return this;
  }

  /**
   * Get positionLimits
   * @return positionLimits
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
    this.positionLimits = positionLimits;
  }

  public BQPaymentsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord dateType(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementInitiationCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType) {
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
    BQPaymentsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord bqPaymentsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord = (BQPaymentsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord) o;
    return Objects.equals(this.taxReference, bqPaymentsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.taxReference) &&
        Objects.equals(this.associations, bqPaymentsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.associations) &&
        Objects.equals(this.positionLimits, bqPaymentsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.positionLimits) &&
        Objects.equals(this.dateType, bqPaymentsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxReference, associations, positionLimits, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQPaymentsInitiateOutputModelCurrentAccountFulfillmentArrangementInstanceRecord {\n");
    
    sb.append("    taxReference: ").append(toIndentedString(taxReference)).append("\n");
    sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
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

