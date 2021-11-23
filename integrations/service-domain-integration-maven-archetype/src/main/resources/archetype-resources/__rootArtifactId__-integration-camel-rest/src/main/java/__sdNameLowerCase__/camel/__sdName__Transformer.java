package ${package}.camel;

import java.util.UUID;

import org.apache.camel.Message;

import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.redhat.mercury.constants.BianCloudEvent;

import io.cloudevents.v1.proto.CloudEvent;
import io.cloudevents.v1.proto.CloudEvent.CloudEventAttributeValue;

public class ${sdName}Transformer {

    private static final String EXTERNAL_SOURCE = "external";

//    public CloudEvent initiateCustomerOfferProcedure(Message message) throws InvalidProtocolBufferException {
//        CustomerOfferProcedureInitiation.Builder builder = CustomerOfferProcedureInitiation.newBuilder();
//        JsonFormat.parser().merge(message.getBody(String.class), builder);
//        return CloudEvent.newBuilder()
//                .setId(UUID.randomUUID().toString())
//                .setSource(EXTERNAL_SOURCE)
//                .setType(CustomerOffer.CUSTOMER_OFFER_PROCEDURE_INITIATION_TYPE)
//                .putAttributes(BianCloudEvent.CE_SD_REF, CloudEventAttributeValue.newBuilder()
//                        .setCeString(message.getHeader("sdReferenceId", String.class))
//                        .build())
//                .putAttributes(BianCloudEvent.CE_SERVICE_DOMAIN, CloudEventAttributeValue.newBuilder()
//                        .setCeString(CustomerOffer.DOMAIN_NAME)
//                        .build())
//                .setProtoData(Any.pack(builder.build()))
//                .build();
//    }

}
