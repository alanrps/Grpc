import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: grpc.proto")
public final class GerenciadorDeNotasGrpc {

  private GerenciadorDeNotasGrpc() {}

  public static final String SERVICE_NAME = "GerenciadorDeNotas";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<Requisicao,
      Resposta> METHOD_MENSAGEM =
      io.grpc.MethodDescriptor.<Requisicao, Resposta>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "GerenciadorDeNotas", "Mensagem"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              Requisicao.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              Resposta.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GerenciadorDeNotasStub newStub(io.grpc.Channel channel) {
    return new GerenciadorDeNotasStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GerenciadorDeNotasBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GerenciadorDeNotasBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GerenciadorDeNotasFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GerenciadorDeNotasFutureStub(channel);
  }

  /**
   */
  public static abstract class GerenciadorDeNotasImplBase implements io.grpc.BindableService {

    /**
     */
    public void mensagem(Requisicao request,
        io.grpc.stub.StreamObserver<Resposta> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MENSAGEM, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_MENSAGEM,
            asyncUnaryCall(
              new MethodHandlers<
                Requisicao,
                Resposta>(
                  this, METHODID_MENSAGEM)))
          .build();
    }
  }

  /**
   */
  public static final class GerenciadorDeNotasStub extends io.grpc.stub.AbstractStub<GerenciadorDeNotasStub> {
    private GerenciadorDeNotasStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GerenciadorDeNotasStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GerenciadorDeNotasStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GerenciadorDeNotasStub(channel, callOptions);
    }

    /**
     */
    public void mensagem(Requisicao request,
        io.grpc.stub.StreamObserver<Resposta> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MENSAGEM, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GerenciadorDeNotasBlockingStub extends io.grpc.stub.AbstractStub<GerenciadorDeNotasBlockingStub> {
    private GerenciadorDeNotasBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GerenciadorDeNotasBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GerenciadorDeNotasBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GerenciadorDeNotasBlockingStub(channel, callOptions);
    }

    /**
     */
    public Resposta mensagem(Requisicao request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MENSAGEM, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GerenciadorDeNotasFutureStub extends io.grpc.stub.AbstractStub<GerenciadorDeNotasFutureStub> {
    private GerenciadorDeNotasFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GerenciadorDeNotasFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GerenciadorDeNotasFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GerenciadorDeNotasFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Resposta> mensagem(
        Requisicao request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MENSAGEM, getCallOptions()), request);
    }
  }

  private static final int METHODID_MENSAGEM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GerenciadorDeNotasImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GerenciadorDeNotasImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MENSAGEM:
          serviceImpl.mensagem((Requisicao) request,
              (io.grpc.stub.StreamObserver<Resposta>) responseObserver);
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

  private static final class GerenciadorDeNotasDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Grpc.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GerenciadorDeNotasGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GerenciadorDeNotasDescriptorSupplier())
              .addMethod(METHOD_MENSAGEM)
              .build();
        }
      }
    }
    return result;
  }
}
