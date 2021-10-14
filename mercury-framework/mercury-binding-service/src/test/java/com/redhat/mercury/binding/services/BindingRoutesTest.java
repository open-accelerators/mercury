package com.redhat.mercury.binding.services;

import javax.inject.Inject;

import org.apache.camel.CamelContext;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import com.redhat.mercury.binding.model.k8s.ServiceDomainBinding;
import com.redhat.mercury.binding.test.Profiles.KafkaIntegrationProfile;

import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinition;
import io.fabric8.kubernetes.client.dsl.base.CustomResourceDefinitionContext;
import io.fabric8.kubernetes.client.server.mock.KubernetesServer;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import io.quarkus.test.kubernetes.client.KubernetesTestServer;
import io.quarkus.test.kubernetes.client.WithKubernetesTestServer;

@QuarkusTest
@TestProfile(KafkaIntegrationProfile.class)
@WithKubernetesTestServer
class BindingRoutesTest {

    private static final String MY_DOMAIN = "foo-service-domain";

    private static final String SD_REF_ID = "the-sd-ref";
    private static final String CR_REF_ID = "the-cr-ref";
    private static final String BQ_REF_ID = "the-bq-ref";

    @KubernetesTestServer
    KubernetesServer kServer;

    @Inject
    CamelContext camel;

    @BeforeEach
    void createCrd() {
        final CustomResourceDefinition context = CustomResourceDefinitionContext
                .v1CRDFromCustomResourceType(ServiceDomainBinding.class)
                .build();

        kServer.getClient().apiextensions().v1().customResourceDefinitions().create(context);
    }

    @AfterEach
    void cleanResources() {
        kServer.getClient()
                .resources(CustomResourceDefinition.class)
                .inNamespace(kServer.getClient().getNamespace())
                .delete();
    }

//    @Test
//    void testExposedScopes() throws Exception {
//        ServiceDomainBinding partyRoutingBinding = new ServiceDomainBindingBuilder()
//                .withMetadata(new ObjectMetaBuilder()
//                        .withName("party-routing-bindings")
//                        .addToLabels(KubernetesResourceService.LABEL_SERVICE_DOMAIN, MY_DOMAIN)
//                        .build())
//                .withSpec(new ServiceDomainBindingSpecBuilder()
//                        .withExposedScopes(List.of(new ExposedScopeSpecBuilder()
//                                .withScopeRef("partyroutingprofile")
//                                .withAction("query")
//                                .build()))
//                        .build())
//                .build();
//        kServer.getClient().resource(partyRoutingBinding).inNamespace(kServer.getClient().getNamespace()).createOrReplace();
//
//        BeanCounter counter = new BeanCounter(5);
//        camel.addRoutes(new RouteBuilder() {
//            @Override
//            public void configure() {
//                from("grpc://{{route.grpc.hostservice}}/org.bian.protobuf.InboundBindingService")
//                        .routeId("testExposedScopes")
//                        .bean(method(counter, "processHttpRequest"))
//                        .log("${body}");
//            }
//        });
//
//        Awaitility
//                .await()
//                .atMost(10, TimeUnit.SECONDS)
//                .until(() -> camel.getRoute(HTTP_ROUTE_NAME) != null);
//
//        given()
//                .pathParam("sdReferenceId", SD_REF_ID)
//                .pathParam("crReferenceId", CR_REF_ID)
//                .pathParam("bqReferenceId", BQ_REF_ID)
//                .when()
//                .get("/party-routing-profile/{sdReferenceId}/party-state/{crReferenceId}/status/{bqReferenceId}")
//                .then()
//                .statusCode(200);
//
//        camel.removeRoute("testExposedScopes");
//    }

//    @Test
//    void testBasicSubscription() throws Exception {
//        ServiceDomainBinding partyRoutingBinding = new ServiceDomainBindingBuilder()
//                .withMetadata(new ObjectMetaBuilder()
//                        .withName("party-routing-bindings")
//                        .addToLabels(KubernetesResourceService.LABEL_SERVICE_DOMAIN, MY_DOMAIN)
//                        .build())
//                .withSpec(new ServiceDomainBindingSpecBuilder()
//                        .withSubscriptions(List.of(new SubscriptionSpecBuilder()
//                                .withServiceDomain(CustomerOffer.DOMAIN_NAME)
//                                .withEvents(List.of(CUSTOMER_OFFER_INITIATED, CUSTOMER_OFFER_COMPLETED))
//                                .build()))
//                        .build())
//                .build();
//        kServer.getClient().resource(partyRoutingBinding).inNamespace(kServer.getClient().getNamespace()).createOrReplace();
//
//        Awaitility
//                .await()
//                .atMost(10, TimeUnit.SECONDS)
//                .until(() -> camel.getRoute("subscription.customer-offer") != null);
//
//        BeanCounter counter = new BeanCounter(5);
//        camel.addRoutes(new RouteBuilder() {
//            @Override
//            public void configure() throws InvalidProtocolBufferException {
//                from("grpc://{{route.grpc.hostservice}}/org.bian.protobuf.InboundBindingService")
//                        .routeId("testBasicSubscription")
//                        .log("${body}")
//                        .log("${headers}")
//                        .bean(method(counter, "process"));
//
//                from("timer:foo?delay=1&period=1")
//                        .setBody()
//                        .simple(JsonFormat.printer().print(buildNotification()))
//                        .log("${body}")
//                        .to("kafka:CUSTOMER_OFFER?brokers={{mercury.kafka.brokers}}");
//            }
//        });
//        if (!counter.count.await(100, TimeUnit.SECONDS)) {
//            Assertions.fail("Expecting 5 results, received " + (5 - counter.count.getCount()));
//        }
//
//        camel.removeRoute("testBasicSubscription");
//    }

//    private CustomerOfferNotification buildNotification() {
//        return CustomerOfferNotification
//                .newBuilder()
//                .setStatus(CustomerOfferEventDeserializer.OFFER_INITIATED_EVENT_STATUS)
//                .setCustomerOfferReference(BasicReference.newBuilder().setId("9").setStatus("pricing_accepted").build())
//                .setCustomerReference(CustomerReference.newBuilder().setId("12345").setName("John Doe").build())
//                .setFacilityApplicationReference(FacilityApplicationReference.newBuilder().setProductCode("CL").build())
//                .setConsumerLoanReference(BasicReference.newBuilder().setId("CLSSR765266").setStatus("INITIALIZED").build())
//                .build();
//    }
//
//    private static class BeanCounter {
//
//        CountDownLatch count;
//
//        public BeanCounter(int expected) {
//            this.count = new CountDownLatch(expected);
//        }
//
//        public void process(CloudEvent event) {
//            if (CustomerOffer.CUSTOMER_OFFER_INITIATED.equals(event.getType())) {
//                count.countDown();
//            }
//        }

//        public CloudEvent processHttpRequest(CloudEvent event) {
//            if (event != null) {
//                Assertions.assertEquals(event.getType(), PartyRoutingProfile.PARTY_STATE_STATUS_RETRIEVE);
//                Assertions.assertEquals(event.getAttributesOrThrow(BianCloudEvent.CE_SD_REF).getCeString(), SD_REF_ID);
//                Assertions.assertEquals(event.getAttributesOrThrow(BianCloudEvent.CE_CR_REF).getCeString(), CR_REF_ID);
//                Assertions.assertEquals(event.getAttributesOrThrow(BianCloudEvent.CE_BQ_REF).getCeString(), BQ_REF_ID);
//                Assertions.assertEquals(event.getAttributesOrThrow(BianCloudEvent.CE_ACTION).getCeString(), CE_ACTION_QUERY);
//            }
//            return CloudEvent.newBuilder()
//                    .setType(PartyRoutingProfile.PARTY_STATE_STATUS_RETRIEVE)
//                    .putAttributes(CE_ACTION, CloudEventAttributeValue.newBuilder()
//                            .setCeString(CE_ACTION_RESPONSE)
//                            .build())
//                    .setProtoData(Any.pack(PartyRoutingStateList.newBuilder()
//                            .addPartyRoutingStates(PartyRoutingState.newBuilder()
//                                    .setProcessId("1234")
//                                    .setCustomerOfferStatus("customerOfferStatus")
//                                    .build())
//                            .build()))
//                    .build();
//        }
//    }

}
