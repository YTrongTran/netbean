/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import commons.DatabaseUtils;
import commons.DateHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAptop
 */
public class User1DAO {

    private User user;

    public int insert(User u) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "insert into dbo.Users (Username, password, fullname, age, birthday, gender)"
                    + "values (?,?,?,?,?,?)";
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
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return -1;
    }

    public int update(User u) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE dbo.Users SET  Password = ?,Fullname= ?, Age = ?, Birthday = ?, Gender = ? WHERE Username = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(6, u.getUsername());
            sttm.setString(1, u.getPassword());
            sttm.setString(2, u.getFullname());
            sttm.setInt(3, u.getAge());
            sttm.setString(4, u.getBirthday());
            sttm.setBoolean(5, u.isGender());
            if (sttm.executeUpdate() > 0) {
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return -1;
    }

    public int delete(String username) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbo.\"Users\" WHERE Username = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, username);
            if (sttm.executeUpdate() > 0) {
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return -1;
    }

    public User finByID(String username) {
        Connection conn = null;
        PreparedStatement sttm = null;
        User user = null;
        try {
            String sSQL = "select Username,Password,Fullname,Age,Birthday,Gender from Users Where Username = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, username);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {                
                user = new User();
                user.setUsername(rs.getString(1));
                user.setPassword(rs.getString(2));
                user.setFullname(rs.getString(3));
                user.setAge(rs.getInt(4));
                user.setBirthday(DateHelper.todate(rs.getString(5)));
                user.setGender(rs.getBoolean(6));
                return user;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return user;
    }
     public List<User> getALL() {
        Connection conn = null;
        PreparedStatement sttm = null;
       List<User> ls = new  ArrayList();
        try {
            String sSQL = "select * from dbo.Users";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {                
                user = new User();
                user.setUsername(rs.getString(1));
                user.setPassword(rs.getString(2));
                user.setFullname(rs.getString(3));
                user.setAge(rs.getInt(4));
                user.setBirthday(DateHelper.todate(rs.getString(5)));
                user.setGender(rs.getBoolean(6));
                ls.add(user);
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return ls;
    }
   
}
