package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2017IssuedDeviceInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQIssuedDeviceRequestOutputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQIssuedDeviceRequestOutputModel   {
  @JsonProperty("issuedDeviceInstanceRecord")
  private InlineResponse2017IssuedDeviceInstanceRecord issuedDeviceInstanceRecord;

  @JsonProperty("issuedDeviceRequestActionTaskReference")
  private String issuedDeviceRequestActionTaskReference;

  @JsonProperty("issuedDeviceRequestActionTaskRecord")
  private Object issuedDeviceRequestActionTaskRecord;

  @JsonProperty("issuedDeviceRequestRecordReference")
  private String issuedDeviceRequestRecordReference;

  @JsonProperty("requestResponseRecord")
  private Object requestResponseRecord;

  public BQIssuedDeviceRequestOutputModel issuedDeviceInstanceRecord(InlineResponse2017IssuedDeviceInstanceRecord issuedDeviceInstanceRecord) {
    this.issuedDeviceInstanceRecord = issuedDeviceInstanceRecord;
    return this;
  }

  /**
   * Get issuedDeviceInstanceRecord
   * @return issuedDeviceInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2017IssuedDeviceInstanceRecord getIssuedDeviceInstanceRecord() {
    return issuedDeviceInstanceRecord;
  }

  public void setIssuedDeviceInstanceRecord(InlineResponse2017IssuedDeviceInstanceRecord issuedDeviceInstanceRecord) {
    this.issuedDeviceInstanceRecord = issuedDeviceInstanceRecord;
  }

  public BQIssuedDeviceRequestOutputModel issuedDeviceRequestActionTaskReference(String issuedDeviceRequestActionTaskReference) {
    this.issuedDeviceRequestActionTaskReference = issuedDeviceRequestActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Issued Device instance request service call 
   * @return issuedDeviceRequestActionTaskReference
  */
  @ApiModelProperty(example = "IDRATR746136", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Issued Device instance request service call ")


  public String getIssuedDeviceRequestActionTaskReference() {
    return issuedDeviceRequestActionTaskReference;
  }

  public void setIssuedDeviceRequestActionTaskReference(String issuedDeviceRequestActionTaskReference) {
    this.issuedDeviceRequestActionTaskReference = issuedDeviceRequestActionTaskReference;
  }

  public BQIssuedDeviceRequestOutputModel issuedDeviceRequestActionTaskRecord(Object issuedDeviceRequestActionTaskRecord) {
    this.issuedDeviceRequestActionTaskRecord = issuedDeviceRequestActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return issuedDeviceRequestActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record ")

  @Valid

  public Object getIssuedDeviceRequestActionTaskRecord() {
    return issuedDeviceRequestActionTaskRecord;
  }

  public void setIssuedDeviceRequestActionTaskRecord(Object issuedDeviceRequestActionTaskRecord) {
    this.issuedDeviceRequestActionTaskRecord = issuedDeviceRequestActionTaskRecord;
  }

  public BQIssuedDeviceRequestOutputModel issuedDeviceRequestRecordReference(String issuedDeviceRequestRecordReference) {
    this.issuedDeviceRequestRecordReference = issuedDeviceRequestRecordReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issued Device service request record 
   * @return issuedDeviceRequestRecordReference
  */
  @ApiModelProperty(example = "IDRRR766849", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issued Device service request record ")


  public String getIssuedDeviceRequestRecordReference() {
    return issuedDeviceRequestRecordReference;
  }

  public void setIssuedDeviceRequestRecordReference(String issuedDeviceRequestRecordReference) {
    this.issuedDeviceRequestRecordReference = issuedDeviceRequestRecordReference;
  }

  public BQIssuedDeviceRequestOutputModel requestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response ")

  @Valid

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
    BQIssuedDeviceRequestOutputModel bqIssuedDeviceRequestOutputModel = (BQIssuedDeviceRequestOutputModel) o;
    return Objects.equals(this.issuedDeviceInstanceRecord, bqIssuedDeviceRequestOutputModel.issuedDeviceInstanceRecord) &&
        Objects.equals(this.issuedDeviceRequestActionTaskReference, bqIssuedDeviceRequestOutputModel.issuedDeviceRequestActionTaskReference) &&
        Objects.equals(this.issuedDeviceRequestActionTaskRecord, bqIssuedDeviceRequestOutputModel.issuedDeviceRequestActionTaskRecord) &&
        Objects.equals(this.issuedDeviceRequestRecordReference, bqIssuedDeviceRequestOutputModel.issuedDeviceRequestRecordReference) &&
        Objects.equals(this.requestResponseRecord, bqIssuedDeviceRequestOutputModel.requestResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedDeviceInstanceRecord, issuedDeviceRequestActionTaskReference, issuedDeviceRequestActionTaskRecord, issuedDeviceRequestRecordReference, requestResponseRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQIssuedDeviceRequestOutputModel {\n");
    
    sb.append("    issuedDeviceInstanceRecord: ").append(toIndentedString(issuedDeviceInstanceRecord)).append("\n");
    sb.append("    issuedDeviceRequestActionTaskReference: ").append(toIndentedString(issuedDeviceRequestActionTaskReference)).append("\n");
    sb.append("    issuedDeviceRequestActionTaskRecord: ").append(toIndentedString(issuedDeviceRequestActionTaskRecord)).append("\n");
    sb.append("    issuedDeviceRequestRecordReference: ").append(toIndentedString(issuedDeviceRequestRecordReference)).append("\n");
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

