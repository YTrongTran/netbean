/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author haubeo
 */
public class DatabaseUtils {
     public static String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
			"databaseName=Student;user=sa;password=1234";
    public static Connection getDBConnect() throws SQLException{
        try {
            Connection con = null;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);
            return con;
        } 
        catch (ClassNotFoundException ex) {
            System.out.println("Error:"+ex.toString());
             System.out.println("driver o dau");
        }catch(SQLException ex){
                        System.out.println("Error:"+ex.toString());

        }
         return null;               
    }
}
