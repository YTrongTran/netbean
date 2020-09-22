/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyKhoaHoc;

import QuanlyNhanVien.NhanVien;
import QuanlychuyenDe.ChuyenDe;
import java.util.Date;

/**
 *
 * @author trany
 */
public class KhoaHoc {

    private int maKH;
    private String MaCD;
    private float HocPhi;
    private int ThoiLuong;
    private ChuyenDe chuyende;
    private Date NgayKhaiGiang;
    private String GhiChu;
    private NhanVien maNV;
    private Date NgayTao;

    public KhoaHoc() {
    }

    @Override
    public String toString() {
        return "KhoaHoc{" + "maKH=" + maKH + ", MaCD=" + MaCD + ", HocPhi=" + HocPhi + ", ThoiLuong=" + ThoiLuong + ", chuyende=" + chuyende + ", NgayKhaiGiang=" + NgayKhaiGiang + ", GhiChu=" + GhiChu + ", maNV=" + maNV + ", NgayTao=" + NgayTao + '}';
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getMaCD() {
        return MaCD;
    }

    public void setMaCD(String MaCD) {
        this.MaCD = MaCD;
    }

    public float getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(float HocPhi) {
        this.HocPhi = HocPhi;
    }

    public int getThoiLuong() {
        return ThoiLuong;
    }

    public void setThoiLuong(int ThoiLuong) {
        this.ThoiLuong = ThoiLuong;
    }

    public ChuyenDe getChuyende() {
        return chuyende;
    }

    public void setChuyende(ChuyenDe chuyende) {
        this.chuyende = chuyende;
    }

    public Date getNgayKhaiGiang() {
        return NgayKhaiGiang;
    }

    public void setNgayKhaiGiang(Date NgayKhaiGiang) {
        this.NgayKhaiGiang = NgayKhaiGiang;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public NhanVien getMaNV() {
        return maNV;
    }

    public void setMaNV(NhanVien maNV) {
        this.maNV = maNV;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public KhoaHoc(int maKH, String MaCD, float HocPhi, int ThoiLuong, ChuyenDe chuyende, Date NgayKhaiGiang, String GhiChu, NhanVien maNV, Date NgayTao) {
        this.maKH = maKH;
        this.MaCD = MaCD;
        this.HocPhi = HocPhi;
        this.ThoiLuong = ThoiLuong;
        this.chuyende = chuyende;
        this.NgayKhaiGiang = NgayKhaiGiang;
        this.GhiChu = GhiChu;
        this.maNV = maNV;
        this.NgayTao = NgayTao;
    }

   
       
}
