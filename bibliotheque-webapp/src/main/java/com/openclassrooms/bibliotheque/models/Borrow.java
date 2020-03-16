package com.openclassrooms.bibliotheque.models;

import com.openclassrooms.bibliotheque.ws.MemberWs;

public class Borrow {



    private long id;

    private String status;
    
    private String startBorrowDate;
    
    private String endBorrowDate;

    private boolean extended;
   
    private String workTitle;

    private long memberId;
    
    private MemberWs member;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartBorrowDate() {
        return startBorrowDate;
    }

    public void setStartBorrowDate(String startBorrowDate) {
        this.startBorrowDate = startBorrowDate;
    }

    public String getEndBorrowDate() {
        return endBorrowDate;
    }

    public void setEndBorrowDate(String endBorrowDate) {
        this.endBorrowDate = endBorrowDate;
    }

    public boolean isExtended() {
        return extended;
    }

    public void setExtended(boolean extended) {
        this.extended = extended;
    }

    public String getWorkTitle() {
        return workTitle;
    }

    public void setWorkTitle(String workTitle) {
        this.workTitle = workTitle;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public MemberWs getMember() {
        return member;
    }

    public void setMember(MemberWs member) {
        this.member = member;
    }
}
