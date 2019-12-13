package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.Book;


public interface BookService {

    Book getBookById(Long bookId);

    Book deleteBook(Long bookId);

    Book create(Book book);

}
