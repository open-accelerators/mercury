package com.redhat.mercury.myco.resources;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.redhat.mercury.model.state.ControlRecordState;
import com.redhat.mercury.myco.model.CustomerOfferProcedure;
import com.redhat.mercury.myco.services.impl.CustomerOfferService;
import com.redhat.mercury.myco.services.impl.ProcedureStoreService;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import io.restassured.common.mapper.TypeRef;
import io.smallrye.mutiny.Multi;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@QuarkusTest
class MyCOReportingResourceTest {

    @InjectMock
    ProcedureStoreService store;

    @Test
    void testRetrieveEmpty() {
        when(store.list()).thenReturn(Multi.createFrom().empty());

        given().when()
                .get("/customer-offer/reports/procedures")
                .then()
                .assertThat()
                .statusCode(200)
                .body("$.size()", is(0));

        verify(store, Mockito.times(1)).list();
    }

    @Test
    void testRetrieve() {
        Collection<CustomerOfferProcedure> states = Arrays.asList(
                CustomerOfferProcedure.builder().id(1)
                        .customerReference("customer-ref-01")
                        .status(ControlRecordState.INITIATED)
                        .build(),
                CustomerOfferProcedure.builder().id(2)
                        .customerReference("customer-ref-02")
                        .status(ControlRecordState.INITIATED)
                        .build(),
                CustomerOfferProcedure.builder().id(3)
                        .customerReference("customer-ref-03")
                        .status(ControlRecordState.COMPLETED)
                        .build(),
                CustomerOfferProcedure.builder().id(4)
                        .customerReference("customer-ref-04")
                        .status(ControlRecordState.COMPLETED)
                        .build()
        );

        when(store.list()).thenReturn(Multi.createFrom().items(states.stream()));

        Collection<CustomerOfferProcedure> results = given().when()
                .get("/customer-offer/reports/procedures")
                .then()
                .assertThat()
                .statusCode(200)
                .extract().body().as(new TypeRef<>() {
                });

        verify(store, Mockito.times(1)).list();
        assertThat(results)
                .hasSize(states.size())
                .containsExactlyInAnyOrderElementsOf(states);
    }
}
