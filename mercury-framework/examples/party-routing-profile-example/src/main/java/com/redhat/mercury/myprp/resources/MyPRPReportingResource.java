package com.redhat.mercury.myprp.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.redhat.mercury.model.state.ControlRecordState;
import com.redhat.mercury.myprp.model.PartyRoutingState;
import com.redhat.mercury.myprp.services.impl.PartyRoutingService;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

@Path("/party-routing-profile/")
public class MyPRPReportingResource {

    @Inject
    PartyRoutingService svc;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Multi<PartyRoutingState> list() {
        return Multi.createFrom().items(svc.getAll().stream())
                .onItem().transform(i -> new PartyRoutingState()
                        .setReferenceId(i)
                        .setStatus(ControlRecordState.PROCESSING));
    }

    @GET
    @Path("/{referenceId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<PartyRoutingState> retrieve(@PathParam("referenceId") String referenceId) {
        return Uni.createFrom()
                .item(referenceId)
                .onItem()
                .transform(i -> svc.getState(i))
                .onItem()
                .ifNull()
                .failWith(new StatusRuntimeException(Status.NOT_FOUND));
    }
}
