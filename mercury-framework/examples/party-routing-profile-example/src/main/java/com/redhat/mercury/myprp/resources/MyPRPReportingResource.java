package com.redhat.mercury.myprp.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.redhat.mercury.myprp.services.impl.PartyRoutingService;

@Path("/party-routing-profile/reports")
public class MyPRPReportingResource {

    @Inject
    PartyRoutingService svc;

    @GET
    @Path("/ids")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllKeys() {
        return Response.ok(svc.getAll()).build();
    }
}
