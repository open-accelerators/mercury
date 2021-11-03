package com.redhat.mercury.binding.model.k8s;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class SubscriptionSpecBuilder extends SubscriptionSpecFluentImpl<SubscriptionSpecBuilder> implements VisitableBuilder<SubscriptionSpec,SubscriptionSpecBuilder> {

    SubscriptionSpecFluent<?> fluent;
    Boolean validationEnabled;

    public SubscriptionSpecBuilder() {
        this(true);
    }

    public SubscriptionSpecBuilder(Boolean validationEnabled) {
        this(new SubscriptionSpec(), validationEnabled);
    }

    public SubscriptionSpecBuilder(SubscriptionSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public SubscriptionSpecBuilder(SubscriptionSpecFluent<?> fluent,Boolean validationEnabled) {
        this(fluent, new SubscriptionSpec(), validationEnabled);
    }

    public SubscriptionSpecBuilder(SubscriptionSpecFluent<?> fluent,SubscriptionSpec instance) {
        this(fluent, instance, true);
    }

    public SubscriptionSpecBuilder(SubscriptionSpecFluent<?> fluent,SubscriptionSpec instance,Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withServiceDomain(instance.getServiceDomain());
        
        fluent.withEvents(instance.getEvents());
        
        this.validationEnabled = validationEnabled; 
    }

    public SubscriptionSpecBuilder(SubscriptionSpec instance) {
        this(instance,true);
    }

    public SubscriptionSpecBuilder(SubscriptionSpec instance,Boolean validationEnabled) {
        this.fluent = this; 
        this.withServiceDomain(instance.getServiceDomain());
        
        this.withEvents(instance.getEvents());
        
        this.validationEnabled = validationEnabled; 
    }

    public SubscriptionSpec build() {
        SubscriptionSpec buildable = new SubscriptionSpec();
        buildable.setServiceDomain(fluent.getServiceDomain());
        buildable.setEvents(fluent.getEvents());
        return buildable;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SubscriptionSpecBuilder that = (SubscriptionSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
