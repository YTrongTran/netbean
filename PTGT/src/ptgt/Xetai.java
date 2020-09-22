/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptgt;

/**
 *
 * @author ADMIN
 */
//tạo lớp kết thừa từ PTGT
public class Xetai extends PTGT {
    private double trongtai;
    //tạo hàm khởi tạo
    public Xetai(){}

    public Xetai(double trongtai, String hangsanxuat, String mau, int namsanxuat, double giaban) {
        super(hangsanxuat, mau, namsanxuat, giaban);
        this.trongtai = trongtai;
    }

    public double getTrongtai() {
        return trongtai;
    }

    public void setTrongtai(double trongtai) {
        this.trongtai = trongtai;
    }

    
    
}
