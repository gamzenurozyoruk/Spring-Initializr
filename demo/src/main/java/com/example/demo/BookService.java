package com.example.demo.service;

import com.example.demo.modelveritabani;
import com.example.demo.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService 
{
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) 
	{
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() 
	{
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) 
	{
        return bookRepository.findById(id);
    }

    public Book createBook(Book book) 
	{
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book updatedBook) 
	{
        if (bookRepository.existsById(id)) {
            updatedBook.setId(id);
            return bookRepository.save(updatedBook);
        }
        return null; // Kitap bulunamadı hatası veya başka bir hata durumu
    }

    public void deleteBook(Long id) 
	{
        bookRepository.deleteById(id);
    }
}