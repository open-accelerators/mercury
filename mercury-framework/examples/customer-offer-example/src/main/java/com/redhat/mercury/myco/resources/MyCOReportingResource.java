package com.redhat.mercury.myco.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.redhat.mercury.myco.model.CustomerOfferProcedure;
import com.redhat.mercury.myco.services.impl.ProcedureStoreService;

import io.smallrye.mutiny.Multi;

@Path("/customer-offer/reports")
public class MyCOReportingResource {

    @Inject
    ProcedureStoreService svc;

    @GET
    @Path("/procedures")
    @Produces(MediaType.APPLICATION_JSON)
    public Multi<CustomerOfferProcedure> getAll() {
        return svc.list();
    }
}
