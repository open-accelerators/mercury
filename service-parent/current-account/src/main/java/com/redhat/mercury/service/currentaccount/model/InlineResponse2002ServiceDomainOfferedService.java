package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.InlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2002ServiceDomainOfferedService
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class InlineResponse2002ServiceDomainOfferedService   {
  @JsonProperty("serviceDomainServiceReference")
  private String serviceDomainServiceReference;

  @JsonProperty("serviceDomainServiceRecord")
  private InlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceRecord;

  public InlineResponse2002ServiceDomainOfferedService serviceDomainServiceReference(String serviceDomainServiceReference) {
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

  public InlineResponse2002ServiceDomainOfferedService serviceDomainServiceRecord(InlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceRecord) {
    this.serviceDomainServiceRecord = serviceDomainServiceRecord;
    return this;
  }

  /**
   * Get serviceDomainServiceRecord
   * @return serviceDomainServiceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecord getServiceDomainServiceRecord() {
    return serviceDomainServiceRecord;
  }

  public void setServiceDomainServiceRecord(InlineResponse2002ServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceRecord) {
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
    InlineResponse2002ServiceDomainOfferedService inlineResponse2002ServiceDomainOfferedService = (InlineResponse2002ServiceDomainOfferedService) o;
    return Objects.equals(this.serviceDomainServiceReference, inlineResponse2002ServiceDomainOfferedService.serviceDomainServiceReference) &&
        Objects.equals(this.serviceDomainServiceRecord, inlineResponse2002ServiceDomainOfferedService.serviceDomainServiceRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceReference, serviceDomainServiceRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002ServiceDomainOfferedService {\n");
    
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

