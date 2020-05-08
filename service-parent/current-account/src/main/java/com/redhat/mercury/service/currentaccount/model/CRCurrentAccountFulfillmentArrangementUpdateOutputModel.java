package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdUpdateCurrentAccountFulfillmentArrangementInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CRCurrentAccountFulfillmentArrangementUpdateOutputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class CRCurrentAccountFulfillmentArrangementUpdateOutputModel   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdUpdateCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord;

  @JsonProperty("currentAccountFulfillmentArrangementUpdateActionTaskReference")
  private String currentAccountFulfillmentArrangementUpdateActionTaskReference;

  @JsonProperty("currentAccountFulfillmentArrangementUpdateActionTaskRecord")
  private Object currentAccountFulfillmentArrangementUpdateActionTaskRecord;

  @JsonProperty("updateResponseRecord")
  private Object updateResponseRecord;

  public CRCurrentAccountFulfillmentArrangementUpdateOutputModel currentAccountFulfillmentArrangementInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdUpdateCurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
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

  public CRCurrentAccountFulfillmentArrangementUpdateOutputModel currentAccountFulfillmentArrangementUpdateActionTaskReference(String currentAccountFulfillmentArrangementUpdateActionTaskReference) {
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

  public CRCurrentAccountFulfillmentArrangementUpdateOutputModel currentAccountFulfillmentArrangementUpdateActionTaskRecord(Object currentAccountFulfillmentArrangementUpdateActionTaskRecord) {
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

  public CRCurrentAccountFulfillmentArrangementUpdateOutputModel updateResponseRecord(Object updateResponseRecord) {
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
    CRCurrentAccountFulfillmentArrangementUpdateOutputModel crCurrentAccountFulfillmentArrangementUpdateOutputModel = (CRCurrentAccountFulfillmentArrangementUpdateOutputModel) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceRecord, crCurrentAccountFulfillmentArrangementUpdateOutputModel.currentAccountFulfillmentArrangementInstanceRecord) &&
        Objects.equals(this.currentAccountFulfillmentArrangementUpdateActionTaskReference, crCurrentAccountFulfillmentArrangementUpdateOutputModel.currentAccountFulfillmentArrangementUpdateActionTaskReference) &&
        Objects.equals(this.currentAccountFulfillmentArrangementUpdateActionTaskRecord, crCurrentAccountFulfillmentArrangementUpdateOutputModel.currentAccountFulfillmentArrangementUpdateActionTaskRecord) &&
        Objects.equals(this.updateResponseRecord, crCurrentAccountFulfillmentArrangementUpdateOutputModel.updateResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceRecord, currentAccountFulfillmentArrangementUpdateActionTaskReference, currentAccountFulfillmentArrangementUpdateActionTaskRecord, updateResponseRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCurrentAccountFulfillmentArrangementUpdateOutputModel {\n");
    
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

