package com.bean;

public abstract class Account {
    private final int accountNumber;
    protected double balance;
    protected int bsb;

    protected Account(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public int getBsb() { return bsb; }

    public void setBsb(int bsb) { this.bsb = bsb; }
}
