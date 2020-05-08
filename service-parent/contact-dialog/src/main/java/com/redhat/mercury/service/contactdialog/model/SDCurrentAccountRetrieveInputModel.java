package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.SDCurrentAccountRetrieveInputModelServiceDomainOfferedService1;
import com.redhat.mercury.service.contactdialog.model.SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCurrentAccountRetrieveInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class SDCurrentAccountRetrieveInputModel   {
  @JsonProperty("serviceDomainRetrieveActionTaskRecord")
  private Object serviceDomainRetrieveActionTaskRecord;

  @JsonProperty("serviceDomainRetrieveActionRequest")
  private String serviceDomainRetrieveActionRequest;

  @JsonProperty("serviceDomainRetrieveActionRecord")
  private SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1 serviceDomainRetrieveActionRecord;

  @JsonProperty("serviceDomainOfferedService")
  private SDCurrentAccountRetrieveInputModelServiceDomainOfferedService1 serviceDomainOfferedService;

  public SDCurrentAccountRetrieveInputModel serviceDomainRetrieveActionTaskRecord(Object serviceDomainRetrieveActionTaskRecord) {
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

  public SDCurrentAccountRetrieveInputModel serviceDomainRetrieveActionRequest(String serviceDomainRetrieveActionRequest) {
    this.serviceDomainRetrieveActionRequest = serviceDomainRetrieveActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return serviceDomainRetrieveActionRequest
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")


  public String getServiceDomainRetrieveActionRequest() {
    return serviceDomainRetrieveActionRequest;
  }

  public void setServiceDomainRetrieveActionRequest(String serviceDomainRetrieveActionRequest) {
    this.serviceDomainRetrieveActionRequest = serviceDomainRetrieveActionRequest;
  }

  public SDCurrentAccountRetrieveInputModel serviceDomainRetrieveActionRecord(SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1 serviceDomainRetrieveActionRecord) {
    this.serviceDomainRetrieveActionRecord = serviceDomainRetrieveActionRecord;
    return this;
  }

  /**
   * Get serviceDomainRetrieveActionRecord
   * @return serviceDomainRetrieveActionRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1 getServiceDomainRetrieveActionRecord() {
    return serviceDomainRetrieveActionRecord;
  }

  public void setServiceDomainRetrieveActionRecord(SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1 serviceDomainRetrieveActionRecord) {
    this.serviceDomainRetrieveActionRecord = serviceDomainRetrieveActionRecord;
  }

  public SDCurrentAccountRetrieveInputModel serviceDomainOfferedService(SDCurrentAccountRetrieveInputModelServiceDomainOfferedService1 serviceDomainOfferedService) {
    this.serviceDomainOfferedService = serviceDomainOfferedService;
    return this;
  }

  /**
   * Get serviceDomainOfferedService
   * @return serviceDomainOfferedService
  */
  @ApiModelProperty(value = "")

  @Valid

  public SDCurrentAccountRetrieveInputModelServiceDomainOfferedService1 getServiceDomainOfferedService() {
    return serviceDomainOfferedService;
  }

  public void setServiceDomainOfferedService(SDCurrentAccountRetrieveInputModelServiceDomainOfferedService1 serviceDomainOfferedService) {
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
    SDCurrentAccountRetrieveInputModel sdCurrentAccountRetrieveInputModel = (SDCurrentAccountRetrieveInputModel) o;
    return Objects.equals(this.serviceDomainRetrieveActionTaskRecord, sdCurrentAccountRetrieveInputModel.serviceDomainRetrieveActionTaskRecord) &&
        Objects.equals(this.serviceDomainRetrieveActionRequest, sdCurrentAccountRetrieveInputModel.serviceDomainRetrieveActionRequest) &&
        Objects.equals(this.serviceDomainRetrieveActionRecord, sdCurrentAccountRetrieveInputModel.serviceDomainRetrieveActionRecord) &&
        Objects.equals(this.serviceDomainOfferedService, sdCurrentAccountRetrieveInputModel.serviceDomainOfferedService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainRetrieveActionTaskRecord, serviceDomainRetrieveActionRequest, serviceDomainRetrieveActionRecord, serviceDomainOfferedService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCurrentAccountRetrieveInputModel {\n");
    
    sb.append("    serviceDomainRetrieveActionTaskRecord: ").append(toIndentedString(serviceDomainRetrieveActionTaskRecord)).append("\n");
    sb.append("    serviceDomainRetrieveActionRequest: ").append(toIndentedString(serviceDomainRetrieveActionRequest)).append("\n");
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

