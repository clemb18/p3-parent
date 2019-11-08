package org.openclassroom.bibliot.service.impl;

import org.openclassroom.bibliot.repository.UserRepository;
import org.occ.model.beans.User;
import org.openclassroom.bibliot.service.UserService;
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



