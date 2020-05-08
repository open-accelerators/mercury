package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2015
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class InlineResponse2015   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceRecord")
  private InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord;

  @JsonProperty("depositsAndWithdrawalsInstanceReference")
  private String depositsAndWithdrawalsInstanceReference;

  @JsonProperty("depositsAndWithdrawalsInitiateActionReference")
  private String depositsAndWithdrawalsInitiateActionReference;

  @JsonProperty("depositsAndWithdrawalsInitiateActionRecord")
  private Object depositsAndWithdrawalsInitiateActionRecord;

  @JsonProperty("depositsAndWithdrawalsInstanceStatus")
  private String depositsAndWithdrawalsInstanceStatus;

  public InlineResponse2015 currentAccountFulfillmentArrangementInstanceRecord(InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
    return this;
  }

  /**
   * Get currentAccountFulfillmentArrangementInstanceRecord
   * @return currentAccountFulfillmentArrangementInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecord getCurrentAccountFulfillmentArrangementInstanceRecord() {
    return currentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceRecord(InlineResponse2015CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
  }

  public InlineResponse2015 depositsAndWithdrawalsInstanceReference(String depositsAndWithdrawalsInstanceReference) {
    this.depositsAndWithdrawalsInstanceReference = depositsAndWithdrawalsInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Deposits And Withdrawals instance 
   * @return depositsAndWithdrawalsInstanceReference
  */
  @ApiModelProperty(example = "DAWIR751696", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Deposits And Withdrawals instance ")


  public String getDepositsAndWithdrawalsInstanceReference() {
    return depositsAndWithdrawalsInstanceReference;
  }

  public void setDepositsAndWithdrawalsInstanceReference(String depositsAndWithdrawalsInstanceReference) {
    this.depositsAndWithdrawalsInstanceReference = depositsAndWithdrawalsInstanceReference;
  }

  public InlineResponse2015 depositsAndWithdrawalsInitiateActionReference(String depositsAndWithdrawalsInitiateActionReference) {
    this.depositsAndWithdrawalsInitiateActionReference = depositsAndWithdrawalsInitiateActionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return depositsAndWithdrawalsInitiateActionReference
  */
  @ApiModelProperty(example = "DAWIAR707121", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call ")


  public String getDepositsAndWithdrawalsInitiateActionReference() {
    return depositsAndWithdrawalsInitiateActionReference;
  }

  public void setDepositsAndWithdrawalsInitiateActionReference(String depositsAndWithdrawalsInitiateActionReference) {
    this.depositsAndWithdrawalsInitiateActionReference = depositsAndWithdrawalsInitiateActionReference;
  }

  public InlineResponse2015 depositsAndWithdrawalsInitiateActionRecord(Object depositsAndWithdrawalsInitiateActionRecord) {
    this.depositsAndWithdrawalsInitiateActionRecord = depositsAndWithdrawalsInitiateActionRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return depositsAndWithdrawalsInitiateActionRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record ")

  @Valid

  public Object getDepositsAndWithdrawalsInitiateActionRecord() {
    return depositsAndWithdrawalsInitiateActionRecord;
  }

  public void setDepositsAndWithdrawalsInitiateActionRecord(Object depositsAndWithdrawalsInitiateActionRecord) {
    this.depositsAndWithdrawalsInitiateActionRecord = depositsAndWithdrawalsInitiateActionRecord;
  }

  public InlineResponse2015 depositsAndWithdrawalsInstanceStatus(String depositsAndWithdrawalsInstanceStatus) {
    this.depositsAndWithdrawalsInstanceStatus = depositsAndWithdrawalsInstanceStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Deposits And Withdrawals instance (e.g. initialised, pending, active) 
   * @return depositsAndWithdrawalsInstanceStatus
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Deposits And Withdrawals instance (e.g. initialised, pending, active) ")


  public String getDepositsAndWithdrawalsInstanceStatus() {
    return depositsAndWithdrawalsInstanceStatus;
  }

  public void setDepositsAndWithdrawalsInstanceStatus(String depositsAndWithdrawalsInstanceStatus) {
    this.depositsAndWithdrawalsInstanceStatus = depositsAndWithdrawalsInstanceStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2015 inlineResponse2015 = (InlineResponse2015) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceRecord, inlineResponse2015.currentAccountFulfillmentArrangementInstanceRecord) &&
        Objects.equals(this.depositsAndWithdrawalsInstanceReference, inlineResponse2015.depositsAndWithdrawalsInstanceReference) &&
        Objects.equals(this.depositsAndWithdrawalsInitiateActionReference, inlineResponse2015.depositsAndWithdrawalsInitiateActionReference) &&
        Objects.equals(this.depositsAndWithdrawalsInitiateActionRecord, inlineResponse2015.depositsAndWithdrawalsInitiateActionRecord) &&
        Objects.equals(this.depositsAndWithdrawalsInstanceStatus, inlineResponse2015.depositsAndWithdrawalsInstanceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceRecord, depositsAndWithdrawalsInstanceReference, depositsAndWithdrawalsInitiateActionReference, depositsAndWithdrawalsInitiateActionRecord, depositsAndWithdrawalsInstanceStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2015 {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceRecord)).append("\n");
    sb.append("    depositsAndWithdrawalsInstanceReference: ").append(toIndentedString(depositsAndWithdrawalsInstanceReference)).append("\n");
    sb.append("    depositsAndWithdrawalsInitiateActionReference: ").append(toIndentedString(depositsAndWithdrawalsInitiateActionReference)).append("\n");
    sb.append("    depositsAndWithdrawalsInitiateActionRecord: ").append(toIndentedString(depositsAndWithdrawalsInitiateActionRecord)).append("\n");
    sb.append("    depositsAndWithdrawalsInstanceStatus: ").append(toIndentedString(depositsAndWithdrawalsInstanceStatus)).append("\n");
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

