package com.openclassrooms.bibliotheque.repository;

import com.openclassrooms.bibliotheque.models.Work;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Classe comprenant les méthodes faisant appels à la BDD pour l'objet Work

@Repository
public interface WorkRepository extends CrudRepository<Work, Long> {

    // Rechercher les oeuvres par date de publication
    List<Work> findByPublicationDate(String publicationDate);

    // Rechercher les oeuvres par auteur
    List<Work> findByAuthorIsContainingIgnoreCase(String author);

    // Rechercher les oeuvres par titre
    List<Work> findByTitleIsContainingIgnoreCase(String title);

    // Supprimer une oeuvre de la bdd
    void deleteById(Long workId);

    // Ajouter une oeuvre à la bdd
    Work save(Work work);

}
