package org.occ.p3.serviceWeb;

import org.occ.p3.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

import static javax.jws.soap.SOAPBinding.Style.DOCUMENT;
import static javax.jws.soap.SOAPBinding.Use.LITERAL;


@Service
@WebService(serviceName = "BorrowWeb", name = "borrowWs")
@SOAPBinding(style = DOCUMENT, use = LITERAL)
public class BorrowWs {

    @Autowired
    BorrowService borrowService;

    @WebMethod
    public Boolean borrowBook(Integer workId,Integer membreId) {
        return borrowService.borrowBook(workId, membreId);
    }

    @WebMethod
    public Boolean extendBorrow(Integer borrowId) {
        return borrowService.extendBorrow(borrowId);
    }

    @WebMethod
    public Boolean endBorrow(Integer borrowId) {
        return borrowService.endBorrow(borrowId);
    }



    @WebMethod
    @PostConstruct
    public void init() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }
}

