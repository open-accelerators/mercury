package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCurrentAccountRetrieveInputModelServiceDomainOfferedServiceServiceDomainServiceRecord
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class SDCurrentAccountRetrieveInputModelServiceDomainOfferedServiceServiceDomainServiceRecord   {
  @JsonProperty("serviceDomainServiceVersion")
  private String serviceDomainServiceVersion;

  public SDCurrentAccountRetrieveInputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceVersion(String serviceDomainServiceVersion) {
    this.serviceDomainServiceVersion = serviceDomainServiceVersion;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return serviceDomainServiceVersion
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate ")


  public String getServiceDomainServiceVersion() {
    return serviceDomainServiceVersion;
  }

  public void setServiceDomainServiceVersion(String serviceDomainServiceVersion) {
    this.serviceDomainServiceVersion = serviceDomainServiceVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCurrentAccountRetrieveInputModelServiceDomainOfferedServiceServiceDomainServiceRecord sdCurrentAccountRetrieveInputModelServiceDomainOfferedServiceServiceDomainServiceRecord = (SDCurrentAccountRetrieveInputModelServiceDomainOfferedServiceServiceDomainServiceRecord) o;
    return Objects.equals(this.serviceDomainServiceVersion, sdCurrentAccountRetrieveInputModelServiceDomainOfferedServiceServiceDomainServiceRecord.serviceDomainServiceVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCurrentAccountRetrieveInputModelServiceDomainOfferedServiceServiceDomainServiceRecord {\n");
    
    sb.append("    serviceDomainServiceVersion: ").append(toIndentedString(serviceDomainServiceVersion)).append("\n");
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

