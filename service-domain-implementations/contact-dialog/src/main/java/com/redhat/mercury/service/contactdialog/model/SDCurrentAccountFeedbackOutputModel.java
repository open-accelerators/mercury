package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse2001ServiceDomainFeedbackActionRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCurrentAccountFeedbackOutputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class SDCurrentAccountFeedbackOutputModel   {
  @JsonProperty("serviceDomainFeedbackActionTaskReference")
  private String serviceDomainFeedbackActionTaskReference;

  @JsonProperty("serviceDomainFeedbackActionTaskRecord")
  private Object serviceDomainFeedbackActionTaskRecord;

  @JsonProperty("serviceDomainFeedbackActionRecord")
  private InlineResponse2001ServiceDomainFeedbackActionRecord serviceDomainFeedbackActionRecord;

  public SDCurrentAccountFeedbackOutputModel serviceDomainFeedbackActionTaskReference(String serviceDomainFeedbackActionTaskReference) {
    this.serviceDomainFeedbackActionTaskReference = serviceDomainFeedbackActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return serviceDomainFeedbackActionTaskReference
  */
  @ApiModelProperty(example = "SFATR765157", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call ")


  public String getServiceDomainFeedbackActionTaskReference() {
    return serviceDomainFeedbackActionTaskReference;
  }

  public void setServiceDomainFeedbackActionTaskReference(String serviceDomainFeedbackActionTaskReference) {
    this.serviceDomainFeedbackActionTaskReference = serviceDomainFeedbackActionTaskReference;
  }

  public SDCurrentAccountFeedbackOutputModel serviceDomainFeedbackActionTaskRecord(Object serviceDomainFeedbackActionTaskRecord) {
    this.serviceDomainFeedbackActionTaskRecord = serviceDomainFeedbackActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return serviceDomainFeedbackActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record ")

  @Valid

  public Object getServiceDomainFeedbackActionTaskRecord() {
    return serviceDomainFeedbackActionTaskRecord;
  }

  public void setServiceDomainFeedbackActionTaskRecord(Object serviceDomainFeedbackActionTaskRecord) {
    this.serviceDomainFeedbackActionTaskRecord = serviceDomainFeedbackActionTaskRecord;
  }

  public SDCurrentAccountFeedbackOutputModel serviceDomainFeedbackActionRecord(InlineResponse2001ServiceDomainFeedbackActionRecord serviceDomainFeedbackActionRecord) {
    this.serviceDomainFeedbackActionRecord = serviceDomainFeedbackActionRecord;
    return this;
  }

  /**
   * Get serviceDomainFeedbackActionRecord
   * @return serviceDomainFeedbackActionRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse2001ServiceDomainFeedbackActionRecord getServiceDomainFeedbackActionRecord() {
    return serviceDomainFeedbackActionRecord;
  }

  public void setServiceDomainFeedbackActionRecord(InlineResponse2001ServiceDomainFeedbackActionRecord serviceDomainFeedbackActionRecord) {
    this.serviceDomainFeedbackActionRecord = serviceDomainFeedbackActionRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCurrentAccountFeedbackOutputModel sdCurrentAccountFeedbackOutputModel = (SDCurrentAccountFeedbackOutputModel) o;
    return Objects.equals(this.serviceDomainFeedbackActionTaskReference, sdCurrentAccountFeedbackOutputModel.serviceDomainFeedbackActionTaskReference) &&
        Objects.equals(this.serviceDomainFeedbackActionTaskRecord, sdCurrentAccountFeedbackOutputModel.serviceDomainFeedbackActionTaskRecord) &&
        Objects.equals(this.serviceDomainFeedbackActionRecord, sdCurrentAccountFeedbackOutputModel.serviceDomainFeedbackActionRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDomainFeedbackActionTaskReference, serviceDomainFeedbackActionTaskRecord, serviceDomainFeedbackActionRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCurrentAccountFeedbackOutputModel {\n");
    
    sb.append("    serviceDomainFeedbackActionTaskReference: ").append(toIndentedString(serviceDomainFeedbackActionTaskReference)).append("\n");
    sb.append("    serviceDomainFeedbackActionTaskRecord: ").append(toIndentedString(serviceDomainFeedbackActionTaskRecord)).append("\n");
    sb.append("    serviceDomainFeedbackActionRecord: ").append(toIndentedString(serviceDomainFeedbackActionRecord)).append("\n");
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

