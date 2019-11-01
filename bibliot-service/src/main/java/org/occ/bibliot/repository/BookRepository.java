package org.occ.bibliot.repository;


import org.occ.bibliot.model.beans.Book;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface BookRepository extends CrudRepository<Book, Integer>{

    Book delete(Integer bookId);

    Book save(Book book);

    Optional<Book> findById(Integer bookId);
}
