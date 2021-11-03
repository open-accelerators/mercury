package ${package}.${sdNameLowerCase}.services.client;

import javax.enterprise.context.ApplicationScoped;

import org.bian.protobuf.OutboundBindingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ${package}.${sdNameLowerCase}.services.${sdName}Service;

import io.quarkus.grpc.GrpcClient;
import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class ${sdName}Client extends ${sdName}Service {

    private static final Logger LOGGER = LoggerFactory.getLogger(${sdName}Client.class);

    @GrpcClient
    OutboundBindingService outbound;

}
