package org.acme.restclient;

import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;



@RegisterRestClient

public interface BianEligibilityService {

    @POST
    @Path("/customer-product-service-eligibility/SD2324/customer-eligibility-assessment/evaluation")
    @Consumes("application/json")
    String checkEligibility(String body);




}
