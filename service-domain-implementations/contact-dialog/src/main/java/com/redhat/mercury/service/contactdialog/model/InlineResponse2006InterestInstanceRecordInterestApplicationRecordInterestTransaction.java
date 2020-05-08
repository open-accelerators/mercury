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
 * InlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class InlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestTransaction   {
  @JsonProperty("transactionDescription")
  private String transactionDescription;

  @JsonProperty("transactionRateType")
  private String transactionRateType;

  @JsonProperty("transactionInterestCharge")
  private String transactionInterestCharge;

  public InlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestTransaction transactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: General description of the interest transaction 
   * @return transactionDescription
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: General description of the interest transaction ")


  public String getTransactionDescription() {
    return transactionDescription;
  }

  public void setTransactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
  }

  public InlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestTransaction transactionRateType(String transactionRateType) {
    this.transactionRateType = transactionRateType;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_2b6L4A4hEeO3g-FNSwkb-g_-1305263591  bian-reference: InterestTransaction.AppliedInterestType  general-info: Applicable rate type 
   * @return transactionRateType
  */
  @ApiModelProperty(value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_2b6L4A4hEeO3g-FNSwkb-g_-1305263591  bian-reference: InterestTransaction.AppliedInterestType  general-info: Applicable rate type ")


  public String getTransactionRateType() {
    return transactionRateType;
  }

  public void setTransactionRateType(String transactionRateType) {
    this.transactionRateType = transactionRateType;
  }

  public InlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestTransaction transactionInterestCharge(String transactionInterestCharge) {
    this.transactionInterestCharge = transactionInterestCharge;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_E5P_98TGEeChad0JzLk7QA_2006810136  bian-reference: InterestTransaction.AppliedInterestAmount  general-info: The derived interest amount to be applied 
   * @return transactionInterestCharge
  */
  @ApiModelProperty(example = "USD 250", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E5P_9MTGEeChad0JzLk7QA_218224835/elements/_E5P_98TGEeChad0JzLk7QA_2006810136  bian-reference: InterestTransaction.AppliedInterestAmount  general-info: The derived interest amount to be applied ")


  public String getTransactionInterestCharge() {
    return transactionInterestCharge;
  }

  public void setTransactionInterestCharge(String transactionInterestCharge) {
    this.transactionInterestCharge = transactionInterestCharge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestTransaction inlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestTransaction = (InlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestTransaction) o;
    return Objects.equals(this.transactionDescription, inlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestTransaction.transactionDescription) &&
        Objects.equals(this.transactionRateType, inlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestTransaction.transactionRateType) &&
        Objects.equals(this.transactionInterestCharge, inlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestTransaction.transactionInterestCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionDescription, transactionRateType, transactionInterestCharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006InterestInstanceRecordInterestApplicationRecordInterestTransaction {\n");
    
    sb.append("    transactionDescription: ").append(toIndentedString(transactionDescription)).append("\n");
    sb.append("    transactionRateType: ").append(toIndentedString(transactionRateType)).append("\n");
    sb.append("    transactionInterestCharge: ").append(toIndentedString(transactionInterestCharge)).append("\n");
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

