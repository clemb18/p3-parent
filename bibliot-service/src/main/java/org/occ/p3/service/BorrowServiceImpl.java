package org.occ.p3.service;

import org.occ.p3.consumer.repository.BookRepository;
import org.occ.p3.consumer.repository.BorrowRepository;
import org.occ.p3.consumer.repository.MemberRepository;
import org.occ.p3.consumer.repository.WorkRepository;
import org.occ.p3.model.Book;
import org.occ.p3.model.Borrow;
import org.occ.p3.model.Member;
import org.occ.p3.model.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BorrowServiceImpl implements BorrowService {


    MemberRepository memberRepository;
    WorkRepository workRepository;
    @Autowired
    BorrowRepository borrowRepository;
    BookRepository bookRepository;

    public Boolean borrowBook(Integer workId) {

        Boolean toReturn = false;

        // Recuperer le Work dont on connait l'ID (creer work repository)
        Work myWorkGot = workRepository.findById(workId).get();

        // recuperer la liste dans myborrowgot
        List<Book> bookList = myWorkGot.getBooksList();

        // On parcours la bookList
        for (Book result : bookList) {

            if (result.getIsAvailable()) {

                Borrow borrowToSave = new Borrow();
                borrowToSave.setBook(result);
                // on simule member1 pour test
                Member membreTest = memberRepository.findById(1).get();
                // On associe le member a borrow
                borrowToSave.setMemberBorrowing(membreTest);
                borrowToSave.setStartBorrowDate(new Date());
                // Save le borrow dans le repository
                borrowRepository.save(borrowToSave);
                //Indique que le livre n'est plus disponible et on sauvegarde dans le bookRepository
                result.setIsAvailable(false);
                bookRepository.save(result);

                toReturn = true;
                break;
            }

        }
        return toReturn;
    }
}

