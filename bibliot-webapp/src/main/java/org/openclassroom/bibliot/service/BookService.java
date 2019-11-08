package org.openclassroom.bibliot.service;

import org.occ.model.beans.Book;


public interface BookService {

	public Book getBookById(Integer bookId);

	public Book saveNewBook(Book book);

	public Book deleteBook(Integer bookId);

}
