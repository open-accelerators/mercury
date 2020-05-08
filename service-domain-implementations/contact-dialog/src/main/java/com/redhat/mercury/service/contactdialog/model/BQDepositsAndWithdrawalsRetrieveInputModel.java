package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.redhat.mercury.service.contactdialog.model.BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceAnalysis1;
import com.redhat.mercury.service.contactdialog.model.BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceReport1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BQDepositsAndWithdrawalsRetrieveInputModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQDepositsAndWithdrawalsRetrieveInputModel   {
  @JsonProperty("depositsAndWithdrawalsRetrieveActionTaskRecord")
  private Object depositsAndWithdrawalsRetrieveActionTaskRecord;

  @JsonProperty("depositsAndWithdrawalsRetrieveActionRequest")
  private String depositsAndWithdrawalsRetrieveActionRequest;

  @JsonProperty("depositsAndWithdrawalsInstanceReport")
  private BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceReport1 depositsAndWithdrawalsInstanceReport;

  @JsonProperty("depositsAndWithdrawalsInstanceAnalysis")
  private BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceAnalysis1 depositsAndWithdrawalsInstanceAnalysis;

  public BQDepositsAndWithdrawalsRetrieveInputModel depositsAndWithdrawalsRetrieveActionTaskRecord(Object depositsAndWithdrawalsRetrieveActionTaskRecord) {
    this.depositsAndWithdrawalsRetrieveActionTaskRecord = depositsAndWithdrawalsRetrieveActionTaskRecord;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return depositsAndWithdrawalsRetrieveActionTaskRecord
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record ")

  @Valid

  public Object getDepositsAndWithdrawalsRetrieveActionTaskRecord() {
    return depositsAndWithdrawalsRetrieveActionTaskRecord;
  }

  public void setDepositsAndWithdrawalsRetrieveActionTaskRecord(Object depositsAndWithdrawalsRetrieveActionTaskRecord) {
    this.depositsAndWithdrawalsRetrieveActionTaskRecord = depositsAndWithdrawalsRetrieveActionTaskRecord;
  }

  public BQDepositsAndWithdrawalsRetrieveInputModel depositsAndWithdrawalsRetrieveActionRequest(String depositsAndWithdrawalsRetrieveActionRequest) {
    this.depositsAndWithdrawalsRetrieveActionRequest = depositsAndWithdrawalsRetrieveActionRequest;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return depositsAndWithdrawalsRetrieveActionRequest
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) ")


  public String getDepositsAndWithdrawalsRetrieveActionRequest() {
    return depositsAndWithdrawalsRetrieveActionRequest;
  }

  public void setDepositsAndWithdrawalsRetrieveActionRequest(String depositsAndWithdrawalsRetrieveActionRequest) {
    this.depositsAndWithdrawalsRetrieveActionRequest = depositsAndWithdrawalsRetrieveActionRequest;
  }

  public BQDepositsAndWithdrawalsRetrieveInputModel depositsAndWithdrawalsInstanceReport(BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceReport1 depositsAndWithdrawalsInstanceReport) {
    this.depositsAndWithdrawalsInstanceReport = depositsAndWithdrawalsInstanceReport;
    return this;
  }

  /**
   * Get depositsAndWithdrawalsInstanceReport
   * @return depositsAndWithdrawalsInstanceReport
  */
  @ApiModelProperty(value = "")

  @Valid

  public BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceReport1 getDepositsAndWithdrawalsInstanceReport() {
    return depositsAndWithdrawalsInstanceReport;
  }

  public void setDepositsAndWithdrawalsInstanceReport(BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceReport1 depositsAndWithdrawalsInstanceReport) {
    this.depositsAndWithdrawalsInstanceReport = depositsAndWithdrawalsInstanceReport;
  }

  public BQDepositsAndWithdrawalsRetrieveInputModel depositsAndWithdrawalsInstanceAnalysis(BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceAnalysis1 depositsAndWithdrawalsInstanceAnalysis) {
    this.depositsAndWithdrawalsInstanceAnalysis = depositsAndWithdrawalsInstanceAnalysis;
    return this;
  }

  /**
   * Get depositsAndWithdrawalsInstanceAnalysis
   * @return depositsAndWithdrawalsInstanceAnalysis
  */
  @ApiModelProperty(value = "")

  @Valid

  public BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceAnalysis1 getDepositsAndWithdrawalsInstanceAnalysis() {
    return depositsAndWithdrawalsInstanceAnalysis;
  }

  public void setDepositsAndWithdrawalsInstanceAnalysis(BQDepositsAndWithdrawalsRetrieveInputModelDepositsAndWithdrawalsInstanceAnalysis1 depositsAndWithdrawalsInstanceAnalysis) {
    this.depositsAndWithdrawalsInstanceAnalysis = depositsAndWithdrawalsInstanceAnalysis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQDepositsAndWithdrawalsRetrieveInputModel bqDepositsAndWithdrawalsRetrieveInputModel = (BQDepositsAndWithdrawalsRetrieveInputModel) o;
    return Objects.equals(this.depositsAndWithdrawalsRetrieveActionTaskRecord, bqDepositsAndWithdrawalsRetrieveInputModel.depositsAndWithdrawalsRetrieveActionTaskRecord) &&
        Objects.equals(this.depositsAndWithdrawalsRetrieveActionRequest, bqDepositsAndWithdrawalsRetrieveInputModel.depositsAndWithdrawalsRetrieveActionRequest) &&
        Objects.equals(this.depositsAndWithdrawalsInstanceReport, bqDepositsAndWithdrawalsRetrieveInputModel.depositsAndWithdrawalsInstanceReport) &&
        Objects.equals(this.depositsAndWithdrawalsInstanceAnalysis, bqDepositsAndWithdrawalsRetrieveInputModel.depositsAndWithdrawalsInstanceAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositsAndWithdrawalsRetrieveActionTaskRecord, depositsAndWithdrawalsRetrieveActionRequest, depositsAndWithdrawalsInstanceReport, depositsAndWithdrawalsInstanceAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQDepositsAndWithdrawalsRetrieveInputModel {\n");
    
    sb.append("    depositsAndWithdrawalsRetrieveActionTaskRecord: ").append(toIndentedString(depositsAndWithdrawalsRetrieveActionTaskRecord)).append("\n");
    sb.append("    depositsAndWithdrawalsRetrieveActionRequest: ").append(toIndentedString(depositsAndWithdrawalsRetrieveActionRequest)).append("\n");
    sb.append("    depositsAndWithdrawalsInstanceReport: ").append(toIndentedString(depositsAndWithdrawalsInstanceReport)).append("\n");
    sb.append("    depositsAndWithdrawalsInstanceAnalysis: ").append(toIndentedString(depositsAndWithdrawalsInstanceAnalysis)).append("\n");
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

