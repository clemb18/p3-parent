package com.openclassrooms.bibliotheque.service;


import com.openclassrooms.bibliotheque.ws.UserWs;

public interface UserService {

  /**
   * Rechercher un utilisateur à partir d'un login et d'un mot de passe
   * @param login login de l'utilisateur
   * @param password mot de passe de l'utilisateur
   * @return
   */
  UserWs findUser(String login, String password);
}
