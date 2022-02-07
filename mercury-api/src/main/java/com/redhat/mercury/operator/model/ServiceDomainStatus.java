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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonDeserialize
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Accessors(chain = true)
@Buildable(editableEnabled = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
        @BuildableReference(AbstractResourceStatus.class),
})
public class ServiceDomainStatus extends AbstractResourceStatus {

    public static final String CONDITION_SERVICE_DOMAIN_CLUSTER_READY = "ServiceDomainClusterReady";
    public static final String REASON_SDC = "ServiceDomainCluster";
    public static final String MESSAGE_SDC_NOT_FOUND = "Service Domain Cluster not found";
    public static final String MESSAGE_SDC_NOT_READY = "Service Domain Cluster is not ready";
    public static final String CONDITION_KAFKA_TOPIC_READY = "KafkaTopicReady";
    public static final String CONDITION_INTEGRATION_READY = "IntegrationReady";
    public static final String MESSAGE_INTEGRATION_NOT_READY = "Integration not ready";
    public static final String REASON_INTEGRATION = "Integration";

    private String kafkaTopic;
    private String kafkaUser;
}