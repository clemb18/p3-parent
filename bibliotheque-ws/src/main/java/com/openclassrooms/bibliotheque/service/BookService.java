package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.Book;


public interface BookService {

    Book getBookById(Integer bookId);

    Book saveNewBook(Book book);

    Book deleteBook(Integer bookId);

    Book create(com.openclassrooms.projects.bibliot.Book book);

}
