/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanlySach;

/**
 *
 * @author Administrator
 */
public class NhaXuatBan {
    private int maXB;
    private String tenXB;
    private String DiaChi;

    public NhaXuatBan() {
    }

    @Override
    public String toString() {
        return this.tenXB;
    }

    public NhaXuatBan(int maXB) {
        this.maXB = maXB;
    }

    public NhaXuatBan(String tenXB) {
        this.tenXB = tenXB;
    }

    public NhaXuatBan(int maXB, String tenXB, String DiaChi) {
        this.maXB = maXB;
        this.tenXB = tenXB;
        this.DiaChi = DiaChi;
    }

    public int getMaXB() {
        return maXB;
    }

    public void setMaXB(int maXB) {
        this.maXB = maXB;
    }

    public String getTenXB() {
        return tenXB;
    }

    public void setTenXB(String tenXB) {
        this.tenXB = tenXB;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    
}
