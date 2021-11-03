package com.redhat.mercury.binding.model.k8s;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class ExposedScopeSpecBuilder extends ExposedScopeSpecFluentImpl<ExposedScopeSpecBuilder> implements VisitableBuilder<ExposedScopeSpec,ExposedScopeSpecBuilder> {

    ExposedScopeSpecFluent<?> fluent;
    Boolean validationEnabled;

    public ExposedScopeSpecBuilder() {
        this(true);
    }

    public ExposedScopeSpecBuilder(Boolean validationEnabled) {
        this(new ExposedScopeSpec(), validationEnabled);
    }

    public ExposedScopeSpecBuilder(ExposedScopeSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public ExposedScopeSpecBuilder(ExposedScopeSpecFluent<?> fluent,Boolean validationEnabled) {
        this(fluent, new ExposedScopeSpec(), validationEnabled);
    }

    public ExposedScopeSpecBuilder(ExposedScopeSpecFluent<?> fluent,ExposedScopeSpec instance) {
        this(fluent, instance, true);
    }

    public ExposedScopeSpecBuilder(ExposedScopeSpecFluent<?> fluent,ExposedScopeSpec instance,Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withScopeRef(instance.getScopeRef());
        
        fluent.withAction(instance.getAction());
        
        this.validationEnabled = validationEnabled; 
    }

    public ExposedScopeSpecBuilder(ExposedScopeSpec instance) {
        this(instance,true);
    }

    public ExposedScopeSpecBuilder(ExposedScopeSpec instance,Boolean validationEnabled) {
        this.fluent = this; 
        this.withScopeRef(instance.getScopeRef());
        
        this.withAction(instance.getAction());
        
        this.validationEnabled = validationEnabled; 
    }

    public ExposedScopeSpec build() {
        ExposedScopeSpec buildable = new ExposedScopeSpec();
        buildable.setScopeRef(fluent.getScopeRef());
        buildable.setAction(fluent.getAction());
        return buildable;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ExposedScopeSpecBuilder that = (ExposedScopeSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
