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
 * BQRestructuringUpdateInputModelRestructuringInstanceRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-07T18:27:41.474305+02:00[Europe/Madrid]")
public class BQRestructuringUpdateInputModelRestructuringInstanceRecord {
  @SerializedName("accountRecoveryRestructuringSchedule")
  private String accountRecoveryRestructuringSchedule = null;

  public BQRestructuringUpdateInputModelRestructuringInstanceRecord accountRecoveryRestructuringSchedule(String accountRecoveryRestructuringSchedule) {
    this.accountRecoveryRestructuringSchedule = accountRecoveryRestructuringSchedule;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Target dates for account restructuring/set-up added to the Account Recovery Case Resolution Schedule 
   * @return accountRecoveryRestructuringSchedule
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Target dates for account restructuring/set-up added to the Account Recovery Case Resolution Schedule ")
  public String getAccountRecoveryRestructuringSchedule() {
    return accountRecoveryRestructuringSchedule;
  }

  public void setAccountRecoveryRestructuringSchedule(String accountRecoveryRestructuringSchedule) {
    this.accountRecoveryRestructuringSchedule = accountRecoveryRestructuringSchedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQRestructuringUpdateInputModelRestructuringInstanceRecord bqRestructuringUpdateInputModelRestructuringInstanceRecord = (BQRestructuringUpdateInputModelRestructuringInstanceRecord) o;
    return Objects.equals(this.accountRecoveryRestructuringSchedule, bqRestructuringUpdateInputModelRestructuringInstanceRecord.accountRecoveryRestructuringSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountRecoveryRestructuringSchedule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQRestructuringUpdateInputModelRestructuringInstanceRecord {\n");
    
    sb.append("    accountRecoveryRestructuringSchedule: ").append(toIndentedString(accountRecoveryRestructuringSchedule)).append("\n");
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
