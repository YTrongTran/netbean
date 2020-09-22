/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KhachHang;

/**
 *
 * @author Administrator
 */
public class KhachHang {
    private String maKhacHang;
    private String hoVTLot;
    private String Ten;
    private String diaChi;
    private String Email;
    private String dienThoai;

    public KhachHang() {
    }

    public KhachHang(String maKhacHang) {
        this.maKhacHang = maKhacHang;
    }

    @Override
    public String toString() {
        return this.maKhacHang;
    }

   

   

    public KhachHang(String maKhacHang, String hoVTLot, String Ten, String diaChi, String Email, String dienThoai) {
        this.maKhacHang = maKhacHang;
        this.hoVTLot = hoVTLot;
        this.Ten = Ten;
        this.diaChi = diaChi;
        this.Email = Email;
        this.dienThoai = dienThoai;
    }

    public String getMaKhacHang() {
        return maKhacHang;
    }

    public void setMaKhacHang(String maKhacHang) {
        this.maKhacHang = maKhacHang;
    }

    public String getHoVTLot() {
        return hoVTLot;
    }

    public void setHoVTLot(String hoVTLot) {
        this.hoVTLot = hoVTLot;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }
    
}
