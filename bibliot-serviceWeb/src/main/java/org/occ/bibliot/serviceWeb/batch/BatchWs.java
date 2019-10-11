package org.occ.bibliot.serviceWeb.batch;

import org.springframework.stereotype.Service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@Service
@WebService(serviceName = "batchWeb", name = "batchWs")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)

public class BatchWs {


 /*   @Autowired
    BatchService batchService;

    public BatchWs() {
    }

    @WebMethod
    public void sendMailToLateBorrowMember() {
    }
    @PostConstruct
    public void init() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);

    }*/


}
