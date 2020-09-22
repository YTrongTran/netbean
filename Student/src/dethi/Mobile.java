/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dethi;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Mobile extends Product{
    private double giaban;
    private int soLuong;
    private String HangSX;
    
    public Mobile(){super();
    }

    public Mobile(double giaban, int soLuong, String HangSX, int masp, String tensp) {
        super(masp, tensp);
        this.giaban = giaban;
        this.soLuong = soLuong;
        this.HangSX = HangSX;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getHangSX() {
        return HangSX;
    }

    public void setHangSX(String HangSX) {
        this.HangSX = HangSX;
    }

    @Override
    public void inputt() {
        super.inputt(); 
         Scanner sc = new Scanner(System.in);
        System.out.println("nhập giá bán: ");
        setGiaban(sc.nextDouble());
        System.out.println("nhập số lương hàng: ");
        setSoLuong(sc.nextInt());
        System.out.println("nhập Hãng sản xuất: ");
        setHangSX(sc.next());
    }

  
    @Override
    public void outut() {
        super.outut(); 
         System.out.println("=> " + getGiaban() + " và " + getSoLuong() + " và "+ getHangSX() + " và " + thanhtien());
    }


   
    public double thanhtien(){
        return soLuong*giaban;
    }
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.inputt();
        m.outut();
        m.thanhtien();
    }
}

