package com.redhat.mercury.operator.reflection;

import io.quarkus.runtime.annotations.RegisterForReflection;
import io.strimzi.api.kafka.model.EntityOperatorSpec;
import io.strimzi.api.kafka.model.EntityTopicOperatorSpec;
import io.strimzi.api.kafka.model.Kafka;
import io.strimzi.api.kafka.model.KafkaClusterSpec;
import io.strimzi.api.kafka.model.KafkaSpec;
import io.strimzi.api.kafka.model.KafkaTopic;
import io.strimzi.api.kafka.model.KafkaTopicSpec;
import io.strimzi.api.kafka.model.KafkaUser;
import io.strimzi.api.kafka.model.KafkaUserSpec;
import io.strimzi.api.kafka.model.ZookeeperClusterSpec;
import io.strimzi.api.kafka.model.listener.arraylistener.GenericKafkaListener;
import io.strimzi.api.kafka.model.listener.arraylistener.KafkaListenerType;
import io.strimzi.api.kafka.model.status.Condition;
import io.strimzi.api.kafka.model.status.KafkaStatus;
import io.strimzi.api.kafka.model.status.KafkaTopicStatus;
import io.strimzi.api.kafka.model.status.KafkaUserStatus;
import io.strimzi.api.kafka.model.status.ListenerAddress;
import io.strimzi.api.kafka.model.status.ListenerStatus;
import io.strimzi.api.kafka.model.status.Status;
import io.strimzi.api.kafka.model.storage.EphemeralStorage;
import io.strimzi.api.kafka.model.storage.PersistentClaimStorage;
import io.strimzi.api.kafka.model.storage.Storage;

@RegisterForReflection(targets = {
        Kafka.class,
        KafkaSpec.class,
        KafkaStatus.class,
        KafkaTopic.class,
        KafkaTopicSpec.class,
        KafkaTopicStatus.class,
        KafkaUser.class,
        KafkaUserSpec.class,
        KafkaUserStatus.class,
        KafkaClusterSpec.class,
        ZookeeperClusterSpec.class,
        Storage.class,
        GenericKafkaListener.class,
        KafkaListenerType.class,
        EphemeralStorage.class,
        PersistentClaimStorage.class,
        Status.class,
        Condition.class,
        ListenerStatus.class,
        ListenerAddress.class,
        EntityOperatorSpec.class,
        EntityTopicOperatorSpec.class
})
public class DependenciesConfiguration {
}
