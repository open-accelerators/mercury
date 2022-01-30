package com.redhat.mercury.operator.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.fabric8.kubernetes.api.model.Condition;
import io.fabric8.kubernetes.api.model.ConditionBuilder;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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

    private List<Condition> conditions = new ArrayList<>();

    public Condition getCondition(String key) {
        return conditions.stream().filter(c -> c.getType().equals(key)).findFirst().orElse(null);
    }

    public AbstractResourceStatus setCondition(Condition condition) {
        //If element type exists remove it before adding the updated condition
        conditions.removeIf(c -> c.getType().equals(condition.getType()));

        //Add the new condition
        conditions.add(condition);
        return this;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(Collection<Condition> conditions) {
        this.conditions = new ArrayList<>(conditions);
    }
}
