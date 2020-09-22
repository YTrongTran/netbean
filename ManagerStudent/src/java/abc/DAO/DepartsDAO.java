/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc.DAO;

import abc.Controlller.DatabaseUtils;
import abc.Models.Departs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tran Y
 */
public class DepartsDAO {

    public boolean inser(Departs de) throws SQLException {
        String sql = "insert into Departs (id,name)\n"
                + "values(?,?)";
        try (
                Connection con = DatabaseUtils.getDBConnect();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, de.getId());
            ps.setString(2, de.getName());
            return ps.executeUpdate() > 0;
        }

    }

    public boolean update(Departs de) throws SQLException {
        String sql = "update Departs set name=? where id=?";
        try (
                Connection con = DatabaseUtils.getDBConnect();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(2, de.getId());
            ps.setString(1, de.getName());
            return ps.executeUpdate() > 0;
        }

    }

    public boolean delete(Departs de) throws SQLException {
        String sql = "delete from Departs where id=?";
        try (
                Connection con = DatabaseUtils.getDBConnect();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, de.getId());

            return ps.executeUpdate() > 0;
        }

    }

    public List<Departs> getAll() throws SQLException {
        List<Departs> ls = new ArrayList<>();
        String sql = "select * from Departs";
        try (
                Connection con = DatabaseUtils.getDBConnect();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                Departs de = new Departs();
                de.setId(rs.getString("id"));
                de.setName(rs.getString("name"));
                ls.add(de);
            }
            return ls;

        }

    }

    public Departs finByID(String id) throws SQLException {
        
        String sql = "select * from Departs where id=?";
        try (
                Connection con = DatabaseUtils.getDBConnect();
                PreparedStatement ps = con.prepareStatement(sql);
                ) {
           ps.setString(1, id);
            try(ResultSet rs = ps.executeQuery();){
            if (rs.next()) {
                Departs de = new Departs();
                de.setId(rs.getString("id"));
                de.setName(rs.getString("name"));

                return de;
            }
             
            }
            return null;
           

        }

    }
    public static void main(String[] args) throws SQLException {
        DepartsDAO dao = new DepartsDAO();
        Departs de = new Departs("HTML0025", "Y");
//        dao.inser(de);
//System.out.println("dad"+dao.getAll());
dao.update(de);
    }
}
