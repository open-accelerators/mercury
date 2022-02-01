package com.redhat.mercury.operator.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.operator.model.AbstractResourceStatus;
import com.redhat.mercury.operator.model.ResourceUtils;

import io.fabric8.kubernetes.api.model.Condition;
import io.fabric8.kubernetes.api.model.ConditionBuilder;
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.OwnerReference;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.informers.SharedIndexInformer;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;
import io.javaoperatorsdk.operator.processing.event.ResourceID;
import io.javaoperatorsdk.operator.processing.event.source.EventSource;
import io.javaoperatorsdk.operator.processing.event.source.informer.InformerEventSource;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import static com.redhat.mercury.operator.model.AbstractResourceStatus.CONDITION_READY;
import static java.util.Collections.EMPTY_SET;

public abstract class AbstractController<K, E extends AbstractResourceStatus, T extends CustomResource<K, E>> {
    protected static final Logger LOGGER = LoggerFactory.getLogger(AbstractController.class);
    protected static final String MANAGED_BY_LABEL = "app.kubernetes.io/managed-by";
    protected static final String OPERATOR_NAME = "service-domain-cluster-operator";

    @Inject
    KubernetesClient client;

    protected <T extends HasMetadata> EventSource getInformerEventSource(SharedIndexInformer<T> sharedIndexInformer) {
        return new InformerEventSource<T, T>(sharedIndexInformer, d -> {
            List<OwnerReference> ownerReferences = d.getMetadata().getOwnerReferences();
            if (!ownerReferences.isEmpty()) {
                return Set.of(new ResourceID(ownerReferences.get(0).getName(), d.getMetadata().getNamespace()));
            } else {
                return EMPTY_SET;
            }
        });
    }

    protected void setStatusCondition(T resource, String type, Boolean status){
        setStatusCondition(resource, type,null, null, status);
    }

    protected void removeStatusCondition(T resource, String type){
        if(resource.getStatus() == null) {
            return;
        }

        resource.getStatus().removeCondition(type);
    }

    protected void setStatusCondition(T resource, String type, String reason, String message, Boolean status){
        setStatusCondition(resource, new ConditionBuilder()
                .withType(type)
                .withMessage(message)
                .withReason(reason)
                .withStatus(ResourceUtils.capitalize(status))
                .build());
    }

    protected void setStatusCondition(T resource, Condition condition) {
        if (resource.getStatus() == null) {
            return;
        }
        Condition current = resource.getStatus().getCondition(condition.getType());
        if (current != null) {
            condition.setLastTransitionTime(current.getLastTransitionTime());
        }
        if (!condition.equals(current)) {
            condition.setLastTransitionTime(new Date().toString());
            resource.getStatus().setCondition(condition);
            LOGGER.debug("Set status condition for {} to {}", resource.getMetadata().getName(), condition);
        }
    }

    protected UpdateControl<T> updateStatus(T resource) {
        if (resource.getStatus().getCondition(CONDITION_READY) == null) {
            setStatusCondition(resource, CONDITION_READY, Boolean.FALSE);
        }

        final Class<? extends CustomResource> aClass = resource.getClass();

        T current = (T) client.resources(aClass)
                .inNamespace(resource.getMetadata().getNamespace())
                .withName(resource.getMetadata().getName())
                .get();

        if (current == null) {
            return UpdateControl.noUpdate();
        }

        E currentStatus = current.getStatus();
        if (Objects.equals(currentStatus, resource.getStatus())) {
            return UpdateControl.noUpdate();
        }

        current.setStatus(resource.getStatus());
        return UpdateControl.updateStatus(current);
    }
}
