package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.InlineResponse2011CurrentAccountFulfillmentArrangementInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2011
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class InlineResponse2011   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceReference")
  private String currentAccountFulfillmentArrangementInstanceReference;

  @JsonProperty("currentAccountFulfillmentArrangementInitiateActionReference")
  private String currentAccountFulfillmentArrangementInitiateActionReference;

  @JsonProperty("currentAccountFulfillmentArrangementInitiateActionRecord")
  private Object currentAccountFulfillmentArrangementInitiateActionRecord;

  @JsonProperty("currentAccountFulfillmentArrangementInstanceStatus")
  private String currentAccountFulfillmentArrangementInstanceStatus;

  @JsonProperty("currentAccountFulfillmentArrangementInstanceRecord")
  private InlineResponse2011CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord;

  public InlineResponse2011 currentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Current Account Fulfillment Arrangement instance 
   * @return currentAccountFulfillmentArrangementInstanceReference
  */
  @ApiModelProperty(example = "CAFAIR796897", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Current Account Fulfillment Arrangement instance ")


  public String getCurrentAccountFulfillmentArrangementInstanceReference() {
    return currentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
  }

  public InlineResponse2011 currentAccountFulfillmentArrangementInitiateActionReference(String currentAccountFulfillmentArrangementInitiateActionReference) {
    this.currentAccountFulfillmentArrangementInitiateActionReference = currentAccountFulfillmentArrangementInitiateActionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return currentAccountFulfillmentArrangementInitiateActionReference
  */
  @ApiModelProperty(example = "CAFAIAR775759", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call ")


  public String getCurrentAccountFulfillmentArrangementInitiateActionReference() {
    return currentAccountFulfillmentArrangementInitiateActionReference;
  }

  public void setCurrentAccountFulfillmentArrangementInitiateActionReference(String currentAccountFulfillmentArrangementInitiateActionReference) {
    this.currentAccountFulfillmentArrangementInitiateActionReference = currentAccountFulfillmentArrangementInitiateActionReference;
  }

  public InlineResponse2011 currentAccountFulfillmentArrangementInitiateActionRecord(Object currentAccountFulfillmentArrangementInitiateActionRecord) {
    this.currentAccountFulfillmentArrangementInitiateActionRecord = currentAccountFulfillmentArrangementInitiateActionRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return currentAccountFulfillmentArrangementInitiateActionRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record ")

  @Valid

  public Object getCurrentAccountFulfillmentArrangementInitiateActionRecord() {
    return currentAccountFulfillmentArrangementInitiateActionRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInitiateActionRecord(Object currentAccountFulfillmentArrangementInitiateActionRecord) {
    this.currentAccountFulfillmentArrangementInitiateActionRecord = currentAccountFulfillmentArrangementInitiateActionRecord;
  }

  public InlineResponse2011 currentAccountFulfillmentArrangementInstanceStatus(String currentAccountFulfillmentArrangementInstanceStatus) {
    this.currentAccountFulfillmentArrangementInstanceStatus = currentAccountFulfillmentArrangementInstanceStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Current Account Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return currentAccountFulfillmentArrangementInstanceStatus
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Current Account Fulfillment Arrangement instance (e.g. initialised, pending, active) ")


  public String getCurrentAccountFulfillmentArrangementInstanceStatus() {
    return currentAccountFulfillmentArrangementInstanceStatus;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceStatus(String currentAccountFulfillmentArrangementInstanceStatus) {
    this.currentAccountFulfillmentArrangementInstanceStatus = currentAccountFulfillmentArrangementInstanceStatus;
  }

  public InlineResponse2011 currentAccountFulfillmentArrangementInstanceRecord(InlineResponse2011CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
    return this;
  }

  /**
   * Get currentAccountFulfillmentArrangementInstanceRecord
   * @return currentAccountFulfillmentArrangementInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2011CurrentAccountFulfillmentArrangementInstanceRecord getCurrentAccountFulfillmentArrangementInstanceRecord() {
    return currentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceRecord(InlineResponse2011CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2011 inlineResponse2011 = (InlineResponse2011) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceReference, inlineResponse2011.currentAccountFulfillmentArrangementInstanceReference) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInitiateActionReference, inlineResponse2011.currentAccountFulfillmentArrangementInitiateActionReference) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInitiateActionRecord, inlineResponse2011.currentAccountFulfillmentArrangementInitiateActionRecord) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInstanceStatus, inlineResponse2011.currentAccountFulfillmentArrangementInstanceStatus) &&
        Objects.equals(this.currentAccountFulfillmentArrangementInstanceRecord, inlineResponse2011.currentAccountFulfillmentArrangementInstanceRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceReference, currentAccountFulfillmentArrangementInitiateActionReference, currentAccountFulfillmentArrangementInitiateActionRecord, currentAccountFulfillmentArrangementInstanceStatus, currentAccountFulfillmentArrangementInstanceRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2011 {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceReference: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReference)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInitiateActionReference: ").append(toIndentedString(currentAccountFulfillmentArrangementInitiateActionReference)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInitiateActionRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementInitiateActionRecord)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInstanceStatus: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceStatus)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementInstanceRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceRecord)).append("\n");
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

