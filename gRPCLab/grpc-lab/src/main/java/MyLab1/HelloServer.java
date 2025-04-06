package MyLab1;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class HelloServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new HelloServiceImpl())
                .build();

        server.start();
        System.out.println("✅ Serveur gRPC lancé sur le port 8080");
        server.awaitTermination();
    }

    static class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {
        @Override
        public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
            String greeting = request.getGreeting();
            String reply = "👋 Hello from server! You said: " + greeting;

            HelloResponse response = HelloResponse.newBuilder()
                    .setReply(reply)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
