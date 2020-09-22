/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc.model;

/**
 *
 * @author Tran Y
 */
public class Customer {
    private int id;
    private String TenThueBao;
    private String SoDT;
    private String DiaChi;

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenThueBao() {
        return TenThueBao;
    }

    public void setTenThueBao(String TenThueBao) {
        this.TenThueBao = TenThueBao;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    
    
}
