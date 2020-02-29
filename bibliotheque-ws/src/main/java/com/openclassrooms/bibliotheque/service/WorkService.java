package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.Work;
import com.openclassrooms.projects.bibliotheque.WorkWs;

import java.util.List;

//Classe contenant les méthodes liées aux oeuvres
public interface WorkService {

    // Méthode permmetant de rechercher une oeuvre par auteur
    List<Work> getWorksByAuthor(String author);

    // Méthode permmetant de rechercher une oeuvre par titre
    List<Work> getWorksByTitle(String title);

    // Méthode permmetant de rechercher une oeuvre par date de publication
    List<Work> getWorksByPublicationDate(String publicationDate);

    // Méthode permmetant d'ajouter une oeuvre
    Work create(WorkWs work);

    // Méthode permmetant de supprimer une oeuvre
    Work deleteWork(Long workId);


}