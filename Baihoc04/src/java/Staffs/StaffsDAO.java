/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staffs;

import DeParts.Departs;
import commons.DataHelps;
import commons.DatabaseUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tran Y
 */
public class StaffsDAO {

    public List<Staffs> getAll() {
        List<Staffs> st = new ArrayList<>();
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "select st.id,st.name,st.email,st.gender,st.birthday,st.photo,"
                    + "st.phone,st.salary,st.depart_it from Staffs st INNER JOIN Departs dp ON st.depart_it=dp.id";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {
                Staffs d = new Staffs();
                d.setId(rs.getString(1));
                d.setName(rs.getString(2));
                d.setEmail(rs.getString(3));
                d.setBirthday(DataHelps.todate(rs.getString(4)));
                d.setPhoto(rs.getString(5));
                d.setPhone(rs.getString(6));
                d.setSalary(Float.parseFloat(rs.getString(7)));
                d.setDepartsid(new Departs(rs.getString(8)));
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
        return st;
    }

    public int add(Staffs st) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO dbo.Staffs (id, \"name\", email, gender, birthday, photo, phone, salary, depart_it) \n"
                    + "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, st.getId());
            sttm.setString(2, st.getName());
            sttm.setString(3, st.getEmail());
            sttm.setBoolean(4, st.isGender());
            sttm.setString(5, DataHelps.toString(st.getBirthday()));
            sttm.setString(6, st.getPhoto());
            sttm.setString(7, st.getPhone());
            sttm.setString(8, Float.toString(st.getSalary()));
            sttm.setString(9, st.getDepartsid().getId());

            if (sttm.executeUpdate() > 0) {
                System.out.println("add thanh cong");
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

    public int save(Staffs st) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE dbo.Staffs SET \"id\" = ?, \"name\" = ?,"
                    + " \"email\" = ?, \"gender\" = ?,"
                    + " \"birthday\" =?, \"photo\" = ?, \"phone\" = ?,"
                    + " \"salary\" = ?, \"depart_it\" = ? WHERE id = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, st.getId());
            sttm.setString(2, st.getName());
            sttm.setString(3, st.getEmail());
            sttm.setBoolean(4, st.isGender());
            sttm.setString(5, DataHelps.toString(st.getBirthday()));
            sttm.setString(6, st.getPhoto());
            sttm.setString(7, st.getPhone());
            sttm.setString(8, Float.toString(st.getSalary()));
            sttm.setString(9, st.getDepartsid().getId());
            sttm.setString(10, st.getId());
            if (sttm.executeUpdate() > 0) {
                System.out.println("uodate thanh cong");
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

    public int delete(Staffs st) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbo.Staffs WHERE id = ?;\n"
                    + ";";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, st.getId());
            if (sttm.executeUpdate() > 0) {
                System.out.println("add thanh cong");
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

    public Staffs findStaffs(String id) {
        Staffs kh = new Staffs();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from Staffs where id= ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            rs = sttm.executeQuery();
            while (rs.next()) {
                kh.setId(rs.getString(1));
                kh.setName(rs.getString(2));
                kh.setEmail(rs.getString(3));
                kh.setBirthday(DataHelps.todate(rs.getString(4)));
                kh.setPhoto(rs.getString(5));
                kh.setPhone(rs.getString(6));
                kh.setSalary(Float.parseFloat(rs.getString(7)));
                kh.setDepartsid(new Departs(rs.getString(8)));
                return kh;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }

    public static void main(String[] args) {
        StaffsDAO dao = new StaffsDAO();
        Staffs st = new Staffs("2", "hau", "hau@gmail.com", true, DataHelps.now(), "ad", "12441232", Float.parseFloat("1222"), new Departs("1"));
        //dao.save(st);
        System.out.println(".."+dao.getAll());
    }
}
