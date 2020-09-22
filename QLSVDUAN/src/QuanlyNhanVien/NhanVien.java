/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanlyNhanVien;

/**
 *
 * @author trany
 */
public class NhanVien {
    private String maNV;
    private String matKhau;
    private String HoTen;
    private boolean Vaitro;

    public NhanVien() {
    }

    public NhanVien(String maNV) {
        this.maNV = maNV;
    }

    @Override
    public String toString() {
        return this.maNV;
    }

    public NhanVien(String maNV, String matKhau, String HoTen, boolean Vaitro) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.HoTen = HoTen;
        this.Vaitro = Vaitro;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public boolean isVaitro() {
        return Vaitro;
    }

    public void setVaitro(boolean Vaitro) {
        this.Vaitro = Vaitro;
    }
    
}
