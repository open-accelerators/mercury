package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.InlineResponse2007ServiceFeesInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQServiceFeesExecuteOutputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class BQServiceFeesExecuteOutputModel   {
  @JsonProperty("serviceFeesInstanceRecord")
  private InlineResponse2007ServiceFeesInstanceRecord serviceFeesInstanceRecord;

  @JsonProperty("serviceFeesExecuteActionTaskReference")
  private String serviceFeesExecuteActionTaskReference;

  @JsonProperty("serviceFeesExecuteActionTaskRecord")
  private Object serviceFeesExecuteActionTaskRecord;

  @JsonProperty("serviceFeesExecuteRecordReference")
  private String serviceFeesExecuteRecordReference;

  @JsonProperty("executeResponseRecord")
  private Object executeResponseRecord;

  public BQServiceFeesExecuteOutputModel serviceFeesInstanceRecord(InlineResponse2007ServiceFeesInstanceRecord serviceFeesInstanceRecord) {
    this.serviceFeesInstanceRecord = serviceFeesInstanceRecord;
    return this;
  }

  /**
   * Get serviceFeesInstanceRecord
   * @return serviceFeesInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2007ServiceFeesInstanceRecord getServiceFeesInstanceRecord() {
    return serviceFeesInstanceRecord;
  }

  public void setServiceFeesInstanceRecord(InlineResponse2007ServiceFeesInstanceRecord serviceFeesInstanceRecord) {
    this.serviceFeesInstanceRecord = serviceFeesInstanceRecord;
  }

  public BQServiceFeesExecuteOutputModel serviceFeesExecuteActionTaskReference(String serviceFeesExecuteActionTaskReference) {
    this.serviceFeesExecuteActionTaskReference = serviceFeesExecuteActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Service Fees instance execute service call 
   * @return serviceFeesExecuteActionTaskReference
  */
  @ApiModelProperty(example = "SFEATR723493", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Service Fees instance execute service call ")


  public String getServiceFeesExecuteActionTaskReference() {
    return serviceFeesExecuteActionTaskReference;
  }

  public void setServiceFeesExecuteActionTaskReference(String serviceFeesExecuteActionTaskReference) {
    this.serviceFeesExecuteActionTaskReference = serviceFeesExecuteActionTaskReference;
  }

  public BQServiceFeesExecuteOutputModel serviceFeesExecuteActionTaskRecord(Object serviceFeesExecuteActionTaskRecord) {
    this.serviceFeesExecuteActionTaskRecord = serviceFeesExecuteActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return serviceFeesExecuteActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record ")

  @Valid

  public Object getServiceFeesExecuteActionTaskRecord() {
    return serviceFeesExecuteActionTaskRecord;
  }

  public void setServiceFeesExecuteActionTaskRecord(Object serviceFeesExecuteActionTaskRecord) {
    this.serviceFeesExecuteActionTaskRecord = serviceFeesExecuteActionTaskRecord;
  }

  public BQServiceFeesExecuteOutputModel serviceFeesExecuteRecordReference(String serviceFeesExecuteRecordReference) {
    this.serviceFeesExecuteRecordReference = serviceFeesExecuteRecordReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Fees execute transaction/record 
   * @return serviceFeesExecuteRecordReference
  */
  @ApiModelProperty(example = "SFERR796663", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Fees execute transaction/record ")


  public String getServiceFeesExecuteRecordReference() {
    return serviceFeesExecuteRecordReference;
  }

  public void setServiceFeesExecuteRecordReference(String serviceFeesExecuteRecordReference) {
    this.serviceFeesExecuteRecordReference = serviceFeesExecuteRecordReference;
  }

  public BQServiceFeesExecuteOutputModel executeResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response ")

  @Valid

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQServiceFeesExecuteOutputModel bqServiceFeesExecuteOutputModel = (BQServiceFeesExecuteOutputModel) o;
    return Objects.equals(this.serviceFeesInstanceRecord, bqServiceFeesExecuteOutputModel.serviceFeesInstanceRecord) &&
        Objects.equals(this.serviceFeesExecuteActionTaskReference, bqServiceFeesExecuteOutputModel.serviceFeesExecuteActionTaskReference) &&
        Objects.equals(this.serviceFeesExecuteActionTaskRecord, bqServiceFeesExecuteOutputModel.serviceFeesExecuteActionTaskRecord) &&
        Objects.equals(this.serviceFeesExecuteRecordReference, bqServiceFeesExecuteOutputModel.serviceFeesExecuteRecordReference) &&
        Objects.equals(this.executeResponseRecord, bqServiceFeesExecuteOutputModel.executeResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceFeesInstanceRecord, serviceFeesExecuteActionTaskReference, serviceFeesExecuteActionTaskRecord, serviceFeesExecuteRecordReference, executeResponseRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQServiceFeesExecuteOutputModel {\n");
    
    sb.append("    serviceFeesInstanceRecord: ").append(toIndentedString(serviceFeesInstanceRecord)).append("\n");
    sb.append("    serviceFeesExecuteActionTaskReference: ").append(toIndentedString(serviceFeesExecuteActionTaskReference)).append("\n");
    sb.append("    serviceFeesExecuteActionTaskRecord: ").append(toIndentedString(serviceFeesExecuteActionTaskRecord)).append("\n");
    sb.append("    serviceFeesExecuteRecordReference: ").append(toIndentedString(serviceFeesExecuteRecordReference)).append("\n");
    sb.append("    executeResponseRecord: ").append(toIndentedString(executeResponseRecord)).append("\n");
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

