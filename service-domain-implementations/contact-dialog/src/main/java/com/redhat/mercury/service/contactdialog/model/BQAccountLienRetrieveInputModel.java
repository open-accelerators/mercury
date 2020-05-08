package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis1;
import com.redhat.mercury.service.contactdialog.model.BQAccountLienRetrieveInputModelAccountLienInstanceReport1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQAccountLienRetrieveInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQAccountLienRetrieveInputModel   {
  @JsonProperty("accountLienRetrieveActionTaskRecord")
  private Object accountLienRetrieveActionTaskRecord;

  @JsonProperty("accountLienRetrieveActionRequest")
  private String accountLienRetrieveActionRequest;

  @JsonProperty("accountLienInstanceReport")
  private BQAccountLienRetrieveInputModelAccountLienInstanceReport1 accountLienInstanceReport;

  @JsonProperty("accountLienInstanceAnalysis")
  private BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis1 accountLienInstanceAnalysis;

  public BQAccountLienRetrieveInputModel accountLienRetrieveActionTaskRecord(Object accountLienRetrieveActionTaskRecord) {
    this.accountLienRetrieveActionTaskRecord = accountLienRetrieveActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return accountLienRetrieveActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")

  @Valid

  public Object getAccountLienRetrieveActionTaskRecord() {
    return accountLienRetrieveActionTaskRecord;
  }

  public void setAccountLienRetrieveActionTaskRecord(Object accountLienRetrieveActionTaskRecord) {
    this.accountLienRetrieveActionTaskRecord = accountLienRetrieveActionTaskRecord;
  }

  public BQAccountLienRetrieveInputModel accountLienRetrieveActionRequest(String accountLienRetrieveActionRequest) {
    this.accountLienRetrieveActionRequest = accountLienRetrieveActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return accountLienRetrieveActionRequest
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")


  public String getAccountLienRetrieveActionRequest() {
    return accountLienRetrieveActionRequest;
  }

  public void setAccountLienRetrieveActionRequest(String accountLienRetrieveActionRequest) {
    this.accountLienRetrieveActionRequest = accountLienRetrieveActionRequest;
  }

  public BQAccountLienRetrieveInputModel accountLienInstanceReport(BQAccountLienRetrieveInputModelAccountLienInstanceReport1 accountLienInstanceReport) {
    this.accountLienInstanceReport = accountLienInstanceReport;
    return this;
  }

  /**
   * Get accountLienInstanceReport
   * @return accountLienInstanceReport
  */
  @ApiModelProperty(value = "")

  @Valid

  public BQAccountLienRetrieveInputModelAccountLienInstanceReport1 getAccountLienInstanceReport() {
    return accountLienInstanceReport;
  }

  public void setAccountLienInstanceReport(BQAccountLienRetrieveInputModelAccountLienInstanceReport1 accountLienInstanceReport) {
    this.accountLienInstanceReport = accountLienInstanceReport;
  }

  public BQAccountLienRetrieveInputModel accountLienInstanceAnalysis(BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis1 accountLienInstanceAnalysis) {
    this.accountLienInstanceAnalysis = accountLienInstanceAnalysis;
    return this;
  }

  /**
   * Get accountLienInstanceAnalysis
   * @return accountLienInstanceAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis1 getAccountLienInstanceAnalysis() {
    return accountLienInstanceAnalysis;
  }

  public void setAccountLienInstanceAnalysis(BQAccountLienRetrieveInputModelAccountLienInstanceAnalysis1 accountLienInstanceAnalysis) {
    this.accountLienInstanceAnalysis = accountLienInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQAccountLienRetrieveInputModel bqAccountLienRetrieveInputModel = (BQAccountLienRetrieveInputModel) o;
    return Objects.equals(this.accountLienRetrieveActionTaskRecord, bqAccountLienRetrieveInputModel.accountLienRetrieveActionTaskRecord) &&
        Objects.equals(this.accountLienRetrieveActionRequest, bqAccountLienRetrieveInputModel.accountLienRetrieveActionRequest) &&
        Objects.equals(this.accountLienInstanceReport, bqAccountLienRetrieveInputModel.accountLienInstanceReport) &&
        Objects.equals(this.accountLienInstanceAnalysis, bqAccountLienRetrieveInputModel.accountLienInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountLienRetrieveActionTaskRecord, accountLienRetrieveActionRequest, accountLienInstanceReport, accountLienInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQAccountLienRetrieveInputModel {\n");
    
    sb.append("    accountLienRetrieveActionTaskRecord: ").append(toIndentedString(accountLienRetrieveActionTaskRecord)).append("\n");
    sb.append("    accountLienRetrieveActionRequest: ").append(toIndentedString(accountLienRetrieveActionRequest)).append("\n");
    sb.append("    accountLienInstanceReport: ").append(toIndentedString(accountLienInstanceReport)).append("\n");
    sb.append("    accountLienInstanceAnalysis: ").append(toIndentedString(accountLienInstanceAnalysis)).append("\n");
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

