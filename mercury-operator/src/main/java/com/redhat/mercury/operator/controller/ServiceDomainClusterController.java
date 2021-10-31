package com.redhat.mercury.operator.controller;

import com.redhat.mercury.operator.model.ServiceDomainCluster;
import com.redhat.mercury.operator.model.ServiceDomainClusterStatus;
import io.fabric8.kubernetes.api.model.KubernetesResourceList;
import io.fabric8.kubernetes.api.model.OwnerReference;
import io.fabric8.kubernetes.api.model.OwnerReferenceBuilder;
import io.fabric8.kubernetes.api.model.Service;
import io.fabric8.kubernetes.api.model.rbac.*;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.Resource;
import io.javaoperatorsdk.operator.api.*;
import io.strimzi.api.kafka.model.Kafka;
import io.strimzi.api.kafka.model.KafkaBuilder;
import io.strimzi.api.kafka.model.KafkaClusterSpecBuilder;
import io.strimzi.api.kafka.model.ZookeeperClusterSpecBuilder;
import io.strimzi.api.kafka.model.listener.arraylistener.GenericKafkaListenerBuilder;
import io.strimzi.api.kafka.model.listener.arraylistener.KafkaListenerType;
import io.strimzi.api.kafka.model.storage.JbodStorageBuilder;
import io.strimzi.api.kafka.model.storage.PersistentClaimStorageBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
public class ServiceDomainClusterController implements ResourceController<ServiceDomainCluster> {

    private static final String SERVICE_DOMAIN_ROLE = "service-domain-role";
    private static final String ROLE_BINDING = "service-domain-role-binding";
    private static final String SUBJECT_NAME = "bian-binding-service-sa";
    private static final String SUBJECT_KIND = "ServiceAccount";
    private static final String ROLE_REF = "service-domain-role";
    private static final String ROLE_REF_KIND = "Role";
    private static final String ROLE_REF_API_GROUP = "rbac.authorization.k8s.io";
    private static final String KAFKA_CLUSTER = "mercury-kafka-cluster";

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceDomainClusterController.class);

    @Inject
    KubernetesClient client;

    @Override
    public DeleteControl deleteResource(ServiceDomainCluster sdc, Context<ServiceDomainCluster> context) {
        String sdName = sdc.getMetadata().getName();
        LOGGER.info("{} service domain cluster deleted successfully", sdName);
        return DeleteControl.DEFAULT_DELETE;
    }

    @Override
    public UpdateControl<ServiceDomainCluster> createOrUpdateResource(ServiceDomainCluster sdc, Context<ServiceDomainCluster> context) {
        ServiceDomainClusterStatus status = new ServiceDomainClusterStatus();
        try {
            createOrUpdateRole(sdc);
            createOrUpdateRoleBinding(sdc);
            String kafkaBrokerUrl = createOrUpdateKafkaBroker(sdc);

            ServiceDomainClusterStatus sdcs = new ServiceDomainClusterStatus();
            sdcs.setKafkaBroker(kafkaBrokerUrl);
        } catch (Exception e) {
            LOGGER.error("{} service domain cluster failed to be created/updated", sdc.getMetadata().getName(), e);
            return UpdateControl.noUpdate();
        }

        sdc.setStatus(status);
        return UpdateControl.updateStatusSubResource(sdc);
    }

    private void createOrUpdateRole(ServiceDomainCluster sdc) {
        final PolicyRule rule = new PolicyRuleBuilder().withApiGroups("", "mercury.redhat.io").withResources("services", "servicedomainbindings").withVerbs("list", "get", "watch").build();
        Role desiredRole = new RoleBuilder()
                .withNewMetadata()
                .withName(SERVICE_DOMAIN_ROLE)
                .endMetadata()
                .withRules(rule)
                .build();

        Role role = client
                .rbac().roles()
                .withName(SERVICE_DOMAIN_ROLE).get();


        desiredRole.getMetadata().setOwnerReferences(List.of(new OwnerReferenceBuilder()
                                                                    .withName(sdc.getMetadata().getName())
                                                                    .withUid(sdc.getMetadata().getUid()).build()));

        if(role == null) {
            LOGGER.info("{} role doesn't exist", SERVICE_DOMAIN_ROLE);
            client.rbac().roles().create(desiredRole);
            LOGGER.info("{} role was created successfully", SERVICE_DOMAIN_ROLE);
        } else {
            client.rbac().roles().replace(desiredRole);
            LOGGER.info("{} role was updated successfully", SERVICE_DOMAIN_ROLE);
        }
    }

    private void createOrUpdateRoleBinding(ServiceDomainCluster sdc) {
        final RoleRef roleRef = new RoleRefBuilder().withName(ROLE_REF).withApiGroup(ROLE_REF_API_GROUP).withKind(ROLE_REF_KIND).build();
        RoleBinding desiredRoleBinding = new RoleBindingBuilder()
                .withNewMetadata()
                .withName(ROLE_BINDING)
                .endMetadata()
                .withRoleRef(roleRef)
                .withSubjects(new SubjectBuilder().withName(SUBJECT_NAME).withKind(SUBJECT_KIND).build())
                .build();

        RoleBinding roleBinding = client
                .rbac().roleBindings()
                .withName(ROLE_BINDING).get();

        desiredRoleBinding.getMetadata().setOwnerReferences(List.of(new OwnerReferenceBuilder()
                .withName(sdc.getMetadata().getName())
                .withUid(sdc.getMetadata().getUid()).build()));

        if(roleBinding == null){
            LOGGER.info("{} role binding doesn't exist", ROLE_BINDING);
            client.rbac().roleBindings().create(desiredRoleBinding);
            LOGGER.info("{} role binding was created successfully", ROLE_BINDING);
        } else {
            client.rbac().roleBindings().replace(desiredRoleBinding);
            LOGGER.info("{} role binding was updated successfully", ROLE_BINDING);
        }
    }

    private String createOrUpdateKafkaBroker(ServiceDomainCluster sdc) {
        MixedOperation<Kafka, KubernetesResourceList<Kafka>, Resource<Kafka>> kafkaResources = client.resources(Kafka.class);
        KubernetesResourceList<Kafka> list = kafkaResources.list();

        Kafka desiredKafka = new KafkaBuilder()
                .withNewMetadata()
                .withResourceVersion("desiredKafka.strimzi.io/v1beta2")
                .withName("mercury-desiredKafka-cluster")
                .endMetadata()
                .withNewSpec()
                .withKafka(new KafkaClusterSpecBuilder()
                                                .withVersion("3.0.0")
                                                .withReplicas(3)
                                                .withListeners(new GenericKafkaListenerBuilder()
                                                                    .withName("plain")
                                                                    .withPort(9092)
                                                                    .withType(KafkaListenerType.INTERNAL)
                                                                    .withTls(false).build(),
                                                              new GenericKafkaListenerBuilder()
                                                                    .withName("tls")
                                                                    .withPort(9093)
                                                                    .withType(KafkaListenerType.INTERNAL)
                                                                    .withTls(true).build())
                                                .withConfig(Map.of("offsets.topic.replication.factor", 3,
                                                                "transaction.state.log.replication.factor", 3,
                                                                "transaction.state.log.min.isr", 2,
                                                                "log.message.format.version", "3.0",
                                                                "inter.broker.protocol.version", "3.0"))
                                                .withStorage(new JbodStorageBuilder()
                                                                    .withVolumes(new PersistentClaimStorageBuilder()
                                                                                        .withId(0)
                                                                                        .withSize("100Gi")
                                                                                        .withDeleteClaim(false)
                                                                                        .build())
                                                                    .build())
                                                .build())
                .withZookeeper(new ZookeeperClusterSpecBuilder()
                                .withReplicas(3)
                                .withStorage(new PersistentClaimStorageBuilder()
                                                    .withSize("100Gi")
                                                    .withDeleteClaim(false)
                                                    .build())
                                .build())
                .endSpec()
                .build();

        desiredKafka.getMetadata().setOwnerReferences(List.of(new OwnerReferenceBuilder()
                .withName(sdc.getMetadata().getName())
                .withUid(sdc.getMetadata().getUid()).build()));

        if (list.getItems().isEmpty()){
            client.resources(Kafka.class).create(desiredKafka);
            LOGGER.info("{} desiredKafka broker created successfully", KAFKA_CLUSTER);
        } else {
            if(Objects.equals(list.getItems().get(0), desiredKafka)) {
                client.resources(Kafka.class).replace(desiredKafka);
                LOGGER.info("{} desiredKafka broker updated successfully", KAFKA_CLUSTER);
            }
        }

        return getKafkaBrokerUrl();
    }

    private String getKafkaBrokerUrl() {
//        if(client.services().withName("mercury-kafka-cluster").isReady()){
//            final Service kafkaService = client.services().withName("mercury-kafka-cluster").get();
//            kafkaService.getSpec().getgetStatus().
//            retu
//        }
        return null;//TODO: implement
    }
}
