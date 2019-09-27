package org.occ.bibliot.service.impl;

import java.util.List;

import org.occ.bibliot.consumer.repository.BorrowRepository;
import org.occ.bibliot.consumer.repository.MemberRepository;
import org.occ.bibliot.model.beans.Borrow;
import org.occ.bibliot.model.beans.Member;
import org.occ.bibliot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    MemberRepository memberRepository;
    @Autowired
    BorrowRepository borrowRepository;

    public Member isValidUser(String username, String password) {

        Member validMember = memberRepository.findByUsernameAndPassword(username, password);

        return validMember;
    }


    public List<Borrow> findBorrowListByMember (Member member){

        return borrowRepository.findByMember(member);
    }

}



