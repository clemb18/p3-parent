package com.openclassrooms.bibliotheque.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="T_WORK")
public class Work implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id

	@Column(name = "W_ID")
	private Long id;

	@Column(name = "W_TITLE")
	private String title;

	@Column(name = "W_AUTHOR")
	private String author;

	@Column(name = "W_PUBLICATION_DATE")
	private Date publicationDate;

	@Column(name = "W_DESCRIPTION")
	private String bookDescription;

	@OneToMany(fetch=FetchType.EAGER)
	private List<Book> booksList;

	public Work() {
		super();
	}

	public Work(String title, String author){
		this.title = title;
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	public List<Book> getBooksList() {
		return booksList;
	}

	public void setBooksList(List<Book> booksList) {
		this.booksList = booksList;
	}

}
