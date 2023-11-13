
package com.example.demo.repository;

import com.example.demo.modelveritabani;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> 
{

 // Kitap adına göre kitapları bulmak için özel bir sorgu
 List<Book> findByTitle(String title);

}