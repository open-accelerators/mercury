package com.redhat.mercury.advertising.services.client;

import javax.enterprise.context.ApplicationScoped;

import org.bian.protobuf.OutboundBindingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.mercury.advertising.services.AdvertisingService;

import io.quarkus.grpc.GrpcClient;

@ApplicationScoped
public class AdvertisingClient extends AdvertisingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdvertisingClient.class);

    @GrpcClient
    OutboundBindingService outboundBindingService;

}
