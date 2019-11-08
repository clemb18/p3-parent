package org.openclassroom.bibliot.service;

import org.occ.model.beans.Borrow;
import org.occ.model.beans.Member;

import java.util.List;

public interface MemberService {

    List<Borrow> findBorrowListByMember (Member member);
}
