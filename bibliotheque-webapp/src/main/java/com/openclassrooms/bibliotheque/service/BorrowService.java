package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.ws.BorrowWs;

import java.util.List;

public interface BorrowService {

    BorrowWs borrowBook(Long workId, Long memberId);

    boolean extendBorrow(Long borrowId);

    boolean terminateBorrow(Long borrowId);

    List<BorrowWs> findBorrowListByMemberId(Long memberId);


}
