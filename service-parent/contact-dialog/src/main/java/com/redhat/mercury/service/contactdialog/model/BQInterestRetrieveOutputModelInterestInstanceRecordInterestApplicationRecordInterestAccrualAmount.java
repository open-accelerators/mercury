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
 * BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestAccrualAmount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:19:49.536-04:00[America/New_York]")

public class BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestAccrualAmount   {
  @JsonProperty("interestAccrualType")
  private String interestAccrualType;

  @JsonProperty("interestAccrualCharge")
  private String interestAccrualCharge;

  public BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestAccrualAmount interestAccrualType(String interestAccrualType) {
    this.interestAccrualType = interestAccrualType;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_E5P_-cTGEeChad0JzLk7QA_348288418  bian-reference: InterestTransaction.AccuredInterestType  general-info: The interest type being tracked 
   * @return interestAccrualType
  */
  @ApiModelProperty(value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_E5P_-cTGEeChad0JzLk7QA_348288418  bian-reference: InterestTransaction.AccuredInterestType  general-info: The interest type being tracked ")


  public String getInterestAccrualType() {
    return interestAccrualType;
  }

  public void setInterestAccrualType(String interestAccrualType) {
    this.interestAccrualType = interestAccrualType;
  }

  public BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestAccrualAmount interestAccrualCharge(String interestAccrualCharge) {
    this.interestAccrualCharge = interestAccrualCharge;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The accrued amount of applied interest 
   * @return interestAccrualCharge
  */
  @ApiModelProperty(example = "USD 250", value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The accrued amount of applied interest ")


  public String getInterestAccrualCharge() {
    return interestAccrualCharge;
  }

  public void setInterestAccrualCharge(String interestAccrualCharge) {
    this.interestAccrualCharge = interestAccrualCharge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestAccrualAmount bqInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestAccrualAmount = (BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestAccrualAmount) o;
    return Objects.equals(this.interestAccrualType, bqInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestAccrualAmount.interestAccrualType) &&
        Objects.equals(this.interestAccrualCharge, bqInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestAccrualAmount.interestAccrualCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestAccrualType, interestAccrualCharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQInterestRetrieveOutputModelInterestInstanceRecordInterestApplicationRecordInterestAccrualAmount {\n");
    
    sb.append("    interestAccrualType: ").append(toIndentedString(interestAccrualType)).append("\n");
    sb.append("    interestAccrualCharge: ").append(toIndentedString(interestAccrualCharge)).append("\n");
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

