package com.openclassrooms.bibliotheque.soap.client;

import com.openclassrooms.bibliotheque.ws.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


@Component
public class MemberClient extends WebServiceGatewaySupport {

    @Value(value = "${bibliotheque.ws.url}")
    private String bibliothequeWsUrl;

    public MemberWs getMemberByMailAdressAndPasswordResponse(String mailAdress, String password) {
        GetMemberByMailAdressAndPasswordRequest request = new GetMemberByMailAdressAndPasswordRequest();
        request.setMailAdress(mailAdress);
        request.setPassword(password);
        GetMemberByMailAdressAndPasswordResponse response = (GetMemberByMailAdressAndPasswordResponse) getWebServiceTemplate().marshalSendAndReceive(bibliothequeWsUrl, request,
                new SoapActionCallback("http://openclassrooms.com/projects/bibliotheque/GetMemberByMailAdressAndPasswordRequest"));
        return response.getMemberWs();
    }

}
