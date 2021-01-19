package com.redhat.bian.servicedomain.models;

/**
 * CRCustomerOfferProcedureInitiateInputModelAgreementInstanceRecord
 */
public class CRCustomerOfferProcedureInitiateInputModelAgreementInstanceRecord   {
  private String customerAgreementInstanceReference = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FYsVBcTGEeChad0JzLk7QA_-1076024413  bian-reference: CustomerAgreement  general-info: Reference to the associated master agreement that is accessed during the offer procedure 
   * @return customerAgreementInstanceReference
  **/

  public String getCustomerAgreementInstanceReference() {
    return customerAgreementInstanceReference;
  }

  public void setCustomerAgreementInstanceReference(String customerAgreementInstanceReference) {
    this.customerAgreementInstanceReference = customerAgreementInstanceReference;
  }


}

