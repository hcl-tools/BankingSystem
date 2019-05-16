package com.service;

import com.dao.AccountDao;

import java.sql.SQLException;

public class CreateTransaction {
    public static void main(String[] args){
        new CreateTransaction().createTransaction(1,2,3);
    }
    public CreateTransaction(){}

    public String createTransaction(int creditAccountId, int debitAccountId, double amount){
        String shit = "";
        return shit;
    }
}
