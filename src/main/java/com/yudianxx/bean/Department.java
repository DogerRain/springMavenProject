package com.yudianxx.bean;

public class Department {

    String borrowId;
    String borrowTitle;
    String bidNo;

    public Department(String borrowId, String borrowTitle, String bidNo) {
        this.borrowId = borrowId;
        this.borrowTitle = borrowTitle;
        this.bidNo = bidNo;
    }

    public String getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(String borrowId) {
        this.borrowId = borrowId;
    }

    public String getBorrowTitle() {
        return borrowTitle;
    }

    public void setBorrowTitle(String borrowTitle) {
        this.borrowTitle = borrowTitle;
    }

    public String getBidNo() {
        return bidNo;
    }

    public void setBidNo(String bidNo) {
        this.bidNo = bidNo;
    }
}
