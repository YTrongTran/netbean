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

/**
 *
 * @author admin
 */
public class DepartDAO {
    public int insert(Depart u){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "insert into Departs (id, name) values (?,?);";
            conn = DatabaseUtils.getDBCOnnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, u.getId());
            sttm.setString(2, u.getName());
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
    public int update(Depart u){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "update Departs set name = ? where id =?";
            conn = DatabaseUtils.getDBCOnnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(2, u.getId());
            sttm.setString(1, u.getName());
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
            String sSQL = "delete Departs where id =?";
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
    public Depart findByID(String id){
        Connection conn = null;
        PreparedStatement sttm = null;
        Depart depart = null;
        try {
            String sSQL = "select * from Departs where id = ?";
            conn = DatabaseUtils.getDBCOnnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {                
                depart = new Depart();
                depart.setId(rs.getString(1));
                depart.setName(rs.getString(2));
                return depart;
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
        return depart;
    }
    public List<Depart> getall(){
        List<Depart> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        try {
            String sSQl="select * from Departs";
            conn = DatabaseUtils.getDBCOnnect();
            sttm = conn.createStatement();
            ResultSet rs = sttm.executeQuery(sSQl);
            while (rs.next()) {                
                Depart depart = new Depart();
                depart.setId(rs.getString(1));
                depart.setName(rs.getString(2));
                ls.add(depart);
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
}
