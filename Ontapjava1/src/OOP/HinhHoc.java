/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author Tran Y
 */
public abstract class HinhHoc {
    String tenHinh;
    int soCanh;

    public HinhHoc() {
    }

    public HinhHoc(String tenHinh, int soCanh) {
        this.tenHinh = tenHinh;
        this.soCanh = soCanh;
    }

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }
    
    
    public abstract void nhap();
    public abstract void inKQ();
}
