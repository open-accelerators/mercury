package com.redhat.mercury.service.contactdialog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis   {
  @JsonProperty("controlRecordPortfolioAnalysisReference")
  private String controlRecordPortfolioAnalysisReference;

  public SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis controlRecordPortfolioAnalysisReference(String controlRecordPortfolioAnalysisReference) {
    this.controlRecordPortfolioAnalysisReference = controlRecordPortfolioAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record portfolio analysis view maintained by the service center 
   * @return controlRecordPortfolioAnalysisReference
  */
  @ApiModelProperty(example = "739764", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record portfolio analysis view maintained by the service center ")


  public String getControlRecordPortfolioAnalysisReference() {
    return controlRecordPortfolioAnalysisReference;
  }

  public void setControlRecordPortfolioAnalysisReference(String controlRecordPortfolioAnalysisReference) {
    this.controlRecordPortfolioAnalysisReference = controlRecordPortfolioAnalysisReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis sdCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis = (SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis) o;
    return Objects.equals(this.controlRecordPortfolioAnalysisReference, sdCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis.controlRecordPortfolioAnalysisReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlRecordPortfolioAnalysisReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecord1ControlRecordPortfolioAnalysis {\n");
    
    sb.append("    controlRecordPortfolioAnalysisReference: ").append(toIndentedString(controlRecordPortfolioAnalysisReference)).append("\n");
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

