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
 * BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationDirectDebitMandateReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationDirectDebitMandateReference   {
  @JsonProperty("directDebitMandateSettings")
  private String directDebitMandateSettings;

  public BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationDirectDebitMandateReference directDebitMandateSettings(String directDebitMandateSettings) {
    this.directDebitMandateSettings = directDebitMandateSettings;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Processing settings governing direct debits 
   * @return directDebitMandateSettings
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Processing settings governing direct debits ")


  public String getDirectDebitMandateSettings() {
    return directDebitMandateSettings;
  }

  public void setDirectDebitMandateSettings(String directDebitMandateSettings) {
    this.directDebitMandateSettings = directDebitMandateSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationDirectDebitMandateReference bqPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationDirectDebitMandateReference = (BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationDirectDebitMandateReference) o;
    return Objects.equals(this.directDebitMandateSettings, bqPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationDirectDebitMandateReference.directDebitMandateSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDebitMandateSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfigurationDirectDebitMandateReference {\n");
    
    sb.append("    directDebitMandateSettings: ").append(toIndentedString(directDebitMandateSettings)).append("\n");
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

