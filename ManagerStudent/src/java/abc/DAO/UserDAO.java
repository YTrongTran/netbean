/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc.DAO;

import abc.Controlller.DatabaseUtils;
import abc.Controlller.DateHelpes;
import abc.Models.Users;
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
public class UserDAO {
    public int addU(Users hv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "insert into User (username,password,fullname,age,birthday,gender) \n" +
"values(?,?,?,?,?,?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, hv.getUsername());
            sttm.setString(2, hv.getPassword());
            sttm.setString(3, hv.getFullname());
            sttm.setInt(4, hv.getAge());
            sttm.setString(5, DateHelpes.toString(hv.getBirthday()));
            sttm.setBoolean(6, hv.isGender());

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

    public int update(Users hv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "update User set password=?,fullname=?,age=?,birthday=?,gender=? where username=?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(6, hv.getUsername());
            sttm.setString(1, hv.getPassword());
            sttm.setString(2, hv.getFullname());
            sttm.setInt(3, hv.getAge());
            sttm.setString(4, DateHelpes.toString(hv.getBirthday()));
            sttm.setBoolean(5, hv.isGender());
            if (sttm.executeUpdate() > 0) {
                System.out.println("up  thanh cong");
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

    public int dele(Users hv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "delete from User where username=?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, hv.getUsername());

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

    public List<Users> getUAll() {
        List<Users> lshv = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from User";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                Users hv = new Users();
                hv.setUsername(rs.getString(1));
                hv.setPassword(rs.getString(2));
                hv.setFullname(rs.getString(3));
                hv.setAge(rs.getInt(4));
                hv.setBirthday(DateHelpes.todate(rs.getString(5)));
                hv.setGender(rs.getBoolean(6));

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

    public Users findByID(String username) {
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
                Users hv = new Users();
                hv.setUsername(rs.getString(1));
                hv.setPassword(rs.getString(2));
                hv.setFullname(rs.getString(3));
                hv.setAge(rs.getInt(4));
                hv.setBirthday(DateHelpes.todate(rs.getString(5)));
                hv.setGender(rs.getBoolean(6));

               return hv;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }
    public static void main(String[] args) {
        UserDAO dao = new UserDAO();
        Users u = new Users("abcd", "1243", "nguyen van a",10, DateHelpes.now(), true);
        dao.addU(u);
        //System.out.println("da"+dao.getUAll());
    }
}
