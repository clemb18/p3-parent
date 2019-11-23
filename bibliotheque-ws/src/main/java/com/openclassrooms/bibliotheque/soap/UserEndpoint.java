package com.openclassrooms.bibliotheque.soap;


import com.openclassrooms.bibliotheque.service.UserService;
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
public class UserEndpoint {

    private static final String NAMESPACE_URI = "http://openclassrooms.com/projects/bibliotheque";

    @Autowired
    private UserService userService;


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getUserByLoginAndPasswordRequest")
    @ResponsePayload
    public GetUserByLoginAndPasswordResponse getUserByLoginAndPassword(@RequestPayload GetUserByLoginAndPasswordRequest request) {
        GetUserByLoginAndPasswordResponse response = new GetUserByLoginAndPasswordResponse();
        ServiceStatus serviceStatus = new ServiceStatus();
        User findUser = userService.findByLoginAndPassword(request.getLogin(), request.getPassword());
        if (findUser == null) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            User userResult = new User();
            BeanUtils.copyProperties(findUser, userResult);
            response.setUser(userResult);
        }
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createUserRequest")
    @ResponsePayload
    public CreateUserResponse createUser(@RequestPayload CreateUserRequest request) {
        CreateUserResponse createUserResponse = new CreateUserResponse();
        ServiceStatus serviceStatus = new ServiceStatus();
        User userCreated = userService.create(request.getUser());
        if (userCreated == null) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            User userResult = new User();
            BeanUtils.copyProperties(userCreated, userResult);
            createUserResponse.setUser(userResult);
        }
        createUserResponse.setServiceStatus(serviceStatus);
        return createUserResponse;
    }
}
