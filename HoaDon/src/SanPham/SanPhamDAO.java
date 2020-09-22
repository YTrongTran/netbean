/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SanPham;

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
public class SanPhamDAO {
public static List<SanPham> ls = new ArrayList<>();
    public int add(SanPham sp) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO dbo.SANPHAM (MA_SP, M_TA, S_LUONG, D_GIA, TEN_SP) \n" +
"	VALUES (?,?,?,?,?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, sp.getMaSP());
            sttm.setString(2, sp.getMoTa());
            sttm.setInt(3, sp.getSoLuong());
            sttm.setDouble(4, sp.getDonGia());
            sttm.setString(5, sp.getTenSP());
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
    public int edit(SanPham sp) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE dbo.SANPHAM SET \"MA_SP\" =?, \"M_TA\" = ?,"
                    + " \"S_LUONG\" = ?, \"D_GIA\" = ?, \"TEN_SP\" = ?' WHERE MA_SP =?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, sp.getMaSP());
            sttm.setString(2, sp.getMoTa());
            sttm.setInt(3, sp.getSoLuong());
            sttm.setDouble(4, sp.getDonGia());
            sttm.setString(5, sp.getTenSP());
            sttm.setInt(6, sp.getMaSP());
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
    public int dell(SanPham sp) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbo.SANPHAM WHERE MA_SP =?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, sp.getMaSP());
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
    public static List<SanPham> getAllSanPham() {
        List<SanPham> lssp = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT  MA_SP, M_TA, S_LUONG, D_GIA, TEN_SP\n" +
"FROM dbo.SANPHAM";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMaSP(Integer.parseInt(rs.getString(1)));
                sp.setMoTa((rs.getString(2)));
                sp.setSoLuong(Integer.parseInt(rs.getString(3)));
                sp.setDonGia(Double.parseDouble(rs.getString(4)));
                sp.setTenSP(rs.getString(5));
                lssp.add(sp);
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
        return lssp;
    }

    public SanPham getSanPhamNHAtPosition(int pos) {
        return ls.get(pos);
    }
    public SanPham getSanPhamBYID(int maSP) {
        SanPham sp = new SanPham();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from dbo.SANPHAM where MA_SP =?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, maSP);
            rs = sttm.executeQuery();
            while (rs.next()) {
                sp.setMaSP(Integer.parseInt(rs.getString(1)));
                sp.setMoTa((rs.getString(2)));
                sp.setSoLuong(Integer.parseInt(rs.getString(3)));
                sp.setDonGia(Double.parseDouble(rs.getString(4)));
                sp.setTenSP(rs.getString(5));
                return sp;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }
    
    public static void main(String[] args) {
        SanPhamDAO dao = new SanPhamDAO();
        SanPham sp = new SanPham(122, "tot", 5, 12000, "quat");
        dao.add(sp);
//        System.out.println("=>"+dao.getAllSanPham());
//        System.out.println("=>"+dao.getSanPhamBYID("110"));
    }
}
