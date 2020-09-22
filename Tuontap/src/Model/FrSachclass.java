/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author trany
 */
public class FrSachclass {
    private String maSach;
    private String tenSach;
    private Date ngayNhap;
    private int soLuong;
    private double giaBan;
    private String hinhAnh;
    private Chuyennganh chuyenNganh;

    public FrSachclass() {
    }

    public FrSachclass(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public FrSachclass(String maSach, String tenSach, Date ngayNhap, int soLuong, double giaBan, Chuyennganh chuyenNganh) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.chuyenNganh = chuyenNganh;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public Chuyennganh getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(Chuyennganh chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "FrSachclass{" + "maSach=" + maSach + ", tenSach=" + tenSach + ", ngayNhap=" + ngayNhap + ", soLuong=" + soLuong + ", giaBan=" + giaBan + ", chuyenNganh=" + chuyenNganh + '}';
    }

   
    
}
