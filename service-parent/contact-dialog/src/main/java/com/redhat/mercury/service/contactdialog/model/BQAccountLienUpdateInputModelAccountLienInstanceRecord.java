package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAccountLienUpdateInputModelAccountLienInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQAccountLienUpdateInputModelAccountLienInstanceRecord   {
  @JsonProperty("lienType")
  private String lienType;

  @JsonProperty("lienProcessingOption")
  private String lienProcessingOption;

  @JsonProperty("lienRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord lienRecord;

  public BQAccountLienUpdateInputModelAccountLienInstanceRecord lienType(String lienType) {
    this.lienType = lienType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of lien (e.g. final, pending) 
   * @return lienType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of lien (e.g. final, pending) ")


  public String getLienType() {
    return lienType;
  }

  public void setLienType(String lienType) {
    this.lienType = lienType;
  }

  public BQAccountLienUpdateInputModelAccountLienInstanceRecord lienProcessingOption(String lienProcessingOption) {
    this.lienProcessingOption = lienProcessingOption;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The processing option applied to the lien 
   * @return lienProcessingOption
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The processing option applied to the lien ")


  public String getLienProcessingOption() {
    return lienProcessingOption;
  }

  public void setLienProcessingOption(String lienProcessingOption) {
    this.lienProcessingOption = lienProcessingOption;
  }

  public BQAccountLienUpdateInputModelAccountLienInstanceRecord lienRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord lienRecord) {
    this.lienRecord = lienRecord;
    return this;
  }

  /**
   * Get lienRecord
   * @return lienRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord getLienRecord() {
    return lienRecord;
  }

  public void setLienRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienInitiationAccountLienInstanceRecordLienRecord lienRecord) {
    this.lienRecord = lienRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountLienUpdateInputModelAccountLienInstanceRecord bqAccountLienUpdateInputModelAccountLienInstanceRecord = (BQAccountLienUpdateInputModelAccountLienInstanceRecord) o;
    return Objects.equals(this.lienType, bqAccountLienUpdateInputModelAccountLienInstanceRecord.lienType) &&
        Objects.equals(this.lienProcessingOption, bqAccountLienUpdateInputModelAccountLienInstanceRecord.lienProcessingOption) &&
        Objects.equals(this.lienRecord, bqAccountLienUpdateInputModelAccountLienInstanceRecord.lienRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lienType, lienProcessingOption, lienRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountLienUpdateInputModelAccountLienInstanceRecord {\n");
    
    sb.append("    lienType: ").append(toIndentedString(lienType)).append("\n");
    sb.append("    lienProcessingOption: ").append(toIndentedString(lienProcessingOption)).append("\n");
    sb.append("    lienRecord: ").append(toIndentedString(lienRecord)).append("\n");
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

