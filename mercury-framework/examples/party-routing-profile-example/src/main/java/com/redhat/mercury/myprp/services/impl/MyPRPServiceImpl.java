package com.redhat.mercury.myprp.services.impl;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.partyroutingprofile.CaptureStatusResponseOuterClass.CaptureStatusResponse;
import com.redhat.mercury.partyroutingprofile.StatusOuterClass.Status;
import com.redhat.mercury.partyroutingprofile.com.redhat.mercury.partyroutingprofile.api.bqstatusservice.BqStatusService.CaptureStatusRequest;
import com.redhat.mercury.partyroutingprofile.RetrieveStatusResponseOuterClass.RetrieveStatusResponse;
import com.redhat.mercury.partyroutingprofile.com.redhat.mercury.partyroutingprofile.api.bqstatusservice.BqStatusService.RetrieveStatusRequest;
import com.redhat.mercury.partyroutingprofile.UpdateStatusResponseOuterClass.UpdateStatusResponse;
import com.redhat.mercury.partyroutingprofile.com.redhat.mercury.partyroutingprofile.api.bqstatusservice.BqStatusService.UpdateStatusRequest;
import com.redhat.mercury.myprp.model.PartyRoutingState;
import com.redhat.mercury.partyroutingprofile.com.redhat.mercury.partyroutingprofile.api.bqstatusservice.BQStatusService;

import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

@GrpcService
public class MyPRPServiceImpl implements BQStatusService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyPRPServiceImpl.class);

    @Inject
    PartyRoutingService svc;

    @Override
    public Uni<CaptureStatusResponse> captureStatus(CaptureStatusRequest request) {
        return Uni.createFrom().failure(new UnsupportedOperationException("not implemented"));
    }

    @Override
    public Uni<RetrieveStatusResponse> retrieveStatus(RetrieveStatusRequest request) {
        return Uni.createFrom().item(() -> {
            String prpId = request.getPartyroutingprofileId();
            LOGGER.info("Retrieving party state status for {}", prpId);
            if (prpId != null) {
                PartyRoutingState state = svc.getState(prpId);
                if (state == null) {
                    return null;
                }
                return RetrieveStatusResponse.newBuilder()
                        .setStatus(Status.newBuilder()
                                .setCustomerRelationshipStatus(prpId)
                                .build())
                        .build();
            }
            return null;
        });
    }

    @Override
    public Uni<UpdateStatusResponse> updateStatus(UpdateStatusRequest request) {
        return Uni.createFrom().failure(new UnsupportedOperationException("not implemented"));
    }
}
