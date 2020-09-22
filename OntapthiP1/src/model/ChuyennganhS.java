/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author trany
 */
public class ChuyennganhS {
    private String maCn;
    private String tenCN;

    public ChuyennganhS() {
    }

    @Override
    public String toString() {
        return this.tenCN;
    }

    public ChuyennganhS(String maCn, String tenCN) {
        this.maCn = maCn;
        this.tenCN = tenCN;
    }

    public String getMaCn() {
        return maCn;
    }

    public void setMaCn(String maCn) {
        this.maCn = maCn;
    }

    public String getTenCN() {
        return tenCN;
    }

    public void setTenCN(String tenCN) {
        this.tenCN = tenCN;
    }
    
}
