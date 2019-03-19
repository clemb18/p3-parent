package org.occ.p3.service;

import org.occ.p3.model.Borrow;
import org.occ.p3.model.Member;
import org.occ.p3.model.User;

import java.util.List;

public interface UserService {

    public boolean isValidUser(String userName, String password);

    public Member findMemberByUserNameAndPassword(String userName, String password);

    public User findByUserNameAndPassword(String userName, String password);

    public List<Borrow> findBorrowListByUserRef(Integer userRef);
}
