package org.occ.bibliot.consumer.repository;



import java.util.List;

import org.occ.bibliot.model.beans.Borrow;
import org.occ.bibliot.model.beans.Member;
import org.springframework.data.repository.CrudRepository;

public interface BorrowRepository extends CrudRepository<Borrow, Integer> {


    List<Borrow> findByMember(Member member);


    Iterable<Borrow> findAll();

}