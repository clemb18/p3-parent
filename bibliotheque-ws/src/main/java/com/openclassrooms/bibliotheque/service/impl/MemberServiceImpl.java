package com.openclassrooms.bibliotheque.service.impl;

import com.openclassrooms.bibliotheque.models.Borrow;
import com.openclassrooms.bibliotheque.models.Member;
import com.openclassrooms.bibliotheque.repository.MemberRepository;
import com.openclassrooms.bibliotheque.repository.BorrowRepository;
import com.openclassrooms.bibliotheque.service.MemberService;
import com.openclassrooms.projects.bibliotheque.MemberWs;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    private static Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);

    @Autowired
    public MemberRepository memberRepository;
    public BorrowRepository borrowRepository;

    @Override
    public Member findByNameAndMailAdress(String name, String mailAdress) {
        return memberRepository.findByNameAndMailAdress(name, mailAdress);
    }

    public List<Borrow> findBorrowListByMember (Member member){

        return borrowRepository.findByMember(member);
    }

    @Override
    public Member create(MemberWs member) {
        Member memberCreated = new Member();
        BeanUtils.copyProperties(member, memberCreated);
        memberCreated = memberRepository.save(memberCreated);
        return memberCreated;
    }

    public Member deleteMember(Long memberId) {
        logger.info("suppression d'un membre: {}", memberId);

        memberRepository.deleteById(memberId);
        return null;
    }

}
