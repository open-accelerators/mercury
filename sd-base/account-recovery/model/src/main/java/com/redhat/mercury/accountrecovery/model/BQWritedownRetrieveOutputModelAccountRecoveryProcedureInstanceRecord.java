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
 * BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-06-07T18:27:41.474305+02:00[Europe/Madrid]")
public class BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord {
  @SerializedName("accountRecoveryCaseType")
  private String accountRecoveryCaseType = null;

  @SerializedName("productInstanceReference")
  private String productInstanceReference = null;

  @SerializedName("customerReference")
  private String customerReference = null;

  @SerializedName("employeeBusinessUnitReference")
  private String employeeBusinessUnitReference = null;

  @SerializedName("accountNumber")
  private String accountNumber = null;

  @SerializedName("bankBranchLocationReference")
  private String bankBranchLocationReference = null;

  @SerializedName("dateType")
  private Object dateType = null;

  @SerializedName("involvedPartyReference")
  private Object involvedPartyReference = null;

  @SerializedName("accountType")
  private String accountType = null;

  @SerializedName("accountCurrency")
  private String accountCurrency = null;

  @SerializedName("accountLimitType")
  private String accountLimitType = null;

  @SerializedName("accountLimit")
  private String accountLimit = null;

  @SerializedName("allowedAccess")
  private String allowedAccess = null;

  @SerializedName("taxReference")
  private String taxReference = null;

  @SerializedName("accountStatus")
  private String accountStatus = null;

  @SerializedName("collateralAssetAllocationProfile")
  private String collateralAssetAllocationProfile = null;

  @SerializedName("collateralAssetAllocationInstanceRecord")
  private Object collateralAssetAllocationInstanceRecord = null;

  @SerializedName("collateralType")
  private String collateralType = null;

  @SerializedName("collateralAssetDescription")
  private String collateralAssetDescription = null;

  @SerializedName("transactionRecord")
  private Object transactionRecord = null;

  @SerializedName("accountRecoveryCaseWorkProducts")
  private Object accountRecoveryCaseWorkProducts = null;

  @SerializedName("accountRecoveryCaseResolutionSchedule")
  private String accountRecoveryCaseResolutionSchedule = null;

  @SerializedName("accountRecoveryCaseStatus")
  private String accountRecoveryCaseStatus = null;

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountRecoveryCaseType(String accountRecoveryCaseType) {
    this.accountRecoveryCaseType = accountRecoveryCaseType;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: This is the type of recovery case (e.g. lapsed payment, collateral revaluation, credit) 
   * @return accountRecoveryCaseType
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: This is the type of recovery case (e.g. lapsed payment, collateral revaluation, credit) ")
  public String getAccountRecoveryCaseType() {
    return accountRecoveryCaseType;
  }

  public void setAccountRecoveryCaseType(String accountRecoveryCaseType) {
    this.accountRecoveryCaseType = accountRecoveryCaseType;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord productInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the product instance associated with the account recovery case 
   * @return productInstanceReference
  **/
  @Schema(example = "733600", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the product instance associated with the account recovery case ")
  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord customerReference(String customerReference) {
    this.customerReference = customerReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer associated with account recovery case - likely product &#x27;owner&#x27; 
   * @return customerReference
  **/
  @Schema(example = "707089", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer associated with account recovery case - likely product 'owner' ")
  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord employeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The assigned customer relationship manager or unit for the case 
   * @return employeeBusinessUnitReference
  **/
  @Schema(example = "777999", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The assigned customer relationship manager or unit for the case ")
  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the underlying account for the product instance being recovered 
   * @return accountNumber
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the underlying account for the product instance being recovered ")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord bankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Location where the business is booked for reporting purposes 
   * @return bankBranchLocationReference
  **/
  @Schema(example = "767020", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Location where the business is booked for reporting purposes ")
  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord dateType(Object dateType) {
    this.dateType = dateType;
    return this;
  }

   /**
   * Get dateType
   * @return dateType
  **/
  @Schema(description = "")
  public Object getDateType() {
    return dateType;
  }

  public void setDateType(Object dateType) {
    this.dateType = dateType;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord involvedPartyReference(Object involvedPartyReference) {
    this.involvedPartyReference = involvedPartyReference;
    return this;
  }

   /**
   * Get involvedPartyReference
   * @return involvedPartyReference
  **/
  @Schema(description = "")
  public Object getInvolvedPartyReference() {
    return involvedPartyReference;
  }

  public void setInvolvedPartyReference(Object involvedPartyReference) {
    this.involvedPartyReference = involvedPartyReference;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of account being recovered (e.g. checking, mortgage) 
   * @return accountType
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of account being recovered (e.g. checking, mortgage) ")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The currency for the account 
   * @return accountCurrency
  **/
  @Schema(example = "USD", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The currency for the account ")
  public String getAccountCurrency() {
    return accountCurrency;
  }

  public void setAccountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountLimitType(String accountLimitType) {
    this.accountLimitType = accountLimitType;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Limits that are applied to the account (e.g. transaction credit/debit, netting, position) 
   * @return accountLimitType
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Limits that are applied to the account (e.g. transaction credit/debit, netting, position) ")
  public String getAccountLimitType() {
    return accountLimitType;
  }

  public void setAccountLimitType(String accountLimitType) {
    this.accountLimitType = accountLimitType;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountLimit(String accountLimit) {
    this.accountLimit = accountLimit;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Current position against limits 
   * @return accountLimit
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Current position against limits ")
  public String getAccountLimit() {
    return accountLimit;
  }

  public void setAccountLimit(String accountLimit) {
    this.accountLimit = accountLimit;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord allowedAccess(String allowedAccess) {
    this.allowedAccess = allowedAccess;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any additional parties given access to the account (allowed roles and actions against the product) 
   * @return allowedAccess
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any additional parties given access to the account (allowed roles and actions against the product) ")
  public String getAllowedAccess() {
    return allowedAccess;
  }

  public void setAllowedAccess(String allowedAccess) {
    this.allowedAccess = allowedAccess;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord taxReference(String taxReference) {
    this.taxReference = taxReference;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a tax identifier associated with the customer/account for tax reporting 
   * @return taxReference
  **/
  @Schema(example = "773741", description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a tax identifier associated with the customer/account for tax reporting ")
  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Status of the recovery account (e.g. pre-opened, active, dormant, pending for closing, blocked) 
   * @return accountStatus
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Status of the recovery account (e.g. pre-opened, active, dormant, pending for closing, blocked) ")
  public String getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord collateralAssetAllocationProfile(String collateralAssetAllocationProfile) {
    this.collateralAssetAllocationProfile = collateralAssetAllocationProfile;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Lists the customer&#x27;s collateral asset allocation status against different loan products known to the bank 
   * @return collateralAssetAllocationProfile
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Lists the customer's collateral asset allocation status against different loan products known to the bank ")
  public String getCollateralAssetAllocationProfile() {
    return collateralAssetAllocationProfile;
  }

  public void setCollateralAssetAllocationProfile(String collateralAssetAllocationProfile) {
    this.collateralAssetAllocationProfile = collateralAssetAllocationProfile;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord collateralAssetAllocationInstanceRecord(Object collateralAssetAllocationInstanceRecord) {
    this.collateralAssetAllocationInstanceRecord = collateralAssetAllocationInstanceRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The record detailing how a customer&#x27;s collateral assets are allocated 
   * @return collateralAssetAllocationInstanceRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The record detailing how a customer's collateral assets are allocated ")
  public Object getCollateralAssetAllocationInstanceRecord() {
    return collateralAssetAllocationInstanceRecord;
  }

  public void setCollateralAssetAllocationInstanceRecord(Object collateralAssetAllocationInstanceRecord) {
    this.collateralAssetAllocationInstanceRecord = collateralAssetAllocationInstanceRecord;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord collateralType(String collateralType) {
    this.collateralType = collateralType;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of asset (e.g. building, machinery, inventory, financial instrument, art) 
   * @return collateralType
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of asset (e.g. building, machinery, inventory, financial instrument, art) ")
  public String getCollateralType() {
    return collateralType;
  }

  public void setCollateralType(String collateralType) {
    this.collateralType = collateralType;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord collateralAssetDescription(String collateralAssetDescription) {
    this.collateralAssetDescription = collateralAssetDescription;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of significant details and properties of the asset 
   * @return collateralAssetDescription
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of significant details and properties of the asset ")
  public String getCollateralAssetDescription() {
    return collateralAssetDescription;
  }

  public void setCollateralAssetDescription(String collateralAssetDescription) {
    this.collateralAssetDescription = collateralAssetDescription;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord transactionRecord(Object transactionRecord) {
    this.transactionRecord = transactionRecord;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of all transactions made against the account - not itemized here but referenced from fulfillment processing 
   * @return transactionRecord
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of all transactions made against the account - not itemized here but referenced from fulfillment processing ")
  public Object getTransactionRecord() {
    return transactionRecord;
  }

  public void setTransactionRecord(Object transactionRecord) {
    this.transactionRecord = transactionRecord;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountRecoveryCaseWorkProducts(Object accountRecoveryCaseWorkProducts) {
    this.accountRecoveryCaseWorkProducts = accountRecoveryCaseWorkProducts;
    return this;
  }

   /**
   * Get accountRecoveryCaseWorkProducts
   * @return accountRecoveryCaseWorkProducts
  **/
  @Schema(description = "")
  public Object getAccountRecoveryCaseWorkProducts() {
    return accountRecoveryCaseWorkProducts;
  }

  public void setAccountRecoveryCaseWorkProducts(Object accountRecoveryCaseWorkProducts) {
    this.accountRecoveryCaseWorkProducts = accountRecoveryCaseWorkProducts;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountRecoveryCaseResolutionSchedule(String accountRecoveryCaseResolutionSchedule) {
    this.accountRecoveryCaseResolutionSchedule = accountRecoveryCaseResolutionSchedule;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Target and actual dates for processing/resolution 
   * @return accountRecoveryCaseResolutionSchedule
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Target and actual dates for processing/resolution ")
  public String getAccountRecoveryCaseResolutionSchedule() {
    return accountRecoveryCaseResolutionSchedule;
  }

  public void setAccountRecoveryCaseResolutionSchedule(String accountRecoveryCaseResolutionSchedule) {
    this.accountRecoveryCaseResolutionSchedule = accountRecoveryCaseResolutionSchedule;
  }

  public BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord accountRecoveryCaseStatus(String accountRecoveryCaseStatus) {
    this.accountRecoveryCaseStatus = accountRecoveryCaseStatus;
    return this;
  }

   /**
   * &#x60;status: Not Mapped&#x60;  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the recovery case (e.g. in assessment, write-down, planning, negotiation, restructuring) 
   * @return accountRecoveryCaseStatus
  **/
  @Schema(description = "`status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the recovery case (e.g. in assessment, write-down, planning, negotiation, restructuring) ")
  public String getAccountRecoveryCaseStatus() {
    return accountRecoveryCaseStatus;
  }

  public void setAccountRecoveryCaseStatus(String accountRecoveryCaseStatus) {
    this.accountRecoveryCaseStatus = accountRecoveryCaseStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord = (BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord) o;
    return Objects.equals(this.accountRecoveryCaseType, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.accountRecoveryCaseType) &&
        Objects.equals(this.productInstanceReference, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.productInstanceReference) &&
        Objects.equals(this.customerReference, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.customerReference) &&
        Objects.equals(this.employeeBusinessUnitReference, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.employeeBusinessUnitReference) &&
        Objects.equals(this.accountNumber, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.accountNumber) &&
        Objects.equals(this.bankBranchLocationReference, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.bankBranchLocationReference) &&
        Objects.equals(this.dateType, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.dateType) &&
        Objects.equals(this.involvedPartyReference, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.involvedPartyReference) &&
        Objects.equals(this.accountType, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.accountType) &&
        Objects.equals(this.accountCurrency, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.accountCurrency) &&
        Objects.equals(this.accountLimitType, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.accountLimitType) &&
        Objects.equals(this.accountLimit, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.accountLimit) &&
        Objects.equals(this.allowedAccess, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.allowedAccess) &&
        Objects.equals(this.taxReference, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.taxReference) &&
        Objects.equals(this.accountStatus, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.accountStatus) &&
        Objects.equals(this.collateralAssetAllocationProfile, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.collateralAssetAllocationProfile) &&
        Objects.equals(this.collateralAssetAllocationInstanceRecord, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.collateralAssetAllocationInstanceRecord) &&
        Objects.equals(this.collateralType, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.collateralType) &&
        Objects.equals(this.collateralAssetDescription, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.collateralAssetDescription) &&
        Objects.equals(this.transactionRecord, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.transactionRecord) &&
        Objects.equals(this.accountRecoveryCaseWorkProducts, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.accountRecoveryCaseWorkProducts) &&
        Objects.equals(this.accountRecoveryCaseResolutionSchedule, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.accountRecoveryCaseResolutionSchedule) &&
        Objects.equals(this.accountRecoveryCaseStatus, bqWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord.accountRecoveryCaseStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountRecoveryCaseType, productInstanceReference, customerReference, employeeBusinessUnitReference, accountNumber, bankBranchLocationReference, dateType, involvedPartyReference, accountType, accountCurrency, accountLimitType, accountLimit, allowedAccess, taxReference, accountStatus, collateralAssetAllocationProfile, collateralAssetAllocationInstanceRecord, collateralType, collateralAssetDescription, transactionRecord, accountRecoveryCaseWorkProducts, accountRecoveryCaseResolutionSchedule, accountRecoveryCaseStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BQWritedownRetrieveOutputModelAccountRecoveryProcedureInstanceRecord {\n");
    
    sb.append("    accountRecoveryCaseType: ").append(toIndentedString(accountRecoveryCaseType)).append("\n");
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    employeeBusinessUnitReference: ").append(toIndentedString(employeeBusinessUnitReference)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bankBranchLocationReference: ").append(toIndentedString(bankBranchLocationReference)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    involvedPartyReference: ").append(toIndentedString(involvedPartyReference)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    accountLimitType: ").append(toIndentedString(accountLimitType)).append("\n");
    sb.append("    accountLimit: ").append(toIndentedString(accountLimit)).append("\n");
    sb.append("    allowedAccess: ").append(toIndentedString(allowedAccess)).append("\n");
    sb.append("    taxReference: ").append(toIndentedString(taxReference)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    collateralAssetAllocationProfile: ").append(toIndentedString(collateralAssetAllocationProfile)).append("\n");
    sb.append("    collateralAssetAllocationInstanceRecord: ").append(toIndentedString(collateralAssetAllocationInstanceRecord)).append("\n");
    sb.append("    collateralType: ").append(toIndentedString(collateralType)).append("\n");
    sb.append("    collateralAssetDescription: ").append(toIndentedString(collateralAssetDescription)).append("\n");
    sb.append("    transactionRecord: ").append(toIndentedString(transactionRecord)).append("\n");
    sb.append("    accountRecoveryCaseWorkProducts: ").append(toIndentedString(accountRecoveryCaseWorkProducts)).append("\n");
    sb.append("    accountRecoveryCaseResolutionSchedule: ").append(toIndentedString(accountRecoveryCaseResolutionSchedule)).append("\n");
    sb.append("    accountRecoveryCaseStatus: ").append(toIndentedString(accountRecoveryCaseStatus)).append("\n");
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
