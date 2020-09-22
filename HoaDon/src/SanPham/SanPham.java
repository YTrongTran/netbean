/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SanPham;

/**
 *
 * @author Administrator
 */
public class SanPham {
    private int maSP;
    private String moTa;
    private int soLuong;
    private double donGia;
    private String tenSP;

    public SanPham() {
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSP=" + maSP + ", moTa=" + moTa + ", soLuong=" + soLuong + ", donGia=" + donGia + ", tenSP=" + tenSP + '}';
    }

    public SanPham(int maSP, String moTa, int soLuong, double donGia, String tenSP) {
        this.maSP = maSP;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.tenSP = tenSP;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    
}
