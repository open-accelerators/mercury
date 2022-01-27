package com.redhat.mercury.customercreditrating.services.client;

import javax.enterprise.context.ApplicationScoped;

import com.redhat.mercury.customercreditrating.com.redhat.mercury.customercreditrating.api.bqalertsservice.BQAlertsService;
import com.redhat.mercury.customercreditrating.com.redhat.mercury.customercreditrating.api.bqexternalreportingservice.BQExternalReportingService;
import com.redhat.mercury.customercreditrating.com.redhat.mercury.customercreditrating.api.bqinternalreportingservice.BQInternalReportingService;
import com.redhat.mercury.customercreditrating.com.redhat.mercury.customercreditrating.api.crcustomercreditratingstateservice.CRCustomerCreditRatingStateService;

import io.quarkus.grpc.GrpcClient;

@ApplicationScoped
public class CustomerCreditRatingClient {

    @GrpcClient("customer-credit-rating-bq-alert")
    BQAlertsService bqAlertsService;

    @GrpcClient("customer-credit-rating-bq-external-reporting")
    BQExternalReportingService bqExternalReportingService;

    @GrpcClient("customer-credit-rating-bq-internal-reporting")
    BQInternalReportingService bqInternalReportingService;

    @GrpcClient("customer-credit-rating-bq-customer-credit-rating-state")
    CRCustomerCreditRatingStateService crCustomerCreditRatingStateService;

    public BQAlertsService getBqAlertsService() {
        return bqAlertsService;
    }
    public BQExternalReportingService getBqExternalReportingService() {
        return bqExternalReportingService;
    }

    public BQInternalReportingService getBqInternalReportingService() {
        return bqInternalReportingService;
    }

    public CRCustomerCreditRatingStateService getCrCustomerCreditRatingStateService() {
        return crCustomerCreditRatingStateService;
    }

}
