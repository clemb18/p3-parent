package org.occ.bibliot.repository;


import org.occ.bibliot.model.beans.Borrow;
import org.occ.bibliot.model.beans.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BorrowRepository extends CrudRepository<org.occ.bibliot.model.beans.Borrow, Integer> {


    List<Borrow> findByMember(Member member);


    Iterable<org.occ.bibliot.model.beans.Borrow> findAll();

}