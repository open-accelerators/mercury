package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2002ServiceDomainOfferedService;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2002ServiceDomainRetrieveActionRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2002
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class InlineResponse2002   {
  @JsonProperty("serviceDomainRetrieveActionTaskReference")
  private String serviceDomainRetrieveActionTaskReference;

  @JsonProperty("serviceDomainRetrieveActionTaskRecord")
  private Object serviceDomainRetrieveActionTaskRecord;

  @JsonProperty("serviceDomainRetrieveActionResponse")
  private String serviceDomainRetrieveActionResponse;

  @JsonProperty("serviceDomainRetrieveActionRecord")
  private InlineResponse2002ServiceDomainRetrieveActionRecord serviceDomainRetrieveActionRecord;

  @JsonProperty("serviceDomainOfferedService")
  private InlineResponse2002ServiceDomainOfferedService serviceDomainOfferedService;

  public InlineResponse2002 serviceDomainRetrieveActionTaskReference(String serviceDomainRetrieveActionTaskReference) {
    this.serviceDomainRetrieveActionTaskReference = serviceDomainRetrieveActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return serviceDomainRetrieveActionTaskReference
  */
  @ApiModelProperty(example = "SRATR795161", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call ")


  public String getServiceDomainRetrieveActionTaskReference() {
    return serviceDomainRetrieveActionTaskReference;
  }

  public void setServiceDomainRetrieveActionTaskReference(String serviceDomainRetrieveActionTaskReference) {
    this.serviceDomainRetrieveActionTaskReference = serviceDomainRetrieveActionTaskReference;
  }

  public InlineResponse2002 serviceDomainRetrieveActionTaskRecord(Object serviceDomainRetrieveActionTaskRecord) {
    this.serviceDomainRetrieveActionTaskRecord = serviceDomainRetrieveActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return serviceDomainRetrieveActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")

  @Valid

  public Object getServiceDomainRetrieveActionTaskRecord() {
    return serviceDomainRetrieveActionTaskRecord;
  }

  public void setServiceDomainRetrieveActionTaskRecord(Object serviceDomainRetrieveActionTaskRecord) {
    this.serviceDomainRetrieveActionTaskRecord = serviceDomainRetrieveActionTaskRecord;
  }

  public InlineResponse2002 serviceDomainRetrieveActionResponse(String serviceDomainRetrieveActionResponse) {
    this.serviceDomainRetrieveActionResponse = serviceDomainRetrieveActionResponse;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return serviceDomainRetrieveActionResponse
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) ")


  public String getServiceDomainRetrieveActionResponse() {
    return serviceDomainRetrieveActionResponse;
  }

  public void setServiceDomainRetrieveActionResponse(String serviceDomainRetrieveActionResponse) {
    this.serviceDomainRetrieveActionResponse = serviceDomainRetrieveActionResponse;
  }

  public InlineResponse2002 serviceDomainRetrieveActionRecord(InlineResponse2002ServiceDomainRetrieveActionRecord serviceDomainRetrieveActionRecord) {
    this.serviceDomainRetrieveActionRecord = serviceDomainRetrieveActionRecord;
    return this;
  }

  /**
   * Get serviceDomainRetrieveActionRecord
   * @return serviceDomainRetrieveActionRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2002ServiceDomainRetrieveActionRecord getServiceDomainRetrieveActionRecord() {
    return serviceDomainRetrieveActionRecord;
  }

  public void setServiceDomainRetrieveActionRecord(InlineResponse2002ServiceDomainRetrieveActionRecord serviceDomainRetrieveActionRecord) {
    this.serviceDomainRetrieveActionRecord = serviceDomainRetrieveActionRecord;
  }

  public InlineResponse2002 serviceDomainOfferedService(InlineResponse2002ServiceDomainOfferedService serviceDomainOfferedService) {
    this.serviceDomainOfferedService = serviceDomainOfferedService;
    return this;
  }

  /**
   * Get serviceDomainOfferedService
   * @return serviceDomainOfferedService
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2002ServiceDomainOfferedService getServiceDomainOfferedService() {
    return serviceDomainOfferedService;
  }

  public void setServiceDomainOfferedService(InlineResponse2002ServiceDomainOfferedService serviceDomainOfferedService) {
    this.serviceDomainOfferedService = serviceDomainOfferedService;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.serviceDomainRetrieveActionTaskReference, inlineResponse2002.serviceDomainRetrieveActionTaskReference) &&
        Objects.equals(this.serviceDomainRetrieveActionTaskRecord, inlineResponse2002.serviceDomainRetrieveActionTaskRecord) &&
        Objects.equals(this.serviceDomainRetrieveActionResponse, inlineResponse2002.serviceDomainRetrieveActionResponse) &&
        Objects.equals(this.serviceDomainRetrieveActionRecord, inlineResponse2002.serviceDomainRetrieveActionRecord) &&
        Objects.equals(this.serviceDomainOfferedService, inlineResponse2002.serviceDomainOfferedService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainRetrieveActionTaskReference, serviceDomainRetrieveActionTaskRecord, serviceDomainRetrieveActionResponse, serviceDomainRetrieveActionRecord, serviceDomainOfferedService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    serviceDomainRetrieveActionTaskReference: ").append(toIndentedString(serviceDomainRetrieveActionTaskReference)).append("\n");
    sb.append("    serviceDomainRetrieveActionTaskRecord: ").append(toIndentedString(serviceDomainRetrieveActionTaskRecord)).append("\n");
    sb.append("    serviceDomainRetrieveActionResponse: ").append(toIndentedString(serviceDomainRetrieveActionResponse)).append("\n");
    sb.append("    serviceDomainRetrieveActionRecord: ").append(toIndentedString(serviceDomainRetrieveActionRecord)).append("\n");
    sb.append("    serviceDomainOfferedService: ").append(toIndentedString(serviceDomainOfferedService)).append("\n");
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

