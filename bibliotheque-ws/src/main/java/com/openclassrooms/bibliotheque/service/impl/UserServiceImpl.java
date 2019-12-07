package com.openclassrooms.bibliotheque.service.impl;

import com.openclassrooms.bibliotheque.repository.UserRepository;
import com.openclassrooms.bibliotheque.service.UserService;
import com.openclassrooms.bibliotheque.models.User;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    //private UserRepository userRepository;
    public UserRepository userRepository;

    @Override
    public com.openclassrooms.projects.bibliot.UserWs findByLoginAndPassword(String login, String password) {
        return userRepository.findByLoginAndPassword(login, password);
    }

    @Override
    public com.openclassrooms.projects.bibliot.User create(com.openclassrooms.projects.bibliot.User user) {
        User userCreated = new User();
        BeanUtils.copyProperties(user, userCreated);
        userCreated = userRepository.save(user);
        return (com.openclassrooms.projects.bibliot.User) userCreated;
    }
}