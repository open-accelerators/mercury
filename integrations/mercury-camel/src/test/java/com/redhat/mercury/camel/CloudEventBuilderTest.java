package com.redhat.mercury.camel;

import javax.inject.Inject;

import org.apache.camel.CamelContext;
import org.apache.camel.Message;
import org.apache.camel.support.DefaultMessage;
import org.junit.jupiter.api.Test;

import io.cloudevents.SpecVersion;
import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;
import io.quarkus.test.junit.QuarkusTest;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class CloudEventBuilderTest {

    @Inject
    CamelContext camelContext;

    @Test
    void testBuild() {
        Message message = new DefaultMessage(camelContext);
        String payload = "{ \"customerOfferProcedureInstanceRecord\" : { \"customerReference\" : \"foo\" } }";
        message.setBody(payload);
        message.setHeader("sdReferenceId", "sd-001");
        message.setHeader("crReferenceId", "cr-001");
        message.setHeader("serviceDomainName", CustomerOffer.DOMAIN_NAME);
        message.setHeader("cloudEventType", CustomerOffer.CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE);

        CloudEvent cloudEvent = CloudEventBuilder.build(message);

        assertThat(cloudEvent.getId()).isNotBlank();
        assertThat(cloudEvent.getType()).isEqualTo(CustomerOffer.CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE);
        assertThat(cloudEvent.getSource()).isEqualTo("external");
        assertThat(cloudEvent.getSpecVersion()).isEqualTo(SpecVersion.V1.toString());
        assertThat(cloudEvent.getBinaryData().toStringUtf8()).isEqualTo(payload);
        assertThat(cloudEvent.getAttributesMap())
                .containsEntry(BianCloudEvent.CE_SERVICE_DOMAIN, CloudEventAttributeValue
                        .newBuilder()
                        .setCeString(CustomerOffer.DOMAIN_NAME)
                        .build())
                .containsEntry(BianCloudEvent.CE_SD_REF, CloudEventAttributeValue
                        .newBuilder()
                        .setCeString("sd-001")
                        .build())
                .containsEntry(BianCloudEvent.CE_CR_REF, CloudEventAttributeValue
                        .newBuilder()
                        .setCeString("cr-001")
                        .build())
                .doesNotContainKey(BianCloudEvent.CE_BQ_REF);
    }
}
