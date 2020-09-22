/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

/**
 *
 * @author Administrator
 */
public class ChuyenNganh {
    private int maCN;
    private String tenCN;

    public ChuyenNganh() {
    }

    public ChuyenNganh(int maCN) {
        this.maCN = maCN;
    }

    @Override
    public String toString() {
        return "ChuyenNganh{" + "maCN=" + maCN + '}';
    }

    

    public ChuyenNganh(int maCN, String tenCN) {
        this.maCN = maCN;
        this.tenCN = tenCN;
    }

    public int getMaCN() {
        return maCN;
    }

    public void setMaCN(int maCN) {
        this.maCN = maCN;
    }

    public String getTenCN() {
        return tenCN;
    }

    public void setTenCN(String tenCN) {
        this.tenCN = tenCN;
    }
    
}
