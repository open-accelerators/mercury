package com.redhat.mercury.camel;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.bian.protobuf.BindingService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.redhat.mercury.customeroffer.CustomerOfferProcedureOuterClass.CustomerOfferProcedure;
import com.redhat.mercury.customeroffer.InitiateCustomerOfferProcedureResponseOuterClass.InitiateCustomerOfferProcedureResponse;
import com.redhat.mercury.customeroffer.com.redhat.mercury.customeroffer.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.InitiateRequest;
import com.redhat.mercury.customeroffer.com.redhat.mercury.customeroffer.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.UpdateRequest;
import com.redhat.mercury.customeroffer.model.CRCustomerOfferProcedureInitiateInputModel;
import com.redhat.mercury.customeroffer.model.CRCustomerOfferProcedureRetrieveOutputModel;
import com.redhat.mercury.customeroffer.model.CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceRecord1;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.path.json.JsonPath;
import io.smallrye.mutiny.Uni;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@QuarkusTest
class CamelRouteTest {

    @Inject
    CamelContext camelContext;

    @Inject
    MockCustomerOfferService customerOfferService;

    @Test
    void testCommandRoute() throws Exception {
        camelContext.addRoutes(new RouteBuilder() {

            @Override
            public void configure() {
                rest("/customer-offer/{sdReferenceId}/customer-offer-procedure/initiation")
                        .post()
                        .consumes("application/json")
                        .route()
                        .setHeader("serviceDomainName", constant(CustomerOffer.DOMAIN_NAME))
                        .setHeader("cloudEventType", constant(CustomerOffer.CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE))
                        .bean(CloudEventBuilder.class, "build")
                        .bean(BindingService.class, "command")
                        .setBody(constant(""))
                        .setHeader("CamelHttpResponseCode", constant(202));
            }
        });
        camelContext.start();

        given().body("{\n" +
                        "  \"customerOfferProcedureInstanceRecord\" : {\n" +
                        "    \"customerReference\" : \"foo\"\n" +
                        "  }\n" +
                        "}")
                .contentType("application/json")
                .post("/customer-offer/sd-001/customer-offer-procedure/initiation")
                .then()
                .statusCode(202);

        verify(customerOfferService.mock, times(1))
                .initiateCustomerOfferProcedure(any(CRCustomerOfferProcedureInitiateInputModel.class));
    }

    @Test
    void testQueryRoute() throws Exception {
        String sdRef = "sd-001";
        String crRef = "cr-001";

        when(customerOfferService.mock.retrieveCustomerOffer(sdRef, crRef)).thenReturn(Uni.createFrom().item(() -> {
                    CRCustomerOfferProcedureRetrieveOutputModel output = new CRCustomerOfferProcedureRetrieveOutputModel();
                    output.setCustomerOfferProcedureRetrieveActionResponse("response");
                    CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceRecord1 record = new CRCustomerOfferProcedureRetrieveOutputModelCustomerOfferProcedureInstanceRecord1();
                    record.setCustomerReference("foo");
                    record.setPartyReference("party");
                    output.setCustomerOfferProcedureInstanceRecord(record);
                    return output;
                }
        ));
        camelContext.addRoutes(new RouteBuilder() {

            @Override
            public void configure() {
                rest("/customer-offer/{sdReferenceId}/customer-offer-procedure/{crReferenceId}")
                        .get()
                        .produces("application/json")
                        .route()
                        .setHeader("serviceDomainName", constant(CustomerOffer.DOMAIN_NAME))
                        .setHeader("cloudEventType", constant(CustomerOffer.CUSTOMER_OFFER_PROCEDURE_RETRIEVE_TYPE))
                        .bean(CloudEventBuilder.class, "build")
                        .bean(BindingService.class, "query")
                        .removeHeader("cloudEventType")
                        .removeHeader("serviceDomainName")
                        // in camel-k extracts from Uni<CloudEvent> automagically
                        .bean(UniExtractor.class, "extract")
                        .bean(CloudEventPrinter.class, "print");
            }
        });

        camelContext.start();

        JsonPath jsonPath = given()
                .get(String.format("/customer-offer/%s/customer-offer-procedure/%s", sdRef, crRef))
                .then()
                .statusCode(200)
                .extract()
                .body()
                .jsonPath();

        assertThat(jsonPath.getString("customerOfferProcedureInstanceRecord.customerReference")).isEqualTo("foo");
        assertThat(jsonPath.getString("customerOfferProcedureInstanceRecord.partyReference")).isEqualTo("party");
        verify(customerOfferService.mock, times(1))
                .retrieveCustomerOffer(sdRef, crRef);
    }

    @Singleton
    public static class MockCustomerOfferService extends CustomerOfferService {

        private final CustomerOfferService mock = Mockito.mock(CustomerOfferService.class);

        @Override
        public Uni<InitiateCustomerOfferProcedureResponse> initiate(InitiateRequest request) {
            return mock.initiate(request);
        }

        @Override
        public Uni<CustomerOfferProcedure> update(UpdateRequest request) {
            return mock.update(request);
        }

    }
}
