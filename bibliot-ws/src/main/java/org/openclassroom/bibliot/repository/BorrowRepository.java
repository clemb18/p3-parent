package org.openclassroom.bibliot.repository;


import org.occ.model.beans.Borrow;
import org.occ.model.beans.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BorrowRepository extends CrudRepository<org.occ.model.beans.Borrow, Integer> {


    List<Borrow> findByMember(Member member);


    Iterable<org.occ.model.beans.Borrow> findAll();

}