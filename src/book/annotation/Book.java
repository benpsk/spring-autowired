package book.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import book.autowired.Author;

public class Book {
	
	private Integer id;
	private String name;
	private String isbn;
	private Author author;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Author getAuthor() {
		return author;
	}

	@Autowired
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public Book() {
		
	}
	
	// for auto wire = constructor
	public Book(Author author) {
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println("BookID: " + id + ", Book Name: " + name +", ISBN no. "+ isbn);
		System.out.println(author.toString());
	}

}
