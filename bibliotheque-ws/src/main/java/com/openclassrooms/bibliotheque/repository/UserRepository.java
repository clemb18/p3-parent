package com.openclassrooms.bibliotheque.repository;

import com.openclassrooms.bibliotheque.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Classe comprenant les méthodes faisant appels à la BDD pour l'objet User

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    // Permet de trouver un Utilisateur par
    User findByUsernameAndPassword(String username, String password);

    // Sauvegarder un utilisateur en BBB
    User save(User user);

    // Supprimer un membre de la bdd par son ID
    void deleteById(Long userId);
}
