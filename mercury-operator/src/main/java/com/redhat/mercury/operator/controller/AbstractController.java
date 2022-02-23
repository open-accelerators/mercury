package com.redhat.mercury.operator.controller;

import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.operator.model.AbstractResourceStatus;

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

import static com.redhat.mercury.operator.model.AbstractResourceStatus.CONDITION_READY;
import static com.redhat.mercury.operator.model.AbstractResourceStatus.STATUS_TRUE;
import static com.redhat.mercury.operator.utils.ResourceUtils.now;
import static com.redhat.mercury.operator.utils.ResourceUtils.toStatus;
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

    protected void setStatusCondition(T resource, String type, Boolean status) {
        setStatusCondition(resource, type, null, null, status);
    }

    protected UpdateControl<T> removeStatusCondition(T resource, String type) {
        final String resourceClassName = resource.getClass().getSimpleName();

        if (resource.getStatus() == null) {
            return UpdateControl.noUpdate();
        }

        resource.getStatus().removeCondition(type);

        LOGGER.debug("{} {} Status updated for condition {}.", resourceClassName, resource.getMetadata().getName(), type);
        return UpdateControl.updateStatus(resource);
    }

    protected boolean areAllConditionsReady(T resource){
        return resource.getStatus()
                .getConditions()
                .stream()
                .filter(c -> !c.getType().equals(CONDITION_READY))
                .allMatch(c -> c.getStatus().equals(STATUS_TRUE));
    }

    protected void setStatusCondition(T resource, String type, String reason, String message, Boolean status) {
        setStatusCondition(resource, new ConditionBuilder()
                .withType(type)
                .withMessage(message)
                .withReason(reason)
                .withStatus(toStatus(status))
                .build());
    }

    protected void setStatusCondition(T resource, Condition condition) {
        if (resource.getStatus() == null) {
            return;
        }
        Condition current = resource.getStatus().getCondition(condition.getType());
        if (current != null) {
            condition.setLastTransitionTime(now());
        }
        if (!condition.equals(current)) {
            condition.setLastTransitionTime(now());
            resource.getStatus().setCondition(condition);
            LOGGER.debug("Set status condition for {} to {}", resource.getMetadata().getName(), condition);
        }
    }

    protected UpdateControl<T> updateStatusWithReadyCondition(T resource, String condition) {
        return updateStatusWithCondition(resource, new ConditionBuilder()
                .withType(condition)
                .withStatus(STATUS_TRUE)
                .build());
    }

    protected UpdateControl<T> updateStatusWithCondition(T resource, Condition condition) {
        final String resourceClassName = resource.getClass().getSimpleName();

        condition.setLastTransitionTime(now());
        Condition current = resource.getStatus().getCondition(condition.getType());

        if (areSameConditions(current, condition)) {
            LOGGER.debug("{} {} Status not updated for condition {}.", resourceClassName, resource.getMetadata().getName(), condition.getType());
            return UpdateControl.noUpdate();
        }
        resource.getStatus().setCondition(condition);

        LOGGER.debug("{} {} Status updated for condition {}.", resourceClassName, resource.getMetadata().getName(), condition.getType());
        return UpdateControl.updateStatus(resource);
    }

    // The only ignored field when comparing two conditions is the
    // last transition time
    protected boolean areSameConditions(Condition c1, Condition c2) {
        return ((c1 == null && c2 == null) || (c1 != null && c2 != null)) &&
                Objects.equals(c1.getType(), c2.getType()) &&
                Objects.equals(c1.getStatus(), c2.getStatus()) &&
                Objects.equals(c1.getReason(), c2.getReason()) &&
                Objects.equals(c1.getMessage(), c2.getMessage());
    }

    protected Condition buildReadyCondition(String condition) {
        return buildCondition(condition, Boolean.TRUE, null, null);
    }

    protected Condition buildCondition(String condition, boolean status, String reason, String message) {
        return new ConditionBuilder()
                .withType(condition)
                .withStatus(toStatus(status))
                .withReason(reason)
                .withMessage(message)
                .withLastTransitionTime(now())
                .build();
    }
}
