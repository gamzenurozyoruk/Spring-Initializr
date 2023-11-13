package com.example.demo.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.example.demo.grpc;

public class BookServiceClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080) // Sunucu lokal host adresi ve port numarası
            .usePlaintext() //şifresiz iletişim
            .build();

        BookServiceGrpc.BookServiceBlockingStub stub = BookServiceGrpc.newBlockingStub(channel);

        BookRequest request = BookRequest.newBuilder()
            .setTitle("Sample Book")
            .setAuthor("Sample Author")
            .build();

        BookResponse response = stub.addBook(request); // methodu çağırıyoruz

        System.out.println("Server Response: " + response.getMessage());

        // Kitap güncellemek için
        BookRequest updateRequest = BookRequest.newBuilder()
            .setTitle("Updated Book")
            .setAuthor("Updated Author")
            .build();
        BookResponse updateResponse = stub.updateBook(updateRequest);
        System.out.println("Update Book Response: " + updateResponse.getMessage());

        // Kitap silmek için
        BookRequest deleteRequest = BookRequest.newBuilder()
            .setTitle("Sample Book")
            .setAuthor("Sample Author")
            .build();
        BookResponse deleteResponse = stub.deleteBook(deleteRequest);
        System.out.println("Delete Book Response: " + deleteResponse.getMessage());

        // Tüm kitapları listelemek için
        Empty listRequest = Empty.newBuilder().build();
        BookList bookList = stub.listBooks(listRequest);
        System.out.println("List of Books:");
        for (Book book : bookList.getBooksList()) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }


        channel.shutdown();
    }
}