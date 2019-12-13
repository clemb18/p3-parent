package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.Borrow;
import com.openclassrooms.bibliotheque.models.Member;

import java.util.List;

public interface MemberService {

    List<Borrow> findBorrowListByMember (Member member);

  //  Member findByLoginAndPassword(String login, String password);
}
