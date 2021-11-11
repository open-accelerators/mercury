package com.redhat.mercury.operator.controller;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.operator.KafkaServiceEventSource;
import com.redhat.mercury.operator.model.ServiceDomainCluster;
import com.redhat.mercury.operator.model.ServiceDomainClusterStatus;

import io.fabric8.kubernetes.api.model.OwnerReferenceBuilder;
import io.fabric8.kubernetes.api.model.rbac.PolicyRule;
import io.fabric8.kubernetes.api.model.rbac.PolicyRuleBuilder;
import io.fabric8.kubernetes.api.model.rbac.Role;
import io.fabric8.kubernetes.api.model.rbac.RoleBinding;
import io.fabric8.kubernetes.api.model.rbac.RoleBindingBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleBuilder;
import io.fabric8.kubernetes.api.model.rbac.RoleRef;
import io.fabric8.kubernetes.api.model.rbac.RoleRefBuilder;
import io.fabric8.kubernetes.api.model.rbac.SubjectBuilder;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.Context;
import io.javaoperatorsdk.operator.api.Controller;
import io.javaoperatorsdk.operator.api.DeleteControl;
import io.javaoperatorsdk.operator.api.ResourceController;
import io.javaoperatorsdk.operator.api.UpdateControl;
import io.javaoperatorsdk.operator.processing.event.EventSourceManager;
import io.strimzi.api.kafka.model.Kafka;
import io.strimzi.api.kafka.model.KafkaBuilder;
import io.strimzi.api.kafka.model.KafkaClusterSpecBuilder;
import io.strimzi.api.kafka.model.ZookeeperClusterSpecBuilder;
import io.strimzi.api.kafka.model.listener.arraylistener.GenericKafkaListenerBuilder;
import io.strimzi.api.kafka.model.listener.arraylistener.KafkaListenerType;
import io.strimzi.api.kafka.model.status.ListenerStatus;
import io.strimzi.api.kafka.model.storage.JbodStorageBuilder;
import io.strimzi.api.kafka.model.storage.PersistentClaimStorageBuilder;

import static com.redhat.mercury.operator.KafkaServiceEventSource.MANAGED_BY_LABEL;
import static com.redhat.mercury.operator.KafkaServiceEventSource.OPERATOR_NAME;

@Controller
public class ServiceDomainClusterController implements ResourceController<ServiceDomainCluster> {

    public static final String SERVICE_DOMAIN_ROLE = "service-domain-role";
    public static final String ROLE_BINDING = "service-domain-role-binding";
    public static final String SUBJECT_NAME = "bian-binding-service-sa";
    public static final String SUBJECT_KIND = "ServiceAccount";
    public static final String ROLE_REF = "service-domain-role";
    public static final String ROLE_REF_KIND = "Role";
    public static final String ROLE_REF_API_GROUP = "rbac.authorization.k8s.io";
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceDomainClusterController.class);
    public static final String SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_KIND = "ServiceDomainCluster";
    public static final String SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_API_VERSION = "mercury.redhat.io/v1alpha1";
    public static final String KAFKA_LISTENER_TYPE_PLAIN = "plain";

    @Inject
    KubernetesClient client;

    @Override
    public void init(EventSourceManager eventSourceManager) {
        eventSourceManager.registerEventSource("kafka-service-event-source", KafkaServiceEventSource.createAndRegisterWatch(client));
    }

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
            updateStatusWithKafkaBrokerUrl(sdc, context, status);

            createOrUpdateRole(sdc);
            createOrUpdateRoleBinding(sdc);
            createOrUpdateKafkaBroker(sdc);
        } catch (Exception e) {
            LOGGER.error("{} service domain cluster failed to be created/updated", sdc.getMetadata().getName(), e);
            return UpdateControl.noUpdate();
        }

        return UpdateControl.updateStatusSubResource(sdc);
    }

    private void updateStatusWithKafkaBrokerUrl(ServiceDomainCluster sdc, Context<ServiceDomainCluster> context, ServiceDomainClusterStatus status) {
        final Kafka kafka = client.resources(Kafka.class).inNamespace(client.getNamespace()).withName(sdc.getMetadata().getName()).get();

        if (isaKafkaBrokerReady(kafka)) {
            final List<ListenerStatus> listeners = kafka.getStatus().getListeners();

            final ListenerStatus listenerStatus = listeners.stream()
                    .filter(x -> KAFKA_LISTENER_TYPE_PLAIN.equals(x.getType()))
                    .findFirst().orElse(null);

            if(listenerStatus != null){
                status.setKafkaBroker(listenerStatus.getBootstrapServers());
                sdc.setStatus(status);
            }
        }
    }

    private boolean isaKafkaBrokerReady(Kafka kafka) {
        return kafka != null && kafka.getStatus() != null && kafka.getStatus().getListeners() != null;
    }

    private void createOrUpdateRole(ServiceDomainCluster sdc) {
        final PolicyRule rule = new PolicyRuleBuilder().withApiGroups("", "mercury.redhat.io").withResources("services", "servicedomainbindings").withVerbs("list", "get", "watch").build();
        Role expected = new RoleBuilder()
                .withNewMetadata()
                .withOwnerReferences(new OwnerReferenceBuilder()
                        .withName(sdc.getMetadata().getName())
                        .withUid(sdc.getMetadata().getUid())
                        .withKind(SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_KIND)
                        .withApiVersion(SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_API_VERSION)
                        .build())
                .withName(SERVICE_DOMAIN_ROLE)
                .endMetadata()
                .withRules(rule)
                .build();

        Role current = client.rbac()
                .roles()
                .withName(SERVICE_DOMAIN_ROLE)
                .get();
        if (current == null) {
            LOGGER.debug("{} Role doesn't exist", SERVICE_DOMAIN_ROLE);
            Role role = client.rbac().roles().createOrReplace(expected);
            LOGGER.info("{} Role was missing, created. {}", SERVICE_DOMAIN_ROLE, role);
        } else {
            if (!Objects.equals(current, expected)) {
                client.rbac().roles().createOrReplace(expected);
                LOGGER.debug("{} Role was updated", SERVICE_DOMAIN_ROLE);
            }
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
                .withUid(sdc.getMetadata().getUid())
                .withKind(SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_KIND)
                .withApiVersion(SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_API_VERSION)
                .build()));

        if (roleBinding == null) {
            LOGGER.info("{} role binding doesn't exist", ROLE_BINDING);
            client.rbac().roleBindings().create(desiredRoleBinding);
            LOGGER.debug("{} role binding was missing, creating it", ROLE_BINDING);
        } else {
            if (!Objects.equals(roleBinding, desiredRoleBinding)) {
                client.rbac().roleBindings().replace(desiredRoleBinding);
                LOGGER.debug("{} role binding was updated", ROLE_BINDING);
            }
        }
    }

    private void createOrUpdateKafkaBroker(ServiceDomainCluster sdc) {
        final String sdcName = sdc.getMetadata().getName();

        Kafka desiredKafka = new KafkaBuilder()
                .withNewMetadata()
                .withName(sdcName)
                .withNamespace(client.getNamespace())
                .withLabels(Map.of(MANAGED_BY_LABEL, OPERATOR_NAME))
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
                .withName(sdcName)
                .withUid(sdc.getMetadata().getUid())
                .withKind(SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_KIND)
                .withApiVersion(SERVICE_DOMAIN_CLUSTER_OWNER_REFERENCES_API_VERSION)
                .build()));

        final Kafka currentKafka = client.resources(Kafka.class).inNamespace(client.getNamespace()).withName(sdcName).get();

        if (currentKafka == null) {
            client.resources(Kafka.class).create(desiredKafka);
            LOGGER.debug("{} kafka broker was missing, creating it", sdcName);
        } else {
            if (!Objects.equals(currentKafka.getSpec(), desiredKafka.getSpec())) {
                client.resources(Kafka.class).replace(desiredKafka);
                LOGGER.debug("{} kafka broker was updated", sdcName);
            }
        }
    }
}
