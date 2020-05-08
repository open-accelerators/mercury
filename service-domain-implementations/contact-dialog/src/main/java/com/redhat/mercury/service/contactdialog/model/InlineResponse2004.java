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
 * InlineResponse2004
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class InlineResponse2004   {
  @JsonProperty("currentAccountFulfillmentArrangementControlActionTaskReference")
  private String currentAccountFulfillmentArrangementControlActionTaskReference;

  @JsonProperty("currentAccountFulfillmentArrangementControlActionTaskRecord")
  private Object currentAccountFulfillmentArrangementControlActionTaskRecord;

  @JsonProperty("currentAccountFulfillmentArrangementControlActionResponse")
  private String currentAccountFulfillmentArrangementControlActionResponse;

  public InlineResponse2004 currentAccountFulfillmentArrangementControlActionTaskReference(String currentAccountFulfillmentArrangementControlActionTaskReference) {
    this.currentAccountFulfillmentArrangementControlActionTaskReference = currentAccountFulfillmentArrangementControlActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Current Account Fulfillment Arrangement instance control processing service call 
   * @return currentAccountFulfillmentArrangementControlActionTaskReference
  */
  @ApiModelProperty(example = "CAFACATR769674", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Current Account Fulfillment Arrangement instance control processing service call ")


  public String getCurrentAccountFulfillmentArrangementControlActionTaskReference() {
    return currentAccountFulfillmentArrangementControlActionTaskReference;
  }

  public void setCurrentAccountFulfillmentArrangementControlActionTaskReference(String currentAccountFulfillmentArrangementControlActionTaskReference) {
    this.currentAccountFulfillmentArrangementControlActionTaskReference = currentAccountFulfillmentArrangementControlActionTaskReference;
  }

  public InlineResponse2004 currentAccountFulfillmentArrangementControlActionTaskRecord(Object currentAccountFulfillmentArrangementControlActionTaskRecord) {
    this.currentAccountFulfillmentArrangementControlActionTaskRecord = currentAccountFulfillmentArrangementControlActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return currentAccountFulfillmentArrangementControlActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record ")

  @Valid

  public Object getCurrentAccountFulfillmentArrangementControlActionTaskRecord() {
    return currentAccountFulfillmentArrangementControlActionTaskRecord;
  }

  public void setCurrentAccountFulfillmentArrangementControlActionTaskRecord(Object currentAccountFulfillmentArrangementControlActionTaskRecord) {
    this.currentAccountFulfillmentArrangementControlActionTaskRecord = currentAccountFulfillmentArrangementControlActionTaskRecord;
  }

  public InlineResponse2004 currentAccountFulfillmentArrangementControlActionResponse(String currentAccountFulfillmentArrangementControlActionResponse) {
    this.currentAccountFulfillmentArrangementControlActionResponse = currentAccountFulfillmentArrangementControlActionResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return currentAccountFulfillmentArrangementControlActionResponse
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response ")


  public String getCurrentAccountFulfillmentArrangementControlActionResponse() {
    return currentAccountFulfillmentArrangementControlActionResponse;
  }

  public void setCurrentAccountFulfillmentArrangementControlActionResponse(String currentAccountFulfillmentArrangementControlActionResponse) {
    this.currentAccountFulfillmentArrangementControlActionResponse = currentAccountFulfillmentArrangementControlActionResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004 inlineResponse2004 = (InlineResponse2004) o;
    return Objects.equals(this.currentAccountFulfillmentArrangementControlActionTaskReference, inlineResponse2004.currentAccountFulfillmentArrangementControlActionTaskReference) &&
        Objects.equals(this.currentAccountFulfillmentArrangementControlActionTaskRecord, inlineResponse2004.currentAccountFulfillmentArrangementControlActionTaskRecord) &&
        Objects.equals(this.currentAccountFulfillmentArrangementControlActionResponse, inlineResponse2004.currentAccountFulfillmentArrangementControlActionResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFulfillmentArrangementControlActionTaskReference, currentAccountFulfillmentArrangementControlActionTaskRecord, currentAccountFulfillmentArrangementControlActionResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004 {\n");
    
    sb.append("    currentAccountFulfillmentArrangementControlActionTaskReference: ").append(toIndentedString(currentAccountFulfillmentArrangementControlActionTaskReference)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementControlActionTaskRecord: ").append(toIndentedString(currentAccountFulfillmentArrangementControlActionTaskRecord)).append("\n");
    sb.append("    currentAccountFulfillmentArrangementControlActionResponse: ").append(toIndentedString(currentAccountFulfillmentArrangementControlActionResponse)).append("\n");
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

