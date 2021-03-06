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
 * CRAccountRecoveryProcedureExchangeInputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-07T18:27:41.474305+02:00[Europe/Madrid]")
public class CRAccountRecoveryProcedureExchangeInputModel {
  @SerializedName("accountRecoveryServicingSessionReference")
  private String accountRecoveryServicingSessionReference = null;

  @SerializedName("accountRecoveryProcedureInstanceReference")
  private String accountRecoveryProcedureInstanceReference = null;

  @SerializedName("accountRecoveryProcedureExchangeActionTaskRecord")
  private Object accountRecoveryProcedureExchangeActionTaskRecord = null;

  @SerializedName("accountRecoveryProcedureExchangeActionRequest")
  private Object accountRecoveryProcedureExchangeActionRequest = null;

  public CRAccountRecoveryProcedureExchangeInputModel accountRecoveryServicingSessionReference(String accountRecoveryServicingSessionReference) {
    this.accountRecoveryServicingSessionReference = accountRecoveryServicingSessionReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return accountRecoveryServicingSessionReference
  **/
  @Schema(example = "ARSSR724803", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session ")
  public String getAccountRecoveryServicingSessionReference() {
    return accountRecoveryServicingSessionReference;
  }

  public void setAccountRecoveryServicingSessionReference(String accountRecoveryServicingSessionReference) {
    this.accountRecoveryServicingSessionReference = accountRecoveryServicingSessionReference;
  }

  public CRAccountRecoveryProcedureExchangeInputModel accountRecoveryProcedureInstanceReference(String accountRecoveryProcedureInstanceReference) {
    this.accountRecoveryProcedureInstanceReference = accountRecoveryProcedureInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Recovery Procedure instance 
   * @return accountRecoveryProcedureInstanceReference
  **/
  @Schema(example = "ARPIR747638", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Recovery Procedure instance ")
  public String getAccountRecoveryProcedureInstanceReference() {
    return accountRecoveryProcedureInstanceReference;
  }

  public void setAccountRecoveryProcedureInstanceReference(String accountRecoveryProcedureInstanceReference) {
    this.accountRecoveryProcedureInstanceReference = accountRecoveryProcedureInstanceReference;
  }

  public CRAccountRecoveryProcedureExchangeInputModel accountRecoveryProcedureExchangeActionTaskRecord(Object accountRecoveryProcedureExchangeActionTaskRecord) {
    this.accountRecoveryProcedureExchangeActionTaskRecord = accountRecoveryProcedureExchangeActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return accountRecoveryProcedureExchangeActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record ")
  public Object getAccountRecoveryProcedureExchangeActionTaskRecord() {
    return accountRecoveryProcedureExchangeActionTaskRecord;
  }

  public void setAccountRecoveryProcedureExchangeActionTaskRecord(Object accountRecoveryProcedureExchangeActionTaskRecord) {
    this.accountRecoveryProcedureExchangeActionTaskRecord = accountRecoveryProcedureExchangeActionTaskRecord;
  }

  public CRAccountRecoveryProcedureExchangeInputModel accountRecoveryProcedureExchangeActionRequest(Object accountRecoveryProcedureExchangeActionRequest) {
    this.accountRecoveryProcedureExchangeActionRequest = accountRecoveryProcedureExchangeActionRequest;
    return this;
  }

   /**
   * Get accountRecoveryProcedureExchangeActionRequest
   * @return accountRecoveryProcedureExchangeActionRequest
  **/
  @Schema(description = "")
  public Object getAccountRecoveryProcedureExchangeActionRequest() {
    return accountRecoveryProcedureExchangeActionRequest;
  }

  public void setAccountRecoveryProcedureExchangeActionRequest(Object accountRecoveryProcedureExchangeActionRequest) {
    this.accountRecoveryProcedureExchangeActionRequest = accountRecoveryProcedureExchangeActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRAccountRecoveryProcedureExchangeInputModel crAccountRecoveryProcedureExchangeInputModel = (CRAccountRecoveryProcedureExchangeInputModel) o;
    return Objects.equals(this.accountRecoveryServicingSessionReference, crAccountRecoveryProcedureExchangeInputModel.accountRecoveryServicingSessionReference) &&
        Objects.equals(this.accountRecoveryProcedureInstanceReference, crAccountRecoveryProcedureExchangeInputModel.accountRecoveryProcedureInstanceReference) &&
        Objects.equals(this.accountRecoveryProcedureExchangeActionTaskRecord, crAccountRecoveryProcedureExchangeInputModel.accountRecoveryProcedureExchangeActionTaskRecord) &&
        Objects.equals(this.accountRecoveryProcedureExchangeActionRequest, crAccountRecoveryProcedureExchangeInputModel.accountRecoveryProcedureExchangeActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountRecoveryServicingSessionReference, accountRecoveryProcedureInstanceReference, accountRecoveryProcedureExchangeActionTaskRecord, accountRecoveryProcedureExchangeActionRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRAccountRecoveryProcedureExchangeInputModel {\n");
    
    sb.append("    accountRecoveryServicingSessionReference: ").append(toIndentedString(accountRecoveryServicingSessionReference)).append("\n");
    sb.append("    accountRecoveryProcedureInstanceReference: ").append(toIndentedString(accountRecoveryProcedureInstanceReference)).append("\n");
    sb.append("    accountRecoveryProcedureExchangeActionTaskRecord: ").append(toIndentedString(accountRecoveryProcedureExchangeActionTaskRecord)).append("\n");
    sb.append("    accountRecoveryProcedureExchangeActionRequest: ").append(toIndentedString(accountRecoveryProcedureExchangeActionRequest)).append("\n");
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
