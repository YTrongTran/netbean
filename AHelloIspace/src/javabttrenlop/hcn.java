/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabttrenlop;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class hcn {
    public static void main(String[] args) {
        float cd,cr,cv,dt;
        //tinh dien tích
        //tính chu vi
        Scanner sc = new Scanner (System.in);
        System.out.println("nhap chieu dai:");
        cd =  sc.nextFloat();
        System.out.println("nhap chieu rong:");
        cr = sc.nextFloat();
        
        cv=(cd+cr)*2;
        dt=(cd*cr);
        //in ra
        System.out.println("chu vi:" + cv);
        System.out.println("diện tích:" +dt);
       
    }
    
    
    
}
