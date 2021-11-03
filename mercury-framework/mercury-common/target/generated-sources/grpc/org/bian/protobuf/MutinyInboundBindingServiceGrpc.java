package org.bian.protobuf;

import static org.bian.protobuf.InboundBindingServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: binding.proto")
public final class MutinyInboundBindingServiceGrpc implements io.quarkus.grpc.runtime.MutinyGrpc {
    private MutinyInboundBindingServiceGrpc() {}

    public static MutinyInboundBindingServiceStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyInboundBindingServiceStub(channel);
    }

    
    public static final class MutinyInboundBindingServiceStub extends io.grpc.stub.AbstractStub<MutinyInboundBindingServiceStub> implements io.quarkus.grpc.runtime.MutinyStub {
        private InboundBindingServiceGrpc.InboundBindingServiceStub delegateStub;

        private MutinyInboundBindingServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = InboundBindingServiceGrpc.newStub(channel);
        }

        private MutinyInboundBindingServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = InboundBindingServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyInboundBindingServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyInboundBindingServiceStub(channel, callOptions);
        }

        
        public io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> query(io.cloudevents.v1.proto.CloudEvent request) {
            return io.quarkus.grpc.runtime.ClientCalls.oneToOne(request, delegateStub::query);
        }

        
        public io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> command(io.cloudevents.v1.proto.CloudEvent request) {
            return io.quarkus.grpc.runtime.ClientCalls.oneToOne(request, delegateStub::command);
        }

        
        public io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> receive(io.cloudevents.v1.proto.CloudEvent request) {
            return io.quarkus.grpc.runtime.ClientCalls.oneToOne(request, delegateStub::receive);
        }

        /**
         * <pre>
         *  In order to avoid having the BindingSvc depending on all types only for external requests
         *  this method is used
         * </pre>
         */
        public io.smallrye.mutiny.Uni<org.bian.protobuf.ExternalResponse> external(org.bian.protobuf.ExternalRequest request) {
            return io.quarkus.grpc.runtime.ClientCalls.oneToOne(request, delegateStub::external);
        }

    }

    
    public static abstract class InboundBindingServiceImplBase implements io.grpc.BindableService {

        private String compression;
        /**
        * Set whether the server will try to use a compressed response.
        *
        * @param compression the compression, e.g {@code gzip}
        */
        public InboundBindingServiceImplBase withCompression(String compression) {
        this.compression = compression;
        return this;
        }


        
        public io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> query(io.cloudevents.v1.proto.CloudEvent request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> command(io.cloudevents.v1.proto.CloudEvent request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        
        public io.smallrye.mutiny.Uni<io.cloudevents.v1.proto.CloudEvent> receive(io.cloudevents.v1.proto.CloudEvent request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  In order to avoid having the BindingSvc depending on all types only for external requests
         *  this method is used
         * </pre>
         */
        public io.smallrye.mutiny.Uni<org.bian.protobuf.ExternalResponse> external(org.bian.protobuf.ExternalRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            org.bian.protobuf.InboundBindingServiceGrpc.getQueryMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            io.cloudevents.v1.proto.CloudEvent,
                                            io.cloudevents.v1.proto.CloudEvent>(
                                            this, METHODID_QUERY, compression)))
                    .addMethod(
                            org.bian.protobuf.InboundBindingServiceGrpc.getCommandMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            io.cloudevents.v1.proto.CloudEvent,
                                            io.cloudevents.v1.proto.CloudEvent>(
                                            this, METHODID_COMMAND, compression)))
                    .addMethod(
                            org.bian.protobuf.InboundBindingServiceGrpc.getReceiveMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            io.cloudevents.v1.proto.CloudEvent,
                                            io.cloudevents.v1.proto.CloudEvent>(
                                            this, METHODID_RECEIVE, compression)))
                    .addMethod(
                            org.bian.protobuf.InboundBindingServiceGrpc.getExternalMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            org.bian.protobuf.ExternalRequest,
                                            org.bian.protobuf.ExternalResponse>(
                                            this, METHODID_EXTERNAL, compression)))
                    .build();
        }
    }

    private static final int METHODID_QUERY = 0;
    private static final int METHODID_COMMAND = 1;
    private static final int METHODID_RECEIVE = 2;
    private static final int METHODID_EXTERNAL = 3;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final InboundBindingServiceImplBase serviceImpl;
        private final int methodId;
        private final String compression;

        MethodHandlers(InboundBindingServiceImplBase serviceImpl, int methodId, String compression) {
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
                case METHODID_RECEIVE:
                    io.quarkus.grpc.runtime.ServerCalls.oneToOne((io.cloudevents.v1.proto.CloudEvent) request,
                            (io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent>) responseObserver,
                            compression,
                            serviceImpl::receive);
                    break;
                case METHODID_EXTERNAL:
                    io.quarkus.grpc.runtime.ServerCalls.oneToOne((org.bian.protobuf.ExternalRequest) request,
                            (io.grpc.stub.StreamObserver<org.bian.protobuf.ExternalResponse>) responseObserver,
                            compression,
                            serviceImpl::external);
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