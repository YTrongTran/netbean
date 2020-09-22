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
public class nhanvien {
    private int maNV;
    private String TenNV;
   public nhanvien(){}

    @Override
    public String toString() {
        return this.TenNV;
    }

    public nhanvien(int maNV, String TenNV) {
        this.maNV = maNV;
        this.TenNV = TenNV;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }
   
}
