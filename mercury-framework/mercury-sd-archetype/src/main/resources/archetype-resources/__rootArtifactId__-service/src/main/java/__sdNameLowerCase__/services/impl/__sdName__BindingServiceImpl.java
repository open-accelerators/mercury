package ${package}.${sdNameLowerCase}.services.impl;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Empty;
import com.google.protobuf.Message;
import ${package}.${sdNameLowerCase}.services.${sdName}Service;
import com.redhat.mercury.common.services.impl.BaseBindingService;
import com.redhat.mercury.exceptions.MappingNotFoundException;

import io.cloudevents.v1.proto.CloudEvent;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

import static ${package}.${sdNameLowerCase}.${sdName}.DOMAIN_NAME;

@GrpcService
public class ${sdName}BindingServiceImpl extends BaseBindingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(${sdName}BindingServiceImpl.class);

    @Inject
    ${sdName}Service service;

    protected Uni<Message> mapQueryMethod(CloudEvent cloudEvent) {
        switch (cloudEvent.getType()) {
            //TODO: Add mappings
        }
        return Uni.createFrom().failure(new MappingNotFoundException(cloudEvent.getType()));
    }

    protected Uni<Empty> mapCommandMethod(CloudEvent cloudEvent) {
        switch (cloudEvent.getType()) {
            //TODO: Add mappings
        }
        return Uni.createFrom().failure(new MappingNotFoundException(cloudEvent.getType()));
    }

    @Override
    protected String getDomainName() {
        return DOMAIN_NAME;
    }
}
