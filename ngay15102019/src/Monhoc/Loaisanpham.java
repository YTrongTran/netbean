/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monhoc;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Loaisanpham {
   private String id;
   private String name;
private Date ngaynhap;
private int soluong;
private double giaban;
private Loaisanpham loaiSP;

    public Loaisanpham() {
    }

    public Loaisanpham(String id, String name) {
        this.id = id;
        this.name = name;
    }
 

    public Loaisanpham(String id, String name, Date ngaynhap, int soluong, double giaban, Loaisanpham loaiSP) {
        this.id = id;
        this.name = name;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
        this.giaban = giaban;
        this.loaiSP = loaiSP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public Loaisanpham getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(Loaisanpham loaiSP) {
        this.loaiSP = loaiSP;
    }

   
}
