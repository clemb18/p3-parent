package org.openclassroom.bibliot.repository;

import org.occ.model.beans.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{

    User findByUsernameAndPassword(String username, String password);
}

