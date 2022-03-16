/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author oouak
 */
public class sqlConnection {
  
    Connection conn = null ;
    static String dbURL = "jdbc:mysql://localhost:3306/testdb" ;
    static String username="root";
    static String password ="";
    public static Connection dbconnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL,username,password);
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e );
            return null ;
        }
    }
 
                  
}
