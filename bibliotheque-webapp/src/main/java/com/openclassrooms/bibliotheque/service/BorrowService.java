package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.ws.BorrowWs;

public interface BorrowService {

    BorrowWs borrowBook(Long workId, Long memberId);


}
