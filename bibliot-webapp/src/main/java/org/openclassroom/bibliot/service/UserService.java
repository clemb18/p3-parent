package org.openclassroom.bibliot.service;

import org.occ.model.beans.User;

public interface UserService {


  User findUser(String username, String password);




}
