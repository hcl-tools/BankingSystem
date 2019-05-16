package com.bean;

import java.time.Period;

public class CheckingAccount extends Account {
    private double belowBalanceFee, transactionFee, minimumBalance;
    private Period belowBalancePeriod;
    private boolean belowBalance;

    public CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public double getBelowBalanceFee() {
        return belowBalanceFee;
    }

    public void setBelowBalanceFee(double belowBalanceFee) {
        this.belowBalanceFee = belowBalanceFee;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public Period getBelowBalancePeriod() {
        return belowBalancePeriod;
    }

    public void setBelowBalancePeriod(Period belowBalancePeriod) {
        this.belowBalancePeriod = belowBalancePeriod;
    }

    public boolean isBelowBalance() {
        return belowBalance;
    }

    public void setBelowBalance(boolean belowBalance) {
        this.belowBalance = belowBalance;
    }
}
