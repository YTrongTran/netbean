/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptgt;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class PTGT {

   private String hangsanxuat, mau;
   private int namsanxuat;
   private double giaban;
  
   
   //tạo hàm khởi tạo.
   public PTGT(){}
   
   
    public PTGT(String hangsanxuat, String mau, int namsanxuat, double giaban) {
        this.hangsanxuat = hangsanxuat;
        this.mau = mau;
        this.namsanxuat = namsanxuat;
        this.giaban = giaban;
    }
    // tạo hàm set và get

    public String getHangsanxuat() {
        return hangsanxuat;
    }

    public void setHangsanxuat(String hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getNamsanxuat() {
        return namsanxuat;
    }

    public void setNamsanxuat(int namsanxuat) {
        this.namsanxuat = namsanxuat;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }
    public void input ( ){
        Scanner sc = new Scanner(System.in);
        System.out.println("hãng sản xuất: ");
        setHangsanxuat(sc.next());
        System.out.println("màu: ");
        setMau(sc.next());
        System.out.println("năm sản xuất: ");
        setNamsanxuat(sc.nextInt());
        System.out.println("giá bán: ");
        setGiaban(sc.nextDouble());
    
    
    }
    public void output() {
        System.out.println("=> " + getHangsanxuat() + " - " + getMau() + " - " 
        + getNamsanxuat() + " - " + getGiaban());
    
    }
    public static void main(String[] args) {
        PTGT pt = new PTGT ();
        pt.input();
        pt.output();
    }
    
}
