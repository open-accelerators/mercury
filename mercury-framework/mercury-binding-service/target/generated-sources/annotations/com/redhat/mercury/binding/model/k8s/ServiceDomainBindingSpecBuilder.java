package com.redhat.mercury.binding.model.k8s;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class ServiceDomainBindingSpecBuilder extends ServiceDomainBindingSpecFluentImpl<ServiceDomainBindingSpecBuilder> implements VisitableBuilder<ServiceDomainBindingSpec,ServiceDomainBindingSpecBuilder> {

    ServiceDomainBindingSpecFluent<?> fluent;
    Boolean validationEnabled;

    public ServiceDomainBindingSpecBuilder() {
        this(true);
    }

    public ServiceDomainBindingSpecBuilder(Boolean validationEnabled) {
        this(new ServiceDomainBindingSpec(), validationEnabled);
    }

    public ServiceDomainBindingSpecBuilder(ServiceDomainBindingSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public ServiceDomainBindingSpecBuilder(ServiceDomainBindingSpecFluent<?> fluent,Boolean validationEnabled) {
        this(fluent, new ServiceDomainBindingSpec(), validationEnabled);
    }

    public ServiceDomainBindingSpecBuilder(ServiceDomainBindingSpecFluent<?> fluent,ServiceDomainBindingSpec instance) {
        this(fluent, instance, true);
    }

    public ServiceDomainBindingSpecBuilder(ServiceDomainBindingSpecFluent<?> fluent,ServiceDomainBindingSpec instance,Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withServiceDomain(instance.getServiceDomain());
        
        fluent.withBindings(instance.getBindings());
        
        fluent.withExposedScopes(instance.getExposedScopes());
        
        fluent.withSubscriptions(instance.getSubscriptions());
        
        this.validationEnabled = validationEnabled; 
    }

    public ServiceDomainBindingSpecBuilder(ServiceDomainBindingSpec instance) {
        this(instance,true);
    }

    public ServiceDomainBindingSpecBuilder(ServiceDomainBindingSpec instance,Boolean validationEnabled) {
        this.fluent = this; 
        this.withServiceDomain(instance.getServiceDomain());
        
        this.withBindings(instance.getBindings());
        
        this.withExposedScopes(instance.getExposedScopes());
        
        this.withSubscriptions(instance.getSubscriptions());
        
        this.validationEnabled = validationEnabled; 
    }

    public ServiceDomainBindingSpec build() {
        ServiceDomainBindingSpec buildable = new ServiceDomainBindingSpec();
        buildable.setServiceDomain(fluent.getServiceDomain());
        buildable.setBindings(fluent.getBindings());
        buildable.setExposedScopes(fluent.getExposedScopes());
        buildable.setSubscriptions(fluent.getSubscriptions());
        return buildable;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ServiceDomainBindingSpecBuilder that = (ServiceDomainBindingSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
