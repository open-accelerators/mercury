package com.redhat.mercury.binding.model.k8s;

import java.lang.StringBuffer;
import java.lang.StringBuilder;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface ExposedScopeSpecFluent<A extends ExposedScopeSpecFluent<A>> extends Fluent<A> {


    public String getScopeRef();
    public A withScopeRef(String scopeRef);
    public Boolean hasScopeRef();
    public A withNewScopeRef(String arg1);
    public A withNewScopeRef(StringBuilder arg1);
    public A withNewScopeRef(StringBuffer arg1);
    public String getAction();
    public A withAction(String action);
    public Boolean hasAction();
    public A withNewAction(String arg1);
    public A withNewAction(StringBuilder arg1);
    public A withNewAction(StringBuffer arg1);
}
