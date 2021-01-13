package com.redhat.bian.servicedomain.models;

/**
 * CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord
 */
public class CRProductDirectoryEntryRegisterInputModelProductDirectoryEntryInstanceRecord {
  private String productVersion = null;

  private String productDirectoryEntryConfiguration = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current version of the product referenced in the directory 
   * @return productVersion
  **/

  public String getProductVersion() {
    return productVersion;
  }

  public void setProductVersion(String productVersion) {
    this.productVersion = productVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any configuration settings for the directory entry (e.g. generally available, provisional) 
   * @return productDirectoryEntryConfiguration
  **/

  public String getProductDirectoryEntryConfiguration() {
    return productDirectoryEntryConfiguration;
  }

  public void setProductDirectoryEntryConfiguration(String productDirectoryEntryConfiguration) {
    this.productDirectoryEntryConfiguration = productDirectoryEntryConfiguration;
  }


}

