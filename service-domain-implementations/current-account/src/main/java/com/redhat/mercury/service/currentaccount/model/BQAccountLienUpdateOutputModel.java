package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienBqReferenceIdUpdateAccountLienInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAccountLienUpdateOutputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class BQAccountLienUpdateOutputModel   {
  @JsonProperty("accountLienInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienBqReferenceIdUpdateAccountLienInstanceRecord accountLienInstanceRecord;

  @JsonProperty("accountLienUpdateActionTaskReference")
  private String accountLienUpdateActionTaskReference;

  @JsonProperty("accountLienUpdateActionTaskRecord")
  private Object accountLienUpdateActionTaskRecord;

  @JsonProperty("updateResponseRecord")
  private Object updateResponseRecord;

  public BQAccountLienUpdateOutputModel accountLienInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienBqReferenceIdUpdateAccountLienInstanceRecord accountLienInstanceRecord) {
    this.accountLienInstanceRecord = accountLienInstanceRecord;
    return this;
  }

  /**
   * Get accountLienInstanceRecord
   * @return accountLienInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienBqReferenceIdUpdateAccountLienInstanceRecord getAccountLienInstanceRecord() {
    return accountLienInstanceRecord;
  }

  public void setAccountLienInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienBqReferenceIdUpdateAccountLienInstanceRecord accountLienInstanceRecord) {
    this.accountLienInstanceRecord = accountLienInstanceRecord;
  }

  public BQAccountLienUpdateOutputModel accountLienUpdateActionTaskReference(String accountLienUpdateActionTaskReference) {
    this.accountLienUpdateActionTaskReference = accountLienUpdateActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return accountLienUpdateActionTaskReference
  */
  @ApiModelProperty(example = "ALUATR762446", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call ")


  public String getAccountLienUpdateActionTaskReference() {
    return accountLienUpdateActionTaskReference;
  }

  public void setAccountLienUpdateActionTaskReference(String accountLienUpdateActionTaskReference) {
    this.accountLienUpdateActionTaskReference = accountLienUpdateActionTaskReference;
  }

  public BQAccountLienUpdateOutputModel accountLienUpdateActionTaskRecord(Object accountLienUpdateActionTaskRecord) {
    this.accountLienUpdateActionTaskRecord = accountLienUpdateActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return accountLienUpdateActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")

  @Valid

  public Object getAccountLienUpdateActionTaskRecord() {
    return accountLienUpdateActionTaskRecord;
  }

  public void setAccountLienUpdateActionTaskRecord(Object accountLienUpdateActionTaskRecord) {
    this.accountLienUpdateActionTaskRecord = accountLienUpdateActionTaskRecord;
  }

  public BQAccountLienUpdateOutputModel updateResponseRecord(Object updateResponseRecord) {
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
    BQAccountLienUpdateOutputModel bqAccountLienUpdateOutputModel = (BQAccountLienUpdateOutputModel) o;
    return Objects.equals(this.accountLienInstanceRecord, bqAccountLienUpdateOutputModel.accountLienInstanceRecord) &&
        Objects.equals(this.accountLienUpdateActionTaskReference, bqAccountLienUpdateOutputModel.accountLienUpdateActionTaskReference) &&
        Objects.equals(this.accountLienUpdateActionTaskRecord, bqAccountLienUpdateOutputModel.accountLienUpdateActionTaskRecord) &&
        Objects.equals(this.updateResponseRecord, bqAccountLienUpdateOutputModel.updateResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountLienInstanceRecord, accountLienUpdateActionTaskReference, accountLienUpdateActionTaskRecord, updateResponseRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountLienUpdateOutputModel {\n");
    
    sb.append("    accountLienInstanceRecord: ").append(toIndentedString(accountLienInstanceRecord)).append("\n");
    sb.append("    accountLienUpdateActionTaskReference: ").append(toIndentedString(accountLienUpdateActionTaskReference)).append("\n");
    sb.append("    accountLienUpdateActionTaskRecord: ").append(toIndentedString(accountLienUpdateActionTaskRecord)).append("\n");
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

