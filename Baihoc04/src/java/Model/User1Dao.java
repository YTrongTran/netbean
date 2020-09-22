/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import commons.DataHelps;
import commons.DatabaseUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tran Y
 */
public class User1Dao {

    public int add(User hv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO dbo.\"User\" (Username, Password, FullName, age, Birthday, Gender) \n"
                    + "	VALUES (?,?,?,?,?,?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, hv.getUserName());
            sttm.setString(2, hv.getPassWord());
            sttm.setString(3, hv.getFullName());
            sttm.setInt(4, hv.getAge());
            sttm.setString(5, hv.getBirthDay());
            sttm.setBoolean(6, hv.isGenDer());

            if (sttm.executeUpdate() > 0) {
                System.out.println("them  thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();

            } catch (Exception e) {

            }
        }
        return -1;
    }

    public int update(User hv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE dbo.\"User\" SET \"Username\" = 'bbcde',"
                    + " \"Password\" = ?, \"FullName\" = ?,"
                    + " \"age\" = ?, \"Birthday\" = ?,"
                    + " \"Gender\" = ? WHERE Username = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(6, hv.getUserName());
            sttm.setString(1, hv.getPassWord());
            sttm.setString(2, hv.getFullName());
            sttm.setInt(3, hv.getAge());
            sttm.setString(4, hv.getBirthDay());
            sttm.setBoolean(5, hv.isGenDer());

            if (sttm.executeUpdate() > 0) {
                System.out.println("them  thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();

            } catch (Exception e) {

            }
        }
        return -1;
    }

    public int delete1(User hv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbo.\"User\" WHERE Username = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, hv.getUserName());

            if (sttm.executeUpdate() > 0) {
                System.out.println("them  thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();

            } catch (Exception e) {

            }
        }
        return -1;
    }

    public List<User> getAll() {
        List<User> lshv = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT  Username, Password, FullName, age, Birthday, Gender\n"
                    + "FROM dbo.[User]";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                User hv = new User();
                hv.setUserName(rs.getString(1));
                hv.setPassWord(rs.getString(2));
                hv.setFullName(rs.getString(3));
                hv.setAge(rs.getInt(4));
                hv.setBirthDay(DataHelps.todate(rs.getString(5)));
                hv.setGenDer(rs.getBoolean(6));

                lshv.add(hv);
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                rs.close();
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return lshv;
    }

    public User findByID(String username) {
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from dbo.[User] where Username=?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, username);
            rs = sttm.executeQuery();
            while (rs.next()) {
                User hv = new User();
                hv.setUserName(rs.getString(1));
                hv.setPassWord(rs.getString(2));
                hv.setFullName(rs.getString(3));
                hv.setAge(rs.getInt(4));
                hv.setBirthDay(DataHelps.todate(rs.getString(5)));
                hv.setGenDer(rs.getBoolean(6));

               return hv;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }

    
}
