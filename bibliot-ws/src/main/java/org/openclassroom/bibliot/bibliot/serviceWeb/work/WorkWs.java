package org.openclassroom.bibliot.bibliot.serviceWeb.work;
import org.openclassroom.bibliot.bibliot.service.WorkService;
import org.occ.model.beans.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import java.util.List;

@Service
@WebService(serviceName = "workWeb",name = "workWs")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public class WorkWs {

    @Autowired
    WorkService workService;

    public WorkWs() {
    }

    @WebMethod
    public List<Work> getWorksByAuthor(String author) {
        return this.workService.getWorksByAuthor(author);

    }
    @WebMethod
    public List<Work> getWorksByPublicationDate (Integer publicationDate){
        return this.workService.getWorksByPublicationDate(publicationDate);

    }

    @PostConstruct
    public void init() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }
}