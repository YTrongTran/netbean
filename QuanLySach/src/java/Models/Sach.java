/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author Tran Y
 */
public class Sach {
    private String masach;
    private String tensach;
    private Date ngaynhap;
    private Float giatien;
    private String soluong;
    private LoaiSach loaiSach;

    public Sach() {
    }

    @Override
    public String toString() {
        return "Sach{" + "masach=" + masach + ", tensach=" + tensach + ", ngaynhap=" + ngaynhap + ", giatien=" + giatien + ", soluong=" + soluong + ", loaiSach=" + loaiSach + '}';
    }

    public Sach(String masach, String tensach, Date ngaynhap, Float giatien, String soluong, LoaiSach loaiSach) {
        this.masach = masach;
        this.tensach = tensach;
        this.ngaynhap = ngaynhap;
        this.giatien = giatien;
        this.soluong = soluong;
        this.loaiSach = loaiSach;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public Date getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public Float getGiatien() {
        return giatien;
    }

    public void setGiatien(Float giatien) {
        this.giatien = giatien;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public LoaiSach getLoaiSach() {
        return loaiSach;
    }

    public void setLoaiSach(LoaiSach loaiSach) {
        this.loaiSach = loaiSach;
    }
    
    
}
