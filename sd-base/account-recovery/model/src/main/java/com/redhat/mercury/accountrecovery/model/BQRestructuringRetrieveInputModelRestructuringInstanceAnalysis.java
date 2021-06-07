/*
 * Account Recovery
 * This service domain handles the restructuring of a distressed account (loan) after standard recovery
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.redhat.mercury.accountrecovery.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BQRestructuringRetrieveInputModelRestructuringInstanceAnalysis
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-07T18:27:41.474305+02:00[Europe/Madrid]")
public class BQRestructuringRetrieveInputModelRestructuringInstanceAnalysis {
  @SerializedName("restructuringInstanceAnalysisReference")
  private String restructuringInstanceAnalysisReference = null;

  public BQRestructuringRetrieveInputModelRestructuringInstanceAnalysis restructuringInstanceAnalysisReference(String restructuringInstanceAnalysisReference) {
    this.restructuringInstanceAnalysisReference = restructuringInstanceAnalysisReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return restructuringInstanceAnalysisReference
  **/
  @Schema(example = "796980", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view ")
  public String getRestructuringInstanceAnalysisReference() {
    return restructuringInstanceAnalysisReference;
  }

  public void setRestructuringInstanceAnalysisReference(String restructuringInstanceAnalysisReference) {
    this.restructuringInstanceAnalysisReference = restructuringInstanceAnalysisReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQRestructuringRetrieveInputModelRestructuringInstanceAnalysis bqRestructuringRetrieveInputModelRestructuringInstanceAnalysis = (BQRestructuringRetrieveInputModelRestructuringInstanceAnalysis) o;
    return Objects.equals(this.restructuringInstanceAnalysisReference, bqRestructuringRetrieveInputModelRestructuringInstanceAnalysis.restructuringInstanceAnalysisReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restructuringInstanceAnalysisReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQRestructuringRetrieveInputModelRestructuringInstanceAnalysis {\n");
    
    sb.append("    restructuringInstanceAnalysisReference: ").append(toIndentedString(restructuringInstanceAnalysisReference)).append("\n");
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
