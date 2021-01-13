package com.redhat.bian.servicedomain.models;

/**
 * CRCustomerOfferProcedureInitiateOutputModel
 */
public class CRCustomerOfferProcedureInitiateOutputModel   {
  private String customerOfferProcedureInstanceReference = null;

  private String customerOfferProcedureInitiateActionReference = null;

  private Object customerOfferProcedureInitiateActionRecord = null;

  private String customerOfferProcedureInstanceStatus = null;

  private CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord = null;

  private CRCustomerOfferProcedureInitiateOutputModelProductInstanceRecord productInstanceRecord = null;

  private CRCustomerOfferProcedureInitiateOutputModelDisclosuresInstanceRecord disclosuresInstanceRecord = null;

  private CRCustomerOfferProcedureInitiateInputModelCreditInstanceRecord creditInstanceRecord = null;

  private CRCustomerOfferProcedureInitiateInputModelUnderwritingInstanceRecord underwritingInstanceRecord = null;

  private CRCustomerOfferProcedureInitiateInputModelComplianceInstanceRecord complianceInstanceRecord = null;

  private CRCustomerOfferProcedureInitiateInputModelAuditInstanceRecord auditInstanceRecord = null;

  private CRCustomerOfferProcedureInitiateOutputModelCollateralInstanceRecord collateralInstanceRecord = null;

  private CRCustomerOfferProcedureInitiateInputModelBookingInstanceRecord bookingInstanceRecord = null;

  private CRCustomerOfferProcedureInitiateInputModelCorrespondenceandDocumentsInstanceRecord correspondenceandDocumentsInstanceRecord = null;

  private CRCustomerOfferProcedureInitiateInputModelAgreementInstanceRecord agreementInstanceRecord = null;

  private CRCustomerOfferProcedureInitiateInputModelProductInitializationInstanceRecord productInitializationInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Offer Procedure instance 
   * @return customerOfferProcedureInstanceReference
  **/

  public String getCustomerOfferProcedureInstanceReference() {
    return customerOfferProcedureInstanceReference;
  }

  public void setCustomerOfferProcedureInstanceReference(String customerOfferProcedureInstanceReference) {
    this.customerOfferProcedureInstanceReference = customerOfferProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return customerOfferProcedureInitiateActionReference
  **/

  public String getCustomerOfferProcedureInitiateActionReference() {
    return customerOfferProcedureInitiateActionReference;
  }

  public void setCustomerOfferProcedureInitiateActionReference(String customerOfferProcedureInitiateActionReference) {
    this.customerOfferProcedureInitiateActionReference = customerOfferProcedureInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerOfferProcedureInitiateActionRecord
  **/

  public Object getCustomerOfferProcedureInitiateActionRecord() {
    return customerOfferProcedureInitiateActionRecord;
  }

  public void setCustomerOfferProcedureInitiateActionRecord(Object customerOfferProcedureInitiateActionRecord) {
    this.customerOfferProcedureInitiateActionRecord = customerOfferProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Offer Procedure instance (e.g. initialised, pending, active) 
   * @return customerOfferProcedureInstanceStatus
  **/

  public String getCustomerOfferProcedureInstanceStatus() {
    return customerOfferProcedureInstanceStatus;
  }

  public void setCustomerOfferProcedureInstanceStatus(String customerOfferProcedureInstanceStatus) {
    this.customerOfferProcedureInstanceStatus = customerOfferProcedureInstanceStatus;
  }


  /**
   * Get customerOfferProcedureInstanceRecord
   * @return customerOfferProcedureInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecord getCustomerOfferProcedureInstanceRecord() {
    return customerOfferProcedureInstanceRecord;
  }

  public void setCustomerOfferProcedureInstanceRecord(CRCustomerOfferProcedureInitiateOutputModelCustomerOfferProcedureInstanceRecord customerOfferProcedureInstanceRecord) {
    this.customerOfferProcedureInstanceRecord = customerOfferProcedureInstanceRecord;
  }


  /**
   * Get productInstanceRecord
   * @return productInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateOutputModelProductInstanceRecord getProductInstanceRecord() {
    return productInstanceRecord;
  }

  public void setProductInstanceRecord(CRCustomerOfferProcedureInitiateOutputModelProductInstanceRecord productInstanceRecord) {
    this.productInstanceRecord = productInstanceRecord;
  }


  /**
   * Get disclosuresInstanceRecord
   * @return disclosuresInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateOutputModelDisclosuresInstanceRecord getDisclosuresInstanceRecord() {
    return disclosuresInstanceRecord;
  }

  public void setDisclosuresInstanceRecord(CRCustomerOfferProcedureInitiateOutputModelDisclosuresInstanceRecord disclosuresInstanceRecord) {
    this.disclosuresInstanceRecord = disclosuresInstanceRecord;
  }


  /**
   * Get creditInstanceRecord
   * @return creditInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateInputModelCreditInstanceRecord getCreditInstanceRecord() {
    return creditInstanceRecord;
  }

  public void setCreditInstanceRecord(CRCustomerOfferProcedureInitiateInputModelCreditInstanceRecord creditInstanceRecord) {
    this.creditInstanceRecord = creditInstanceRecord;
  }


  /**
   * Get underwritingInstanceRecord
   * @return underwritingInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateInputModelUnderwritingInstanceRecord getUnderwritingInstanceRecord() {
    return underwritingInstanceRecord;
  }

  public void setUnderwritingInstanceRecord(CRCustomerOfferProcedureInitiateInputModelUnderwritingInstanceRecord underwritingInstanceRecord) {
    this.underwritingInstanceRecord = underwritingInstanceRecord;
  }


  /**
   * Get complianceInstanceRecord
   * @return complianceInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateInputModelComplianceInstanceRecord getComplianceInstanceRecord() {
    return complianceInstanceRecord;
  }

  public void setComplianceInstanceRecord(CRCustomerOfferProcedureInitiateInputModelComplianceInstanceRecord complianceInstanceRecord) {
    this.complianceInstanceRecord = complianceInstanceRecord;
  }


  /**
   * Get auditInstanceRecord
   * @return auditInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateInputModelAuditInstanceRecord getAuditInstanceRecord() {
    return auditInstanceRecord;
  }

  public void setAuditInstanceRecord(CRCustomerOfferProcedureInitiateInputModelAuditInstanceRecord auditInstanceRecord) {
    this.auditInstanceRecord = auditInstanceRecord;
  }


  /**
   * Get collateralInstanceRecord
   * @return collateralInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateOutputModelCollateralInstanceRecord getCollateralInstanceRecord() {
    return collateralInstanceRecord;
  }

  public void setCollateralInstanceRecord(CRCustomerOfferProcedureInitiateOutputModelCollateralInstanceRecord collateralInstanceRecord) {
    this.collateralInstanceRecord = collateralInstanceRecord;
  }


  /**
   * Get bookingInstanceRecord
   * @return bookingInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateInputModelBookingInstanceRecord getBookingInstanceRecord() {
    return bookingInstanceRecord;
  }

  public void setBookingInstanceRecord(CRCustomerOfferProcedureInitiateInputModelBookingInstanceRecord bookingInstanceRecord) {
    this.bookingInstanceRecord = bookingInstanceRecord;
  }


  /**
   * Get correspondenceandDocumentsInstanceRecord
   * @return correspondenceandDocumentsInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateInputModelCorrespondenceandDocumentsInstanceRecord getCorrespondenceandDocumentsInstanceRecord() {
    return correspondenceandDocumentsInstanceRecord;
  }

  public void setCorrespondenceandDocumentsInstanceRecord(CRCustomerOfferProcedureInitiateInputModelCorrespondenceandDocumentsInstanceRecord correspondenceandDocumentsInstanceRecord) {
    this.correspondenceandDocumentsInstanceRecord = correspondenceandDocumentsInstanceRecord;
  }


  /**
   * Get agreementInstanceRecord
   * @return agreementInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateInputModelAgreementInstanceRecord getAgreementInstanceRecord() {
    return agreementInstanceRecord;
  }

  public void setAgreementInstanceRecord(CRCustomerOfferProcedureInitiateInputModelAgreementInstanceRecord agreementInstanceRecord) {
    this.agreementInstanceRecord = agreementInstanceRecord;
  }


  /**
   * Get productInitializationInstanceRecord
   * @return productInitializationInstanceRecord
  **/

  public CRCustomerOfferProcedureInitiateInputModelProductInitializationInstanceRecord getProductInitializationInstanceRecord() {
    return productInitializationInstanceRecord;
  }

  public void setProductInitializationInstanceRecord(CRCustomerOfferProcedureInitiateInputModelProductInitializationInstanceRecord productInitializationInstanceRecord) {
    this.productInitializationInstanceRecord = productInitializationInstanceRecord;
  }


}

