package org.bian.protobuf;

import java.util.function.BiFunction;

import io.quarkus.grpc.runtime.MutinyClient;

@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: binding.proto")
public class InboundBindingServiceClient implements InboundBindingService, MutinyClient<MutinyInboundBindingServiceGrpc.MutinyInboundBindingServiceStub> {

    private final MutinyInboundBindingServiceGrpc.MutinyInboundBindingServiceStub stub;

    public InboundBindingServiceClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyInboundBindingServiceGrpc.MutinyInboundBindingServiceStub, MutinyInboundBindingServiceGrpc.MutinyInboundBindingServiceStub> stubConfigurator) {
       this.stub = stubConfigurator.apply(name,MutinyInboundBindingServiceGrpc.newMutinyStub(channel));
    }

    private InboundBindingServiceClient(MutinyInboundBindingServiceGrpc.MutinyInboundBindingServiceStub stub) {
       this.stub = stub;
    }

    public InboundBindingServiceClient newInstanceWithStub(MutinyInboundBindingServiceGrpc.MutinyInboundBindingServiceStub stub) {
        return new InboundBindingServiceClient(stub);
    }

    @Override
    public MutinyInboundBindingServiceGrpc.MutinyInboundBindingServiceStub getStub() {
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
    public io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> receive(io.cloudevents.v1.proto.CloudEvent request) {
       return stub.receive(request);
    }
    @Override
    public io.smallrye.mutiny.Uni<org.bian.protobuf.ExternalResponse> external(org.bian.protobuf.ExternalRequest request) {
       return stub.external(request);
    }

}