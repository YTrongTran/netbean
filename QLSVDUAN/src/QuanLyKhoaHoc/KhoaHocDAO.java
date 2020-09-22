/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyKhoaHoc;

import Database.DatabaseUtils;

import QuanlyNhanVien.NhanVien;
import QuanlychuyenDe.ChuyenDe;
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
 * @author trany
 */
public class KhoaHocDAO {

    public static List<KhoaHoc> ls = new ArrayList<>();
    static SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy");

    public KhoaHocDAO() {
    }

    public int add(KhoaHoc kh) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO dbo.KhocHoc (MaCD, Hocphi, Thoiluong, NgayDK, Ghichu, MaNV, NgayTao) \n"
                    + "VALUES (?,?, ?,?,?,?,?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, kh.getMaCD());
            sttm.setFloat(2, kh.getHocPhi());
            sttm.setInt(3, kh.getThoiLuong());
            sttm.setString(4, date2.format(kh.getNgayKhaiGiang()));
            sttm.setString(5, kh.getGhiChu());
            sttm.setString(6, kh.getMaNV().getMaNV());
            sttm.setString(7, date2.format(kh.getNgayTao()));
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

    public int edit( KhoaHoc kh) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE dbo.KhocHoc SET \"MaCD\" = ?, \"Hocphi\" =?,"
                    + " \"Thoiluong\" =?, \"NgayDK\" = ?, \"Ghichu\" =?, \"MaNV\" = ?, \"NgayTao\" = ? WHERE MaKH =?";
            
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            
            sttm.setString(1, kh.getMaCD());
            sttm.setFloat(2, kh.getHocPhi());
            sttm.setInt(3, kh.getThoiLuong());
            sttm.setString(4, date2.format(kh.getNgayKhaiGiang()));
            sttm.setString(5, kh.getGhiChu());
            sttm.setString(6, kh.getMaNV().getMaNV());
            sttm.setString(7, date2.format(kh.getNgayTao()));
           sttm.setInt(8, kh.getMaKH());
            if (sttm.executeUpdate() > 0) {

                System.out.println("edit thanh cong");
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

    public int dell(int maMk) {
        KhoaHoc kh = new KhoaHoc();
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbo.KhocHoc WHERE MaKH =?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, maMk);
            if (sttm.executeUpdate() > 0) {
                System.out.println("xoa thanh cong");
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

    public List<KhoaHoc> getAllkhoaHoc() {
        List<KhoaHoc> lskh = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT dbo.KhocHoc.MaKH, dbo.ChuyenDe.MaCD, dbo.KhocHoc.Hocphi, dbo.KhocHoc.Thoiluong, dbo.KhocHoc.NgayDK, dbo.NhanVien.MaNV, dbo.KhocHoc.NgayTao\n"
                    + "FROM dbo.ChuyenDe INNER JOIN\n"
                    + " dbo.KhocHoc ON dbo.ChuyenDe.MaCD = dbo.KhocHoc.MaCD INNER JOIN\n"
                    + "dbo.NhanVien ON dbo.KhocHoc.MaNV = dbo.NhanVien.MaNV";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                KhoaHoc kh = new KhoaHoc();
                kh.setMaKH(Integer.parseInt(rs.getString(1)));
                kh.setMaCD(rs.getString(2));
                kh.setHocPhi(Float.parseFloat(rs.getString(3)));
                kh.setThoiLuong(Integer.parseInt(rs.getString(4)));
                kh.setNgayKhaiGiang(date2.parse(rs.getString(5)));
                kh.setMaNV(new NhanVien(rs.getString(6)));
                kh.setNgayTao(date2.parse(rs.getString(7)));
                lskh.add(kh);
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
        return lskh;
    }

    public KhoaHoc getKhoaHocBYID(int MaKh) {
        KhoaHoc kh = new KhoaHoc();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from KhocHoc where MaKH=?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, MaKh);
            rs = sttm.executeQuery();
            while (rs.next()) {
                kh.setMaKH(Integer.parseInt(rs.getString(1)));
                kh.setMaCD(rs.getString(2));
                kh.setHocPhi(Float.parseFloat(rs.getString(3)));
                kh.setThoiLuong(Integer.parseInt(rs.getString(4)));
                kh.setNgayKhaiGiang(date2.parse(rs.getString(5)));
                kh.setMaNV(new NhanVien(rs.getString(6)));
                kh.setNgayTao(date2.parse(rs.getString(7)));
                kh.setMaKH(Integer.parseInt(rs.getString(8)));
                return kh;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }

    public KhoaHoc getKhoaHocNHAtPosition(int pos) {
        return ls.get(pos);
    }

    public static void main(String[] args) throws ParseException {
        KhoaHocDAO dao = new KhoaHocDAO();
        KhoaHoc kh = new KhoaHoc(1, "CDS001CD123",36500, 64, null, date2.parse("12/2/2010"), "ad", new NhanVien("NVS001S007"), date2.parse("12/2/2011"));
//        System.out.println("a" + dao.getAllkhoaHoc());
        dao.add(kh);
//      dao.edit(kh);
//dao.dell(4);
//System.out.println("a" + dao.getKhoaHocBYID(1));
    }
}
