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
 * InlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class InlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines   {
  @JsonProperty("serviceDomainServiceEligibility")
  private String serviceDomainServiceEligibility;

  @JsonProperty("serviceDomainServiceIntendedUses")
  private String serviceDomainServiceIntendedUses;

  @JsonProperty("serviceDomainServicePricingandTerms")
  private String serviceDomainServicePricingandTerms;

  public InlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines serviceDomainServiceEligibility(String serviceDomainServiceEligibility) {
    this.serviceDomainServiceEligibility = serviceDomainServiceEligibility;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return serviceDomainServiceEligibility
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications ")


  public String getServiceDomainServiceEligibility() {
    return serviceDomainServiceEligibility;
  }

  public void setServiceDomainServiceEligibility(String serviceDomainServiceEligibility) {
    this.serviceDomainServiceEligibility = serviceDomainServiceEligibility;
  }

  public InlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines serviceDomainServiceIntendedUses(String serviceDomainServiceIntendedUses) {
    this.serviceDomainServiceIntendedUses = serviceDomainServiceIntendedUses;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return serviceDomainServiceIntendedUses
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service ")


  public String getServiceDomainServiceIntendedUses() {
    return serviceDomainServiceIntendedUses;
  }

  public void setServiceDomainServiceIntendedUses(String serviceDomainServiceIntendedUses) {
    this.serviceDomainServiceIntendedUses = serviceDomainServiceIntendedUses;
  }

  public InlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines serviceDomainServicePricingandTerms(String serviceDomainServicePricingandTerms) {
    this.serviceDomainServicePricingandTerms = serviceDomainServicePricingandTerms;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return serviceDomainServicePricingandTerms
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service ")


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
    InlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines inlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines = (InlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines) o;
    return Objects.equals(this.serviceDomainServiceEligibility, inlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines.serviceDomainServiceEligibility) &&
        Objects.equals(this.serviceDomainServiceIntendedUses, inlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines.serviceDomainServiceIntendedUses) &&
        Objects.equals(this.serviceDomainServicePricingandTerms, inlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines.serviceDomainServicePricingandTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceEligibility, serviceDomainServiceIntendedUses, serviceDomainServicePricingandTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines {\n");
    
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

