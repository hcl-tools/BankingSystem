package com.dao;

import com.bean.Account;
import com.bean.Transaction;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransactionsDao {
    public void create(Transaction trans){
        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://46.101.176.39/bank_db";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "admin", "admin");

            //debit account
            String query = "Update Account Set acc_balance = acc_balance - " + trans.getAmountExchanged() + " where acc_no = " + trans.getDebitedAccount();
            conn.createStatement().executeQuery(query);

            //credit account
            query = "Update Account Set acc_balance = acc_balance + " + trans.getAmountExchanged() + " where acc_no = " + trans.getDebitedAccount();
            conn.createStatement().executeQuery(query);

            //Insert transaction into table
            StringBuilder queryBuilder = new StringBuilder();
            queryBuilder.append("insert into Transaction ");
            queryBuilder.append("(payer_acc_no, payee_acc_no, trans_amt, trans_remarks, trans_status)");
            queryBuilder.append(trans.getDebitedAccount() + ", " + trans.getCreditedAccount() + ", " + trans.getAmountExchanged()
                                    + ", " + trans.getRemarks() + ", " + trans.getStatus());
            queryBuilder.append(";");

            conn.createStatement().executeQuery(queryBuilder.toString());
        }catch (ClassNotFoundException e) { e.printStackTrace(); }
        catch (SQLException e) { e.printStackTrace(); }
    }

    public List<Transaction> read(){
        List<Transaction> transactions = new ArrayList<>();

        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://46.101.176.39/bank_db";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "admin", "admin");

            String query = "select * from Transaction";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);


            while (rs.next()) {
                Transaction currentTransaction = new Transaction(rs.getInt("trans_id"),
                    rs.getInt("payer_acc_no"), rs.getInt("payee_acc_no"),
                    rs.getInt("trans_amt"), rs.getTimestamp("trans_timestamp"));

                currentTransaction.setRemarks(rs.getString("trans_remarks"));
                currentTransaction.setStatus("trans_status");
                transactions.add(currentTransaction);
            }
            st.close();
        }
        catch (ClassNotFoundException e) { e.printStackTrace(); }
        catch (SQLException e) { e.printStackTrace(); }

        return transactions;
    }
    public void update(){

    }

    public void delete(){

    }
}
