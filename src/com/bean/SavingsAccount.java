package com.bean;

public class SavingsAccount extends Account{
    private double annualCharge, minimumBalance;
    private boolean belowBalance;

    public SavingsAccount(int accountNumber, double balance) {
        //super(accountNumber, balance);
    }

    public double getAnnualCharge() {
        return annualCharge;
    }

    public void setAnnualCharge(double annualCharge) {
        this.annualCharge = annualCharge;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public boolean isBelowBalance() {
        return belowBalance;
    }

    public void setBelowBalance(boolean belowBalance) {
        this.belowBalance = belowBalance;
    }
}
