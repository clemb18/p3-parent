package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.User;
import com.openclassrooms.projects.bibliotheque.UserWs;

//Classe contenant les méthodes liées aux utilisateurs
public interface UserService {

    // Méthode permmetant de rechercher un utilisateur par son nom et mdp
    User findByUsernameAndPassword(String username, String password);

    // Méthode permmetant de rechercher un membre par son nom et adresse mail
    User create(UserWs user);

    // Méthode permmetant de rechercher un membre par son nom et adresse mail
    void deleteUser(Long userId);
}

