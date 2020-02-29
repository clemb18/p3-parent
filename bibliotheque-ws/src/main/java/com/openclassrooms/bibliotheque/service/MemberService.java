package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.Member;
import com.openclassrooms.projects.bibliotheque.MemberWs;

//Classe contenant les méthodes liées aux membres
public interface MemberService {

    // Méthode permmetant de rechercher un membre par son nom et adresse mail
    Member findByNameAndMailAdress(String name, String mailAdress);

    // Méthode permmetant de rechercher un membre par son mdp et adresse mail
    Member findByMailAdressAndPassword(String mailAdress, String password);

    // Méthode permmetant d'ajouter un membre
    Member create(MemberWs member);

    // Méthode permmetant de supprimer un membre
    void deleteMember(Long memberId);

}
