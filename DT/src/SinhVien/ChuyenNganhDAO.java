/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

import Datautiles.DatabaseUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class ChuyenNganhDAO {
    public static List<ChuyenNganh>ls= new ArrayList<>();
    public int add(ChuyenNganh q) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO dbo.ChuyenNganh (maCN, tenCN) \n" +
"	VALUES (?, ?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, q.getMaCN());
            sttm.setString(2, q.getTenCN());
            if (sttm.executeUpdate() > 0) {
                System.out.println("add thành công");
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
    public List<ChuyenNganh> getAllChuyenNganh() {
        List<ChuyenNganh> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT     maCN, tenCN\n" +
"FROM dbo.ChuyenNganh";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                ChuyenNganh u = new ChuyenNganh();
                u.setMaCN(Integer.parseInt(rs.getString(1)));
                u.setTenCN(rs.getString(2));
                ls.add(u);
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                rs.close();
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return ls;
    }
        public int findnhan(int ma) {
        int p = -1;
        for (int i = 0; i < getAllChuyenNganh().size(); i++) {
            if (ma == getAllChuyenNganh().get(i).getMaCN()) {
                p = i;
            }
        }
        return p;
    }
    public static void main(String[] args) {
        ChuyenNganhDAO dao = new ChuyenNganhDAO();
        System.out.println("asd"+dao.getAllChuyenNganh());
    }
}
