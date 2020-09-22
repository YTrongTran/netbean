/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Tran Y
 */
public class LoaiSach {
 private int MaLoaiSach;
 private String TenLoaiSach;

    public LoaiSach(int MaLoaiSach) {
        this.MaLoaiSach = MaLoaiSach;
    }

    @Override
    public String toString() {
        return "LoaiSach{" + "MaLoaiSach=" + MaLoaiSach + ", TenLoaiSach=" + TenLoaiSach + '}';
    }

    public LoaiSach() {
    }

    public LoaiSach(int MaLoaiSach, String TenLoaiSach) {
        this.MaLoaiSach = MaLoaiSach;
        this.TenLoaiSach = TenLoaiSach;
    }

    public int getMaLoaiSach() {
        return MaLoaiSach;
    }

    public void setMaLoaiSach(int MaLoaiSach) {
        this.MaLoaiSach = MaLoaiSach;
    }

    public String getTenLoaiSach() {
        return TenLoaiSach;
    }

    public void setTenLoaiSach(String TenLoaiSach) {
        this.TenLoaiSach = TenLoaiSach;
    }
 
 
}
