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
 * InlineResponse201ServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class InlineResponse201ServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription   {
  @JsonProperty("serviceDomainServiceSubscriberReference")
  private String serviceDomainServiceSubscriberReference;

  @JsonProperty("serviceDomainServiceSubscriberAccessProfile")
  private String serviceDomainServiceSubscriberAccessProfile;

  public InlineResponse201ServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription serviceDomainServiceSubscriberReference(String serviceDomainServiceSubscriberReference) {
    this.serviceDomainServiceSubscriberReference = serviceDomainServiceSubscriberReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return serviceDomainServiceSubscriberReference
  */
  @ApiModelProperty(example = "769192", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party ")


  public String getServiceDomainServiceSubscriberReference() {
    return serviceDomainServiceSubscriberReference;
  }

  public void setServiceDomainServiceSubscriberReference(String serviceDomainServiceSubscriberReference) {
    this.serviceDomainServiceSubscriberReference = serviceDomainServiceSubscriberReference;
  }

  public InlineResponse201ServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription serviceDomainServiceSubscriberAccessProfile(String serviceDomainServiceSubscriberAccessProfile) {
    this.serviceDomainServiceSubscriberAccessProfile = serviceDomainServiceSubscriberAccessProfile;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return serviceDomainServiceSubscriberAccessProfile
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party ")


  public String getServiceDomainServiceSubscriberAccessProfile() {
    return serviceDomainServiceSubscriberAccessProfile;
  }

  public void setServiceDomainServiceSubscriberAccessProfile(String serviceDomainServiceSubscriberAccessProfile) {
    this.serviceDomainServiceSubscriberAccessProfile = serviceDomainServiceSubscriberAccessProfile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse201ServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription inlineResponse201ServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription = (InlineResponse201ServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription) o;
    return Objects.equals(this.serviceDomainServiceSubscriberReference, inlineResponse201ServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription.serviceDomainServiceSubscriberReference) &&
        Objects.equals(this.serviceDomainServiceSubscriberAccessProfile, inlineResponse201ServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription.serviceDomainServiceSubscriberAccessProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceSubscriberReference, serviceDomainServiceSubscriberAccessProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201ServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription {\n");
    
    sb.append("    serviceDomainServiceSubscriberReference: ").append(toIndentedString(serviceDomainServiceSubscriberReference)).append("\n");
    sb.append("    serviceDomainServiceSubscriberAccessProfile: ").append(toIndentedString(serviceDomainServiceSubscriberAccessProfile)).append("\n");
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

