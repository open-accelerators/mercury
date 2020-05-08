package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.InlineResponse20016DepositsAndWithdrawalsInstanceRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQDepositsAndWithdrawalsExecuteOutputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

public class BQDepositsAndWithdrawalsExecuteOutputModel   {
  @JsonProperty("depositsAndWithdrawalsInstanceRecord")
  private InlineResponse20016DepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord;

  @JsonProperty("depositsAndWithdrawalsExecuteActionTaskReference")
  private String depositsAndWithdrawalsExecuteActionTaskReference;

  @JsonProperty("depositsAndWithdrawalsExecuteActionTaskRecord")
  private Object depositsAndWithdrawalsExecuteActionTaskRecord;

  @JsonProperty("depositsAndWithdrawalsExecuteRecordReference")
  private String depositsAndWithdrawalsExecuteRecordReference;

  @JsonProperty("executeResponseRecord")
  private Object executeResponseRecord;

  public BQDepositsAndWithdrawalsExecuteOutputModel depositsAndWithdrawalsInstanceRecord(InlineResponse20016DepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord) {
    this.depositsAndWithdrawalsInstanceRecord = depositsAndWithdrawalsInstanceRecord;
    return this;
  }

  /**
   * Get depositsAndWithdrawalsInstanceRecord
   * @return depositsAndWithdrawalsInstanceRecord
  */
  @ApiModelProperty(value = "")

  @Valid

  public InlineResponse20016DepositsAndWithdrawalsInstanceRecord getDepositsAndWithdrawalsInstanceRecord() {
    return depositsAndWithdrawalsInstanceRecord;
  }

  public void setDepositsAndWithdrawalsInstanceRecord(InlineResponse20016DepositsAndWithdrawalsInstanceRecord depositsAndWithdrawalsInstanceRecord) {
    this.depositsAndWithdrawalsInstanceRecord = depositsAndWithdrawalsInstanceRecord;
  }

  public BQDepositsAndWithdrawalsExecuteOutputModel depositsAndWithdrawalsExecuteActionTaskReference(String depositsAndWithdrawalsExecuteActionTaskReference) {
    this.depositsAndWithdrawalsExecuteActionTaskReference = depositsAndWithdrawalsExecuteActionTaskReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Deposits And Withdrawals instance execute service call 
   * @return depositsAndWithdrawalsExecuteActionTaskReference
  */
  @ApiModelProperty(example = "DAWEATR710009", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Deposits And Withdrawals instance execute service call ")


  public String getDepositsAndWithdrawalsExecuteActionTaskReference() {
    return depositsAndWithdrawalsExecuteActionTaskReference;
  }

  public void setDepositsAndWithdrawalsExecuteActionTaskReference(String depositsAndWithdrawalsExecuteActionTaskReference) {
    this.depositsAndWithdrawalsExecuteActionTaskReference = depositsAndWithdrawalsExecuteActionTaskReference;
  }

  public BQDepositsAndWithdrawalsExecuteOutputModel depositsAndWithdrawalsExecuteActionTaskRecord(Object depositsAndWithdrawalsExecuteActionTaskRecord) {
    this.depositsAndWithdrawalsExecuteActionTaskRecord = depositsAndWithdrawalsExecuteActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return depositsAndWithdrawalsExecuteActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record ")

  @Valid

  public Object getDepositsAndWithdrawalsExecuteActionTaskRecord() {
    return depositsAndWithdrawalsExecuteActionTaskRecord;
  }

  public void setDepositsAndWithdrawalsExecuteActionTaskRecord(Object depositsAndWithdrawalsExecuteActionTaskRecord) {
    this.depositsAndWithdrawalsExecuteActionTaskRecord = depositsAndWithdrawalsExecuteActionTaskRecord;
  }

  public BQDepositsAndWithdrawalsExecuteOutputModel depositsAndWithdrawalsExecuteRecordReference(String depositsAndWithdrawalsExecuteRecordReference) {
    this.depositsAndWithdrawalsExecuteRecordReference = depositsAndWithdrawalsExecuteRecordReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Deposits And Withdrawals execute transaction/record 
   * @return depositsAndWithdrawalsExecuteRecordReference
  */
  @ApiModelProperty(example = "DAWERR766990", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Deposits And Withdrawals execute transaction/record ")


  public String getDepositsAndWithdrawalsExecuteRecordReference() {
    return depositsAndWithdrawalsExecuteRecordReference;
  }

  public void setDepositsAndWithdrawalsExecuteRecordReference(String depositsAndWithdrawalsExecuteRecordReference) {
    this.depositsAndWithdrawalsExecuteRecordReference = depositsAndWithdrawalsExecuteRecordReference;
  }

  public BQDepositsAndWithdrawalsExecuteOutputModel executeResponseRecord(Object executeResponseRecord) {
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
    BQDepositsAndWithdrawalsExecuteOutputModel bqDepositsAndWithdrawalsExecuteOutputModel = (BQDepositsAndWithdrawalsExecuteOutputModel) o;
    return Objects.equals(this.depositsAndWithdrawalsInstanceRecord, bqDepositsAndWithdrawalsExecuteOutputModel.depositsAndWithdrawalsInstanceRecord) &&
        Objects.equals(this.depositsAndWithdrawalsExecuteActionTaskReference, bqDepositsAndWithdrawalsExecuteOutputModel.depositsAndWithdrawalsExecuteActionTaskReference) &&
        Objects.equals(this.depositsAndWithdrawalsExecuteActionTaskRecord, bqDepositsAndWithdrawalsExecuteOutputModel.depositsAndWithdrawalsExecuteActionTaskRecord) &&
        Objects.equals(this.depositsAndWithdrawalsExecuteRecordReference, bqDepositsAndWithdrawalsExecuteOutputModel.depositsAndWithdrawalsExecuteRecordReference) &&
        Objects.equals(this.executeResponseRecord, bqDepositsAndWithdrawalsExecuteOutputModel.executeResponseRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositsAndWithdrawalsInstanceRecord, depositsAndWithdrawalsExecuteActionTaskReference, depositsAndWithdrawalsExecuteActionTaskRecord, depositsAndWithdrawalsExecuteRecordReference, executeResponseRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQDepositsAndWithdrawalsExecuteOutputModel {\n");
    
    sb.append("    depositsAndWithdrawalsInstanceRecord: ").append(toIndentedString(depositsAndWithdrawalsInstanceRecord)).append("\n");
    sb.append("    depositsAndWithdrawalsExecuteActionTaskReference: ").append(toIndentedString(depositsAndWithdrawalsExecuteActionTaskReference)).append("\n");
    sb.append("    depositsAndWithdrawalsExecuteActionTaskRecord: ").append(toIndentedString(depositsAndWithdrawalsExecuteActionTaskRecord)).append("\n");
    sb.append("    depositsAndWithdrawalsExecuteRecordReference: ").append(toIndentedString(depositsAndWithdrawalsExecuteRecordReference)).append("\n");
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

