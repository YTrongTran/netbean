/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import View.DataHelpers;
import View.DatabaseUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tran Y
 */
public class SachDAO {

    public boolean insert(Sach sach) throws SQLException {
        String sql = "insert into Sach (masach,tensach,ngaynhap,giatien,soluong,maloaisach)\n"
                + "values(?,?,?,?,?,?)";

        try (
                Connection con = DatabaseUtil.getDBConnect();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, sach.getMasach());
            ps.setString(2, sach.getTensach());
            ps.setString(3, DataHelpers.toString(sach.getNgaynhap()));
            ps.setFloat(4, sach.getGiatien());
            ps.setString(5, sach.getSoluong());
            ps.setInt(6, sach.getLoaiSach().getMaLoaiSach());
            return ps.executeUpdate() > 0;
        }

    }

    public boolean save(Sach sach) throws SQLException {
        String sql = "update Sach set tensach=?,ngaynhap=?,giatien=?,soluong=?,maloaisach=? where masach=?";
        try (
                Connection con = DatabaseUtil.getDBConnect();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(6, sach.getMasach());
            ps.setString(1, sach.getTensach());
            ps.setString(2, DataHelpers.toString(sach.getNgaynhap()));
            ps.setFloat(3, sach.getGiatien());
            ps.setString(4, sach.getSoluong());
            ps.setInt(5, sach.getLoaiSach().getMaLoaiSach());
            return ps.executeUpdate() > 0;
        }

    }

    public boolean delete(Sach sach) throws SQLException {
        String sql = "delete Sach where masach=?";

        try (
                Connection con = DatabaseUtil.getDBConnect();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, sach.getMasach());

            return ps.executeUpdate() > 0;
        }

    }

    public List<Sach> getAll() throws SQLException {
        List<Sach> ls = new ArrayList<>();
        String sql = "select * from Sach";
        try (
                Connection con = DatabaseUtil.getDBConnect();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();) {
            while (rs.next()) {
                Sach sach = new Sach();
                sach.setMasach(rs.getString("masach"));
                sach.setTensach(rs.getString("tensach"));
                sach.setNgaynhap(rs.getDate("ngaynhap"));
                sach.setGiatien(rs.getFloat("giatien"));
                sach.setSoluong(rs.getString("soluong"));
                sach.setLoaiSach(new LoaiSach(rs.getInt("MaLoaiSach")));
                ls.add(sach);

            }
            return ls;
        }

    }

    public Sach findById(String masach) throws SQLException {

        String sql = "select * from Sach where masach=?";
        try (
                Connection con = DatabaseUtil.getDBConnect();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, masach);
            try (
                    ResultSet rs = ps.executeQuery();) {

                if (rs.next()) {
                    Sach sach = new Sach();
                    sach.setMasach(rs.getString("masach"));
                    sach.setTensach(rs.getString("tensach"));
                    sach.setNgaynhap(rs.getDate("ngaynhap"));
                    sach.setGiatien(rs.getFloat("giatien"));
                    sach.setSoluong(rs.getString("soluong"));
                    sach.setLoaiSach(new LoaiSach(rs.getInt("MaLoaiSach")));

                    return sach;
                }

            }
            return null;
        }

    }

    public static void main(String[] args) throws SQLException {
        SachDAO dao = new SachDAO();
        Sach sach = new Sach("PS0025", "HTML001", DataHelpers.now(), Float.parseFloat("1200"), "5", new LoaiSach(Integer.parseInt("9"), "Tieng Viet"));
        //  dao.insert(sach);
        System.out.println("size " + dao.findById("PS0025"));

    }
}
