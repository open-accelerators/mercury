package ${package}.${sdNameLowerCase}.v10.client;

import javax.enterprise.context.ApplicationScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.quarkus.grpc.GrpcClient;

@ApplicationScoped
public class ${sdName}Client {

    private static final Logger LOGGER = LoggerFactory.getLogger(${sdName}Client.class);


}
