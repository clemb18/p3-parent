package org.occ.p3.consumer.repository;

import org.occ.p3.model.Member;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MemberRepository extends CrudRepository<Member, Integer>{

    Member findByUserNameAndPassword(String userName, String password);

    Optional<Member> findById(Integer id);

}

