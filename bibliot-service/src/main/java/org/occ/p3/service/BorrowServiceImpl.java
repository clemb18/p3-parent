package org.occ.p3.service;

import org.occ.p3.consumer.repository.*;
import org.occ.p3.model.Book;
import org.occ.p3.model.Borrow;
import org.occ.p3.model.Member;
import org.occ.p3.model.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class BorrowServiceImpl implements BorrowService {

    @Autowired
    UserService userService;
    @Autowired
    WorkRepository workRepository;
    @Autowired
    BorrowRepository borrowRepository;
    @Autowired
    BookRepository bookRepository;
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    UserRepository userRepository;


    public Boolean borrowBook(Integer workId, Integer membreId) {

        Boolean toReturn = false;

        // Recuperer le Work dont on connait l'ID (creer work repository)
        Work myWorkGot = workRepository.findById(workId).get();
        String workName = myWorkGot.getTitle();

        // recuperer la liste dans myborrowgot
        List<Book> bookList = myWorkGot.getBooksList();

        // On parcours la bookList
        for (Book result : bookList)

            if (result.isAvailable()) {

                Borrow borrowToSave = new Borrow();
                borrowToSave.setBook(result);

                // on recupere l'id du membre passé en param
                Member membreEmprunt = memberRepository.findById(membreId).get();

                // On associe le member a borrow
                borrowToSave.setUserRef(membreId);
                //on set la date de debut
                borrowToSave.setStartBorrowDate(new Date());

                // ajouter 4 semaines à la date de début

                Date borrowDate = borrowToSave.getStartBorrowDate();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(borrowDate);
                calendar.add(Calendar.WEEK_OF_MONTH, 4);
                borrowToSave.setEndBorrowDate(calendar.getTime());

                //mettre le statut de l'emprunt à jour et le nom du livre
                borrowToSave.setStatus("ENCOURS");
                borrowToSave.setWorkName(workName);

                // Save le borrow dans le repository
                borrowRepository.save(borrowToSave);

                //Indique que le livre n'est plus disponible et on sauvegarde dans le bookRepository
                result.setAvailable(false);
                bookRepository.save(result);

                //Mettre a jour la liste des emprunt du memmberCo et save

                List<Borrow> memberListBorrowToUpdate = userService.findBorrowListByUserRef(membreId);
                memberListBorrowToUpdate.add(borrowToSave);
                memberRepository.save(membreEmprunt);

                toReturn = true;
                break;
            }
        return toReturn;
    }


    public Boolean extendBorrow(Integer borrowId) {

        Boolean toReturn = false;

        // Recuperer le borrow dont on connait l'ID
        Borrow borrowToExtend = borrowRepository.findById(borrowId).get();
        Date endBorrowDate = borrowToExtend.getEndBorrowDate();
        // Recuperer la date du jour
        Date currentDate = new Date();

        if (endBorrowDate.after(currentDate) && (borrowToExtend.isExtended() == false)) {

            // Rallonge de l'emprunt +4weeks
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(endBorrowDate);
            calendar.add(Calendar.WEEK_OF_MONTH, 4);
            borrowToExtend.setEndBorrowDate(calendar.getTime());

            borrowRepository.save(borrowToExtend);

            // setExtended a true
            borrowToExtend.setExtended(true);
            // mettre a jour le statut
            borrowToExtend.setStatus("PROLONGE");

            borrowRepository.save(borrowToExtend);

            toReturn = true;

        } else {

            toReturn = false;
        }

        return toReturn;
    }


    public Boolean endBorrow(Integer borrowId) {

        Boolean toReturn = false;

        // Recuperer le borrow dont on connait l'ID
        Borrow borrowToEnd = borrowRepository.findById(borrowId).get();
        // recuperer la date de fin max de l'emprunt
        Date endBorrowDate = borrowToEnd.getEndBorrowDate();
        // Recuperer la date du jour
        Date currentDate = new Date();

        if (endBorrowDate.after(currentDate)) {

            // Modifier le statut de l'emprunt
            borrowToEnd.setStatus("RENDU");

            //borrowRepository.save(borrowToEnd);

            // Mettre a jour la date de fin d'emprunt avec la date du jour
            borrowToEnd.setEndBorrowDate(currentDate);

            // Sauvegarder le borrow mis a jour
            borrowRepository.save(borrowToEnd);

            // Recuperer le work dont on connait l'ID
            Book bookToUpdate = borrowToEnd.getBook();

            // Mettre à jour la disponibilité du livre
            bookToUpdate.setAvailable(true);

            // Sauvegarder le book modifié
            bookRepository.save(bookToUpdate);

            toReturn = true;

        } else {

            toReturn = false;
        }

        return toReturn;

    }



    public ArrayList<Borrow> getBorrowListWithEndDateExceeded() {

        Iterable<Borrow> borrowListGot = borrowRepository.findAll();
        Iterator<Borrow> listBorrowIterator = borrowListGot.iterator();

        ArrayList<Borrow> borrowExceeded = new ArrayList<Borrow>();


        while(listBorrowIterator.hasNext()) {

            Borrow currentBorrow = listBorrowIterator.next();

            Date dateFin = currentBorrow.getEndBorrowDate();
            Date currentDate = new Date();

            if ((dateFin.before(currentDate)) && ((currentBorrow.getStatus().contains("ENCOURS")) || (currentBorrow.getStatus().contains("PROLONGE")))) {

                borrowExceeded.add(currentBorrow);


            }

        return borrowExceeded;

            }
        return borrowExceeded;
    }
        }



