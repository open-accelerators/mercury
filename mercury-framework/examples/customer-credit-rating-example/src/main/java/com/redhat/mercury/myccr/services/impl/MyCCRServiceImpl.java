package com.redhat.mercury.myccr.services.impl;

import java.util.Map;

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

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

@GrpcService
public class MyCCRServiceImpl implements CRCustomerCreditRatingStateService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyCCRServiceImpl.class);
    private static final Map<String, Integer> RATINGS = Map.of(
            "bob", 600,
            "jane", 802,
            "anna", 760,
            "frank", 500);

    @Override
    public Uni<ExecuteCustomerCreditRatingStateResponse> execute(ExecuteRequest request) {
        return Uni.createFrom().failure(new StatusRuntimeException(Status.UNIMPLEMENTED));
    }

    @Override
    public Uni<InitiateCustomerCreditRatingStateResponse> initiate(InitiateRequest request) {
        return Uni.createFrom().failure(new StatusRuntimeException(Status.UNIMPLEMENTED));
    }

    @Override
    public Uni<RequestCustomerCreditRatingStateResponse> request(RequestRequest request) {
        return Uni.createFrom().failure(new StatusRuntimeException(Status.UNIMPLEMENTED));
    }

    @Override
    public Uni<RetrieveCustomerCreditRatingStateResponse> retrieve(RetrieveRequest request) {
        LOGGER.info("Retrieve received");
        return Uni.createFrom().item(request).onItem()
                .transform(r -> RATINGS.get(r.getCustomercreditratingId()))
                .onItem()
                .ifNull()
                .failWith(() -> new StatusRuntimeException(Status.NOT_FOUND))
                .onItem()
                .transform(rating -> RetrieveCustomerCreditRatingStateResponse.newBuilder()
                        .setCustomerCreditRatingState(RetrieveCustomerCreditRatingStateResponseCustomerCreditRatingState.newBuilder()
                                .setCreditRatingAssessmentResult(rating.toString())
                                .build())
                        .build());
    }
}
