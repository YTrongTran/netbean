/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author trany
 */
public class FrThongTin {
    private String mSach;
    private String tSach;
    private String chuyenNganh;
    private Date ngayNhap;
    private int soLuong;
    private int giaBan;

    public FrThongTin() {
    }

    public FrThongTin(String mSach, String tSach, String chuyenNganh, Date ngayNhap, int soLuong, int giaBan) {
        this.mSach = mSach;
        this.tSach = tSach;
        this.chuyenNganh = chuyenNganh;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "FrThongTin{" + "mSach=" + mSach + ", tSach=" + tSach + ", chuyenNganh=" + chuyenNganh + ", ngayNhap=" + ngayNhap + ", soLuong=" + soLuong + ", giaBan=" + giaBan + '}';
    }

    

    
    public String getmSach() {
        return mSach;
    }

    public void setmSach(String mSach) {
        this.mSach = mSach;
    }

    public String gettSach() {
        return tSach;
    }

    public void settSach(String tSach) {
        this.tSach = tSach;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
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

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
    
}
