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
 * CRAccountRecoveryProcedureRetrieveInputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-07T18:27:41.474305+02:00[Europe/Madrid]")
public class CRAccountRecoveryProcedureRetrieveInputModel {
  @SerializedName("accountRecoveryProcedureRetrieveActionTaskRecord")
  private Object accountRecoveryProcedureRetrieveActionTaskRecord = null;

  @SerializedName("accountRecoveryProcedureRetrieveActionRequest")
  private String accountRecoveryProcedureRetrieveActionRequest = null;

  @SerializedName("accountRecoveryProcedureInstanceReportRecord")
  private Object accountRecoveryProcedureInstanceReportRecord = null;

  @SerializedName("accountRecoveryProcedureInstanceAnalysis")
  private Object accountRecoveryProcedureInstanceAnalysis = null;

  public CRAccountRecoveryProcedureRetrieveInputModel accountRecoveryProcedureRetrieveActionTaskRecord(Object accountRecoveryProcedureRetrieveActionTaskRecord) {
    this.accountRecoveryProcedureRetrieveActionTaskRecord = accountRecoveryProcedureRetrieveActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return accountRecoveryProcedureRetrieveActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")
  public Object getAccountRecoveryProcedureRetrieveActionTaskRecord() {
    return accountRecoveryProcedureRetrieveActionTaskRecord;
  }

  public void setAccountRecoveryProcedureRetrieveActionTaskRecord(Object accountRecoveryProcedureRetrieveActionTaskRecord) {
    this.accountRecoveryProcedureRetrieveActionTaskRecord = accountRecoveryProcedureRetrieveActionTaskRecord;
  }

  public CRAccountRecoveryProcedureRetrieveInputModel accountRecoveryProcedureRetrieveActionRequest(String accountRecoveryProcedureRetrieveActionRequest) {
    this.accountRecoveryProcedureRetrieveActionRequest = accountRecoveryProcedureRetrieveActionRequest;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return accountRecoveryProcedureRetrieveActionRequest
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")
  public String getAccountRecoveryProcedureRetrieveActionRequest() {
    return accountRecoveryProcedureRetrieveActionRequest;
  }

  public void setAccountRecoveryProcedureRetrieveActionRequest(String accountRecoveryProcedureRetrieveActionRequest) {
    this.accountRecoveryProcedureRetrieveActionRequest = accountRecoveryProcedureRetrieveActionRequest;
  }

  public CRAccountRecoveryProcedureRetrieveInputModel accountRecoveryProcedureInstanceReportRecord(Object accountRecoveryProcedureInstanceReportRecord) {
    this.accountRecoveryProcedureInstanceReportRecord = accountRecoveryProcedureInstanceReportRecord;
    return this;
  }

   /**
   * Get accountRecoveryProcedureInstanceReportRecord
   * @return accountRecoveryProcedureInstanceReportRecord
  **/
  @Schema(description = "")
  public Object getAccountRecoveryProcedureInstanceReportRecord() {
    return accountRecoveryProcedureInstanceReportRecord;
  }

  public void setAccountRecoveryProcedureInstanceReportRecord(Object accountRecoveryProcedureInstanceReportRecord) {
    this.accountRecoveryProcedureInstanceReportRecord = accountRecoveryProcedureInstanceReportRecord;
  }

  public CRAccountRecoveryProcedureRetrieveInputModel accountRecoveryProcedureInstanceAnalysis(Object accountRecoveryProcedureInstanceAnalysis) {
    this.accountRecoveryProcedureInstanceAnalysis = accountRecoveryProcedureInstanceAnalysis;
    return this;
  }

   /**
   * Get accountRecoveryProcedureInstanceAnalysis
   * @return accountRecoveryProcedureInstanceAnalysis
  **/
  @Schema(description = "")
  public Object getAccountRecoveryProcedureInstanceAnalysis() {
    return accountRecoveryProcedureInstanceAnalysis;
  }

  public void setAccountRecoveryProcedureInstanceAnalysis(Object accountRecoveryProcedureInstanceAnalysis) {
    this.accountRecoveryProcedureInstanceAnalysis = accountRecoveryProcedureInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRAccountRecoveryProcedureRetrieveInputModel crAccountRecoveryProcedureRetrieveInputModel = (CRAccountRecoveryProcedureRetrieveInputModel) o;
    return Objects.equals(this.accountRecoveryProcedureRetrieveActionTaskRecord, crAccountRecoveryProcedureRetrieveInputModel.accountRecoveryProcedureRetrieveActionTaskRecord) &&
        Objects.equals(this.accountRecoveryProcedureRetrieveActionRequest, crAccountRecoveryProcedureRetrieveInputModel.accountRecoveryProcedureRetrieveActionRequest) &&
        Objects.equals(this.accountRecoveryProcedureInstanceReportRecord, crAccountRecoveryProcedureRetrieveInputModel.accountRecoveryProcedureInstanceReportRecord) &&
        Objects.equals(this.accountRecoveryProcedureInstanceAnalysis, crAccountRecoveryProcedureRetrieveInputModel.accountRecoveryProcedureInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountRecoveryProcedureRetrieveActionTaskRecord, accountRecoveryProcedureRetrieveActionRequest, accountRecoveryProcedureInstanceReportRecord, accountRecoveryProcedureInstanceAnalysis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRAccountRecoveryProcedureRetrieveInputModel {\n");
    
    sb.append("    accountRecoveryProcedureRetrieveActionTaskRecord: ").append(toIndentedString(accountRecoveryProcedureRetrieveActionTaskRecord)).append("\n");
    sb.append("    accountRecoveryProcedureRetrieveActionRequest: ").append(toIndentedString(accountRecoveryProcedureRetrieveActionRequest)).append("\n");
    sb.append("    accountRecoveryProcedureInstanceReportRecord: ").append(toIndentedString(accountRecoveryProcedureInstanceReportRecord)).append("\n");
    sb.append("    accountRecoveryProcedureInstanceAnalysis: ").append(toIndentedString(accountRecoveryProcedureInstanceAnalysis)).append("\n");
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
