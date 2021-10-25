package ${package}.${sdNameLowerCase}.services.impl;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;

import org.bian.protobuf.OutboundBindingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ${package}.${sdNameLowerCase}.services.${sdName}NotificationService;

import io.quarkus.grpc.GrpcClient;

@ApplicationScoped
public class ${sdName}NotificationServiceImpl extends ${sdName}NotificationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(${sdName}NotificationServiceImpl.class);

    @GrpcClient("outboundBindingService")
    OutboundBindingService outbound;

}
