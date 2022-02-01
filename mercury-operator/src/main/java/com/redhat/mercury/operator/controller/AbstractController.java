package com.redhat.mercury.operator.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.operator.model.AbstractResourceStatus;
import com.redhat.mercury.operator.model.ResourceUtils;

import io.fabric8.kubernetes.api.model.Condition;
import io.fabric8.kubernetes.api.model.ConditionBuilder;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.UpdateControl;

import java.util.Date;
import java.util.Objects;

import static com.redhat.mercury.operator.model.AbstractResourceStatus.CONDITION_READY;

public abstract class AbstractController<K, E extends AbstractResourceStatus, T extends CustomResource<K, E>> {
    protected static final Logger LOGGER = LoggerFactory.getLogger(AbstractController.class);

    @Inject
    KubernetesClient client;

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
        return UpdateControl.updateStatusSubResource(current);
    }
}
