package com.redhat.mercury.partyroutingprofile.v10.client;

import javax.enterprise.context.ApplicationScoped;

import com.redhat.mercury.partyroutingprofile.v10.api.bqalertservice.BQAlertService;
import com.redhat.mercury.partyroutingprofile.v10.api.bqratingservice.BQRatingService;
import com.redhat.mercury.partyroutingprofile.v10.api.bqstatusservice.BQStatusService;
import com.redhat.mercury.partyroutingprofile.v10.api.crpartystateservice.CRPartyStateService;

import io.quarkus.grpc.GrpcClient;

@ApplicationScoped
public class PartyRoutingProfileClient {

    @GrpcClient("party-routing-profile-bq-alert")
    BQAlertService bqAlertService;

    @GrpcClient("party-routing-profile-bq-rating")
    BQRatingService bqRatingService;

    @GrpcClient("party-routing-profile-bq-status")
    BQStatusService bqStatusService;

    @GrpcClient("party-routing-profile-cr-party-state")
    CRPartyStateService crPartyStateService;

    public BQAlertService getBqAlertService() {
        return bqAlertService;
    }

    public BQRatingService getBqRatingService() {
        return bqRatingService;
    }

    public BQStatusService getBqStatusService() {
        return bqStatusService;
    }

    public CRPartyStateService getCrPartyStateService() {
        return crPartyStateService;
    }
}
