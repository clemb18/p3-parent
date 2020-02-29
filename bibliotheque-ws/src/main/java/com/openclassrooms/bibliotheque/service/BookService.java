package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.Book;
import com.openclassrooms.projects.bibliotheque.BookWs;

//Classe contenant les méthodes liées aux book
public interface BookService {

    // Méthode permmetant de rechercher une livre par ID
    Book getBookById(Long bookId);

    // Méthode permmetant de supprimer un livre
    void deleteBook(Long bookId);

    // Méthode permmetant d'ajouter un livre
    Book create(BookWs book);

}
