package com.openclassrooms.bibliotheque.service.impl;

import com.openclassrooms.bibliotheque.repository.UserRepository;
import com.openclassrooms.bibliotheque.service.UserService;
import com.openclassrooms.projects.bibliot.User;
import com.openclassrooms.bibliotheque.models.UserModelWs;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    //private UserRepository userRepository;
    public UserRepository userRepository;

    @Override
    public User findByLoginAndPassword(String login, String password) {
        return userRepository.findByLoginAndPassword(login, password);
    }

    @Override
    public User create(User user) {
        UserModelWs userCreated = new UserModelWs();
        BeanUtils.copyProperties(user, userCreated);
        userCreated = userRepository.save(user);
        return (User) userCreated;
    }
}