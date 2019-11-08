package org.openclassroom.bibliot.bibliot.serviceWeb.user;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.occ.model.beans.Borrow;
import org.occ.model.beans.Member;
import org.openclassroom.bibliot.bibliot.service.UserService;
//import org.occ.p3.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

@Service
@WebService(serviceName = "userWeb",name = "userWs")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
public class UserWs {

    @Autowired
    UserService userService;

    public UserWs() {
    }

    @WebMethod
    public Member isValidUser(String username, String password) {
        return this.userService.isValidUser(username, password);

    }

    @WebMethod
    public List<Borrow> findBorrowListByMember (Member member){
        return this.userService.findBorrowListByMember(member);

    }

    @PostConstruct
    public void init() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

}


