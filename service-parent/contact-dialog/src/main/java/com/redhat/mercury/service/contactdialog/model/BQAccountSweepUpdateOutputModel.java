package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAccountSweepUpdateOutputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQAccountSweepUpdateOutputModel   {
  @JsonProperty("accountSweepInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecord accountSweepInstanceRecord;

  @JsonProperty("accountSweepUpdateActionTaskReference")
  private String accountSweepUpdateActionTaskReference;

  @JsonProperty("accountSweepUpdateActionTaskRecord")
  private Object accountSweepUpdateActionTaskRecord;

  @JsonProperty("updateResponseRecord")
  private Object updateResponseRecord;

  public BQAccountSweepUpdateOutputModel accountSweepInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecord accountSweepInstanceRecord) {
    this.accountSweepInstanceRecord = accountSweepInstanceRecord;
    return this;
  }

  /**
   * Get accountSweepInstanceRecord
   * @return accountSweepInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecord getAccountSweepInstanceRecord() {
    return accountSweepInstanceRecord;
  }

  public void setAccountSweepInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountsweepBqReferenceIdUpdateAccountSweepInstanceRecord accountSweepInstanceRecord) {
    this.accountSweepInstanceRecord = accountSweepInstanceRecord;
  }

  public BQAccountSweepUpdateOutputModel accountSweepUpdateActionTaskReference(String accountSweepUpdateActionTaskReference) {
    this.accountSweepUpdateActionTaskReference = accountSweepUpdateActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return accountSweepUpdateActionTaskReference
  */
  @ApiModelProperty(example = "ASUATR719621", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call ")


  public String getAccountSweepUpdateActionTaskReference() {
    return accountSweepUpdateActionTaskReference;
  }

  public void setAccountSweepUpdateActionTaskReference(String accountSweepUpdateActionTaskReference) {
    this.accountSweepUpdateActionTaskReference = accountSweepUpdateActionTaskReference;
  }

  public BQAccountSweepUpdateOutputModel accountSweepUpdateActionTaskRecord(Object accountSweepUpdateActionTaskRecord) {
    this.accountSweepUpdateActionTaskRecord = accountSweepUpdateActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return accountSweepUpdateActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")

  @Valid

  public Object getAccountSweepUpdateActionTaskRecord() {
    return accountSweepUpdateActionTaskRecord;
  }

  public void setAccountSweepUpdateActionTaskRecord(Object accountSweepUpdateActionTaskRecord) {
    this.accountSweepUpdateActionTaskRecord = accountSweepUpdateActionTaskRecord;
  }

  public BQAccountSweepUpdateOutputModel updateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response ")

  @Valid

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountSweepUpdateOutputModel bqAccountSweepUpdateOutputModel = (BQAccountSweepUpdateOutputModel) o;
    return Objects.equals(this.accountSweepInstanceRecord, bqAccountSweepUpdateOutputModel.accountSweepInstanceRecord) &&
        Objects.equals(this.accountSweepUpdateActionTaskReference, bqAccountSweepUpdateOutputModel.accountSweepUpdateActionTaskReference) &&
        Objects.equals(this.accountSweepUpdateActionTaskRecord, bqAccountSweepUpdateOutputModel.accountSweepUpdateActionTaskRecord) &&
        Objects.equals(this.updateResponseRecord, bqAccountSweepUpdateOutputModel.updateResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSweepInstanceRecord, accountSweepUpdateActionTaskReference, accountSweepUpdateActionTaskRecord, updateResponseRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountSweepUpdateOutputModel {\n");
    
    sb.append("    accountSweepInstanceRecord: ").append(toIndentedString(accountSweepInstanceRecord)).append("\n");
    sb.append("    accountSweepUpdateActionTaskReference: ").append(toIndentedString(accountSweepUpdateActionTaskReference)).append("\n");
    sb.append("    accountSweepUpdateActionTaskRecord: ").append(toIndentedString(accountSweepUpdateActionTaskRecord)).append("\n");
    sb.append("    updateResponseRecord: ").append(toIndentedString(updateResponseRecord)).append("\n");
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

