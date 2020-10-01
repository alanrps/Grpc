
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 *
 * @author rodrigo
 */
public class Client {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 7777)
                .usePlaintext()
                .build();
        
        GerenciadorDeNotasGrpc.GerenciadorDeNotasBlockingStub stub = 
                GerenciadorDeNotasGrpc.newBlockingStub(channel);
        
        Requisicao request = Requisicao
                .newBuilder()
                .setOpCode("Luffy")
                .build();
        
        //chamada remota
        Resposta reply = stub.mensagem(request);
        
        System.out.println("Resposta: " + reply.getMessage());
        channel.shutdown();
    }
}
