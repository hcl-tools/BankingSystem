package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import com.appexception.AppException;
import com.bean.Customer;
import com.bean.User;
import com.service.UserManager;
import com.service.UserManagerImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @authors Dom R, Michael N, Crystal S
 *
 */
@WebServlet("/AppController")
public class AppController extends HttpServlet {
	
	private boolean isLoggedIn = false;
	
	private static final long serialVersionUID = 1L;

	public AppController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) { }

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request != null) {
			switch (request.getParameter("page")) {
			case "login":  // customer or banker 
				login(request, response);
				break;
			case "myAccounts": // customer 
				getAccounts(request, response, true);
				break;
			case "findAccounts": // banker 
				getAccounts(request, response, false);
				break;
			case "transferFunds": // customer 
				transferFunds(request, response);
				break;
			case "createAccountCustomer": // customer 
				createAccount(request, response, true); 
				break;
			case "createAccountBanker": // banker 
				createAccount(request, response, false); 
				break;
			case "updateContactDetails": // customer 
				updateContactDetails(request, response); 
				break;
			default:
				break;
			}
		}
	}

	public void login(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* 1. PRE-VALIDATE */
			if (request.getParameter("userName").equals("") || request.getParameter("userName") == null
					|| request.getParameter("password").equals("") || request.getParameter("password") == null) {
				System.out.println("a");
				throw new AppException("no data submitted");
			}

			/* 2. EXTRACT */
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");

			/* 3. MAKE DTO */
			User user = new User();

			/* 4. BOOMERANG TO SERVICE LAYER FOR PROCESSING */
			UserManager userManager = new UserManagerImpl();
			User returnedUser = userManager.validateUser(user);

			/* 5. RESPOND TO CLIENT */
			// validate return
			if (returnedUser == null) {
				throw new AppException("database error returning user information");
			}
			
			// valid login, if returnedUser DTO has a firstName
			if (returnedUser.getFirstName() == null || returnedUser.getFirstName().equals("")) {
				throw new AppException("invalid login");
			} else {
				isLoggedIn = true;
			}
			
			// check user type for page direct
			if (returnedUser instanceof Customer) {
				response.sendRedirect("MyAccounts.jsp");
			} else {
				response.sendRedirect("BankerDashboard.jsp");
			}

		} catch (AppException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void getAccounts(HttpServletRequest request, HttpServletResponse response, boolean isCustomerRequest) {
		if (isCustomerRequest) {
			
		} else {
			// banker request for same account info for a customer ... different response.sendRedirect.jsp
		}
	}
	
	public void transferFunds(HttpServletRequest request, HttpServletResponse response) {

	}	
	
	public void createAccount(HttpServletRequest request, HttpServletResponse response, boolean isCustomerRequest) {
		if (isCustomerRequest) {
				
		} else {
			// banker request for same account info for a customer ... different response.sendRedirect.jsp
		}

	}

	public void updateContactDetails(HttpServletRequest request, HttpServletResponse response) {

	}

	public void findAccount(HttpServletRequest request, HttpServletResponse response) {

	}

}