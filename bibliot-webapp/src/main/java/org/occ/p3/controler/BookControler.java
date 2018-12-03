package org.occ.p3.controler;

import org.occ.p3.model.Works;
import org.occ.p3.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookControler {

	@Autowired
	BookService bookService;
	
	@RequestMapping(value = "/book/{bookId}", method = RequestMethod.GET)

    public @ResponseBody Works sayHello (@PathVariable Integer bookId) {
        return bookService.getBookById(bookId);
    }	

	@RequestMapping(value = "/works/create", method = RequestMethod.POST)
	public @ResponseBody Works saveNewBook(@RequestParam("title") String bookTitle,@RequestParam("author") String bookAuthor) {

		Works bookToSave = new Works();
		bookToSave.setTitle(bookTitle);
		bookToSave.setAuthor(bookAuthor);
		
		//Appeler le service qui fait ce traitement
		Works bookToReturn = bookService.saveNewBook(bookToSave);
		
		return bookToReturn;
	}
	
	
	
}
