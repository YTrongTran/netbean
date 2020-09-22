/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import common.DatabaseUtils;
import common.Datehelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//depart_it sai loi chinh ta
/**
 *
 * @author admin
 */
public class StaffDAO {
    public List<Staff> getall(){
        List<Staff> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        try {
            String sSQl="select * from Staffs inner join Departs on Staffs.depart_it = Departs.id";
            conn = DatabaseUtils.getDBCOnnect();
            sttm = conn.createStatement();
            ResultSet rs = sttm.executeQuery(sSQl);
            while (rs.next()) {                
                Staff st = new Staff();
                st.setId(rs.getString(1));
                st.setName(rs.getString(2));
                st.setEmail(rs.getString(3));
                st.setGender(rs.getBoolean(4));
                st.setBirthday(Datehelper.todate(rs.getString(5)));
                st.setPhoto(rs.getString(6));
                st.setPhone(rs.getString(7));
                st.setSalary(rs.getDouble(8));
                st.setDepart(new Depart(rs.getString(9), rs.getString(11)));
                ls.add(st);
            }
        } catch (Exception e) {
            System.out.println("Error:"+e.toString());
        }
        finally{
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return ls;
    }
    public Staff findByID(String id){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "select * from Staffs where id = ?";
            conn = DatabaseUtils.getDBCOnnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {                
                Staff st = new Staff();
                st.setId(rs.getString(1));
                st.setName(rs.getString(2));
                st.setEmail(rs.getString(3));
                st.setGender(rs.getBoolean(4));
                st.setBirthday(Datehelper.todate(rs.getString(5)));
                st.setPhoto(rs.getString(6));
                st.setPhone(rs.getString(7));
                st.setSalary(rs.getDouble(8));
                st.setDepart(new Depart(rs.getString(9)));
                return st;
            }
        } catch (Exception e) {
            System.out.println("Error:"+e.toString());
        }finally{
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return null;
    }
    public int insert(Staff u){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //depart_id = depart_it=>ok dạ
            String sSQL = "insert into Staffs (id, name, email, gender,birthday,photo,phone,salary,depart_it) values (?,?,?,?,?,?,?,?,?);";
            conn = DatabaseUtils.getDBCOnnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, u.getId());
            sttm.setString(2, u.getName());
            sttm.setString(3, u.getEmail());
            sttm.setBoolean(4, u.isGender());
            sttm.setString(5, Datehelper.toString(u.getBirthday()));
            sttm.setString(6, u.getPhoto());
            sttm.setString(7, u.getPhone());
            sttm.setDouble(8, u.getSalary());
            sttm.setString(9, u.getDepart().getId());
            if (sttm.executeUpdate() > 0) {
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
        finally{
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
                
            }
        }
        return -1;
    }
    public int update(Staff u){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "update Staffs set name=?,email=?,gender=?,birthday=?,photo=?,phone=?,salary=?,depart_it=? where id =?";
            conn = DatabaseUtils.getDBCOnnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(9, u.getId());
            sttm.setString(1, u.getName());
            sttm.setString(2, u.getEmail());
            sttm.setBoolean(3, u.isGender());
            sttm.setString(4, Datehelper.toString(u.getBirthday()));
            sttm.setString(5, u.getPhoto());
            sttm.setString(6, u.getPhone());
            sttm.setDouble(7, u.getSalary());
            sttm.setString(8, u.getDepart().getId());
            if (sttm.executeUpdate() > 0) {
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
        finally{
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
                
            }
        }
        return -1;
    }
    public int delete(String id){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "delete Staffs where id=?";
            conn = DatabaseUtils.getDBCOnnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            if (sttm.executeUpdate() > 0) {
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        }
        finally{
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
                
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        StaffDAO dao = new StaffDAO();
        System.out.println("=>"+dao.getall().size());
    }
}
