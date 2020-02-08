package com.openclassrooms.bibliotheque.service.impl;

import com.openclassrooms.bibliotheque.service.BorrowService;
import com.openclassrooms.bibliotheque.soap.client.BorrowClient;
import com.openclassrooms.bibliotheque.ws.BorrowWs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowServiceImpl implements BorrowService {

    @Autowired
    private BorrowClient borrowClient;

    @Override
    public BorrowWs borrowBook(Long workId, Long memberId) {

        return borrowClient.getBorrowBookResponse(workId, memberId);
    }
}
