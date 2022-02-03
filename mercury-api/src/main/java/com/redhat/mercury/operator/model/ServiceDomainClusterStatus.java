package com.redhat.mercury.operator.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.sundr.builder.annotations.Buildable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonInclude
@JsonDeserialize
@ToString
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Accessors(chain = true)
@Buildable(editableEnabled = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder")
public class ServiceDomainClusterStatus extends AbstractResourceStatus {

    public static final String CONDITION_KAFKA_BROKER_READY = "KafkaBrokerReady";
    public static final String REASON_KAFKA_BROKER = "KafkaBroker";
    public static final String MESSAGE_KAFKA_BROKER_NOT_READY = "Kafka Broker not ready yet";

    private String kafkaBroker;
}
