package org.occ.p3.webservice;

import org.occ.p3.model.Book;
import org.occ.p3.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@Service
@WebService(serviceName = "BookWeb", name = "WsBook")
@SOAPBinding
public class WsBook {

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
