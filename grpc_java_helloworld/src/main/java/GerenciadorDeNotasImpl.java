
import io.grpc.stub.StreamObserver;

/**
 *
 * @author rodrigo
 */

public class GerenciadorDeNotasImpl extends GerenciadorDeNotasGrpc.GerenciadorDeNotasImplBase {

    @Override
    public void mensagem(Requisicao request, StreamObserver<Resposta> responseObserver) {
        System.out.println("Recebido: " + request.getOpCode());
        Resposta response = Resposta.newBuilder()
                .setMessage("Olá, recebi sua mensagem.")
                .build();
        
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    
    
}
