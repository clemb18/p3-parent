package org.occ.bibliot.service;

import org.occ.bibliot.model.beans.User;

public interface UserService {


  User findUser(String username, String password);




}
