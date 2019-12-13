package com.openclassrooms.bibliotheque.repository;


import com.openclassrooms.bibliotheque.models.Book;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface BookRepository extends CrudRepository<Book, Long> {

    Book delete(Long bookId);

   // Book save(Book book);

    Optional<Book> findById(Long bookId);

    Book save(Book book);
}
