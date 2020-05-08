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
 * BQServiceFeesRetrieveInputModelServiceFeesInstanceReport1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQServiceFeesRetrieveInputModelServiceFeesInstanceReport1   {
  @JsonProperty("serviceFeesInstanceReportReference")
  private String serviceFeesInstanceReportReference;

  public BQServiceFeesRetrieveInputModelServiceFeesInstanceReport1 serviceFeesInstanceReportReference(String serviceFeesInstanceReportReference) {
    this.serviceFeesInstanceReportReference = serviceFeesInstanceReportReference;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return serviceFeesInstanceReportReference
  */
  @ApiModelProperty(example = "733077", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report ")


  public String getServiceFeesInstanceReportReference() {
    return serviceFeesInstanceReportReference;
  }

  public void setServiceFeesInstanceReportReference(String serviceFeesInstanceReportReference) {
    this.serviceFeesInstanceReportReference = serviceFeesInstanceReportReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQServiceFeesRetrieveInputModelServiceFeesInstanceReport1 bqServiceFeesRetrieveInputModelServiceFeesInstanceReport1 = (BQServiceFeesRetrieveInputModelServiceFeesInstanceReport1) o;
    return Objects.equals(this.serviceFeesInstanceReportReference, bqServiceFeesRetrieveInputModelServiceFeesInstanceReport1.serviceFeesInstanceReportReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceFeesInstanceReportReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQServiceFeesRetrieveInputModelServiceFeesInstanceReport1 {\n");
    
    sb.append("    serviceFeesInstanceReportReference: ").append(toIndentedString(serviceFeesInstanceReportReference)).append("\n");
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

