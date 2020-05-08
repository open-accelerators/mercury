package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsBqReferenceIdUpdatePaymentsInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQPaymentsUpdateInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQPaymentsUpdateInputModel   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceReference")
  private String currentAccountFulfillmentArrangementInstanceReference;

  @JsonProperty("paymentsInstanceReference")
  private String paymentsInstanceReference;

  @JsonProperty("paymentsInstanceRecord")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsBqReferenceIdUpdatePaymentsInstanceRecord paymentsInstanceRecord;

  @JsonProperty("paymentsUpdateActionTaskRecord")
  private Object paymentsUpdateActionTaskRecord;

  @JsonProperty("paymentsUpdateActionRequest")
  private String paymentsUpdateActionRequest;

  public BQPaymentsUpdateInputModel currentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance 
   * @return currentAccountFulfillmentArrangementInstanceReference
  */
  @ApiModelProperty(example = "CAFAIR717254", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance ")


  public String getCurrentAccountFulfillmentArrangementInstanceReference() {
    return currentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
  }

  public BQPaymentsUpdateInputModel paymentsInstanceReference(String paymentsInstanceReference) {
    this.paymentsInstanceReference = paymentsInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payments instance 
   * @return paymentsInstanceReference
  */
  @ApiModelProperty(example = "PIR722727", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payments instance ")


  public String getPaymentsInstanceReference() {
    return paymentsInstanceReference;
  }

  public void setPaymentsInstanceReference(String paymentsInstanceReference) {
    this.paymentsInstanceReference = paymentsInstanceReference;
  }

  public BQPaymentsUpdateInputModel paymentsInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsBqReferenceIdUpdatePaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
    return this;
  }

  /**
   * Get paymentsInstanceRecord
   * @return paymentsInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsBqReferenceIdUpdatePaymentsInstanceRecord getPaymentsInstanceRecord() {
    return paymentsInstanceRecord;
  }

  public void setPaymentsInstanceRecord(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsBqReferenceIdUpdatePaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
  }

  public BQPaymentsUpdateInputModel paymentsUpdateActionTaskRecord(Object paymentsUpdateActionTaskRecord) {
    this.paymentsUpdateActionTaskRecord = paymentsUpdateActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return paymentsUpdateActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")

  @Valid

  public Object getPaymentsUpdateActionTaskRecord() {
    return paymentsUpdateActionTaskRecord;
  }

  public void setPaymentsUpdateActionTaskRecord(Object paymentsUpdateActionTaskRecord) {
    this.paymentsUpdateActionTaskRecord = paymentsUpdateActionTaskRecord;
  }

  public BQPaymentsUpdateInputModel paymentsUpdateActionRequest(String paymentsUpdateActionRequest) {
    this.paymentsUpdateActionRequest = paymentsUpdateActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return paymentsUpdateActionRequest
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request ")


  public String getPaymentsUpdateActionRequest() {
    return paymentsUpdateActionRequest;
  }

  public void setPaymentsUpdateActionRequest(String paymentsUpdateActionRequest) {
    this.paymentsUpdateActionRequest = paymentsUpdateActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQPaymentsUpdateInputModel bqPaymentsUpdateInputModel = (BQPaymentsUpdateInputModel) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceReference, bqPaymentsUpdateInputModel.currentAccountFulfillmentArrangementInstanceReference) &&
        Objects.equals(this.paymentsInstanceReference, bqPaymentsUpdateInputModel.paymentsInstanceReference) &&
        Objects.equals(this.paymentsInstanceRecord, bqPaymentsUpdateInputModel.paymentsInstanceRecord) &&
        Objects.equals(this.paymentsUpdateActionTaskRecord, bqPaymentsUpdateInputModel.paymentsUpdateActionTaskRecord) &&
        Objects.equals(this.paymentsUpdateActionRequest, bqPaymentsUpdateInputModel.paymentsUpdateActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceReference, paymentsInstanceReference, paymentsInstanceRecord, paymentsUpdateActionTaskRecord, paymentsUpdateActionRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQPaymentsUpdateInputModel {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceReference: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReference)).append("\n");
    sb.append("    paymentsInstanceReference: ").append(toIndentedString(paymentsInstanceReference)).append("\n");
    sb.append("    paymentsInstanceRecord: ").append(toIndentedString(paymentsInstanceRecord)).append("\n");
    sb.append("    paymentsUpdateActionTaskRecord: ").append(toIndentedString(paymentsUpdateActionTaskRecord)).append("\n");
    sb.append("    paymentsUpdateActionRequest: ").append(toIndentedString(paymentsUpdateActionRequest)).append("\n");
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

