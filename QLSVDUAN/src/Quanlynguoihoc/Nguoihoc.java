/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quanlynguoihoc;


import QuanlyNhanVien.NhanVien;
import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author trany
 */
public class Nguoihoc {

    private String maNH;
    private String hovaTen;
    private boolean gioiTinh;
    private Date ngaySinh;
    private String Phone;
    private String Email;
    private String ghiChu;
     private NhanVien maNV;
    private Date ngayDk;

    public Nguoihoc() {
    }

    public Nguoihoc(String maNH, String hovaTen) {
        this.maNH = maNH;
        this.hovaTen = hovaTen;
    }

    public Nguoihoc(String maNH) {
        this.maNH = maNH;
        
    }

    @Override
    public String toString() {
        return  this.hovaTen;
    }
    public Nguoihoc(String maNH, String hovaTen, boolean gioiTinh, Date ngaySinh, String Phone, String Email, String ghiChu, NhanVien maNV, Date ngayDk) {
        this.maNH = maNH;
        this.hovaTen = hovaTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.Phone = Phone;
        this.Email = Email;
        this.ghiChu = ghiChu;
        this.maNV = maNV;
        this.ngayDk = ngayDk;
    }

    public String getMaNH() {
        return maNH;
    }

    public void setMaNH(String maNH) {
        this.maNH = maNH;
    }

    public String getHovaTen() {
        return hovaTen;
    }

    public void setHovaTen(String hovaTen) {
        this.hovaTen = hovaTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public NhanVien getMaNV() {
        return maNV;
    }

    public void setMaNV(NhanVien maNV) {
        this.maNV = maNV;
    }

    public Date getNgayDk() {
        return ngayDk;
    }

    public void setNgayDk(Date ngayDk) {
        this.ngayDk = ngayDk;
    }

 
 
   

    

}