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
 * InlineResponse200
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class InlineResponse200   {
  @JsonProperty("serviceDomainConfigurationActionTaskReference")
  private String serviceDomainConfigurationActionTaskReference;

  @JsonProperty("serviceDomainConfigurationActionTaskRecord")
  private Object serviceDomainConfigurationActionTaskRecord;

  @JsonProperty("serviceDomainServiceConfigurationRecord")
  private InlineResponse200ServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord;

  @JsonProperty("serviceDomainServicingSessionStatus")
  private String serviceDomainServicingSessionStatus;

  public InlineResponse200 serviceDomainConfigurationActionTaskReference(String serviceDomainConfigurationActionTaskReference) {
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

  public InlineResponse200 serviceDomainConfigurationActionTaskRecord(Object serviceDomainConfigurationActionTaskRecord) {
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

  public InlineResponse200 serviceDomainServiceConfigurationRecord(InlineResponse200ServiceDomainServiceConfigurationRecord serviceDomainServiceConfigurationRecord) {
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

  public InlineResponse200 serviceDomainServicingSessionStatus(String serviceDomainServicingSessionStatus) {
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
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.serviceDomainConfigurationActionTaskReference, inlineResponse200.serviceDomainConfigurationActionTaskReference) &&
        Objects.equals(this.serviceDomainConfigurationActionTaskRecord, inlineResponse200.serviceDomainConfigurationActionTaskRecord) &&
        Objects.equals(this.serviceDomainServiceConfigurationRecord, inlineResponse200.serviceDomainServiceConfigurationRecord) &&
        Objects.equals(this.serviceDomainServicingSessionStatus, inlineResponse200.serviceDomainServicingSessionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainConfigurationActionTaskReference, serviceDomainConfigurationActionTaskRecord, serviceDomainServiceConfigurationRecord, serviceDomainServicingSessionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
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

