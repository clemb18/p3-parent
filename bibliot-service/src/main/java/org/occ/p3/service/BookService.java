package org.occ.p3.service;

import org.occ.p3.model.Works;

public interface BookService {

	public Works getBookById(Integer bookId);
	
	public Works saveNewBook(Works book);
	
}
