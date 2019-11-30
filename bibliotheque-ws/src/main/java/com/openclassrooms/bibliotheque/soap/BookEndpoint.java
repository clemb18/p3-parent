package com.openclassrooms.bibliotheque.soap;

import com.openclassrooms.bibliotheque.models.Book;
import com.openclassrooms.bibliotheque.service.BookService;
import com.openclassrooms.projects.bibliot.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import static com.openclassrooms.projects.bibliot.Status.NOT_FOUND;
import static com.openclassrooms.projects.bibliot.Status.SUCCESS;

@Endpoint
public class BookEndpoint {

    private static final String NAMESPACE_URI = "http://openclassrooms.com/projects/bibliotheque";

    @Autowired
    private BookService bookService;


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookByIdRequest")
    @ResponsePayload
    public GetBookByIdResponse getBookById(@RequestPayload GetBookByIdRequest request) {
        GetBookByIdResponse response = new GetBookByIdResponse();
        ServiceStatus serviceStatus = new ServiceStatus();
        Book book = bookService.getBookById(request.getId());
        if (book == null) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            BookWs bookWs = new BookWs();
            BeanUtils.copyProperties(book, bookWs);
            response.setBookWs(bookWs);
        }
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createWorkRequest")
    @ResponsePayload
    public CreateBookResponse createBook(@RequestPayload CreateBookRequest request) {
        CreateBookResponse createBookResponse = new CreateBookResponse();
        ServiceStatus serviceStatus = new ServiceStatus();
        Book book = new Book();
        BeanUtils.copyProperties(request.getBookWs(), book);
        Book bookCreated = bookService.create(book);
        if (bookCreated == null) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            BookWs bookWs = new BookWs();
            BeanUtils.copyProperties(bookCreated, bookWs);
            createBookResponse.setBookWs(bookWs);
        }
        createBookResponse.setServiceStatus(serviceStatus);
        return createBookResponse;
    }
}

