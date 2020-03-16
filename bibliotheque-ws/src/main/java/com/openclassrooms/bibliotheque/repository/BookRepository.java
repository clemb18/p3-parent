package com.openclassrooms.bibliotheque.repository;


import com.openclassrooms.bibliotheque.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//Classe comprenant les méthodes faisant appels à la BDD pour l'objet Book

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    void deleteById(Long bookId);

    // Trouver un Book par ID
    Optional<Book> findById(Long bookId);

    Book save(Book book);
}
