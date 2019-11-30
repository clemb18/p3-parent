package com.openclassrooms.bibliotheque.service;

public interface UserService {

    User findByLoginAndPassword(String login, String password);

    User create(User user);
}

