/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Emplyoee {
    private int maNV;
    private String tenNv;
    private Date Ngaysinh;
    private boolean Gioitinh;
    private String phongBan;
    private String Hinhanh;
    private nhanvien nhanvien;

    @Override
    public String toString() {
        return "Emplyoee{" + "maNV=" + maNV + ", tenNv=" + tenNv + ", Ngaysinh=" + Ngaysinh + ", Gioitinh=" + Gioitinh + ", phongBan=" + phongBan + ", Hinhanh=" + Hinhanh + ", nhanvien=" + nhanvien + '}';
    }
    public Emplyoee(){}

    public Emplyoee(int maNV, String tenNv, Date Ngaysinh, boolean Gioitinh, String phongBan, String Hinhanh) {
        this.maNV = maNV;
        this.tenNv = tenNv;
        this.Ngaysinh = Ngaysinh;
        this.Gioitinh = Gioitinh;
        this.phongBan = phongBan;
        this.Hinhanh = Hinhanh;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getTenNv() {
        return tenNv;
    }

    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    public Date getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(Date Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public boolean isGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(boolean Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public String getHinhanh() {
        return Hinhanh;
    }

    public void setHinhanh(String Hinhanh) {
        this.Hinhanh = Hinhanh;
    }

    void getNgaysinh(Date parse) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
