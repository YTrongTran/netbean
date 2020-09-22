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
public class StaffsDAO {

    public int insert(Staff st) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO dbo.Staffs (id, birthday, email, gender,name, notes, phone, photo, salary, depart_id) VALUES (?,?,?,?,?,?,?,?,?,?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, st.getId());
            sttm.setString(2, DateHelper.toString(st.getBirthday()));
            sttm.setBoolean(3, st.isGender());
            sttm.setString(4, st.getEmail());
            sttm.setString(5, st.getName());
            sttm.setString(6, st.getNote());
            sttm.setString(7, st.getPhone());
            sttm.setString(8, st.getPhoto());
            sttm.setDouble(9, st.getSalary());
            sttm.setString(10, st.getDepart().getId());
            if (sttm.executeUpdate() > 0) {
                System.out.println("add thanh cong");
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

    public int update(Staff st) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE dbo.Staffs SET birthday = ?, email = ?, gender = ?, name = ?,notes =?, phone= ?, photo =?,salary =?,depart_id = ? WHERE id = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(10, st.getId());
            sttm.setString(1, DateHelper.toString(st.getBirthday()));
            sttm.setBoolean(2, st.isGender());
            sttm.setString(3, st.getName());
            sttm.setString(4, st.getEmail());
            sttm.setString(5, st.getNote());
            sttm.setString(6, st.getPhone());
            sttm.setString(7, st.getPhoto());
           sttm.setDouble(8, st.getSalary());
            sttm.setString(9, st.getDepart().getId());
            if (sttm.executeUpdate() > 0) {
                System.out.println("add thanh cong");
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

    public int delete(String id) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbo.Staffs WHERE id = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            if (sttm.executeUpdate() > 0) {
                System.out.println("del thanh cong");
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

    public Staff getByID(String id) {
        Connection conn = null;
        PreparedStatement sttm = null;
        Staff st = null;
        try {
            String sSQL = "Select * from  dbo.Staffs where id = ? ";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {
                st = new Staff();
                st.setId(rs.getString(1));
                st.setBirthday(rs.getDate(2));
                st.setEmail(rs.getString(3));
                st.setGender(rs.getBoolean(4));
                st.setName(rs.getString(5));
                st.setNote(rs.getString(6));
                st.setPhone(rs.getString(7));
                st.setPhoto(rs.getString(8));
                st.setSalary(rs.getDouble(9));
                st.setDepart(new Departs(rs.getString(10)));
                return st;

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
        return null;
    }
    public List<Staff> getAll() {
        Connection conn = null;
        PreparedStatement sttm = null;
        List<Staff> ls = new ArrayList<>();
        try {
            String sSQL = "Select dbo.Staffs.id, dbo.Staffs.birthday, dbo.Staffs.email, dbo.Staffs.gender, dbo.Staffs.name, dbo.Staffs.notes, dbo.Staffs.phone, dbo.Staffs.photo,dbo.Staffs.salary,dbo.departs.id,dbo.departs.name from dbo.Staffs,dbo.departs";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {
                Staff  st = new Staff();
                st.setId(rs.getString(1));
                st.setBirthday(rs.getDate(2));
                st.setEmail(rs.getString(3));
                st.setGender(rs.getBoolean(4));
                st.setName(rs.getString(5));
                st.setNote(rs.getString(6));
                st.setPhone(rs.getString(7));
                st.setPhoto(rs.getString(8));
                st.setSalary(rs.getDouble(9));
                st.setDepart(new Departs(rs.getString(10),rs.getString(11)));
                ls.add(st);
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
    public static void main(String[] args) {
        StaffsDAO dao = new StaffsDAO();
        System.out.println("size: "+dao.getAll());
    }

    public Staff findByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
