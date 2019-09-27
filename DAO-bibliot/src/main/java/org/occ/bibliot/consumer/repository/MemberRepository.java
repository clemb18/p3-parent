package org.occ.bibliot.consumer.repository;

import org.occ.bibliot.model.beans.Member;

import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Integer>{

    Member findByUsernameAndPassword(String username, String password);
}

