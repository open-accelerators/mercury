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
 * BQAccountLienExchangeInputModelAccountLienExchangeActionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQAccountLienExchangeInputModelAccountLienExchangeActionRequest   {
  @JsonProperty("exchangeActionType")
  private String exchangeActionType;

  public BQAccountLienExchangeInputModelAccountLienExchangeActionRequest exchangeActionType(String exchangeActionType) {
    this.exchangeActionType = exchangeActionType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of exchange (e.g. accept, reject, verify) 
   * @return exchangeActionType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of exchange (e.g. accept, reject, verify) ")


  public String getExchangeActionType() {
    return exchangeActionType;
  }

  public void setExchangeActionType(String exchangeActionType) {
    this.exchangeActionType = exchangeActionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountLienExchangeInputModelAccountLienExchangeActionRequest bqAccountLienExchangeInputModelAccountLienExchangeActionRequest = (BQAccountLienExchangeInputModelAccountLienExchangeActionRequest) o;
    return Objects.equals(this.exchangeActionType, bqAccountLienExchangeInputModelAccountLienExchangeActionRequest.exchangeActionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeActionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountLienExchangeInputModelAccountLienExchangeActionRequest {\n");
    
    sb.append("    exchangeActionType: ").append(toIndentedString(exchangeActionType)).append("\n");
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

