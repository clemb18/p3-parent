package com.openclassrooms.bibliotheque.repository;

import com.openclassrooms.bibliotheque.models.UserModelWs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModelWs, Long> {

    com.openclassrooms.projects.bibliot.User findByLoginAndPassword(String login, String password);

    UserModelWs save(UserModelWs user);
}
