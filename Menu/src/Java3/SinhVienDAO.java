/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java3;

import Database.DatabaseUtils;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trany
 */
public class SinhVienDAO {

    List<SinhVien> ls = new ArrayList<>();
    static SimpleDateFormat date_format = new SimpleDateFormat("dd/MM/yyyy");

    public SinhVienDAO() {
    }

    public int add(SinhVien nv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //? la tham so
            // '?' la ki tu
            String sSQL = "INSERT INTO dbo.SinhVien (MaSV, TenNV, NgaySinh, GioiTinh, Diachi, Images) \n"
                    + "	VALUES (?, ?, ?,?,?,?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, nv.getMaSV());
            sttm.setString(2, nv.getTenNV());
            sttm.setString(3, date_format.format(nv.getNgaySinh()));
            sttm.setBoolean(4, nv.isGioiTinh());
            sttm.setString(5, nv.getDiaChi());
            sttm.setString(6, nv.getHinhAnh());

            if (sttm.executeUpdate() > 0) {
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
            return -1;

        }
    }

    public int edit(SinhVien nv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //? la tham so
            // '?' la ki tu
            String sSQL = "UPDATE dbo.SinhVien SET \"MaSV\" = ?, \"TenNV\" = ?, \"NgaySinh\" = ?, \"GioiTinh\" = ?, \"Diachi\" = ?, \"Images\" = ? WHERE MaSV = ?;\n"
                    + "";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, nv.getMaSV());
            sttm.setString(2, nv.getTenNV());
            sttm.setString(3, date_format.format(nv.getNgaySinh()));
            sttm.setBoolean(4, nv.isGioiTinh());
            sttm.setString(5, nv.getDiaChi());
            sttm.setString(6, nv.getHinhAnh());
            sttm.setString(7, nv.getMaSV());

            if (sttm.executeUpdate() > 0) {
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
            return -1;

        }
    }

    public int del(SinhVien nv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //? la tham so
            // '?' la ki tu
            String sSQL = "DELETE FROM dbo.SinhVien WHERE MaSV = ?;\n" + "";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, nv.getMaSV());
//            sttm.setString(2, nv.getTenNV());
//            sttm.setDate(3, (Date) nv.getNgaySinh());
//            sttm.setBoolean(4, nv.isGioiTinh());
//            sttm.setString(5, nv.getDiaChi());
//            sttm.setString(6, nv.getHinhAnh());
//            sttm.setString(7, nv.getMaSV());

            if (sttm.executeUpdate() > 0) {
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
            return -1;

        }
    }

    public List<SinhVien> getAllSinhVien() {
        List<SinhVien> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select MaSV,TenNV,NgaySinh,GioiTinh,Diachi,Images from SinhVien order by MaSV desc";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                SinhVien nv = new SinhVien();
                nv.setMaSV(rs.getString(1));
                nv.setTenNV(rs.getString(2));
                nv.setNgaySinh(rs.getDate(3));
                nv.setGioiTinh(rs.getBoolean(4));
                nv.setDiaChi(rs.getString(5));
                nv.setHinhAnh(rs.getString(6));
                ls.add(nv);
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

    public SinhVien getNhanVienByID(String manv) {
        SinhVien nv = new SinhVien();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from SinhVien where MaSV = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, manv);
            rs = sttm.executeQuery();
            while (rs.next()) {
                nv.setMaSV(rs.getString(1));
                nv.setTenNV(rs.getString(2));
                nv.setNgaySinh(rs.getDate(3));
                nv.setGioiTinh(rs.getBoolean(4));
                nv.setDiaChi(rs.getString(5));
                nv.setHinhAnh(rs.getString(6));
                return nv;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }

    public static void main(String[] args) throws ParseException {
        SinhVienDAO dao = new SinhVienDAO();
        SinhVien nv = new SinhVien("P13", "HAU", date_format.parse("12/12/2019"), true, "QUANG NAM", "A");
//        dao.add(nv);
System.out.println("size"+dao.getNhanVienByID("p01"));

    }
}
