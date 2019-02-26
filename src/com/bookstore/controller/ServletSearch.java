package com.bookstore.controller;

import com.bookstore.model.BookManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//TODO Rename Class to searchServlet

@WebServlet(name = "ServletSearch" , urlPatterns = "/search")
public class ServletSearch extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BookManager books = new BookManager();

        String searchBook = request.getParameter("ServletSearch") != null ? request.getParameter("ServletSearch") : "";

//        System.out.println("buscnado shit con " + searchBook);

//        System.out.println(books.searchBook(searchBook).toString());
        request.setAttribute("bookList",books.searchBook(searchBook));

            request.getRequestDispatcher("html/searchResult.jsp").forward(request,response);


    }

}
