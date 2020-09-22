/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tran Y
 */
public class MajorDAO {

    public List<Major> getAll() {
        List<Major> lshv = new ArrayList<>();
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "select * from Major1";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {
                Major d = new Major();
                d.setId(Integer.parseInt(rs.getString(1)));
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

    public int add(Major st) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO dbo.Major1 (id, \"name\") \n"
                    + "	VALUES (?, ?)\n"
                    + "";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, st.getId());
            sttm.setString(2, st.getName());

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

    public int save(Major st) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE dbo.Major1 SET \"id\" = ?, \"name\" = ? WHERE id = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, st.getId());
            sttm.setString(2, st.getName());
            sttm.setInt(3, st.getId());
            if (sttm.executeUpdate() > 0) {
                System.out.println("save thanh cong");
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

    public int delete(Major st) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbo.Major1 WHERE id = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, st.getId());
            if (sttm.executeUpdate() > 0) {
                System.out.println("dell thanh cong");
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

    public Student getMajorBYID(int id) {
        Student kh = new Student();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from Major1 where id= ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, id);
            rs = sttm.executeQuery();
            while (rs.next()) {
                kh.setId((rs.getString(1)));
                kh.setName(rs.getString(2));
               

                return kh;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }
    public static void main(String[] args) {
        MajorDAO dao = new MajorDAO();
      Major st = new Major(5, "HTML1");
    // dao.add(st);
     // dao.save(st);
        System.out.println("==>"+dao.getMajorBYID(2));
    }
}
