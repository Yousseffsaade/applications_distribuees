package MyLab1;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class HelloClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        HelloServiceGrpc.HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(channel);

        HelloRequest request = HelloRequest.newBuilder()
                .setGreeting("Bonjour depuis le client !")
                .build();

        HelloResponse response = stub.sayHello(request);
        System.out.println("✅ Réponse du serveur : " + response.getReply());

        channel.shutdown();
    }
}
