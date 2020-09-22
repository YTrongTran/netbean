/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeParts;

import Model.User;
import commons.DataHelps;
import commons.DatabaseUtils;
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
public class DeParts1DAO {

    public int add(Departs hv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO dbo.Departs (id, name) VALUES (?,?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, hv.getId());
            sttm.setString(2, hv.getName());

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

    public int update(Departs hv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE dbo.Departs SET \"name\" = ? WHERE id = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(2, hv.getId());
            sttm.setString(1, hv.getName());

            if (sttm.executeUpdate() > 0) {
                System.out.println("update  thanh cong");
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

    public int delete1(Departs hv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbo.Departs WHERE id = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, hv.getId());

            if (sttm.executeUpdate() > 0) {
                System.out.println("xoa  thanh cong");
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

    public List<Departs> getAll() {
        List<Departs> lshv = new ArrayList<>();
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "select * from Departs";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {
                Departs d = new Departs();
               d.setId(rs.getString(1));
               d.setName(rs.getString(2));

                lshv.add(d);
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
        return lshv;
    }

    public Departs findByID(String id) {
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select id,name from Departs where id = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            rs = sttm.executeQuery();
            while (rs.next()) {
                Departs hv = new Departs();
                hv.setId(rs.getString(1));
                hv.setName(rs.getString(2));

                return hv;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }

    public static void main(String[] args) {
        DeParts1DAO dao = new DeParts1DAO();
     //   Departs ms = new Departs("PS0022", "nameee");
        // dao.update(ms);
        dao.findByID("=>" + dao.getAll());
    

     
    }
}
