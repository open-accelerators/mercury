package com.redhat.mercury.myprp.services.impl;

import javax.inject.Inject;

import com.redhat.mercury.partyroutingprofile.v10.CaptureStatusResponseOuterClass.CaptureStatusResponse;
import com.redhat.mercury.partyroutingprofile.v10.RetrieveStatusResponseOuterClass.RetrieveStatusResponse;
import com.redhat.mercury.partyroutingprofile.v10.UpdateStatusRequestStatusOuterClass.UpdateStatusRequestStatus;
import com.redhat.mercury.partyroutingprofile.v10.UpdateStatusResponseOuterClass.UpdateStatusResponse;
import com.redhat.mercury.partyroutingprofile.v10.api.bqstatusservice.BQStatusService;
import com.redhat.mercury.partyroutingprofile.v10.api.bqstatusservice.BqStatusService.CaptureStatusRequest;
import com.redhat.mercury.partyroutingprofile.v10.api.bqstatusservice.BqStatusService.RetrieveStatusRequest;
import com.redhat.mercury.partyroutingprofile.v10.api.bqstatusservice.BqStatusService.UpdateStatusRequest;

import io.grpc.StatusRuntimeException;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

import static io.grpc.Status.NOT_FOUND;

@GrpcService
public class MyPRPServiceImpl implements BQStatusService {

    @Inject
    PartyRoutingService svc;
    
    @Override
    public Uni<RetrieveStatusResponse> retrieveStatus(RetrieveStatusRequest request) {
        return Uni.createFrom().item(request)
                .onItem()
                .transform(item -> svc.getState(item.getPartyroutingprofileId()))
                .onItem()
                .ifNull()
                .failWith(new StatusRuntimeException(NOT_FOUND))
                .onItem()
                .transform(item -> RetrieveStatusResponse.newBuilder()
                        .setStatus(UpdateStatusRequestStatus.newBuilder()
                                .setCustomerRelationshipStatusNarrative(item.getStatus())
                                .build())
                        .build());
    }

    @Override
    public Uni<CaptureStatusResponse> captureStatus(CaptureStatusRequest request) {
        return Uni.createFrom().failure(new StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED));
    }

    @Override
    public Uni<UpdateStatusResponse> updateStatus(UpdateStatusRequest request) {
        return Uni.createFrom().failure(new StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED));
    }
}
