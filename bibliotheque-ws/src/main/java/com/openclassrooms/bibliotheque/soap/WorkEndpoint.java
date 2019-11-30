package com.openclassrooms.bibliotheque.soap;

import com.openclassrooms.bibliotheque.models.Work;
import com.openclassrooms.bibliotheque.service.WorkService;
import com.openclassrooms.projects.bibliot.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import static com.openclassrooms.projects.bibliot.Status.NOT_FOUND;
import static com.openclassrooms.projects.bibliot.Status.SUCCESS;

@Endpoint
public class WorkEndpoint {

    private static final String NAMESPACE_URI = "http://openclassrooms.com/projects/bibliotheque";

    @Autowired
    private WorkService workService;


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getWorkByAuthorRequest")
    @ResponsePayload
    public GetWorkByAuthorResponse getWorksByAuthor(@RequestPayload GetWorkByAuthorRequest request) {
        GetWorkByAuthorResponse response = new GetWorkByAuthorResponse();
        ServiceStatus serviceStatus = new ServiceStatus();
        com.openclassrooms.projects.bibliot.Work findWork = (com.openclassrooms.projects.bibliot.Work) workService.getWorksByAuthor(request.getAuthor());
        if (findWork == null) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            com.openclassrooms.projects.bibliot.Work workByAuthorResult = new com.openclassrooms.projects.bibliot.Work();
            BeanUtils.copyProperties(findWork, workByAuthorResult);
            response.setWork(workByAuthorResult);
        }
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getWorksByPublicationDate")
    @ResponsePayload
    public GetWorkByPublicationDateResponse getWorksByAuthor(@RequestPayload GetWorkByPublicationDateRequest request) {
        GetWorkByPublicationDateResponse response = new GetWorkByPublicationDateResponse();
        ServiceStatus serviceStatus = new ServiceStatus();
        com.openclassrooms.projects.bibliot.Work findWorkByDate = (com.openclassrooms.projects.bibliot.Work) workService.getWorksByPublicationDate(request.getPublicationDate());
        if (findWorkByDate == null) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            com.openclassrooms.projects.bibliot.Work workByDateResult = new com.openclassrooms.projects.bibliot.Work();
            BeanUtils.copyProperties(findWorkByDate, workByDateResult);
            response.setWork(workByDateResult);
        }
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createWorkRequest")
    @ResponsePayload
    public CreateWorkResponse createWork(@RequestPayload CreateWorkRequest request) {
        CreateWorkResponse createWorkResponse = new CreateWorkResponse();
        ServiceStatus serviceStatus = new ServiceStatus();
        Work workCreated = workService.create(request.getWork());
        if (workCreated == null) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            com.openclassrooms.projects.bibliot.Work workResult = new com.openclassrooms.projects.bibliot.Work();
            BeanUtils.copyProperties(workCreated, workResult);
            createWorkResponse.setWork(workResult);
        }
        createWorkResponse.setServiceStatus(serviceStatus);
        return createWorkResponse;
    }
}
