package org.occ.bibliot.serviceWeb.batch;

import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import org.occ.bibliot.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

@Service
@WebService(serviceName = "batchWeb", name = "batchWs")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)

public class BatchWs {


    @Autowired
    BatchService batchService;

    public BatchWs() {
    }

    @WebMethod
    public void sendMailToLateBorrowMember() {
    }
    @PostConstruct
    public void init() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);

    }


}
