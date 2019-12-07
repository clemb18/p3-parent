package com.openclassrooms.bibliotheque.repository;


import com.openclassrooms.bibliotheque.models.Book;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface BookRepository extends CrudRepository<Book, Integer> {

    Book delete(Integer bookId);

   // Book save(Book book);

    Optional<Book> findById(Integer bookId);

    com.openclassrooms.projects.bibliot.Book save(Book book);
}
