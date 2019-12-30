package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.User;
import com.openclassrooms.projects.bibliot.UserWs;

public interface UserService {

    User findByLoginAndPassword(String login, String password);

    User create(UserWs user);

    void deleteUser(Long userId);
}

