package com.openclassrooms.bibliotheque.repository;


import com.openclassrooms.bibliotheque.models.Borrow;
import com.openclassrooms.bibliotheque.models.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BorrowRepository extends CrudRepository<com.openclassrooms.bibliotheque.models.Borrow, Integer> {


    List<Borrow> findByMember(Member member);


    Iterable<com.openclassrooms.bibliotheque.models.Borrow> findAll();

}