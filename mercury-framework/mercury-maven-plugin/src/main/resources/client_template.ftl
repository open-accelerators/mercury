package ${packageName};

import javax.enterprise.context.ApplicationScoped;

<#list services as service>
import ${service.importName};
</#list>
import io.quarkus.grpc.GrpcClient;

@ApplicationScoped
public class ${className} {

    <#list services as service>
    @GrpcClient("${service.clientName}")
    ${service.className} ${service.fieldName};
        
    </#list>
    <#list services as service>
    public ${service.className} ${service.getterName}() {
        return ${service.fieldName};
    }

    </#list>
}