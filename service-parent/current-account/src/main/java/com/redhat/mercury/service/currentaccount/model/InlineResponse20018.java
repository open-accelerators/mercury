package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.currentaccount.model.InlineResponse20018PaymentsInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20018
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class InlineResponse20018   {
  @JsonProperty("paymentsInstanceRecord")
  private InlineResponse20018PaymentsInstanceRecord paymentsInstanceRecord;

  @JsonProperty("paymentsUpdateActionTaskReference")
  private String paymentsUpdateActionTaskReference;

  @JsonProperty("paymentsUpdateActionTaskRecord")
  private Object paymentsUpdateActionTaskRecord;

  @JsonProperty("updateResponseRecord")
  private Object updateResponseRecord;

  public InlineResponse20018 paymentsInstanceRecord(InlineResponse20018PaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
    return this;
  }

  /**
   * Get paymentsInstanceRecord
   * @return paymentsInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse20018PaymentsInstanceRecord getPaymentsInstanceRecord() {
    return paymentsInstanceRecord;
  }

  public void setPaymentsInstanceRecord(InlineResponse20018PaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
  }

  public InlineResponse20018 paymentsUpdateActionTaskReference(String paymentsUpdateActionTaskReference) {
    this.paymentsUpdateActionTaskReference = paymentsUpdateActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return paymentsUpdateActionTaskReference
  */
  @ApiModelProperty(example = "PUATR777033", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call ")


  public String getPaymentsUpdateActionTaskReference() {
    return paymentsUpdateActionTaskReference;
  }

  public void setPaymentsUpdateActionTaskReference(String paymentsUpdateActionTaskReference) {
    this.paymentsUpdateActionTaskReference = paymentsUpdateActionTaskReference;
  }

  public InlineResponse20018 paymentsUpdateActionTaskRecord(Object paymentsUpdateActionTaskRecord) {
    this.paymentsUpdateActionTaskRecord = paymentsUpdateActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return paymentsUpdateActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record ")

  @Valid

  public Object getPaymentsUpdateActionTaskRecord() {
    return paymentsUpdateActionTaskRecord;
  }

  public void setPaymentsUpdateActionTaskRecord(Object paymentsUpdateActionTaskRecord) {
    this.paymentsUpdateActionTaskRecord = paymentsUpdateActionTaskRecord;
  }

  public InlineResponse20018 updateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response ")

  @Valid

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20018 inlineResponse20018 = (InlineResponse20018) o;
    return Objects.equals(this.paymentsInstanceRecord, inlineResponse20018.paymentsInstanceRecord) &&
        Objects.equals(this.paymentsUpdateActionTaskReference, inlineResponse20018.paymentsUpdateActionTaskReference) &&
        Objects.equals(this.paymentsUpdateActionTaskRecord, inlineResponse20018.paymentsUpdateActionTaskRecord) &&
        Objects.equals(this.updateResponseRecord, inlineResponse20018.updateResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentsInstanceRecord, paymentsUpdateActionTaskReference, paymentsUpdateActionTaskRecord, updateResponseRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20018 {\n");
    
    sb.append("    paymentsInstanceRecord: ").append(toIndentedString(paymentsInstanceRecord)).append("\n");
    sb.append("    paymentsUpdateActionTaskReference: ").append(toIndentedString(paymentsUpdateActionTaskReference)).append("\n");
    sb.append("    paymentsUpdateActionTaskRecord: ").append(toIndentedString(paymentsUpdateActionTaskRecord)).append("\n");
    sb.append("    updateResponseRecord: ").append(toIndentedString(updateResponseRecord)).append("\n");
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

