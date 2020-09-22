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
public class PTB1 {
    public static void main(String[] args) {
        //ax+b=0
        //a b nhap tu ban phim
        float x, a,b;
        Scanner sc = new Scanner (System.in);
        System.out.println("nhap bien a:");
        a = sc.nextFloat();
        System.out.println("nhap bien b: ");
        b = sc.nextFloat();
        
        x=-b/a;
        // in ra
        System.out.println("ket qua: " +x);
        
    }
}
