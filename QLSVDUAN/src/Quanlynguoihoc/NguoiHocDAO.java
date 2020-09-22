/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quanlynguoihoc;

import Database.DatabaseUtils;
import QuanlyNhanVien.NhanVien;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
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
public class NguoiHocDAO {

    public static List<Nguoihoc> ls = new ArrayList<>();
static SimpleDateFormat date_format = new SimpleDateFormat("dd/MM/yyyy");
    public NguoiHocDAO() {
    }

    public int add(Nguoihoc nh) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO dbo.NguoiHoc (MaNH, Hovaten, Gioitinh, Ngaysinh, Phone, Email, Ghichu, MaNV, NgayDK) \n" +
"VALUES (?,?,?,?,?,?,?,?,?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, nh.getMaNH());
            sttm.setString(2, nh.getHovaTen());
            sttm.setBoolean(3, nh.isGioiTinh());
            sttm.setString(4, DateHelps.toString(nh.getNgaySinh()));
            sttm.setString(5, nh.getPhone());
            sttm.setString(6, nh.getEmail());
            sttm.setString(7, nh.getGhiChu());
            sttm.setString(8, nh.getMaNV().getMaNV());
            sttm.setString(9, DateHelps.toString(nh.getNgayDk()));
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

    public int edit(Nguoihoc nh) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE dbo.NguoiHoc SET \"MaNH\" = ?, \"Hovaten\" = ?, \"Gioitinh\" = ?, \"Ngaysinh\" = ?, \"Phone\" = ?, \"Email\" =?, \"Ghichu\" =?, \"MaNV\" = ?, \"NgayDK\" =? WHERE MaNH =?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, nh.getMaNH());
            sttm.setString(2, nh.getHovaTen());
            sttm.setBoolean(3, nh.isGioiTinh());
            sttm.setString(4, DateHelps.toString(nh.getNgaySinh()));
            sttm.setString(5, nh.getPhone());
            sttm.setString(6, nh.getEmail());
            sttm.setString(7, nh.getGhiChu());
            sttm.setString(8, nh.getMaNV().getMaNV());
            sttm.setString(9, DateHelps.toString(nh.getNgayDk()));
            sttm.setString(10, nh.getMaNH());
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

    public int dell(Nguoihoc nh) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbo.NguoiHoc WHERE MaNH =?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, nh.getMaNH());
            if (sttm.executeUpdate() > 0) {
                System.out.println("dell thanh cong");
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

    public static List<Nguoihoc> getAllQlNguoiHoc() {
        List<Nguoihoc> lsnh = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT  dbo.NguoiHoc.MaNH, dbo.NguoiHoc.Hovaten, dbo.NguoiHoc.Gioitinh, dbo.NguoiHoc.Ngaysinh, dbo.NguoiHoc.Phone, dbo.NguoiHoc.Email, dbo.NhanVien.MaNV, \n" +
" dbo.NguoiHoc.NgayDK\n" +
"FROM dbo.NguoiHoc INNER JOIN\n" +
" dbo.NhanVien ON dbo.NguoiHoc.MaNV = dbo.NhanVien.MaNV";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {

                Nguoihoc nh = new Nguoihoc();
                nh.setMaNH(rs.getString(1));
                nh.setHovaTen(rs.getString(2));
                nh.setGioiTinh(rs.getBoolean(3));
                nh.setNgaySinh(DateHelps.toDate(rs.getString(4)));
                nh.setPhone(rs.getString(5));
                nh.setEmail(rs.getString(6));
                NhanVien a = new NhanVien();
                a.setMaNV(rs.getString(7));
                nh.setMaNV(a);
                nh.setNgayDk(DateHelps.toDate(rs.getString(8)));
                lsnh.add(nh);
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
        return lsnh;
    }

    public Nguoihoc getNguoiHocByID(String maNH) {
        Nguoihoc nh = new Nguoihoc();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from NguoiHoc where MaNH=?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maNH);
            rs = sttm.executeQuery();
            while (rs.next()) {
                nh.setMaNH(rs.getString(1));
                nh.setHovaTen(rs.getString(2));
                nh.setGioiTinh(rs.getBoolean(3));
                nh.setNgaySinh(DateHelps.toDate(rs.getString(4)));
                nh.setPhone(rs.getString(5));
                nh.setEmail(rs.getString(6));
                nh.setGhiChu(rs.getString(7));
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString(8));
                nh.setMaNV(nv);
                nh.setNgayDk(DateHelps.toDate(rs.getString(9)));
                return nh;

            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }

    public ArrayList find(String maNH) {
        ArrayList<Nguoihoc> ls = new ArrayList<>();
        for (int i = 0; i < getAllQlNguoiHoc().size(); i++) {
            if (getAllQlNguoiHoc().get(i).getMaNH().contains(maNH)) {
                ls.add(getAllQlNguoiHoc().get(i));
            }
        }
        return ls;
    }
//     public ArrayList findata(String ten){
//    ArrayList<Nguoihoc> ls = new ArrayList<>();
//    int p =-1;
//        for (int i = 0; i < getAllQlNguoiHoc().size(); i++) {
//            if (getAllQlNguoiHoc().get(i).getHovaTen().contains(ten)) {
//                ls.add(getAllQlNguoiHoc().get(i));
//            }
//              
//        }
//      return ls;
//    }

    public Nguoihoc getNguoiHocAtPosition(int pos) {
        return ls.get(pos);
    }

    public static void main(String[] args) throws ParseException {
        NguoiHocDAO daonh = new NguoiHocDAO();
        Nguoihoc nh = new Nguoihoc("NH0123", "HAU1", true,date_format.parse("12/2/2001"), "123", "asd@ad", "1asd", new NhanVien("NVS00S005"),date_format.parse("12/2/2001"));
//        daonh.add(nh);
//        daonh.edit(nh);
//        daonh.dell(nh);
//System.out.println("size:"+daonh.getAllQlNguoiHoc());
System.out.println("size:"+daonh.getNguoiHocByID("NH0123"));

    }
}
