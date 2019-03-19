package org.occ.p3.webservice;

import org.occ.p3.model.*;

import org.occ.p3.service.BorrowService;
import org.occ.p3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;


@Service
@WebService(serviceName = "BorrowWeb", name = "WsBorrow")
@SOAPBinding
public class WsBorrow {

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
    public ArrayList<Borrow> getBorrowListWithEndDateExceeded(){
        return borrowService.getBorrowListWithEndDateExceeded();
    }

    @WebMethod
    @PostConstruct
    public void init() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }
}
