package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse201ServiceDomainServiceConfigurationRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCurrentAccountActivateOutputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class SDCurrentAccountActivateOutputModel   {
  @JsonProperty("serviceDomainActivationActionTaskReference")
  private String serviceDomainActivationActionTaskReference;

  @JsonProperty("serviceDomainActivationActionTaskRecord")
  private Object serviceDomainActivationActionTaskRecord;

  @JsonProperty("serviceDomainServicingSessionReference")
  private String serviceDomainServicingSessionReference;

  @JsonProperty("serviceDomainServicingSessionRecord")
  private Object serviceDomainServicingSessionRecord;

  @JsonProperty("serviceDomainServiceConfigurationRecord")
  private InlineResponse201ServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord;

  @JsonProperty("serviceDomainServicingSessionStatus")
  private String serviceDomainServicingSessionStatus;

  public SDCurrentAccountActivateOutputModel serviceDomainActivationActionTaskReference(String serviceDomainActivationActionTaskReference) {
    this.serviceDomainActivationActionTaskReference = serviceDomainActivationActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return serviceDomainActivationActionTaskReference
  */
  @ApiModelProperty(example = "SAATR758836", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call ")


  public String getServiceDomainActivationActionTaskReference() {
    return serviceDomainActivationActionTaskReference;
  }

  public void setServiceDomainActivationActionTaskReference(String serviceDomainActivationActionTaskReference) {
    this.serviceDomainActivationActionTaskReference = serviceDomainActivationActionTaskReference;
  }

  public SDCurrentAccountActivateOutputModel serviceDomainActivationActionTaskRecord(Object serviceDomainActivationActionTaskRecord) {
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

  public SDCurrentAccountActivateOutputModel serviceDomainServicingSessionReference(String serviceDomainServicingSessionReference) {
    this.serviceDomainServicingSessionReference = serviceDomainServicingSessionReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return serviceDomainServicingSessionReference
  */
  @ApiModelProperty(example = "SSSR783215", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session ")


  public String getServiceDomainServicingSessionReference() {
    return serviceDomainServicingSessionReference;
  }

  public void setServiceDomainServicingSessionReference(String serviceDomainServicingSessionReference) {
    this.serviceDomainServicingSessionReference = serviceDomainServicingSessionReference;
  }

  public SDCurrentAccountActivateOutputModel serviceDomainServicingSessionRecord(Object serviceDomainServicingSessionRecord) {
    this.serviceDomainServicingSessionRecord = serviceDomainServicingSessionRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return serviceDomainServicingSessionRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session ")

  @Valid

  public Object getServiceDomainServicingSessionRecord() {
    return serviceDomainServicingSessionRecord;
  }

  public void setServiceDomainServicingSessionRecord(Object serviceDomainServicingSessionRecord) {
    this.serviceDomainServicingSessionRecord = serviceDomainServicingSessionRecord;
  }

  public SDCurrentAccountActivateOutputModel serviceDomainServiceConfigurationRecord(InlineResponse201ServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord) {
    this.serviceDomainServiceConfigurationRecord = serviceDomainServiceConfigurationRecord;
    return this;
  }

  /**
   * Get serviceDomainServiceConfigurationRecord
   * @return serviceDomainServiceConfigurationRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse201ServiceDomainServiceConfigurationRecord getServiceDomainServiceConfigurationRecord() {
    return serviceDomainServiceConfigurationRecord;
  }

  public void setServiceDomainServiceConfigurationRecord(InlineResponse201ServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord) {
    this.serviceDomainServiceConfigurationRecord = serviceDomainServiceConfigurationRecord;
  }

  public SDCurrentAccountActivateOutputModel serviceDomainServicingSessionStatus(String serviceDomainServicingSessionStatus) {
    this.serviceDomainServicingSessionStatus = serviceDomainServicingSessionStatus;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return serviceDomainServicingSessionStatus
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session ")


  public String getServiceDomainServicingSessionStatus() {
    return serviceDomainServicingSessionStatus;
  }

  public void setServiceDomainServicingSessionStatus(String serviceDomainServicingSessionStatus) {
    this.serviceDomainServicingSessionStatus = serviceDomainServicingSessionStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCurrentAccountActivateOutputModel sdCurrentAccountActivateOutputModel = (SDCurrentAccountActivateOutputModel) o;
    return Objects.equals(this.serviceDomainActivationActionTaskReference, sdCurrentAccountActivateOutputModel.serviceDomainActivationActionTaskReference) &&
        Objects.equals(this.serviceDomainActivationActionTaskRecord, sdCurrentAccountActivateOutputModel.serviceDomainActivationActionTaskRecord) &&
        Objects.equals(this.serviceDomainServicingSessionReference, sdCurrentAccountActivateOutputModel.serviceDomainServicingSessionReference) &&
        Objects.equals(this.serviceDomainServicingSessionRecord, sdCurrentAccountActivateOutputModel.serviceDomainServicingSessionRecord) &&
        Objects.equals(this.serviceDomainServiceConfigurationRecord, sdCurrentAccountActivateOutputModel.serviceDomainServiceConfigurationRecord) &&
        Objects.equals(this.serviceDomainServicingSessionStatus, sdCurrentAccountActivateOutputModel.serviceDomainServicingSessionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainActivationActionTaskReference, serviceDomainActivationActionTaskRecord, serviceDomainServicingSessionReference, serviceDomainServicingSessionRecord, serviceDomainServiceConfigurationRecord, serviceDomainServicingSessionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCurrentAccountActivateOutputModel {\n");
    
    sb.append("    serviceDomainActivationActionTaskReference: ").append(toIndentedString(serviceDomainActivationActionTaskReference)).append("\n");
    sb.append("    serviceDomainActivationActionTaskRecord: ").append(toIndentedString(serviceDomainActivationActionTaskRecord)).append("\n");
    sb.append("    serviceDomainServicingSessionReference: ").append(toIndentedString(serviceDomainServicingSessionReference)).append("\n");
    sb.append("    serviceDomainServicingSessionRecord: ").append(toIndentedString(serviceDomainServicingSessionRecord)).append("\n");
    sb.append("    serviceDomainServiceConfigurationRecord: ").append(toIndentedString(serviceDomainServiceConfigurationRecord)).append("\n");
    sb.append("    serviceDomainServicingSessionStatus: ").append(toIndentedString(serviceDomainServicingSessionStatus)).append("\n");
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

