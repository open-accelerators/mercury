package ${package}.${sdNameLowerCase}.services.client;

import javax.enterprise.context.ApplicationScoped;

import org.bian.protobuf.BindingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ${package}.${sdNameLowerCase}.services.${sdName}Api;

import io.quarkus.grpc.GrpcClient;

@ApplicationScoped
public class ${sdName}Client implements ${sdName}Api {

    private static final Logger LOGGER = LoggerFactory.getLogger(${sdName}Client.class);

    @GrpcClient("${sdArtifactId}")
    BindingService bindingService;

}
