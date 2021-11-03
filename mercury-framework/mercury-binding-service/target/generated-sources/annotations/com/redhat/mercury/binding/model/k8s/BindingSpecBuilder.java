package com.redhat.mercury.binding.model.k8s;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class BindingSpecBuilder extends BindingSpecFluentImpl<BindingSpecBuilder> implements VisitableBuilder<BindingSpec,BindingSpecBuilder> {

    BindingSpecFluent<?> fluent;
    Boolean validationEnabled;

    public BindingSpecBuilder() {
        this(true);
    }

    public BindingSpecBuilder(Boolean validationEnabled) {
        this(new BindingSpec(), validationEnabled);
    }

    public BindingSpecBuilder(BindingSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public BindingSpecBuilder(BindingSpecFluent<?> fluent,Boolean validationEnabled) {
        this(fluent, new BindingSpec(), validationEnabled);
    }

    public BindingSpecBuilder(BindingSpecFluent<?> fluent,BindingSpec instance) {
        this(fluent, instance, true);
    }

    public BindingSpecBuilder(BindingSpecFluent<?> fluent,BindingSpec instance,Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withServiceDomain(instance.getServiceDomain());
        
        fluent.withScopeRef(instance.getScopeRef());
        
        fluent.withAction(instance.getAction());
        
        this.validationEnabled = validationEnabled; 
    }

    public BindingSpecBuilder(BindingSpec instance) {
        this(instance,true);
    }

    public BindingSpecBuilder(BindingSpec instance,Boolean validationEnabled) {
        this.fluent = this; 
        this.withServiceDomain(instance.getServiceDomain());
        
        this.withScopeRef(instance.getScopeRef());
        
        this.withAction(instance.getAction());
        
        this.validationEnabled = validationEnabled; 
    }

    public BindingSpec build() {
        BindingSpec buildable = new BindingSpec();
        buildable.setServiceDomain(fluent.getServiceDomain());
        buildable.setScopeRef(fluent.getScopeRef());
        buildable.setAction(fluent.getAction());
        return buildable;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BindingSpecBuilder that = (BindingSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
