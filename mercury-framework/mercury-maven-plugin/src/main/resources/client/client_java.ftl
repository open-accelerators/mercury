package ${packageName};

import javax.enterprise.context.ApplicationScoped;

<#list services as service>
import ${service.importName};
</#list>
import io.quarkus.grpc.GrpcClient;
import lombok.Getter;

@ApplicationScoped
@Getter
public class ${className} {

    <#list services as service>
    @GrpcClient("${service.clientName}")
    ${service.className} ${service.fieldName};
        
    </#list>
}