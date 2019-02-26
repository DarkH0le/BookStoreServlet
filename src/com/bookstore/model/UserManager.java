package com.bookstore.model;

import com.bookstore.bean.Book;
import com.bookstore.bean.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserManager {

    public boolean validateUser(String email,String password) {

        System.out.println(email + password);

        try(
                Connection conn = DBManager.getConnectionToDatabase();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from bookstore.user where email = \'"+ email +"\' and password = \'" + password +"\'")
        ){
            if(rs.next()){
                System.out.println(rs.getString("email"));
                return true;
            }
        } catch (SQLException e) {
            System.out.println("error sql");
            e.printStackTrace();
        }

        return false;
    }
    public int registerUser(String email, String password) {

        System.out.println(email + password);

        try(
                Connection conn = DBManager.getConnectionToDatabase();
                Statement stmt = conn.createStatement();
        ){
            return stmt.executeUpdate("INSERT INTO bookstore.user (email,password) VALUES ('" + email + "','"+password+"')");

        } catch (SQLException e) {
            System.out.println("error sql");
            e.printStackTrace();
        }

        return -1;
    }
}
