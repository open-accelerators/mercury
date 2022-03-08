package com.redhat.mercury.myco.resources;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.redhat.mercury.myco.model.CustomerOfferState;
import com.redhat.mercury.myco.services.impl.CustomerOfferService;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import io.restassured.common.mapper.TypeRef;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@QuarkusTest
class MyCOReportingResourceTest {

    @InjectMock
    CustomerOfferService svc;

    @Test
    void testRetrieveEmpty() {
        when(svc.getStates())
                .thenReturn(Collections.emptyList());

        given().when()
                .get("/customer-offer/reports/procedures")
                .then()
                .assertThat()
                .statusCode(200)
                .body("$.size()", is(0));

        verify(svc, Mockito.times(1)).getStates();
    }

    @Test
    void testRetrieve() {
        Collection<CustomerOfferState> states = Arrays.asList(
                CustomerOfferState.builder().id(1)
                        .customerReference("customer-ref-01")
                        .status(CustomerOfferService.INITIATED_STATUS)
                        .build(),
                CustomerOfferState.builder().id(2)
                        .customerReference("customer-ref-02")
                        .status(CustomerOfferService.INITIATED_STATUS)
                        .build(),
                CustomerOfferState.builder().id(3)
                        .customerReference("customer-ref-03")
                        .status(CustomerOfferService.COMPLETED_STATUS)
                        .build(),
                CustomerOfferState.builder().id(4)
                        .customerReference("customer-ref-04")
                        .status(CustomerOfferService.COMPLETED_STATUS)
                        .build()
        );

        when(svc.getStates())
                .thenReturn(states);

        Collection results = given().when()
                .get("/customer-offer/reports/procedures")
                .then()
                .assertThat()
                .statusCode(200)
                .extract().body().as(new TypeRef<Collection<CustomerOfferState>>() {
                });

        verify(svc, Mockito.times(1)).getStates();
        assertThat(results)
                .hasSize(states.size())
                .containsExactlyInAnyOrderElementsOf(states);
    }
}
