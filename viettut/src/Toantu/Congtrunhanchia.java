/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toantu;

import java.util.Scanner;

/**
 *
 * @author trany
 */
public class Congtrunhanchia {
    public static void main(String[] args) {
        int a, b;
        double tong, hieu, tich, thuong = 0;
        
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập vào số a");
        a=sc.nextInt();
        System.out.println("nhập vào số b");
        b=sc.nextInt();
        tong=a+b;
        if (a>b) {
            hieu=a-b;
            
        } else {
            hieu=b-a;
        }
        tich=a*b;
        
            thuong = (double)a/b;
        
//           thuong =(double) a/b;
     
        System.out.println("tổng = " + tong + " hiệu = " + hieu
        + " tich = " + tich + " thuong = " + thuong);
    }
}
