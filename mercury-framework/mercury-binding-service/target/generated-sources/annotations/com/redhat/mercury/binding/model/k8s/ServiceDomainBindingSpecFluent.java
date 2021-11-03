package com.redhat.mercury.binding.model.k8s;

import java.lang.StringBuffer;
import java.lang.StringBuilder;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.util.Collection;
import java.lang.String;
import java.lang.Boolean;

public interface ServiceDomainBindingSpecFluent<A extends ServiceDomainBindingSpecFluent<A>> extends Fluent<A> {


    public String getServiceDomain();
    public A withServiceDomain(String serviceDomain);
    public Boolean hasServiceDomain();
    public A withNewServiceDomain(String arg1);
    public A withNewServiceDomain(StringBuilder arg1);
    public A withNewServiceDomain(StringBuffer arg1);
    public Collection<BindingSpec> getBindings();
    public A withBindings(Collection<BindingSpec> bindings);
    public Boolean hasBindings();
    public Collection<ExposedScopeSpec> getExposedScopes();
    public A withExposedScopes(Collection<ExposedScopeSpec> exposedScopes);
    public Boolean hasExposedScopes();
    public Collection<SubscriptionSpec> getSubscriptions();
    public A withSubscriptions(Collection<SubscriptionSpec> subscriptions);
    public Boolean hasSubscriptions();
}
