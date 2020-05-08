package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2016CurrentAccountFulfillmentArrangementInstanceRecord;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2016PaymentsInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQPaymentsInitiateOutputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQPaymentsInitiateOutputModel   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceRecord")
  private InlineResponse2016CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord;

  @JsonProperty("paymentsInstanceReference")
  private String paymentsInstanceReference;

  @JsonProperty("paymentsInitiateActionReference")
  private String paymentsInitiateActionReference;

  @JsonProperty("paymentsInitiateActionRecord")
  private Object paymentsInitiateActionRecord;

  @JsonProperty("paymentsInstanceStatus")
  private String paymentsInstanceStatus;

  @JsonProperty("paymentsInstanceRecord")
  private InlineResponse2016PaymentsInstanceRecord paymentsInstanceRecord;

  public BQPaymentsInitiateOutputModel currentAccountFulfillmentArrangementInstanceRecord(InlineResponse2016CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
    return this;
  }

  /**
   * Get currentAccountFulfillmentArrangementInstanceRecord
   * @return currentAccountFulfillmentArrangementInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2016CurrentAccountFulfillmentArrangementInstanceRecord getCurrentAccountFulfillmentArrangementInstanceRecord() {
    return currentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceRecord(InlineResponse2016CurrentAccountFulfillmentArrangementInstanceRecord currentAccountFulfillmentArrangementInstanceRecord) {
    this.currentAccountFulfillmentArrangementInstanceRecord = currentAccountFulfillmentArrangementInstanceRecord;
  }

  public BQPaymentsInitiateOutputModel paymentsInstanceReference(String paymentsInstanceReference) {
    this.paymentsInstanceReference = paymentsInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payments instance 
   * @return paymentsInstanceReference
  */
  @ApiModelProperty(example = "PIR701681", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payments instance ")


  public String getPaymentsInstanceReference() {
    return paymentsInstanceReference;
  }

  public void setPaymentsInstanceReference(String paymentsInstanceReference) {
    this.paymentsInstanceReference = paymentsInstanceReference;
  }

  public BQPaymentsInitiateOutputModel paymentsInitiateActionReference(String paymentsInitiateActionReference) {
    this.paymentsInitiateActionReference = paymentsInitiateActionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return paymentsInitiateActionReference
  */
  @ApiModelProperty(example = "PIAR742876", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call ")


  public String getPaymentsInitiateActionReference() {
    return paymentsInitiateActionReference;
  }

  public void setPaymentsInitiateActionReference(String paymentsInitiateActionReference) {
    this.paymentsInitiateActionReference = paymentsInitiateActionReference;
  }

  public BQPaymentsInitiateOutputModel paymentsInitiateActionRecord(Object paymentsInitiateActionRecord) {
    this.paymentsInitiateActionRecord = paymentsInitiateActionRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return paymentsInitiateActionRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record ")

  @Valid

  public Object getPaymentsInitiateActionRecord() {
    return paymentsInitiateActionRecord;
  }

  public void setPaymentsInitiateActionRecord(Object paymentsInitiateActionRecord) {
    this.paymentsInitiateActionRecord = paymentsInitiateActionRecord;
  }

  public BQPaymentsInitiateOutputModel paymentsInstanceStatus(String paymentsInstanceStatus) {
    this.paymentsInstanceStatus = paymentsInstanceStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Payments instance (e.g. initialised, pending, active) 
   * @return paymentsInstanceStatus
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Payments instance (e.g. initialised, pending, active) ")


  public String getPaymentsInstanceStatus() {
    return paymentsInstanceStatus;
  }

  public void setPaymentsInstanceStatus(String paymentsInstanceStatus) {
    this.paymentsInstanceStatus = paymentsInstanceStatus;
  }

  public BQPaymentsInitiateOutputModel paymentsInstanceRecord(InlineResponse2016PaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
    return this;
  }

  /**
   * Get paymentsInstanceRecord
   * @return paymentsInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2016PaymentsInstanceRecord getPaymentsInstanceRecord() {
    return paymentsInstanceRecord;
  }

  public void setPaymentsInstanceRecord(InlineResponse2016PaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQPaymentsInitiateOutputModel bqPaymentsInitiateOutputModel = (BQPaymentsInitiateOutputModel) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceRecord, bqPaymentsInitiateOutputModel.currentAccountFulfillmentArrangementInstanceRecord) &&
        Objects.equals(this.paymentsInstanceReference, bqPaymentsInitiateOutputModel.paymentsInstanceReference) &&
        Objects.equals(this.paymentsInitiateActionReference, bqPaymentsInitiateOutputModel.paymentsInitiateActionReference) &&
        Objects.equals(this.paymentsInitiateActionRecord, bqPaymentsInitiateOutputModel.paymentsInitiateActionRecord) &&
        Objects.equals(this.paymentsInstanceStatus, bqPaymentsInitiateOutputModel.paymentsInstanceStatus) &&
        Objects.equals(this.paymentsInstanceRecord, bqPaymentsInitiateOutputModel.paymentsInstanceRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceRecord, paymentsInstanceReference, paymentsInitiateActionReference, paymentsInitiateActionRecord, paymentsInstanceStatus, paymentsInstanceRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQPaymentsInitiateOutputModel {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceRecord)).append("\n");
    sb.append("    paymentsInstanceReference: ").append(toIndentedString(paymentsInstanceReference)).append("\n");
    sb.append("    paymentsInitiateActionReference: ").append(toIndentedString(paymentsInitiateActionReference)).append("\n");
    sb.append("    paymentsInitiateActionRecord: ").append(toIndentedString(paymentsInitiateActionRecord)).append("\n");
    sb.append("    paymentsInstanceStatus: ").append(toIndentedString(paymentsInstanceStatus)).append("\n");
    sb.append("    paymentsInstanceRecord: ").append(toIndentedString(paymentsInstanceRecord)).append("\n");
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

