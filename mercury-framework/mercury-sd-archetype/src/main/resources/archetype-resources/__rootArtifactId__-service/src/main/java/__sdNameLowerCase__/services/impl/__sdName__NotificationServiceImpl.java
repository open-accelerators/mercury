package ${package}.${sdNameLowerCase}.services.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ${package}.${sdNameLowerCase}.${sdName};
import ${package}.${sdNameLowerCase}.services.${sdName}NotificationService;

@ApplicationScoped
public class ${sdName}NotificationServiceImpl extends ${sdName}NotificationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(${sdName}NotificationServiceImpl.class);

    @Inject
    @Channel(${sdName}.DOMAIN_NAME)
    Emitter<com.google.protobuf.Message> emitter;

}
