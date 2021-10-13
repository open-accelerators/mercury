package com.redhat.mercury.binding.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.apache.camel.CamelContext;
import org.apache.camel.Header;
import org.apache.camel.Route;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.redhat.mercury.binding.model.Binding;
import com.redhat.mercury.binding.model.BindingDefinition;
import com.redhat.mercury.binding.model.BindingDefinition.Action;
import com.redhat.mercury.binding.model.k8s.BindingSpec;
import com.redhat.mercury.binding.model.k8s.ExposedScopeSpec;
import com.redhat.mercury.binding.model.k8s.SubscriptionSpec;
import com.redhat.mercury.constants.BianCloudEvent;

import io.cloudevents.v1.proto.CloudEvent;
import io.quarkus.runtime.Startup;
import io.quarkus.runtime.annotations.RegisterForReflection;

import static com.redhat.mercury.constants.BianCloudEvent.CE_ACTION_COMMAND;
import static com.redhat.mercury.constants.BianCloudEvent.CE_ACTION_QUERY;

@Startup
@ApplicationScoped
@RegisterForReflection
public class ConfigurationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigurationService.class);

    public static final String HTTP_ROUTE_NAME = "http-route";
    public static final String SUBSCRIPTION_ROUTE_PREFIX = "subscription.";

    @Inject
    CamelContext context;

    @Inject
    KubernetesResourceService k8sService;

    private Map<String, Binding> bindings;

    @PostConstruct
    void initialize() {
        k8sService.registerWatcher(binding -> {
            if (binding == null) {
                clearBindings();
            } else {
                updateBindings(binding.getSpec().getBindings());
                updateExposedScopes(binding.getSpec().getExposedScopes());
                updateSubscriptions(binding.getSpec().getSubscriptions());
            }
        });
    }

    public String getBinding(CloudEvent cloudEvent, @Header("CamelGrpcMethodName") String method) {
        String ref = cloudEvent.getType().replace(BianCloudEvent.CE_TYPE_PREFIX, "");
        if(Action.notify.equals(method)) {
            return "kafka:{{mercury.servicedomain}}?brokers={{mercury.kafka.brokers}}";
        }
        Binding binding = reduceBinding(ref, method);
        if (binding != null) {
            LOGGER.debug("Redirecting to: {}", binding.getEndpoint());
            return binding.getEndpoint();
        }
        LOGGER.error("No binding found for event type {} and method {}", cloudEvent.getType(), method);
        throw new IllegalStateException("Unable to calculate a valid QueryRoute");
    }

    private Binding reduceBinding(String type, String method) {
        if (type.isBlank()) {
            return null;
        }
        Binding binding = bindings.get(String.join(".", type, method));
        if (binding != null) {
            return binding;
        }
        return reduceBinding(type.substring(0, type.lastIndexOf(".")), method);
    }

    public synchronized void updateBindings(Collection<BindingSpec> bindingConfig) {
        Builder<String, Binding> configBuilder = ImmutableMap.builder();
        if (bindingConfig == null || bindingConfig.isEmpty()) {
            LOGGER.info("Empty bindingConfig received, clearing bindings");
            clearBindings();
            return;
        }
        bindingConfig.forEach(b -> {
            BindingDefinition def = new BindingDefinition().setDomainName(b.getServiceDomain())
                    .setScopeRef(b.getScopeRef()).setAction(parseAction(b.getAction()));
            Binding binding = new Binding().setDefinition(def).setEndpoint(k8sService.getEndpoint(def));
            if (binding != null || binding.getEndpoint() == null) {
                configBuilder.put(String.join(".", def.getScopeRef(), def.getAction().name()), binding);
                LOGGER.info("Added binding {}", binding);
            } else {
                LOGGER.warn("Ignoring incorrect binding {}", binding);
            }
        });
        this.bindings = configBuilder.build();
        LOGGER.info("Registered all bindings");
    }

    public synchronized void updateExposedScopes(Collection<ExposedScopeSpec> exposedScopes) {
        if (exposedScopes == null || exposedScopes.isEmpty()) {
            clearExposedServices();
            return;
        }
        if (context.getRoute(HTTP_ROUTE_NAME) != null) {
            return;
        }
        RouteBuilder definition = new RouteBuilder() {
            @Override
            public void configure() {
                from("platform-http:/{{mercury.servicedomain}}?matchOnUriPrefix=true")
                        .routeId(HTTP_ROUTE_NAME)
                        .bean(BianHttpCloudEventMarshaller.class, "toExternalRequest")
                        .to("grpc://{{route.grpc.hostservice}}/org.bian.protobuf.InboundBindingService?synchronous=true&method=external")
                        .bean(BianHttpCloudEventMarshaller.class, "toHttp");
            }
        };
        try {
            context.addRoutes(definition);
            LOGGER.debug("Register {} route", HTTP_ROUTE_NAME);
        } catch (Exception e) {
            LOGGER.error("Unable to register {} route", HTTP_ROUTE_NAME, e);
        }
    }

    public synchronized void updateSubscriptions(Collection<SubscriptionSpec> subscriptions) {
        if (subscriptions == null || subscriptions.isEmpty()) {
            LOGGER.debug("Clear subscriptions");
            clearSubscriptions();
            return;
        }
        Map<String, RouteBuilder> expected = new HashMap<>();
        subscriptions.forEach(s -> {
            String routeName = SUBSCRIPTION_ROUTE_PREFIX + s.getServiceDomain();
            try {
                expected.put(routeName, new RouteBuilder() {
                    @Override
                    public void configure() {
                        from("kafka:" + getTopicName(s.getServiceDomain()) + "?brokers={{mercury.kafka.brokers}}")
                                .routeId(routeName)
                                .to("grpc://{{route.grpc.hostservice}}/org.bian.protobuf.InboundBindingService?method=receive");
                    }
                });
                LOGGER.debug("Create subscription {}", s);
            } catch (Exception e) {
                LOGGER.error("Unable to update subscription for: {}", s.getServiceDomain());
            }
        });
        Set<String> missingRoutes = new HashSet<>();
        context.getRoutes().forEach(r -> {
            if (r.getId().startsWith(SUBSCRIPTION_ROUTE_PREFIX) && !expected.containsKey(r.getId())) {
                missingRoutes.add(r.getId());
            }
        });
        missingRoutes.forEach(r -> {
            try {
                context.removeRoute(r);
            } catch (Exception e) {
                LOGGER.error("Unable to remove Route: {}", r, e);
            }
        });
        expected.forEach((k, v) -> {
            if (context.getRoute(k) == null) {
                try {
                    context.addRoutes(v);
                } catch (Exception e) {
                    LOGGER.error("Unable to add new subscription route: {}", k, e);
                }
            }
        });

    }

    public synchronized void clearBindings() {
        LOGGER.info("Removing any existing binding");
        clearExposedServices();
        clearSubscriptions();
        ConfigurationService.this.bindings = ImmutableMap.of();
    }

    public synchronized void clearExposedServices() {
        LOGGER.debug("Removing exposed services");
        try {
            context.removeRoute(HTTP_ROUTE_NAME);
        } catch (Exception e) {
            LOGGER.error("Unable to remove ExposedServiceRoute: {}", HTTP_ROUTE_NAME, e);
        }
    }

    public synchronized void clearSubscriptions() {
        LOGGER.debug("Removing subscriptions");
        for (Route r : context.getRoutes()) {
            if (r.getId().startsWith(SUBSCRIPTION_ROUTE_PREFIX)) {
                try {
                    context.removeRoute(r.getId());
                } catch (Exception e) {
                    LOGGER.error("Unable to remove Subscription route: {}", r.getId(), e);
                }
            }
        }
    }

    private BindingDefinition.Action parseAction(String action) {
        switch (action) {
            case CE_ACTION_QUERY:
                return BindingDefinition.Action.query;
            case CE_ACTION_COMMAND:
                return BindingDefinition.Action.command;
            default:
                return null;
        }
    }

    private String getTopicName(String serviceDomainName) {
        return serviceDomainName.toUpperCase().replace("-", "_");
    }
}
