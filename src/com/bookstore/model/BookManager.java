package com.bookstore.model;

import com.bookstore.bean.Book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookManager {

    public List<Book> searchBook(String search) {

        List<Book> listOfBooks = new ArrayList<Book>();

        try(
                Connection conn = DBManager.getConnectionToDatabase();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from bookstore.book where name like \'"+ search +"\'")
                ){
            while (rs.next()) {
                String name = rs.getString("name");
                String synopsis = rs.getString("synopsis");
                String description = rs.getString("description");
                String image = rs.getString("image");

                Book book = new Book(name, synopsis, description, image);
                listOfBooks.add(book);
            }
            return listOfBooks;

        } catch (SQLException e) {
            System.out.println("error sql");
            e.printStackTrace();
        }

        return null;
    }
}
