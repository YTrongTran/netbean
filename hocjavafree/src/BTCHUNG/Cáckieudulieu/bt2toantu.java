package BTCHUNG.Cáckieudulieu;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class bt2toantu {
    //1.Tính tổng, hiệu, tích, thương, chia lấy dư của 2 số đó.
    public static void main(String[] args) {
        int a,b;
        double tong,hieu,thuong,sodu;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số a,b: ");
        a= sc.nextInt();
        b= sc.nextInt();
        tong=a+b;
        hieu=a-b;
        thuong=a/b;
        sodu=a%b;
        System.out.println("Kết quả: " +tong + "-" + hieu + "-" + thuong + "-" 
        + sodu);
        
    }
}
