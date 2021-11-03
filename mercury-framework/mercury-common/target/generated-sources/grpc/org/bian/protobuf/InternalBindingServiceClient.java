package org.bian.protobuf;

import java.util.function.BiFunction;

import io.quarkus.grpc.runtime.MutinyClient;

@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: binding.proto")
public class InternalBindingServiceClient implements InternalBindingService, MutinyClient<MutinyInternalBindingServiceGrpc.MutinyInternalBindingServiceStub> {

    private final MutinyInternalBindingServiceGrpc.MutinyInternalBindingServiceStub stub;

    public InternalBindingServiceClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyInternalBindingServiceGrpc.MutinyInternalBindingServiceStub, MutinyInternalBindingServiceGrpc.MutinyInternalBindingServiceStub> stubConfigurator) {
       this.stub = stubConfigurator.apply(name,MutinyInternalBindingServiceGrpc.newMutinyStub(channel));
    }

    private InternalBindingServiceClient(MutinyInternalBindingServiceGrpc.MutinyInternalBindingServiceStub stub) {
       this.stub = stub;
    }

    public InternalBindingServiceClient newInstanceWithStub(MutinyInternalBindingServiceGrpc.MutinyInternalBindingServiceStub stub) {
        return new InternalBindingServiceClient(stub);
    }

    @Override
    public MutinyInternalBindingServiceGrpc.MutinyInternalBindingServiceStub getStub() {
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

}