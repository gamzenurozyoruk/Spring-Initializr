package com.example.demo.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class BookServiceServer {
    public static void main(String[] args) throws Exception 
	{
        Server server = ServerBuilder.forPort(8080) // Port numarasını istediğiniz bir numara ile değiştirin.
            .addService(new BookServiceImpl()) // BookServiceImpl, gRPC servisinizi uyguladığınız sınıfın adıdır.
            .build();

        server.start();
        server.awaitTermination();
    }
}
