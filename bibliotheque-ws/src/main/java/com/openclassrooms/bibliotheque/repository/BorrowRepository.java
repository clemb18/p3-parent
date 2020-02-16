package com.openclassrooms.bibliotheque.repository;


import com.openclassrooms.bibliotheque.models.Borrow;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BorrowRepository extends CrudRepository<Borrow, Integer> {


    Iterable<Borrow> findAll();

    Borrow findById(Long borrowId);

    List<Borrow> findByMemberId(Long memberId);
}