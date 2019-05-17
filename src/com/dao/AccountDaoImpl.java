package com.dao;

import com.bean.Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDaoImpl implements AccountDao {

    @Override
    public int create(Account account){

        String db_url = "jdbc:mysql://46.101.176.39/bank_db"; // my database
        String admin = "admin";
        String password = "admin";
        String myDriver = "com.mysql.jdbc.Driver"; // Driver for mysql
        Statement statement = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName(myDriver); // load the Driver
            connection = DriverManager.getConnection(db_url,admin,password); // establish the connection through the Driver
            statement = connection.createStatement(); // creating the statement

            // getting values from bean
            int acc_no = account.getAccountNumber();
            int user_id = account.getUser().getUserId();
            String acc_type = account.getAccountType();
            int acc_balance = account.getAccountBalance();
            int acc_min_balance = account.getAccountMinBalance();
            int acc_bsb = account.getAccountBSB();

            String myQuery = "INSERT INTO Account VALUES (default,?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(myQuery);
            preparedStatement.setInt(1, acc_no);
            preparedStatement.setInt(2, user_id);
            preparedStatement.setString(3, acc_type);
            preparedStatement.setInt(4, acc_balance);
            preparedStatement.setInt(5, acc_min_balance);
            preparedStatement.setInt(6, acc_bsb);

            int result = preparedStatement.executeUpdate(myQuery); // executing the insert query

            return result;

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {

        }finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;

    }



    @Override
    public boolean update(Account account) {

        return false;
    }


    @Override
    public void read(int id) {
        // TODO Auto-generated method stub

    }

    @Override
    public Account findAccountByNumber(int number) {

        String db_url = "jdbc:mysql://46.101.176.39/bank_db"; // my database
        String admin = "admin";
        String password = "admin";
        String myDriver = "com.mysql.jdbc.Driver"; // Driver for mysql
        Statement statement = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName(myDriver); // load the Driver
            connection = DriverManager.getConnection(db_url,admin,password); // establish the connection through the Driver
            statement = connection.createStatement(); // creating the statement

            String myQuery = "SELECT * FROM Account WHERE acc_no = ?";
            preparedStatement = connection.prepareStatement(myQuery);
            preparedStatement.setInt(1, number);

            ResultSet result = preparedStatement.executeQuery(myQuery); // executing the insert query

            return (Account) result;

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {

        }finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null ;
    }




}