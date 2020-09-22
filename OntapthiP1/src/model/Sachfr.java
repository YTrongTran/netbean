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
public class Sachfr {
private String mSach;
private String tSach;
private Date Ngaynhap;
private int soluong;
private Double Giaban;
private ChuyennganhS chuyennganhS;
private String Hinhanh;
    public Sachfr() {
    }

    public String getHinhanh() {
        return Hinhanh;
    }

    public void setHinhanh(String Hinhanh) {
        this.Hinhanh = Hinhanh;
    }

    public Sachfr(String Hinhanh) {
        this.Hinhanh = Hinhanh;
    }

    public Sachfr(String mSach, String tSach, Date Ngaynhap, int soluong, Double Giaban, ChuyennganhS chuyennganhS) {
        this.mSach = mSach;
        this.tSach = tSach;
        this.Ngaynhap = Ngaynhap;
        this.soluong = soluong;
        this.Giaban = Giaban;
        this.chuyennganhS = chuyennganhS;
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

    public Date getNgaynhap() {
        return Ngaynhap;
    }

    public void setNgaynhap(Date Ngaynhap) {
        this.Ngaynhap = Ngaynhap;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public Double getGiaban() {
        return Giaban;
    }

    public void setGiaban(Double Giaban) {
        this.Giaban = Giaban;
    }

    public ChuyennganhS getChuyennganhS() {
        return chuyennganhS;
    }

    public void setChuyennganhS(ChuyennganhS chuyennganhS) {
        this.chuyennganhS = chuyennganhS;
    }


}