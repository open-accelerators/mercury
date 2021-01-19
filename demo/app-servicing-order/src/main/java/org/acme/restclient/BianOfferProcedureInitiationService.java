package org.acme.restclient;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;


@RegisterRestClient

public interface BianOfferProcedureInitiationService {

    @POST
    @Path("/customer-offer/SD2324/customer-offer-procedure/initiation")
    @Consumes("application/json")
    String initiateOffer(String body);




}
