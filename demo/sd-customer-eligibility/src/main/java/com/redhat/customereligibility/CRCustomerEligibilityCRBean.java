package com.redhat.customereligibility;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

import java.util.Date;
/*
    Persist Customer Eligibility
 */
@Component
public class CRCustomerEligibilityCRBean {

    public CustomerEligibilityCRModel setCustomerEligibilityCRModel(Exchange exchange) {

        String customerReference = (String) exchange.getProperty("customerReference");
        Date crDate = (Date) exchange.getProperty("exchangeDate");
        String productType = (String) exchange.getProperty("productUsage");
        String eligibility = (String) exchange.getProperty("eligibility");
        String crNo = (String) exchange.getProperty("crNumber");
        CustomerEligibilityCRModel customerEligibilityCRModel = null;

        customerEligibilityCRModel = new CustomerEligibilityCRModel();
        customerEligibilityCRModel.setCustomerReference(customerReference);
        customerEligibilityCRModel.setCustomerProductServiceTypeEligibility(eligibility);
        customerEligibilityCRModel.setProductServiceType(productType);
        customerEligibilityCRModel.setEligibilityDate(crDate);
        customerEligibilityCRModel.setCrNumber(crNo);

        System.out.println(customerEligibilityCRModel.getCustomerProductServiceTypeEligibility()+customerEligibilityCRModel.getCustomerReference());
        return customerEligibilityCRModel;
    }

}
