package com.openclassrooms.bibliotheque.soap;

import com.openclassrooms.bibliotheque.service.BorrowService;
import com.openclassrooms.projects.bibliotheque.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import static com.openclassrooms.projects.bibliotheque.Status.NOT_FOUND;
import static com.openclassrooms.projects.bibliotheque.Status.SUCCESS;

@Endpoint
public class BorrowEndpoint {

    private static final String NAMESPACE_URI = "http://openclassrooms.com/projects/bibliotheque";

    @Autowired
    private BorrowService borrowService;


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBorrowBookRequest")
    @ResponsePayload
    public GetBorrowBookResponse borrowBook(@RequestPayload GetBorrowBookRequest request) {
        GetBorrowBookResponse response = new GetBorrowBookResponse();
        ServiceStatus serviceStatus = new ServiceStatus();

        Boolean borrow = borrowService.borrowBook(request.getWorkId(), request.getMemberId());
        if (borrow == null) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            BorrowWs borrowWsResult = new BorrowWs();
            BeanUtils.copyProperties(borrow, borrowWsResult);
            response.setBorrowWs(borrowWsResult);
        }
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getExtendBorrowRequest")
    @ResponsePayload
    public GetExtendBorrowResponse extendBorrow(@RequestPayload GetExtendBorrowRequest request) {
        GetExtendBorrowResponse response = new GetExtendBorrowResponse();
        ServiceStatus serviceStatus = new ServiceStatus();
        Boolean borrowToExtend = borrowService.extendBorrow(request.getId());
        if (borrowToExtend == null) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            BorrowWs borrowWs = new BorrowWs();
            BeanUtils.copyProperties(borrowToExtend, borrowWs);
            response.setBorrowWs(borrowWs);
        }
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTerminateBorrowRequest")
    @ResponsePayload
    public GetTerminateBorrowResponse terminateBorrow(@RequestPayload GetTerminateBorrowRequest request) {
        GetTerminateBorrowResponse response = new GetTerminateBorrowResponse();
        ServiceStatus serviceStatus = new ServiceStatus();
        Boolean borrowToEnd = borrowService.terminateBorrow(request.getId());
        if (borrowToEnd == null) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            BorrowWs borrowWsResult = new BorrowWs();
            BeanUtils.copyProperties(borrowToEnd, borrowWsResult);
            response.setBorrowWs(borrowWsResult);
        }
        response.setServiceStatus(serviceStatus);
        return response;
    }
}
