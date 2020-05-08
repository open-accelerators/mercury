package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfiguration;
import com.redhat.mercury.service.currentaccount.model.InlineResponse20018PaymentsInstanceRecordPaymentTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20018PaymentsInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class InlineResponse20018PaymentsInstanceRecord   {
  @JsonProperty("paymentType")
  private String paymentType;

  @JsonProperty("paymentProcessingOptionDefinition")
  private String paymentProcessingOptionDefinition;

  @JsonProperty("paymentProcessingOptionSetting")
  private String paymentProcessingOptionSetting;

  @JsonProperty("paymentConfiguration")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfiguration paymentConfiguration;

  @JsonProperty("paymentTransaction")
  private InlineResponse20018PaymentsInstanceRecordPaymentTransaction paymentTransaction;

  public InlineResponse20018PaymentsInstanceRecord paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FColc8TGEeChad0JzLk7QA_1437769975  bian-reference: PaymentService.PaymentType  general-info: The type of payment transaction (e.g. customer payment, standing order, direct debit, bill pay) 
   * @return paymentType
  */
  @ApiModelProperty(value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FColc8TGEeChad0JzLk7QA_1437769975  bian-reference: PaymentService.PaymentType  general-info: The type of payment transaction (e.g. customer payment, standing order, direct debit, bill pay) ")


  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public InlineResponse20018PaymentsInstanceRecord paymentProcessingOptionDefinition(String paymentProcessingOptionDefinition) {
    this.paymentProcessingOptionDefinition = paymentProcessingOptionDefinition;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the processing option and impact (e.g. frequency and cumulative amount constraints) 
   * @return paymentProcessingOptionDefinition
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the processing option and impact (e.g. frequency and cumulative amount constraints) ")


  public String getPaymentProcessingOptionDefinition() {
    return paymentProcessingOptionDefinition;
  }

  public void setPaymentProcessingOptionDefinition(String paymentProcessingOptionDefinition) {
    this.paymentProcessingOptionDefinition = paymentProcessingOptionDefinition;
  }

  public InlineResponse20018PaymentsInstanceRecord paymentProcessingOptionSetting(String paymentProcessingOptionSetting) {
    this.paymentProcessingOptionSetting = paymentProcessingOptionSetting;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The option setting 
   * @return paymentProcessingOptionSetting
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The option setting ")


  public String getPaymentProcessingOptionSetting() {
    return paymentProcessingOptionSetting;
  }

  public void setPaymentProcessingOptionSetting(String paymentProcessingOptionSetting) {
    this.paymentProcessingOptionSetting = paymentProcessingOptionSetting;
  }

  public InlineResponse20018PaymentsInstanceRecord paymentConfiguration(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfiguration paymentConfiguration) {
    this.paymentConfiguration = paymentConfiguration;
    return this;
  }

  /**
   * Get paymentConfiguration
   * @return paymentConfiguration
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfiguration getPaymentConfiguration() {
    return paymentConfiguration;
  }

  public void setPaymentConfiguration(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfiguration paymentConfiguration) {
    this.paymentConfiguration = paymentConfiguration;
  }

  public InlineResponse20018PaymentsInstanceRecord paymentTransaction(InlineResponse20018PaymentsInstanceRecordPaymentTransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
    return this;
  }

  /**
   * Get paymentTransaction
   * @return paymentTransaction
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse20018PaymentsInstanceRecordPaymentTransaction getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(InlineResponse20018PaymentsInstanceRecordPaymentTransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20018PaymentsInstanceRecord inlineResponse20018PaymentsInstanceRecord = (InlineResponse20018PaymentsInstanceRecord) o;
    return Objects.equals(this.paymentType, inlineResponse20018PaymentsInstanceRecord.paymentType) &&
        Objects.equals(this.paymentProcessingOptionDefinition, inlineResponse20018PaymentsInstanceRecord.paymentProcessingOptionDefinition) &&
        Objects.equals(this.paymentProcessingOptionSetting, inlineResponse20018PaymentsInstanceRecord.paymentProcessingOptionSetting) &&
        Objects.equals(this.paymentConfiguration, inlineResponse20018PaymentsInstanceRecord.paymentConfiguration) &&
        Objects.equals(this.paymentTransaction, inlineResponse20018PaymentsInstanceRecord.paymentTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentType, paymentProcessingOptionDefinition, paymentProcessingOptionSetting, paymentConfiguration, paymentTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20018PaymentsInstanceRecord {\n");
    
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentProcessingOptionDefinition: ").append(toIndentedString(paymentProcessingOptionDefinition)).append("\n");
    sb.append("    paymentProcessingOptionSetting: ").append(toIndentedString(paymentProcessingOptionSetting)).append("\n");
    sb.append("    paymentConfiguration: ").append(toIndentedString(paymentConfiguration)).append("\n");
    sb.append("    paymentTransaction: ").append(toIndentedString(paymentTransaction)).append("\n");
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

