/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanlyNhanVien;

import Database.DatabaseUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trany
 */
public class NhanVienDAO {

    public static List<NhanVien> ls = new ArrayList<>();

    public NhanVienDAO() {
    }

    public boolean checkLogin(String username, String password) {
        boolean check = false;
        NhanVien nv = getNhanVienByID(username);
        if (nv != null) {
            if (nv.getMaNV().equals(password)) {
                return true;
            }
    }
         return check;
    }

    public int add(NhanVien nv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO dbo.NhanVien (MaNV, MatKhau, Hovaten, VaiTro) \n" +
"VALUES (?,?,?,?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, nv.getMaNV());
            sttm.setString(2, nv.getMatKhau());
            sttm.setString(3, nv.getHoTen());
            sttm.setBoolean(4, nv.isVaitro());
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

    public int edit(NhanVien nv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE dbo.NhanVien SET \"MaNV\" =?, \"MatKhau\" =?, \"Hovaten\" =?, \"VaiTro\" =? WHERE MaNV =?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, nv.getMaNV());
            sttm.setString(2, nv.getMatKhau());
            sttm.setString(3, nv.getHoTen());
            sttm.setBoolean(4, nv.isVaitro());
            sttm.setString(5, nv.getMaNV());
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

    public int dell(NhanVien nv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbo.NhanVien WHERE MaNV =?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, nv.getMaNV());
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

    public List<NhanVien> getAllNhanVien() {
        List<NhanVien> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT  MaNV, MatKhau, Hovaten, VaiTro\n" +
"FROM  dbo.NhanVien";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                NhanVien u = new NhanVien();
                u.setMaNV(rs.getString(1));
                u.setMatKhau(rs.getString(2));
                u.setHoTen(rs.getString(3));
                u.setVaitro(rs.getBoolean(4));
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

    public NhanVien getNhanVienByID(String username) {
        NhanVien nv = new NhanVien();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from NhanVien  where MaNV=?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, username);
            rs = sttm.executeQuery();
            while (rs.next()) {
                nv.setMaNV(rs.getString(1));
                nv.setMatKhau(rs.getString(2));
                nv.setHoTen(rs.getString(3));
                nv.setVaitro(rs.getBoolean(4));
                return nv;

            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }
    public NhanVien getNhanVienAtPosition(int pos){
    return ls.get(pos);
    }

    public static void main(String[] args) {
        NhanVienDAO daonv = new NhanVienDAO();
        NhanVien nv = new NhanVien("NVS001S006", "12345", "TRANG", false);
//        daonv.add(nv);
//        daonv.edit(nv);
//        daonv.dell(nv);
//        System.out.println("size" + daonv.getAllNhanVien());
        System.out.println("size" + daonv.getNhanVienByID("NVS00S001"));

    }
}
