package com.bean;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Transaction {
    private int id;
    private int debitedAcc, creditedAcc;
    private Timestamp time;
    private double amount;

    private String remarks, status;

    public Transaction(int id, int debitedAcc, int creditedAcc, double amount, Timestamp time){
        this.id = id;
        this.debitedAcc = debitedAcc;
        this.creditedAcc = creditedAcc;
        this.amount = amount;
        this.time = time;
        this.remarks = "";
        this.status = "";
    }

    public int getDebitedAccount(){
        return debitedAcc;
    }
    public int getCreditedAccount(){
        return creditedAcc;
    }
    public double getAmountExchanged(){
        return amount;
    }
    public Timestamp getTime(){
        return time;
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
