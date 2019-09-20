package org.occ.p3.serviceWeb.borrow;
import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;


import org.occ.p3.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

@Service
@WebService(serviceName = "borrowWeb",name = "borrowWs")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)

public class BorrowWs {

    @Autowired
    BorrowService borrowService;

    public BorrowWs() {
    }

    @WebMethod
    public Boolean borrowBook(Integer workId,Integer membreId){
        return this.borrowService.borrowBook(workId, membreId);

    }
    @WebMethod
    public Boolean extendBorrow(Integer borrowId){
        return this.borrowService.extendBorrow(borrowId);

    }
    @WebMethod
    public Boolean terminateBorrow(Integer borrowId, Integer membreId){
        return this.borrowService.terminateBorrow(borrowId, membreId);

    }

    @PostConstruct
    public void init() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

}

