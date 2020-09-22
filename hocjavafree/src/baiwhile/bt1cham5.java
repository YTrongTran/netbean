/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiwhile;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bt1cham5 {
    public static void main(String[] args) {
       float km;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số km bạn muôn đi vào đây: ");
        km=sc.nextFloat();
        long tien=0;
        final int batdau = 14000;
        final int tieptheo =16300;
        final int trodi_26=13300;
while(km<0){
    System.out.println("nhập lại số km: ");
    km=sc.nextFloat();
}        
        if (km<=0.8) {
            tien=14000;
        } else {
            if (km<=25) {
                tien=(long) (batdau+tieptheo*(km-0.8));
            } else {
                if (km>=26) {
                    tien=(long) (batdau+16300*(25-0.8)+13300*(km- 25 -0.8));
                }
                 
            }
        }
        System.out.println("=>" + tien);
        
        
    }
    
}
