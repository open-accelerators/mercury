package com.redhat.mercury.operator.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.OwnerReference;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.Watcher;
import io.fabric8.kubernetes.client.WatcherException;
import io.javaoperatorsdk.operator.processing.event.AbstractEventSource;

import static io.javaoperatorsdk.operator.processing.KubernetesResourceUtils.getUID;
import static io.javaoperatorsdk.operator.processing.KubernetesResourceUtils.getVersion;

public abstract class AbstractMercuryEventSource<T extends HasMetadata> extends AbstractEventSource implements Watcher<T> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractMercuryEventSource.class);
    public static final String MANAGED_BY_LABEL = "app.kubernetes.io/managed-by";
    public static final String OPERATOR_NAME = "service-domain-cluster-operator";

    protected final KubernetesClient client;

    public AbstractMercuryEventSource(KubernetesClient client) {
        this.client = client;
    }

    public abstract void registerWatch();

    public abstract String getOwnerRefKind();

    @Override
    public void eventReceived(Action action, T resource) {
        if (eventHandler == null) {
            LOGGER.warn("Ignoring action {} for resource {}. EventHandler has not yet been initialized.", action, resource);
            return;
        }
        LOGGER.info(
                "Event received for action: {}, Service: {}",
                action.name(),
                resource.getMetadata().getName());
        if (action == Action.ERROR) {
            LOGGER.warn(
                    "Skipping {} event for custom resource with uid: {}, version: {}",
                    action,
                    getUID(resource),
                    getVersion(resource));
            return;
        }

        final OwnerReference ownerReference = resource.getMetadata().getOwnerReferences().stream().filter(or -> getOwnerRefKind().equalsIgnoreCase(or.getKind())).findFirst().orElse(null);
        if(ownerReference == null) {
            LOGGER.warn(
                    "Skipping {} event for custom resource {} with uid: {}, version: {} because the reference owner is not ServiceDomain",
                    action,
                    resource.getClass().getSimpleName(),
                    getUID(resource),
                    getVersion(resource));
            return;
        }

        eventHandler.handleEvent(new MercuryOperatorEvent(ownerReference.getUid(), this));
    }

    @Override
    public void onClose(WatcherException e) {
        if (e == null) {
            return;
        }
        if (e.isHttpGone()) {
            LOGGER.warn("Received error for watch, will try to reconnect.", e);
            registerWatch();
        } else {
            // Note that this should not happen normally, since fabric8 client handles reconnect.
            // In case it tries to reconnect this method is not called.
            LOGGER.error("Unexpected error happened with watch. Will exit.", e);
            System.exit(1);
        }
    }
}
