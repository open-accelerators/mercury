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
 * InlineResponse20013
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class InlineResponse20013   {
  @JsonProperty("accountSweepExecuteActionTaskReference")
  private String accountSweepExecuteActionTaskReference;

  @JsonProperty("accountSweepExecuteActionTaskRecord")
  private Object accountSweepExecuteActionTaskRecord;

  @JsonProperty("accountSweepExecuteRecordReference")
  private String accountSweepExecuteRecordReference;

  @JsonProperty("executeResponseRecord")
  private Object executeResponseRecord;

  public InlineResponse20013 accountSweepExecuteActionTaskReference(String accountSweepExecuteActionTaskReference) {
    this.accountSweepExecuteActionTaskReference = accountSweepExecuteActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Account Sweep instance execute service call 
   * @return accountSweepExecuteActionTaskReference
  */
  @ApiModelProperty(example = "ASEATR709683", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Account Sweep instance execute service call ")


  public String getAccountSweepExecuteActionTaskReference() {
    return accountSweepExecuteActionTaskReference;
  }

  public void setAccountSweepExecuteActionTaskReference(String accountSweepExecuteActionTaskReference) {
    this.accountSweepExecuteActionTaskReference = accountSweepExecuteActionTaskReference;
  }

  public InlineResponse20013 accountSweepExecuteActionTaskRecord(Object accountSweepExecuteActionTaskRecord) {
    this.accountSweepExecuteActionTaskRecord = accountSweepExecuteActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return accountSweepExecuteActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record ")

  @Valid

  public Object getAccountSweepExecuteActionTaskRecord() {
    return accountSweepExecuteActionTaskRecord;
  }

  public void setAccountSweepExecuteActionTaskRecord(Object accountSweepExecuteActionTaskRecord) {
    this.accountSweepExecuteActionTaskRecord = accountSweepExecuteActionTaskRecord;
  }

  public InlineResponse20013 accountSweepExecuteRecordReference(String accountSweepExecuteRecordReference) {
    this.accountSweepExecuteRecordReference = accountSweepExecuteRecordReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Sweep execute transaction/record 
   * @return accountSweepExecuteRecordReference
  */
  @ApiModelProperty(example = "ASERR751900", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Account Sweep execute transaction/record ")


  public String getAccountSweepExecuteRecordReference() {
    return accountSweepExecuteRecordReference;
  }

  public void setAccountSweepExecuteRecordReference(String accountSweepExecuteRecordReference) {
    this.accountSweepExecuteRecordReference = accountSweepExecuteRecordReference;
  }

  public InlineResponse20013 executeResponseRecord(Object executeResponseRecord) {
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
    InlineResponse20013 inlineResponse20013 = (InlineResponse20013) o;
    return Objects.equals(this.accountSweepExecuteActionTaskReference, inlineResponse20013.accountSweepExecuteActionTaskReference) &&
        Objects.equals(this.accountSweepExecuteActionTaskRecord, inlineResponse20013.accountSweepExecuteActionTaskRecord) &&
        Objects.equals(this.accountSweepExecuteRecordReference, inlineResponse20013.accountSweepExecuteRecordReference) &&
        Objects.equals(this.executeResponseRecord, inlineResponse20013.executeResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSweepExecuteActionTaskReference, accountSweepExecuteActionTaskRecord, accountSweepExecuteRecordReference, executeResponseRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20013 {\n");
    
    sb.append("    accountSweepExecuteActionTaskReference: ").append(toIndentedString(accountSweepExecuteActionTaskReference)).append("\n");
    sb.append("    accountSweepExecuteActionTaskRecord: ").append(toIndentedString(accountSweepExecuteActionTaskRecord)).append("\n");
    sb.append("    accountSweepExecuteRecordReference: ").append(toIndentedString(accountSweepExecuteRecordReference)).append("\n");
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

