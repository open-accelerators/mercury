/*
 * Customer Credit Rating
 * This service domain maintains and administers the bank's credit assessment for customers.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.redhat.mercury.customercreditrating.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SDCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-03T16:36:13.702891+02:00[Europe/Madrid]")
public class SDCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup {
  @SerializedName("serviceDomainServiceConfigurationParameter")
  private String serviceDomainServiceConfigurationParameter = null;

  public SDCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationParameter(String serviceDomainServiceConfigurationParameter) {
    this.serviceDomainServiceConfigurationParameter = serviceDomainServiceConfigurationParameter;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return serviceDomainServiceConfigurationParameter
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  ")
  public String getServiceDomainServiceConfigurationParameter() {
    return serviceDomainServiceConfigurationParameter;
  }

  public void setServiceDomainServiceConfigurationParameter(String serviceDomainServiceConfigurationParameter) {
    this.serviceDomainServiceConfigurationParameter = serviceDomainServiceConfigurationParameter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup sdCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup = (SDCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup) o;
    return Objects.equals(this.serviceDomainServiceConfigurationParameter, sdCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup.serviceDomainServiceConfigurationParameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceConfigurationParameter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCreditRatingConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup {\n");
    
    sb.append("    serviceDomainServiceConfigurationParameter: ").append(toIndentedString(serviceDomainServiceConfigurationParameter)).append("\n");
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
