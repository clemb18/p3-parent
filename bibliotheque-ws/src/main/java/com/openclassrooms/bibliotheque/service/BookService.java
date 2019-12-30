package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.Book;
import com.openclassrooms.projects.bibliot.BookWs;


public interface BookService {

    Book getBookById(Long bookId);

    Book deleteBook(Long bookId);

    Book create(BookWs book);

}
