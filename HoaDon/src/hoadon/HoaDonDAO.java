/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoadon;

import Database.DatabaseUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class HoaDonDAO {

    public List<HoaDon> ls = new ArrayList<>();
    static SimpleDateFormat date_format = new SimpleDateFormat("dd-MM-yyyy");

    public int add(HoaDon hd) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO dbo.HOADON (MA_HD, NGAY_MUAHANG, MA_KHACHHANG, TRANG_THAI) \n"
                    + "	VALUES (?,?,?,?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, hd.getMaHoaDon());
            sttm.setString(2, date_format.format(hd.getNgayMuaHang()));
            sttm.setString(3, hd.getMaKhachHang());
            sttm.setString(4, hd.getTrangThai());
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

    public int edit(HoaDon hd) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE dbo.HOADON SET \"MA_HD\" =?, \"NGAY_MUAHANG\" =?,"
                    + " \"MA_KHACHHANG\" =?, \"TRANG_THAI\" = ? WHERE MA_HD = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, hd.getMaHoaDon());
            sttm.setString(2, date_format.format(hd.getNgayMuaHang()));
            sttm.setString(3, hd.getMaKhachHang());
            sttm.setString(4, hd.getTrangThai());
            sttm.setString(5, hd.getMaHoaDon());
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

    public int dell(HoaDon hd) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbo.HOADON WHERE MA_HD =?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, hd.getMaHoaDon());
            if (sttm.executeUpdate() > 0) {
                System.out.println("xoa thành công");
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

    public static List<HoaDon> getAllHoaDon() {
        List<HoaDon> lshd = new ArrayList<>();
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
                HoaDon hd = new HoaDon();
                hd.setMaHoaDon((rs.getString(1)));
                hd.setNgayMuaHang(date_format.parse(rs.getString(2)));
                hd.setMaKhachHang((rs.getString(3)));
                hd.setTrangThai((rs.getString(4)));
                lshd.add(hd);
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

    public HoaDon getHoaDonBYID(String maHD) {
        HoaDon hd = new HoaDon();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from dbo.HOADON where MA_HD=?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maHD);
            rs = sttm.executeQuery();
            while (rs.next()) {
                hd.setMaHoaDon((rs.getString(1)));
                hd.setNgayMuaHang(date_format.parse(rs.getString(2)));
                hd.setMaKhachHang((rs.getString(3)));
                hd.setTrangThai((rs.getString(4)));
                return hd;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }

    public HoaDon getHoaDonNHAtPosition(int pos) {
        return ls.get(pos);
    }

    public static void main(String[] args) throws ParseException {
        HoaDonDAO dao = new HoaDonDAO();
        HoaDon hd = new HoaDon("120", date_format.parse("12-2-2002"), "KH02", "da thanh toan");
//        dao.add(hd);
//dao.edit(hd);
//        dao.dell(hd);
//System.out.println("==>"+dao.getHoaDonBYID("22"));
        System.out.println("=>" + dao.getAllHoaDon());

    }
}
