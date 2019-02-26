package com.bookstore.model;

import com.bookstore.bean.Book;
import com.bookstore.bean.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserManager {

    public User validateUser(String email,String password) {

        System.out.println(email + password);

        try(
                Connection conn = DBManager.getConnectionToDatabase();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from bookstore.user where email = \'"+ email +"\' and password = \'" + password +"\'")
        ){
            if(rs.next()){
                System.out.println(rs.getString("email"));
                return new User(rs.getString("email"),rs.getString("password"),rs.getString("id"));
            }
        } catch (SQLException e) {
            System.out.println("error sql");
            e.printStackTrace();
        }

        return null;
    }
    public User registerUser(String email, String password) {

        System.out.println(email + password);

        try(
                Connection conn = DBManager.getConnectionToDatabase();
                Statement stmt = conn.createStatement();
        ){
            int result = stmt.executeUpdate("INSERT INTO bookstore.user (email,password) VALUES ('" + email + "','"+password+"')");
            ResultSet rs = stmt.executeQuery("select * from bookstore.user where email = \'"+ email +"\' and password = \'" + password +"\'");

            if(rs.next()){
                return new User(rs.getString("email"),rs.getString("password"),rs.getString("id"));
            }
        } catch (SQLException e) {
            System.out.println("error sql");
            e.printStackTrace();
        }

        return null;
    }
}
