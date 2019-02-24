package com.bookstore.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "com.bookstore.controller.search")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//
//        <div class="book">
//  <img src="" alt="" >
//  <h1></h1>
//  <p class="bookSynopsis">$19.99</p>
//  <p></p>
//  <p><button></button></p>
//</div>
    }
}
