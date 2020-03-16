package com.openclassrooms.bibliotheque.soap;

import com.openclassrooms.bibliotheque.models.Borrow;
import com.openclassrooms.bibliotheque.service.BorrowService;
import com.openclassrooms.projects.bibliotheque.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TODO : ajouter des commentaires sur les classes et les méthodes

@Endpoint
public class BorrowEndpoint {

    private static final String NAMESPACE_URI = "http://openclassrooms.com/projects/bibliotheque";

    @Autowired
    private BorrowService borrowService;


   /* @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBorrowBookRequest")
    @ResponsePayload
    public GetBorrowBookResponse borrowBook(@RequestPayload GetBorrowBookRequest request) {
        GetBorrowBookResponse response = new GetBorrowBookResponse();
        Boolean borrow = borrowService.borrowBook(request.getWorkId(), request.getMemberId());
        if (borrow != null) {
            BorrowWs borrowWsResult = new BorrowWs();
            BeanUtils.copyProperties(borrow, borrowWsResult);
            response.setBorrowWs(borrowWsResult);
        }
        return response;
    }*/

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBorrowBookRequest")
    @ResponsePayload
    public GetBorrowBookResponse borrowBook(@RequestPayload GetBorrowBookRequest request) {
        GetBorrowBookResponse response = new GetBorrowBookResponse();
        response.setSucceed(borrowService.borrowBook(request.getWorkId(), request.getMemberId()));
        return response;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getExtendBorrowRequest")
    @ResponsePayload
    public GetExtendBorrowResponse extendBorrow(@RequestPayload GetExtendBorrowRequest request) {
        GetExtendBorrowResponse response = new GetExtendBorrowResponse();
        response.setExtendSucceed(borrowService.extendBorrow(request.getId()));
        return response;
    }

    /*@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTerminateBorrowRequest")
    @ResponsePayload
    public GetTerminateBorrowResponse terminateBorrow(@RequestPayload GetTerminateBorrowRequest request) {
        GetTerminateBorrowResponse response = new GetTerminateBorrowResponse();
        Boolean borrowToEnd = borrowService.terminateBorrow(request.getId());
        if (borrowToEnd != null) {
            BorrowWs borrowWsResult = new BorrowWs();
            BeanUtils.copyProperties(borrowToEnd, borrowWsResult);
            response.setBorrowWs(borrowWsResult);
        }
        return response;
    }*/

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTerminateBorrowRequest")
    @ResponsePayload
    public GetTerminateBorrowResponse terminateBorrow(@RequestPayload GetTerminateBorrowRequest request) {
        GetTerminateBorrowResponse response = new GetTerminateBorrowResponse();
        response.setTerminateSucceed(borrowService.terminateBorrow(request.getId()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBorrowListByMemberIdRequest")
    @ResponsePayload
    public GetBorrowListByMemberIdResponse findBorrowListByMemberId(@RequestPayload GetBorrowListByMemberIdRequest request) {
        GetBorrowListByMemberIdResponse response = new GetBorrowListByMemberIdResponse();
        List<Borrow> borrowList = borrowService.findBorrowListByMemberId(request.getMemberId());
        if (borrowList != null && !borrowList.isEmpty()) {
            List<BorrowWs> listBorrowWs = new ArrayList<>();
            for (Borrow borrow : borrowList) {
                BorrowWs borrowWs = new BorrowWs();
                BeanUtils.copyProperties(borrow, borrowWs);
                borrowWs.setMemberId(borrow.getMember().getId().longValue());
                listBorrowWs.add(borrowWs);
            }
            response.getBorrowWs().addAll(listBorrowWs);
        }
        return response;
    }

  /*  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBorrowListByMemberIdRequest")
    @ResponsePayload
    public GetBorrowListByMemberIdResponse findBorrowListByMemberId(@RequestPayload GetBorrowListByMemberIdRequest request) {
        GetBorrowListByMemberIdResponse response = new GetBorrowListByMemberIdResponse();
        response.getBorrowWs().addAll(getListBorrowWs(borrowService.findBorrowListByMemberId(request.getMemberId())));
        return response;
    }*/

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDelayBorrowsRequest")
    @ResponsePayload
    public GetDelayBorrowsResponse findDelayBorrows(@RequestPayload GetDelayBorrowsRequest request) {
        GetDelayBorrowsResponse response = new GetDelayBorrowsResponse();
        response.getBorrowWs().addAll(getListBorrowWs(borrowService.findDelayBorrows()));
        return response;
    }

    private BorrowWs getBorrowWs(Borrow borrow) {
        if (borrow == null) {
            return null;
        }
        BorrowWs borrowWs = new BorrowWs();
        borrowWs.setMember(new MemberWs());
        BeanUtils.copyProperties(borrow, borrowWs);
        BeanUtils.copyProperties(borrow.getMember(), borrowWs.getMember());
        return borrowWs;
    }

    private List<BorrowWs> getListBorrowWs(List<Borrow> borrows) {
        if (borrows == null || CollectionUtils.isEmpty(borrows)) {
            return new ArrayList<>();
        }
        return borrows.stream().map(borrow -> getBorrowWs(borrow)).collect(Collectors.toList());
    }
}
