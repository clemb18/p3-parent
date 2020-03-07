package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.Borrow;

import java.util.List;

//Classe contenant les méthodes liées aux emprunts
public interface BorrowService {

    // Méthode permmetant d'emprunter un livre
    Boolean borrowBook(Long workId, Long memberId);

    // Méthode permmetant de prolonger un emprunt
    Boolean extendBorrow(Long borrowId);

    // Méthode permmetant de cloturer un emprunt
    Boolean terminateBorrow(Long borrowId);

    // Méthode permmetant de trouver la liste d'emprunt d'un membre
    List<Borrow> findBorrowListByMemberId(Long memberId);

    // Méthode permmetant de recup les emprunts non échus non rendus
    List<Borrow> findDelayBorrows();

}