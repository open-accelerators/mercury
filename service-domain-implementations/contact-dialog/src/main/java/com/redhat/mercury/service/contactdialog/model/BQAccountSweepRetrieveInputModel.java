package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.BQAccountSweepRetrieveInputModelAccountSweepInstanceAnalysis1;
import com.redhat.mercury.service.contactdialog.model.BQAccountSweepRetrieveInputModelAccountSweepInstanceReport1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAccountSweepRetrieveInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQAccountSweepRetrieveInputModel   {
  @JsonProperty("accountSweepRetrieveActionTaskRecord")
  private Object accountSweepRetrieveActionTaskRecord;

  @JsonProperty("accountSweepRetrieveActionRequest")
  private String accountSweepRetrieveActionRequest;

  @JsonProperty("accountSweepInstanceReport")
  private BQAccountSweepRetrieveInputModelAccountSweepInstanceReport1 accountSweepInstanceReport;

  @JsonProperty("accountSweepInstanceAnalysis")
  private BQAccountSweepRetrieveInputModelAccountSweepInstanceAnalysis1 accountSweepInstanceAnalysis;

  public BQAccountSweepRetrieveInputModel accountSweepRetrieveActionTaskRecord(Object accountSweepRetrieveActionTaskRecord) {
    this.accountSweepRetrieveActionTaskRecord = accountSweepRetrieveActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return accountSweepRetrieveActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")

  @Valid

  public Object getAccountSweepRetrieveActionTaskRecord() {
    return accountSweepRetrieveActionTaskRecord;
  }

  public void setAccountSweepRetrieveActionTaskRecord(Object accountSweepRetrieveActionTaskRecord) {
    this.accountSweepRetrieveActionTaskRecord = accountSweepRetrieveActionTaskRecord;
  }

  public BQAccountSweepRetrieveInputModel accountSweepRetrieveActionRequest(String accountSweepRetrieveActionRequest) {
    this.accountSweepRetrieveActionRequest = accountSweepRetrieveActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return accountSweepRetrieveActionRequest
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")


  public String getAccountSweepRetrieveActionRequest() {
    return accountSweepRetrieveActionRequest;
  }

  public void setAccountSweepRetrieveActionRequest(String accountSweepRetrieveActionRequest) {
    this.accountSweepRetrieveActionRequest = accountSweepRetrieveActionRequest;
  }

  public BQAccountSweepRetrieveInputModel accountSweepInstanceReport(BQAccountSweepRetrieveInputModelAccountSweepInstanceReport1 accountSweepInstanceReport) {
    this.accountSweepInstanceReport = accountSweepInstanceReport;
    return this;
  }

  /**
   * Get accountSweepInstanceReport
   * @return accountSweepInstanceReport
  */
  @ApiModelProperty(value = "")

  @Valid

  public BQAccountSweepRetrieveInputModelAccountSweepInstanceReport1 getAccountSweepInstanceReport() {
    return accountSweepInstanceReport;
  }

  public void setAccountSweepInstanceReport(BQAccountSweepRetrieveInputModelAccountSweepInstanceReport1 accountSweepInstanceReport) {
    this.accountSweepInstanceReport = accountSweepInstanceReport;
  }

  public BQAccountSweepRetrieveInputModel accountSweepInstanceAnalysis(BQAccountSweepRetrieveInputModelAccountSweepInstanceAnalysis1 accountSweepInstanceAnalysis) {
    this.accountSweepInstanceAnalysis = accountSweepInstanceAnalysis;
    return this;
  }

  /**
   * Get accountSweepInstanceAnalysis
   * @return accountSweepInstanceAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public BQAccountSweepRetrieveInputModelAccountSweepInstanceAnalysis1 getAccountSweepInstanceAnalysis() {
    return accountSweepInstanceAnalysis;
  }

  public void setAccountSweepInstanceAnalysis(BQAccountSweepRetrieveInputModelAccountSweepInstanceAnalysis1 accountSweepInstanceAnalysis) {
    this.accountSweepInstanceAnalysis = accountSweepInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountSweepRetrieveInputModel bqAccountSweepRetrieveInputModel = (BQAccountSweepRetrieveInputModel) o;
    return Objects.equals(this.accountSweepRetrieveActionTaskRecord, bqAccountSweepRetrieveInputModel.accountSweepRetrieveActionTaskRecord) &&
        Objects.equals(this.accountSweepRetrieveActionRequest, bqAccountSweepRetrieveInputModel.accountSweepRetrieveActionRequest) &&
        Objects.equals(this.accountSweepInstanceReport, bqAccountSweepRetrieveInputModel.accountSweepInstanceReport) &&
        Objects.equals(this.accountSweepInstanceAnalysis, bqAccountSweepRetrieveInputModel.accountSweepInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSweepRetrieveActionTaskRecord, accountSweepRetrieveActionRequest, accountSweepInstanceReport, accountSweepInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountSweepRetrieveInputModel {\n");
    
    sb.append("    accountSweepRetrieveActionTaskRecord: ").append(toIndentedString(accountSweepRetrieveActionTaskRecord)).append("\n");
    sb.append("    accountSweepRetrieveActionRequest: ").append(toIndentedString(accountSweepRetrieveActionRequest)).append("\n");
    sb.append("    accountSweepInstanceReport: ").append(toIndentedString(accountSweepInstanceReport)).append("\n");
    sb.append("    accountSweepInstanceAnalysis: ").append(toIndentedString(accountSweepInstanceAnalysis)).append("\n");
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

