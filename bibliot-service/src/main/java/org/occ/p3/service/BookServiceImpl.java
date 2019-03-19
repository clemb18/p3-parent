package org.occ.p3.service;

import org.occ.p3.consumer.repository.BookRepository;
import org.occ.p3.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;
	
	public Book getBookById(Integer bookId) {
		//On fait des traitement si nécessaire
	
		/// Appeler le consumer adéquat
		Book bookGotFromConsumer = bookRepository.findById(bookId).get();
		
		return bookGotFromConsumer;
	}
	
	public Book saveNewBook(Book book) {

		Book bookSaved = bookRepository.save(book);
		
		return bookSaved;
	}
}
