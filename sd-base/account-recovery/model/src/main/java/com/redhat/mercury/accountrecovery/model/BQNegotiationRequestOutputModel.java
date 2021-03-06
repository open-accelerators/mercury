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
 * BQNegotiationRequestOutputModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-07T18:27:41.474305+02:00[Europe/Madrid]")
public class BQNegotiationRequestOutputModel {
  @SerializedName("negotiationRequestActionTaskReference")
  private String negotiationRequestActionTaskReference = null;

  @SerializedName("negotiationRequestActionTaskRecord")
  private Object negotiationRequestActionTaskRecord = null;

  @SerializedName("negotiationRequestRecordReference")
  private String negotiationRequestRecordReference = null;

  @SerializedName("requestResponseRecord")
  private Object requestResponseRecord = null;

  public BQNegotiationRequestOutputModel negotiationRequestActionTaskReference(String negotiationRequestActionTaskReference) {
    this.negotiationRequestActionTaskReference = negotiationRequestActionTaskReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Negotiation instance request service call 
   * @return negotiationRequestActionTaskReference
  **/
  @Schema(example = "NRATR719840", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Negotiation instance request service call ")
  public String getNegotiationRequestActionTaskReference() {
    return negotiationRequestActionTaskReference;
  }

  public void setNegotiationRequestActionTaskReference(String negotiationRequestActionTaskReference) {
    this.negotiationRequestActionTaskReference = negotiationRequestActionTaskReference;
  }

  public BQNegotiationRequestOutputModel negotiationRequestActionTaskRecord(Object negotiationRequestActionTaskRecord) {
    this.negotiationRequestActionTaskRecord = negotiationRequestActionTaskRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return negotiationRequestActionTaskRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record ")
  public Object getNegotiationRequestActionTaskRecord() {
    return negotiationRequestActionTaskRecord;
  }

  public void setNegotiationRequestActionTaskRecord(Object negotiationRequestActionTaskRecord) {
    this.negotiationRequestActionTaskRecord = negotiationRequestActionTaskRecord;
  }

  public BQNegotiationRequestOutputModel negotiationRequestRecordReference(String negotiationRequestRecordReference) {
    this.negotiationRequestRecordReference = negotiationRequestRecordReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Negotiation service request record 
   * @return negotiationRequestRecordReference
  **/
  @Schema(example = "NRRR774206", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Negotiation service request record ")
  public String getNegotiationRequestRecordReference() {
    return negotiationRequestRecordReference;
  }

  public void setNegotiationRequestRecordReference(String negotiationRequestRecordReference) {
    this.negotiationRequestRecordReference = negotiationRequestRecordReference;
  }

  public BQNegotiationRequestOutputModel requestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response ")
  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQNegotiationRequestOutputModel bqNegotiationRequestOutputModel = (BQNegotiationRequestOutputModel) o;
    return Objects.equals(this.negotiationRequestActionTaskReference, bqNegotiationRequestOutputModel.negotiationRequestActionTaskReference) &&
        Objects.equals(this.negotiationRequestActionTaskRecord, bqNegotiationRequestOutputModel.negotiationRequestActionTaskRecord) &&
        Objects.equals(this.negotiationRequestRecordReference, bqNegotiationRequestOutputModel.negotiationRequestRecordReference) &&
        Objects.equals(this.requestResponseRecord, bqNegotiationRequestOutputModel.requestResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(negotiationRequestActionTaskReference, negotiationRequestActionTaskRecord, negotiationRequestRecordReference, requestResponseRecord);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQNegotiationRequestOutputModel {\n");
    
    sb.append("    negotiationRequestActionTaskReference: ").append(toIndentedString(negotiationRequestActionTaskReference)).append("\n");
    sb.append("    negotiationRequestActionTaskRecord: ").append(toIndentedString(negotiationRequestActionTaskRecord)).append("\n");
    sb.append("    negotiationRequestRecordReference: ").append(toIndentedString(negotiationRequestRecordReference)).append("\n");
    sb.append("    requestResponseRecord: ").append(toIndentedString(requestResponseRecord)).append("\n");
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
