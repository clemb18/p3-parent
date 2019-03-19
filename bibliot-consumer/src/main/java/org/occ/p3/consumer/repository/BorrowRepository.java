package org.occ.p3.consumer.repository;


import org.occ.p3.model.Borrow;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface BorrowRepository extends CrudRepository<Borrow, Integer> {

    //List<Borrow> findByMemberborrowing(Member member);

    //LocalDate currentDate = LocalDate.now();

    List<Borrow> findByUserRef(Integer userRef);

    ArrayList<Borrow> findAll();
}