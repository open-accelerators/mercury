package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfigurationBillPayMandateReference;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfigurationDirectDebitMandateReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfiguration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfiguration   {
  @JsonProperty("paymentSchedule")
  private String paymentSchedule;

  @JsonProperty("directDebitMandateReference")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfigurationDirectDebitMandateReference directDebitMandateReference;

  @JsonProperty("billPayMandateReference")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfigurationBillPayMandateReference billPayMandateReference;

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfiguration paymentSchedule(String paymentSchedule) {
    this.paymentSchedule = paymentSchedule;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E7CIosTGEeChad0JzLk7QA_1664636213/elements/_E7CIpMTGEeChad0JzLk7QA_-1145087031  bian-reference: StandingOrderArrangement.StandingOrderSchedule  general-info: Processing schedule for repeating payments for standing orders (e.g. start date, end, period, number/cycles). Note this triggers an internal execution call as necessary 
   * @return paymentSchedule
  */
  @ApiModelProperty(value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E7CIosTGEeChad0JzLk7QA_1664636213/elements/_E7CIpMTGEeChad0JzLk7QA_-1145087031  bian-reference: StandingOrderArrangement.StandingOrderSchedule  general-info: Processing schedule for repeating payments for standing orders (e.g. start date, end, period, number/cycles). Note this triggers an internal execution call as necessary ")


  public String getPaymentSchedule() {
    return paymentSchedule;
  }

  public void setPaymentSchedule(String paymentSchedule) {
    this.paymentSchedule = paymentSchedule;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfiguration directDebitMandateReference(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfigurationDirectDebitMandateReference directDebitMandateReference) {
    this.directDebitMandateReference = directDebitMandateReference;
    return this;
  }

  /**
   * Get directDebitMandateReference
   * @return directDebitMandateReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfigurationDirectDebitMandateReference getDirectDebitMandateReference() {
    return directDebitMandateReference;
  }

  public void setDirectDebitMandateReference(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfigurationDirectDebitMandateReference directDebitMandateReference) {
    this.directDebitMandateReference = directDebitMandateReference;
  }

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfiguration billPayMandateReference(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfigurationBillPayMandateReference billPayMandateReference) {
    this.billPayMandateReference = billPayMandateReference;
    return this;
  }

  /**
   * Get billPayMandateReference
   * @return billPayMandateReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfigurationBillPayMandateReference getBillPayMandateReference() {
    return billPayMandateReference;
  }

  public void setBillPayMandateReference(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfigurationBillPayMandateReference billPayMandateReference) {
    this.billPayMandateReference = billPayMandateReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfiguration currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfiguration = (CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfiguration) o;
    return Objects.equals(this.paymentSchedule, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfiguration.paymentSchedule) &&
        Objects.equals(this.directDebitMandateReference, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfiguration.directDebitMandateReference) &&
        Objects.equals(this.billPayMandateReference, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfiguration.billPayMandateReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentSchedule, directDebitMandateReference, billPayMandateReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfiguration {\n");
    
    sb.append("    paymentSchedule: ").append(toIndentedString(paymentSchedule)).append("\n");
    sb.append("    directDebitMandateReference: ").append(toIndentedString(directDebitMandateReference)).append("\n");
    sb.append("    billPayMandateReference: ").append(toIndentedString(billPayMandateReference)).append("\n");
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

