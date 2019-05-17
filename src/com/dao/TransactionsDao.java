package com.dao;

import com.bean.Transaction;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransactionsDao {
    private Connection conn;

    public TransactionsDao(){
        String myDriver = "com.mysql.jdbc.Driver";
        String myUrl = "jdbc:mysql://46.101.176.39/bank_db";
        try {
            Class.forName(myDriver);
            conn = DriverManager.getConnection(myUrl, "admin", "admin");
        }
        catch (ClassNotFoundException e) { e.printStackTrace(); }
        catch (SQLException e) { e.printStackTrace(); }
    }

    public void create(Transaction trans){
        try {
            //debit account
            String query = "Update Account Set acc_balance = acc_balance - " + trans.getAmountExchanged() + " where acc_no = " + trans.getDebitedAccount() + ";";
            conn.createStatement().executeUpdate(query);

            //credit account
            query = "Update Account Set acc_balance = acc_balance + " + trans.getAmountExchanged() + " where acc_no = " + trans.getCreditedAccount() + ";";
            conn.createStatement().executeUpdate(query);

            //exception thrown before this executes if credit or debit failed
            //Insert transaction into table
            query = "INSERT INTO Transaction(payer_acc_no, payee_acc_no, trans_amt, trans_remarks, trans_status) VALUES (" +
                    trans.getDebitedAccount() +"," + trans.getCreditedAccount() + "," +  trans.getAmountExchanged() +",'" + trans.getRemarks() + "','" + trans.getStatus() + "');";
            conn.createStatement().executeUpdate(query);

        } catch (SQLException e) { e.printStackTrace(); }
    }

    public Transaction read(int transactionId){
        Transaction transaction = new Transaction(); //return empty transaction if not found
        try {
            String query = "select * from Transaction where trans_id = " + transactionId + ";";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                transaction = new Transaction(rs.getInt("trans_id"),
                        rs.getInt("payer_acc_no"), rs.getInt("payee_acc_no"),
                        rs.getInt("trans_amt"), rs.getTimestamp("trans_timestamp"));

                transaction.setRemarks(rs.getString("trans_remarks"));
                transaction.setStatus(rs.getString("trans_status"));
            }
            st.close();

        } catch (SQLException e) { e.printStackTrace(); }

        return transaction;
    }

    public List<Transaction> readAll(){
        List<Transaction> transactions = new ArrayList<>();
        try {
            String query = "select * from Transaction";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            conn.createStatement().executeQuery(query);

            while (rs.next()) {
                Transaction currentTransaction = new Transaction(rs.getInt("trans_id"),
                        rs.getInt("payer_acc_no"), rs.getInt("payee_acc_no"),
                        rs.getInt("trans_amt"), rs.getTimestamp("trans_timestamp"));

                currentTransaction.setRemarks(rs.getString("trans_remarks"));
                currentTransaction.setStatus(rs.getString("trans_status"));
                transactions.add(currentTransaction);
            }
            st.close();

        } catch (SQLException e) { e.printStackTrace(); }

        return transactions;
    }

    public void update(int transactionId, Transaction newTransaction){
        try {
            String query = "Update Transaction Set payer_acc_no =" + newTransaction.getDebitedAccount() + ", payee_acc_no=" + newTransaction.getCreditedAccount() +
                    ", trans_amt=" + newTransaction.getAmountExchanged() + ", trans_remarks='" + newTransaction.getRemarks() + "', trans_status='" + newTransaction.getStatus() +
                    "'where trans_id = " + transactionId + ";";
            conn.createStatement().executeUpdate(query);

        } catch (SQLException e) { e.printStackTrace(); }
    }

    public Transaction delete(int transactionId){
        Transaction deletedTrans = new Transaction(); //return empty if not found
        try {
            deletedTrans = read(transactionId);
            String query = "Delete from Transaction where trans_id = " + transactionId + ";";
            conn.createStatement().executeUpdate(query);
        } catch (SQLException e) { e.printStackTrace(); }
        return deletedTrans;
    }
}
