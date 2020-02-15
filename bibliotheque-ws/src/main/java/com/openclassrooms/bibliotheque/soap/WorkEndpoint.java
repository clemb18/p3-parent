package com.openclassrooms.bibliotheque.soap;

import com.openclassrooms.bibliotheque.models.Work;
import com.openclassrooms.bibliotheque.service.WorkService;
import com.openclassrooms.projects.bibliotheque.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

import static com.openclassrooms.projects.bibliotheque.Status.NOT_FOUND;
import static com.openclassrooms.projects.bibliotheque.Status.SUCCESS;

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
        List<Work> works =  workService.getWorksByAuthor(request.getAuthor());
        if (works == null || works.isEmpty() ) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            List<WorkWs> listworkWs = new ArrayList<>();
            for(Work work:works){
                WorkWs workWs = new WorkWs();
                BeanUtils.copyProperties(work, workWs);
                listworkWs.add(workWs);
            }

            response.getWorkWs().addAll(listworkWs);
        }
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getWorkByTitleRequest")
    @ResponsePayload
    public GetWorkByTitleResponse getWorksByTitle(@RequestPayload GetWorkByTitleRequest request) {
        GetWorkByTitleResponse response = new GetWorkByTitleResponse();
        ServiceStatus serviceStatus = new ServiceStatus();
        List<Work> works =  workService.getWorksByTitle(request.getTitle());
        if (works == null || works.isEmpty() ) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            List<WorkWs> listworkWs = new ArrayList<>();
            for(Work work:works){
                WorkWs workWs = new WorkWs();
                BeanUtils.copyProperties(work, workWs);
                listworkWs.add(workWs);
            }

            response.getWorkWs().addAll(listworkWs);
        }
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getWorkByPublicationDateRequest")
    @ResponsePayload
    public GetWorkByPublicationDateResponse getWorksByPublicationDate(@RequestPayload GetWorkByPublicationDateRequest request) {
        GetWorkByPublicationDateResponse response = new GetWorkByPublicationDateResponse();
        ServiceStatus serviceStatus = new ServiceStatus();
        List<Work> works = workService.getWorksByPublicationDate(request.getPublicationDate());
        if (works == null || works.isEmpty() ) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            List<WorkWs> listworkWs = new ArrayList<>();
            for(Work work:works){
                WorkWs workWs = new WorkWs();
                BeanUtils.copyProperties(work, workWs);
                listworkWs.add(workWs);
            }
            response.getWorkWs().addAll(listworkWs);
        }
        response.setServiceStatus(serviceStatus);
        return response;
    }

}

