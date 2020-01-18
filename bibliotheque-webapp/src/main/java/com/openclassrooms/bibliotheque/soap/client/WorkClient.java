package com.openclassrooms.bibliotheque.soap.client;

import com.openclassrooms.bibliotheque.ws.GetWorkByAuthorRequest;
import com.openclassrooms.bibliotheque.ws.GetWorkByAuthorResponse;
import com.openclassrooms.bibliotheque.ws.WorkWs;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import java.util.List;

public class WorkClient extends WebServiceGatewaySupport {

    @Value(value = "${bibliotheque.ws.url}")
    private String bibliothequeWsUrl;

    public List<WorkWs> getWorkByAuthorResponse(String author) {
        GetWorkByAuthorRequest request = new GetWorkByAuthorRequest();
        request.setAuthor(author);
        GetWorkByAuthorResponse response = (GetWorkByAuthorResponse) getWebServiceTemplate().marshalSendAndReceive(bibliothequeWsUrl, request,
                new SoapActionCallback("http://openclassrooms.com/projects/bibliotheque/GetWorksByAuthorRequest"));
       return response.getWorkWs();

    }

}


