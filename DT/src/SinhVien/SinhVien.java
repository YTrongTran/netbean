/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class SinhVien {
    
    private int maSV;
    private String tenSV;
    private ChuyenNganh maCN;
    private Date NgaySinh;
    private boolean gioiTinh;
    private String Phone;

    public SinhVien() {
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", tenSV=" + tenSV + ", maCN=" + maCN + ", NgaySinh=" + NgaySinh + ", gioiTinh=" + gioiTinh + ", Phone=" + Phone + '}';
    }

    public SinhVien(int maSV, String tenSV, ChuyenNganh maCN, Date NgaySinh, boolean gioiTinh, String Phone) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.maCN = maCN;
        this.NgaySinh = NgaySinh;
        this.gioiTinh = gioiTinh;
        this.Phone = Phone;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public ChuyenNganh getMaCN() {
        return maCN;
    }

    public void setMaCN(ChuyenNganh maCN) {
        this.maCN = maCN;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
   
}
