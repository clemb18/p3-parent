package org.occ.p3.service;

import org.occ.p3.model.Borrow;
import org.occ.p3.model.Member;

import java.util.ArrayList;
import java.util.Date;


public interface BorrowService {



    public Boolean borrowBook(Integer workId,Integer membreId);

    public Boolean extendBorrow(Integer borrowId);

    public Boolean endBorrow(Integer borrowId);

    public ArrayList<Borrow> getBorrowListWithEndDateExceeded();

}
