package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CRCurrentAccountFulfillmentArrangementControlInputModelCurrentAccountFulfillmentArrangementControlActionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class CRCurrentAccountFulfillmentArrangementControlInputModelCurrentAccountFulfillmentArrangementControlActionRequest   {
  @JsonProperty("controlActionType")
  private String controlActionType;

  public CRCurrentAccountFulfillmentArrangementControlInputModelCurrentAccountFulfillmentArrangementControlActionRequest controlActionType(String controlActionType) {
    this.controlActionType = controlActionType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of processing action requested (e.g. suspend, skip, terminate) 
   * @return controlActionType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of processing action requested (e.g. suspend, skip, terminate) ")


  public String getControlActionType() {
    return controlActionType;
  }

  public void setControlActionType(String controlActionType) {
    this.controlActionType = controlActionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRCurrentAccountFulfillmentArrangementControlInputModelCurrentAccountFulfillmentArrangementControlActionRequest crCurrentAccountFulfillmentArrangementControlInputModelCurrentAccountFulfillmentArrangementControlActionRequest = (CRCurrentAccountFulfillmentArrangementControlInputModelCurrentAccountFulfillmentArrangementControlActionRequest) o;
    return Objects.equals(this.controlActionType, crCurrentAccountFulfillmentArrangementControlInputModelCurrentAccountFulfillmentArrangementControlActionRequest.controlActionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlActionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRCurrentAccountFulfillmentArrangementControlInputModelCurrentAccountFulfillmentArrangementControlActionRequest {\n");
    
    sb.append("    controlActionType: ").append(toIndentedString(controlActionType)).append("\n");
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

