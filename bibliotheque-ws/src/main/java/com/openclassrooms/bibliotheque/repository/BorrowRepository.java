package com.openclassrooms.bibliotheque.repository;


import com.openclassrooms.bibliotheque.models.Borrow;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BorrowRepository extends CrudRepository<Borrow, Integer> {


    List<Borrow> findByMember(MemberWs member);


    Iterable<Borrow> findAll();

    Borrow findById(Long borrowId);
}