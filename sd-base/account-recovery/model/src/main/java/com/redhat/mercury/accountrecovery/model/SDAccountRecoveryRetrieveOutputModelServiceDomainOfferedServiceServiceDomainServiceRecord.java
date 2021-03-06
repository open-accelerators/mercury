/*
 * Account Recovery
 * This service domain handles the restructuring of a distressed account (loan) after standard recovery
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.redhat.mercury.accountrecovery.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SDAccountRecoveryRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-07T18:27:41.474305+02:00[Europe/Madrid]")
public class SDAccountRecoveryRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord {
  @SerializedName("serviceDomainServiceType")
  private String serviceDomainServiceType = null;

  @SerializedName("serviceDomainServiceVersion")
  private String serviceDomainServiceVersion = null;

  @SerializedName("serviceDomainServiceDescription")
  private String serviceDomainServiceDescription = null;

  @SerializedName("serviceDomainServicePoliciesandGuidelines")
  private Object serviceDomainServicePoliciesandGuidelines = null;

  @SerializedName("serviceDomainServiceSchedule")
  private String serviceDomainServiceSchedule = null;

  public SDAccountRecoveryRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceType(String serviceDomainServiceType) {
    this.serviceDomainServiceType = serviceDomainServiceType;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return serviceDomainServiceType
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered ")
  public String getServiceDomainServiceType() {
    return serviceDomainServiceType;
  }

  public void setServiceDomainServiceType(String serviceDomainServiceType) {
    this.serviceDomainServiceType = serviceDomainServiceType;
  }

  public SDAccountRecoveryRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceVersion(String serviceDomainServiceVersion) {
    this.serviceDomainServiceVersion = serviceDomainServiceVersion;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return serviceDomainServiceVersion
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate ")
  public String getServiceDomainServiceVersion() {
    return serviceDomainServiceVersion;
  }

  public void setServiceDomainServiceVersion(String serviceDomainServiceVersion) {
    this.serviceDomainServiceVersion = serviceDomainServiceVersion;
  }

  public SDAccountRecoveryRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceDescription(String serviceDomainServiceDescription) {
    this.serviceDomainServiceDescription = serviceDomainServiceDescription;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return serviceDomainServiceDescription
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  ")
  public String getServiceDomainServiceDescription() {
    return serviceDomainServiceDescription;
  }

  public void setServiceDomainServiceDescription(String serviceDomainServiceDescription) {
    this.serviceDomainServiceDescription = serviceDomainServiceDescription;
  }

  public SDAccountRecoveryRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServicePoliciesandGuidelines(Object serviceDomainServicePoliciesandGuidelines) {
    this.serviceDomainServicePoliciesandGuidelines = serviceDomainServicePoliciesandGuidelines;
    return this;
  }

   /**
   * Get serviceDomainServicePoliciesandGuidelines
   * @return serviceDomainServicePoliciesandGuidelines
  **/
  @Schema(description = "")
  public Object getServiceDomainServicePoliciesandGuidelines() {
    return serviceDomainServicePoliciesandGuidelines;
  }

  public void setServiceDomainServicePoliciesandGuidelines(Object serviceDomainServicePoliciesandGuidelines) {
    this.serviceDomainServicePoliciesandGuidelines = serviceDomainServicePoliciesandGuidelines;
  }

  public SDAccountRecoveryRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord serviceDomainServiceSchedule(String serviceDomainServiceSchedule) {
    this.serviceDomainServiceSchedule = serviceDomainServiceSchedule;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return serviceDomainServiceSchedule
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available ")
  public String getServiceDomainServiceSchedule() {
    return serviceDomainServiceSchedule;
  }

  public void setServiceDomainServiceSchedule(String serviceDomainServiceSchedule) {
    this.serviceDomainServiceSchedule = serviceDomainServiceSchedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDAccountRecoveryRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord sdAccountRecoveryRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord = (SDAccountRecoveryRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord) o;
    return Objects.equals(this.serviceDomainServiceType, sdAccountRecoveryRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord.serviceDomainServiceType) &&
        Objects.equals(this.serviceDomainServiceVersion, sdAccountRecoveryRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord.serviceDomainServiceVersion) &&
        Objects.equals(this.serviceDomainServiceDescription, sdAccountRecoveryRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord.serviceDomainServiceDescription) &&
        Objects.equals(this.serviceDomainServicePoliciesandGuidelines, sdAccountRecoveryRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord.serviceDomainServicePoliciesandGuidelines) &&
        Objects.equals(this.serviceDomainServiceSchedule, sdAccountRecoveryRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord.serviceDomainServiceSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainServiceType, serviceDomainServiceVersion, serviceDomainServiceDescription, serviceDomainServicePoliciesandGuidelines, serviceDomainServiceSchedule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDAccountRecoveryRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord {\n");
    
    sb.append("    serviceDomainServiceType: ").append(toIndentedString(serviceDomainServiceType)).append("\n");
    sb.append("    serviceDomainServiceVersion: ").append(toIndentedString(serviceDomainServiceVersion)).append("\n");
    sb.append("    serviceDomainServiceDescription: ").append(toIndentedString(serviceDomainServiceDescription)).append("\n");
    sb.append("    serviceDomainServicePoliciesandGuidelines: ").append(toIndentedString(serviceDomainServicePoliciesandGuidelines)).append("\n");
    sb.append("    serviceDomainServiceSchedule: ").append(toIndentedString(serviceDomainServiceSchedule)).append("\n");
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
