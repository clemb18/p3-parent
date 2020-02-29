package com.openclassrooms.bibliotheque.repository;

import com.openclassrooms.bibliotheque.models.Borrow;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Classe comprenant les méthodes faisant appels à la BDD pour l'objet Borrow

@Repository
public interface BorrowRepository extends CrudRepository<Borrow, Integer> {

    // Trouver les emprunt en BDD
    Iterable<Borrow> findAll();

    // Trouver un emprunt par ID
    Borrow findById(Long borrowId);

    // Trouver les emprunts d'un membre
    List<Borrow> findByMemberId(Long id);
}