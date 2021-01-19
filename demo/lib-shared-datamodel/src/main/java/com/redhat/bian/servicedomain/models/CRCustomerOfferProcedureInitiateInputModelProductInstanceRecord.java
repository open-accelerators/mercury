package com.redhat.bian.servicedomain.models;

/**
 * CRCustomerOfferProcedureInitiateInputModelProductInstanceRecord
 */
public class CRCustomerOfferProcedureInitiateInputModelProductInstanceRecord   {
  private String productOptionSelection = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The option setting as agreed/defined with the customer 
   * @return productOptionSelection
  **/

  public String getProductOptionSelection() {
    return productOptionSelection;
  }

  public void setProductOptionSelection(String productOptionSelection) {
    this.productOptionSelection = productOptionSelection;
  }


}

