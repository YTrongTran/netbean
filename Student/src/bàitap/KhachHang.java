/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bàitap;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class KhachHang {

    private String Hovatenchuho;
    private String Sonha;
    private int maSocongto;

    public KhachHang() {
        super();
    }

    public void setHovatenchuho(String Hovatenchuho) {
        this.Hovatenchuho = Hovatenchuho;
    }

    public void setSonha(String Sonha) {
        this.Sonha = Sonha;
    }

    public void setMaSocongto(int maSocongto) {
        this.maSocongto = maSocongto;
    }

    public String getHovatenchuho() {
        return Hovatenchuho;
    }

    public String getSonha() {
        return Sonha;
    }

    public int getMaSocongto() {
        return maSocongto;
    }

    public KhachHang(String Hovatenchuho, String Sonha, int maSocongto) {
        this.Hovatenchuho = Hovatenchuho;
        this.Sonha = Sonha;
        this.maSocongto = maSocongto;
    }
    public void nhapThongtinKhachHang(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên chủ hộ: ");
        setHovatenchuho(sc.nextLine());
        System.out.println("số nhà:");
        setSonha(sc.nextLine());
        System.out.println("mã số công tơ:");
        setMaSocongto(sc.nextInt());
             
    
    }
    public void HienthithongtinKhachHang(){
        System.out.println("Họ và tên chủ hộ: " +Hovatenchuho);
        System.out.println("số nhà của chủ hộ: "+Sonha);
        System.out.println("mã cố công tơ của nhà chủ hộ: "+maSocongto);
    
    }
    public static void main(String[] args) {
        KhachHang kh = new KhachHang();
        kh.nhapThongtinKhachHang();
        kh.HienthithongtinKhachHang();
    }
}
