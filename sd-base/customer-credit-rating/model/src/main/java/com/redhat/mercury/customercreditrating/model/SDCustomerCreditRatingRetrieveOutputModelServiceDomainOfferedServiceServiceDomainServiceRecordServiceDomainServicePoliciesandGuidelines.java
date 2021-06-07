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
 * SDCustomerCreditRatingRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-03T16:36:13.702891+02:00[Europe/Madrid]")
public class SDCustomerCreditRatingRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines {
  @SerializedName("serviceDomainServiceEligibility")
  private String serviceDomainServiceEligibility = null;

  @SerializedName("serviceDomainServiceIntendedUses")
  private String serviceDomainServiceIntendedUses = null;

  @SerializedName("serviceDomainServicePricingandTerms")
  private String serviceDomainServicePricingandTerms = null;

  public SDCustomerCreditRatingRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines serviceDomainServiceEligibility(String serviceDomainServiceEligibility) {
    this.serviceDomainServiceEligibility = serviceDomainServiceEligibility;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return serviceDomainServiceEligibility
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications ")
  public String getServiceDomainServiceEligibility() {
    return serviceDomainServiceEligibility;
  }

  public void setServiceDomainServiceEligibility(String serviceDomainServiceEligibility) {
    this.serviceDomainServiceEligibility = serviceDomainServiceEligibility;
  }

  public SDCustomerCreditRatingRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines serviceDomainServiceIntendedUses(String serviceDomainServiceIntendedUses) {
    this.serviceDomainServiceIntendedUses = serviceDomainServiceIntendedUses;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return serviceDomainServiceIntendedUses
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service ")
  public String getServiceDomainServiceIntendedUses() {
    return serviceDomainServiceIntendedUses;
  }

  public void setServiceDomainServiceIntendedUses(String serviceDomainServiceIntendedUses) {
    this.serviceDomainServiceIntendedUses = serviceDomainServiceIntendedUses;
  }

  public SDCustomerCreditRatingRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines serviceDomainServicePricingandTerms(String serviceDomainServicePricingandTerms) {
    this.serviceDomainServicePricingandTerms = serviceDomainServicePricingandTerms;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return serviceDomainServicePricingandTerms
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service ")
  public String getServiceDomainServicePricingandTerms() {
    return serviceDomainServicePricingandTerms;
  }

  public void setServiceDomainServicePricingandTerms(String serviceDomainServicePricingandTerms) {
    this.serviceDomainServicePricingandTerms = serviceDomainServicePricingandTerms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCustomerCreditRatingRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines sdCustomerCreditRatingRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines = (SDCustomerCreditRatingRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines) o;
    return Objects.equals(this.serviceDomainServiceEligibility, sdCustomerCreditRatingRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines.serviceDomainServiceEligibility) &&
        Objects.equals(this.serviceDomainServiceIntendedUses, sdCustomerCreditRatingRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines.serviceDomainServiceIntendedUses) &&
        Objects.equals(this.serviceDomainServicePricingandTerms, sdCustomerCreditRatingRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines.serviceDomainServicePricingandTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceEligibility, serviceDomainServiceIntendedUses, serviceDomainServicePricingandTerms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCustomerCreditRatingRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines {\n");
    
    sb.append("    serviceDomainServiceEligibility: ").append(toIndentedString(serviceDomainServiceEligibility)).append("\n");
    sb.append("    serviceDomainServiceIntendedUses: ").append(toIndentedString(serviceDomainServiceIntendedUses)).append("\n");
    sb.append("    serviceDomainServicePricingandTerms: ").append(toIndentedString(serviceDomainServicePricingandTerms)).append("\n");
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
