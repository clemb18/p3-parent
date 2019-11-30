package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.BorrowModelWs;
import com.openclassrooms.bibliotheque.models.MemberModelWs;

import java.util.List;

public interface MemberService {

    List<BorrowModelWs> findBorrowListByMember (MemberModelWs member);
}
