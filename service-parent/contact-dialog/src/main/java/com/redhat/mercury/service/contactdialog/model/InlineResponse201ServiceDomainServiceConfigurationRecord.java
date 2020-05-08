package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountActivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup;
import com.redhat.mercury.service.contactdialog.model.InlineResponse201ServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement;
import com.redhat.mercury.service.contactdialog.model.InlineResponse201ServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse201ServiceDomainServiceConfigurationRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class InlineResponse201ServiceDomainServiceConfigurationRecord   {
  @JsonProperty("serviceDomainServiceConfigurationSettingReference")
  private String serviceDomainServiceConfigurationSettingReference;

  @JsonProperty("serviceDomainServiceConfigurationSettingDescription")
  private String serviceDomainServiceConfigurationSettingDescription;

  @JsonProperty("serviceDomainServiceConfigurationSetup")
  private CurrentAccountActivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup;

  @JsonProperty("serviceDomainServiceSubscription")
  private InlineResponse201ServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription serviceDomainServiceSubscription;

  @JsonProperty("serviceDomainServiceAgreement")
  private InlineResponse201ServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement serviceDomainServiceAgreement;

  @JsonProperty("serviceDomainServiceStatus")
  private String serviceDomainServiceStatus;

  public InlineResponse201ServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationSettingReference(String serviceDomainServiceConfigurationSettingReference) {
    this.serviceDomainServiceConfigurationSettingReference = serviceDomainServiceConfigurationSettingReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return serviceDomainServiceConfigurationSettingReference
  */
  @ApiModelProperty(example = "700761", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service ")


  public String getServiceDomainServiceConfigurationSettingReference() {
    return serviceDomainServiceConfigurationSettingReference;
  }

  public void setServiceDomainServiceConfigurationSettingReference(String serviceDomainServiceConfigurationSettingReference) {
    this.serviceDomainServiceConfigurationSettingReference = serviceDomainServiceConfigurationSettingReference;
  }

  public InlineResponse201ServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationSettingDescription(String serviceDomainServiceConfigurationSettingDescription) {
    this.serviceDomainServiceConfigurationSettingDescription = serviceDomainServiceConfigurationSettingDescription;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return serviceDomainServiceConfigurationSettingDescription
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact ")


  public String getServiceDomainServiceConfigurationSettingDescription() {
    return serviceDomainServiceConfigurationSettingDescription;
  }

  public void setServiceDomainServiceConfigurationSettingDescription(String serviceDomainServiceConfigurationSettingDescription) {
    this.serviceDomainServiceConfigurationSettingDescription = serviceDomainServiceConfigurationSettingDescription;
  }

  public InlineResponse201ServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationSetup(CurrentAccountActivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup) {
    this.serviceDomainServiceConfigurationSetup = serviceDomainServiceConfigurationSetup;
    return this;
  }

  /**
   * Get serviceDomainServiceConfigurationSetup
   * @return serviceDomainServiceConfigurationSetup
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountActivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup getServiceDomainServiceConfigurationSetup() {
    return serviceDomainServiceConfigurationSetup;
  }

  public void setServiceDomainServiceConfigurationSetup(CurrentAccountActivationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup) {
    this.serviceDomainServiceConfigurationSetup = serviceDomainServiceConfigurationSetup;
  }

  public InlineResponse201ServiceDomainServiceConfigurationRecord serviceDomainServiceSubscription(InlineResponse201ServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription serviceDomainServiceSubscription) {
    this.serviceDomainServiceSubscription = serviceDomainServiceSubscription;
    return this;
  }

  /**
   * Get serviceDomainServiceSubscription
   * @return serviceDomainServiceSubscription
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse201ServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription getServiceDomainServiceSubscription() {
    return serviceDomainServiceSubscription;
  }

  public void setServiceDomainServiceSubscription(InlineResponse201ServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription serviceDomainServiceSubscription) {
    this.serviceDomainServiceSubscription = serviceDomainServiceSubscription;
  }

  public InlineResponse201ServiceDomainServiceConfigurationRecord serviceDomainServiceAgreement(InlineResponse201ServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement serviceDomainServiceAgreement) {
    this.serviceDomainServiceAgreement = serviceDomainServiceAgreement;
    return this;
  }

  /**
   * Get serviceDomainServiceAgreement
   * @return serviceDomainServiceAgreement
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse201ServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement getServiceDomainServiceAgreement() {
    return serviceDomainServiceAgreement;
  }

  public void setServiceDomainServiceAgreement(InlineResponse201ServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement serviceDomainServiceAgreement) {
    this.serviceDomainServiceAgreement = serviceDomainServiceAgreement;
  }

  public InlineResponse201ServiceDomainServiceConfigurationRecord serviceDomainServiceStatus(String serviceDomainServiceStatus) {
    this.serviceDomainServiceStatus = serviceDomainServiceStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return serviceDomainServiceStatus
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) ")


  public String getServiceDomainServiceStatus() {
    return serviceDomainServiceStatus;
  }

  public void setServiceDomainServiceStatus(String serviceDomainServiceStatus) {
    this.serviceDomainServiceStatus = serviceDomainServiceStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse201ServiceDomainServiceConfigurationRecord inlineResponse201ServiceDomainServiceConfigurationRecord = (InlineResponse201ServiceDomainServiceConfigurationRecord) o;
    return Objects.equals(this.serviceDomainServiceConfigurationSettingReference, inlineResponse201ServiceDomainServiceConfigurationRecord.serviceDomainServiceConfigurationSettingReference) &&
        Objects.equals(this.serviceDomainServiceConfigurationSettingDescription, inlineResponse201ServiceDomainServiceConfigurationRecord.serviceDomainServiceConfigurationSettingDescription) &&
        Objects.equals(this.serviceDomainServiceConfigurationSetup, inlineResponse201ServiceDomainServiceConfigurationRecord.serviceDomainServiceConfigurationSetup) &&
        Objects.equals(this.serviceDomainServiceSubscription, inlineResponse201ServiceDomainServiceConfigurationRecord.serviceDomainServiceSubscription) &&
        Objects.equals(this.serviceDomainServiceAgreement, inlineResponse201ServiceDomainServiceConfigurationRecord.serviceDomainServiceAgreement) &&
        Objects.equals(this.serviceDomainServiceStatus, inlineResponse201ServiceDomainServiceConfigurationRecord.serviceDomainServiceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceConfigurationSettingReference, serviceDomainServiceConfigurationSettingDescription, serviceDomainServiceConfigurationSetup, serviceDomainServiceSubscription, serviceDomainServiceAgreement, serviceDomainServiceStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201ServiceDomainServiceConfigurationRecord {\n");
    
    sb.append("    serviceDomainServiceConfigurationSettingReference: ").append(toIndentedString(serviceDomainServiceConfigurationSettingReference)).append("\n");
    sb.append("    serviceDomainServiceConfigurationSettingDescription: ").append(toIndentedString(serviceDomainServiceConfigurationSettingDescription)).append("\n");
    sb.append("    serviceDomainServiceConfigurationSetup: ").append(toIndentedString(serviceDomainServiceConfigurationSetup)).append("\n");
    sb.append("    serviceDomainServiceSubscription: ").append(toIndentedString(serviceDomainServiceSubscription)).append("\n");
    sb.append("    serviceDomainServiceAgreement: ").append(toIndentedString(serviceDomainServiceAgreement)).append("\n");
    sb.append("    serviceDomainServiceStatus: ").append(toIndentedString(serviceDomainServiceStatus)).append("\n");
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

