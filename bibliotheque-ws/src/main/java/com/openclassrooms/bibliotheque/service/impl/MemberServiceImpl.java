package com.openclassrooms.bibliotheque.service.impl;

import com.openclassrooms.bibliotheque.models.Member;
import com.openclassrooms.bibliotheque.repository.MemberRepository;
import com.openclassrooms.bibliotheque.service.MemberService;
import com.openclassrooms.projects.bibliot.MemberWs;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    public MemberRepository memberRepository;

    @Override
    public Member findByNameAndFirstName(String name, String firstName) {
        return memberRepository.findByNameAndFirstName(name, firstName);
    }

    @Override
    public Member create(MemberWs member) {
        Member memberCreated = new Member();
        BeanUtils.copyProperties(member, memberCreated);
        memberCreated = memberRepository.save(memberCreated);
        return memberCreated;
    }

}
