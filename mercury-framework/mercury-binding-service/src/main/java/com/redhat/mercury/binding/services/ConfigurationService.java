package com.redhat.mercury.binding.services;

import java.util.Map;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;

import org.apache.camel.Header;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.constants.BianCloudEvent;

import io.cloudevents.v1.proto.CloudEvent;
import io.quarkus.runtime.Startup;
import io.quarkus.runtime.annotations.RegisterForReflection;

@Startup
@ApplicationScoped
@RegisterForReflection
public class ConfigurationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigurationService.class);
    private static final Integer DEFAULT_SVC_PORT = 9000;

    @ConfigProperty(name = "mercury.services.overrides")
    Map<String, String> svcEndpoints;

    @ConfigProperty(name = "mercury.business.service.port")
    Optional<Integer> businessSvcPort;

    public String getBusinessBindingEndpoint(CloudEvent cloudEvent, @Header("CamelGrpcMethodName") String method) {
        String serviceDomain = cloudEvent.getAttributesOrThrow(BianCloudEvent.CE_SERVICE_DOMAIN).getCeString();
        String endpoint = serviceDomain + ":" + businessSvcPort.orElse(DEFAULT_SVC_PORT);
        if (svcEndpoints.containsKey(serviceDomain)) {
            endpoint = svcEndpoints.get(serviceDomain);
        }
        LOGGER.debug("CloudEvent from {} to {} with method {}. Using endpoint: {}", cloudEvent.getSource(), serviceDomain, method, endpoint);
        return "grpc://" + endpoint + "/org.bian.protobuf.BindingService?synchronous=true&method=" + method;
    }

}
