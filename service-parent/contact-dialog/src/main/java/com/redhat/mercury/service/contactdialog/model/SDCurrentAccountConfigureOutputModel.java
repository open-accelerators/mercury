package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse200ServiceDomainServiceConfigurationRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCurrentAccountConfigureOutputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class SDCurrentAccountConfigureOutputModel   {
  @JsonProperty("serviceDomainConfigurationActionTaskReference")
  private String serviceDomainConfigurationActionTaskReference;

  @JsonProperty("serviceDomainConfigurationActionTaskRecord")
  private Object serviceDomainConfigurationActionTaskRecord;

  @JsonProperty("serviceDomainServiceConfigurationRecord")
  private InlineResponse200ServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord;

  @JsonProperty("serviceDomainServicingSessionStatus")
  private String serviceDomainServicingSessionStatus;

  public SDCurrentAccountConfigureOutputModel serviceDomainConfigurationActionTaskReference(String serviceDomainConfigurationActionTaskReference) {
    this.serviceDomainConfigurationActionTaskReference = serviceDomainConfigurationActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return serviceDomainConfigurationActionTaskReference
  */
  @ApiModelProperty(example = "SCATR765419", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call ")


  public String getServiceDomainConfigurationActionTaskReference() {
    return serviceDomainConfigurationActionTaskReference;
  }

  public void setServiceDomainConfigurationActionTaskReference(String serviceDomainConfigurationActionTaskReference) {
    this.serviceDomainConfigurationActionTaskReference = serviceDomainConfigurationActionTaskReference;
  }

  public SDCurrentAccountConfigureOutputModel serviceDomainConfigurationActionTaskRecord(Object serviceDomainConfigurationActionTaskRecord) {
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

  public SDCurrentAccountConfigureOutputModel serviceDomainServiceConfigurationRecord(InlineResponse200ServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord) {
    this.serviceDomainServiceConfigurationRecord = serviceDomainServiceConfigurationRecord;
    return this;
  }

  /**
   * Get serviceDomainServiceConfigurationRecord
   * @return serviceDomainServiceConfigurationRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse200ServiceDomainServiceConfigurationRecord getServiceDomainServiceConfigurationRecord() {
    return serviceDomainServiceConfigurationRecord;
  }

  public void setServiceDomainServiceConfigurationRecord(InlineResponse200ServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord) {
    this.serviceDomainServiceConfigurationRecord = serviceDomainServiceConfigurationRecord;
  }

  public SDCurrentAccountConfigureOutputModel serviceDomainServicingSessionStatus(String serviceDomainServicingSessionStatus) {
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
    SDCurrentAccountConfigureOutputModel sdCurrentAccountConfigureOutputModel = (SDCurrentAccountConfigureOutputModel) o;
    return Objects.equals(this.serviceDomainConfigurationActionTaskReference, sdCurrentAccountConfigureOutputModel.serviceDomainConfigurationActionTaskReference) &&
        Objects.equals(this.serviceDomainConfigurationActionTaskRecord, sdCurrentAccountConfigureOutputModel.serviceDomainConfigurationActionTaskRecord) &&
        Objects.equals(this.serviceDomainServiceConfigurationRecord, sdCurrentAccountConfigureOutputModel.serviceDomainServiceConfigurationRecord) &&
        Objects.equals(this.serviceDomainServicingSessionStatus, sdCurrentAccountConfigureOutputModel.serviceDomainServicingSessionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainConfigurationActionTaskReference, serviceDomainConfigurationActionTaskRecord, serviceDomainServiceConfigurationRecord, serviceDomainServicingSessionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCurrentAccountConfigureOutputModel {\n");
    
    sb.append("    serviceDomainConfigurationActionTaskReference: ").append(toIndentedString(serviceDomainConfigurationActionTaskReference)).append("\n");
    sb.append("    serviceDomainConfigurationActionTaskRecord: ").append(toIndentedString(serviceDomainConfigurationActionTaskRecord)).append("\n");
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

