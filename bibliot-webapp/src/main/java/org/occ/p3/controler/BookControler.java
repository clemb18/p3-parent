package org.occ.p3.controler;

import org.occ.p3.model.Work;
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

    public @ResponseBody
	Work sayHello (@PathVariable Integer bookId) {
        return bookService.getBookById(bookId);
    }	

	@RequestMapping(value = "/works/create", method = RequestMethod.POST)
	public @ResponseBody
	Work saveNewBook(@RequestParam("title") String bookTitle, @RequestParam("author") String bookAuthor) {

		Work bookToSave = new Work();
		bookToSave.setTitle(bookTitle);
		bookToSave.setAuthor(bookAuthor);
		
		//Appeler le service qui fait ce traitement
		Work bookToReturn = bookService.saveNewBook(bookToSave);
		
		return bookToReturn;
	}
	
	
	
}
