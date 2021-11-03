package com.redhat.mercury.binding.model.k8s;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class ServiceDomainBindingBuilder extends ServiceDomainBindingFluentImpl<ServiceDomainBindingBuilder> implements VisitableBuilder<ServiceDomainBinding,ServiceDomainBindingBuilder> {

    ServiceDomainBindingFluent<?> fluent;
    Boolean validationEnabled;

    public ServiceDomainBindingBuilder() {
        this(true);
    }

    public ServiceDomainBindingBuilder(Boolean validationEnabled) {
        this(new ServiceDomainBinding(), validationEnabled);
    }

    public ServiceDomainBindingBuilder(ServiceDomainBindingFluent<?> fluent) {
        this(fluent, true);
    }

    public ServiceDomainBindingBuilder(ServiceDomainBindingFluent<?> fluent,Boolean validationEnabled) {
        this(fluent, new ServiceDomainBinding(), validationEnabled);
    }

    public ServiceDomainBindingBuilder(ServiceDomainBindingFluent<?> fluent,ServiceDomainBinding instance) {
        this(fluent, instance, true);
    }

    public ServiceDomainBindingBuilder(ServiceDomainBindingFluent<?> fluent,ServiceDomainBinding instance,Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withMetadata(instance.getMetadata());
        
        fluent.withSpec(instance.getSpec());
        
        fluent.withStatus(instance.getStatus());
        
        fluent.withKind(instance.getKind());
        
        fluent.withApiVersion(instance.getApiVersion());
        
        this.validationEnabled = validationEnabled; 
    }

    public ServiceDomainBindingBuilder(ServiceDomainBinding instance) {
        this(instance,true);
    }

    public ServiceDomainBindingBuilder(ServiceDomainBinding instance,Boolean validationEnabled) {
        this.fluent = this; 
        this.withMetadata(instance.getMetadata());
        
        this.withSpec(instance.getSpec());
        
        this.withStatus(instance.getStatus());
        
        this.withKind(instance.getKind());
        
        this.withApiVersion(instance.getApiVersion());
        
        this.validationEnabled = validationEnabled; 
    }

    public ServiceDomainBinding build() {
        ServiceDomainBinding buildable = new ServiceDomainBinding();
        buildable.setMetadata(fluent.getMetadata());
        buildable.setSpec(fluent.getSpec());
        buildable.setStatus(fluent.getStatus());
        buildable.setKind(fluent.getKind());
        buildable.setApiVersion(fluent.getApiVersion());
        return buildable;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ServiceDomainBindingBuilder that = (ServiceDomainBindingBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
