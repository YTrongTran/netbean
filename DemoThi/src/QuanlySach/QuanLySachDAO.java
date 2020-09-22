/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanlySach;

import Datautiles.DatabaseUtils;
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
public class QuanLySachDAO {

    public static List<QuanLySach> ls = new ArrayList<>();
    static SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");

    public int add(QuanLySach q) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO dbo.Sach (ma_sach, tensach, gia, ma_nxb, NgayNhap) \n"
                    + "	VALUES (?,?, ?, ?,?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, q.getMaSach());
            sttm.setString(2, q.getTenSach());
            sttm.setDouble(3, q.getGia());
            sttm.setInt(4, q.getNhaXuatBan().getMaXB());
            sttm.setString(5, date.format(q.getNgayNhap()));
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

    public int edit(QuanLySach q) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE dbo.Sach SET \"ma_sach\" =?, \"tensach\" =?,"
                    + " \"gia\" = ?, \"ma_nxb\" = ?, \"NgayNhap\" =? WHERE ma_sach =?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, q.getMaSach());
            sttm.setString(2, q.getTenSach());
            sttm.setDouble(3, q.getGia());
            sttm.setInt(4, q.getNhaXuatBan().getMaXB());
            sttm.setString(5, date.format(q.getNgayNhap()));
            sttm.setInt(6, q.getMaSach());
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

    public int dell(QuanLySach q) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbo.Sach WHERE ma_sach =?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, q.getMaSach());

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

    public List<QuanLySach> getAllQuanLySach() {
        List<QuanLySach> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT ma_sach, tensach, gia, ma_nxb, NgayNhap\n"
                    + "FROM   dbo.Sach";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                QuanLySach u = new QuanLySach();
                u.setMaSach(Integer.parseInt(rs.getString(1)));
                u.setTenSach(rs.getString(2));
                u.setGia(Double.parseDouble(rs.getString(3)));
                u.setNhaXuatBan(new NhaXuatBan(Integer.parseInt(rs.getString(4))));
                u.setNgayNhap(date.parse(rs.getString(5)));
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

    public QuanLySach getQuanLySachID(int masach) {
        QuanLySach u = new QuanLySach();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from Sach  where ma_sach=?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, masach);
            rs = sttm.executeQuery();
            while (rs.next()) {
                u.setMaSach(Integer.parseInt(rs.getString(1)));
                u.setTenSach(rs.getString(2));
                u.setGia(Double.parseDouble(rs.getString(3)));
               u.setNhaXuatBan(new NhaXuatBan(Integer.parseInt(rs.getString(4))));
                u.setNgayNhap(date.parse(rs.getString(5)));
                return u;

            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }

    public QuanLySach getQuanLySachAtPosition(int pos) {
        return ls.get(pos);
    }

    public static void main(String[] args) throws ParseException {
        QuanLySachDAO dao = new QuanLySachDAO();
//        QuanLySach q = new QuanLySach(3,"Co", Double.NaN, date.parse("12-12-2001"),3);
//        dao.add(q);
//        dao.edit(q);
        System.out.println("size:" + dao.getAllQuanLySach());

    }
}
