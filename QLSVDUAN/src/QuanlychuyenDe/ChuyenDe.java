/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanlychuyenDe;

/**
 *
 * @author trany
 */
public class ChuyenDe {
    private String maCD;
    private String tenCD;
    private float hocPhi;
    private int thoiLuong;
    private String Hinh;
    private String moTa;

    public ChuyenDe() {
    }

    public ChuyenDe(String maCD) {
        this.maCD = maCD;
    }

   

    public ChuyenDe(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public ChuyenDe(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }


  

    @Override
    public String toString() {
        return this.tenCD;
    }

    

    public ChuyenDe(String maCD, String tenCD, float hocPhi, int thoiLuong, String Hinh, String moTa) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.Hinh = Hinh;
        this.moTa = moTa;
    }

    public String getMaCD() {
        return maCD;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

   
}
