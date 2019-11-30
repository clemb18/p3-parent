package com.openclassrooms.bibliotheque.soap;

import com.openclassrooms.bibliotheque.models.BookModelWs;
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
            Book bookResult = new Book();
            BeanUtils.copyProperties(book, bookResult);
            response.setBook(bookResult);
        }
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createWorkRequest")
    @ResponsePayload
    public CreateBookResponse createBook(@RequestPayload CreateBookRequest request) {
        CreateBookResponse createBookResponse = new CreateBookResponse();
        ServiceStatus serviceStatus = new ServiceStatus();
        BookModelWs bookCreated = bookService.create(request.getBook());
        if (bookCreated == null) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            Book bookResult = new Book();
            BeanUtils.copyProperties(bookCreated, bookResult);
            createBookResponse.setBook(bookResult);
        }
        createBookResponse.setServiceStatus(serviceStatus);
        return createBookResponse;
    }
}

