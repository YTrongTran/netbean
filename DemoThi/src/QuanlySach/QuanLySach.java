/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanlySach;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class QuanLySach {
    private int maSach;
    private String tenSach;
    private Double Gia;
    private Date ngayNhap;
    private NhaXuatBan nhaXuatBan;

    public QuanLySach() {
    }

    @Override
    public String toString() {
        return "QuanLySach{" + "maSach=" + maSach + ", tenSach=" + tenSach + ", Gia=" + Gia + ", ngayNhap=" + ngayNhap + ", nhaXuatBan=" + nhaXuatBan + '}';
    }

    public QuanLySach(int maSach, String tenSach, Double Gia, Date ngayNhap, NhaXuatBan nhaXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.Gia = Gia;
        this.ngayNhap = ngayNhap;
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public Double getGia() {
        return Gia;
    }

    public void setGia(Double Gia) {
        this.Gia = Gia;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public NhaXuatBan getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(NhaXuatBan nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

   
    
    
    
}
