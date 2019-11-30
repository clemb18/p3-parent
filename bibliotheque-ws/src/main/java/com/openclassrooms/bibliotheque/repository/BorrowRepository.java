package com.openclassrooms.bibliotheque.repository;


import com.openclassrooms.bibliotheque.models.BorrowModelWs;
import com.openclassrooms.bibliotheque.models.MemberModelWs;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BorrowRepository extends CrudRepository<BorrowModelWs, Integer> {


    List<BorrowModelWs> findByMember(MemberModelWs member);


    Iterable<BorrowModelWs> findAll();

}