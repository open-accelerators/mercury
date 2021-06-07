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
 * BQRestructuringExchangeInputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-07T18:27:41.474305+02:00[Europe/Madrid]")
public class BQRestructuringExchangeInputModel {
  @SerializedName("accountRecoveryProcedureInstanceReference")
  private String accountRecoveryProcedureInstanceReference = null;

  @SerializedName("restructuringInstanceReference")
  private String restructuringInstanceReference = null;

  @SerializedName("restructuringExchangeActionTaskRecord")
  private Object restructuringExchangeActionTaskRecord = null;

  @SerializedName("restructuringExchangeActionRequest")
  private Object restructuringExchangeActionRequest = null;

  public BQRestructuringExchangeInputModel accountRecoveryProcedureInstanceReference(String accountRecoveryProcedureInstanceReference) {
    this.accountRecoveryProcedureInstanceReference = accountRecoveryProcedureInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Account Recovery Procedure instance 
   * @return accountRecoveryProcedureInstanceReference
  **/
  @Schema(example = "ARPIR709118", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Account Recovery Procedure instance ")
  public String getAccountRecoveryProcedureInstanceReference() {
    return accountRecoveryProcedureInstanceReference;
  }

  public void setAccountRecoveryProcedureInstanceReference(String accountRecoveryProcedureInstanceReference) {
    this.accountRecoveryProcedureInstanceReference = accountRecoveryProcedureInstanceReference;
  }

  public BQRestructuringExchangeInputModel restructuringInstanceReference(String restructuringInstanceReference) {
    this.restructuringInstanceReference = restructuringInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Restructuring instance 
   * @return restructuringInstanceReference
  **/
  @Schema(example = "RIR716015", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Restructuring instance ")
  public String getRestructuringInstanceReference() {
    return restructuringInstanceReference;
  }

  public void setRestructuringInstanceReference(String restructuringInstanceReference) {
    this.restructuringInstanceReference = restructuringInstanceReference;
  }

  public BQRestructuringExchangeInputModel restructuringExchangeActionTaskRecord(Object restructuringExchangeActionTaskRecord) {
    this.restructuringExchangeActionTaskRecord = restructuringExchangeActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return restructuringExchangeActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record ")
  public Object getRestructuringExchangeActionTaskRecord() {
    return restructuringExchangeActionTaskRecord;
  }

  public void setRestructuringExchangeActionTaskRecord(Object restructuringExchangeActionTaskRecord) {
    this.restructuringExchangeActionTaskRecord = restructuringExchangeActionTaskRecord;
  }

  public BQRestructuringExchangeInputModel restructuringExchangeActionRequest(Object restructuringExchangeActionRequest) {
    this.restructuringExchangeActionRequest = restructuringExchangeActionRequest;
    return this;
  }

   /**
   * Get restructuringExchangeActionRequest
   * @return restructuringExchangeActionRequest
  **/
  @Schema(description = "")
  public Object getRestructuringExchangeActionRequest() {
    return restructuringExchangeActionRequest;
  }

  public void setRestructuringExchangeActionRequest(Object restructuringExchangeActionRequest) {
    this.restructuringExchangeActionRequest = restructuringExchangeActionRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQRestructuringExchangeInputModel bqRestructuringExchangeInputModel = (BQRestructuringExchangeInputModel) o;
    return Objects.equals(this.accountRecoveryProcedureInstanceReference, bqRestructuringExchangeInputModel.accountRecoveryProcedureInstanceReference) &&
        Objects.equals(this.restructuringInstanceReference, bqRestructuringExchangeInputModel.restructuringInstanceReference) &&
        Objects.equals(this.restructuringExchangeActionTaskRecord, bqRestructuringExchangeInputModel.restructuringExchangeActionTaskRecord) &&
        Objects.equals(this.restructuringExchangeActionRequest, bqRestructuringExchangeInputModel.restructuringExchangeActionRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountRecoveryProcedureInstanceReference, restructuringInstanceReference, restructuringExchangeActionTaskRecord, restructuringExchangeActionRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQRestructuringExchangeInputModel {\n");
    
    sb.append("    accountRecoveryProcedureInstanceReference: ").append(toIndentedString(accountRecoveryProcedureInstanceReference)).append("\n");
    sb.append("    restructuringInstanceReference: ").append(toIndentedString(restructuringInstanceReference)).append("\n");
    sb.append("    restructuringExchangeActionTaskRecord: ").append(toIndentedString(restructuringExchangeActionTaskRecord)).append("\n");
    sb.append("    restructuringExchangeActionRequest: ").append(toIndentedString(restructuringExchangeActionRequest)).append("\n");
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
