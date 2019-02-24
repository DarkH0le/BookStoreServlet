package com.bookstore.controller;

import com.bookstore.bean.Book;
import com.bookstore.model.UserManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "login" , urlPatterns = "/login")
public class ServletLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        UserManager um = new UserManager();
//        System.out.println(um.validateUser(email,password));
        Boolean validUser = um.validateUser(email,password);
        request.setAttribute("valid", validUser);

        //TODO forward to view when get a valid user

        request.getRequestDispatcher("/html/loginviewtest.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
