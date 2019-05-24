package org.occ.p3.model;

public enum BorrowStatusEnum {
    ENCOURS("En Cours"),
    PROLONGE("Prolongé"),
    RENDU("Rendu");

    private String status;

    BorrowStatusEnum(String status){
        this.status=status;
    }
    public String val() {
        return status;
    }
}