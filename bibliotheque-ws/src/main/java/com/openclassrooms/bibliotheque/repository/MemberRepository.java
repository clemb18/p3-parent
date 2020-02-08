package com.openclassrooms.bibliotheque.repository;
import com.openclassrooms.bibliotheque.models.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {

    Member findByNameAndMailAdress(String name, String mailAdress);

    Member save(Member member);

    void deleteById(Long memberId);


}
