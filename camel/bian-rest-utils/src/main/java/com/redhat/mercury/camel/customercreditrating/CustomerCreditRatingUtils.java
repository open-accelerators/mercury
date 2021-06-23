package com.redhat.mercury.camel.customercreditrating;

import java.net.URI;
import java.util.UUID;

import org.apache.camel.Exchange;

import com.redhat.mercury.camel.BianObject;
import com.redhat.mercury.camel.ServiceDomain;
import com.redhat.mercury.camel.ServiceOperation;

import io.cloudevents.CloudEvent;
import io.cloudevents.core.builder.CloudEventBuilder;
import io.cloudevents.core.provider.EventFormatProvider;
import io.cloudevents.jackson.JsonFormat;

public class CustomerCreditRatingUtils {

    private static final String SD_REFERENCE_ID = "biansdreference";
    private static final String CR_REFERENCE_ID = "biancrreference";
    private static final String BQ_REFERENCE_ID = "bianbqreference";
    private static final String PATH_SEPARATOR = "/";

    public static byte[] toCloudEvent(Exchange exchange, String body) throws IllegalStateException {
        BianObject obj = buildBianObject(exchange);
        CloudEvent cloudEvent = buildCloudEvent(obj, body);
        return EventFormatProvider.getInstance()
                .resolveFormat(JsonFormat.CONTENT_TYPE)
                .serialize(cloudEvent);
    }

    private static BianObject buildBianObject(Exchange exchange) {
        BianObject obj = new BianObject()
                .setServiceDomain(ServiceDomain.CustomerCreditRating);
        String path = (String) exchange.getIn().getHeader(Exchange.HTTP_PATH);
        String verb = (String) exchange.getIn().getHeader(Exchange.HTTP_METHOD);
        String[] parts = path.split(PATH_SEPARATOR);
        for (ServiceOperation op : ServiceOperation.values()) {
            if (path.endsWith(op.path) && verb.equals(op.verb)) {
                obj.setServiceOperation(op);
            }
        }
        if (ServiceOperation.Activate.equals(obj.getServiceOperation())) {
            return obj;
        }
        obj.setSdReferenceId(parts[2]);
        if (parts.length == 3) {
            return obj;
        }
        for (FunctionalPattern pattern : FunctionalPattern.values()) {
            if (path.contains(pattern.path)) {
                obj.setFunctionalPattern(pattern.name());
            }
        }
        if (parts.length == 4 || obj.getServiceOperation().equals(ServiceOperation.Initiate)) {
            return obj;
        }
        obj.setCrReferenceId(parts[4]);
        switch (obj.getServiceOperation()) {
            case Control:
            case Exchange:
            case Execute:
            case Request:
            case Retrieve:
                return obj;
            default:
                //do nothing
        }
        for (BehaviorQualifier bq : BehaviorQualifier.values()) {
            if (path.contains(bq.path)) {
                obj.setBehaviorQualifier(bq.name());
                obj.setBqReferenceId(parts[6]);
            }
        }
        return obj;
    }

    private static CloudEvent buildCloudEvent(BianObject obj, String body) {
        StringBuilder type = new StringBuilder("com.redhat.mercury/")
                .append(obj.getServiceDomain());
        if (obj.getFunctionalPattern() != null) {
            type.append(PATH_SEPARATOR).append(obj.getFunctionalPattern());
        }
        if (obj.getBehaviorQualifier() != null) {
            type.append(PATH_SEPARATOR).append(obj.getBehaviorQualifier());
        }
        type.append(PATH_SEPARATOR).append(obj.getServiceOperation().name());

        CloudEventBuilder builder = CloudEventBuilder.v1()
                .withId(UUID.randomUUID().toString())
                .withData(body.getBytes())
                .withSource(URI.create("com.redhat.mercury/customer-credit-rating"))
                .withType(type.toString());

        if (obj.getSdReferenceId() != null) {
            builder.withContextAttribute(SD_REFERENCE_ID, obj.getSdReferenceId());
        }
        if (obj.getCrReferenceId() != null) {
            builder.withContextAttribute(CR_REFERENCE_ID, obj.getCrReferenceId());
        }
        if (obj.getBqReferenceId() != null) {
            builder.withContextAttribute(BQ_REFERENCE_ID, obj.getBqReferenceId());
        }

        return builder.build();
    }

}
