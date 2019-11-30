package com.openclassrooms.bibliotheque.repository;


import com.openclassrooms.bibliotheque.models.BookModelWs;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface BookRepository extends CrudRepository<BookModelWs, Integer>{

    BookModelWs delete(Integer bookId);

   // Book save(Book book);

    Optional<BookModelWs> findById(Integer bookId);

    com.openclassrooms.projects.bibliot.Book save(BookModelWs book);
}
