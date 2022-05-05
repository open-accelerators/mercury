<#list services as service>
quarkus.grpc.clients.${service.clientName}.host=${r"${mercury."}${serviceDomainGrpcName}.service.host:${serviceDomainGrpcName}}
quarkus.grpc.clients.${service.clientName}.port=${r"${mercury."}${serviceDomainGrpcName}.service.port:${grpcPort}}
</#list>