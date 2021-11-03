package org.bian.protobuf;

import static org.bian.protobuf.InternalBindingServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: binding.proto")
public final class MutinyInternalBindingServiceGrpc implements io.quarkus.grpc.runtime.MutinyGrpc {
    private MutinyInternalBindingServiceGrpc() {}

    public static MutinyInternalBindingServiceStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyInternalBindingServiceStub(channel);
    }

    
    public static final class MutinyInternalBindingServiceStub extends io.grpc.stub.AbstractStub<MutinyInternalBindingServiceStub> implements io.quarkus.grpc.runtime.MutinyStub {
        private InternalBindingServiceGrpc.InternalBindingServiceStub delegateStub;

        private MutinyInternalBindingServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = InternalBindingServiceGrpc.newStub(channel);
        }

        private MutinyInternalBindingServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = InternalBindingServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyInternalBindingServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyInternalBindingServiceStub(channel, callOptions);
        }

        
        public io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> query(io.cloudevents.v1.proto.CloudEvent request) {
            return io.quarkus.grpc.runtime.ClientCalls.oneToOne(request, delegateStub::query);
        }

        
        public io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> command(io.cloudevents.v1.proto.CloudEvent request) {
            return io.quarkus.grpc.runtime.ClientCalls.oneToOne(request, delegateStub::command);
        }

    }

    
    public static abstract class InternalBindingServiceImplBase implements io.grpc.BindableService {

        private String compression;
        /**
        * Set whether the server will try to use a compressed response.
        *
        * @param compression the compression, e.g {@code gzip}
        */
        public InternalBindingServiceImplBase withCompression(String compression) {
        this.compression = compression;
        return this;
        }


        
        public io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> query(io.cloudevents.v1.proto.CloudEvent request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> command(io.cloudevents.v1.proto.CloudEvent request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            org.bian.protobuf.InternalBindingServiceGrpc.getQueryMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            io.cloudevents.v1.proto.CloudEvent,
                                            io.cloudevents.v1.proto.CloudEvent>(
                                            this, METHODID_QUERY, compression)))
                    .addMethod(
                            org.bian.protobuf.InternalBindingServiceGrpc.getCommandMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            io.cloudevents.v1.proto.CloudEvent,
                                            io.cloudevents.v1.proto.CloudEvent>(
                                            this, METHODID_COMMAND, compression)))
                    .build();
        }
    }

    private static final int METHODID_QUERY = 0;
    private static final int METHODID_COMMAND = 1;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final InternalBindingServiceImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(InternalBindingServiceImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_QUERY:
                    io.quarkus.grpc.runtime.ServerCalls.oneToOne((io.cloudevents.v1.proto.CloudEvent) request,
                            (io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent>) responseObserver,
                            compression,
                            serviceImpl::query);
                    break;
                case METHODID_COMMAND:
                    io.quarkus.grpc.runtime.ServerCalls.oneToOne((io.cloudevents.v1.proto.CloudEvent) request,
                            (io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent>) responseObserver,
                            compression,
                            serviceImpl::command);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}