package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.SDCurrentAccountRetrieveInputModelServiceDomainOfferedService1ServiceDomainServiceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCurrentAccountRetrieveInputModelServiceDomainOfferedService
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class SDCurrentAccountRetrieveInputModelServiceDomainOfferedService   {
  @JsonProperty("serviceDomainServiceReference")
  private String serviceDomainServiceReference;

  @JsonProperty("serviceDomainServiceRecord")
  private SDCurrentAccountRetrieveInputModelServiceDomainOfferedService1ServiceDomainServiceRecord serviceDomainServiceRecord;

  public SDCurrentAccountRetrieveInputModelServiceDomainOfferedService serviceDomainServiceReference(String serviceDomainServiceReference) {
    this.serviceDomainServiceReference = serviceDomainServiceReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return serviceDomainServiceReference
  */
  @ApiModelProperty(example = "776158", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center ")


  public String getServiceDomainServiceReference() {
    return serviceDomainServiceReference;
  }

  public void setServiceDomainServiceReference(String serviceDomainServiceReference) {
    this.serviceDomainServiceReference = serviceDomainServiceReference;
  }

  public SDCurrentAccountRetrieveInputModelServiceDomainOfferedService serviceDomainServiceRecord(SDCurrentAccountRetrieveInputModelServiceDomainOfferedService1ServiceDomainServiceRecord serviceDomainServiceRecord) {
    this.serviceDomainServiceRecord = serviceDomainServiceRecord;
    return this;
  }

  /**
   * Get serviceDomainServiceRecord
   * @return serviceDomainServiceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public SDCurrentAccountRetrieveInputModelServiceDomainOfferedService1ServiceDomainServiceRecord getServiceDomainServiceRecord() {
    return serviceDomainServiceRecord;
  }

  public void setServiceDomainServiceRecord(SDCurrentAccountRetrieveInputModelServiceDomainOfferedService1ServiceDomainServiceRecord serviceDomainServiceRecord) {
    this.serviceDomainServiceRecord = serviceDomainServiceRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCurrentAccountRetrieveInputModelServiceDomainOfferedService sdCurrentAccountRetrieveInputModelServiceDomainOfferedService = (SDCurrentAccountRetrieveInputModelServiceDomainOfferedService) o;
    return Objects.equals(this.serviceDomainServiceReference, sdCurrentAccountRetrieveInputModelServiceDomainOfferedService.serviceDomainServiceReference) &&
        Objects.equals(this.serviceDomainServiceRecord, sdCurrentAccountRetrieveInputModelServiceDomainOfferedService.serviceDomainServiceRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceReference, serviceDomainServiceRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCurrentAccountRetrieveInputModelServiceDomainOfferedService {\n");
    
    sb.append("    serviceDomainServiceReference: ").append(toIndentedString(serviceDomainServiceReference)).append("\n");
    sb.append("    serviceDomainServiceRecord: ").append(toIndentedString(serviceDomainServiceRecord)).append("\n");
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

