package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.appexception.AppException;
import com.bean.Customer;
import com.bean.Transaction;
import com.bean.User;

/**
 * 
 * @author Dom R
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	public User createUser(User user) {
		MySQLConnection conn = null;
		ResultSet rs = null;
		try {
			if (user == null) {
				throw new AppException("user object null");
			}
			
			// 1. get connection
			conn = new MySQLConnection();
			conn.getConnection();
			
			// 2. run query
			String query = "INSERT INTO user VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, user.getUserId());
			ps.setString(2, user.getFirstName());
			ps.setString(3, user.getLastName());
			ps.setString(4, user.getAddress());
			ps.setString(5, user.getUserName());
			ps.setString(6, user.getPassword());
			rs = ps.executeQuery();

			// 3. process rs			
			// Assumption / Hack - new users are customers
			Customer customer = new Customer();
			while (rs.next()) {
				customer.setUserId(rs.getInt("userId"));
				customer.setFirstName(rs.getString("firstName"));
				customer.setLastName(rs.getString("lastName"));
				customer.setAddress(rs.getString("address"));
				customer.setUserName(rs.getString("userName"));
				customer.setPassword(rs.getString("password"));
			}

			// 4. check
			
		} catch (AppException e ) {
			System.out.println(e.getMessage());
		} catch (SQLException se) {
			System.out.println("SQL Exception :" + se.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				System.err.println("Error closing db connection");
			}
		}
		return user;
	}

	@Override
	public User updateUser(User user) {
		MySQLConnection conn = null;
		ResultSet rs = null;
		try {
			if (user == null) {
				throw new AppException("user object null");
			}
			
			// 1. get connection
			conn = new MySQLConnection();
			conn.getConnection();
			
			// 2. run query
			String query = "UPDATE * FROM user WHERE userId = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, user.getUserId());
			rs = ps.executeQuery();
			
			// 3. process rs
			Customer customer = new Customer();
			while (rs.next()) {
				customer.setUserId(rs.getInt("userId"));
				customer.setFirstName(rs.getString("firstName"));
				customer.setLastName(rs.getString("lastName"));
				customer.setAddress(rs.getString("address"));
				customer.setUserName(rs.getString("userName"));
				customer.setPassword(rs.getString("password"));
			}

			// 4. check
			
		} catch (AppException e ) {
			System.out.println(e.getMessage());
		} catch (SQLException se) {
			System.out.println("SQL Exception :" + se.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				System.err.println("Error closing db connection");
			}
		}
		return user;
	}

	@Override
	public User findUser(User user) {
		MySQLConnection conn = null;
		ResultSet rs = null;
		try {
			if (user == null) {
				throw new AppException("user object null");
			}
			
			// 1. get connection
			conn = new MySQLConnection();
			conn.getConnection();
			
			// 2. run query
			String query = "SELECT * FROM user"
							+ "WHERE userId = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, user.getUserId());
			rs = ps.executeQuery();
			
			// 3. process rs
			Customer customer = new Customer();
			while (rs.next()) {
				customer.setUserId(rs.getInt("userId"));
				customer.setFirstName(rs.getString("firstName"));
				customer.setLastName(rs.getString("lastName"));
				customer.setAddress(rs.getString("address"));
				customer.setUserName(rs.getString("userName"));
				customer.setPassword(rs.getString("password"));
			}

			// 4. check
			
		} catch (AppException e ) {
			System.out.println(e.getMessage());
		} catch (SQLException se) {
			System.out.println("SQL Exception :" + se.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				System.err.println("Error closing db connection");
			}
		}
		return user;
	}

}
