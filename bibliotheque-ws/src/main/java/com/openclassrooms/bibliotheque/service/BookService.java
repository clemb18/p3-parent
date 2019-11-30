package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.BookModelWs;


public interface BookService {

    BookModelWs getBookById(Integer bookId);

    BookModelWs saveNewBook(BookModelWs book);

    BookModelWs deleteBook(Integer bookId);

    BookModelWs create(com.openclassrooms.projects.bibliot.Book book);

}
