package org.occ.p3.serviceWeb;

import org.occ.p3.model.Book;
import org.occ.p3.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import static javax.jws.soap.SOAPBinding.Style.DOCUMENT;
import static javax.jws.soap.SOAPBinding.Use.LITERAL;

@Service
@WebService(serviceName = "bookWeb", name = "bookWs")
@SOAPBinding(style = DOCUMENT, use = LITERAL)
public class BookWs {

    @Autowired
    BookService bookService;

    @WebMethod
    public Book getBookById(Integer bookId) {
        return bookService.getBookById(bookId);
    }

    @WebMethod
    public Book saveNewBook(Book book) {
        return bookService.saveNewBook(book);
    }

    @WebMethod
    @PostConstruct
    public void init() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }
}
