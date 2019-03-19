package org.occ.p3.service;


import org.occ.p3.consumer.repository.BorrowRepository;
import org.occ.p3.consumer.repository.MemberRepository;
import org.occ.p3.consumer.repository.UserRepository;
import org.occ.p3.model.Borrow;
import org.occ.p3.model.Member;
import org.occ.p3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    BorrowRepository borrowRepository;

    public boolean isValidUser(String username, String password) {

        Member validMember = memberRepository.findByUserNameAndPassword(username, password);
        //User validUser = userRepository.findByUserNameAndPassword(username, password);
        boolean toReturn;
        if (validMember !=null) {
            toReturn = true;
        } else{

            toReturn = false;
        }

        return toReturn;
    }


    @Override
    public User findByUserNameAndPassword(String userName, String password) {


        return userRepository.findByUserNameAndPassword(userName, password);
    }

    public Member findMemberByUserNameAndPassword(String userName, String password) {

        return memberRepository.findByUserNameAndPassword(userName, password);

    }
    public List<Borrow> findBorrowListByUserRef(Integer userRef){

        return borrowRepository.findByUserRef(userRef);
    }
}



