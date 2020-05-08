package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCurrentAccountRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class SDCurrentAccountRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord   {
  @JsonProperty("serviceDomainServiceType")
  private String serviceDomainServiceType;

  @JsonProperty("serviceDomainServiceVersion")
  private String serviceDomainServiceVersion;

  @JsonProperty("serviceDomainServiceDescription")
  private String serviceDomainServiceDescription;

  @JsonProperty("serviceDomainServicePoliciesandGuidelines")
  private InlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines serviceDomainServicePoliciesandGuidelines;

  @JsonProperty("serviceDomainServiceSchedule")
  private String serviceDomainServiceSchedule;

  public SDCurrentAccountRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceType(String serviceDomainServiceType) {
    this.serviceDomainServiceType = serviceDomainServiceType;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return serviceDomainServiceType
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered ")


  public String getServiceDomainServiceType() {
    return serviceDomainServiceType;
  }

  public void setServiceDomainServiceType(String serviceDomainServiceType) {
    this.serviceDomainServiceType = serviceDomainServiceType;
  }

  public SDCurrentAccountRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceVersion(String serviceDomainServiceVersion) {
    this.serviceDomainServiceVersion = serviceDomainServiceVersion;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return serviceDomainServiceVersion
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate ")


  public String getServiceDomainServiceVersion() {
    return serviceDomainServiceVersion;
  }

  public void setServiceDomainServiceVersion(String serviceDomainServiceVersion) {
    this.serviceDomainServiceVersion = serviceDomainServiceVersion;
  }

  public SDCurrentAccountRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceDescription(String serviceDomainServiceDescription) {
    this.serviceDomainServiceDescription = serviceDomainServiceDescription;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return serviceDomainServiceDescription
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  ")


  public String getServiceDomainServiceDescription() {
    return serviceDomainServiceDescription;
  }

  public void setServiceDomainServiceDescription(String serviceDomainServiceDescription) {
    this.serviceDomainServiceDescription = serviceDomainServiceDescription;
  }

  public SDCurrentAccountRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServicePoliciesandGuidelines(InlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines serviceDomainServicePoliciesandGuidelines) {
    this.serviceDomainServicePoliciesandGuidelines = serviceDomainServicePoliciesandGuidelines;
    return this;
  }

  /**
   * Get serviceDomainServicePoliciesandGuidelines
   * @return serviceDomainServicePoliciesandGuidelines
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines getServiceDomainServicePoliciesandGuidelines() {
    return serviceDomainServicePoliciesandGuidelines;
  }

  public void setServiceDomainServicePoliciesandGuidelines(InlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines serviceDomainServicePoliciesandGuidelines) {
    this.serviceDomainServicePoliciesandGuidelines = serviceDomainServicePoliciesandGuidelines;
  }

  public SDCurrentAccountRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceSchedule(String serviceDomainServiceSchedule) {
    this.serviceDomainServiceSchedule = serviceDomainServiceSchedule;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return serviceDomainServiceSchedule
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available ")


  public String getServiceDomainServiceSchedule() {
    return serviceDomainServiceSchedule;
  }

  public void setServiceDomainServiceSchedule(String serviceDomainServiceSchedule) {
    this.serviceDomainServiceSchedule = serviceDomainServiceSchedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCurrentAccountRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord sdCurrentAccountRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord = (SDCurrentAccountRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord) o;
    return Objects.equals(this.serviceDomainServiceType, sdCurrentAccountRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord.serviceDomainServiceType) &&
        Objects.equals(this.serviceDomainServiceVersion, sdCurrentAccountRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord.serviceDomainServiceVersion) &&
        Objects.equals(this.serviceDomainServiceDescription, sdCurrentAccountRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord.serviceDomainServiceDescription) &&
        Objects.equals(this.serviceDomainServicePoliciesandGuidelines, sdCurrentAccountRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord.serviceDomainServicePoliciesandGuidelines) &&
        Objects.equals(this.serviceDomainServiceSchedule, sdCurrentAccountRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord.serviceDomainServiceSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceType, serviceDomainServiceVersion, serviceDomainServiceDescription, serviceDomainServicePoliciesandGuidelines, serviceDomainServiceSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCurrentAccountRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord {\n");
    
    sb.append("    serviceDomainServiceType: ").append(toIndentedString(serviceDomainServiceType)).append("\n");
    sb.append("    serviceDomainServiceVersion: ").append(toIndentedString(serviceDomainServiceVersion)).append("\n");
    sb.append("    serviceDomainServiceDescription: ").append(toIndentedString(serviceDomainServiceDescription)).append("\n");
    sb.append("    serviceDomainServicePoliciesandGuidelines: ").append(toIndentedString(serviceDomainServicePoliciesandGuidelines)).append("\n");
    sb.append("    serviceDomainServiceSchedule: ").append(toIndentedString(serviceDomainServiceSchedule)).append("\n");
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

