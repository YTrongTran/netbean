/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author trany
 */
public class User {

    public int add() throws SQLException {
        Connection conn = null;
        PreparedStatement sttm = null;

        try {
            String sQLSV = "insert into Users(username,password,role) values('admin4','66666',1)";
            conn = DatabaseUtils.getDBconnect();
            sttm = conn.prepareStatement(sQLSV);
            if (sttm.executeUpdate() > 0) {
                System.out.println("them thanh cong");
                return 1;
            } else {
                System.out.println("them that bai");
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            sttm.close();
            conn.close();

        }

        return -1;
    }

    public int Edit() throws SQLException {
        Connection conn = null;
        PreparedStatement sttm = null;

        try {
            String sQLSV = "update Users set username='atuan', password='5566', role=0\n"
                    + "where username ='admin2'";
            conn = DatabaseUtils.getDBconnect();
            sttm = conn.prepareStatement(sQLSV);
            if (sttm.executeUpdate() > 0) {
                System.out.println("them thanh cong");
                return 1;
            } else {
                System.out.println("them that bai");
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            sttm.close();
            conn.close();

        }

        return -1;
    }
    public int dell() throws SQLException {
        Connection conn = null;
        PreparedStatement sttm = null;

        try {
            String sQLSV = "delete from  Users where username = 'admin3'";
            conn = DatabaseUtils.getDBconnect();
            sttm = conn.prepareStatement(sQLSV);
            if (sttm.executeUpdate() > 0) {
                System.out.println("them thanh cong");
                return 1;
            } else {
                System.out.println("them that bai");
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            sttm.close();
            conn.close();

        }

        return -1;
    }
    public void getALLUser(){
    Connection conn = null;
        Statement sttm = null;
        try {
            String sSQLV="select * from Users";
            conn=DatabaseUtils.getDBconnect();
            sttm=conn.createStatement();
            ResultSet rss = sttm.executeQuery(sSQLV);
            while (rss.next()) {                
                System.out.println("username: " + rss.getString(1));
                System.out.println("password: " + rss.getString(2));
                System.out.println("role: " + rss.getString(3));
            }
        } catch (Exception e) {
        }
    }
}
