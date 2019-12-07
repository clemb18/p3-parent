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
        Work work = (Work) workService.getWorksByAuthor(request.getAuthor());
        if (work == null) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            WorkWs workWs = new WorkWs();
            BeanUtils.copyProperties(work, workWs);
            response.setWorkWs(workWs);
        }
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getWorksByPublicationDate")
    @ResponsePayload
    public GetWorkByPublicationDateResponse getWorksByPublicationDate(@RequestPayload GetWorkByPublicationDateRequest request) {
        GetWorkByPublicationDateResponse response = new GetWorkByPublicationDateResponse();
        ServiceStatus serviceStatus = new ServiceStatus();
        Work work = (Work) workService.getWorksByPublicationDate(request.getPublicationDate());
        if (work == null) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            WorkWs workWs = new WorkWs();
            BeanUtils.copyProperties(work, workWs);
            response.setWorkWs(workWs);
        }
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createWorkRequest")
    @ResponsePayload
    public CreateWorkResponse createWork(@RequestPayload CreateWorkRequest request) {
        CreateWorkResponse createWorkResponse = new CreateWorkResponse();
        ServiceStatus serviceStatus = new ServiceStatus();
        Work work = new Work();
        BeanUtils.copyProperties(request.getWorkWs(), work);
        Work workCreated = workService.create(work);
        if (workCreated == null) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            WorkWs workWs = new WorkWs();
            BeanUtils.copyProperties(workCreated, workWs);
            createWorkResponse.setWorkWs(workWs);
        }
        createWorkResponse.setServiceStatus(serviceStatus);
        return createWorkResponse;
    }
}

