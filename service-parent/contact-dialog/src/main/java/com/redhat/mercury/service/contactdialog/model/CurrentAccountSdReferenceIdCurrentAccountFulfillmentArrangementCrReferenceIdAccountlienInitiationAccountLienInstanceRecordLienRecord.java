package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord   {
  @JsonProperty("lienOriginator")
  private String lienOriginator;

  @JsonProperty("lienPurpose")
  private String lienPurpose;

  @JsonProperty("lienAmount")
  private String lienAmount;

  @JsonProperty("lienStartDate")
  private String lienStartDate;

  @JsonProperty("lienExpiryDate")
  private String lienExpiryDate;

  @JsonProperty("lienStatus")
  private String lienStatus;

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord lienOriginator(String lienOriginator) {
    this.lienOriginator = lienOriginator;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The party requesting the lien 
   * @return lienOriginator
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The party requesting the lien ")


  public String getLienOriginator() {
    return lienOriginator;
  }

  public void setLienOriginator(String lienOriginator) {
    this.lienOriginator = lienOriginator;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord lienPurpose(String lienPurpose) {
    this.lienPurpose = lienPurpose;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The purpose or associated facility linked to the lien 
   * @return lienPurpose
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The purpose or associated facility linked to the lien ")


  public String getLienPurpose() {
    return lienPurpose;
  }

  public void setLienPurpose(String lienPurpose) {
    this.lienPurpose = lienPurpose;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord lienAmount(String lienAmount) {
    this.lienAmount = lienAmount;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The amount being blocked 
   * @return lienAmount
  */
  @ApiModelProperty(example = "USD 250", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The amount being blocked ")


  public String getLienAmount() {
    return lienAmount;
  }

  public void setLienAmount(String lienAmount) {
    this.lienAmount = lienAmount;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord lienStartDate(String lienStartDate) {
    this.lienStartDate = lienStartDate;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date the lien is enforced 
   * @return lienStartDate
  */
  @ApiModelProperty(example = "09-22-2018", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date the lien is enforced ")


  public String getLienStartDate() {
    return lienStartDate;
  }

  public void setLienStartDate(String lienStartDate) {
    this.lienStartDate = lienStartDate;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord lienExpiryDate(String lienExpiryDate) {
    this.lienExpiryDate = lienExpiryDate;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date the lien is removed 
   * @return lienExpiryDate
  */
  @ApiModelProperty(example = "09-22-2018", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date the lien is removed ")


  public String getLienExpiryDate() {
    return lienExpiryDate;
  }

  public void setLienExpiryDate(String lienExpiryDate) {
    this.lienExpiryDate = lienExpiryDate;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord lienStatus(String lienStatus) {
    this.lienStatus = lienStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status on the lien 
   * @return lienStatus
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status on the lien ")


  public String getLienStatus() {
    return lienStatus;
  }

  public void setLienStatus(String lienStatus) {
    this.lienStatus = lienStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord = (CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord) o;
    return Objects.equals(this.lienOriginator, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord.lienOriginator) &&
        Objects.equals(this.lienPurpose, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord.lienPurpose) &&
        Objects.equals(this.lienAmount, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord.lienAmount) &&
        Objects.equals(this.lienStartDate, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord.lienStartDate) &&
        Objects.equals(this.lienExpiryDate, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord.lienExpiryDate) &&
        Objects.equals(this.lienStatus, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord.lienStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lienOriginator, lienPurpose, lienAmount, lienStartDate, lienExpiryDate, lienStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord {\n");
    
    sb.append("    lienOriginator: ").append(toIndentedString(lienOriginator)).append("\n");
    sb.append("    lienPurpose: ").append(toIndentedString(lienPurpose)).append("\n");
    sb.append("    lienAmount: ").append(toIndentedString(lienAmount)).append("\n");
    sb.append("    lienStartDate: ").append(toIndentedString(lienStartDate)).append("\n");
    sb.append("    lienExpiryDate: ").append(toIndentedString(lienExpiryDate)).append("\n");
    sb.append("    lienStatus: ").append(toIndentedString(lienStatus)).append("\n");
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

