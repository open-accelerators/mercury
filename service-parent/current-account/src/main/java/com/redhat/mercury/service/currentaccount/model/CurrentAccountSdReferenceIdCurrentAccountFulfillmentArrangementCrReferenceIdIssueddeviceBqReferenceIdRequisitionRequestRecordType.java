package com.redhat.mercury.service.currentaccount.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceBqReferenceIdRequisitionRequestRecordType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceBqReferenceIdRequisitionRequestRecordType   {
  @JsonProperty("requestInputRecord")
  private Object requestInputRecord;

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceBqReferenceIdRequisitionRequestRecordType requestInputRecord(Object requestInputRecord) {
    this.requestInputRecord = requestInputRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Request service record (e.g. rework function, refresh record, process workstep) 
   * @return requestInputRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Request service record (e.g. rework function, refresh record, process workstep) ")

  @Valid

  public Object getRequestInputRecord() {
    return requestInputRecord;
  }

  public void setRequestInputRecord(Object requestInputRecord) {
    this.requestInputRecord = requestInputRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceBqReferenceIdRequisitionRequestRecordType currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceBqReferenceIdRequisitionRequestRecordType = (CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceBqReferenceIdRequisitionRequestRecordType) o;
    return Objects.equals(this.requestInputRecord, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceBqReferenceIdRequisitionRequestRecordType.requestInputRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestInputRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdIssueddeviceBqReferenceIdRequisitionRequestRecordType {\n");
    
    sb.append("    requestInputRecord: ").append(toIndentedString(requestInputRecord)).append("\n");
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

