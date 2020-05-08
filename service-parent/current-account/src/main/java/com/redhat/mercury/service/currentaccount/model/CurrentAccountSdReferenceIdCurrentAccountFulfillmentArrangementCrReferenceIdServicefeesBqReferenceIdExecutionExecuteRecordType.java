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
 * CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:20:08.092-04:00[America/New_York]")

public class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType   {
  @JsonProperty("executeInputRecord")
  private Object executeInputRecord;

  public CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType executeInputRecord(Object executeInputRecord) {
    this.executeInputRecord = executeInputRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Execute transaction/record (e.g. deposit, withdrawal, fee/penalty, interest) 
   * @return executeInputRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Execute transaction/record (e.g. deposit, withdrawal, fee/penalty, interest) ")

  @Valid

  public Object getExecuteInputRecord() {
    return executeInputRecord;
  }

  public void setExecuteInputRecord(Object executeInputRecord) {
    this.executeInputRecord = executeInputRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType = (CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType) o;
    return Objects.equals(this.executeInputRecord, currentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType.executeInputRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executeInputRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentAccountSdReferenceIdCurrentAccountFulfillmentArrangementCrReferenceIdServicefeesBqReferenceIdExecutionExecuteRecordType {\n");
    
    sb.append("    executeInputRecord: ").append(toIndentedString(executeInputRecord)).append("\n");
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

