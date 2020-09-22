/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DateHelps.DatabaseUtils;
import DateHelps.DateHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tran Y
 */
public class User1DAO {

//    SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");

    public int add(User u) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //? la tham so
            // '?' la ki tu
            String sSQL = "INSERT INTO Users (username, password, fullname, age, birthday, gender) VALUES (?, ?, ?, ?, ?, ?);";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, u.getUsername());
            sttm.setString(2, u.getPassword());
            sttm.setString(3, u.getFullname());
            sttm.setInt(4, u.getAge());
            sttm.setString(5, u.getBirthday());
            sttm.setBoolean(6, u.isGender());

            if (sttm.executeUpdate() > 0) {
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
            return -1;

        }
    }

    public int update(User u) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //? la tham so
            // '?' la ki tu
            String sSQL = "update User set username=?, password=?, fullname=?, age=?, birthday=?, gender=? where username=?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(6, u.getUsername());
            sttm.setString(1, u.getPassword());
            sttm.setString(2, u.getFullname());
            sttm.setInt(3, u.getAge());
            sttm.setString(5, u.getBirthday());
            sttm.setBoolean(5, u.isGender());

            if (sttm.executeUpdate() > 0) {
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
            return -1;

        }
    }
    public int delete(User u) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //? la tham so
            // '?' la ki tu
            String sSQL = "delete user where username=?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, u.getUsername());
            

            if (sttm.executeUpdate() > 0) {
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
            return -1;

        }
    }
    public User getusernameByID(String username) {
        User nv = new User();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from NhanVien  where MaNV=?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, username);
            rs = sttm.executeQuery();
            while (rs.next()) {
                nv.setUsername(rs.getString(1));
                nv.setPassword(rs.getString(2));
                nv.setFullname(rs.getString(3));
                nv.setAge(Integer.parseInt(rs.getString(4)));
                nv.setBirthday(DateHelper.todate(rs.getString(5)));
                nv.setGender(rs.getBoolean(6));
                return nv;

            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }
public List<User> getAll() {
        List<User> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT Username, Password, FullName, age, Birthday, Gender\n" +
"FROM dbo.[User]";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                User nv= new User();
                nv.setUsername(rs.getString(1));
                nv.setPassword(rs.getString(2));
                nv.setFullname(rs.getString(3));
                nv.setAge(Integer.parseInt(rs.getString(4)));
                nv.setBirthday(DateHelper.todate(rs.getString(5)));
                nv.setGender(rs.getBoolean(6));
                ls.add(nv);
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
        return ls;
    }
}
