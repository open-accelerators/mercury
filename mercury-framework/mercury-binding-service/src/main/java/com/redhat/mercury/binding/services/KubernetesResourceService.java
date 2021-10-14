package com.redhat.mercury.binding.services;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.binding.model.BindingDefinition;
import com.redhat.mercury.binding.model.k8s.ServiceDomainBinding;

import io.fabric8.kubernetes.api.model.Service;
import io.fabric8.kubernetes.api.model.ServicePort;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.Watcher;
import io.fabric8.kubernetes.client.WatcherException;
import io.quarkus.runtime.annotations.RegisterForReflection;

@ApplicationScoped
@RegisterForReflection
public class KubernetesResourceService {

    private static final Logger LOGGER = LoggerFactory.getLogger(KubernetesResourceService.class);

    private static final String KAFKA_ENDPOINT = "kafka:%s?brokers=%s";
    private static final String GRPC_ENDPOINT = "grpc://%s/org.bian.protobuf.InternalBindingService?method=%s";

    public static final String LABEL_SERVICE_DOMAIN = "service-domain";
    public static final String LABEL_SERVICE_TYPE = "mercury-binding";
    public static final String INTERNAL_SERVICE_TYPE = "internal";

    @Inject
    KubernetesClient kClient;

    @ConfigProperty(name = "mercury.servicedomain")
    String serviceDomainName;

    @ConfigProperty(name = "mercury.kafka.brokers")
    Optional<String> kafkaBrokers;

    public void registerWatcher(Consumer<ServiceDomainBinding> consumer) {
        List<ServiceDomainBinding> sdBindings = kClient.resources(ServiceDomainBinding.class)
                .inNamespace(kClient.getNamespace())
                .withLabel(LABEL_SERVICE_DOMAIN, serviceDomainName)
                .list()
                .getItems();
        if (!sdBindings.isEmpty()) {
            ServiceDomainBinding binding = sdBindings.get(0);
            if (binding == null || binding.getSpec() == null) {
                LOGGER.debug("Found empty binding");
                consumer.accept(null);
            } else {
                LOGGER.debug("Found binding {}", binding.getSpec());
                consumer.accept(sdBindings.get(0));
            }
        }

        kClient.resources(ServiceDomainBinding.class)
                .inNamespace(kClient.getNamespace())
                .withLabel(LABEL_SERVICE_DOMAIN, serviceDomainName)
                .watch(new Watcher<>() {
                    @Override
                    public void eventReceived(Action action, ServiceDomainBinding resource) {
                        switch (action) {
                            case ADDED:
                            case MODIFIED:
                                LOGGER.debug("Added/Modified binding {}", resource.getSpec());
                                consumer.accept(resource);
                                break;
                            case DELETED:
                                LOGGER.debug("Deleted binding {}", resource.getMetadata().getName());
                                consumer.accept(null);
                                break;
                            default:
                                LOGGER.warn("Unexpected event while watching serviceDomainBindings {}", serviceDomainName, action);
                        }
                    }

                    @Override
                    public void onClose(WatcherException cause) {
                    }
                });

    }

    public String getEndpoint(BindingDefinition definition) {
        switch (definition.getAction()) {
            case query:
            case command:
                return String.format(GRPC_ENDPOINT,
                        getInternalBindingService(definition.getDomainName()),
                        definition.getAction().name());
            case notify:
                return String.format(KAFKA_ENDPOINT, definition.getScopeRef(),
                        kafkaBrokers.orElseThrow(() -> new IllegalStateException("mercury.kafka.brokers property must be set for sending notifications")));
            default:
                LOGGER.warn("Ignoring unsupported binding action: {}", definition.getAction());
                return null;
        }
    }

    private String getInternalBindingService(String serviceDomainName) {
        //TODO: Support multiple namespaces
        Map<String, String> expectedLabels = Map.of(LABEL_SERVICE_DOMAIN, serviceDomainName, LABEL_SERVICE_TYPE, INTERNAL_SERVICE_TYPE);
        List<Service> services = kClient.services().inNamespace(kClient.getNamespace()).withLabels(expectedLabels).list().getItems();
        if (services == null || services.isEmpty()) {
            return null;
        }
        if (services.size() > 1) {
            LOGGER.error("Multiple services retrieved, expected 1. Got: {}", services.size());
            return null;
        }
        Service service = services.get(0);
        String name = service.getMetadata().getName();
        Optional<ServicePort> port = service.getSpec().getPorts().stream().filter(p -> p.getName().equals(INTERNAL_SERVICE_TYPE)).findFirst();
        if (port.isPresent()) {
            return name + ":" + port.get().getPort();
        }
        LOGGER.error("Missing expected port with name {} in service {}", INTERNAL_SERVICE_TYPE, service.getMetadata().getName());
        return null;
    }

}
