package org.occ.p3.service;

import org.occ.p3.consumer.repository.BookRepository;
import org.occ.p3.model.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;
	
	public Work getBookById(Integer bookId) {
		//On fait des traitement si nécessaire
	
		/// Appeler le consumer adéquat
		Work bookGotFromConsumer = bookRepository.findById(bookId).get();
		
		return bookGotFromConsumer;
	}
	
	public String test() {
		return "Oui le service répond";
	}
	
	public Work saveNewBook(Work book) {
		//Vérifier que tu es authentifié
		
		//Vérifier que tu es habilité à faire cette opération
		
		//Appeler le consumer pour sauvegarder
		Work bookSaved = bookRepository.save(book);
		
		return bookSaved;
	}
}
