package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdUpdateDepositsAndWithdrawalsInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20015
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class InlineResponse20015   {
  @JsonProperty("depositsAndWithdrawalsInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdUpdateDepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord;

  @JsonProperty("depositsAndWithdrawalsUpdateActionTaskReference")
  private String depositsAndWithdrawalsUpdateActionTaskReference;

  @JsonProperty("depositsAndWithdrawalsUpdateActionTaskRecord")
  private Object depositsAndWithdrawalsUpdateActionTaskRecord;

  @JsonProperty("updateResponseRecord")
  private Object updateResponseRecord;

  public InlineResponse20015 depositsAndWithdrawalsInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdUpdateDepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord) {
    this.depositsAndWithdrawalsInstanceRecord = depositsAndWithdrawalsInstanceRecord;
    return this;
  }

  /**
   * Get depositsAndWithdrawalsInstanceRecord
   * @return depositsAndWithdrawalsInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdUpdateDepositsAndWithdrawalsInstanceRecord getDepositsAndWithdrawalsInstanceRecord() {
    return depositsAndWithdrawalsInstanceRecord;
  }

  public void setDepositsAndWithdrawalsInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdDepositsandwithdrawalsBqReferenceIdUpdateDepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord) {
    this.depositsAndWithdrawalsInstanceRecord = depositsAndWithdrawalsInstanceRecord;
  }

  public InlineResponse20015 depositsAndWithdrawalsUpdateActionTaskReference(String depositsAndWithdrawalsUpdateActionTaskReference) {
    this.depositsAndWithdrawalsUpdateActionTaskReference = depositsAndWithdrawalsUpdateActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return depositsAndWithdrawalsUpdateActionTaskReference
  */
  @ApiModelProperty(example = "DAWUATR704705", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call ")


  public String getDepositsAndWithdrawalsUpdateActionTaskReference() {
    return depositsAndWithdrawalsUpdateActionTaskReference;
  }

  public void setDepositsAndWithdrawalsUpdateActionTaskReference(String depositsAndWithdrawalsUpdateActionTaskReference) {
    this.depositsAndWithdrawalsUpdateActionTaskReference = depositsAndWithdrawalsUpdateActionTaskReference;
  }

  public InlineResponse20015 depositsAndWithdrawalsUpdateActionTaskRecord(Object depositsAndWithdrawalsUpdateActionTaskRecord) {
    this.depositsAndWithdrawalsUpdateActionTaskRecord = depositsAndWithdrawalsUpdateActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return depositsAndWithdrawalsUpdateActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")

  @Valid

  public Object getDepositsAndWithdrawalsUpdateActionTaskRecord() {
    return depositsAndWithdrawalsUpdateActionTaskRecord;
  }

  public void setDepositsAndWithdrawalsUpdateActionTaskRecord(Object depositsAndWithdrawalsUpdateActionTaskRecord) {
    this.depositsAndWithdrawalsUpdateActionTaskRecord = depositsAndWithdrawalsUpdateActionTaskRecord;
  }

  public InlineResponse20015 updateResponseRecord(Object updateResponseRecord) {
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
    InlineResponse20015 inlineResponse20015 = (InlineResponse20015) o;
    return Objects.equals(this.depositsAndWithdrawalsInstanceRecord, inlineResponse20015.depositsAndWithdrawalsInstanceRecord) &&
        Objects.equals(this.depositsAndWithdrawalsUpdateActionTaskReference, inlineResponse20015.depositsAndWithdrawalsUpdateActionTaskReference) &&
        Objects.equals(this.depositsAndWithdrawalsUpdateActionTaskRecord, inlineResponse20015.depositsAndWithdrawalsUpdateActionTaskRecord) &&
        Objects.equals(this.updateResponseRecord, inlineResponse20015.updateResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositsAndWithdrawalsInstanceRecord, depositsAndWithdrawalsUpdateActionTaskReference, depositsAndWithdrawalsUpdateActionTaskRecord, updateResponseRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20015 {\n");
    
    sb.append("    depositsAndWithdrawalsInstanceRecord: ").append(toIndentedString(depositsAndWithdrawalsInstanceRecord)).append("\n");
    sb.append("    depositsAndWithdrawalsUpdateActionTaskReference: ").append(toIndentedString(depositsAndWithdrawalsUpdateActionTaskReference)).append("\n");
    sb.append("    depositsAndWithdrawalsUpdateActionTaskRecord: ").append(toIndentedString(depositsAndWithdrawalsUpdateActionTaskRecord)).append("\n");
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

