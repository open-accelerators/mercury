package org.bian.protobuf;

import java.util.function.BiFunction;

import io.quarkus.grpc.runtime.MutinyClient;

@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: binding.proto")
public class OutboundBindingServiceClient implements OutboundBindingService, MutinyClient<MutinyOutboundBindingServiceGrpc.MutinyOutboundBindingServiceStub> {

    private final MutinyOutboundBindingServiceGrpc.MutinyOutboundBindingServiceStub stub;

    public OutboundBindingServiceClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyOutboundBindingServiceGrpc.MutinyOutboundBindingServiceStub, MutinyOutboundBindingServiceGrpc.MutinyOutboundBindingServiceStub> stubConfigurator) {
       this.stub = stubConfigurator.apply(name,MutinyOutboundBindingServiceGrpc.newMutinyStub(channel));
    }

    private OutboundBindingServiceClient(MutinyOutboundBindingServiceGrpc.MutinyOutboundBindingServiceStub stub) {
       this.stub = stub;
    }

    public OutboundBindingServiceClient newInstanceWithStub(MutinyOutboundBindingServiceGrpc.MutinyOutboundBindingServiceStub stub) {
        return new OutboundBindingServiceClient(stub);
    }

    @Override
    public MutinyOutboundBindingServiceGrpc.MutinyOutboundBindingServiceStub getStub() {
       return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> query(io.cloudevents.v1.proto.CloudEvent request) {
       return stub.query(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> command(io.cloudevents.v1.proto.CloudEvent request) {
       return stub.command(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> notify(io.cloudevents.v1.proto.CloudEvent request) {
       return stub.notify(request);
    }

}