package com.redhat.mercury.ccr.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.redhat.mercury.ccr.demo.beans.CreditRating;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/creditratings")
public class CreditRatingResource {

    private Map<String, CreditRating> ratings = new HashMap<>();

    /**
     * Gets a list of all `CreditRating` entities.
     */
    @GET
    public CompletionStage<Collection<CreditRating>> list() {
        return CompletableFuture.supplyAsync(() -> ratings.values());
    }

    /**
     * Creates a new instance of a `CreditRating`.
     */
    @POST
    public void create(CreditRating data) {
        CompletableFuture.supplyAsync(() -> ratings.put(data.getTin(), data));
    }

    /**
     * Gets the details of a single instance of a `CreditRating`.
     */
    @Path("{tin}")
    @GET
    public CompletionStage<CreditRating> get(@PathParam("tin") String tin) {
        return CompletableFuture.supplyAsync(() -> {
            if (ratings.containsKey(tin)) {
                return ratings.get(tin);
            }
            throw new NotFoundException(tin);
        });
    }

    /**
     * Updates an existing `CreditRating`.
     */
    @Path("{tin}")
    @PUT
    public void update(@PathParam("tin") String tin, CreditRating data) {
        CompletableFuture.supplyAsync(() -> {
            if (ratings.containsKey(tin)) {
                ratings.put(tin, data);
            }
            throw new NotFoundException(tin);
        });
    }

    /**
     * Deletes an existing `CreditRating`.
     */
    @Path("{tin}")
    @DELETE
    public void delete(@PathParam("tin") String tin) {
        CompletableFuture.supplyAsync(() -> ratings.remove(tin));
    }
}
