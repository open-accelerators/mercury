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
 * BQServiceFeesRetrieveInputModelServiceFeesInstanceAnalysis1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQServiceFeesRetrieveInputModelServiceFeesInstanceAnalysis1   {
  @JsonProperty("serviceFeesInstanceAnalysisReference")
  private String serviceFeesInstanceAnalysisReference;

  public BQServiceFeesRetrieveInputModelServiceFeesInstanceAnalysis1 serviceFeesInstanceAnalysisReference(String serviceFeesInstanceAnalysisReference) {
    this.serviceFeesInstanceAnalysisReference = serviceFeesInstanceAnalysisReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return serviceFeesInstanceAnalysisReference
  */
  @ApiModelProperty(example = "702650", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view ")


  public String getServiceFeesInstanceAnalysisReference() {
    return serviceFeesInstanceAnalysisReference;
  }

  public void setServiceFeesInstanceAnalysisReference(String serviceFeesInstanceAnalysisReference) {
    this.serviceFeesInstanceAnalysisReference = serviceFeesInstanceAnalysisReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQServiceFeesRetrieveInputModelServiceFeesInstanceAnalysis1 bqServiceFeesRetrieveInputModelServiceFeesInstanceAnalysis1 = (BQServiceFeesRetrieveInputModelServiceFeesInstanceAnalysis1) o;
    return Objects.equals(this.serviceFeesInstanceAnalysisReference, bqServiceFeesRetrieveInputModelServiceFeesInstanceAnalysis1.serviceFeesInstanceAnalysisReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceFeesInstanceAnalysisReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQServiceFeesRetrieveInputModelServiceFeesInstanceAnalysis1 {\n");
    
    sb.append("    serviceFeesInstanceAnalysisReference: ").append(toIndentedString(serviceFeesInstanceAnalysisReference)).append("\n");
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

