package org.occ.bibliot.service;

import org.occ.bibliot.model.beans.Borrow;
import org.occ.bibliot.model.beans.Member;

import java.util.List;

public interface MemberService {

    List<Borrow> findBorrowListByMember (Member member);
}
