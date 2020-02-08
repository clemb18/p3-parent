package com.openclassrooms.bibliotheque.soap.client;


import com.openclassrooms.bibliotheque.ws.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Component
public class BorrowClient extends WebServiceGatewaySupport {

    @Value(value = "${bibliotheque.ws.url}")
    private String bibliothequeWsUrl;

    public BorrowWs getBorrowBookResponse(Long workId, Long memberId) {
        GetBorrowBookRequest request = new GetBorrowBookRequest();
        request.setWorkId(workId);
        request.setMemberId(memberId);
        GetBorrowBookResponse response = (GetBorrowBookResponse) getWebServiceTemplate().marshalSendAndReceive(bibliothequeWsUrl, request,
                new SoapActionCallback("http://openclassrooms.com/projects/bibliotheque/GetBorrowBookRequest"));
        return response.getBorrowWs();
    }

}
