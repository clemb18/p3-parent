package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.Book;


public interface BookService {

    public Book getBookById(Integer bookId);

    public Book saveNewBook(Book book);

    public Book deleteBook(Integer bookId);

}
