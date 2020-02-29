package com.openclassrooms.bibliotheque.repository;

import com.openclassrooms.bibliotheque.models.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Classe comprenant les méthodes faisant appels à la BDD pour l'objet Membre

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {

    // Cherche un membre en bdd par son nom et son adresse mail
    Member findByNameAndMailAdress(String name, String mailAdress);

    // Cherche un membre en bdd par son nom et son adresse mail
    Member findByMailAdressAndPassword(String mailAdress, String password);

    // Sauvegarder un membre en BDD
    Member save(Member member);

    // Supprimer un membre de la bdd par son ID
    void deleteById(Long memberId);


}
