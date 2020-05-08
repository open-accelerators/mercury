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
 * BQPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T15:54:49.785-04:00[America/New_York]")

public class BQPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction   {
  @JsonProperty("paymentTransactionType")
  private String paymentTransactionType;

  @JsonProperty("paymentTransactionPayeeReference")
  private String paymentTransactionPayeeReference;

  @JsonProperty("paymentTransactionPayeeAccountReference")
  private String paymentTransactionPayeeAccountReference;

  @JsonProperty("paymentTransactionPayeeBankReference")
  private String paymentTransactionPayeeBankReference;

  @JsonProperty("paymentTransactionAmount")
  private String paymentTransactionAmount;

  @JsonProperty("paymentTransactionFeeType")
  private String paymentTransactionFeeType;

  @JsonProperty("paymentTransactionFeeCharge")
  private String paymentTransactionFeeCharge;

  @JsonProperty("paymentTransactionDate")
  private String paymentTransactionDate;

  @JsonProperty("paymentTransactionPaymentMechanism")
  private String paymentTransactionPaymentMechanism;

  @JsonProperty("paymentTransactionPaymentPurpose")
  private String paymentTransactionPaymentPurpose;

  @JsonProperty("paymentTransactionBankBranchLocationReference")
  private String paymentTransactionBankBranchLocationReference;

  @JsonProperty("paymentTransactionStatus")
  private String paymentTransactionStatus;

  public BQPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction paymentTransactionType(String paymentTransactionType) {
    this.paymentTransactionType = paymentTransactionType;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FA2cwMTGEeChad0JzLk7QA_1385452657/elements/_q58kEK23EeKuGrOch6U_ZQ_-1354685933  bian-reference: PaymentTransactionType  general-info: The type of payment transaction (e.g. customer payment, standing order, direct debit, bill pay) 
   * @return paymentTransactionType
  */
  @ApiModelProperty(value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FA2cwMTGEeChad0JzLk7QA_1385452657/elements/_q58kEK23EeKuGrOch6U_ZQ_-1354685933  bian-reference: PaymentTransactionType  general-info: The type of payment transaction (e.g. customer payment, standing order, direct debit, bill pay) ")


  public String getPaymentTransactionType() {
    return paymentTransactionType;
  }

  public void setPaymentTransactionType(String paymentTransactionType) {
    this.paymentTransactionType = paymentTransactionType;
  }

  public BQPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction paymentTransactionPayeeReference(String paymentTransactionPayeeReference) {
    this.paymentTransactionPayeeReference = paymentTransactionPayeeReference;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EteNycTGEeChad0JzLk7QA_-591715083  bian-reference: PaymentTransactionInvolvementType (as Payee)  general-info: Reference to the party to whom the payment is made 
   * @return paymentTransactionPayeeReference
  */
  @ApiModelProperty(example = "713054", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EteNycTGEeChad0JzLk7QA_-591715083  bian-reference: PaymentTransactionInvolvementType (as Payee)  general-info: Reference to the party to whom the payment is made ")


  public String getPaymentTransactionPayeeReference() {
    return paymentTransactionPayeeReference;
  }

  public void setPaymentTransactionPayeeReference(String paymentTransactionPayeeReference) {
    this.paymentTransactionPayeeReference = paymentTransactionPayeeReference;
  }

  public BQPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction paymentTransactionPayeeAccountReference(String paymentTransactionPayeeAccountReference) {
    this.paymentTransactionPayeeAccountReference = paymentTransactionPayeeAccountReference;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_4a7goJo3EeOJb4DIsGFWTA  bian-reference: PaymentTransaction.Account (as Payee Account)  general-info: Reference to the account to which the payment is made 
   * @return paymentTransactionPayeeAccountReference
  */
  @ApiModelProperty(example = "736608", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_4a7goJo3EeOJb4DIsGFWTA  bian-reference: PaymentTransaction.Account (as Payee Account)  general-info: Reference to the account to which the payment is made ")


  public String getPaymentTransactionPayeeAccountReference() {
    return paymentTransactionPayeeAccountReference;
  }

  public void setPaymentTransactionPayeeAccountReference(String paymentTransactionPayeeAccountReference) {
    this.paymentTransactionPayeeAccountReference = paymentTransactionPayeeAccountReference;
  }

  public BQPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction paymentTransactionPayeeBankReference(String paymentTransactionPayeeBankReference) {
    this.paymentTransactionPayeeBankReference = paymentTransactionPayeeBankReference;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EteNyMTGEeChad0JzLk7QA_-246206935  bian-reference: PaymentTransactionInvolvementType (as PayeeBank)  general-info: Reference to the bank where the payee account is held 
   * @return paymentTransactionPayeeBankReference
  */
  @ApiModelProperty(example = "775471", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EteNyMTGEeChad0JzLk7QA_-246206935  bian-reference: PaymentTransactionInvolvementType (as PayeeBank)  general-info: Reference to the bank where the payee account is held ")


  public String getPaymentTransactionPayeeBankReference() {
    return paymentTransactionPayeeBankReference;
  }

  public void setPaymentTransactionPayeeBankReference(String paymentTransactionPayeeBankReference) {
    this.paymentTransactionPayeeBankReference = paymentTransactionPayeeBankReference;
  }

  public BQPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction paymentTransactionAmount(String paymentTransactionAmount) {
    this.paymentTransactionAmount = paymentTransactionAmount;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_xIKY4Hm5EeKIubTif2R3gg_40795932  bian-reference: PaymentTransactionPrincipleAmount  general-info: The amount (and currency if applicable) of the payment 
   * @return paymentTransactionAmount
  */
  @ApiModelProperty(example = "USD 250", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_xIKY4Hm5EeKIubTif2R3gg_40795932  bian-reference: PaymentTransactionPrincipleAmount  general-info: The amount (and currency if applicable) of the payment ")


  public String getPaymentTransactionAmount() {
    return paymentTransactionAmount;
  }

  public void setPaymentTransactionAmount(String paymentTransactionAmount) {
    this.paymentTransactionAmount = paymentTransactionAmount;
  }

  public BQPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction paymentTransactionFeeType(String paymentTransactionFeeType) {
    this.paymentTransactionFeeType = paymentTransactionFeeType;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816  bian-reference: FeeTransactionAppliedFeeType  general-info: The fee type applied to the payment transaction 
   * @return paymentTransactionFeeType
  */
  @ApiModelProperty(value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_Fbg_gcTGEeChad0JzLk7QA_-70110816  bian-reference: FeeTransactionAppliedFeeType  general-info: The fee type applied to the payment transaction ")


  public String getPaymentTransactionFeeType() {
    return paymentTransactionFeeType;
  }

  public void setPaymentTransactionFeeType(String paymentTransactionFeeType) {
    this.paymentTransactionFeeType = paymentTransactionFeeType;
  }

  public BQPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction paymentTransactionFeeCharge(String paymentTransactionFeeCharge) {
    this.paymentTransactionFeeCharge = paymentTransactionFeeCharge;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_FMBK98TGEeChad0JzLk7QA_-1487452687  bian-reference: FeeTransactionAppliedFeeAmount  general-info: The fee charge applied to the transaction 
   * @return paymentTransactionFeeCharge
  */
  @ApiModelProperty(example = "USD 250", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Fbg_gMTGEeChad0JzLk7QA_-330542668/elements/_FMBK98TGEeChad0JzLk7QA_-1487452687  bian-reference: FeeTransactionAppliedFeeAmount  general-info: The fee charge applied to the transaction ")


  public String getPaymentTransactionFeeCharge() {
    return paymentTransactionFeeCharge;
  }

  public void setPaymentTransactionFeeCharge(String paymentTransactionFeeCharge) {
    this.paymentTransactionFeeCharge = paymentTransactionFeeCharge;
  }

  public BQPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction paymentTransactionDate(String paymentTransactionDate) {
    this.paymentTransactionDate = paymentTransactionDate;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FDYMU8TGEeChad0JzLk7QA_1746210992  bian-reference: PaymentTransactionValueDate  general-info: The various key dates and times associated with the payment transaction 
   * @return paymentTransactionDate
  */
  @ApiModelProperty(example = "09-22-2018", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FDYMU8TGEeChad0JzLk7QA_1746210992  bian-reference: PaymentTransactionValueDate  general-info: The various key dates and times associated with the payment transaction ")


  public String getPaymentTransactionDate() {
    return paymentTransactionDate;
  }

  public void setPaymentTransactionDate(String paymentTransactionDate) {
    this.paymentTransactionDate = paymentTransactionDate;
  }

  public BQPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction paymentTransactionPaymentMechanism(String paymentTransactionPaymentMechanism) {
    this.paymentTransactionPaymentMechanism = paymentTransactionPaymentMechanism;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FAi6ycTGEeChad0JzLk7QA_1746210990  bian-reference: PaymentTransactionUsedMechanism  general-info: Requested payment mechanism (e.g. Wire, ACH) 
   * @return paymentTransactionPaymentMechanism
  */
  @ApiModelProperty(value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FAi6ycTGEeChad0JzLk7QA_1746210990  bian-reference: PaymentTransactionUsedMechanism  general-info: Requested payment mechanism (e.g. Wire, ACH) ")


  public String getPaymentTransactionPaymentMechanism() {
    return paymentTransactionPaymentMechanism;
  }

  public void setPaymentTransactionPaymentMechanism(String paymentTransactionPaymentMechanism) {
    this.paymentTransactionPaymentMechanism = paymentTransactionPaymentMechanism;
  }

  public BQPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction paymentTransactionPaymentPurpose(String paymentTransactionPaymentPurpose) {
    this.paymentTransactionPaymentPurpose = paymentTransactionPaymentPurpose;
    return this;
  }

  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the purpose including any external reference to the transaction 
   * @return paymentTransactionPaymentPurpose
  */
  @ApiModelProperty(value = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the purpose including any external reference to the transaction ")


  public String getPaymentTransactionPaymentPurpose() {
    return paymentTransactionPaymentPurpose;
  }

  public void setPaymentTransactionPaymentPurpose(String paymentTransactionPaymentPurpose) {
    this.paymentTransactionPaymentPurpose = paymentTransactionPaymentPurpose;
  }

  public BQPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction paymentTransactionBankBranchLocationReference(String paymentTransactionBankBranchLocationReference) {
    this.paymentTransactionBankBranchLocationReference = paymentTransactionBankBranchLocationReference;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_z2I6YGx5EeKmZJ0Ago--9g_239738909  bian-reference: PaymentTransactionInvolvementAsPartyRole.Party.Location  general-info: Reference to the location the payment transaction is initiated from  
   * @return paymentTransactionBankBranchLocationReference
  */
  @ApiModelProperty(example = "731251", value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_z2I6YGx5EeKmZJ0Ago--9g_239738909  bian-reference: PaymentTransactionInvolvementAsPartyRole.Party.Location  general-info: Reference to the location the payment transaction is initiated from  ")


  public String getPaymentTransactionBankBranchLocationReference() {
    return paymentTransactionBankBranchLocationReference;
  }

  public void setPaymentTransactionBankBranchLocationReference(String paymentTransactionBankBranchLocationReference) {
    this.paymentTransactionBankBranchLocationReference = paymentTransactionBankBranchLocationReference;
  }

  public BQPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction paymentTransactionStatus(String paymentTransactionStatus) {
    this.paymentTransactionStatus = paymentTransactionStatus;
    return this;
  }

  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FCe0dcTGEeChad0JzLk7QA_221546661  bian-reference: BankingTransactionStatus  general-info: The processing status of the transaction (e.g. captured, approved, initiated, confirmed, settled) 
   * @return paymentTransactionStatus
  */
  @ApiModelProperty(value = "`status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FCe0dcTGEeChad0JzLk7QA_221546661  bian-reference: BankingTransactionStatus  general-info: The processing status of the transaction (e.g. captured, approved, initiated, confirmed, settled) ")


  public String getPaymentTransactionStatus() {
    return paymentTransactionStatus;
  }

  public void setPaymentTransactionStatus(String paymentTransactionStatus) {
    this.paymentTransactionStatus = paymentTransactionStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction bqPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction = (BQPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction) o;
    return Objects.equals(this.paymentTransactionType, bqPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction.paymentTransactionType) &&
        Objects.equals(this.paymentTransactionPayeeReference, bqPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction.paymentTransactionPayeeReference) &&
        Objects.equals(this.paymentTransactionPayeeAccountReference, bqPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction.paymentTransactionPayeeAccountReference) &&
        Objects.equals(this.paymentTransactionPayeeBankReference, bqPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction.paymentTransactionPayeeBankReference) &&
        Objects.equals(this.paymentTransactionAmount, bqPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction.paymentTransactionAmount) &&
        Objects.equals(this.paymentTransactionFeeType, bqPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction.paymentTransactionFeeType) &&
        Objects.equals(this.paymentTransactionFeeCharge, bqPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction.paymentTransactionFeeCharge) &&
        Objects.equals(this.paymentTransactionDate, bqPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction.paymentTransactionDate) &&
        Objects.equals(this.paymentTransactionPaymentMechanism, bqPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction.paymentTransactionPaymentMechanism) &&
        Objects.equals(this.paymentTransactionPaymentPurpose, bqPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction.paymentTransactionPaymentPurpose) &&
        Objects.equals(this.paymentTransactionBankBranchLocationReference, bqPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction.paymentTransactionBankBranchLocationReference) &&
        Objects.equals(this.paymentTransactionStatus, bqPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction.paymentTransactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransactionType, paymentTransactionPayeeReference, paymentTransactionPayeeAccountReference, paymentTransactionPayeeBankReference, paymentTransactionAmount, paymentTransactionFeeType, paymentTransactionFeeCharge, paymentTransactionDate, paymentTransactionPaymentMechanism, paymentTransactionPaymentPurpose, paymentTransactionBankBranchLocationReference, paymentTransactionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQPaymentsUpdateOutputModelPaymentsInstanceRecordPaymentTransaction {\n");
    
    sb.append("    paymentTransactionType: ").append(toIndentedString(paymentTransactionType)).append("\n");
    sb.append("    paymentTransactionPayeeReference: ").append(toIndentedString(paymentTransactionPayeeReference)).append("\n");
    sb.append("    paymentTransactionPayeeAccountReference: ").append(toIndentedString(paymentTransactionPayeeAccountReference)).append("\n");
    sb.append("    paymentTransactionPayeeBankReference: ").append(toIndentedString(paymentTransactionPayeeBankReference)).append("\n");
    sb.append("    paymentTransactionAmount: ").append(toIndentedString(paymentTransactionAmount)).append("\n");
    sb.append("    paymentTransactionFeeType: ").append(toIndentedString(paymentTransactionFeeType)).append("\n");
    sb.append("    paymentTransactionFeeCharge: ").append(toIndentedString(paymentTransactionFeeCharge)).append("\n");
    sb.append("    paymentTransactionDate: ").append(toIndentedString(paymentTransactionDate)).append("\n");
    sb.append("    paymentTransactionPaymentMechanism: ").append(toIndentedString(paymentTransactionPaymentMechanism)).append("\n");
    sb.append("    paymentTransactionPaymentPurpose: ").append(toIndentedString(paymentTransactionPaymentPurpose)).append("\n");
    sb.append("    paymentTransactionBankBranchLocationReference: ").append(toIndentedString(paymentTransactionBankBranchLocationReference)).append("\n");
    sb.append("    paymentTransactionStatus: ").append(toIndentedString(paymentTransactionStatus)).append("\n");
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

