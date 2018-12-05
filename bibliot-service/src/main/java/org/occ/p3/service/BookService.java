package org.occ.p3.service;

import org.occ.p3.model.Work;

public interface BookService {

	public Work getBookById(Integer bookId);
	
	public Work saveNewBook(Work book);
	
}
