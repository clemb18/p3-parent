package com.openclassrooms.bibliotheque.service;

public interface BorrowService {

   /*Borrow borrowBook(Long workId, Long memberId);
   Borrow extendBorrow(Long borrowId);
   Borrow terminateBorrow(Long borrowId, Long memberId);*/


   Boolean borrowBook(Long workId, Long memberId);
   Boolean extendBorrow(Long borrowId);
   Boolean terminateBorrow(Long borrowId, Long memberId);


}