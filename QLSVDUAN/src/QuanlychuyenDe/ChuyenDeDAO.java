/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanlychuyenDe;

import Database.DatabaseUtils;
import static Quanlynguoihoc.NguoiHocDAO.getAllQlNguoiHoc;
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
public class ChuyenDeDAO {

    public static List<ChuyenDe> ls = new ArrayList<>();

    public ChuyenDeDAO() {
    }

    public int add(ChuyenDe cd) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO dbo.ChuyenDe (MaCD, TenCD, Hocphi, Thoiluong, Hinh, Mota) \n"
                    + "VALUES (?,?,?,?,?,?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, cd.getMaCD());
            sttm.setString(2, cd.getTenCD());
            sttm.setFloat(3, cd.getHocPhi());
            sttm.setInt(4, cd.getThoiLuong());
            sttm.setString(5, cd.getHinh());
            sttm.setString(6, cd.getMoTa());

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

    public int edit(ChuyenDe cd) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE dbo.ChuyenDe SET \"MaCD\" =?, \"TenCD\" =?, \"Hocphi\" =?, \"Thoiluong\" =?, \"Hinh\" =?, \"Mota\" =? WHERE MaCD =?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, cd.getMaCD());
            sttm.setString(2, cd.getTenCD());
            sttm.setFloat(3, cd.getHocPhi());
            sttm.setInt(4, cd.getThoiLuong());
            sttm.setString(5, cd.getHinh());
            sttm.setString(6, cd.getMoTa());
            sttm.setString(7, cd.getMaCD());
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

    public int dell(ChuyenDe cd) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbo.ChuyenDe WHERE MaCD = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, cd.getMaCD());
//            sttm.setString(2, cd.getTenCD());
//            sttm.setFloat(3, cd.getHocPhi());
//            sttm.setInt(4, cd.getThoiLuong());
//            sttm.setString(5, cd.getHinh());
//            sttm.setString(6, cd.getMoTa());
//            sttm.setString(7, cd.getMaCD());
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

    public static List<ChuyenDe> getAllChuyenDe() {
        List<ChuyenDe> lscd = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT  MaCD, TenCD, Hocphi, Thoiluong, Hinh\n"
                    + "FROM  dbo.ChuyenDe";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                ChuyenDe cd = new ChuyenDe();
                cd.setMaCD(rs.getString(1));
                cd.setTenCD(rs.getString(2));
                cd.setHocPhi(Float.parseFloat(rs.getString(3)));
                cd.setThoiLuong(Integer.parseInt(rs.getString(4)));
                cd.setHinh(rs.getString(5));
                lscd.add(cd);
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
        return lscd;
    }

    public ChuyenDe getChuyenDeBYID(String maCD) {
        ChuyenDe cd = new ChuyenDe();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select * from ChuyenDe where MaCD=?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maCD);
            rs = sttm.executeQuery();
            while (rs.next()) {
                cd.setMaCD(rs.getString(1));
                cd.setTenCD(rs.getString(2));
                cd.setHocPhi(Float.parseFloat(rs.getString(3)));
                cd.setThoiLuong(Integer.parseInt(rs.getString(4)));
                cd.setHinh(rs.getString(5));
                cd.setMoTa(rs.getString(6));
                return cd;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }

    public ChuyenDe getChuyenDeNHAtPosition(int pos) {
        return ls.get(pos);
    }
    public int TenCD(String tencd){
        int p =-1;
  for (int i = 0; i < getAllChuyenDe().size(); i++) {
            if (getAllChuyenDe().get(i).getTenCD().equalsIgnoreCase(tencd)) {
                p =i;
            }
        }
  return p;
    }
    public int MaCD(String maCD){
        int p =-1;
  for (int i = 0; i < getAllChuyenDe().size(); i++) {
            if (getAllChuyenDe().get(i).getMaCD().equalsIgnoreCase(maCD)) {
                p =i;
            }
        }
  return p;
    }

    public static void main(String[] args) {
        ChuyenDeDAO daocd = new ChuyenDeDAO();
        ChuyenDe cd = new ChuyenDe("CDS001CD0011", "HTML co ban", 2400000, 60, "ad", "a");
//        daocd.add(cd);
//        daocd.edit(cd);
//        daocd.dell(cd);
//        System.out.println("size" + daocd.getAllChuyenDe());
        System.out.println("size" + daocd.getChuyenDeBYID("CDS001CD0011")); 
    }
}
