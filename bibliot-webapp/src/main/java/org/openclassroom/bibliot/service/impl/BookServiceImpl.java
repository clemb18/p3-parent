package org.openclassroom.bibliot.service.impl;

import org.openclassroom.bibliot.repository.BookRepository;
import org.occ.model.beans.Book;
import org.openclassroom.bibliot.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class BookServiceImpl implements BookService {

	private static Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);



	@Autowired
	BookRepository bookRepository;

	public Book getBookById(Integer bookId) {

		return bookRepository.findById(bookId).get();
	}

	public String test() {
		return "Oui le service répond";
	}


	public Book saveNewBook(Book book) {
		logger.info("enregistrement d'un nouveau livre: {}", book);

		return bookRepository.save(book);
	}

	public Book deleteBook(Integer bookId) {
		logger.info("suppression d'un livre: {}", bookId);

		return bookRepository.delete(bookId);
	}
}
