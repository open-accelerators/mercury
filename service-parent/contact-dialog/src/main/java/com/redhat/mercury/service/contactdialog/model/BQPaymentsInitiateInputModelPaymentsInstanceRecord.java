package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQPaymentsInitiateInputModelPaymentsInstanceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQPaymentsInitiateInputModelPaymentsInstanceRecord   {
  @JsonProperty("paymentType")
  private String paymentType;

  @JsonProperty("paymentDefinition")
  private String paymentDefinition;

  @JsonProperty("paymentProcessingOptionSetting")
  private String paymentProcessingOptionSetting;

  @JsonProperty("paymentConfiguration")
  private CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfiguration paymentConfiguration;

  public BQPaymentsInitiateInputModelPaymentsInstanceRecord paymentType(String paymentType) {
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

  public BQPaymentsInitiateInputModelPaymentsInstanceRecord paymentDefinition(String paymentDefinition) {
    this.paymentDefinition = paymentDefinition;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FDPCYMTGEeChad0JzLk7QA_-1131921749/elements/_FDYMUMTGEeChad0JzLk7QA_-1392150264  bian-reference: PaymentService.PaymentDefinition  general-info: Definition of the type of payment including processing rules and guidelines 
   * @return paymentDefinition
  */
  @ApiModelProperty(value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FDPCYMTGEeChad0JzLk7QA_-1131921749/elements/_FDYMUMTGEeChad0JzLk7QA_-1392150264  bian-reference: PaymentService.PaymentDefinition  general-info: Definition of the type of payment including processing rules and guidelines ")


  public String getPaymentDefinition() {
    return paymentDefinition;
  }

  public void setPaymentDefinition(String paymentDefinition) {
    this.paymentDefinition = paymentDefinition;
  }

  public BQPaymentsInitiateInputModelPaymentsInstanceRecord paymentProcessingOptionSetting(String paymentProcessingOptionSetting) {
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

  public BQPaymentsInitiateInputModelPaymentsInstanceRecord paymentConfiguration(CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdPaymentsInitiationPaymentsInstanceRecordPaymentConfiguration paymentConfiguration) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQPaymentsInitiateInputModelPaymentsInstanceRecord bqPaymentsInitiateInputModelPaymentsInstanceRecord = (BQPaymentsInitiateInputModelPaymentsInstanceRecord) o;
    return Objects.equals(this.paymentType, bqPaymentsInitiateInputModelPaymentsInstanceRecord.paymentType) &&
        Objects.equals(this.paymentDefinition, bqPaymentsInitiateInputModelPaymentsInstanceRecord.paymentDefinition) &&
        Objects.equals(this.paymentProcessingOptionSetting, bqPaymentsInitiateInputModelPaymentsInstanceRecord.paymentProcessingOptionSetting) &&
        Objects.equals(this.paymentConfiguration, bqPaymentsInitiateInputModelPaymentsInstanceRecord.paymentConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentType, paymentDefinition, paymentProcessingOptionSetting, paymentConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQPaymentsInitiateInputModelPaymentsInstanceRecord {\n");
    
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentDefinition: ").append(toIndentedString(paymentDefinition)).append("\n");
    sb.append("    paymentProcessingOptionSetting: ").append(toIndentedString(paymentProcessingOptionSetting)).append("\n");
    sb.append("    paymentConfiguration: ").append(toIndentedString(paymentConfiguration)).append("\n");
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

