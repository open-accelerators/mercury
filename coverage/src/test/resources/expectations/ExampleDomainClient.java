package com.redhat.mercury.exampledomain.v10.client;

import javax.enterprise.context.ApplicationScoped;

import com.redhat.mercury.exampledomain.v10.api.crexampleservice.CRExampleService;
import io.quarkus.grpc.GrpcClient;
import lombok.Getter;

@ApplicationScoped
@Getter
public class ExampleDomainClient {

    @GrpcClient("example-domain-cr-example")
    CRExampleService crExampleService;

}