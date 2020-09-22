/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import commons.DatabaseUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAptop
 */
public class MajorDAO {

    public List<Major> getALL() {
        Connection conn = null;
        PreparedStatement sttm = null;
        List<Major> ls = new ArrayList<>();
        try {
            String sSQL = "Select * from QLStudent.dbo.Major";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {
                Major m = new Major();
                m.setId(rs.getInt(1));
                m.setName(rs.getString(2));
                ls.add(m);
            }
        } catch (Exception e) {
            System.out.println("Erorr: " + e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
            return ls;
        }
    }
    public static void main(String[] args) {
         MajorDAO dao = new MajorDAO();
         System.out.println("size: "+dao.getALL());
    }
}
