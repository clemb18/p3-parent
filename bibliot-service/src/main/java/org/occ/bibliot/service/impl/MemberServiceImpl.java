package org.occ.bibliot.service.impl;

import org.occ.bibliot.repository.BorrowRepository;
import org.occ.bibliot.model.beans.Borrow;
import org.occ.bibliot.model.beans.Member;
import org.occ.bibliot.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MemberServiceImpl implements MemberService {

    @Autowired
    BorrowRepository borrowRepository;

    public List<Borrow> findBorrowListByMember (Member member){

        return borrowRepository.findByMember(member);
    }
}
