package com.openclassrooms.bibliotheque.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;

@Endpoint
public class BorrowEndpoint {

 /*   private static final String NAMESPACE_URI = "http://openclassrooms.com/projects/bibliotheque";

    @Autowired
    private BorrowService borrowService;


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBorrowBookRequest")
    @ResponsePayload
    public GetBorrowBookResponse borrowBook(@RequestPayload GetBorrowBookRequest request) {
        GetBorrowBookResponse response = new GetBorrowBookResponse();
        ServiceStatus serviceStatus = new ServiceStatus();
        Borrow borrowToAct = borrowService.borrowBook(request.getWorkId(), request.getMembreId());
        if (borrowToAct == null) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            Borrow borrowResult = new Borrow();
            BeanUtils.copyProperties(borrowToAct, borrowResult);
            response.setBorrow(borrowResult);
        }
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getExtendBorrowRequest")
    @ResponsePayload
    public GetExtendBorrowResponse extendBorrow(@RequestPayload GetExtendBorrowRequest request) {
        GetExtendBorrowResponse response = new GetExtendBorrowResponse();
        ServiceStatus serviceStatus = new ServiceStatus();
        Borrow borrowToExtend = borrowService.extendBorrow(request.getBorrowId());
        if (borrowToExtend == null) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            Borrow borrowResult = new Borrow();
            BeanUtils.copyProperties(borrowToExtend, borrowResult);
            response.setBorrow(borrowResult);
        }
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTerminateBorrowRequest")
    @ResponsePayload
    public GetTerminateBorrowResponse terminateBorrow(@RequestPayload GetTerminateBorrowRequest request) {
        GetTerminateBorrowResponse response = new GetTerminateBorrowResponse();
        ServiceStatus serviceStatus = new ServiceStatus();
        Borrow borrowToEnd = borrowService.terminateBorrow(request.getWorkId(), request.getMembreId());
        if (borrowToEnd == null) {
            serviceStatus.setStatus(NOT_FOUND);
        } else {
            serviceStatus.setStatus(SUCCESS);
            Borrow borrowResult = new Borrow();
            BeanUtils.copyProperties(borrowToEnd, borrowResult);
            response.setBorrow(borrowResult);
        }
        response.setServiceStatus(serviceStatus);
        return response;
    }*/
}
