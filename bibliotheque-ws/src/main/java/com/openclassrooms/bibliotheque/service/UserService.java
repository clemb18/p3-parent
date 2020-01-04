package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.User;
import com.openclassrooms.projects.bibliotheque.UserWs;

public interface UserService {

    User findByUsernameAndPassword(String username, String password);

    User create(UserWs user);

    User deleteUser(Long userId);
}

