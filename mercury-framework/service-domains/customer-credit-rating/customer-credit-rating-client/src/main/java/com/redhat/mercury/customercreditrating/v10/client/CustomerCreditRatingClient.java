package com.redhat.mercury.customercreditrating.v10.client;

import javax.enterprise.context.ApplicationScoped;

import com.redhat.mercury.customercreditrating.v10.api.bqalertsservice.BQAlertsService;
import com.redhat.mercury.customercreditrating.v10.api.bqexternalreportingservice.BQExternalReportingService;
import com.redhat.mercury.customercreditrating.v10.api.bqinternalreportingservice.BQInternalReportingService;
import com.redhat.mercury.customercreditrating.v10.api.crcustomercreditratingstateservice.CRCustomerCreditRatingStateService;

import io.quarkus.grpc.GrpcClient;

@ApplicationScoped
public class CustomerCreditRatingClient {

    @GrpcClient("customer-credit-rating-bq-alerts")
    BQAlertsService bqAlertsService;

    @GrpcClient("customer-credit-rating-bq-external-reporting")
    BQExternalReportingService bqExternalReportingService;

    @GrpcClient("customer-credit-rating-bq-internal-reporting")
    BQInternalReportingService bqInternalReportingService;

    @GrpcClient("customer-credit-rating-cr-customer-credit-rating-state")
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
