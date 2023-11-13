package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Optional;
import com.example.demo.service;
import com.example.demo.modelveritabani;

@RestController
@RequestMapping("/books")
public class BookController 
{
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) 
	{
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() 
	{
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) 
	{
        Optional<Book> book = bookService.getBookById(id);
        return book.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) 
	{
        return bookService.createBook(book);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) 
	{
        Book book = bookService.updateBook(id, updatedBook);
        return book != null ? ResponseEntity.ok(book) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) 
	{
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
}