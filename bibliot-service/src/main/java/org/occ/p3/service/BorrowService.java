package org.occ.p3.service;

import java.util.ArrayList;


public interface BorrowService {



    public Boolean borrowBook(Integer workId,Integer membreId);

    public Boolean extendBorrow(Integer borrowId);

    public Boolean endBorrow(Integer borrowId);

    //public ArrayList<org.occ.p3.client.ws.Borrow> getBorrowListWithEndDateExceeded();

}
