/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoadon;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class HoaDon {
    private String maHoaDon;
    private Date ngayMuaHang;
    private String maKhachHang;
    private String trangThai;

    public HoaDon() {
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHoaDon=" + maHoaDon + ", ngayMuaHang=" + ngayMuaHang + ", maKhachHang=" + maKhachHang + ", trangThai=" + trangThai + '}';
    }

    public HoaDon(String maHoaDon, Date ngayMuaHang, String maKhachHang, String trangThai) {
        this.maHoaDon = maHoaDon;
        this.ngayMuaHang = ngayMuaHang;
        this.maKhachHang = maKhachHang;
        this.trangThai = trangThai;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayMuaHang() {
        return ngayMuaHang;
    }

    public void setNgayMuaHang(Date ngayMuaHang) {
        this.ngayMuaHang = ngayMuaHang;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    

    
}
