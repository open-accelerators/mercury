package com.redhat.bian.servicedomain.models;

/**
 * CRCustomerOfferProcedureInitiateInputModelCorrespondenceandDocumentsInstanceRecord
 */
public class CRCustomerOfferProcedureInitiateInputModelCorrespondenceandDocumentsInstanceRecord   {
  private String customerOfferRequiredDocuments = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNET28TGEeChad0JzLk7QA_1924783636  bian-reference: Document  general-info: Description of the required documents and time limits on receipt where appropriate 
   * @return customerOfferRequiredDocuments
  **/

  public String getCustomerOfferRequiredDocuments() {
    return customerOfferRequiredDocuments;
  }

  public void setCustomerOfferRequiredDocuments(String customerOfferRequiredDocuments) {
    this.customerOfferRequiredDocuments = customerOfferRequiredDocuments;
  }


}

