package com.redhat.mercury.myccr.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.customercreditrating.v10.ExecuteCustomerCreditRatingStateResponseOuterClass.ExecuteCustomerCreditRatingStateResponse;
import com.redhat.mercury.customercreditrating.v10.InitiateCustomerCreditRatingStateResponseOuterClass.InitiateCustomerCreditRatingStateResponse;
import com.redhat.mercury.customercreditrating.v10.RequestCustomerCreditRatingStateResponseOuterClass.RequestCustomerCreditRatingStateResponse;
import com.redhat.mercury.customercreditrating.v10.RetrieveCustomerCreditRatingStateResponseCustomerCreditRatingStateOuterClass.RetrieveCustomerCreditRatingStateResponseCustomerCreditRatingState;
import com.redhat.mercury.customercreditrating.v10.RetrieveCustomerCreditRatingStateResponseOuterClass.RetrieveCustomerCreditRatingStateResponse;
import com.redhat.mercury.customercreditrating.v10.api.crcustomercreditratingstateservice.CRCustomerCreditRatingStateService;
import com.redhat.mercury.customercreditrating.v10.api.crcustomercreditratingstateservice.CrCustomerCreditRatingStateService.ExecuteRequest;
import com.redhat.mercury.customercreditrating.v10.api.crcustomercreditratingstateservice.CrCustomerCreditRatingStateService.InitiateRequest;
import com.redhat.mercury.customercreditrating.v10.api.crcustomercreditratingstateservice.CrCustomerCreditRatingStateService.RequestRequest;
import com.redhat.mercury.customercreditrating.v10.api.crcustomercreditratingstateservice.CrCustomerCreditRatingStateService.RetrieveRequest;

import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

@GrpcService
public class MyCCRServiceImpl implements CRCustomerCreditRatingStateService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyCCRServiceImpl.class);
    private static final String FIXED_RATING = "802";

    @Override
    public Uni<ExecuteCustomerCreditRatingStateResponse> execute(ExecuteRequest request) {
        return Uni.createFrom().failure(new UnsupportedOperationException("not implemented"));
    }

    @Override
    public Uni<InitiateCustomerCreditRatingStateResponse> initiate(InitiateRequest request) {
        return Uni.createFrom().failure(new UnsupportedOperationException("not implemented"));
    }

    @Override
    public Uni<RequestCustomerCreditRatingStateResponse> request(RequestRequest request) {
        return Uni.createFrom().failure(new UnsupportedOperationException("not implemented"));
    }

    @Override
    public Uni<RetrieveCustomerCreditRatingStateResponse> retrieve(RetrieveRequest request) {
        LOGGER.info("Retrieve received");
        return Uni.createFrom().item(() -> RetrieveCustomerCreditRatingStateResponse.newBuilder()
                .setCustomerCreditRatingState(RetrieveCustomerCreditRatingStateResponseCustomerCreditRatingState.newBuilder()
                        .setCreditRatingAssessmentResult(FIXED_RATING)
                        .build())
                .build()
        );
    }
}
