package com.openclassrooms.bibliotheque.repository;

import com.openclassrooms.bibliotheque.models.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Integer> {



}
