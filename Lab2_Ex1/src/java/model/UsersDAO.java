/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import view.DatabaseUtils;

/**
 *
 * @author Tran Y
 */
public class UsersDAO {

    public boolean add(Users user) throws SQLException {
        String sql = "insert into Users (username,password,name,gender)\n"
                + "values (?,?,?,?)";
        try (
                Connection con = DatabaseUtils.getDBConnect();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getName());
            ps.setBoolean(4, user.isGender());

            return ps.executeUpdate() > 0;
        }

    }

    public boolean save(Users user) throws SQLException {
        String sql = "update  Users set password=?, name=?, gender=? where username=?";
        try (
                Connection con = DatabaseUtils.getDBConnect();
                PreparedStatement ps = con.prepareStatement(sql);) 
        {
            ps.setString(4, user.getUsername());
            ps.setString(1, user.getPassword());
            ps.setString(2, user.getName());
            ps.setBoolean(3, user.isGender());

            return ps.executeUpdate() > 0;
        }

    }

    public boolean delete(Users user) throws SQLException {
        String sql = "delete from Users where username=?";
        try (
                Connection con = DatabaseUtils.getDBConnect();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, user.getUsername());

            return ps.executeUpdate() > 0;
        }

    }

    public List<Users> getAll() throws SQLException {
        List<Users> ls = new ArrayList<>();
        String sql = "select * from Users";
        try (
                Connection con = DatabaseUtils.getDBConnect();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                Users u = new Users();
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setName(rs.getString("name"));
                u.setGender(rs.getBoolean("gender"));
                ls.add(u);
            }
            return ls;
        }

    }

    public Users findById(String username) throws SQLException {

        String sql = "select * from Users where username = ?";
        try (
                Connection con = DatabaseUtils.getDBConnect();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, username);
            try (
                    ResultSet rs = ps.executeQuery();) {
                if (rs.next()) {
                    Users u = new Users();
                    u.setUsername(rs.getString("username"));
                    u.setPassword(rs.getString("password"));
                    u.setName(rs.getString("name"));
                    u.setGender(rs.getBoolean("gender"));
                    return u;
                }

            }
            return null;

    }
        
}
    public static void main(String[] args) throws SQLException {
        UsersDAO dao = new UsersDAO();
     //   System.out.println("size" +dao.findById("PS0012"));
 //   dao.getAll();
  //System.out.println("size" +dao.getAll());
    }
}