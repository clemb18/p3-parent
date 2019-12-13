package com.openclassrooms.bibliotheque.service;

public interface BorrowService {


   Boolean borrowBook(Long workId, Long memberId);
   Boolean extendBorrow(Long borrowId);
   // Boolean terminateBorrow(Long borrowId, Long memberId);
    Boolean terminateBorrow(Long borrowId);

}