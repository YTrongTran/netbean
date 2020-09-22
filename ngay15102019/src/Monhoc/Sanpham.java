/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monhoc;

import java.util.Date;
import javafx.scene.chart.PieChart;

/**
 *
 * @author Administrator
 */
public class Sanpham {
    private String maSp;
    private String TenSp;
    private Date ngayNhap;
    private int soLuong;
   private double gia;
private Loaisanpham loaisp;
public Sanpham(){}
  public Sanpham(String maSp, String TenSp, Date ngayNhap, int soLuong, double gia, Loaisanpham loaisp) {
        this.maSp = maSp;
        this.TenSp = TenSp;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.gia = gia;
        this.loaisp = loaisp;
    }

  

    @Override
    public String toString() {
        return "Sanpham{" + "maSp=" + maSp + ", TenSp=" + TenSp + ", ngayNhap=" + ngayNhap + ", soLuong=" + soLuong + ", gia=" + gia + ", loaisp=" + loaisp + '}';
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return TenSp;
    }

    public void setTenSp(String TenSp) {
        this.TenSp = TenSp;
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

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public Loaisanpham getLoaisp() {
        return loaisp;
    }

    public void setLoaisp(Loaisanpham loaisp) {
        this.loaisp = loaisp;
    }
  
    
}
