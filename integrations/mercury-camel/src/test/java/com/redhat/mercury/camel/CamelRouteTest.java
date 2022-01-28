package com.redhat.mercury.camel;

import javax.inject.Inject;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.protobuf.ProtobufDataFormat;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.google.protobuf.util.JsonFormat;
import com.redhat.mercury.customeroffer.v10.InitiateCustomerOfferProcedureResponseOuterClass.InitiateCustomerOfferProcedureResponse;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CRCustomerOfferProcedureService;
import com.redhat.mercury.customeroffer.v10.api.crcustomerofferprocedureservice.CrCustomerOfferProcedureService.InitiateRequest;

import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class CamelRouteTest {

    @Inject
    CamelContext camelContext;

    @Test
    @Disabled
    void testCommandRoute() throws Exception {

        ProtobufDataFormat initiateDataFormat = new ProtobufDataFormat(InitiateRequest.getDefaultInstance(),
                ProtobufDataFormat.CONTENT_TYPE_FORMAT_JSON);

        ProtobufDataFormat responseDataFormat = new ProtobufDataFormat(InitiateCustomerOfferProcedureResponse.getDefaultInstance(),
                ProtobufDataFormat.CONTENT_TYPE_FORMAT_JSON);

        camelContext.addRoutes(new RouteBuilder() {

            @Override
            public void configure() {
                rest("/CustomerOffer/Initiate")
                        .post()
                        .consumes("application/json")
                        .route()
                        .unmarshal()
                        .protobuf(InitiateRequest.getDefaultInstance(), ProtobufDataFormat.CONTENT_TYPE_FORMAT_JSON)
                        .to("grpc://localhost:9000/" + CRCustomerOfferProcedureService.class.getName() + "?method=Initiate&synchronous=true")
                        .marshal()
                        .protobuf(InitiateCustomerOfferProcedureResponse.getDefaultInstance(), ProtobufDataFormat.CONTENT_TYPE_FORMAT_JSON);
            }
        });
        camelContext.start();

        String result = given().body("{\n" +
                        "  \"CustomerOfferProcedure\" : {\n" +
                        "    \"CustomerReference\" : \"foo\"\n" +
                        "  }\n" +
                        "}")
                .contentType("application/json")
                .post("/CustomerOffer/Initiate")
                .then()
                .statusCode(200).extract().body().asPrettyString();

        InitiateCustomerOfferProcedureResponse.Builder builder = InitiateCustomerOfferProcedureResponse.newBuilder();
        JsonFormat.parser().merge(result, builder);
        InitiateCustomerOfferProcedureResponse response = builder.build();
        assertThat(response.getCustomerOfferProcedure().getCustomerOfferProcessingTaskResult()).isEqualTo("example");
    }

}
