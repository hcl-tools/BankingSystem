package com.dao;

import com.bean.Account;
import com.bean.CurrentAccount;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDao {
    public void create(Account acc){

    }

    public List<Account> read(){
        List<Account> accounts = new ArrayList<>();

        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://46.101.176.39/bank_db";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "admin", "admin");

            String query = "select * from Account";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);


            while (rs.next()) { //unfinished works for transaction testing
                Account currentAccount;
                String accountType = rs.getString("acc_type");
                if (accountType.equals("current")) {
                    currentAccount = new CurrentAccount(rs.getInt("acc_no"), rs.getInt("acc_balance"));
                    currentAccount.setBsb(rs.getInt("acc_bsb"));
                    accounts.add(currentAccount);
                }
            }
            st.close();
        }
        catch (ClassNotFoundException e) { e.printStackTrace(); }
        catch (SQLException e) { e.printStackTrace(); }

        return accounts;
    }
    public void update(){

    }

    public void delete(){

    }
}
