/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import View.DatabaseUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.User;

/**
 *
 * @author Tran Y
 */
public class UserDAO {

    public boolean add(User user) throws SQLException {
        String sql = "insert into [User] (username,fullname,password,age,gender)\n"
                + "values(?,?,?,?,?)";

        try (
                Connection con = DatabaseUtil.getDBConnect();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getFullname());
            ps.setString(3, user.getPassword());
            ps.setInt(4, user.getAge());
            ps.setBoolean(5, user.isGender());
            return ps.executeUpdate() > 0;
        }

    }

    public boolean save(User user) throws SQLException {
        String sql = "update [User] set fullname=?,password=?,age=?,gender=? where username=?";

        try (
                Connection con = DatabaseUtil.getDBConnect();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(5, user.getUsername());
            ps.setString(1, user.getFullname());
            ps.setString(2, user.getPassword());
            ps.setInt(3, user.getAge());
            ps.setBoolean(4, user.isGender());
            return ps.executeUpdate() > 0;
        }

    }

    public boolean delete(User user) throws SQLException {
        String sql = "delete [User] where username=?";

        try (
                Connection con = DatabaseUtil.getDBConnect();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, user.getUsername());

            return ps.executeUpdate() > 0;
        }

    }

    public List<User> getAll() throws SQLException {
        List<User> ls = new ArrayList<>();
        String sql = "select * from [User]";

        try (
                Connection con = DatabaseUtil.getDBConnect();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();) {

            while (rs.next()) {
                User u = new User();
                u.setUsername(rs.getString("username"));
                u.setFullname(rs.getString("fullname"));
                u.setPassword(rs.getString("password"));
                u.setAge(Integer.parseInt(rs.getString("age")));
                u.setGender(rs.getBoolean("gender"));

                ls.add(u);

            }
            return ls;
        }

    }

    public User findById(String username) throws SQLException {

        String sql = "select * from [User] where username=?";

        try (
                Connection con = DatabaseUtil.getDBConnect();
                PreparedStatement ps = con.prepareStatement(sql);) {
            
            ps.setString(1, username);

            try (
                    ResultSet rs = ps.executeQuery();) {

                if (rs.next()) {
                    User u = new User();
                    u.setUsername(rs.getString("username"));
                    u.setFullname(rs.getString("fullname"));
                    u.setPassword(rs.getString("password"));
                    u.setAge(Integer.parseInt(rs.getString("age")));
                    u.setGender(rs.getBoolean("gender"));

                    return u;

                }
            }

            return null;
        }

    }

    public static void main(String[] args) throws SQLException {
        UserDAO dao = new UserDAO();
        User u = new User("PS002", "acbdd", "Nguyen van C", 10, true);
        //   dao.add(u);
        System.out.println("suize" + dao.findById("PS001"));
    }
}
