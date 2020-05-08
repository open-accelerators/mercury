package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.CurrentAccountActivationServiceDomainServiceConfigurationRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCurrentAccountActivateInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class SDCurrentAccountActivateInputModel   {
  @JsonProperty("serviceDomainActivationActionTaskRecord")
  private Object serviceDomainActivationActionTaskRecord;

  @JsonProperty("serviceDomainCenterReference")
  private String serviceDomainCenterReference;

  @JsonProperty("serviceDomainServiceReference")
  private String serviceDomainServiceReference;

  @JsonProperty("serviceDomainServiceConfigurationRecord")
  private CurrentAccountActivationServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord;

  public SDCurrentAccountActivateInputModel serviceDomainActivationActionTaskRecord(Object serviceDomainActivationActionTaskRecord) {
    this.serviceDomainActivationActionTaskRecord = serviceDomainActivationActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return serviceDomainActivationActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record ")

  @Valid

  public Object getServiceDomainActivationActionTaskRecord() {
    return serviceDomainActivationActionTaskRecord;
  }

  public void setServiceDomainActivationActionTaskRecord(Object serviceDomainActivationActionTaskRecord) {
    this.serviceDomainActivationActionTaskRecord = serviceDomainActivationActionTaskRecord;
  }

  public SDCurrentAccountActivateInputModel serviceDomainCenterReference(String serviceDomainCenterReference) {
    this.serviceDomainCenterReference = serviceDomainCenterReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return serviceDomainCenterReference
  */
  @ApiModelProperty(example = "SCR793499", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit ")


  public String getServiceDomainCenterReference() {
    return serviceDomainCenterReference;
  }

  public void setServiceDomainCenterReference(String serviceDomainCenterReference) {
    this.serviceDomainCenterReference = serviceDomainCenterReference;
  }

  public SDCurrentAccountActivateInputModel serviceDomainServiceReference(String serviceDomainServiceReference) {
    this.serviceDomainServiceReference = serviceDomainServiceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return serviceDomainServiceReference
  */
  @ApiModelProperty(example = "CPASSR703914", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center ")


  public String getServiceDomainServiceReference() {
    return serviceDomainServiceReference;
  }

  public void setServiceDomainServiceReference(String serviceDomainServiceReference) {
    this.serviceDomainServiceReference = serviceDomainServiceReference;
  }

  public SDCurrentAccountActivateInputModel serviceDomainServiceConfigurationRecord(CurrentAccountActivationServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord) {
    this.serviceDomainServiceConfigurationRecord = serviceDomainServiceConfigurationRecord;
    return this;
  }

  /**
   * Get serviceDomainServiceConfigurationRecord
   * @return serviceDomainServiceConfigurationRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public CurrentAccountActivationServiceDomainServiceConfigurationRecord getServiceDomainServiceConfigurationRecord() {
    return serviceDomainServiceConfigurationRecord;
  }

  public void setServiceDomainServiceConfigurationRecord(CurrentAccountActivationServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord) {
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
    SDCurrentAccountActivateInputModel sdCurrentAccountActivateInputModel = (SDCurrentAccountActivateInputModel) o;
    return Objects.equals(this.serviceDomainActivationActionTaskRecord, sdCurrentAccountActivateInputModel.serviceDomainActivationActionTaskRecord) &&
        Objects.equals(this.serviceDomainCenterReference, sdCurrentAccountActivateInputModel.serviceDomainCenterReference) &&
        Objects.equals(this.serviceDomainServiceReference, sdCurrentAccountActivateInputModel.serviceDomainServiceReference) &&
        Objects.equals(this.serviceDomainServiceConfigurationRecord, sdCurrentAccountActivateInputModel.serviceDomainServiceConfigurationRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainActivationActionTaskRecord, serviceDomainCenterReference, serviceDomainServiceReference, serviceDomainServiceConfigurationRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCurrentAccountActivateInputModel {\n");
    
    sb.append("    serviceDomainActivationActionTaskRecord: ").append(toIndentedString(serviceDomainActivationActionTaskRecord)).append("\n");
    sb.append("    serviceDomainCenterReference: ").append(toIndentedString(serviceDomainCenterReference)).append("\n");
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

