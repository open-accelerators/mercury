package com.redhat.mercury.partyroutingprofile.services.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Message;
import com.redhat.mercury.partyroutingprofile.PartyRoutingProfile;
import com.redhat.mercury.partyroutingprofile.services.PartyRoutingProfileNotificationService;

@ApplicationScoped
public class PartyRoutingProfileNotificationServiceImpl extends PartyRoutingProfileNotificationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PartyRoutingProfileNotificationServiceImpl.class);

    @Inject
    @Channel(PartyRoutingProfile.DOMAIN_NAME)
    Emitter<Message> emitter;
}
