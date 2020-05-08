package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationBillPayMandateReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationBillPayMandateReference   {
  @JsonProperty("billPayMandateSettings")
  private String billPayMandateSettings;

  public BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationBillPayMandateReference billPayMandateSettings(String billPayMandateSettings) {
    this.billPayMandateSettings = billPayMandateSettings;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Processing settings governing bill pay transactions 
   * @return billPayMandateSettings
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Processing settings governing bill pay transactions ")


  public String getBillPayMandateSettings() {
    return billPayMandateSettings;
  }

  public void setBillPayMandateSettings(String billPayMandateSettings) {
    this.billPayMandateSettings = billPayMandateSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationBillPayMandateReference bqPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationBillPayMandateReference = (BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationBillPayMandateReference) o;
    return Objects.equals(this.billPayMandateSettings, bqPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationBillPayMandateReference.billPayMandateSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billPayMandateSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationBillPayMandateReference {\n");
    
    sb.append("    billPayMandateSettings: ").append(toIndentedString(billPayMandateSettings)).append("\n");
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

