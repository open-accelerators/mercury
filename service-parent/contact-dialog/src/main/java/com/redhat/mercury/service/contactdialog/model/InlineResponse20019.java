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
 * InlineResponse20019
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class InlineResponse20019   {
  @JsonProperty("paymentsExchangeActionTaskReference")
  private String paymentsExchangeActionTaskReference;

  @JsonProperty("paymentsExchangeActionTaskRecord")
  private Object paymentsExchangeActionTaskRecord;

  @JsonProperty("paymentsExchangeActionResponse")
  private String paymentsExchangeActionResponse;

  @JsonProperty("paymentsInstanceStatus")
  private String paymentsInstanceStatus;

  public InlineResponse20019 paymentsExchangeActionTaskReference(String paymentsExchangeActionTaskReference) {
    this.paymentsExchangeActionTaskReference = paymentsExchangeActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payments instance exchange service call 
   * @return paymentsExchangeActionTaskReference
  */
  @ApiModelProperty(example = "PEATR733989", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payments instance exchange service call ")


  public String getPaymentsExchangeActionTaskReference() {
    return paymentsExchangeActionTaskReference;
  }

  public void setPaymentsExchangeActionTaskReference(String paymentsExchangeActionTaskReference) {
    this.paymentsExchangeActionTaskReference = paymentsExchangeActionTaskReference;
  }

  public InlineResponse20019 paymentsExchangeActionTaskRecord(Object paymentsExchangeActionTaskRecord) {
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

  public InlineResponse20019 paymentsExchangeActionResponse(String paymentsExchangeActionResponse) {
    this.paymentsExchangeActionResponse = paymentsExchangeActionResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return paymentsExchangeActionResponse
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response ")


  public String getPaymentsExchangeActionResponse() {
    return paymentsExchangeActionResponse;
  }

  public void setPaymentsExchangeActionResponse(String paymentsExchangeActionResponse) {
    this.paymentsExchangeActionResponse = paymentsExchangeActionResponse;
  }

  public InlineResponse20019 paymentsInstanceStatus(String paymentsInstanceStatus) {
    this.paymentsInstanceStatus = paymentsInstanceStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Payments instance (e.g. accepted, rejected, verified) 
   * @return paymentsInstanceStatus
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Payments instance (e.g. accepted, rejected, verified) ")


  public String getPaymentsInstanceStatus() {
    return paymentsInstanceStatus;
  }

  public void setPaymentsInstanceStatus(String paymentsInstanceStatus) {
    this.paymentsInstanceStatus = paymentsInstanceStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20019 inlineResponse20019 = (InlineResponse20019) o;
    return Objects.equals(this.paymentsExchangeActionTaskReference, inlineResponse20019.paymentsExchangeActionTaskReference) &&
        Objects.equals(this.paymentsExchangeActionTaskRecord, inlineResponse20019.paymentsExchangeActionTaskRecord) &&
        Objects.equals(this.paymentsExchangeActionResponse, inlineResponse20019.paymentsExchangeActionResponse) &&
        Objects.equals(this.paymentsInstanceStatus, inlineResponse20019.paymentsInstanceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentsExchangeActionTaskReference, paymentsExchangeActionTaskRecord, paymentsExchangeActionResponse, paymentsInstanceStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20019 {\n");
    
    sb.append("    paymentsExchangeActionTaskReference: ").append(toIndentedString(paymentsExchangeActionTaskReference)).append("\n");
    sb.append("    paymentsExchangeActionTaskRecord: ").append(toIndentedString(paymentsExchangeActionTaskRecord)).append("\n");
    sb.append("    paymentsExchangeActionResponse: ").append(toIndentedString(paymentsExchangeActionResponse)).append("\n");
    sb.append("    paymentsInstanceStatus: ").append(toIndentedString(paymentsInstanceStatus)).append("\n");
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

