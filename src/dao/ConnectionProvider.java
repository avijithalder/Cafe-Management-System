/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;

//import java.sql.SQLException;

/**
 *
 * @author Avijit Halder
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3303/cms?useSSl=false","root","123456");
            return con;
        }
    
        catch(Exception e){
    
            return null;
        }
    }
}

