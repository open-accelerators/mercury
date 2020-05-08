package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200ServiceDomainServiceConfigurationRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class InlineResponse200ServiceDomainServiceConfigurationRecord   {
  @JsonProperty("serviceDomainServiceConfigurationSettingDescription")
  private String serviceDomainServiceConfigurationSettingDescription;

  @JsonProperty("serviceDomainServiceConfigurationSetup")
  private CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup;

  @JsonProperty("serviceDomainServiceSubscription")
  private CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription serviceDomainServiceSubscription;

  @JsonProperty("serviceDomainServiceAgreement")
  private CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement serviceDomainServiceAgreement;

  @JsonProperty("serviceDomainServiceStatus")
  private String serviceDomainServiceStatus;

  public InlineResponse200ServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationSettingDescription(String serviceDomainServiceConfigurationSettingDescription) {
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

  public InlineResponse200ServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationSetup(CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup) {
    this.serviceDomainServiceConfigurationSetup = serviceDomainServiceConfigurationSetup;
    return this;
  }

  /**
   * Get serviceDomainServiceConfigurationSetup
   * @return serviceDomainServiceConfigurationSetup
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup getServiceDomainServiceConfigurationSetup() {
    return serviceDomainServiceConfigurationSetup;
  }

  public void setServiceDomainServiceConfigurationSetup(CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceConfigurationSetup serviceDomainServiceConfigurationSetup) {
    this.serviceDomainServiceConfigurationSetup = serviceDomainServiceConfigurationSetup;
  }

  public InlineResponse200ServiceDomainServiceConfigurationRecord serviceDomainServiceSubscription(CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription serviceDomainServiceSubscription) {
    this.serviceDomainServiceSubscription = serviceDomainServiceSubscription;
    return this;
  }

  /**
   * Get serviceDomainServiceSubscription
   * @return serviceDomainServiceSubscription
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription getServiceDomainServiceSubscription() {
    return serviceDomainServiceSubscription;
  }

  public void setServiceDomainServiceSubscription(CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription serviceDomainServiceSubscription) {
    this.serviceDomainServiceSubscription = serviceDomainServiceSubscription;
  }

  public InlineResponse200ServiceDomainServiceConfigurationRecord serviceDomainServiceAgreement(CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement serviceDomainServiceAgreement) {
    this.serviceDomainServiceAgreement = serviceDomainServiceAgreement;
    return this;
  }

  /**
   * Get serviceDomainServiceAgreement
   * @return serviceDomainServiceAgreement
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement getServiceDomainServiceAgreement() {
    return serviceDomainServiceAgreement;
  }

  public void setServiceDomainServiceAgreement(CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecordServiceDomainServiceAgreement serviceDomainServiceAgreement) {
    this.serviceDomainServiceAgreement = serviceDomainServiceAgreement;
  }

  public InlineResponse200ServiceDomainServiceConfigurationRecord serviceDomainServiceStatus(String serviceDomainServiceStatus) {
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
    InlineResponse200ServiceDomainServiceConfigurationRecord inlineResponse200ServiceDomainServiceConfigurationRecord = (InlineResponse200ServiceDomainServiceConfigurationRecord) o;
    return Objects.equals(this.serviceDomainServiceConfigurationSettingDescription, inlineResponse200ServiceDomainServiceConfigurationRecord.serviceDomainServiceConfigurationSettingDescription) &&
        Objects.equals(this.serviceDomainServiceConfigurationSetup, inlineResponse200ServiceDomainServiceConfigurationRecord.serviceDomainServiceConfigurationSetup) &&
        Objects.equals(this.serviceDomainServiceSubscription, inlineResponse200ServiceDomainServiceConfigurationRecord.serviceDomainServiceSubscription) &&
        Objects.equals(this.serviceDomainServiceAgreement, inlineResponse200ServiceDomainServiceConfigurationRecord.serviceDomainServiceAgreement) &&
        Objects.equals(this.serviceDomainServiceStatus, inlineResponse200ServiceDomainServiceConfigurationRecord.serviceDomainServiceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceConfigurationSettingDescription, serviceDomainServiceConfigurationSetup, serviceDomainServiceSubscription, serviceDomainServiceAgreement, serviceDomainServiceStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200ServiceDomainServiceConfigurationRecord {\n");
    
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

