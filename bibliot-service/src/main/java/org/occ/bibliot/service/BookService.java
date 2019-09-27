package org.occ.bibliot.service;

import org.occ.bibliot.model.beans.Book;


public interface BookService {

	public Book getBookById(Integer bookId);

	public Book saveNewBook(Book book);

}
