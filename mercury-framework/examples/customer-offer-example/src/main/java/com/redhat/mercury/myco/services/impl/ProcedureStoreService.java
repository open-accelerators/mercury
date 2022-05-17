package com.redhat.mercury.myco.services.impl;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import com.redhat.mercury.myco.model.CustomerOfferProcedure;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class ProcedureStoreService {

    private Integer id = 0;
    private Map<Integer, CustomerOfferProcedure> procedures = new HashMap<>();

    public Uni<CustomerOfferProcedure> get(Integer procedureId) {
        return Uni.createFrom()
                .item(procedureId)
                .onItem()
                .transform(id -> procedures.get(id))
                .onItem()
                .ifNull()
                .failWith(new StatusRuntimeException(Status.NOT_FOUND));
    }

    public Uni<CustomerOfferProcedure> create(String customerRef, String status) {
        return Uni.createFrom()
                .item(id++)
                .onItem()
                .transform(id -> CustomerOfferProcedure.builder()
                        .id(id)
                        .status(status)
                        .customerReference(customerRef)
                        .build())
                .invoke(procedure -> procedures.put(procedure.getId(), procedure));
    }

    public Uni<CustomerOfferProcedure> update(CustomerOfferProcedure state) {
        return Uni.createFrom()
                .item(state)
                .onItem()
                .transform(s -> procedures.get(s.getId()))
                .onItem()
                .ifNull()
                .failWith(new StatusRuntimeException(Status.NOT_FOUND))
                .onItem()
                .invoke(s -> procedures.put(s.getId(), state))
                .onItem()
                .transform(s -> state);
    }

    public Multi<CustomerOfferProcedure> list() {
        return Multi.createFrom()
                .items(procedures.values().stream());
    }
}
