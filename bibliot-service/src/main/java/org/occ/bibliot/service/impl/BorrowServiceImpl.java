package org.occ.bibliot.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.occ.bibliot.consumer.repository.BookRepository;
import org.occ.bibliot.consumer.repository.BorrowRepository;
import org.occ.bibliot.consumer.repository.MemberRepository;
import org.occ.bibliot.consumer.repository.WorkRepository;
import org.occ.bibliot.model.beans.Book;
import org.occ.bibliot.model.beans.Borrow;
import org.occ.bibliot.model.ENUM.BorrowStatusEnum;
import org.occ.bibliot.model.beans.Member;
import org.occ.bibliot.model.beans.Work;
import org.occ.bibliot.service.BorrowService;
import org.occ.bibliot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowServiceImpl implements BorrowService {

    @Autowired
    MemberRepository memberRepository;
    @Autowired
    WorkRepository workRepository;
    @Autowired
    BorrowRepository borrowRepository;
    @Autowired
    BookRepository bookRepository;
    @Autowired
    UserService userService;

    public Boolean borrowBook(Integer workId, Integer membreId) {

        Boolean toReturn = false;

        // Recuperer le Work dont on connait l'ID (creer work repository)
        Work myWorkGot = workRepository.findById(workId).get();
        String workName = myWorkGot.getTitle();

        // recuperer la liste dans myborrowgot
        List<Book> bookList = myWorkGot.getBooksList();

        // On parcours la bookList
        for (Book result : bookList) {

            if (result.isAvailable()) {

                Borrow borrowToSave = new Borrow();
                borrowToSave.setBook(result);
                // on recupère l'Id du membre passé en parametre
                Member membreEmprunt = memberRepository.findById(membreId).get();

                // On associe le member a borrow
                borrowToSave.setMemberBorrowing(membreEmprunt);
                borrowToSave.setStartBorrowDate(new Date());


                //Calcul de la date de fin d'emprunt
                Date borrowDate = borrowToSave.getStartBorrowDate();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(borrowDate);
                calendar.add(Calendar.WEEK_OF_MONTH,4);
                borrowToSave.setEndBorrowDate(calendar.getTime());

                //Set le statut de l'emprunt + Ajout du nom de l'oeuvre à l'emprunt

                borrowToSave.setStatus(BorrowStatusEnum.ENCOURS.value());
                borrowToSave.setWorkName(workName);

                // Save le borrow dans le repository
                borrowRepository.save(borrowToSave);
                //Indique que le livre n'est plus disponible et on sauvegarde dans le bookRepository
                result.setAvailable(false);
                bookRepository.save(result);

                //Mettre a jour la liste des emprunt du memmberCo et save

                List<Borrow> memberListBorrowToUpdate = userService.findBorrowListByMember(membreEmprunt);
                memberListBorrowToUpdate.add(borrowToSave);

                memberRepository.save(membreEmprunt);


                toReturn = true;
                break;
            }

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
            // setExtended a true
            borrowToExtend.setExtended(true);
            borrowToExtend.setStatus(BorrowStatusEnum.PROLONGE.value());
            borrowRepository.save(borrowToExtend);
            toReturn = true;

        } else {

            toReturn = false;
        }

        return toReturn;
    }

    public Boolean terminateBorrow(Integer borrowId, Integer membreId ) {

        Boolean toReturn = false;

        //Set le statut de l'emprunt a "rendu"
        Borrow borrowToEnd = borrowRepository.findById(borrowId).get();
        borrowToEnd.setStatus(BorrowStatusEnum.RENDU.value());
        //Set le book comme disponible
        Book returnedBook = borrowToEnd.getBook();
        returnedBook.setAvailable(true);
        //Sauvegarde du livre rendu
        bookRepository.save(returnedBook);
        borrowRepository.save(borrowToEnd);
        toReturn = true;
        return toReturn;
    }

}
