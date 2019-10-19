package org.occ.bibliot.service.impl;

import org.occ.bibliot.repository.BookRepository;
import org.occ.bibliot.model.beans.Book;
import org.occ.bibliot.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BookServiceImpl implements BookService {

	private static Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);



	@Autowired
	BookRepository bookRepository;

	public Book getBookById(Integer bookId) {
		//On fait des traitement si nécessaire

		/// Appeler le consumer adéquat
		Book bookGotFromConsumer = bookRepository.findById(bookId).get();

		return bookGotFromConsumer;
	}

	public String test() {
		return "Oui le service répond";
	}


	public Book saveNewBook(Book book) {
		logger.info("enregistrement d'un nouveau livre: {}", book);
		//Vérifier que tu es authentifié

		//Vérifier que tu es habilité à faire cette opération

		//Appeler le consumer pour sauvegarder
		Book bookSaved = bookRepository.save(book);

		return bookSaved;
	}
}
