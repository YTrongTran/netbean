/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Tran Y
 */
public class DatabaseUtil {
     public static String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
			"databaseName=QuanLySach;user=sa;password=1234";
    public static Connection getDBConnect() throws SQLException{
        try {
            Connection con = null;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);
            return con;
        } catch (ClassNotFoundException ex) {
            System.out.println("Where is Driver???");
        } catch (SQLException ex) {
            System.out.println("Error:"+ex.toString());
        }
        return null;
    }
}
