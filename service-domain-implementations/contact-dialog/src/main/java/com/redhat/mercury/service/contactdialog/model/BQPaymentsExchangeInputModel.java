package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienBqReferenceIdExchangeAccountLienExchangeActionRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQPaymentsExchangeInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQPaymentsExchangeInputModel   {
  @JsonProperty("currentAccountFulfillmentArrangementInstanceReference")
  private String currentAccountFulfillmentArrangementInstanceReference;

  @JsonProperty("paymentsInstanceReference")
  private String paymentsInstanceReference;

  @JsonProperty("paymentsExchangeActionTaskRecord")
  private Object paymentsExchangeActionTaskRecord;

  @JsonProperty("paymentsExchangeActionRequest")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienBqReferenceIdExchangeAccountLienExchangeActionRequest paymentsExchangeActionRequest;

  public BQPaymentsExchangeInputModel currentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance 
   * @return currentAccountFulfillmentArrangementInstanceReference
  */
  @ApiModelProperty(example = "CAFAIR744541", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Current Account Fulfillment Arrangement instance ")


  public String getCurrentAccountFulfillmentArrangementInstanceReference() {
    return currentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCurrentAccountFulfillmentArrangementInstanceReference(String currentAccountFulfillmentArrangementInstanceReference) {
    this.currentAccountFulfillmentArrangementInstanceReference = currentAccountFulfillmentArrangementInstanceReference;
  }

  public BQPaymentsExchangeInputModel paymentsInstanceReference(String paymentsInstanceReference) {
    this.paymentsInstanceReference = paymentsInstanceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payments instance 
   * @return paymentsInstanceReference
  */
  @ApiModelProperty(example = "PIR757881", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payments instance ")


  public String getPaymentsInstanceReference() {
    return paymentsInstanceReference;
  }

  public void setPaymentsInstanceReference(String paymentsInstanceReference) {
    this.paymentsInstanceReference = paymentsInstanceReference;
  }

  public BQPaymentsExchangeInputModel paymentsExchangeActionTaskRecord(Object paymentsExchangeActionTaskRecord) {
    this.paymentsExchangeActionTaskRecord = paymentsExchangeActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return paymentsExchangeActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record ")

  @Valid

  public Object getPaymentsExchangeActionTaskRecord() {
    return paymentsExchangeActionTaskRecord;
  }

  public void setPaymentsExchangeActionTaskRecord(Object paymentsExchangeActionTaskRecord) {
    this.paymentsExchangeActionTaskRecord = paymentsExchangeActionTaskRecord;
  }

  public BQPaymentsExchangeInputModel paymentsExchangeActionRequest(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienBqReferenceIdExchangeAccountLienExchangeActionRequest paymentsExchangeActionRequest) {
    this.paymentsExchangeActionRequest = paymentsExchangeActionRequest;
    return this;
  }

  /**
   * Get paymentsExchangeActionRequest
   * @return paymentsExchangeActionRequest
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienBqReferenceIdExchangeAccountLienExchangeActionRequest getPaymentsExchangeActionRequest() {
    return paymentsExchangeActionRequest;
  }

  public void setPaymentsExchangeActionRequest(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdAccountlienBqReferenceIdExchangeAccountLienExchangeActionRequest paymentsExchangeActionRequest) {
    this.paymentsExchangeActionRequest = paymentsExchangeActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQPaymentsExchangeInputModel bqPaymentsExchangeInputModel = (BQPaymentsExchangeInputModel) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementInstanceReference, bqPaymentsExchangeInputModel.currentAccountFulfillmentArrangementInstanceReference) &&
        Objects.equals(this.paymentsInstanceReference, bqPaymentsExchangeInputModel.paymentsInstanceReference) &&
        Objects.equals(this.paymentsExchangeActionTaskRecord, bqPaymentsExchangeInputModel.paymentsExchangeActionTaskRecord) &&
        Objects.equals(this.paymentsExchangeActionRequest, bqPaymentsExchangeInputModel.paymentsExchangeActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementInstanceReference, paymentsInstanceReference, paymentsExchangeActionTaskRecord, paymentsExchangeActionRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQPaymentsExchangeInputModel {\n");
    
    sb.append("    currentAccountFulfillmentArrangementInstanceReference: ").append(toIndentedString(currentAccountFulfillmentArrangementInstanceReference)).append("\n");
    sb.append("    paymentsInstanceReference: ").append(toIndentedString(paymentsInstanceReference)).append("\n");
    sb.append("    paymentsExchangeActionTaskRecord: ").append(toIndentedString(paymentsExchangeActionTaskRecord)).append("\n");
    sb.append("    paymentsExchangeActionRequest: ").append(toIndentedString(paymentsExchangeActionRequest)).append("\n");
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

