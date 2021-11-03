package org.bian.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.40.1)",
    comments = "Source: binding.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OutboundBindingServiceGrpc {

  private OutboundBindingServiceGrpc() {}

  public static final String SERVICE_NAME = "org.bian.protobuf.OutboundBindingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.cloudevents.v1.proto.CloudEvent,
      io.cloudevents.v1.proto.CloudEvent> getQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "query",
      requestType = io.cloudevents.v1.proto.CloudEvent.class,
      responseType = io.cloudevents.v1.proto.CloudEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cloudevents.v1.proto.CloudEvent,
      io.cloudevents.v1.proto.CloudEvent> getQueryMethod() {
    io.grpc.MethodDescriptor<io.cloudevents.v1.proto.CloudEvent, io.cloudevents.v1.proto.CloudEvent> getQueryMethod;
    if ((getQueryMethod = OutboundBindingServiceGrpc.getQueryMethod) == null) {
      synchronized (OutboundBindingServiceGrpc.class) {
        if ((getQueryMethod = OutboundBindingServiceGrpc.getQueryMethod) == null) {
          OutboundBindingServiceGrpc.getQueryMethod = getQueryMethod =
              io.grpc.MethodDescriptor.<io.cloudevents.v1.proto.CloudEvent, io.cloudevents.v1.proto.CloudEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "query"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudevents.v1.proto.CloudEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudevents.v1.proto.CloudEvent.getDefaultInstance()))
              .setSchemaDescriptor(new OutboundBindingServiceMethodDescriptorSupplier("query"))
              .build();
        }
      }
    }
    return getQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cloudevents.v1.proto.CloudEvent,
      io.cloudevents.v1.proto.CloudEvent> getCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "command",
      requestType = io.cloudevents.v1.proto.CloudEvent.class,
      responseType = io.cloudevents.v1.proto.CloudEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cloudevents.v1.proto.CloudEvent,
      io.cloudevents.v1.proto.CloudEvent> getCommandMethod() {
    io.grpc.MethodDescriptor<io.cloudevents.v1.proto.CloudEvent, io.cloudevents.v1.proto.CloudEvent> getCommandMethod;
    if ((getCommandMethod = OutboundBindingServiceGrpc.getCommandMethod) == null) {
      synchronized (OutboundBindingServiceGrpc.class) {
        if ((getCommandMethod = OutboundBindingServiceGrpc.getCommandMethod) == null) {
          OutboundBindingServiceGrpc.getCommandMethod = getCommandMethod =
              io.grpc.MethodDescriptor.<io.cloudevents.v1.proto.CloudEvent, io.cloudevents.v1.proto.CloudEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "command"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudevents.v1.proto.CloudEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudevents.v1.proto.CloudEvent.getDefaultInstance()))
              .setSchemaDescriptor(new OutboundBindingServiceMethodDescriptorSupplier("command"))
              .build();
        }
      }
    }
    return getCommandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.cloudevents.v1.proto.CloudEvent,
      io.cloudevents.v1.proto.CloudEvent> getNotifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "notify",
      requestType = io.cloudevents.v1.proto.CloudEvent.class,
      responseType = io.cloudevents.v1.proto.CloudEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.cloudevents.v1.proto.CloudEvent,
      io.cloudevents.v1.proto.CloudEvent> getNotifyMethod() {
    io.grpc.MethodDescriptor<io.cloudevents.v1.proto.CloudEvent, io.cloudevents.v1.proto.CloudEvent> getNotifyMethod;
    if ((getNotifyMethod = OutboundBindingServiceGrpc.getNotifyMethod) == null) {
      synchronized (OutboundBindingServiceGrpc.class) {
        if ((getNotifyMethod = OutboundBindingServiceGrpc.getNotifyMethod) == null) {
          OutboundBindingServiceGrpc.getNotifyMethod = getNotifyMethod =
              io.grpc.MethodDescriptor.<io.cloudevents.v1.proto.CloudEvent, io.cloudevents.v1.proto.CloudEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "notify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudevents.v1.proto.CloudEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.cloudevents.v1.proto.CloudEvent.getDefaultInstance()))
              .setSchemaDescriptor(new OutboundBindingServiceMethodDescriptorSupplier("notify"))
              .build();
        }
      }
    }
    return getNotifyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OutboundBindingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OutboundBindingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OutboundBindingServiceStub>() {
        @java.lang.Override
        public OutboundBindingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OutboundBindingServiceStub(channel, callOptions);
        }
      };
    return OutboundBindingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OutboundBindingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OutboundBindingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OutboundBindingServiceBlockingStub>() {
        @java.lang.Override
        public OutboundBindingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OutboundBindingServiceBlockingStub(channel, callOptions);
        }
      };
    return OutboundBindingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OutboundBindingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OutboundBindingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OutboundBindingServiceFutureStub>() {
        @java.lang.Override
        public OutboundBindingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OutboundBindingServiceFutureStub(channel, callOptions);
        }
      };
    return OutboundBindingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class OutboundBindingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void query(io.cloudevents.v1.proto.CloudEvent request,
        io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryMethod(), responseObserver);
    }

    /**
     */
    public void command(io.cloudevents.v1.proto.CloudEvent request,
        io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCommandMethod(), responseObserver);
    }

    /**
     */
    public void notify(io.cloudevents.v1.proto.CloudEvent request,
        io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNotifyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.cloudevents.v1.proto.CloudEvent,
                io.cloudevents.v1.proto.CloudEvent>(
                  this, METHODID_QUERY)))
          .addMethod(
            getCommandMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.cloudevents.v1.proto.CloudEvent,
                io.cloudevents.v1.proto.CloudEvent>(
                  this, METHODID_COMMAND)))
          .addMethod(
            getNotifyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.cloudevents.v1.proto.CloudEvent,
                io.cloudevents.v1.proto.CloudEvent>(
                  this, METHODID_NOTIFY)))
          .build();
    }
  }

  /**
   */
  public static final class OutboundBindingServiceStub extends io.grpc.stub.AbstractAsyncStub<OutboundBindingServiceStub> {
    private OutboundBindingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OutboundBindingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OutboundBindingServiceStub(channel, callOptions);
    }

    /**
     */
    public void query(io.cloudevents.v1.proto.CloudEvent request,
        io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void command(io.cloudevents.v1.proto.CloudEvent request,
        io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCommandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void notify(io.cloudevents.v1.proto.CloudEvent request,
        io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OutboundBindingServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OutboundBindingServiceBlockingStub> {
    private OutboundBindingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OutboundBindingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OutboundBindingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.cloudevents.v1.proto.CloudEvent query(io.cloudevents.v1.proto.CloudEvent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cloudevents.v1.proto.CloudEvent command(io.cloudevents.v1.proto.CloudEvent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommandMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.cloudevents.v1.proto.CloudEvent notify(io.cloudevents.v1.proto.CloudEvent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNotifyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OutboundBindingServiceFutureStub extends io.grpc.stub.AbstractFutureStub<OutboundBindingServiceFutureStub> {
    private OutboundBindingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OutboundBindingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OutboundBindingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cloudevents.v1.proto.CloudEvent> query(
        io.cloudevents.v1.proto.CloudEvent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cloudevents.v1.proto.CloudEvent> command(
        io.cloudevents.v1.proto.CloudEvent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCommandMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.cloudevents.v1.proto.CloudEvent> notify(
        io.cloudevents.v1.proto.CloudEvent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY = 0;
  private static final int METHODID_COMMAND = 1;
  private static final int METHODID_NOTIFY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OutboundBindingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OutboundBindingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY:
          serviceImpl.query((io.cloudevents.v1.proto.CloudEvent) request,
              (io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent>) responseObserver);
          break;
        case METHODID_COMMAND:
          serviceImpl.command((io.cloudevents.v1.proto.CloudEvent) request,
              (io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent>) responseObserver);
          break;
        case METHODID_NOTIFY:
          serviceImpl.notify((io.cloudevents.v1.proto.CloudEvent) request,
              (io.grpc.stub.StreamObserver<io.cloudevents.v1.proto.CloudEvent>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class OutboundBindingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OutboundBindingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.bian.protobuf.Binding.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OutboundBindingService");
    }
  }

  private static final class OutboundBindingServiceFileDescriptorSupplier
      extends OutboundBindingServiceBaseDescriptorSupplier {
    OutboundBindingServiceFileDescriptorSupplier() {}
  }

  private static final class OutboundBindingServiceMethodDescriptorSupplier
      extends OutboundBindingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OutboundBindingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (OutboundBindingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OutboundBindingServiceFileDescriptorSupplier())
              .addMethod(getQueryMethod())
              .addMethod(getCommandMethod())
              .addMethod(getNotifyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
