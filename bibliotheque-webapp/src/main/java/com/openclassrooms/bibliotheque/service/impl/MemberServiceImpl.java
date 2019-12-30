/*package com.openclassrooms.bibliotheque.service.impl;

import org.openclassroom.bibliot.repository.BorrowRepository;
import org.occ.model.beans.Borrow;
import org.occ.model.beans.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    BorrowRepository borrowRepository;

    public List<Borrow> findBorrowListByMember (Member member){

        return borrowRepository.findByMember(member);
    }
}
*/