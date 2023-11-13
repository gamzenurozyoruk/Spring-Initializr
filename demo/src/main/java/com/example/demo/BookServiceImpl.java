package com.example.demo.grpc;

import io.grpc.stub.StreamObserver;
import com.example.demo.model.BookRequest;
import com.example.demo.model.BookResponse;
import com.example.demo.model.BookList;

public class BookServiceImpl extends BookServiceGrpc.BookServiceImplBase {
    @Override
    public void addBook(BookRequest request, StreamObserver<BookResponse> responseObserver) 
	{
        // Book eklemek için gerekli işlemleri burada gerçekleştirin.
        BookResponse response = BookResponse.newBuilder()
            .setMessage("Book added successfully")
            .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

	@Override
    public void updateBook(BookRequest request, StreamObserver<BookResponse> responseObserver) {
        // Kitabı güncellemek için gerekli işlemleri burada gerçekleştirin.
        BookResponse response = BookResponse.newBuilder()
            .setMessage("Book updated successfully")
            .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteBook(BookRequest request, StreamObserver<BookResponse> responseObserver) {
        // Kitabı silmek için gerekli işlemleri burada gerçekleştirin.
        BookResponse response = BookResponse.newBuilder()
            .setMessage("Book deleted successfully")
            .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

	@Override
    public void listBooks(Empty request, StreamObserver<BookList> responseObserver) {
        // Tüm kitapları listeleme işlemini burada gerçekleştirin.
        BookList.Builder bookListBuilder = BookList.newBuilder();
        for (Book book : bookList) {
            bookListBuilder.addBooks(book);
        }

        BookList bookListResponse = bookListBuilder.build();

        responseObserver.onNext(bookListResponse);
        responseObserver.onCompleted();
    }
}