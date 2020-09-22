/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLySinhVien;

import Model.Employees;
import database.DatabaseUtils;
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
public class NhanVienDAO {

    List<NhanVien> ls = new ArrayList<>();
    static SimpleDateFormat date_format = new SimpleDateFormat("dd/MM/yyyy");

    public int add(NhanVien nv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //? la tham so
            // '?' la ki tu
            String sSQL = "INSERT INTO dbo.NhanVien (MaNV, TenNv, NgaySinh, GioiTinh, PhongBan) \n"
                    + "	VALUES (? , ? ,?, ?, ?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, nv.getMaNV());
            sttm.setString(2, nv.getTenNV());
            sttm.setString(3, date_format.format(nv.getNgaySinh()));
            sttm.setBoolean(4, nv.isGioiTinh());
            sttm.setString(5, nv.getPhongban());
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

    public int edit(NhanVien nv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //? la tham so
            // '?' la ki tu

            String sSQL = "UPDATE dbo.NhanVien SET \"TenNv\" = ?, \"NgaySinh\" =?, \"GioiTinh\" = ?, \"PhongBan\" = ? WHERE MaNV = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);

            sttm.setString(1, nv.getTenNV());
            sttm.setString(2, date_format.format(nv.getNgaySinh()));
            sttm.setBoolean(3, nv.isGioiTinh());
            sttm.setString(4, nv.getPhongban());
            sttm.setString(5, nv.getMaNV());

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

    public int dell(NhanVien nv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //? la tham so
            // '?' la ki tu

            String sSQL = "DELETE FROM dbo.NhanVien WHERE MaNV = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, nv.getMaNV());
//            sttm.setString(2, nv.getTenNV());
//            sttm.setString(3, date_format.format(nv.getNgaySinh()));
//            sttm.setBoolean(4, nv.isGioiTinh());
//            sttm.setString(5, nv.getPhongban());
//           

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

    public List<NhanVien> getAllNhanVien() {
        List<NhanVien> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select MaNV,TenNv,NgaySinh,GioiTinh,PhongBan from NhanVien order by MaNV desc";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                Employees ee = new Employees();
                ee.setId(rs.getInt(1));
                ee.setName(rs.getString(2));
                ee.setAge(rs.getInt(3));
                ee.setAddress(rs.getString(4));
//                ls.add(nv);
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

    public NhanVien getNhanVienByID(String MaNV) {
        NhanVien nv = new NhanVien();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs=null;
        try {
            String sSQL = "select MaNV ,TenNv, NgaySinh, GioiTinh ,PhongBan from NhanVien \n"
                    + "where MaNV = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, MaNV);
            rs = sttm.executeQuery();
            while (rs.next()) {
                nv.setMaNV(rs.getString(1));
                nv.setTenNV(rs.getString(2));
                nv.setNgaySinh(rs.getDate(3));
                nv.setGioiTinh(rs.getBoolean(4));
                nv.setPhongban(rs.getString(5));
                return nv;

            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }

    public int count() {
        return ls.size();
    }

    public static void main(String[] args) throws ParseException {
        NhanVien nv = new NhanVien("P2", "VAN TUAN", date_format.parse("12/12/2010"), false, "NhanVien");
        NhanVienDAO dao = new NhanVienDAO();
//        dao.add(nv);
//        dao.edit(nv);
//        dao.dell(nv);
        System.out.println("size:" + dao.getNhanVienByID("P2"));
    }

}
