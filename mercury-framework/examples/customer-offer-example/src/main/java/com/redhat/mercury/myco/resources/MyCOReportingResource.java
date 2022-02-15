package com.redhat.mercury.myco.resources;

import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.redhat.mercury.customeroffer.v10.CustomerOfferProcedureOuterClass.CustomerOfferProcedure;
import com.redhat.mercury.myco.services.impl.CustomerOfferService;

@Path("/customer-offer/reports")
public class MyCOReportingResource {

    @Inject
    CustomerOfferService svc;

    @GET
    @Path("/procedures")
    @Produces(MediaType.APPLICATION_JSON)
    public Map<Integer, CustomerOfferProcedure> getAll() { return svc.getProcedures(); }
}
