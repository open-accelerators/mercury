package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdUpdateCurrentAccountFulfillmentArrangementInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2003
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class InlineResponse2003   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdUpdateCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord;

  @JsonProperty("currentAccountFulfillmentArrangementUpdateActionTaskReference")
  private String currentAccountFulfillmentArrangementUpdateActionTaskReference;

  @JsonProperty("currentAccountFulfillmentArrangementUpdateActionTaskRecord")
  private Object currentAccountFulfillmentArrangementUpdateActionTaskRecord;

  @JsonProperty("updateResponseRecord")
  private Object updateResponseRecord;

  public InlineResponse2003 currentAccountFulfillmentArrangementInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdUpdateCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
    return this;
  }

  /**
   * Get currentAccountFulfillmentArrangementInstanceRecord
   * @return currentAccountFulfillmentArrangementInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdUpdateCurrentAccountFulfillmentArrangementInstanceRecord getCurrentAccountFulfillmentArrangementInstanceRecord() {
    return currentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdUpdateCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
  }

  public InlineResponse2003 currentAccountFulfillmentArrangementUpdateActionTaskReference(String currentAccountFulfillmentArrangementUpdateActionTaskReference) {
    this.currentAccountFulfillmentArrangementUpdateActionTaskReference = currentAccountFulfillmentArrangementUpdateActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return currentAccountFulfillmentArrangementUpdateActionTaskReference
  */
  @ApiModelProperty(example = "CAFAUATR714145", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call ")


  public String getCurrentAccountFulfillmentArrangementUpdateActionTaskReference() {
    return currentAccountFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setCurrentAccountFulfillmentArrangementUpdateActionTaskReference(String currentAccountFulfillmentArrangementUpdateActionTaskReference) {
    this.currentAccountFulfillmentArrangementUpdateActionTaskReference = currentAccountFulfillmentArrangementUpdateActionTaskReference;
  }

  public InlineResponse2003 currentAccountFulfillmentArrangementUpdateActionTaskRecord(Object currentAccountFulfillmentArrangementUpdateActionTaskRecord) {
    this.currentAccountFulfillmentArrangementUpdateActionTaskRecord = currentAccountFulfillmentArrangementUpdateActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return currentAccountFulfillmentArrangementUpdateActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")

  @Valid

  public Object getCurrentAccountFulfillmentArrangementUpdateActionTaskRecord() {
    return currentAccountFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setCurrentAccountFulfillmentArrangementUpdateActionTaskRecord(Object currentAccountFulfillmentArrangementUpdateActionTaskRecord) {
    this.currentAccountFulfillmentArrangementUpdateActionTaskRecord = currentAccountFulfillmentArrangementUpdateActionTaskRecord;
  }

  public InlineResponse2003 updateResponseRecord(Object updateResponseRecord) {
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
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceRecord, inlineResponse2003.currentAccountFulfillmentArrangementInstanceRecord) &&
        Objects.equals(this.currentAccountFulfillmentArrangementUpdateActionTaskReference, inlineResponse2003.currentAccountFulfillmentArrangementUpdateActionTaskReference) &&
        Objects.equals(this.currentAccountFulfillmentArrangementUpdateActionTaskRecord, inlineResponse2003.currentAccountFulfillmentArrangementUpdateActionTaskRecord) &&
        Objects.equals(this.updateResponseRecord, inlineResponse2003.updateResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceRecord, currentAccountFulfillmentArrangementUpdateActionTaskReference, currentAccountFulfillmentArrangementUpdateActionTaskRecord, updateResponseRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceRecord)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementUpdateActionTaskReference: ").append(toIndentedString(currentAccountFulfillmentArrangementUpdateActionTaskReference)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementUpdateActionTaskRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementUpdateActionTaskRecord)).append("\n");
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

