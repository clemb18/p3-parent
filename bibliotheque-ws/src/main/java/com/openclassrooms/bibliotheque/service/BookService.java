package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.Book;
import com.openclassrooms.projects.bibliotheque.BookWs;


public interface BookService {

    Book getBookById(Long bookId);

    Book deleteBook(Long bookId);

    Book create(BookWs book);

}
