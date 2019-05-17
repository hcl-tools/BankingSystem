package com.service;

import com.bean.Transaction;
import com.dao.AccountDao;
import com.dao.TransactionsDao;

import java.sql.SQLException;
import java.util.List;

public class CreateTransaction {
    public static void main(String[] args){ //for testing
        Transaction transaction = new Transaction(2, 1, 28);
        transaction.setRemarks("shit2");
        transaction.setStatus("");

        //new TransactionsDao().create(4, transaction);
        //new TransactionsDao().delete(6);
    }
    private TransactionsDao transactionsDao;
    public CreateTransaction(){
        transactionsDao = new TransactionsDao();
    }

    public List<Transaction> getAllTransactions(){
        return transactionsDao.readAll();
    }

    public Transaction getTransaction(int transactionId){
        return transactionsDao.read(transactionId);
    }

    public Transaction createTransaction(int creditAccountId, int debitAccountId, double amount, String remarks, String status){
        Transaction transaction = new Transaction(debitAccountId, creditAccountId, amount);
        transaction.setRemarks(remarks);
        transaction.setStatus(status);

        transactionsDao.create(transaction);

        return transaction;
    }

    public Transaction updateTransaction(int oldAccountId, int creditAccountId, int debitAccountId, double amount, String remarks, String status){
        Transaction transaction = new Transaction(debitAccountId, creditAccountId, amount);
        transaction.setRemarks(remarks);
        transaction.setStatus(status);

        transactionsDao.update(oldAccountId, transaction);
        return transaction;
    }

    public void deleteTransaction(int transactionId){
        transactionsDao.delete(transactionId);
    }
}
