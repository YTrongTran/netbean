/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

import Datautiles.DatabaseUtils;
import Datautiles.DateHelps;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Administrator
 */
public class SinhVienDAO {
    static SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    public static List<SinhVien> ls = new ArrayList<>();
    public int add(SinhVien q) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO dbo.SinhVien (MaSV, TenSV, maCN, NgaySinh, GioiTinh, Phone) \n" +
"	VALUES (?,?,?,?,?,?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, q.getMaSV());
            sttm.setString(2, q.getTenSV());
            sttm.setInt(3, q.getMaCN().getMaCN());
            sttm.setString(4, DateHelps.toString(q.getNgaySinh()));
            sttm.setBoolean(5, q.isGioiTinh());
            sttm.setString(6, q.getPhone());
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
     public int dell(SinhVien q) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbo.SinhVien WHERE MaSV =?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, q.getMaSV());
            if (sttm.executeUpdate() > 0) {
                System.out.println("dell thành công");
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
      public int edit(SinhVien q) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE dbo.SinhVien SET  \"TenSV\" = ?, \"maCN\" = ?,"
                    + " \"NgaySinh\" = ?, \"GioiTinh\" = ?,"
                    + " \"Phone\" = ? WHERE MaSV =?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(6, q.getMaSV());
            sttm.setString(1, q.getTenSV());
            sttm.setInt(2, q.getMaCN().getMaCN());
            sttm.setString(3, date.format(q.getNgaySinh()));
            sttm.setBoolean(4, q.isGioiTinh());
            sttm.setString(5, q.getPhone());
//             sttm.setInt(7, q.getMaSV());
            if (sttm.executeUpdate() > 0) {
                System.out.println("edit thành công");
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
      public static List<SinhVien> getAllSinhViens() {
        List<SinhVien> lshd = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT MA_HD, NGAY_MUAHANG, MA_KHACHHANG, TRANG_THAI\n"
                    + "FROM  dbo.HOADON";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                SinhVien u = new SinhVien();
                u.setMaSV(Integer.parseInt(rs.getString(1)));
                u.setTenSV(rs.getString(2));
                u.setMaCN(new ChuyenNganh(Integer.parseInt(rs.getString(3)) ));
                u.setNgaySinh(DateHelps.toDate((rs.getString(4))));
                u.setGioiTinh(rs.getBoolean(5));
                u.setPhone(rs.getString(6));
                lshd.add(u);
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
        return lshd;
    }
            public List<SinhVien> getAllSinhVien() {
        List<SinhVien> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT MaSV, TenSV, maCN, NgaySinh, GioiTinh, Phone\n" +
"FROM         dbo.SinhVien";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                SinhVien u = new SinhVien();
                u.setMaSV(Integer.parseInt(rs.getString(1)));
                u.setTenSV(rs.getString(2));
                u.setMaCN(new ChuyenNganh(Integer.parseInt(rs.getString(3)) ));
                u.setNgaySinh(DateHelps.toDate((rs.getString(4))));
                u.setGioiTinh(rs.getBoolean(5));
                u.setPhone(rs.getString(6));
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
            public static void main(String[] args) {
        SinhVienDAO dao = new SinhVienDAO();
                System.out.println("as"+dao.getAllSinhVien());
    }

}




