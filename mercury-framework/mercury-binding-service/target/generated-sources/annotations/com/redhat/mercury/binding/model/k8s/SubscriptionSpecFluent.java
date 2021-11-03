package com.redhat.mercury.binding.model.k8s;

import java.lang.StringBuffer;
import java.lang.StringBuilder;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.util.Collection;
import java.lang.String;
import java.lang.Boolean;

public interface SubscriptionSpecFluent<A extends SubscriptionSpecFluent<A>> extends Fluent<A> {


    public String getServiceDomain();
    public A withServiceDomain(String serviceDomain);
    public Boolean hasServiceDomain();
    public A withNewServiceDomain(String arg1);
    public A withNewServiceDomain(StringBuilder arg1);
    public A withNewServiceDomain(StringBuffer arg1);
    public Collection<String> getEvents();
    public A withEvents(Collection<String> events);
    public Boolean hasEvents();
}
