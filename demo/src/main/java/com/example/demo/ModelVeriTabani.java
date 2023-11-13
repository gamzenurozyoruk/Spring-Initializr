package com.example.demo.modelveritabani;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Book 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    private String title;
    private String author;
    private int publicationYear;

    
	public String getTitle() //title erişme 
	{
        return title;
    }

    // Setter metodu - title özelliğini değiştirme
    public void setTitle(String title) 
	{
        this.title = title;
    }


	// Setter metodu - author özelliğini değiştirme
    public void setAuthor(String title) 
	{
        this.author = author;
    }

    	public String getAuthor() //author erişme 
	{
        return author;
    }


		// Setter metodu - publicationYear özelliğini değiştirme
    public void setPublicationYear(String title) 
	{
        this.publicationYear = publicationYear;
    }

    	public String getPublicationYear() //publicationYear erişme 
	{
        return publicationYear;
    }


}