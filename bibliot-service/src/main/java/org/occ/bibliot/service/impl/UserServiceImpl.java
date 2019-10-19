package org.occ.bibliot.service.impl;

import org.occ.bibliot.repository.UserRepository;
import org.occ.bibliot.model.beans.User;
import org.occ.bibliot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserRepository userRepository;


    public User findUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

}



