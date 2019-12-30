package com.openclassrooms.bibliotheque.soap.client;

import com.openclassrooms.projects.bibliot.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

/**
 * Client SOAP qui envoie des requets SOAP Web Service
 */
public class UserClient extends WebServiceGatewaySupport {

    @Value(value = "${bibliotheque.ws.url}")
    private String bibliothequeWsUrl;

    /**
     * Client SOAP WS-Service pour rechercher un utilisateur à partir du login et du mot de passe.
     * @param login login de l'utilisateur
     * @param password mot de passe de l'utilisateur
     * @return
     */
    public UserWs getUserByLoginAndPasswordResponse(String login, String password) {
        GetUserByLoginAndPasswordRequest request = new GetUserByLoginAndPasswordRequest();
        request.setLogin(login);
        request.setPassword(password);
        GetUserByLoginAndPasswordResponse response = (GetUserByLoginAndPasswordResponse) getWebServiceTemplate().marshalSendAndReceive(bibliothequeWsUrl, request,
                new SoapActionCallback("http://openclassrooms.com/projects/bibliot/GetUserByLoginAndPasswordRequest"));
        return response.getUserWs();
    }

    public UserWs createUserResponse(String login, String firstName, String name, String password) {
        CreateUserRequest request = new CreateUserRequest();
        UserWs user = new UserWs();
        user.setFirstName(firstName);
        user.setName(name);
        user.setLogin(login);
        user.setPassword(password);
        request.setUserWs(user);
        CreateUserResponse response = (CreateUserResponse) getWebServiceTemplate()
                .marshalSendAndReceive(bibliothequeWsUrl, request,
                        new SoapActionCallback(
                                "http://openclassrooms.com/projects/bibliot/CreateUserRequest"));
        return response.getUserWs();
    }
}
