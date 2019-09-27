package org.occ.bibliot.service;

import java.util.List;

import org.occ.bibliot.model.beans.Borrow;
import org.occ.bibliot.model.beans.Member;

public interface UserService {


    public Member isValidUser(String username, String password);



    public List<Borrow> findBorrowListByMember (Member member);
}
