package com.openclassrooms.bibliotheque.repository;

import com.openclassrooms.bibliotheque.models.MemberModelWs;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<MemberModelWs, Integer> {



}
