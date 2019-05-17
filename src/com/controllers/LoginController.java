package com.controllers;

import com.bean.User;
import com.dao.AccountDao;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.SQLException;


@WebServlet(urlPatterns = "/controller")
public class LoginController extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.getParameter("");
        response.sendRedirect( "login.jsp");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //PrintWriter pw = response.getWriter();
        //pw.println("Login: ");
        //RequestDispatcher rd = request.getRequestDispatcher("index.jsp");

    }
}