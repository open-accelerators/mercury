package com.redhat.mercury.operator.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.fabric8.kubernetes.api.model.Condition;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude
@EqualsAndHashCode
@ToString
@Getter
@Setter
@Buildable(editableEnabled = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
        @BuildableReference(Condition.class)})
public abstract class AbstractResourceStatus {

    public static final String CONDITION_READY = "Ready";

    public static final String REASON_SUCCESS = "Success";
    public static final String REASON_FAILED = "Failed";
    public static final String REASON_WAITING = "Waiting";

    public static final String MESSAGE_WAITING = "Waiting for other resources to become Ready";

    public static final String STATUS_FALSE = "False";
    public static final String STATUS_TRUE = "True";

    private List<Condition> conditions = new ArrayList<>();

    public Condition getCondition(String key) {
        return conditions.stream().filter(c -> c.getType().equals(key)).findFirst().orElse(null);
    }

    public void removeCondition(String key) {
        conditions.removeIf(c -> c.getType().equalsIgnoreCase(key));
    }

    // All other conditions are Ready means the resource is Ready
    @JsonIgnore
    public boolean isReady() {
        Condition ready = getCondition(CONDITION_READY);
        return ready != null && STATUS_TRUE.equals(ready.getStatus());
    }

    @JsonIgnore
    public boolean isSpecificConditionReady(String type) {
        return conditions.stream().anyMatch(c -> type.equals(c.getType()) && c.getStatus().equalsIgnoreCase(Boolean.TRUE.toString()));
    }

    public AbstractResourceStatus setCondition(Condition condition) {
        //If element type exists remove it before adding the updated condition
        conditions.removeIf(c -> c.getType().equals(condition.getType()));

        //Add the new condition
        conditions.add(condition);
        return this;
    }

}
