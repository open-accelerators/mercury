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
 * SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:56.097-04:00[America/New_York]")

public class SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis   {
  @JsonProperty("activityAnalysisReference")
  private String activityAnalysisReference;

  public SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis activityAnalysisReference(String activityAnalysisReference) {
    this.activityAnalysisReference = activityAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the internal activity analysis view maintained by the service center 
   * @return activityAnalysisReference
  */
  @ApiModelProperty(example = "730230", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the internal activity analysis view maintained by the service center ")


  public String getActivityAnalysisReference() {
    return activityAnalysisReference;
  }

  public void setActivityAnalysisReference(String activityAnalysisReference) {
    this.activityAnalysisReference = activityAnalysisReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis sdCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis = (SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis) o;
    return Objects.equals(this.activityAnalysisReference, sdCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis.activityAnalysisReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityAnalysisReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDCurrentAccountRetrieveInputModelServiceDomainRetrieveActionRecordServiceDomainActivityAnalysis {\n");
    
    sb.append("    activityAnalysisReference: ").append(toIndentedString(activityAnalysisReference)).append("\n");
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

