package com.openclassrooms.bibliotheque.service;

public interface BorrowService {

    public Boolean borrowBook(Long workId,Long memberId);
    public Boolean extendBorrow(Long borrowId);
    public Boolean terminateBorrow(Long borrowId, Long memberId);


}