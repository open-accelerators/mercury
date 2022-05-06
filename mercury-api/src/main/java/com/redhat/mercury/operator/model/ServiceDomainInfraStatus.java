package com.redhat.mercury.operator.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import static com.redhat.mercury.operator.model.MercuryConstants.K8S_BUILDER_PACKAGE;

@JsonInclude
@JsonDeserialize
@ToString
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Accessors(chain = true)
@Buildable(editableEnabled = false, lazyCollectionInitEnabled = false, builderPackage = K8S_BUILDER_PACKAGE, refs = {
        @BuildableReference(AbstractResourceStatus.class),
})
public class ServiceDomainInfraStatus extends AbstractResourceStatus {

    public static final String CONDITION_KAFKA_BROKER_READY = "KafkaBrokerReady";

    public static final String REASON_KAFKA_WAITING = "WaitingForKafka";
    public static final String REASON_KAFKA_EXCEPTION = "KafkaProvisionException";

    public static final String MESSAGE_KAFKA_BROKER_NOT_READY = "Kafka Broker not ready";

    private String kafkaBroker;
}
