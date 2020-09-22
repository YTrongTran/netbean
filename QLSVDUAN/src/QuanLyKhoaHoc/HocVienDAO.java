/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyKhoaHoc;

import Database.DatabaseUtils;
import static QuanLyKhoaHoc.KhoaHocDAO.date2;
import QuanlyNhanVien.NhanVien;
import Quanlynguoihoc.Nguoihoc;
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
public class HocVienDAO {
public static List<HocVien> ls = new ArrayList<>();
    public int add(HocVien hv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO dbo.HocVien (MaKH, MaNH, Diem) \n"
                    + "	VALUES (?,?,?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, hv.getMaKH());
            sttm.setString(2, hv.getMaNH());
            sttm.setDouble(3, hv.getDiem());

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

    public int edit(HocVien hv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE dbo.HocVien SET \"MaKH\" = ?, \"MaNH\" =?, \"Diem\" = ? WHERE MaHV = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, hv.getMaKH());
            sttm.setString(2, hv.getMaNH());
            sttm.setDouble(3, hv.getDiem());
            sttm.setInt(4, hv.getMaHV());
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

    public int edll(HocVien hv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbo.HocVien WHERE MaHV =?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, hv.getMaHV());
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

    public List<HocVien> getAllHocVien() {
        List<HocVien> lshv = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT dbo.HocVien.MaHV, dbo.KhocHoc.MaKH, dbo.NguoiHoc.MaNH, dbo.NguoiHoc.Hovaten, dbo.HocVien.Diem\n" +
"FROM  dbo.HocVien INNER JOIN dbo.KhocHoc ON dbo.HocVien.MaKH = dbo.KhocHoc.MaKH INNER JOIN\n" +
"dbo.NguoiHoc ON dbo.HocVien.MaNH = dbo.NguoiHoc.MaNH";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                HocVien hv = new HocVien();
                hv.setMaHV(Integer.parseInt(rs.getString(1)));
                hv.setMaKH(Integer.parseInt(rs.getString(2)));
                hv.setMaNH(new Nguoihoc(rs.getString(3), rs.getString(4)).toString());
                hv.setDiem(Double.parseDouble(rs.getString(5)));

                lshv.add(hv);
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
        return lshv;
    }
public HocVien getHocVienBYID(int Mahv) {
        HocVien hv = new HocVien();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from HocVien where MaHV=?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, Mahv);
            rs = sttm.executeQuery();
            while (rs.next()) {
                hv.setMaHV(Integer.parseInt(rs.getString(1)));
                hv.setMaKH(Integer.parseInt(rs.getString(2)));
                hv.setMaNH((rs.getString(3)));
                hv.setDiem(Double.parseDouble(rs.getString(4)));
                return hv;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }

    public HocVien getHocVienNHAtPosition(int pos) {
        return ls.get(pos);
    }
    public static void main(String[] args) {
        HocVienDAO dao = new HocVienDAO();
        HocVien hv = new HocVien(1, 9, "NHS001");
//        dao.add(hv);
//        dao.edit(hv);
        System.out.println("size:" + dao.getAllHocVien());
        System.out.println("size:"+dao.getHocVienBYID(1));

    }
}
