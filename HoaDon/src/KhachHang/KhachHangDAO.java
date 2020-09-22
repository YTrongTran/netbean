/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KhachHang;

import Database.DatabaseUtils;
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
public class KhachHangDAO {

    public List<KhachHang> ls = new ArrayList<KhachHang>();

    public int add(KhachHang kh) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO dbo.KhachHang (MA_KHACHHANG, HOVATEN_LOT, TEN, DIA_CHI, EMAIL, DIEN_THOAI) \n"
                    + "	VALUES (?,?,?,?,?, ?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, kh.getMaKhacHang());
            sttm.setString(2, kh.getHoVTLot());
            sttm.setString(3, kh.getTen());
            sttm.setString(4, kh.getDiaChi());
            sttm.setString(5, kh.getEmail());
            sttm.setString(6, kh.getDienThoai());
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

    public int edit(KhachHang kh) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE dbo.KhachHang SET \"MA_KHACHHANG\" = ?, "
                    + "\"HOVATEN_LOT\" =?, \"TEN\" =?, "
                    + "\"DIA_CHI\" =?, \"EMAIL\" = ?, "
                    + "\"DIEN_THOAI\" = ? WHERE MA_KHACHHANG =?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, kh.getMaKhacHang());
            sttm.setString(2, kh.getHoVTLot());
            sttm.setString(3, kh.getTen());
            sttm.setString(4, kh.getDiaChi());
            sttm.setString(5, kh.getEmail());
            sttm.setString(6, kh.getDienThoai());
            sttm.setString(7, kh.getMaKhacHang());
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

    public int dell(KhachHang kh) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbo.KhachHang WHERE MA_KHACHHANG =?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, kh.getMaKhacHang());
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

    public static List<KhachHang> getAllKhachHang() {
        List<KhachHang> lshd = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT MA_KHACHHANG, HOVATEN_LOT, TEN, DIA_CHI, EMAIL, DIEN_THOAI\n"
                    + "FROM dbo.KhachHang";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKhacHang(rs.getString(1));
                kh.setHoVTLot(rs.getString(2));
                kh.setTen((rs.getString(3)));
                kh.setDiaChi(rs.getString(4));
                kh.setEmail(rs.getString(5));
                kh.setDienThoai(rs.getString(6));
                lshd.add(kh);
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

    public KhachHang getKhachHangBYID(String maKH) {
        KhachHang kh = new KhachHang();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from dbo.KhachHang where MA_KHACHHANG=?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maKH);
            rs = sttm.executeQuery();
            while (rs.next()) {
                kh.setMaKhacHang(rs.getString(1));
                kh.setHoVTLot(rs.getString(2));
                kh.setTen((rs.getString(3)));
                kh.setDiaChi(rs.getString(4));
                kh.setEmail(rs.getString(5));
                kh.setDienThoai(rs.getString(6));
                return kh;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }

    public KhachHang getKhachHangNHAtPosition(int pos) {
        return ls.get(pos);
    }

    public int findKhachhang(String maKH) {
        int p = -1;
        for (int i = 0; i < getAllKhachHang().size(); i++) {
            if (getAllKhachHang().get(i).getMaKhacHang().equalsIgnoreCase(maKH)) {
                p = i;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        KhachHangDAO dao = new KhachHangDAO();
        KhachHang kh = new KhachHang("KH11", "Nguyen", "sang", "11 da nang", "ad@gmail.com", "012220202");
        dao.add(kh);
//        System.out.println("=>"+dao.getAllKhachHang());
    }
}
