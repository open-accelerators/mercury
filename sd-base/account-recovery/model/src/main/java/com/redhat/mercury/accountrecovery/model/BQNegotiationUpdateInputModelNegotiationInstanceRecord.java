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
 * BQNegotiationUpdateInputModelNegotiationInstanceRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-07T18:27:41.474305+02:00[Europe/Madrid]")
public class BQNegotiationUpdateInputModelNegotiationInstanceRecord {
  @SerializedName("accountRecoveryGuidelines")
  private String accountRecoveryGuidelines = null;

  @SerializedName("correspondenceReference")
  private String correspondenceReference = null;

  @SerializedName("correspondenceContent")
  private String correspondenceContent = null;

  @SerializedName("documentReference")
  private String documentReference = null;

  @SerializedName("documentContent")
  private String documentContent = null;

  @SerializedName("accountRecoveryCaseNegotiationTaskRecord")
  private Object accountRecoveryCaseNegotiationTaskRecord = null;

  public BQNegotiationUpdateInputModelNegotiationInstanceRecord accountRecoveryGuidelines(String accountRecoveryGuidelines) {
    this.accountRecoveryGuidelines = accountRecoveryGuidelines;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines bank&#x27;s policies and guidelines for account recovery/write down handling 
   * @return accountRecoveryGuidelines
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines bank's policies and guidelines for account recovery/write down handling ")
  public String getAccountRecoveryGuidelines() {
    return accountRecoveryGuidelines;
  }

  public void setAccountRecoveryGuidelines(String accountRecoveryGuidelines) {
    this.accountRecoveryGuidelines = accountRecoveryGuidelines;
  }

  public BQNegotiationUpdateInputModelNegotiationInstanceRecord correspondenceReference(String correspondenceReference) {
    this.correspondenceReference = correspondenceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to negotiation/confirmation messages sent to involved parties, includes internal and external legal/law enforcement authorities 
   * @return correspondenceReference
  **/
  @Schema(example = "710059", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to negotiation/confirmation messages sent to involved parties, includes internal and external legal/law enforcement authorities ")
  public String getCorrespondenceReference() {
    return correspondenceReference;
  }

  public void setCorrespondenceReference(String correspondenceReference) {
    this.correspondenceReference = correspondenceReference;
  }

  public BQNegotiationUpdateInputModelNegotiationInstanceRecord correspondenceContent(String correspondenceContent) {
    this.correspondenceContent = correspondenceContent;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Copies of correspondence content as appropriate 
   * @return correspondenceContent
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Copies of correspondence content as appropriate ")
  public String getCorrespondenceContent() {
    return correspondenceContent;
  }

  public void setCorrespondenceContent(String correspondenceContent) {
    this.correspondenceContent = correspondenceContent;
  }

  public BQNegotiationUpdateInputModelNegotiationInstanceRecord documentReference(String documentReference) {
    this.documentReference = documentReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to legal documents created &amp; referenced during the account recovery negotiation process 
   * @return documentReference
  **/
  @Schema(example = "735204", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to legal documents created & referenced during the account recovery negotiation process ")
  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }

  public BQNegotiationUpdateInputModelNegotiationInstanceRecord documentContent(String documentContent) {
    this.documentContent = documentContent;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Copies of document copy/content as appropriate 
   * @return documentContent
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Copies of document copy/content as appropriate ")
  public String getDocumentContent() {
    return documentContent;
  }

  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
  }

  public BQNegotiationUpdateInputModelNegotiationInstanceRecord accountRecoveryCaseNegotiationTaskRecord(Object accountRecoveryCaseNegotiationTaskRecord) {
    this.accountRecoveryCaseNegotiationTaskRecord = accountRecoveryCaseNegotiationTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Processing record for the negotiation task within the account recovery process 
   * @return accountRecoveryCaseNegotiationTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Processing record for the negotiation task within the account recovery process ")
  public Object getAccountRecoveryCaseNegotiationTaskRecord() {
    return accountRecoveryCaseNegotiationTaskRecord;
  }

  public void setAccountRecoveryCaseNegotiationTaskRecord(Object accountRecoveryCaseNegotiationTaskRecord) {
    this.accountRecoveryCaseNegotiationTaskRecord = accountRecoveryCaseNegotiationTaskRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQNegotiationUpdateInputModelNegotiationInstanceRecord bqNegotiationUpdateInputModelNegotiationInstanceRecord = (BQNegotiationUpdateInputModelNegotiationInstanceRecord) o;
    return Objects.equals(this.accountRecoveryGuidelines, bqNegotiationUpdateInputModelNegotiationInstanceRecord.accountRecoveryGuidelines) &&
        Objects.equals(this.correspondenceReference, bqNegotiationUpdateInputModelNegotiationInstanceRecord.correspondenceReference) &&
        Objects.equals(this.correspondenceContent, bqNegotiationUpdateInputModelNegotiationInstanceRecord.correspondenceContent) &&
        Objects.equals(this.documentReference, bqNegotiationUpdateInputModelNegotiationInstanceRecord.documentReference) &&
        Objects.equals(this.documentContent, bqNegotiationUpdateInputModelNegotiationInstanceRecord.documentContent) &&
        Objects.equals(this.accountRecoveryCaseNegotiationTaskRecord, bqNegotiationUpdateInputModelNegotiationInstanceRecord.accountRecoveryCaseNegotiationTaskRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountRecoveryGuidelines, correspondenceReference, correspondenceContent, documentReference, documentContent, accountRecoveryCaseNegotiationTaskRecord);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQNegotiationUpdateInputModelNegotiationInstanceRecord {\n");
    
    sb.append("    accountRecoveryGuidelines: ").append(toIndentedString(accountRecoveryGuidelines)).append("\n");
    sb.append("    correspondenceReference: ").append(toIndentedString(correspondenceReference)).append("\n");
    sb.append("    correspondenceContent: ").append(toIndentedString(correspondenceContent)).append("\n");
    sb.append("    documentReference: ").append(toIndentedString(documentReference)).append("\n");
    sb.append("    documentContent: ").append(toIndentedString(documentContent)).append("\n");
    sb.append("    accountRecoveryCaseNegotiationTaskRecord: ").append(toIndentedString(accountRecoveryCaseNegotiationTaskRecord)).append("\n");
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
