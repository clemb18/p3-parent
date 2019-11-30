package com.openclassrooms.bibliotheque.service.impl;


import com.openclassrooms.bibliotheque.models.Book;
import com.openclassrooms.bibliotheque.models.Borrow;
import com.openclassrooms.bibliotheque.models.Member;
import com.openclassrooms.bibliotheque.models.Work;
import com.openclassrooms.bibliotheque.repository.BookRepository;
import com.openclassrooms.bibliotheque.repository.BorrowRepository;
import com.openclassrooms.bibliotheque.repository.MemberRepository;
import com.openclassrooms.bibliotheque.repository.WorkRepository;
import com.openclassrooms.bibliotheque.service.BorrowService;
import com.openclassrooms.bibliotheque.service.MemberService;
import com.openclassrooms.bibliotheque.enumType.BorrowStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BorrowServiceImpl implements BorrowService {

    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private WorkRepository workRepository;
    @Autowired
    private BorrowRepository borrowRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private MemberService memberService;

    public Boolean borrowBook(Integer workId, Integer membreId) {

        // on recupère l'Id du membre passé en parametre
        Optional<Member> optionalMember = memberRepository.findById(membreId);
        if (!optionalMember.isPresent()) {
            return false;
        }
        Member member = optionalMember.get();

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


                // On associe le member a borrow
                borrowToSave.setMemberBorrowing(member);
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

                List<Borrow> memberListBorrowToUpdate = memberService.findBorrowListByMember(member);
                memberListBorrowToUpdate.add(borrowToSave);

                memberRepository.save(member);

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
