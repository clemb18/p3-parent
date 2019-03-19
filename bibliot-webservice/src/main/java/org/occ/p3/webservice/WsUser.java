package org.occ.p3.webservice;

import org.occ.p3.model.Member;
import org.occ.p3.model.User;
import org.occ.p3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@Service
@WebService(serviceName = "UserWeb", name = "WsUser")
@SOAPBinding
public class WsUser {

    @Autowired
    UserService userService;

    @WebMethod
    public boolean isValidUser(String userName, String password) {
        return userService.isValidUser(userName, password);
    }


    @WebMethod
    public Member findByUserNameAndPassword(String userName, String password) {
        return userService.findMemberByUserNameAndPassword(userName, password);
    }

    @WebMethod
    @PostConstruct
    public void init() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }
}


