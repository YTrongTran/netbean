/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Database.DatabaseUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trany
 */
public class UserDAO {

    List<User> ls = new ArrayList<User>();

    public UserDAO() {

    }

    public boolean checkLogin(String username, String password) {
        boolean check = false;
        User user = getNhanVienByID(username);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                return true;
            }
        }
        return check;
        //cach 2
//        for (int i = 0; i < ls.size(); i++) {
//            User p = ls.get(i);
//            if (p.getUsername().equals(username)&&p.getPassword().equals(password)) {
//                check =true;
//                break;
//            }
//        }
//        return check;
    }

    public User getNhanVienByID(String username) {
        User nv = new User();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from users where username = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, username);
            rs = sttm.executeQuery();
            while (rs.next()) {
                nv.setUsername(rs.getString(1));
                nv.setPassword(rs.getString(2));
                nv.setRole(rs.getBoolean(3));

                return nv;

            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }

    public int add(User u) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //? la tham so
            // '?' la ki tu
            String sSQL = "INSERT INTO Users (username, password,role) VALUES (?, ?, ?);";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, u.getUsername());
            sttm.setString(2, u.getPassword());
            sttm.setBoolean(3, u.isRole());

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

    public int edit(User u) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //? la tham so
            // '?' la ki tu
            String sSQL = "UPDATE dbo.Users SET \"username\" = ?, \"password\" = ?, \"role\" = ? WHERE username = ? \n";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, u.getUsername());
            sttm.setString(2, u.getPassword());
            sttm.setBoolean(3, u.isRole());
            sttm.setString(4, u.getUsername());

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

    public int del(User u) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //? la tham so
            // '?' la ki tu
            String sSQL = "DELETE FROM dbo.Users WHERE username = ? \n";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, u.getUsername());
//            sttm.setString(2, u.getPassword());
//            sttm.setBoolean(3, u.isRole());
//            sttm.setString(4, u.getUsername());

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

    public List<User> getAllNhanVien() {
        List<User> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select username,password,role from Users order by username desc";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                User u = new User();
                u.setUsername(rs.getString(1));
                u.setPassword(rs.getString(2));
                u.setRole(rs.getBoolean(3));
                ls.add(u);
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
    

    public static void main(String[] args) {
        User u = new User("admin4", "123", true);
        UserDAO dao = new UserDAO();
        dao.add(u);
        dao.edit(u);
        dao.del(u);
System.out.println("size:" +dao.getAllNhanVien());

//        System.out.println("=>"+dao.getNhanVienByID("admin3"));
    }
//    public static void main(String[] args) {
//        UserDAO a =new UserDAO();
//        a.checkLogin("admin", "12340");
//        System.out.print(a.checkLogin("admin", "12340"));
//    }

   
}
