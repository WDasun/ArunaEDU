/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anuraedu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class DB {
     private static Connection connection;
    
    private static void init_DB()throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aruna_edu", "root", "root");  
    }
    
    public static void push(String sql)throws Exception{
        if(connection == null){
            init_DB();
        }
        connection.createStatement().executeUpdate(sql);
    }
    
    public static ResultSet search(String sql)throws Exception{
        if(connection == null){
            init_DB();
        }
        return connection.createStatement().executeQuery(sql);
    }
    
    public static Connection getDBConnection()throws Exception{
        if(connection == null){
            init_DB();
        }
        return connection;
    }
    
    public static void main(String[] args) {
        try {
            getDBConnection();
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
