package com.bookstore.controller;

import com.bookstore.bean.User;
import com.bookstore.model.UserManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletRegister" , urlPatterns = "/register")
public class ServletRegister extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        UserManager um = new UserManager();
        User validUser = um.registerUser(email,password);
        if(validUser != null){
            request.setAttribute("register", validUser);
        } else {
            request.setAttribute("register", "Error while registering the user...");
        }


        //TODO forward to view when get a valid user

        request.getRequestDispatcher("/html/registeredUser.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
