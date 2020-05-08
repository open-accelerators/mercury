package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCurrentAccountConfigureInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class SDCurrentAccountConfigureInputModel   {
  @JsonProperty("serviceDomainConfigurationActionTaskRecord")
  private Object serviceDomainConfigurationActionTaskRecord;

  @JsonProperty("serviceDomainServicingSessionReference")
  private String serviceDomainServicingSessionReference;

  @JsonProperty("serviceDomainServiceReference")
  private String serviceDomainServiceReference;

  @JsonProperty("serviceDomainServiceConfigurationRecord")
  private CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord;

  public SDCurrentAccountConfigureInputModel serviceDomainConfigurationActionTaskRecord(Object serviceDomainConfigurationActionTaskRecord) {
    this.serviceDomainConfigurationActionTaskRecord = serviceDomainConfigurationActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return serviceDomainConfigurationActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record ")

  @Valid

  public Object getServiceDomainConfigurationActionTaskRecord() {
    return serviceDomainConfigurationActionTaskRecord;
  }

  public void setServiceDomainConfigurationActionTaskRecord(Object serviceDomainConfigurationActionTaskRecord) {
    this.serviceDomainConfigurationActionTaskRecord = serviceDomainConfigurationActionTaskRecord;
  }

  public SDCurrentAccountConfigureInputModel serviceDomainServicingSessionReference(String serviceDomainServicingSessionReference) {
    this.serviceDomainServicingSessionReference = serviceDomainServicingSessionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return serviceDomainServicingSessionReference
  */
  @ApiModelProperty(example = "SSSR764367", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session ")


  public String getServiceDomainServicingSessionReference() {
    return serviceDomainServicingSessionReference;
  }

  public void setServiceDomainServicingSessionReference(String serviceDomainServicingSessionReference) {
    this.serviceDomainServicingSessionReference = serviceDomainServicingSessionReference;
  }

  public SDCurrentAccountConfigureInputModel serviceDomainServiceReference(String serviceDomainServiceReference) {
    this.serviceDomainServiceReference = serviceDomainServiceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return serviceDomainServiceReference
  */
  @ApiModelProperty(example = "CPASSR744740", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center ")


  public String getServiceDomainServiceReference() {
    return serviceDomainServiceReference;
  }

  public void setServiceDomainServiceReference(String serviceDomainServiceReference) {
    this.serviceDomainServiceReference = serviceDomainServiceReference;
  }

  public SDCurrentAccountConfigureInputModel serviceDomainServiceConfigurationRecord(CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord) {
    this.serviceDomainServiceConfigurationRecord = serviceDomainServiceConfigurationRecord;
    return this;
  }

  /**
   * Get serviceDomainServiceConfigurationRecord
   * @return serviceDomainServiceConfigurationRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecord getServiceDomainServiceConfigurationRecord() {
    return serviceDomainServiceConfigurationRecord;
  }

  public void setServiceDomainServiceConfigurationRecord(CurrentAccountSdReferenceIdConfigurationServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord) {
    this.serviceDomainServiceConfigurationRecord = serviceDomainServiceConfigurationRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCurrentAccountConfigureInputModel sdCurrentAccountConfigureInputModel = (SDCurrentAccountConfigureInputModel) o;
    return Objects.equals(this.serviceDomainConfigurationActionTaskRecord, sdCurrentAccountConfigureInputModel.serviceDomainConfigurationActionTaskRecord) &&
        Objects.equals(this.serviceDomainServicingSessionReference, sdCurrentAccountConfigureInputModel.serviceDomainServicingSessionReference) &&
        Objects.equals(this.serviceDomainServiceReference, sdCurrentAccountConfigureInputModel.serviceDomainServiceReference) &&
        Objects.equals(this.serviceDomainServiceConfigurationRecord, sdCurrentAccountConfigureInputModel.serviceDomainServiceConfigurationRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainConfigurationActionTaskRecord, serviceDomainServicingSessionReference, serviceDomainServiceReference, serviceDomainServiceConfigurationRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCurrentAccountConfigureInputModel {\n");
    
    sb.append("    serviceDomainConfigurationActionTaskRecord: ").append(toIndentedString(serviceDomainConfigurationActionTaskRecord)).append("\n");
    sb.append("    serviceDomainServicingSessionReference: ").append(toIndentedString(serviceDomainServicingSessionReference)).append("\n");
    sb.append("    serviceDomainServiceReference: ").append(toIndentedString(serviceDomainServiceReference)).append("\n");
    sb.append("    serviceDomainServiceConfigurationRecord: ").append(toIndentedString(serviceDomainServiceConfigurationRecord)).append("\n");
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

